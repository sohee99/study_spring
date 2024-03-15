package com.estsoft.frispring.configTest;

import com.estsoft.frispring.configTest.repository.RepositoryBean;
import com.estsoft.frispring.configTest.service.ServiceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig{
    @Bean
    public ServiceBean serviceBean(RepositoryBean repositoryBean){
        return  new ServiceBean(repositoryBean);
    }

    @Bean
    public RepositoryBean repositoryBean(){
    return new RepositoryBean();
    }
}
