package com.portfolio.projekt.service;

import com.portfolio.projekt.model.Adress;
import com.portfolio.projekt.repository.AdressRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdressService {

    private AdressRepository adressRepository;

    public List<Adress> getAll(){
        return adressRepository.findAll();
    }

    public List<Adress> getAllForCountry(String country){
        return adressRepository.findByCountry(country);
    }

    public Optional<Adress> getById(Long id){
        return adressRepository.findById(id);
    }





    //todo do usuniecia
    public Optional<Adress>pobierzAdres(String nazwa){
        Adress adress1 =new Adress(1l , "Polska" , "Kędzierzyn","47-220","Kazimierza Wielkiego" , "4" , "A/10");
        Adress adress2 =new Adress(2l,"Polska" , "Kędzierzyn" ,"47-220" , "Dunikowskiego" , "16" , "");
        if (nazwa.equals("dom")){
            return Optional.of(adress1);
        }if (nazwa.equals("praca")){
            return Optional.of(adress2);
        }
        return Optional.empty();
    }
}
