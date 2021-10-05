FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD build/libs/Docker-0.0.1-SNAPSHOT.jar docker.jar
ENTRYPOINT ["java","-jar","docker.jar"]