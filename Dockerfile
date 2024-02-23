FROM registry.access.redhat.com/ubi8/openjdk-11@sha256:83ad1d4a3acc6ece8e08566c7f0363da6982b3a4707b9b5cf9e9c5c547f5dd57
VOLUME /tmp
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","hello.Application"]
