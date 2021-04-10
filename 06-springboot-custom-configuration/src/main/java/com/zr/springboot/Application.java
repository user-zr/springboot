package com.zr.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//sprigboot的启动入口类
@SpringBootApplication	//springboot的核心注解
public class Application {

	//springboot项目代码必须放在同级或者下级目录中
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
