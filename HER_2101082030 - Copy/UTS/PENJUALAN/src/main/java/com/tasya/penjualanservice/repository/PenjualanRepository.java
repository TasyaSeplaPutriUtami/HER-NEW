/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tasya.penjualanservice.repository;


import com.tasya.penjualanservice.entity.Penjualan;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author user
 */
public interface PenjualanRepository extends JpaRepository<Penjualan, Long> {

    public Penjualan findByPenjualanId(Long penjualanId);
    
}
