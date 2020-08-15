package com.sinosoft.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import com.alibaba.druid.pool.DruidDataSource;

/**
 * 需保证该配置类在SpringBoot启动类的下层包中
 */
@Configuration
public class DataSourceConfig {
	
	@Autowired
	private Environment env;
	
	//使用注解@Bean 创建一个DataSource Bean并将其纳入到Spring容器中进行管理
	@Bean
	public DataSource getDataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl(env.getProperty("spring.datasource.url"));
		dataSource.setUsername(env.getProperty("spring.datasource.username"));
		dataSource.setPassword(env.getProperty("spring.datasource.password"));
		return dataSource;
	}

}
