package com.pcms.pcms.model;

import lombok.Getter;

/**
 * 予約のステータスを表す列挙
 */
@Getter
public enum ReservationStatus {
    /**
     * 承認待ち
     */
    PENDING_APPROVAL("pending_approval"),

    /**
     * 承認済み
     */
    APPROVED("approved"),

    /**
     * キャンセル済み
     */
    CANCELLED("cancelled");

    private final String value;

    ReservationStatus(String value) { this.value = value; }

    @Override
    public String toString() { return value; }

    /**
     *与えられた文字列から対応するRoleを返します。
     * @param value 予約ステータスを表す文字列
     * @return ReservationStatusオブジェクト
     * @throws IllegalArgumentException 文字列が不正の場合
     */
    public static ReservationStatus fromString(String value) {
        return switch (value.toLowerCase()) {
            case "pending_approval" -> PENDING_APPROVAL;
            case "approved" -> APPROVED;
            case "cancelled" -> CANCELLED;
            default -> throw new IllegalArgumentException("Invalid value: " + value);
        };
    }

}
