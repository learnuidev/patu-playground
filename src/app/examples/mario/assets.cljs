(ns app.examples.mario.assets)

;; Assets ===
(def assets {:root-url "https://i.imgur.com/"
             :sprites [{:title :coin
                        :url "https://i.imgur.com/wbKxhcd.png"}
                       {:title :evil-mushroom
                        :url "https://i.imgur.com/LmseqUG.png"}
                       {:title :brick
                        :url "https://i.imgur.com/pogC9x5.png"}
                       ;; old
                       #_{:title :block
                          :url "https://i.imgur.com/bdrLpi6.png"}
                       {:title :block
                        :url "https://i.imgur.com/M6rwarW.png"}
                       {:title :mario
                        :url "https://i.imgur.com/Wb1qfhK.png"}
                       {:title :mushroom
                        :url "https://i.imgur.com/0wMd92p.png"}
                       {:title :surprise
                        :url "https://i.imgur.com/gesQ1KP.png"}
                       {:title :unboxed
                        :url "https://i.imgur.com/bdrLpi6.png"}
                       {:title :pipe-top-left
                        :url "https://i.imgur.com/ReTPiWY.png"}
                       {:title :pipe-top-right
                        :url "https://i.imgur.com/hj2GK4n.png"}
                       {:title :pipe-bottom-left
                        :url "https://i.imgur.com/c1cYSbt.png"}
                       {:title :pipe-bottom-right
                        :url "https://i.imgur.com/nqQ79eI.png"}]});; === App
;;

;;
(def main-map ["                                           "
               "                                           "
               "                                           "
               "                                           "
               "                                           "
               "                                           "
               "                                           "
               "                        #                                "
               "                   %   =*=%=                                    "
               "                                                       "
               "                                      -+                       "
               "                             ^   ^    ()                       "
               "==============================================    ============="
               "==============================================    ============="])

(defn level-handler []
  {:map main-map
   :width 20
   :height 20
   ; :origin :bottom
   :components  [[:=
                  [:sprite :sprite/block]
                  [:solid]]
                 [:$
                  [:sprite :sprite/coin]]
                 [:%
                  [:sprite :sprite/surprise]
                  [:solid]
                  [:props :coin-surprise]]
                 [:*
                  [:sprite :sprite/surprise]
                  [:solid]
                  [:props :mushroom-surprise]]
                 ["}"
                  [:sprite :sprite/unboxed]
                  [:solid]]
                 [:-
                  [:sprite :sprite/pipe-top-left]
                  [:solid]
                  [:scale 0.5]]
                 ["("
                  [:sprite :sprite/pipe-bottom-left]
                  [:solid]
                  [:scale 0.5]]
                 [:+
                  [:sprite :sprite/pipe-top-right]
                  [:solid]
                  [:scale 0.5]]
                 [")"
                  [:sprite :sprite/pipe-bottom-right]
                  [:solid]
                  [:scale 0.5]]
                 ["^"
                  [:sprite :sprite/evil-mushroom]
                  [:solid]
                  [:props :evil-mushroom]]
                 [:#
                  [:sprite :sprite/mushroom]
                  [:solid]
                  [:props :mushroom-surprise]]]})
