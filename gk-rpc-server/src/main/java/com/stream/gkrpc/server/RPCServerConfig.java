package com.stream.gkrpc.server;

import com.stream.gkrpc.codec.Decoder;
import com.stream.gkrpc.codec.Encoder;
import com.stream.gkrpc.codec.JSONDecoder;
import com.stream.gkrpc.codec.JSONEncoder;
import com.stream.gkrpc.transport.HttpTransportServer;
import com.stream.gkrpc.transport.TransportServer;
import lombok.Data;

/**
 * server配置
 */
@Data
public class RPCServerConfig {
    
    private Class<? extends TransportServer> transportClass= HttpTransportServer.class;
    
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;

    private int port = 3000;

}
