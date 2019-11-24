package com.dubbo.gmall;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ImportResource;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

/**
 * 1、导入依赖 1）、导入dubbo-starter 2）、导入dubbo的其他依赖
 * 
 * @author 1
 * 
 * SpringBoot与dubbo整合的三种方式
 * 1）、 导入dubbo-starter，在application.properties配置属性，使用@Service【暴露服务】使用@Reference【引用服务】
 * 		application.properties中：
			# 包扫描功能，当开始时，开始程序可以不使用@EnableDubbo注解开启基于注解的Dubbo功能
			# dubbo.scan.base-packages=com.dubbo.gmall
 * 2）、保留dubbo.xml配置文件
 * 			导入dubbo-starter，使用@ImportResource导入dubbo的配置文件即可
 * 			暴露服务是就可以不使用注解的方式，在xml中已经配置
 * 3）、使用注解API的方式
 * 			将每一个组件手动创建到容器中，让dubbo来扫描其他的组件
 * 
 */
//@EnableDubbo // 开启基于注解的dubbo功能。第一种整合方式，配合注解
//@ImportResource(locations="classpath:provider.xml") // 导入资源配置文件。第二种整合方式，可无注解
@EnableDubbo(scanBasePackages="com.dubbo.gmall") // 实用配置类MyDubboConfig，第三种整合方式，配合注解（@Service）

@EnableHystrix // 开启服务容错功能
@SpringBootApplication
public class BootUserServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootUserServiceProviderApplication.class, args);
	}

}
