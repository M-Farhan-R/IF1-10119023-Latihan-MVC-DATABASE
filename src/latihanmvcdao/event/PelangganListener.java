/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmvcdao.event;

import latihanmvcdao.entity.Pelanggan;
import latihanmvcdao.model.PelangganModel;

/**
 *
 * @author
 * Nama  : Muhammad Farhan R<farhan.10119023@mahasiswa.unikom.ac.id>
 * NIM   : 10119023
 * Kelas : IF1
 * 
 * 
 */
public interface PelangganListener {
    public void onChange(PelangganModel model);
    
    public void onInsert(Pelanggan pelanggan);
    
    public void onDelete();
    
    public void onUpdate(Pelanggan pelanggan);
    
}
