# We don't want to start from scratch.
# That is why we tell node here to use the openjdk image with java 17 as base.
FROM azul/zulu-openjdk-alpine:17
LABEL authors="gerardo"

# Create an application directory
RUN mkdir -p /app

# The /app directory should act as the main application directory
WORKDIR /app

# Copy or project directory (locally) in the current directory of our docker image (/app)
COPY target/*.jar ./app.jar

# Start the app
CMD [ "java", "-jar", "./app.jar" ]