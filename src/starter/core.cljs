(ns starter.core
    (:require [reagent.core :as r]))

(defonce greeting "hello")
(def who "world")

(defn app []
  [:div greeting " " who])

(defn stop []
  (js/console.log "Stopping..."))

(defn start []
  (js/console.log "Starting...")
  (r/render [app]
            (.getElementById js/document "app")))

(defn ^:export init []
  (start))
