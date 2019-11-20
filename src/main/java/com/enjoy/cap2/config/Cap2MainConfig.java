package com.enjoy.cap2.config;

import com.enjoy.cap1.Person;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;

/**
 * @Author Liu, cancan
 * @Description FilterType.CUSTOM, �Զ���ɨ�������Щbean���뵽spring�����У�JamesTypeFilter Ϊ�Զ�����˷�ʽ
 * @Date 15:42 2019/11/20
 */
@Configuration
//@Controller  @Service  @Respostry  @Component
@ComponentScan(value = "com.enjoy.cap2", includeFilters = {
        @Filter(type = FilterType.CUSTOM, classes = {JamesTypeFilter.class})
}, useDefaultFilters = false)
public class Cap2MainConfig {
    //��������ע��һ��bean, ����Ϊ����ֵ������,
    @Bean
    public Person person01() {
        new ComponentScanBeanDefinitionParser();
        return new Person("james", 20);
    }
}
