package com.victorlevin.yandextaxischeduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableConfigurationProperties
@EnableScheduling
@EnableFeignClients
public class YandexTaxiSchedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YandexTaxiSchedulerApplication.class, args);
    }

}
