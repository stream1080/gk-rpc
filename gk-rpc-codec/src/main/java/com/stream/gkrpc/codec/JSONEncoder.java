package com.stream.gkrpc.codec;

import com.alibaba.fastjson.JSON;


public class JSONEncoder implements Encoder{

    /**
     * εΊεε
     *
     * @param obj
     * @return
     */
    @Override
    public byte[] encode(Object obj) {
        return JSON.toJSONBytes(obj);
    }
}
