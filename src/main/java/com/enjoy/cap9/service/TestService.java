package com.enjoy.cap9.service;

import com.enjoy.cap9.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TestService {
    //@Qualifier("testDao")
    //@Autowired(required=false)
    //Ч����һ����,��Autowiredһ������װ��bean
    //1,��֧��Primary����
    //2,��֧��Autowired false
//    @Resource(name = "testDao")
//    @Qualifier("testDao")
    @Autowired
    private TestDao testDao2;

    public void println() {
        System.out.println(testDao2);
    }
}
