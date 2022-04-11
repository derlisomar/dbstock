/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Derlis
 */
public class MetodoVentanaP {
         public static Statement st;
   public static Connection con;
   
   
   public static void cant_cliente(){
       
        Conexion cc=new Conexion();
	Connection con=cc.conectar();;
        String count="select count(*) from clientes ";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(count);
            if(rs.next())
            {
                 Principal.cant_cli.setText(rs.getString("count"));
                      
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        } 
        
        
        String contado="select count(*) from venta where vta_condicion = 'CONTADO' AND vta_fecha='"+Principal.fecha_ini.getText()+"' ";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(contado);
            if(rs.next())
            {
                 Principal.cant_contado.setText(rs.getString("count"));
                      
            }else{
            Principal.cant_contado.setText("0");
        }
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        } 
        
        
        String credito="select count(*) from venta where vta_condicion = 'CREDITO' AND vta_fecha='"+Principal.fecha_ini.getText()+"' ";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(credito);
            if(rs.next())
            {
                 Principal.cant_cr.setText(rs.getString("count"));
                      
            }else{
            Principal.cant_cr.setText("0");
        }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        }
        
        
                
        String producto="select count(*) from productos ";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(producto);
            if(rs.next())
            {
                 Principal.cant_producto.setText(rs.getString("count"));
                      
            }else{
            Principal.cant_producto.setText("0");
        }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        }
        
        
        
        String compras="select count(*) from pedido where ped_fecha='"+Principal.fecha_ini.getText()+"' ";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(compras);
            if(rs.next())
            {
                 Principal.cant_compra.setText(rs.getString("count"));
                      
            }else{
            Principal.cant_compra.setText("0");
        }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        }
        
        
   }
}
