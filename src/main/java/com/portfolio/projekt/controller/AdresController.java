package com.portfolio.projekt.controller;


import com.portfolio.projekt.model.Adress;

import com.portfolio.projekt.service.AdressService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Klasa wystawiająca API dla adresów
 */
@RestController
@RequestMapping("adresy")
public class AdresController {

    AdressService adressService;

    /**
     *
     * @return wszystkie adresy jako lista adresów
     */
    @GetMapping
    public ResponseEntity<List<Adress>>getAll(){
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.I_AM_A_TEAPOT);
    }

    //todo do usuniecia
    /**
     *
     * @param nazwa
     * @return
     */
    @GetMapping("/get1")
    public ResponseEntity<Adress> get(@RequestParam String nazwa){
        Optional<Adress>abc= adressService.pobierzAdres(nazwa);
        if (abc.isPresent()){
            return new ResponseEntity<Adress>(abc.get(), null, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
    }

}
