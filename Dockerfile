FROM registry.access.redhat.com/ubi8/openjdk-8@sha256:c688fc85bd173f6bf661fee08ccb34eec16460e1b2ad59f01fdfc0a8ba4f0b05
VOLUME /tmp
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","hello.Application"]
