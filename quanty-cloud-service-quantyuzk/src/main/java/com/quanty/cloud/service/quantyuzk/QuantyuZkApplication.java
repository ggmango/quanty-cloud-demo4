package com.quanty.cloud.service.quantyuzk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Classname DemoServiceApplication
 * @Description TODO
 * @Date 2020/11/27 13:01
 * @Created by willi
 */
@MapperScan(basePackages = "com.quanty.cloud.service.quantyuzk.mapper")
@SpringBootApplication
@EnableOpenApi
public class QuantyuZkApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuantyuZkApplication.class,args);
    }
}
