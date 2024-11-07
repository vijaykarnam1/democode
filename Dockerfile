FROM openjdk:11
COPY target/Mbrporting3SpringBootApp.jar Mbrporting3SpringBootApp.jar
EXPOSE 8089
CMD [\