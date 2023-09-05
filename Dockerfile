FROM openjdk:11
COPY target/DockerTest-0.0.1-SNAPSHOT.jar DockerTest-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/DockerTest-0.0.1-SNAPSHOT.jar"]