FROM bellsoft/liberica-openjdk-alpine-musl
COPY ./target/YandexTaxiScheduler-0.0.1-SNAPSHOT.jar .
CMD ["java","-jar","YandexTaxiScheduler-0.0.1-SNAPSHOT.jar"]