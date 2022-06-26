package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello (Model model){
        model.addAttribute("data","hello!!!");
        return "hello";
        // .html 이 자동으로 붙는다 (관례상).
        // Spring boot 의 타임리프가 설정을 걸어서 매핑해줌.
    }
}
