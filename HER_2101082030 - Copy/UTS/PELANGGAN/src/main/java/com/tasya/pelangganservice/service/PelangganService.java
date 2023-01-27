/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tasya.pelangganservice.service;

import com.tasya.pelangganservice.entity.Pelanggan;
import com.tasya.pelangganservice.repository.PelangganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */

@Service
public class PelangganService {
    @Autowired
   private PelangganRepository pelangganRepository;
   
   public Pelanggan savePelanggan (Pelanggan pelanggan){
       return pelangganRepository.save(pelanggan);
    }

    public Pelanggan findPelangganById(Long pelangganId){
        return pelangganRepository.findByPelangganId(pelangganId);
    }
    
}
