package com.jarvis.web.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jarvis.web.Service.WebServices;

@RestController 
@RequestMapping("/api/website")
public class OpenWebsite {
    
    @Autowired 
    private WebServices webServices;

    @PostMapping("/{websitename}")
    public  String openWebsite(@PathVariable  String websitename){
         String response=webServices.openWebsite(websitename);
         return response;
    }
    
}
