package com.enjoy.cap2.config;

import com.enjoy.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @Author Liu, cancan
 * @Description FilterType.CUSTOM, 自定义扫描过滤哪些bean输入到spring容器中，JamesTypeFilter 为自定义过滤方式
 * @Date 15:42 2019/11/20
 */
@Configuration
//@Controller  @Service  @Respostry  @Component
@ComponentScan(value = "com.enjoy.cap2", includeFilters = {
        @Filter(type = FilterType.CUSTOM, classes = {JamesTypeFilter.class})
}, useDefaultFilters = false)
public class Cap2MainConfig {
    //给容器中注册一个bean, 类型为返回值的类型,
    @Bean
    public Person person01() {
        return new Person("james", 20);
    }
}
