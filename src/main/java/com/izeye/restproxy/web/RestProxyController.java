package com.izeye.restproxy.web;

import com.izeye.restproxy.service.RestProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by izeye on 16. 1. 5..
 */
@RestController
@RequestMapping(path = "/rest-proxy")
public class RestProxyController {
	
	@Autowired
	private RestProxy restProxy;
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public String proxy(@RequestParam String url) {
		return restProxy.proxy(url);
	}
	
}
