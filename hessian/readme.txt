2013年2月13日 11:33:28
各种rmi或rpc性能：http://zwbill.iteye.com/blog/1305572

在benchmark时，经常出现socket connection reset的情况，整个服务几乎不可用
后面就变得服务器一直返回500

和RMI相比：
1)在网络上传输的对象都要implements Serializable接口，
    当然可以用java自带的，什么都不写，序列化字节多一些。
2)提供服务的对象本质上是一个Servlet，都要extends HessianServlet