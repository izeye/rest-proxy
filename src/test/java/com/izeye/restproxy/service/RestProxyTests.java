package com.izeye.restproxy.service;

import com.izeye.restproxy.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by izeye on 16. 1. 5..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class RestProxyTests {
	
	@Autowired
	RestProxy restProxy;
	
	@Test
	public void testProxy() {
		String url = "https://spring.io/info";
		String response = restProxy.proxy(url);
		System.out.println(response);
	}
	
}
