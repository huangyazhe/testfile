package com.huangyazhe.src.spring;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * HI 雅哲，别忘记写注释哦，认真是一种态度
 * @author HuangYazhe
 * Date: 2018/11/1
 */
public class CustomBaseServiceFactory {
    private static final String BEAN_POSTFIX = "";
    public void getService(String className) {
        String beanName = className + BEAN_POSTFIX;
        ConfigurableApplicationContext applicationContext = (ConfigurableApplicationContext) SpringContextHolder.getApplicationContext();
        DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) applicationContext
                .getBeanFactory();
        if (!beanFactory.containsBean(beanName)) {
            BeanDefinitionBuilder bdb = BeanDefinitionBuilder
                    .rootBeanDefinition(className);
            bdb.setScope("prototype");
            beanFactory.registerBeanDefinition(beanName, bdb.getBeanDefinition());
        }
        beanFactory.getBean(beanName);
        return;
    }

    public static void main(String[] args) {
        CustomBaseServiceFactory customBaseServiceFactory = new CustomBaseServiceFactory();
        customBaseServiceFactory.getService("UserBean");
    }
}
