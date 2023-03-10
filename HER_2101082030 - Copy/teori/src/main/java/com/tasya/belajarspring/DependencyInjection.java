/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tasya.belajarspring;

import com.tasya.belajarspring.data.Bar;
import com.tasya.belajarspring.data.Foo;
import com.tasya.belajarspring.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 *
 * @author user
 */
@Configuration
public class DependencyInjection {
    @Primary
    @org.springframework.context.annotation.Bean
    public Foo fooFirst(){
        return new Foo();
    }
    
    @org.springframework.context.annotation.Bean
    public Foo fooSecond(){
        return new Foo();
    }
    
    @org.springframework.context.annotation.Bean
    public Bar bar(){
        return new Bar();
    }
    
    @org.springframework.context.annotation.Bean
    public FooBar fooBar(@Qualifier("fooSecond") Foo foo, Bar bar){
        return new FooBar(foo, bar);
    }
}
