package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * 类名称：Application
 * 类描述： springboot 入口
 * 创建人：Admin
 * 创建时间：Nov 1, 2017 7:25:07 PM
 * 修改人：Admin
 * 修改时间：Nov 1, 2017 7:25:07 PM
 * 修改内容：
 * 2017-11-02 修改返回template路径若以/开始，则将导致请求无法到classpath:template目录下(mvn spring-boot:run没问题)
 *            直接返回template下的文件名称即可
 * @version 1.0
 */
//@EnableAutoConfiguration
//@Configuration
//@ComponentScan
//@SpringBootApplication //即EnableAutoConfiguration  Configuration ComponentScan的总称
public class Application
{
//    public static void main(String[] args)
//    {
//        SpringApplication.run(Application.class, args);
//    }
}
