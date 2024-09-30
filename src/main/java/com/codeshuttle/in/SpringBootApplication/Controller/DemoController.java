package com.codeshuttle.in.SpringBootApplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    //http://localhost:8080/demo/get
    @GetMapping("/get")
    public String getDocuments()
    {
        return  "Hello world";
    }
}
