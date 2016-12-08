/**   
 * @Title: HelloServiceImpl.java 
 * @Package com.delonix.service.provider 
 * @Description: TODO
 * @author chenbin
 * @date 2016年12月7日 下午5:27:57 
 * @version V1.0   
 */
package com.delonix.service.provider;

import com.delonix.service.HelloService;

/** 
 * @ClassName: HelloServiceImpl 
 * @Description: TODO  
 * @author chenbin
 * @date 2016年12月7日 下午5:27:57 
 *  
 */
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		return "Hello " + name;	
	}

}
