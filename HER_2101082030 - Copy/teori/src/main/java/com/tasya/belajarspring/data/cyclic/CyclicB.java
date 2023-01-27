/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tasya.belajarspring.data.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author user
 */
public class CyclicB {
    private CyclicC cyclicC;

    public CyclicB(CyclicC cyclicC) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
