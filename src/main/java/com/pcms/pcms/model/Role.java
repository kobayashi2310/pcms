package com.pcms.pcms.model;

import lombok.Getter;

/**
 * userを識別するための列挙
 */
@Getter
public enum Role {
    /**
     * 生徒
     */
    STUDENT("student"),
    /**
     * 教師
     */
    TEACHER("teacher");

    private final String value;

    Role(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    /**
     * 与えられた文字列から対応するRoleを返します。("student"　もしくは "teacher")
     * @param value ユーザーの識別文字列
     * @return Roleオブジェクト
     * @throws IllegalArgumentException 与えられた文字列が不正の場合
     */
    public static Role fromString(String value) {
        return switch (value.toLowerCase()) {
            case "student" -> STUDENT;
            case "teacher" -> TEACHER;
            default -> throw new IllegalArgumentException("Invalid Role:" + value);
        };
    }
}
