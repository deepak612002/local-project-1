package com.example.demo.local;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class testController {
    @RequestMapping(method = RequestMethod.GET,value = "/helloWorld")
    public  String helloWorld()
    {
        int a=0;
        int b=1;
        int c=a+b;
        int d=a*c;

        return "Deepak";
    }

}
