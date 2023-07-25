FROM openjdk:17-ea-11-slim
COPY target/kafkaconsumertest-0.0.1.jar kafkaconsumertest.jar
ENTRYPOINT ["java","-jar","kafkaconsumertest.jar"]