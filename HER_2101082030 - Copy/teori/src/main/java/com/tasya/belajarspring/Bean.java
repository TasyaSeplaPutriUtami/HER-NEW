/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tasya.belajarspring;

import com.tasya.belajarspring.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author user
 */
@Slf4j
@Configuration
public class Bean {
    @org.springframework.context.annotation.Bean
    public Foo foo(){
        Foo foo = new Foo();
        log.info("Create new foo");
        return foo;
    }
}
