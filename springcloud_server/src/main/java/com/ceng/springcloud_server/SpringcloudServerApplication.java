package com.ceng.springcloud_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudServerApplication.class, args);
	}
}
