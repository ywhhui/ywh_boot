package com.example.spring_boot_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.gitee.sunchenbin.mybatis.actable.dao.*","com.example.spring_boot_demo.mapper"})
@ComponentScan(basePackages = {"com.gitee.sunchenbin.mybatis.actable.manager.*","com.example.spring_boot_demo.*"})
//@MapperScan({"com.gitee.sunchenbin.mybatis.actable.dao.*"})//固定的
//@ComponentScan("com.gitee.sunchenbin.mybatis.actable.manager.*")//固定的
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootDemoApplication.class, args);
		System.out.println("----- http://localhost:8880/demo/ -----");
	}

}
