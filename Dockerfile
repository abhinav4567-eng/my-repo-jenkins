FROM openjdk:21
COPY target/devopsSample.jar devopsSample.jar
CMD java -jar devopsSample.jar