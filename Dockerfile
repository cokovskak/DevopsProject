FROM maven:3.8.7-openjdk:21-jdk-slim AS jar-package
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:21-jdk-slim
COPY --from=jar-package /target/EmployeePage-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
