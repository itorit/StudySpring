package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * ComponentScan 안에 추가로 들어갈수 있는 것들...
 * basePackages = "hello.core"
 * basePackageClasses = AutoAppConfig.class
 * basePackages가 없으면 default로 ComponentScan이 붙은 해당 클레스의 패키지 하위부터
 * 여기서 예를 들면 package hello.core 이니깐...
 * hello.core 아래를 전부 뒤진다.
 */
@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
}
