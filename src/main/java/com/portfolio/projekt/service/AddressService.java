package com.portfolio.projekt.service;

import com.portfolio.projekt.model.Address;
import com.portfolio.projekt.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    private AddressRepository addressRepository;

    public List<Address> getAll(){
        return addressRepository.findAll();
    }

    public List<Address> getAllForCountry(String country){
        return addressRepository.findByCountry(country);
    }

    public Optional<Address> getById(Long id){
        return addressRepository.findById(id);
    }





    //todo do usuniecia
    public Optional<Address>pobierzAdres(String nazwa){
        Address address1 =new Address(1l , "Polska" , "Kędzierzyn","47-220","Kazimierza Wielkiego" , "4" , "A/10");
        Address address2 =new Address(2l,"Polska" , "Kędzierzyn" ,"47-220" , "Dunikowskiego" , "16" , "");
        if (nazwa.equals("dom")){
            return Optional.of(address1);
        }if (nazwa.equals("praca")){
            return Optional.of(address2);
        }
        return Optional.empty();
    }
}
