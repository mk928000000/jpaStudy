package jpabook.jpashop;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

public class MemberRepositoryTest {

    @RunWith(SpringRunner.class) // junit에게 알려주기. Spring관련으로 테스트를 돌릴거야
    @SpringBootTest
    public class MemberRepositoryTest{

        @Autowired
        MemberRepository memberRepository; //멤버리퍼지토리 인젝슨을 받기

        //설정 ctrl alt S
        // Live Templates 에서 tdd 약어 만듬
        @Test
        public void testMember() throws Exception {
            //given
            Member member = new Member();
            member.setUsername("memberA");

            //when
            Long saveId = memberRepository.save(member); //Ctrl alt V 하면 결과값의 자료형이랑 변수명을 뽑아서 만들어놓음
            Member findMember = memberRepository.find(saveId);

            //then

        }
        
        

}