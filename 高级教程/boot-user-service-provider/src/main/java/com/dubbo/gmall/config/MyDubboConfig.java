package com.dubbo.gmall.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.MethodConfig;
import com.alibaba.dubbo.config.MonitorConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;

import service.UserService;

@Configuration
public class MyDubboConfig {
	
//	<dubbo:application name="boot-user-service-provider"></dubbo:application>
	@Bean
	public ApplicationConfig applicationConfig() {
		 ApplicationConfig applicationConfig = new ApplicationConfig();
		 applicationConfig.setName("boot-user-service-provider");
		 return applicationConfig;
	}
	
//	<dubbo:registry protocol="zookeeper" address="127.0.0.1:2181"></dubbo:registry>
	@Bean
	public RegistryConfig registryConfig() {
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setProtocol("zookeeper");
		registryConfig.setAddress("127.0.0.1:2181");
		return registryConfig;
	}
	
//	<dubbo:protocol name="dubbo" port="20880"></dubbo:protocol>
	@Bean
	public ProtocolConfig protocolConfig() {
		ProtocolConfig protocolConfig = new ProtocolConfig();
		protocolConfig.setName("dubbo");
		protocolConfig.setPort(20882);
		return protocolConfig;
		
	}
	
	/*
	 * <dubbo:service interface="service.UserService" ref="userServiceImpl01"
	 		timeout="1000" version="1.0.0">
	 		<dubbo:method name="getUserAddressList" timeout="1000"></dubbo:method>
	   </dubbo:service>
	 */
	@Bean
	public ServiceConfig<UserService> serviceConfig(UserService userService) { // 因为已经是用@Component加载到容器中了
		ServiceConfig<UserService> serviceConfig = new ServiceConfig<UserService>();
		serviceConfig.setInterface(UserService.class);
		serviceConfig.setRef(userService);
		serviceConfig.setTimeout(5000);
		serviceConfig.setVersion("1.0.0");
		serviceConfig.setRetries(3);
		
		// 配置每一个method的信息
		MethodConfig methodConfig = new MethodConfig();
		methodConfig.setName("getUserAddressList");
		methodConfig.setTimeout(1000);
		
		// 将method的设置关联到service配置中
		List<MethodConfig> methods = new ArrayList<>();
		methods.add(methodConfig);
		serviceConfig.setMethods(methods);
		
//		ProtocolConfig
//		MonitorConfig
		
		return serviceConfig;
	}

}
