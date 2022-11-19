package com.portfolio.projekt.service;

import com.portfolio.projekt.model.Piwko;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PiwkoService {
    public Optional<Piwko>pobierzPiwko(String nazwa){
        Piwko piwko1=new Piwko("Tyskie", 4.5 , 1.0,"pucha");
        Piwko piwko2=new Piwko("Lech", 4.7 , 1.0,"pucha");
        if (nazwa.equals("Tyskie")){
            return Optional.of(piwko1);
        }if (nazwa.equals("Lech")){
            return Optional.of(piwko2);
        }
        return Optional.empty();
    }
}
