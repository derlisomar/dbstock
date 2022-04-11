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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Derlis
 */
public class met_pedrealizados {
    
    public static Statement st;
    public static Connection con;
    
                public static void CARGAR_JTABLE_pedido() {
            
		String[] titulo={"id Ped.","Proveedor","Fecha","Monto","Estado","Realizó Pedido"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql="SELECT * FROM pedido where ped_fecha>='"+PedRealizados.fecha_ini.getText()+"' and ped_fecha<='"+PedRealizados.fecha_fin.getText()+"' and ped_condicion = 'CONTADO' and ped_anulada = 1 order by ped_num desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("ped_num_lg");
                                reg[1]=rs.getString("ped_provee");
				reg[2]=rs.getString("ped_fecha");
                                reg[3]=rs.getString("ped_monto");
                                reg[4]=rs.getString("ped_estado");
                                reg[5]=rs.getString("ped_usuario");
				          
				mod.addRow(reg);
			}
			PedRealizados.jTable_pedidorea.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		PedRealizados.jTable_pedidorea.setAutoResizeMode(PedRealizados.jTable_pedidorea.AUTO_RESIZE_OFF);
		PedRealizados.jTable_pedidorea.doLayout();
		JTABLE_TAMANHO_pedido2();
		//////////////////////////////////////////////////
	}
                        
                        
                public static void JTABLE_TAMANHO_pedido2() {
		
                TableColumnModel columnModel = PedRealizados.jTable_pedidorea.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(80);
                columnModel.getColumn(1).setPreferredWidth(230);
                columnModel.getColumn(2).setPreferredWidth(100);
                columnModel.getColumn(3).setPreferredWidth(100);
                columnModel.getColumn(4).setPreferredWidth(80);
                columnModel.getColumn(5).setPreferredWidth(180);
    
                }
                
                
                public static void CARGAR_JTABLE_pedido2() {
            
		String[] titulo={"id Ped.","Proveedor","Fecha","Monto","Condición","Estado","Sucursal"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql="SELECT * FROM pedido where ped_fecha>='"+pedido_entregado.fecha_ini.getText()+"' and ped_fecha<='"+pedido_entregado.fecha_fin.getText()+"' and ped_condicion = 'CONTADO' order by ped_num asc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("ped_num_lg");
                                reg[1]=rs.getString("ped_provee");
				reg[2]=rs.getString("ped_fecha");
                                reg[3]=rs.getString("ped_monto");
                                reg[4]=rs.getString("ped_condicion");
                                reg[5]=rs.getString("ped_estado");
                                reg[6]=rs.getString("ped_suc");
				          
				mod.addRow(reg);
			}
			pedido_entregado.jTable_pedidoentregado.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		pedido_entregado.jTable_pedidoentregado.setAutoResizeMode(pedido_entregado.jTable_pedidoentregado.AUTO_RESIZE_OFF);
		pedido_entregado.jTable_pedidoentregado.doLayout();
		JTABLE_TAMANHO_pedido3();
		//////////////////////////////////////////////////
	}
                
                
                public static void JTABLE_TAMANHO_pedido3() {
		
                TableColumnModel columnModel = pedido_entregado.jTable_pedidoentregado.getColumnModel();

                        columnModel.getColumn(0).setPreferredWidth(70);
                        columnModel.getColumn(1).setPreferredWidth(250);
                        columnModel.getColumn(2).setPreferredWidth(100);
                        columnModel.getColumn(3).setPreferredWidth(100);
                        //columnModel.getColumn(4).setPreferredWidth(170);
    
                }
                          
                public static void CARGAR_JTABLE_pedido_credito() {
            
		String[] titulo={"id Ped.","Proveedor","Fecha","Monto","Estado","Realizó Pedido"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql="SELECT * FROM pedido where ped_fecha>='"+PedRealizados.fecha_ini.getText()+"' and ped_fecha<='"+PedRealizados.fecha_fin.getText()+"' and ped_condicion = 'CREDITO' and ped_anulada = 1 order by ped_num desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("ped_num_lg");
                                reg[1]=rs.getString("ped_provee");
				reg[2]=rs.getString("ped_fecha");
                                reg[3]=rs.getString("ped_monto");
                                reg[4]=rs.getString("ped_estado");
                                reg[5]=rs.getString("ped_usuario");
				          
				mod.addRow(reg);
			}
			PedRealizados.jTable_pedidorea.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		PedRealizados.jTable_pedidorea.setAutoResizeMode(PedRealizados.jTable_pedidorea.AUTO_RESIZE_OFF);
		PedRealizados.jTable_pedidorea.doLayout();
		JTABLE_TAMANHO_pedido2();
		//////////////////////////////////////////////////
	}
                
                public static void CARGAR_JTABLE_pedido_todos() {
            
		String[] titulo={"id Ped.","Proveedor","Fecha","Monto","Estado","Realizó Pedido"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql="SELECT * FROM pedido where ped_fecha>='"+PedRealizados.fecha_ini.getText()+"' and ped_fecha<='"+PedRealizados.fecha_fin.getText()+"'  and ped_anulada = 1 order by ped_num desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("pedido_id");
                                reg[1]=rs.getString("ped_provee");
				reg[2]=rs.getString("ped_fecha");
                                reg[3]=rs.getString("ped_monto");
                                reg[4]=rs.getString("ped_estado");
                                reg[5]=rs.getString("ped_usuario");
				          
				mod.addRow(reg);
			}
			PedRealizados.jTable_pedidorea.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		PedRealizados.jTable_pedidorea.setAutoResizeMode(PedRealizados.jTable_pedidorea.AUTO_RESIZE_OFF);
		PedRealizados.jTable_pedidorea.doLayout();
		JTABLE_TAMANHO_pedido2();
		//////////////////////////////////////////////////
	}       
                
                
}
