FROM eclipse-temurin:17

LABEL mentainer="nowshadmnk@gmail.com"

WORKDIR /app

COPY target/crud-0.0.1-SNAPSHOT.jar /app/crud-docker_1.jar

ENTRYPOINT ["java", "-jar", "crud-docker-1.jar"]