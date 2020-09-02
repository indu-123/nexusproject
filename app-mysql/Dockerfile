FROM adoptopenjdk:14-jre-hotspot

ARG JAR_FILE
RUN mkdir /opt/app
RUN echo ${JAR_FILE}
COPY target/${JAR_FILE} /opt/app/app.jar
CMD ["java", "-jar", "/opt/app/app.jar"]