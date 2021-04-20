package com.cube.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * 
 * @author phoenix
 * @date 2021年4月19日
 */
@RestController
@Slf4j
public class TestController {

	/**
	 * 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param string
	 * @return
	 */
	@GetMapping(value = "/provider/{string}")
	public String provider(@PathVariable String string) {
		log.info("nacos provider test controller ...");
		return "Hello Nacos Discovery " + string;
	}

}
