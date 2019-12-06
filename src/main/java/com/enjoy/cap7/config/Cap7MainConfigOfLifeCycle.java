package com.enjoy.cap7.config;

import com.enjoy.cap7.bean.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.enjoy.cap7.bean")
@Configuration
public class Cap7MainConfigOfLifeCycle {
//    @Bean("person")
//    public Person person() {
//        System.out.println("�����������person.......");
//        return new Person("person", 20);
//    }

    /**
     * @Date 17:22 2019/12/5
     * @Description ָ����ʼ�����������ٷ���
     * @Return com.enjoy.cap7.bean.Bike
     * @Param []
     */
    @Bean(initMethod = "init", destroyMethod = "destory")
    public Bike bike() {
        return new Bike();
    }

}
