package com.pcms.pcms.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Userのモデルクラス
 * @version 1.0
 */
@Getter
@Setter
public class User {

    private int user_id;
    private String number;
    private String name;
    private String email;
    private String password;
    private Role role;

    /**
     * 空のコンストラクタ（MyBatisで必要）
     */
    public User() {}

    public User(int user_id, String number, String name, String email, String password, Role role) {
        this.user_id = user_id;
        this.number = number;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }
}
