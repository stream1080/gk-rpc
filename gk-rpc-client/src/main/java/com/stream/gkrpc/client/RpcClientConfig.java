package com.stream.gkrpc.client;

import com.stream.gkrpc.Peer;
import com.stream.gkrpc.codec.Decoder;
import com.stream.gkrpc.codec.Encoder;
import com.stream.gkrpc.codec.JSONDecoder;
import com.stream.gkrpc.codec.JSONEncoder;
import com.stream.gkrpc.transport.HTTPTransportClient;
import com.stream.gkrpc.transport.TransportClient;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * client配置
 **/
@Data
public class RpcClientConfig {
    private Class<? extends TransportClient> transportClass=
            HTTPTransportClient.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private Class<? extends TransportSelector> selectorClass =
            RandomTransportSelector.class;
    private int connectCount = 1;
    private List<Peer>servers = Arrays.asList(new Peer("127.0.0.1",3000));
}
