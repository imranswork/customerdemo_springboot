FROM java:8
EXPOSE 7070
ADD /target/customerserviceapp-0.0.1-SNAPSHOT.jar customerserviceapp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","customerserviceapp-0.0.1-SNAPSHOT.jar"]