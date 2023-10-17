FROM openjdk:17
EXPOSE 8080
ADD target hello_world-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/hello_world-0.0.1-SNAPSHOT.war"]