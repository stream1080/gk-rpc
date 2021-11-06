# gk-rpc
自己动手实现一个RPC框架

## 1.Proto 模块
- Proto模块用于规定数据传输协议和规约

## 2 Transport 模块
- 该模块主要用于client与server的http通信处理问题，其client请求内容以Request类形式封装传输，server响应内容以Reponse类封装返回。
- 使用Jetty容器完成init(),start(),stop()功能。
- 最重要的是RequestHandler实例的初始化，该抽象类定义于Transport模块，主要用于server处理来自client的请求。其抽象方法实现将在RpcServer类中详细讲解。

## 3 Common 模块
- common模块主要为一些反射工具，其具体实现如下:
- getPublicMethods()方法一个用途是Server注册时存储所有的method的ServcieSescriptor。
- invoke()方法用于执行指定实例对象的method。

## 4 codec 模块
- Encoder 编码器
- Decoder 解码器

## 5 Server 模块
- 本项目最核心两个模块之一，主要作用是定义了处理client请求的方法。
- register()方法主要用于注册该class的所有共有方法，并且获取之前讲述的ServiceDescriptor实例与ServiceInstance作为键值对的形式存储。
- 其内部主要定义了连个变量，一个是需要执行某个method的目标对象，另一个是需要执行的method。
- 其onRequest()方法通过Servlet的inputStream与OutputStream参数获取来自Client的数据，并且通过获取到的Request实例参数从ServiceManager中get实例对象与method。
- 因为Request对象中包含有Client获取到的实际参数，因此将上述参数一起传递到ServiceInvoker对象进行执行。


## 6 Client 模块
- 该模块主要功能有连个一个时动态代理获取实参，一个是请求Server进行过程调用。
- 其RpcClient类主要是用于处理Client对Server的连接问题，相当于连接池，由有需求时随机返回连接。
- RpcClient类的getProxy()方法为动态代理，需要重点关注RemoteInvoker类。
- invoke()方法中对代理方法的参数进行存储封装到Request对象并且最终序列化传递到Server。

## 7 example 样例
- 一个加减法的使用样例


