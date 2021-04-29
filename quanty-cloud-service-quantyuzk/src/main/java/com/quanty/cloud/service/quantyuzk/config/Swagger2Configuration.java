package com.quanty.cloud.service.quantyuzk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Classname Swagger2Configuration
 * @Description 接口文档配置
 * @Date 2020/11/6 16:04
 * @Created by willi
 */
@Configuration
public class Swagger2Configuration {
    @Bean
    public Docket buildDocket(){
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(buildApiInf())
                .select()
                //配置要扫描的接口包路径
                .apis(RequestHandlerSelectors.basePackage("com.quanty.cloud.service.quantyuzk.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo buildApiInf() {
        return new ApiInfoBuilder()
                .title("XX数据接口文档")
                .description("springboot swagger3")
                .build();

    }
}
