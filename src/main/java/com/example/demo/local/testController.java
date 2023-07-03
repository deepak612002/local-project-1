package com.example.demo.local;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class testController {
    @RequestMapping(method = RequestMethod.GET,value = "/helloWorld")
    public String helloWorld()
    {
        return "Deepak";
    }


}
