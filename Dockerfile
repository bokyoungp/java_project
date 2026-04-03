FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

COPY ./out/artifacts/project_jar/project.jar /app

CMD ["java", "-jar", "project.jar"]