//package cn.com.tbshuda.gateway.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;
//
///**
// * @author: wsd
// * @date: 2021/10/26 17:55
// */
//@Configuration
//@EnableSwagger2WebMvc
//public class Knife4jConfiguration {
//
//    @Bean(value = "defaultApi2")
//    public Docket defaultApi2() {
//        Docket docket=new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(new ApiInfoBuilder()
//                        .description("# swagger-bootstrap-ui-demo RESTful APIs")
//                        .termsOfServiceUrl("http://www.sssssss.com/")
//                        .contact("xx@qq.com")
//                        .version("1.0")
//                        .build())
//                //分组名称
//                .groupName("2.X版本")
//                .select()
//                //这里指定Controller扫描包路径
//                .apis(RequestHandlerSelectors.basePackage("cn.com.tbshuda.gateway.controller"))
//                .paths(PathSelectors.any())
//                .build();
//        return docket;
//    }
//}
