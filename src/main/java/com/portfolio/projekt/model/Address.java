package com.portfolio.projekt.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Entity
@Table(name = "ADDRESSES", schema = "ao")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String country;

    private String code;

    private String city;

    private String street;

    private String buildingNumber;

    private String flatNumber;

}
