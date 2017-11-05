package com.springboot.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import com.springboot.Application;
import com.springboot.ApplicationTom;

/**
 * 
 * 类名称：UserControllerTest    
 * 类描述：    单元测试
 * 创建人：Admin    
 * 创建时间：Nov 2, 2017 4:21:40 PM    
 * 修改人：Admin
 * 修改时间：Nov 2, 2017 4:21:40 PM    
 * 修改内容：    
 * @version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationTom.class)// 增加启动类
@AutoConfigureMockMvc
public class UserControllerTest
{
    @Autowired
    private MockMvc mvc;

    @Test
    public void getHello() throws Exception
    {
//        mvc.perform(MockMvcRequestBuilders.get("/")
//                .contentType(MediaType.APPLICATION_JSON_UTF8)
////                .param("lat", "123.123").param("lon", "456.456")
//                .accept(MediaType.APPLICATION_JSON))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andDo(MockMvcResultHandlers.print())
//                .andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("ok")));
      //请求的url,请求的方法是get   //数据的格式//添加参数
        String responseString = mvc.perform(MockMvcRequestBuilders.
                get("/user/test") .param("t1","this is t1"))
                .andExpect(MockMvcResultMatchers.status().isOk())    //返回的状态是200
                .andDo(MockMvcResultHandlers.print())        //打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
        System.out.println("--------返回的json = " + responseString);
    }
}
