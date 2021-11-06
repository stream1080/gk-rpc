package com.stream.gkrpc.server;

import com.stream.gkrpc.Request;
import com.stream.gkrpc.utils.ReflectionUtils;


public class ServiceInvoker {
    public Object invoke(ServiceInstance service, Request request){
        return ReflectionUtils.invoke(service.getTarget(),service.getMethod(),request.getParameters());
    }
}
