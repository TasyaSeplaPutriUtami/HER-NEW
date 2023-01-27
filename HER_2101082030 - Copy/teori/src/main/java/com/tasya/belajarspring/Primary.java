/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tasya.belajarspring;

import com.tasya.belajarspring.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 *
 * @author user
 */
@Configuration
public class Primary {
    @org.springframework.context.annotation.Primary
    @org.springframework.context.annotation.Bean
    public Foo foo1(){
        return new Foo();
    }
    @org.springframework.context.annotation.Bean
    public Foo foo2(){
        return new Foo();
    }
}