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
//        System.out.println("给容器中添加person.......");
//        return new Person("person", 20);
//    }

    /**
     * @Date 17:22 2019/12/5
     * @Description 指定初始化方法和销毁方法
     * @Return com.enjoy.cap7.bean.Bike
     * @Param []
     */
    @Bean(initMethod = "init", destroyMethod = "destory")
    public Bike bike() {
        return new Bike();
    }

}
