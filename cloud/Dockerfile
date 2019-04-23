FROM openjdk:8
ADD target/backoffice-0.0.1-SNAPSHOT.jar backoffice-0.0.1-SNAPSHOT.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=cloud","backoffice-0.0.1-SNAPSHOT.jar"]