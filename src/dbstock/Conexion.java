/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Derlis Omar
 */
public class Conexion {
    
    public static Connection conn;

    public static Connection conectar() {
        try {
            String host = "";
            String base = "";
            String descripcion_host = "";
            String descripcion_db = "";
            String descripcion_pass = "";
            String pass = "";
            String leearchivo = "";
            
            int i = 0;
            // lee ip y base de datos
            BufferedReader bf = new BufferedReader(new FileReader(new File("host.txt").getAbsolutePath()));
               while ((leearchivo = bf.readLine()) != null) {
                    
                        if (i == 0) {
                            descripcion_host = leearchivo;   
                        }
                        if (i == 1) {
                            host = leearchivo;                      
                        }
                        if (i == 2) {
                            descripcion_db = leearchivo;                   
                        }
                        if (i == 3) {
                            base = leearchivo;                     
                        }
                        if (i == 4) {
                            descripcion_pass = leearchivo;                   
                        }
                        if (i == 5) {
                            pass = leearchivo;                     
                        }
                            i++;
                        }

            String databaseURL = "jdbc:postgresql://" + host + ":5432/" + base;
            Class.forName("org.postgresql.Driver");
            String user = "postgres";
            String password = pass;
            
            
            conn = DriverManager.getConnection(databaseURL, user, password);

            //JOptionPane.showMessageDialog(null, "Numero de caja" + caja);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    
    ///////////////////////////CONECTOR ANTIGUO///////////////////////////---------------------------------------
//            try {
//            String host = "";
//            String base = "";
//            String leearchivo = "";
//            int i = 0;
//            // lee ip y base de datos
//            BufferedReader bf = new BufferedReader(new FileReader(new File("host.txt").getAbsolutePath()));
//            while ((leearchivo = bf.readLine()) != null) {
//                if (i == 0) {
//                    host = leearchivo;
//                    i++;
//                }
//                if (i == 1) {
//                    base = leearchivo;
//                }
//
//            }
//
//            String databaseURL = "jdbc:postgresql://" + host + ":5432/" + base;
//            Class.forName("org.postgresql.Driver");
//            String user = "postgres";
//            String password = "admin";
//            
//            
//            conn = DriverManager.getConnection(databaseURL, user, password);
//
//            //JOptionPane.showMessageDialog(null, "Numero de caja" + caja);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return conn;
    ///////////////////////////////////////////////////////-------------------------------------
    
}
