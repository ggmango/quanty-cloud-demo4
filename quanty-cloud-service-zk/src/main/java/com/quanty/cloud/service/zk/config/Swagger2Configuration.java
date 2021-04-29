package com.quanty.cloud.service.zk.config;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.oas.annotations.EnableOpenApi;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
///**
// * @Classname Swagger2Configuration
// * @Description TODO
// * @Date 2020/11/6 16:04
// * @Created by willi
// */
//@Configuration
//public class Swagger2Configuration {
//    @Bean
//    public Docket buildDocket(){
//        return new Docket(DocumentationType.OAS_30)
//                .apiInfo(buildApiInf())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.quanty.cloud.service.zk.controller"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    private ApiInfo buildApiInf() {
//        return new ApiInfoBuilder()
//                .title("钻孔数据接口文档")
//                .description("springboot swagger3")
//                .build();
//
//    }
//}
