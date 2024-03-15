package com.estsoft.frispring.configTest.service;

import com.estsoft.frispring.configTest.domain.DomainBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ServiceBean2Test {

    @Autowired
    ServiceBean2 serviceBean2;

    @Test
    void save() {
        DomainBean domainBean = new DomainBean();
        domainBean.setName("ryu");
        serviceBean2.save(domainBean);
        List<DomainBean> all = serviceBean2.findAll();
        for (DomainBean bean : all){
            System.out.println("bean.getId() = " + bean.getId());
            System.out.println("bean.getName() = " + bean.getName());
        }
    }
}