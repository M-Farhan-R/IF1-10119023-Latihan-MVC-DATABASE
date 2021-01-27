/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmvcdao.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import latihanmvcdao.implement.PelangganDaoImp;
import latihanmvcdao.service.PelangganDao;

/**
 *
 * @author
 * Nama : Muhammad Farhan R<farhan.10119023@mahasiswa.unikom.ac.id>
 * NIM  : 10119023
 * Kelas : IF1
 * 
 * 
 */
public class KingsBarbershopDatabase {
    
    private static Connection connection;
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws SQLException{
        if (connection==null) {
            MysqlDataSource datasource = new MysqlDataSource();
            datasource.setURL("jdbc:mysql://localhost:3306/kingsbarbershop");
            datasource.setUser("root");
            datasource.setPassword("");
            connection = datasource.getConnection();
        }
        
        return connection;            
    }
    
    public static PelangganDao getPelangganDao() throws SQLException{
        
        if(pelangganDao==null){
            pelangganDao = new PelangganDaoImp(getConnection());
        }
        return pelangganDao;
    }
    
}
