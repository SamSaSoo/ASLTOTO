package com.ASLT.toto.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity // DB에 저장할 객체구나
public class Member {

    @Id @GeneratedValue
    Long id;
    String name;

}
