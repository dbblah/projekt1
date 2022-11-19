package com.portfolio.projekt.service;

import com.portfolio.projekt.model.Adres;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class AdresService {
    public Optional<Adres>pobierzAdres(String nazwa){
        Adres adres1=new Adres("dom" , "Polska" , "Kędzierzyn","47-220","Kazimierza Wielkiego" , "4" , "A/10");
        Adres adres2=new Adres("praca","Polska" , "Kędzierzyn" ,"47-220" , "Dunikowskiego" , "16" , "");
        if (nazwa.equals("dom")){
            return Optional.of(adres1);
        }if (nazwa.equals("praca")){
            return Optional.of(adres2);
        }
        return Optional.empty();
    }
}
