package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


//ctrl + alt + v == 변수 추출하기
public class MemberApp {
    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        //스프링은 어떻게 생성하냐면. 모든게 ApplicationContext 여기서 시작됨. ApplicationContext 여기서 모든걸 관리해줌.
        //생성할 때는 new AnnotationConfigApplicationContext(AppConfig.class);
        //이렇게하면 AppConfig 클래스에 있는 환경설정 정보를 가지고 스프링이 클래스 안에 있는 스프링 빈에다가 넣어서
        //객체 생성한거를 관리함. 그래서 찾아 올 때 기존에는 appConfig.memberService(); 이렇게 직접 찾아왔지만
        //이제는 스프링컨테이너를 통해서 찾아옴


        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new memeber = " + member.getName());
        System.out.println("find member = " + findMember.getName());
    }
}
