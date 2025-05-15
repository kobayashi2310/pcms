package com.pcms.pcms.model;

public record User (
    int user_id,
    String number,
    String name,
    String password,
    String email,
    Role role
) {
    public enum Role { STUDENT, TEACHER }
}
