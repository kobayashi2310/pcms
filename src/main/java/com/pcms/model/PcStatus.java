package com.pcms.model;

import lombok.Getter;

/**
 * PCの現在の状態を表す列挙型。
 * <p>
 * 各PCが貸出可能か、あるいはメンテナンス中かを識別するために使用される。
 * データベースには {@code "available"} または {@code "maintenance"} として保存される。
 * </p>
 */
@Getter
public enum PcStatus {

    /**
     * 利用可能な状態（貸出可能）。
     * データベース上では "available" として保存される。
     */
    AVAILABLE("available"),

    /**
     * メンテナンス中の状態（貸出不可）。
     * データベース上では "maintenance" として保存される。
     */
    MAINTENANCE("maintenance");

    /**
     * データベースと対応する文字列表現。
     */
    private final String value;

    /**
     * 指定された文字列値を持つPC状態を生成する。
     *
     * @param value データベースなどで使用される文字列値
     */
    PcStatus(String value) {
        this.value = value;
    }

    /**
     * 列挙値を対応する文字列として返す。
     *
     * @return 文字列形式のPC状態（例: "available", "maintenance"）
     */
    @Override
    public String toString() {
        return value;
    }

    /**
     * 文字列から対応する {@code PcStatus} を取得する。
     *
     * @param value "available" または "maintenance" に一致する文字列
     * @return 対応する {@code PcStatus} 値
     * @throws IllegalArgumentException 指定された値がどの状態にも一致しない場合
     */
    public static PcStatus fromString(String value) {
        for (PcStatus status : PcStatus.values()) {
            if (status.value.equals(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("No matching constant for [" + value + "]");
    }
}
