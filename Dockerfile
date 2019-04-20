FROM tomcat:9-jre8
RUN rm -rf /usr/local/tomcat/webapps/*
COPY ./target/backoffice-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
RUN export JAVA_OPTS="$JAVA_OPTS -Dspring.profiles.active=offline"
CMD ["catalina.sh","run"]