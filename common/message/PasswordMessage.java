package com.lezenford.netty.advanced.common.message;

public class PasswordMessage extends Message {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPasswordMessage(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "PasswordMessage{" +
                "password='" + password + '\'' +
                '}';
    }
}
