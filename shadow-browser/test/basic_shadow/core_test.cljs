(ns basic-shadow.core-test
  (:require [clojure.test :refer [deftest testing is]]))

(deftest basic-test
  (is (= 1 (inc 0))))
