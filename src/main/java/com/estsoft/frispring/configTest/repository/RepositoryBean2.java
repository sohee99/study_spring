package com.estsoft.frispring.configTest.repository;

import com.estsoft.frispring.configTest.domain.DomainBean;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class RepositoryBean2 {
    Map<Long, DomainBean> store = new HashMap<>();

    private  long id = 0;

    public DomainBean save(DomainBean domainBean){
        domainBean.setId(++id);
        store.put(domainBean.getId(),domainBean);
        return domainBean;
    }

    public List<DomainBean> findAll(){
        return new ArrayList<>(store.values());
    }
}
