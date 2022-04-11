/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;

import static dbstock.metodos.st;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Derlis
 */
public class metodogasto {
    
         public static void CARGAR_JTABLE_gasto() {
            
		String[] titulo={"ID","Fecha","ID Suc","Caja","MontoGS","Obs","Operador"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
                //String sql="SELECT * FROM tmpdetallevta order by detvta_id desc";
		String sql="SELECT * FROM gastos order by gas_id desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("gas_id");
                                reg[1]=rs.getString("gas_fecha");
                                reg[2]=rs.getString("gas_suc");
				reg[3]=rs.getString("gas_cajades");
                                reg[4]=rs.getString("gas_montogs");
                                reg[5]=rs.getString("gas_obs");
                                reg[6]=rs.getString("gas_usuario");
				          
				mod.addRow(reg);
			}
			gastos.jtable_gasto.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		gastos.jtable_gasto.setAutoResizeMode(gastos.jtable_gasto.AUTO_RESIZE_OFF);
		gastos.jtable_gasto.doLayout();
		JTABLE_TAMANHO_gasto();
		//////////////////////////////////////////////////
	}
                        
                        
                public static void JTABLE_TAMANHO_gasto() {
		
                TableColumnModel columnModel = gastos.jtable_gasto.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(30);
                columnModel.getColumn(1).setPreferredWidth(80);
                columnModel.getColumn(2).setPreferredWidth(50);
                columnModel.getColumn(3).setPreferredWidth(100);
                columnModel.getColumn(4).setPreferredWidth(100);
                columnModel.getColumn(5).setPreferredWidth(200);
                columnModel.getColumn(6).setPreferredWidth(150);
             
    
                }
    
                
            public static void cmb_sucursal_gasto(){
      		Conexion cc=new Conexion();
		Connection con=cc.conectar();

                String prov="select * from sucursal";
                try {
                gastos.cmb_suc_gasto.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(prov);

			while(rs.next()){

                                gastos.cmb_suc_gasto.addItem(rs.getString(2));
			}
	
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
       
        }    
            
        
                public static void CARGAR_JTABLE_gasto_bus() {
            
		String[] titulo={"ID","Fecha","ID Suc","Caja","MontoGS","Obs","Operador"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
                //String sql="SELECT * FROM tmpdetallevta order by detvta_id desc";
		String sql="SELECT * FROM gastos where gas_fecha >='"+gastos.fecha_inicial.getText()+"' and gas_fecha <='"+gastos.fecha_final.getText()+"' and gas_sucdes = '"+gastos.cmb_suc_gasto.getSelectedItem()+"' order by gas_id desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("gas_id");
                                reg[1]=rs.getString("gas_fecha");
                                reg[2]=rs.getString("gas_suc");
				reg[3]=rs.getString("gas_cajades");
                                reg[4]=rs.getString("gas_montogs");
                                reg[5]=rs.getString("gas_obs");
                                reg[6]=rs.getString("gas_usuario");
				          
				mod.addRow(reg);
			}
			gastos.jtable_gasto.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		gastos.jtable_gasto.setAutoResizeMode(gastos.jtable_gasto.AUTO_RESIZE_OFF);
		gastos.jtable_gasto.doLayout();
		JTABLE_TAMANHO_gasto_bus();
		//////////////////////////////////////////////////
	}
                        
                        
                public static void JTABLE_TAMANHO_gasto_bus() {
		
                TableColumnModel columnModel = gastos.jtable_gasto.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(30);
                columnModel.getColumn(1).setPreferredWidth(80);
                columnModel.getColumn(2).setPreferredWidth(50);
                columnModel.getColumn(3).setPreferredWidth(100);
                columnModel.getColumn(4).setPreferredWidth(100);
                columnModel.getColumn(5).setPreferredWidth(200);
                columnModel.getColumn(6).setPreferredWidth(150);
             
    
                }     
           ////////////////////////////////////ingresos///////////////------------------------------------
                
                
                
                        public static void cmb_sucursal_GASTO(){
      		Conexion cc=new Conexion();
		Connection con=cc.conectar();

                String prov12="select * from sucursal";
                try {
                gastos.cmb_sucu_gasto.removeAllItems();
                //ingresos.cmb_sucu_gasto.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(prov12);

			while(rs.next()){

                            gastos.cmb_sucu_gasto.addItem(rs.getString(2));
                            //ingresos.cmb_sucu_gasto.addItem(rs.getString(2));
                                
			}
	
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
        }
            
}
