package com.ithinksky.confg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 功能描述：Swagger2 配置
 *
 * @author tengpeng.gao
 * @since 2019/4/16
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("chapter100-conclusion API")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ithinksky"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("chapter100-conclusion API")
                .contact(new Contact("tengpeng.gao", null, null))
                .version("1.0.0").build();
    }


    @Bean
    public Docket createFlowableRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("flowable-rest API")
                .apiInfo(flowableApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.flowable.rest"))
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo flowableApiInfo() {
        return new ApiInfoBuilder()
                .title("flowable-rest API 接口文档")
                .version("6.4.1")
                .build();
    }

}
