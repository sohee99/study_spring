package com.estsoft.frispring.configTest.service;

import com.estsoft.frispring.configTest.domain.DomainBean;
import com.estsoft.frispring.configTest.repository.RepositoryBean;

import java.util.List;

public class ServiceBean {
    private RepositoryBean repositoryBean;
    public  ServiceBean(RepositoryBean repositoryBean){
        this.repositoryBean = repositoryBean;
    }

    public void  save(DomainBean domainBean){
        repositoryBean.save(domainBean);
    }

    public List<DomainBean> findAll(){
        return repositoryBean.findAll();
    }
}
