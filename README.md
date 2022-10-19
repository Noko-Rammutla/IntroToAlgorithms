# Introduction to Algorithms

This repository contains implementations of various algorithms described in the [Introduction to Algorithms book](https://mitpress.mit.edu/9780262258104/introduction-to-algorithms/).
It is part of my attempt at learning Java, and the code is not meant to be used in production.

# Requirements

* [OpenJDK 17](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html)
* [Gradle](https://gradle.org)

# Running

Use the following commands to run the program:

```bash
 ./gradlew build
```

The test results can be viewed by opening the file `lib/build/reports/tests/test/index.html`.

```bash
open lib/build/reports/tests/test/index.html
```

# Debugging (IntelliJ Community Edition)

1. Open the folder `IntroToAlgorithms` in IntelliJ.
2. Update Gradle preferences in IntelliJ to run tests using IntelliJ.
  * https://stackoverflow.com/a/60270401
  * `Preferences -> Build, Execution, Deployment -> Gradle -> Run tests using -> IntelliJ IDEA` 