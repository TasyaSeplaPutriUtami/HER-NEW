/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tasya.belajarspring;

import com.tasya.belajarspring.data.Bar;
import com.tasya.belajarspring.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

/**
 *
 * @author user
 */
@Slf4j
@Configuration
public class DependsOn {
    @Lazy
    @org.springframework.context.annotation.Bean
    @org.springframework.context.annotation.DependsOn({
        "bar"
    })
    public Foo foo(){
        log.info("Create new Foo");
        return new Foo();
    }
    @org.springframework.context.annotation.Bean
    public Bar bar(){
        log.info("Create new Bar");
        return new Bar();
    }
}