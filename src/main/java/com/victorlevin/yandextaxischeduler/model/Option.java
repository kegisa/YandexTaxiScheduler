package com.victorlevin.yandextaxischeduler.model;

import lombok.Data;

@Data
public class Option {
    public double price;
    public double min_price;
    public double waiting_time;
    public String class_name;
    public String price_text;
}
