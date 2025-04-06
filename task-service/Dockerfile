# Use an official JDK image as base
FROM openjdk:23-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file
COPY target/task-service-0.0.1-SNAPSHOT.jar task-service.jar

# Expose the port the Spring Boot app listens on
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "task-service.jar"]
