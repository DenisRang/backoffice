FROM openjdk:8
ADD target/backoffice.jar backoffice.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=offline","backoffice.jar"]