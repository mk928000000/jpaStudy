package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Delivery {

    @Id @GeneratedValue
    @Column(name ="delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    @Embedded
    private Address address;

    //enum 타입은 반드시 요 어노테이션이 들어가야됨.
    //ordinal은 숫자를 의미. 절대쓰면안됨. 아니면 중간에 다른게 들어가면 오류가 발생함.
    @Enumerated(EnumType.STRING)
    private DeliveryStatus status; //DELIVERY, COMP
}
