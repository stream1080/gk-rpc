package com.stream.gkrpc.example;

import com.stream.gkrpc.server.RPCServerConfig;
import com.stream.gkrpc.server.RpcServer;

/**
 * 服务端
 **/
public class Server {
    public static void main(String[] args) {
        RpcServer server = new RpcServer(new RPCServerConfig());
        server.register(CalcService.class,new CalcServiceImpl());
        server.start();
    }
}
