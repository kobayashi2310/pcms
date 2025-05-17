package com.pcms.pcms.model;

import lombok.Getter;

import java.time.LocalTime;

/**
 * 授業のコマを扱うモデルクラス
 * @author kobayashi2310
 */
@Getter
public class Period {
    private final byte period_number;
    private final LocalTime start_time, end_time;

    public Period(byte period_number, LocalTime startTime, LocalTime endTime) {
        this.period_number = period_number;
        this.start_time = startTime;
        this.end_time = endTime;
    }
}
