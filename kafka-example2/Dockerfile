FROM openjdk:8
EXPOSE 8080
ADD target/kafka-example.jar kafka-example.jar
ENTRYPOINT ["java", "-jar", "/kafka-example.jar"]