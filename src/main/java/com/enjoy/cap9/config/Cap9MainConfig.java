package com.enjoy.cap9.config;

import com.enjoy.cap9.dao.TestDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.enjoy.cap9.controller", "com.enjoy.cap9.service", "com.enjoy.cap9.dao"})
public class Cap9MainConfig {
    //spring������װ���ʱ��Ĭ����ѡ��bean

    @Bean("testDao1")
    public TestDao testDao() {
        TestDao testDao = new TestDao();
        testDao.setFlag("2");
        return testDao;
    }
}
