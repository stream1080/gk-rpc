package com.stream.gkrpc.codec;

import com.alibaba.fastjson.JSON;


public class JSONDecoder implements Decoder {

    /**
     * εεΊεε
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
