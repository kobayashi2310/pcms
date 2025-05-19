package com.pcms.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

/**
 * 授業や予約の時間帯（コマ）を表すモデルクラス。
 * <p>
 * 各Periodは「何限目か」（1〜5など）と、その開始時刻・終了時刻を表す。
 * 主に予約システムで、どの時間帯にPCが使われるかを管理する目的で利用される。
 * </p>
 */
@Getter
@Setter
public class Period {

    /**
     * 時間帯の番号（1限、2限など）。主キーに相当する。
     */
    private byte period_number;

    /**
     * コマの開始時刻。
     */
    private LocalTime start_time;

    /**
     * コマの終了時刻。
     */
    private LocalTime end_time;

    /**
     * デフォルトコンストラクタ。
     */
    public Period() {}

    /**
     * すべてのフィールドを指定するコンストラクタ。
     *
     * @param period_number コマ番号（1限〜）
     * @param start_time コマの開始時刻
     * @param end_time コマの終了時刻
     */
    public Period(byte period_number, LocalTime start_time, LocalTime end_time) {
        this.period_number = period_number;
        this.start_time = start_time;
        this.end_time = end_time;
    }
}
