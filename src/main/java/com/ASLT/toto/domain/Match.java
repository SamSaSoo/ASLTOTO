package com.ASLT.toto.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Entity
public class Match {

    @Id @GeneratedValue
    Long id;

    String matchName;

    String firstOptionName;

    String secondOptionName;

    BigDecimal firstOptionOdds;

    BigDecimal secondOptionOdds;

}
