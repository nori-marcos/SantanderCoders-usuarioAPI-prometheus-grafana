#escolho uma imagem aleatória com jdk
FROM openjdk:17
VOLUME /tmp
ARG JAR_FILE=target/docker-application-usuario.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]