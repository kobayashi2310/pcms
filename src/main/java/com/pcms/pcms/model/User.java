package com.pcms.pcms.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Userのモデルクラス
 * @author kobayashi
 * @version 1.0
 */
@Getter
public class User {

    /*
        @Getter、@Setterはprivate属性のゲッター・セッターを全部コンパイル時に追加してくれる機能
     */
    private final int user_id;
    @Setter private String number;
    @Setter private String name;
    @Setter private String email;
    @Setter private String password;
    @Setter private Role role;

    public User(int user_id, String number, String name, String email, String password, Role role) {
        this.user_id = user_id;
        this.number = number;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public User() { this.user_id = -1; }

    /**
     * ユーザを識別するための列挙
     */
    public enum Role {
        STUDENT, TEACHER;

        @Override
        public String toString() {
            switch (this) {
                case STUDENT -> { return "student"; }
                case TEACHER -> { return "teacher"; }
            }
            throw new IllegalArgumentException("Invalid role");
        }
    }
}
