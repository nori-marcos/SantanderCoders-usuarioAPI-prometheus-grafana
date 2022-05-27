#escolho uma imagem aleatória com jdk
FROM openjdk:17
VOLUME /tmp
COPY target/usuarioAPI app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]