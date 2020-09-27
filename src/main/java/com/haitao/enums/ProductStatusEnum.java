package com.haitao.enums;

import lombok.Getter;

@Getter
public enum ProductStatusEnum {

    UP(0, "on shelf"),
    DOWN(1, "off shelf")
    ;

    private Integer code;
    private String message;
    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
