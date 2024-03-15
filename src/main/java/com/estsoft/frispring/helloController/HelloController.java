package com.estsoft.frispring.helloController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
    @GetMapping("hello-mvc")
    public String helloMvc(Model model){
        model.addAttribute("name","spring");
        return "hello-template";
    }

    //API
    @GetMapping("hello-spring")
    @ResponseBody //붙이게 되면 HTTP의 BODY에 문자내용을 직접 반환
    public String helloString(){
        return "hello";
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static  class  Hello{
        private  String name;
        public  String getName(){
            return  name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
