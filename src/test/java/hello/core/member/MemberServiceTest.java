package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach // 각테스트전에 무조건 실행 되도록
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }


    @Test
    void join() {
       //given
       Member member = new Member ( 1L,"memberA",Grade.VIP);

       //when
       memberService.join(member);
       Member findMember = memberService.findMember(1L);

       //then
       //검증
        Assertions.assertThat(member).isEqualTo(findMember);

    }
}
