package com.portfolio.projekt.repository;

import com.portfolio.projekt.model.Adress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdressRepository extends JpaRepository<Adress, Long> {

    List<Adress> findByCountry(String country);

}
