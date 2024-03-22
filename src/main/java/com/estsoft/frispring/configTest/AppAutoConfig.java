package com.estsoft.frispring.configTest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION, classes = Configuration.class
        ) 
        //제외 할것들 지정 configuration 붙은것들을 제외하겠다는 의미
)
public class AppAutoConfig {

}
