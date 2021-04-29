package com.quanty.cloud.service.zk;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.oas.annotations.EnableOpenApi;
import tk.mybatis.spring.annotation.MapperScan;
@EnableOpenApi
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.quanty.cloud.service.zk.mapper.mapper1","com.quanty.cloud.service.zk.mapper.mapper2"})
public class ZKApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZKApplication.class);
    }
}
