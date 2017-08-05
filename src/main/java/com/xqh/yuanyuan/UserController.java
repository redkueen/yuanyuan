package com.xqh.yuanyuan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
     static User[] userArr = {
             new User(0,"xqh", "110", "女", "重固"),

             new User(1,"cgl", "999", "男", "火星"),

             new User(2,"李四", "130*", "男", "上海"),
    };


    @RequestMapping("/get")
    public String xxxx(
            @RequestParam("id")       Integer id ,
//            @RequestParam("x") Integer x,
            ModelMap m){

        m.addAttribute("username", userArr[id].username);
        m.addAttribute("telephone", userArr[id].telephone);
        m.addAttribute("sex", userArr[id].sex);
        m.addAttribute("address", userArr[id].address);
        return "template_user";
    }

    @RequestMapping("/list")
    public String xyyy(ModelMap m){
        m.addAttribute("users", userArr);
        return "template_user_list";
    }


}
