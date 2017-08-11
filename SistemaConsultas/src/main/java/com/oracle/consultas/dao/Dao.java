package com.oracle.consultas.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dao {
    
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    public void conectar() {
        String url = "jdbc:derby://localhost:1527/";
        String dbName = "Consultas";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        String userName = "root";
        String password = "root";
        
        try {
            Class.forName(driver).newInstance();
            connection = DriverManager.getConnection(url+dbName, userName, password);
            System.out.println("Conexion exitosa");
            
        } catch (Exception e) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
    
    public void cerrarConexion() {
            try {
                if(this.connection != null && !this.connection.isClosed()){
                   this.connection.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
