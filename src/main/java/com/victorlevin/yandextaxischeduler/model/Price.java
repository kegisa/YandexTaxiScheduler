package com.victorlevin.yandextaxischeduler.model;

import lombok.Data;

import java.util.List;


@Data
public class Price {
    public List<Option> options;
    public String currency;
    public double distance;
    public String time_text;
}
