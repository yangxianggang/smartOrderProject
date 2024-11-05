package com.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
 import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;


@SpringBootApplication
public class BootstrapApplication extends SpringBootServletInitializer {

	public static void main(String[] args) throws UnknownHostException {
		ConfigurableApplicationContext application = SpringApplication.run(BootstrapApplication.class, args);
		Environment env = application.getEnvironment();

		String ip = InetAddress.getLocalHost().getHostAddress();

		System.out.println("===order web =====");
		System.out.println("========ip:"+ip);
		System.out.println("========port:"+env.getProperty("server.port"));
	}

}
