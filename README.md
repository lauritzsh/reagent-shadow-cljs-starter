# Reagent with shadow-cljs

This is a minimal setup for using Reagent with shadow-cljs. It supports
production builds and live-reloading.

## Getting started

Run `yarn` to download dependencies.

To have a local development server running do `yarn dev`; then visit
[localhost:8020](http://localhost:8020). You can configure the port in
`shadow-cljs.edn`. Whenever you make a change it will automatically reload the
code and render again.

To make a production build use `yarn release`.

To configure further please check out
[shadow-cljs](https://github.com/thheller/shadow-cljs).
