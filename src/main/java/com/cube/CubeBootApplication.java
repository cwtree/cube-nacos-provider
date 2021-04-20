package com.cube;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * 
 * @author phoenix
 * @date 2021年2月10日
 * @EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
@DubboComponentScan(basePackages = "com.cube")
public class CubeBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CubeBootApplication.class, args);
		if (log.isInfoEnabled()) {
			log.info("\n----------------------------------------------------------\n\t"
					+ "Application is running! Access URLs:\n\t"
					+ "swagger-ui: \thttp://ip:port/${context-path}/swagger/index.html\n\t"
					+ "----------------------------------------------------------");
		}
	}

}
