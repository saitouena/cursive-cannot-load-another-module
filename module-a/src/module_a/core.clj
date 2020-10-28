(ns module-a.core
  (:require
   [module-b.core :as b.core]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(comment
 (b.core/foo "hoge"))