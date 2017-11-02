package com.springboot.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * 类名称：FreeMarkerController    
 * 类描述：    
 * 创建人：Admin    
 * 创建时间：Nov 1, 2017 7:16:57 PM    
 * 修改人：Admin
 * 修改时间：Nov 1, 2017 7:16:57 PM    
 * 修改内容：    
 * @version 1.0
 */
@Controller
@RequestMapping("/ftl")
public class FreeMarkerController
{
    @RequestMapping("/helloFtl")  
    public String helloHtml(Map<String,Object> map){  
  
       map.put("hello","from FreeMarkerController.helloFtl");  
       return"/helloFtl";  
    } 
}
