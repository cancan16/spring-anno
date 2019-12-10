package com.enjoy.cap10.config;

import com.enjoy.cap10.aop.Calculator;
import com.enjoy.cap10.aop.LogAspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/*
 * ��־������ķ�����Ҫ��̬��֪��div()��������,
 *  ֪ͨ����:
 *     ǰ��֪ͨ:logStart(); ������ִ��div()����֮ǰ����(@Before)
 *     ����֪ͨ:logEnd();������Ŀ�귽��div���н���֮�� ,������û���쳣(@After)
 *     ����֪ͨ:logReturn();�����ǵ�Ŀ�귽��div��������ֵ������(@AfterReturning)
 *     �쳣֪ͨ:logException();�����ǵ�Ŀ�귽��div�����쳣������(@AfterThrowing)
 *     ����֪ͨ:��̬����, ��Ҫ�ֶ�ִ��joinPoint.procced()(��ʵ����ִ�����ǵ�Ŀ�귽��div,), ִ��֮ǰdiv()�൱��ǰ��֪ͨ, ִ��֮����൱�����Ǻ���֪ͨ(@Around)
 */
@Configuration
@EnableAspectJAutoProxy
public class Cap10MainConfig {
    @Bean
    public Calculator calculator() {
        return new Calculator();
    }

    @Bean
    public LogAspects logAspects() {
        return new LogAspects();
    }
}
