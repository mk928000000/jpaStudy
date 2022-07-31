package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable  //어딘가에 내자타입이 될 수 있다
@Getter @Setter
public class Address {

    private String city;
    private String street;
    private String zipcode;
}
