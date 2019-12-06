package com.enjoy.cap7.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Train implements InitializingBean, DisposableBean {

    public Train() {
        System.out.println("Train......constructor............");
    }

    // 当我们bean销毁时,调用此方法
    @Override
    public void destroy() throws Exception {
        System.out.println("Train......destory......");
        //logger.error
    }

    /**
     * @Date 15:17 2019/12/6
     * @Description 所有属性设置好之后, 会调这个方法, 相当于初始化方法
     * @Return void
     * @Param []
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Train.......afterPropertiesSet()...");

    }

}
