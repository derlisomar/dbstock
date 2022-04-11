/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;

import static dbstock.metodoproducto.st;
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
public class metodoingreso {
    
    public static void cmb_sucursal_INGRESO(){
      		Conexion cc=new Conexion();
		Connection con=cc.conectar();

                String prov12="select * from sucursal";
                try {
               
                ingresos.cmb_sucu_gasto.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(prov12);

			while(rs.next()){

                            ingresos.cmb_sucu_gasto.addItem(rs.getString(2));
                                
			}
	
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
        }
    
    
    
        public static void cmb_sucursal_apertura(){
      		Conexion cc=new Conexion();
		Connection con=cc.conectar();

                String prov12="select * from sucursal";
                try {
               
                apertura.cmb_sucu_gasto.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(prov12);

			while(rs.next()){

                            apertura.cmb_sucu_gasto.addItem(rs.getString(2));
                                
			}
	
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
        }
    
    
                public static void cmb_sucursal_ingreso2(){
      		Conexion cc=new Conexion();
		Connection con=cc.conectar();

                String prov="select * from sucursal";
                try {
                ingresos.cmb_suc_gasto.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(prov);

			while(rs.next()){

                                ingresos.cmb_suc_gasto.addItem(rs.getString(2));
			}
	
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
       
        } 
    
    
                
                public static void CARGAR_JTABLE_ingreso() {
            
		String[] titulo={"ID","Fecha","ID Suc","Caja","MontoGS","Obs","Operador"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
                //String sql="SELECT * FROM tmpdetallevta order by detvta_id desc";
		String sql="SELECT * FROM ingreso order by ing_id desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("ing_id");
                                reg[1]=rs.getString("ing_fecha");
                                reg[2]=rs.getString("ing_sucid");
				reg[3]=rs.getString("ing_cajades");
                                reg[4]=rs.getString("ing_montogs");
                                reg[5]=rs.getString("ing_obs");
                                reg[6]=rs.getString("ing_usuario");
				          
				mod.addRow(reg);
			}
			ingresos.jtable_INGRESODETALLE.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		ingresos.jtable_INGRESODETALLE.setAutoResizeMode(ingresos.jtable_INGRESODETALLE.AUTO_RESIZE_OFF);
		ingresos.jtable_INGRESODETALLE.doLayout();
		JTABLE_TAMANHO_ingreso();
		//////////////////////////////////////////////////
	}
                        
                        
                public static void JTABLE_TAMANHO_ingreso() {
		
                TableColumnModel columnModel = ingresos.jtable_INGRESODETALLE.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(30);
                columnModel.getColumn(1).setPreferredWidth(80);
                columnModel.getColumn(2).setPreferredWidth(50);
                columnModel.getColumn(3).setPreferredWidth(100);
                columnModel.getColumn(4).setPreferredWidth(100);
                columnModel.getColumn(5).setPreferredWidth(200);
                columnModel.getColumn(6).setPreferredWidth(150);
             
    
                }

                public static void CARGAR_JTABLE_apertura() {
            
		String[] titulo={"ID","Fecha","ID Suc","Caja","MontoGS","Obs","Operador"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
                //String sql="SELECT * FROM tmpdetallevta order by detvta_id desc";
		String sql="SELECT * FROM ingreso order by ing_id desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("ing_id");
                                reg[1]=rs.getString("ing_fecha");
                                reg[2]=rs.getString("ing_sucid");
				reg[3]=rs.getString("ing_cajades");
                                reg[4]=rs.getString("ing_montogs");
                                reg[5]=rs.getString("ing_obs");
                                reg[6]=rs.getString("ing_usuario");
				          
				mod.addRow(reg);
			}
			apertura.jtable_gasto.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		apertura.jtable_gasto.setAutoResizeMode(apertura.jtable_gasto.AUTO_RESIZE_OFF);
		apertura.jtable_gasto.doLayout();
		JTABLE_TAMANHO_aper();
		//////////////////////////////////////////////////
	}
                        
                        
                public static void JTABLE_TAMANHO_aper() {
		
                TableColumnModel columnModel = apertura.jtable_gasto.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(30);
                columnModel.getColumn(1).setPreferredWidth(80);
                columnModel.getColumn(2).setPreferredWidth(50);
                columnModel.getColumn(3).setPreferredWidth(100);
                columnModel.getColumn(4).setPreferredWidth(100);
                columnModel.getColumn(5).setPreferredWidth(200);
                columnModel.getColumn(6).setPreferredWidth(150);
             
    
                }
                
                
                
            public static void ingreso(){

 		Conexion cc=new Conexion();
		Connection con=cc.conectar();;
        	try {
		String sql = "Select * from sucursal where su_descri = '"+ingresos.cmb_sucu_gasto.getSelectedItem()+"'";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                         ingresos.id_suc.setText(rs.getString("su_codigo"));
                    }
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

        }
            
                        public static void ingresoaper(){

 		Conexion cc=new Conexion();
		Connection con=cc.conectar();;
        	try {
		String sql = "Select * from sucursal where su_descri = '"+apertura.cmb_sucu_gasto.getSelectedItem()+"'";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                         apertura.id_suc.setText(rs.getString("su_codigo"));
                    }
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

        }
            
            
            public static void CARGAR_JTABLE_ingreso_bus() {
            
		String[] titulo={"ID","Fecha","ID Suc","Caja","MontoGS","Obs","Operador"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
                //String sql="SELECT * FROM tmpdetallevta order by detvta_id desc";
		String sql="SELECT * FROM ingreso where ing_fecha >='"+ingresos.fecha_inicial.getText()+"' and ing_fecha <='"+ingresos.fecha_final.getText()+"' and ing_sucdes = '"+ingresos.cmb_suc_gasto.getSelectedItem()+"' order by ing_id desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("ing_id");
                                reg[1]=rs.getString("ing_fecha");
                                reg[2]=rs.getString("ing_sucid");
				reg[3]=rs.getString("ing_cajades");
                                reg[4]=rs.getString("ing_montogs");
                                reg[5]=rs.getString("ing_obs");
                                reg[6]=rs.getString("ing_usuario");
				          
				mod.addRow(reg);
			}
			ingresos.jtable_INGRESODETALLE.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		ingresos.jtable_INGRESODETALLE.setAutoResizeMode(ingresos.jtable_INGRESODETALLE.AUTO_RESIZE_OFF);
		ingresos.jtable_INGRESODETALLE.doLayout();
		JTABLE_TAMANHO_ingreso_bus();
		//////////////////////////////////////////////////
	}
                        
                        
                public static void JTABLE_TAMANHO_ingreso_bus() {
		
                TableColumnModel columnModel = ingresos.jtable_INGRESODETALLE.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(30);
                columnModel.getColumn(1).setPreferredWidth(80);
                columnModel.getColumn(2).setPreferredWidth(50);
                columnModel.getColumn(3).setPreferredWidth(100);
                columnModel.getColumn(4).setPreferredWidth(100);
                columnModel.getColumn(5).setPreferredWidth(200);
                columnModel.getColumn(6).setPreferredWidth(150);
             
    
                }     

            
            
            
            
    
}///fin
