package com.sinosoft;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sinosoft.dao")//扫描dao类
public class ApplicationStart {
	public static void main(String[] args) {
		 SpringApplication.run(ApplicationStart.class, args);
	}
}
