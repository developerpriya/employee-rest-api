FROM openjdk:8
VOLUME /tmp
EXPOSE 9001
ADD target/employee-rest-api-0.0.1.jar employee-rest-api-0.0.1.jar
ENTRYPOINT ["java","-jar","/employee-rest-api-0.0.1.jar"]