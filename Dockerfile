from frolvlad/alpine-oraclejdk8:slim
add ./target/spring_rest_arqui-0.0.1-SNAPSHOT.jar app.jar
expose 8080
