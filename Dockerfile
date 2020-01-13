FROM openjdk:8
ADD target/my-docker-springboot.jar my-docker-springboot.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "my-docker-springboot.jar"]