package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//因为加入的是mybatis项目，spring boot默认加载了jdbc，所以刚开始测试的时候要exclude解除加载//(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
public class MyReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyReportApplication.class, args);
	}

}
