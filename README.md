# Example test setup(s) for shadow-cljs

## shadow-node

Shadow-cljs project, containing a "node-script", using Shadow's own test runner.

### How to run:

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

## shadow-browser

Shadow-cljs project that targets the browser. Here the `test` target will create
an `index.html` and a bunch of javascript file in the `out` directory. We'll
have to serve that directory up with a web server (e.g. shadow's dev-http), and
open it in the browser.

### How to run:

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

## shadow-browser-chui

Like shadow-browser, but replace Shadow's own cljs test runner namespace with
[Chui](https://github.com/lambdaisland/chui) (`:runner-ns lambdaisland.chui.shadow.browser-runner`)

### How to run:

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
