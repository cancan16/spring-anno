package com.enjoy.cap12.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
public class JamesBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("JamesBeanFactoryPostProcessor.....������BeanFactoryPostProcessor.postProcessBeanFactory()");
        //����bean�Ķ��壬�Ѿ����ص�beanFactory, ����beanʵ����û����
        int count = beanFactory.getBeanDefinitionCount();
        String[] beanDefName = beanFactory.getBeanDefinitionNames();
        System.out.println("��ǰBeanFactory����" + count + "��Bean");
        System.out.println(Arrays.asList(beanDefName));

    }

}
