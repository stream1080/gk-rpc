package com.stream.gkrpc;

import lombok.Data;

/**
 * RPC的返回
 **/
@Data
public class Response {

    /**
     * 服务返回编码，0-成功 ，非0失败
     */
    private int code;//成功与否
    /**
     * 具体的错误信息
     */
    private String message  = "ok";
    /**
     * 返回的数据
     */
    private Object data;
}
