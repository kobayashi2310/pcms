package com.pcms.pcms.model;

import lombok.Getter;
import lombok.Setter;

/**
 * PCの情報を表すモデルクラス。
 * @author kobayashi2310
 */
@Getter @Setter
public class Pc {
    private int pc_id;
    private String name;
    private String serial_number;
    private PcStatus pc_status;

    public Pc(int pc_id, String name, String serial_number, PcStatus pc_status) {
        this.pc_id = pc_id;
        this.name = name;
        this.serial_number = serial_number;
        this.pc_status = pc_status;
    }

    /**
     * 初期化用コンストラクタ(MyBaits用)
     */
    public Pc() { }
}
