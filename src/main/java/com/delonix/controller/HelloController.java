/**   
 * @Title: HelloController.java 
 * @Package com.delonix.controller 
 * @Description: TODO
 * @author chenbin
 * @date 2016年12月8日 下午1:38:39 
 * @version V1.0   
 */
package com.delonix.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.delonix.service.HelloService;

/** 
 * @ClassName: HelloController 
 * @Description: TODO  
 * @author chenbin
 * @date 2016年12月8日 下午1:38:39 
 *  
 */
@Controller
@RequestMapping("/hello/*")
public class HelloController {
	
	@Autowired
	private HelloService comsumerHelloService;
	
	@RequestMapping(value="/sayHello", method=RequestMethod.GET)
	public void sayHello(@RequestParam(value="name", required=true) String name,
			HttpServletResponse resp) {
        try {
        	String hello = comsumerHelloService.sayHello(name); // 执行远程方法
			resp.getWriter().print(hello);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
