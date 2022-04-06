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

## shadow-browser-kaocha-cljs2

A full setup with [kaocha-cljs2](https://github.com/lambdaisland/kaocha-cljs2/),
which builds upon [Chui](https://github.com/lambdaisland/chui) as the
ClojureScript test runner component, and
[Funnel](https://github.com/lambdaisland/funnel) for communication between the
two.

It's not a trivial setup because kaocha-cljs2 is fully 'unbundled', you need to
wire up all the parts, but the setup itself is convenient to use. A standard
`bin/kaocha` will do all the work, including compiling to JS, starting Funnel if
necessary, and opening a browser tab, if necessary.

### How to run:

```
bin/kaocha
```

Optionally you can run Funnel yourself to get some more insight into what's
happening.

```
bin/funnel_wrapper
```
