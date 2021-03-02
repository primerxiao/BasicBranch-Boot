package com.irdstudio.efp.console.service.facade;

/**
 * 该接口为Dubbo的服务端、消费端公用的接口定义。
 * 当前案例中，使用的是直接复制代码的方式，这不是最优雅的使用方法。更好的建议是通过maven坐标的方式独立维护api。
 */
public interface EchoService {
    String echo(String message);
}
