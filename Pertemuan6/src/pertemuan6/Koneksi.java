/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan6;

import java.sql.*;
/**
 *
 * @author Alif
 */
public class Koneksi {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/PBOKe4";
    static final String USER = "postgres";
    static final String PASS = "090406";
    
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi ke PostgreSQL berhasil!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return conn;
    }
}
