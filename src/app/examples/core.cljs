(ns app.examples.core
  (:require
   #_[app.examples.level.core :refer [app]]
   [app.examples.mario.core :refer [app]]
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
  (app))

(defn ^:export init []
  (start))
