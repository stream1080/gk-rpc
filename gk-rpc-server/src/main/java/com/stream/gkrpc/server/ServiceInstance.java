package com.stream.gkrpc.server;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.lang.reflect.Method;

/**
 * 具体服务
 **/
@Data
@AllArgsConstructor
public class ServiceInstance {

    private Object target;

    private Method method;

}
