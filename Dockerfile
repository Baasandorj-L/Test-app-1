FROM openjdk:18
WORKDIR /app
ADD target/RepairType-0.0.1-SNAPSHOT.jar RepairType-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","RepairType-0.0.1-SNAPSHOT.jar"]
