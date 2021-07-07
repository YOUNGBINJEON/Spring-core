package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(

        //멤버 패키지 폴더에서 탐색 시작하도록 지정함
        basePackages = "hello.core.member",
        // 아래 클래스 이름으로 설정하면 현재 패키지의 클래스에서 탐색 시작
        basePackageClasses = AutoAppConfig.class,
        // basePackage 를 설정하지 않으면(디폴트) 현재 코드상 패키지 ex) package hello.core; 에서 시작

        // 앞선 예제를 살려두기 위해서 설정
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
}
