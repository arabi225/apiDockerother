package com.example.api.Api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class cat {

    @RequestMapping("/cat")
    public String page(){
        return "page sqdgfsdgdsgqds";
    }
}