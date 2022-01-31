FROM adoptopenjdk/openjdk8-openj9
MAINTAINER Igor Rodionov <iv.rodionov@gmail.com>
ARG JAR_FILE=target/health-service-0.0.1-SNAPSHOT.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]
EXPOSE 1234