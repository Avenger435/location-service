FROM openjdk
ADD target/location-service.jar location-service.jar
ENTRYPOINT ["java", "-jar", "/location-service.jar"]
EXPOSE 2222