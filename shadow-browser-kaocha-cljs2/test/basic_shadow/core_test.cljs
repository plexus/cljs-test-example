(ns basic-shadow.core-test
  (:require [clojure.test :refer [deftest testing is]]))

(deftest passing-tests
  (is (= 1 (inc 0)))

  (is (pos-int? 5))

  (is (thrown? cljs.core/ExceptionInfo (throw (ex-info "Oh no!" {:pos :thrown})))))

(deftest failing-tests
  (testing "These tests are regular assertion failures"
    (is (= 1 2))

    (is (= [{:x 1} {:y 2} {:z 3}]
           [{:x 1} {:y 0} {:z 3}]))

    (is (throw (ex-info "Oh no!" {:pos :is})))))

(deftest forgot-is
  (testing "Kaocha catches this as a deftest without an assertion, it's a common mistake"
    (= 5 4)))

(deftest exception-outside-assertion
  (testing "Exceptions are reported as :error results"
    (throw (ex-info "Oh no!" {:pos :outside}))))
