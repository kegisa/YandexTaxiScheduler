package com.victorlevin.yandextaxischeduler.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Coordinate {
    public String latitude;
    public String longitude;

    @Override
    public String toString() {
        return longitude + "," + latitude;
    }
}
