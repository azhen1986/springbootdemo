package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * 类名称：Application
 * 类描述： springboot 入口
 * 创建人：Admin
 * 创建时间：Nov 1, 2017 7:25:07 PM
 * 修改人：Admin
 * 修改时间：Nov 1, 2017 7:25:07 PM
 * 修改内容：
 * 
 * @version 1.0
 */
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class Application
{
    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }
}
