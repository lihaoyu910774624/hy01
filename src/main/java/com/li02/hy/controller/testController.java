package com.li02.hy.controller;

/*
 *@Author: lihaoyu
 *@Date:2019/3/8,13:56
 *@Description:
 *@Modified:
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class testController {
    @RequestMapping("tt")
    public String t1(){

     return "hellow";
    }

}
