FROM openjdk:17-alpine
COPY build/libs/Organization-0.0.1-SNAPSHOT.jar /Organization-app/
CMD ["java","-jar","/Organization-0.0.1-SNAPSHOT.jar"]