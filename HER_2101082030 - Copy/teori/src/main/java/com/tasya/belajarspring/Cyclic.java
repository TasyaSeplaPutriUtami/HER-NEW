/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tasya.belajarspring;

import com.tasya.belajarspring.data.cyclic.CyclicA;
import com.tasya.belajarspring.data.cyclic.CyclicB;
import com.tasya.belajarspring.data.cyclic.CyclicC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author user
 */
@Configuration
public class Cyclic {
    @org.springframework.context.annotation.Bean
    public CyclicA cyclicA(CyclicB cyclicB){
        return new CyclicA(cyclicB);
    }
    @org.springframework.context.annotation.Bean
    public CyclicB cyclicB(CyclicC cyclicC){
        return new CyclicB(cyclicC);
    }
    @org.springframework.context.annotation.Bean
    public CyclicC cyclicC(CyclicA cyclicA){
        return new CyclicC(cyclicA);
    }
}
