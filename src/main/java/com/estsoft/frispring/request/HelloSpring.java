package com.estsoft.frispring.request;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class HelloSpring {

    @RequestMapping(value = "/hello-spring3", method = RequestMethod.GET)
    public String helloBasic(){
        log.info("hello-spring");
        return "ok";
    }

    @GetMapping("/mapping/{userId}")
    public String mappingPath(@PathVariable("userId") String userId){
        log.info("mappingPath userid={}", userId);
        return "ok";
    }

    @GetMapping("/mapping/user/{userId}/oders/{orderId}")
    public String mappingPath(@PathVariable String userId, @PathVariable Long orderId){
        log.info("mappingPath userId={}, oderId={}", userId, orderId);
        return "ok";
    }
}
