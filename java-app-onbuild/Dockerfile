FROM openjdk:8-jre-alpine

RUN addgroup -S app && adduser -S -g app app

RUN apk add --no-cache su-exec

ONBUILD COPY --from=0 /jar/App.jar /app
WORKDIR /app

CMD ["su-exec", "app:app", "java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-XX:MaxRAMFraction=1", "-jar", "App.jar"]
