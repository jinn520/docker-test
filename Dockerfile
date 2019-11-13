FROM openjdk:8-jdk-alpine
ADD target/docker-test-0.0.1-SNAPSHOT.jar /usr/src/app.jar
ENTRYPOINT ["java","-jar","/usr/src/app.jar"]