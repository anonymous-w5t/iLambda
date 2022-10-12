# Lambda Calculus with additions

Simple lambda-calculus language to illustrate how the Xyz library can be used to animate reduction steps, inspired by an example for PLT Redex's domain-specific language embedded in Racket for specifying and debugging operational semantics (https://redex.racket-lang.org/lam-v.html).


## Requirements

- JVM (>=1.8)
- sbt

## Compilation

You need to get the submodules dependencies (Xyz library -- not included in this anonymised version), and later compile everything using ScalaJS.
The result will be a JavaScript file that is already being imported by an existing HTML file. 

1. `git submodule update --init`
2. `sbt fastLinkJS`
3. open the file `lib/xyz/tool/index.html`
