FROM openjdk:11-jre-slim

COPY "target/website-1.0.0-SNAPSHOT.jar" "app.jar"

COPY "LICENSE" "LICENSE"

EXPOSE 8080

ENTRYPOINT [ "java", "-Xms512m", "-Xmx1g", "-Dspring.profiles.active=development", "-jar", "app.jar" ]
