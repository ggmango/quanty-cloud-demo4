package com.quanty.cloud.service.demo;

import io.swagger.annotations.ApiOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
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

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.quanty.cloud.service.demo.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("API中心接口文档")
                .description("更多请咨询服务开发者")
                .contact(new Contact("曾斌", null, "1252324263@qq.com"))
                .version("1.0")
                .build();
    }
}
