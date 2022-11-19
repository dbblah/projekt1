package com.portfolio.projekt.controller;


import com.portfolio.projekt.model.Adres;

import com.portfolio.projekt.service.AdresService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class testcontrolleraAdres {
    AdresService adresService;


    @GetMapping("/test")
    public String test(){
        return "HelloWorld";
    }
    @GetMapping("/adres")
    public ResponseEntity<Adres> adres(@RequestParam String nazwa){
        Optional<Adres>abc=adresService.pobierzAdres(nazwa);


        if (abc.isPresent()){
            return new ResponseEntity<Adres>(abc.get(), null, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
    }
}
