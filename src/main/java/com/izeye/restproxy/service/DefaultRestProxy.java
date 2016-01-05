package com.izeye.restproxy.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by izeye on 16. 1. 5..
 */
@Service
public class DefaultRestProxy implements RestProxy {

	private final RestTemplate restTemplate = new RestTemplate();

	@Override
	public String proxy(String url) {
		return restTemplate.getForObject(url, String.class);
	}
	
}
