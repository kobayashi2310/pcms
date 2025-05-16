package com.pcms.pcms.model;

import lombok.Getter;

/**
 * PCのステータスを表す列挙
 */
@Getter
public enum PcStatus {

    /**
     * 使用可能状態
     */
    AVAILABLE("available"),

    /**
     * メンテナンスの状態
     */
    MAINTENANCE("maintenance");

    private final String value;

    PcStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    /**
     * 与えられた文字列からPcStatusを返します。
     * @param value ステータスの文字列("available" もしくは "maintenance")
     * @return PcStatusオブジェクト
     * @throws IllegalArgumentException 与えられた文字列が不正の場合
     */
    public static PcStatus fromString(String value) {
        return switch (value.toLowerCase()) {
            case "available" -> AVAILABLE;
            case "maintenance" -> MAINTENANCE;
            default -> throw new IllegalArgumentException("Invalid value: " + value);
        };
    }
}
