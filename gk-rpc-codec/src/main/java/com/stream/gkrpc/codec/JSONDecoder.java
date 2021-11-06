package com.stream.gkrpc.codec;

import com.alibaba.fastjson.JSON;


public class JSONDecoder implements Decoder {

    /**
     * 反序列化
     *
     * @param bytes
     * @param clazz
     * @param <T>
     * @return
     */
    @Override
    public <T> T decode(byte[] bytes, Class<T> clazz) {
        return JSON.parseObject(bytes,clazz);
    }
}
