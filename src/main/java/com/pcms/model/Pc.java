package com.pcms.model;

import lombok.Getter;
import lombok.Setter;

/**
 * PCの情報を表すモデルクラス。
 * <p>
 * 貸出対象となるPCの識別情報（ID、名前、シリアル番号）および状態（利用可能かどうか）を保持する。
 * </p>
 */
@Getter
@Setter
public class Pc {

    /**
     * PCの一意な識別子（主キー）。
     */
    private int pc_id;

    /**
     * PCの名称
     */
    private String name;

    /**
     * シリアル番
     * データベース上では一意制約がかかっている。
     */
    private String serial_number;

    /**
     * PCの現在の状態（利用可能かメンテナンス中か）。
     */
    private PcStatus status;

    /**
     * デフォルトコンストラクタ。
     */
    public Pc() {}

    /**
     * すべてのフィールドを指定するコンストラクタ。
     *
     * @param pc_id PCのID
     * @param name PCの名前
     * @param serial_number シリアル番号
     * @param status PCの状態
     */
    public Pc(int pc_id, String name, String serial_number, PcStatus status) {
        this.pc_id = pc_id;
        this.name = name;
        this.serial_number = serial_number;
        this.status = status;
    }
}
