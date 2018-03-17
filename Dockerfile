FROM openjdk:9.0-jdk-slim
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo-0.0.1-SNAPSHOT.jar"]


#FROM openjdk:9.0-jdk-slim
##FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#ARG JAR_FILE
#ADD ${JAR_FILE} demo-0.0.1-SNAPSHOT.jar
#ENTRYPOINT [“java”,”-Djava.security.egd=file:/dev/./urandom”,”-jar”,”/demo-0.0.1-SNAPSHOT.jar”]