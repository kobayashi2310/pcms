package com.pcms.pcms.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

/**
 * 授業のコマを扱うモデルクラス
 */
@Getter @Setter
public class Period {
    private byte period_number;
    private LocalTime start_time, end_time;

    public Period() {}

    public Period(byte period_number, LocalTime startTime, LocalTime endTime) {
        this.period_number = period_number;
        this.start_time = startTime;
        this.end_time = endTime;
    }
}
