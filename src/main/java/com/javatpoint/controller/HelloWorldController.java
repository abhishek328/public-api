package com.javatpoint.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloWorldController {
    @RequestMapping("/Abhishek")
    public String abhishek (@RequestParam String s)
    {

        return s+"garg";
    }
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/covid19")
    public Object getList()
    {
        String url = "https://api.covid19india.org/data.json";
        Object object = restTemplate.getForObject(url,Object.class);
        return object;

    }
}
