package com.javatpoint.controller.covid19;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Covid19Controller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/datacovid19")
    public Covid19 getList()
    {
        String url = "https://api.covid19india.org/data.json";
        Covid19 object = restTemplate.getForObject(url,Covid19.class);
        //System.out.println(object);
        return object;

    }

}
