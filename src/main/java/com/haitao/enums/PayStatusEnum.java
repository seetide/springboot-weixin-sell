package com.haitao.enums;

import lombok.Getter;

@Getter
public enum PayStatusEnum {
    WAIT(0, "not paid"),
    PAID(1, "paid"),

    ;

    private Integer code;
    private String msg;

    PayStatusEnum(Integer code, String msg) {

        this.code = code;
        this.msg = msg;
    }
}
