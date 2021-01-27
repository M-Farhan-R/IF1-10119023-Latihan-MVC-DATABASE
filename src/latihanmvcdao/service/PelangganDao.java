/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmvcdao.service;

import java.util.List;
import latihanmvcdao.entity.Pelanggan;
import latihanmvcdao.error.PelangganException;

/**
 *
 * @author
 * Nama  : Muhammad Farhan R<farhan.10119023@mahasiswa.unikom.ac.id>
 * NIM   : 10119023
 * Kelas : IF1
 * 
 * 
 */
public interface PelangganDao {
    
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void deletePelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(String email) throws PelangganException;
    
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
    
}
