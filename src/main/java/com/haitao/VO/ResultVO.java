package com.haitao.VO;


import lombok.Data;


/**
 * the outest Object returned by http request
 *
 */
@Data
public class ResultVO<T> {

    // error code
    private Integer code;

    private String msg;

    // exact content
    private T data;

}
