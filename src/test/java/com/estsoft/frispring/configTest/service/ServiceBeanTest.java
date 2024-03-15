package com.estsoft.frispring.configTest.service;

import com.estsoft.frispring.configTest.AppConfig;
import com.estsoft.frispring.configTest.domain.DomainBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

class ServiceBeanTest {

    ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
    //AppConfig 의 bean을 ApplicationContext 에 저장
    @Test
    void save() {
        DomainBean domainBean = new DomainBean();
        domainBean.setName("Ryu");
        ServiceBean serviceBean = ac.getBean("serviceBean",ServiceBean.class);
        serviceBean.save(domainBean);
        List<DomainBean> all = serviceBean.findAll();
        for(DomainBean bean : all){
            System.out.println("bean.getId() = " + bean.getId());
            System.out.println("bean.getName() = " + bean.getName());
        }
    }

    @Test
    void findAll() {
    }
}