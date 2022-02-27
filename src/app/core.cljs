(ns app.core
  "This namespace contains your application and is the entrypoint for 'yarn start'."
  (:require [reagent.core :as r]
            ;; Examples
            [app.examples.mario.core :refer [app]]
            #_[app.examples.level.core :refer [app]]
            #_[app.examples.rpg.core :refer [app]]
            #_[app.examples.flappy :refer [app]]
            #_[app.examples.drive :refer [app]]
            #_[app.examples.metro.core :refer [app]]
            #_[app.examples.patuv06.flappy :refer [app]]
            #_[app.examples.patuv06.contra :refer [app]]
            #_[app.examples.patuv06.aladdin :refer [app]]
            #_[app.examples.aladdin :refer [app]]
            #_[app.examples.patuv06.text :refer [app]]
            #_[app.examples.parallax :refer [app]]))


(defn ^:dev/after-load start []
  "Run app"
  (app))

(defn ^:export main
  "Run game startup logic."
  []
  (start))
