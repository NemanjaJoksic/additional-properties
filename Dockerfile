FROM openjdk:17-jdk-alpine

COPY ./properties /app/properties
COPY target/additional-properties-*.jar /app/additional-properties.jar

ENTRYPOINT java -jar \
                -Dspring.config.additional-location=file:/app/properties/local.yaml \
                /app/additional-properties.jar