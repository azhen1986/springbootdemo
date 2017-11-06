/**
 * 
 */
package com.springboot.business;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**  
 * 类名称：BussUnit    
 * 类描述：    
 * 创建人：Admin    
 * 创建时间：Nov 3, 2017 5:40:18 PM    
 * 修改人：Admin
 * 修改时间：Nov 3, 2017 5:40:18 PM    
 * 修改内容：    
 * @version 1.0   
 */
@RestController
@RequestMapping("/buss")
public class BussUnit
{
    @RequestMapping("/test")
    private String test(@RequestParam("t1") String t1) {
        System.out.println(t1);
        return "ok";
    }
}
