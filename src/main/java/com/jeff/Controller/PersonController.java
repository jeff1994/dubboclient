package com.jeff.Controller;

import com.jeff.Service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;

/**
 * Created by zyc on 2017/8/10 0010.
 */
@RestController
public class PersonController {
    private  PersonService personService;
    @RequestMapping("/getperson")
    public String returnPersonName(){
        return personService.returnPersonName();
       // return "这个男人的名字叫盖世英雄！";
    }
}
