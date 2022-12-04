package com.portfolio.projekt.controller;


import com.portfolio.projekt.model.Address;

import com.portfolio.projekt.service.AddressService;

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
@RequestMapping("addresses")
public class AddresController {

    AddressService addressService;

    /**
     *
     * @return wszystkie adresy jako lista adresów
     */
    @GetMapping
    public ResponseEntity<List<Address>>getAll(){
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.I_AM_A_TEAPOT);
    }

    //todo do usuniecia
    /**
     *
     * @param nazwa
     * @return
     */
    @GetMapping("/get1")
    public ResponseEntity<Address> get(@RequestParam String nazwa){
        Optional<Address>abc= addressService.pobierzAdres(nazwa);
        if (abc.isPresent()){
            return new ResponseEntity<Address>(abc.get(), null, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
    }

}
