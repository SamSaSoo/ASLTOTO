package com.ASLT.toto.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Entity // DB에 저장할 객체구나
public class Member {

    @Id @GeneratedValue
    Long id;
    String name;
    BigDecimal balance = BigDecimal.valueOf(1000);

    public void subtractBalance(BigDecimal amount) {
        this.balance = balance.subtract(amount);
    }
}
