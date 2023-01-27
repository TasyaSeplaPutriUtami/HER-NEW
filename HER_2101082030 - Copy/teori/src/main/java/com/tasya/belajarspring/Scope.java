/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tasya.belajarspring;

import com.tasya.belajarspring.data.Bar;
import com.tasya.belajarspring.data.Foo;
import com.tasya.belajarspring.scope.DoubletonScope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author user
 */
@Slf4j
@Configuration
public class Scope {
    @org.springframework.context.annotation.Bean
    @org.springframework.context.annotation.Scope("prototype")
    public Foo foo(){
        log.info("Create new Foo");
        return new Foo();
    }
    
    @org.springframework.context.annotation.Bean
    public CustomScopeConfigurer customScopeConfigurer(){
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }
    
    @org.springframework.context.annotation.Bean
    @org.springframework.context.annotation.Scope("doubleton")
    public Bar bar(){
        log.info("Create new Bar");
        return new Bar();
    }
}
