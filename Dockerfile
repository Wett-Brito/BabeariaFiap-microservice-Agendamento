FROM adoptopenjdk/openjdk11:alpine

COPY target/ms-agendamento-1.jar ms-agendamento.jar
ENTRYPOINT ["java","-jar","/ms-agendamento.jar"]

EXPOSE 8060