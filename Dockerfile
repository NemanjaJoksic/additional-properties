FROM openjdk:17-jdk-alpine

COPY target/additional-properties-*.jar /app/additional-properties.jar

ENTRYPOINT java -jar \
                -Dspring.config.additional-location=optional:file:/app/properties/local.yaml \
                /app/additional-properties.jar