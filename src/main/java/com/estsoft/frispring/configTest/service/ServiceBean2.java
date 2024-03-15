package com.estsoft.frispring.configTest.service;

import com.estsoft.frispring.configTest.domain.DomainBean;
import com.estsoft.frispring.configTest.repository.RepositoryBean2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceBean2 {
    private RepositoryBean2 repositoryBean;

    @Autowired
    public ServiceBean2(RepositoryBean2 repositoryBean){
        this.repositoryBean = repositoryBean;
    }

    public void  save(DomainBean domainBean){
        repositoryBean.save(domainBean);
    }

    public List<DomainBean> findAll(){
        return repositoryBean.findAll();
    }
}
