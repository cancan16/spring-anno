package com.enjoy.cap12.processor;

import com.enjoy.cap9.bean.Moon;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

//@Component
public class JamesBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("JamesBeanDefinitionProcessor..postProcessBeanFactory(),Bean的数量" + beanFactory.getBeanDefinitionCount());
    }

    /**
     * @Date 15:09 2019/12/19
     * @Description 执行该方法，可以自定义注册别的bean
     * @Return void
     * @Param [registry]
     */
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("amesBeanDefinition.postProcessBeanDefinitionRegistry()...bean的数量" + registry.getBeanDefinitionCount());
        // 注册其他bean
        //RootBeanDefinition rbd = new RootBeanDefinition(Moon.class);
        AbstractBeanDefinition rbd = BeanDefinitionBuilder.rootBeanDefinition(Moon.class).getBeanDefinition();
        registry.registerBeanDefinition("hello", rbd);
    }

}
