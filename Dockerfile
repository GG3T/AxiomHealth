# Fase de Construção
FROM yannoff/maven:3-openjdk-19 AS build
COPY /src /app/src
COPY /pom.xml /app
# Se houver outros arquivos ou diretórios a serem copiados, inclua-os aqui.

RUN mvn -f /app/pom.xml clean package -Dmaven.test.skip

# Fase de Execução
FROM openjdk:19-jdk-alpine
EXPOSE 8080
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
