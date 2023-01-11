FROM adoptopenjdk/openjdk11:alpine
MAINTAINER baeldung.com
COPY target/ms-agendamento-1.jar ms-agendamento.jar
ENTRYPOINT ["java","-jar","/ms-agendamento.jar"]