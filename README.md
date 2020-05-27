# Reproducer Project
GitHub issue: https://github.com/quarkusio/quarkus/issues/9589

Simply execute `build.sh`

Steps to reproduce
1. Start postgres DB with docker-compose file, execute `scripts/start-containers.sh` file
2. Compile native-image and execute process
3. and run curl.sh to execute requests and it will throw the error described in issue


# jdbc-jackson-temp project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application

The application can be packaged using `./mvnw package`.
It produces the `jdbc-jackson-temp-1.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/jdbc-jackson-temp-1.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: `./mvnw package -Pnative`.

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your native executable with: `./target/jdbc-jackson-temp-1.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image.