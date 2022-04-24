package com.victorlevin.yandextaxischeduler.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "yandex")
public class YandexProperties {
    private String clid;
    private String apiKey;
}
