package com.pcms.pcms.model;

import lombok.Getter;
import lombok.Setter;

/**
 * PCの情報を表すモデルクラス。
 * @author kobayashi2310
 */
@Getter
public class PCs {
    private final int pc_id;
    @Setter
    private String name;
    @Setter
    private String serial_number;
    @Setter
    private PcStatus pc_status;

    public PCs(int pc_id, String name, String serial_number, PcStatus pc_status) {
        this.pc_id = pc_id;
        this.name = name;
        this.serial_number = serial_number;
        this.pc_status = pc_status;
    }

    /**
     * 初期化用コンストラクタ。pc_idを-1で初期化します。
     */
    public PCs() { this.pc_id = -1; }

    /**
     * PCのステータスを表す列挙
     * AVAILABLE: 利用可能
     * MAINTENANCE: 整備中
     */
    public enum PcStatus {
        AVAILABLE, MAINTENANCE;

        @Override
        public String toString() {
            switch (this) {
                case AVAILABLE -> { return "available"; }
                case MAINTENANCE -> { return "maintenance"; }
            }
            throw new IllegalArgumentException("Invalid PC status");
        }
    }
}
