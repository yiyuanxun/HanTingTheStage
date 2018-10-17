package com.accp.hanting.cfg;

import java.io.IOException;
import java.util.Properties;

import org.mybatis.spring.annotation.MapperScan;
import org.quartz.Scheduler;
import org.quartz.ee.servlet.QuartzInitializerListener;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.transaction.annotation.EnableTransactionManagement;


import com.github.pagehelper.PageHelper;

@Configuration
@MapperScan(basePackages = { "com.accp.hanting.dao" })
@EnableTransactionManagement
public class BeansConfig {

	/**
	 * 
	* @title: pageHelper 
	* @description: 分页配置
	* @return
	 */
	@Bean
	public PageHelper pageHelper() {
		PageHelper pageHelper = new PageHelper();
		Properties properties = new Properties();
		properties.setProperty("offsetAsPageNum", "true");
		properties.setProperty("rowBoundsWithCount", "true");
		properties.setProperty("reasonable", "true");
		properties.setProperty("dialect", "mysql");
		pageHelper.setProperties(properties);
		return pageHelper;
	}






}
