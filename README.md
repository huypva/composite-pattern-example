The example project of composite pattern

<div align="center">
    <img src="./assets/images/hello_world.png"/>
</div>

## Prerequisites
Make sure following software is installed on your PC
- [JDK 17](https://www.oracle.com/java/technologies/downloads/#java17) or later

## Project structure
```
.
├── composite-pattern
│   ├── pom.xml
│   ...
├── pom.xml
|
└── README.md
```

## Start project

```shell
$ ./mvnw clean package
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.051 s
[INFO] Finished at: 2023-05-17T09:02:25+07:00
[INFO] ------------------------------------------------------------------------
$ java -jar ./composite-pattern/target/composite-pattern-0.0.1-SNAPSHOT.jar
09:01:58.097 [main] INFO io.github.huypva.compositepattern.Composite -- Composite 1 operate!
09:01:58.099 [main] INFO io.github.huypva.compositepattern.Leaf -- Leaf 1 operate!
09:01:58.099 [main] INFO io.github.huypva.compositepattern.Composite -- Composite 2 operate!
09:01:58.099 [main] INFO io.github.huypva.compositepattern.Leaf -- Leaf 2 operate!
```

## Contribute
The code is open sourced. I encourage fellow developers to contribute and help improve it!

- Fork it
- Create your feature branch (git checkout -b new-feature)
- Ensure all tests are passing
- Commit your changes (git commit -am 'Add some feature')
- Push to the branch (git push origin my-new-feature)
- Create new Pull Request

## Reference