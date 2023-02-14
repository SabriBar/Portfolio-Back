FROM amazoncorretto:11-alpine-jdk
MAINTAINER SabriBar
COPY target/portfolio-back-0.0.1-SNAPSHOT.jar sabribar-app.jar
ENTRYPOINT ["java","-jar","/sabribar-app.jar"]
