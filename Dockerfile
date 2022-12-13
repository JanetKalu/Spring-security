FROM openjdk:11
EXPOSE 8102
ADD target/OAuth2_Security-0.0.1-SNAPSHOT.jar OAuth2_Security-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/OAuth2_Security-0.0.1-SNAPSHOT.jar"]

