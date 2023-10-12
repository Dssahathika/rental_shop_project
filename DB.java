/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lashanc
 */
public class DB {

    private static Connection connection;
    
    private static void init()throws SQLException,ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sad", "root", "062812");
    }
    
    public static void iud(String sql)throws Exception{
        if (connection == null) {
            init();
        }
        connection.createStatement().executeUpdate(sql);
    }

    public static ResultSet search(String sql)throws Exception{
        if (connection == null) {
            init();
        }
        return connection.createStatement().executeQuery(sql);
    }
    
    public static Connection getNewConnection()throws Exception{
        if (connection == null) {
            init();
        }
        return connection;
    }
    
    public static PreparedStatement getPreaparedStatement(String sql)throws Exception{
        if (connection == null) {
            init();
        }
        return connection.prepareStatement(sql);
    }

    
}
