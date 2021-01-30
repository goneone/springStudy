package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)  //스프링빈에 자동 등록 할 것 중에 뺄 거 정해주기
        //AppConfig 빼겠다는 소리
)
public class AutoAppConfig {
}
