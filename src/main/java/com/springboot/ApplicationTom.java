package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 外部 tomcat 加载war包入口的同时支持embed tomcat
 * 类名称：ApplicationTom    
 * 类描述：    
 * 创建人：Admin    
 * 创建时间：Nov 3, 2017 11:22:26 AM    
 * 修改人：Admin
 * 修改时间：Nov 3, 2017 11:22:26 AM    
 * 修改内容：    
 * @version 1.0
 */
@SpringBootApplication
public class ApplicationTom extends SpringBootServletInitializer
{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
    {
        return application.sources(ApplicationTom.class);
    }
    public static void main(String[] args) throws Exception 
    {
        SpringApplication.run(ApplicationTom.class, args);
    }
}
