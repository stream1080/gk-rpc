package com.stream.gkrpc.codec;

import org.junit.Test;

import static org.junit.Assert.*;

public class JSONEncoderTest {
    @Test
    public void encode() throws Exception {
        Encoder encoder = new JSONEncoder();

        TestBean bean =  new TestBean();
        bean.setName("stream");
        bean.setAge(18);

        byte[] bytes = encoder.encode(bean);
        assertNotNull(bytes);
    }

}