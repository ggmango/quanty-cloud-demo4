package com.quanty.cloud.service.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 项目名称:  quanty-cloud-demo1
 * 文件名:    DemoApplication
 *
 * @author William Kim
 * @version 1.0.0
 * @date 2021/2/22 10:31
 */

@EnableOpenApi
@SpringBootApplication
@MapperScan(basePackages = "com.quanty.cloud.service.demo.mapper")
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class);
    }
}
