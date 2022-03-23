# Example test setup(s) for shadow-cljs

## node-test

Example of a node-script project with node-based tests

```
cd node-test
shadow-cljs compile test
# or
shadow-cljs watch test
```

The test build is configured to `:autorun`, so every compilation will trigger a
test run after the compile finishes. Note that if you are using `shadow-cljs
server`, then the test output during `watch` will show up in the output of the
server.

## browser-test

Project that targets the browser. Here the `test` target will create an
`index.html` and a bunch of javascript file in the `out` directory. We'll have
to serve that directory up with a web server (e.g. shadow's dev-http), and open
it in the browser.

```
shadow-cljs server
```

separate terminal

```
shadow-cljs compile test
# or
shadow-cljs watch test
```

Open http://localhost:8000 in the browser. If you used `watch` then changing the
tests and saving will actually re-run them in the browser.





