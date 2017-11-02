package com.springboot.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class ThymeleafController
{
    @RequestMapping("/helloHtml")  
    public String helloHtml(Map<String,Object> map){  
  
       map.put("hello","from TemplateController.helloHtml");  
       return"/helloThymeleaf";  
    }  
}
