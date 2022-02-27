(ns app.core
  "This namespace contains your application and is the entrypoint for 'yarn start'."
  (:require [reagent.core :as r]
            [patu.core :as p]
            [patu.events :as evt]
            [app.hello :refer [hello]]
            [app.examples.mario.core :refer [app]]
            [app.examples.core :as example]))

(comment)


(defn ^:dev/after-load start []
  "Run app"
  (app))

(defn ^:export main
  "Run game startup logic."
  []
  (start))
