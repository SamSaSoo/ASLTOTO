package com.ASLT.toto.view;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class BetRequest {
    BigDecimal stake;
    BigDecimal odds;
    Long matchId;
    Long memberId;
    int selectedOption;
}
