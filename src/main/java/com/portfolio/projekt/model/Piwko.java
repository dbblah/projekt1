package com.portfolio.projekt.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
@Getter
@Setter
@AllArgsConstructor
public class Piwko {
    String marka;
    Double alkohol;
    Double pojemnosc;
    String opakowanie;
}
