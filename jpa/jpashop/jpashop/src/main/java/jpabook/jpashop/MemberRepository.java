package jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//DAO 같은것
@Repository
public class MemberRepository {

    //스프링부트가 요 어노테이션이 있으면 application.yml을 읽어서 설정하고 EntityManager를 주입해준다
    @PersistenceContext
    private EntityManager em;

    //쿼맨드랑 쿼리를 분리하기위해 id 정도만 조회하게 설계. 김영한 서타일
    //ctrl shft T   Test만들기 단축키
    public Long save(Member member) {
        em.persist(member);
        return member.getId();
    }

    public Member find (Long id){
        return em.find(Member.class,id);
    }
}
