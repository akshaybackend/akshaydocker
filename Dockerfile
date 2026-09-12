FROM eclipse-temurin:17-jre-alpine
EXPOSE 9090
ADD target/spring-boot-docker-example.jar spring-boot-docker-example.jar
ENTRYPOINT ["java", "-jar", "spring-boot-docker-example.jar"]