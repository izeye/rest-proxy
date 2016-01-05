package com.izeye.restproxy.web;

import com.izeye.restproxy.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

/**
 * Created by izeye on 16. 1. 5..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebIntegrationTest(randomPort = true)
public class RestProxyControllerTests {
	
	@Value("${local.server.port}")
	int port;
	
	RestTemplate restTemplate = new RestTemplate();
	
	@Test
	public void test() {
		String url = "https://spring.io/info";
		String response = restTemplate.getForObject(
				"http://localhost:{port}/rest-proxy?url={url}", String.class, port, url);
		System.out.println(response);
	}
	
}
