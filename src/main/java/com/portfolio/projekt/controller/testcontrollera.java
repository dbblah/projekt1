package com.portfolio.projekt.controller;

import com.portfolio.projekt.model.Piwko;
import com.portfolio.projekt.service.PiwkoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class testcontrollera {
    PiwkoService piwkoService;


    @GetMapping("/test")
    public String test(){
        return "HelloWorld";
    }
    @GetMapping("/piwko")
    public ResponseEntity<Piwko> piwko(@RequestParam String nazwa){
        Optional<Piwko>abc=piwkoService.pobierzPiwko(nazwa);


       if (abc.isPresent()){
           return new ResponseEntity<Piwko>(abc.get(), null, HttpStatus.OK);
       }
    return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
    }
}
