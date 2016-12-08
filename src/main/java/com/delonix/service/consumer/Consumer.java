/**   
 * @Title: Comsumer.java 
 * @Package com.delonix.service.consumer 
 * @Description: TODO
 * @author chenbin
 * @date 2016年12月7日 下午5:35:10 
 * @version V1.0   
 */
package com.delonix.service.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.delonix.service.HelloService;

/** 
 * @ClassName: Comsumer 
 * @Description: TODO  
 * @author chenbin
 * @date 2016年12月7日 下午5:35:10 
 *  
 */
public class Consumer {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring/spring-all.xml"});
        context.start();

        HelloService demoService = (HelloService)context.getBean("helloService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法

        System.out.println( hello ); // 显示调用结果
    }

}
