# quarkus-kotlin-example
Example using quarkus and kotlin

# Pre-steps
Necessary configuration to run the application

## Java
Java 1.8 is required.

## Docker
Docker is required

## GraalVM
It's mandatory install graalvm to deploy a native Quarkus application. It can be installed with the following documentation: https://www.graalvm.org/docs/getting-started/#install-graalvm 

# Run

## Native executable
```bash 
./mvnw verify -Pnative
```

```bash
docker build -f src/main/docker/Dockerfile.native -t quarkus-kotlin-example:0.1.0 . 
```

```bash
docker run -i --rm -p 8080:8080 quarkus-kotlin-example:0.1.0
```