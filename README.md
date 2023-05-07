The hello-world project

<div align="center">
    <img src="./assets/images/hello_world.png"/>
</div>

## Prerequisites
Make sure following software is installed on your PC
- [JDK 17](https://www.oracle.com/java/technologies/downloads/#java17) or later

## Project structure
```
.
├── hello-world
│   ├── pom.xml
│   ...
├── pom.xml
|
└── README.md
```

## Start project

```shell
$ ./mvnw clean package
$ java -jar ./hello-world/target/hello-world-0.0.1-SNAPSHOT.jar
```

```shell
Compare str1==str2: true
Compare str3==str4: false
Compare value str1.equals(str3): true
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