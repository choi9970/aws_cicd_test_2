package com.example.cicd1216_2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/hicicd")
    public String hicicd(){
        return "hicicd 1216^^";
    }

    @GetMapping("/hicicd2")
    public String hicicd2(){
        return "hicicd 1216-2^^";
    }

    @GetMapping("/hicicd3")
    public String hicicd3(){
        return "hicicd 1216-3^^kkkk";
    }
}
