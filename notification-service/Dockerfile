FROM ubuntu:20.04
ENV DEBIAN_FRONTEND=noninteractive
RUN apt-get update && apt-get install -y \
    openjdk-17-jdk \
    maven \
    nano \
    curl \
    git \
    && apt-get clean && rm -rf /var/lib/apt/lists/*
WORKDIR /app
COPY . /app
RUN mvn clean package
EXPOSE 3003
CMD ["java", "-jar", "target/notification-service.jar"]
