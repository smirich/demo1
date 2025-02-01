FROM bellsoft/liberica-openjdk-alpine
#ARG JAR_FILE=target/*.jar
WORKDIR /app
#COPY ${JAR_FILE} app.jar
COPY target/demo1.jar demo1.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app/demo1.jar"]