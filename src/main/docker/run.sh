#!/bin/sh

echo "********************************************************"
echo "Starting Template Server with Docker "
echo "********************************************************"

java -Djava.security.egd=file:/dev/./urandom -Dserver.port=$SERVER_PORT   \
     -jar /usr/local/dockerize/@project.build.finalName@.jar
