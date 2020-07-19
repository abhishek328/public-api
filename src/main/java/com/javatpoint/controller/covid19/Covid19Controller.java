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
        String url = "https://run.mocky.io/v3/74f3dc86-3d2f-4dec-811a-3d68ef7d5679";
        Covid19 object = restTemplate.getForObject(url,Covid19.class);
        //System.out.println(object);
        return object;

    }

}
