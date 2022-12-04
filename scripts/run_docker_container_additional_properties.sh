#!/bin/sh

docker stop additional_properties_test
docker rm additional_properties_test

docker run --rm -d --name additional_properties_test \
        -p 8080:8080 \
        -v C:/Users/${USERNAME}/properties:/app/properties \
        additional_properties_test
