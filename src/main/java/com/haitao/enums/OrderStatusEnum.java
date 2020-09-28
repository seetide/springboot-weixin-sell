package com.haitao.enums;

import lombok.Getter;

@Getter
public enum OrderStatusEnum {

    NEW(0, "new order"),
    FINISH(1, "finished order"),
    CANCEL(2, "canceled order")
    ;

    private Integer code;
    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
