FROM openjdk:11
ADD target/vphoto.jar vphoto.jar
ENTRYPOINT ["java","-jar","vphoto.jar"]