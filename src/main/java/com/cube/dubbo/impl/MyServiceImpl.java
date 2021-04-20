package com.cube.dubbo.impl;

import org.apache.dubbo.config.annotation.DubboService;

import com.cube.dubbo.MyService;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * 
 * @author phoenix
 * @date 2021年4月20日
 */
@DubboService
@Slf4j
public class MyServiceImpl implements MyService {

	@Override
	public String dubbo(String str) {
		// TODO Auto-generated method stub
		log.info("Dubbo test ... ");
		return "Dubbo Service Test " + str;
	}

}
