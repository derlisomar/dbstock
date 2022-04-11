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
import static dbstock.vtacredito.ida;
import java.awt.Image;
import static java.lang.Integer.parseInt;
import java.text.DecimalFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;


/**
 *
 * @author Derlis
 */
public class metodoproducto {
   public static Statement st;
   public static Connection con;
   
   DefaultTableCellRenderer cellrender = new DefaultTableCellRenderer();
    
        public static void cmb_proveedor(){
      		Conexion cc=new Conexion();
		Connection con=cc.conectar();

                String prov="select * from proveedores";
                try {
                //productos.cmb_prov1.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(prov);

			while(rs.next()){

                               productos.cmb_prov1.addItem(rs.getString(2));
			}

	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
        
        }
               
               
               ////////////////////////////////
                public static void cmb_proveedor2(){
      		Conexion cc=new Conexion();
		Connection con=cc.conectar();;

                String vtagsus="select * from proveedores";
                try {
                productos.jcheck_provee.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(vtagsus);
        
		try {
			while(rs.next()){

                               productos.jcheck_provee.addItem(rs.getString(2));
                               //productos.cmb_prov.addItem(rs.getString(2));
			}
			
		} catch (Exception e1) {
			// TODO: handle exception
		}
		rs.close();
		st.close();
		con.close();
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
        
        }
               ///////////////////////////////
                
                ////////////////////////////////////////////////////////
                             ////////////////////////////////
                public static void cmb_sucu(){
      		Conexion cc=new Conexion();
		Connection con=cc.conectar();;

                String vtagsus="select * from sucursal";
                try {
                productos.cmb_prov1.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(vtagsus);
        
		try {
			while(rs.next()){

                               productos.jcheck_sucu.addItem(rs.getString(2));
			}
			
		} catch (Exception e1) {
			// TODO: handle exception
		}
		rs.close();
		st.close();
		con.close();
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
        
        }
               ///////////////////////////////
                ////////////////////////////////////////////////////////
               
               ////----------------------------------------------------------------------
                public static void cmb_proveedor_pedido(){
      		Conexion cc=new Conexion();
		Connection con=cc.conectar();;

                String vtagsus="select * from proveedores";
                try {
                pedidos.cmb_pedidos_pro.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(vtagsus);
        
		try {
			while(rs.next()){

                               pedidos.cmb_pedidos_pro.addItem(rs.getString(2));
			}
			
		} catch (Exception e1) {
			// TODO: handle exception
		}
		rs.close();
		st.close();
		con.close();
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
        
        }
               ////----------------------------------------------------------------------
               
                public static void cmb_grupo(){
      		Conexion cc=new Conexion();
		Connection con=cc.conectar();;

                String vtagsus="select * from grupopro";
                try {
                productos.cmb_grupo.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(vtagsus);
        
		try {
			while(rs.next()){

                               productos.cmb_grupo.addItem(rs.getString(2));
			}
			
		} catch (Exception e1) {
			// TODO: handle exception
		}
		rs.close();
		st.close();
		con.close();
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
        
    }
               
                public static void CARGAR_JTABLE_productos() {
            
		String[] titulo={"Codigo","Descripción","Prec. Vta","Stock","Porcentaje %","Proveedor"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[8];
		String sql="SELECT * FROM productos order by pro_id desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
                        
           
                        
			while(rs.next()){
                            
                            DecimalFormat formatea = new DecimalFormat("###,###,###.##");
				reg[0]=rs.getString("pro_id");
                                reg[1]=rs.getString("pro_desc");
                                
                                reg[2]=formatea.format(rs.getInt("pro_precioventa"));
				//reg[2]=rs.getString("pro_precioventa");
                                reg[3]=rs.getString("pro_stock");
                                reg[4]=rs.getString("pro_ganancia");
                                reg[5]=rs.getString("pro_proveedor");
				          
				mod.addRow(reg);
			}
			productos.jTable_productos.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		productos.jTable_productos.setAutoResizeMode(productos.jTable_productos.AUTO_RESIZE_OFF);
		productos.jTable_productos.doLayout();
		JTABLE_TAMANHO4();
		//////////////////////////////////////////////////
	}
   
        public static void JTABLE_TAMANHO4() {
		
                TableColumnModel columnModel = productos.jTable_productos.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(70);
                columnModel.getColumn(1).setPreferredWidth(300);
                columnModel.getColumn(2).setPreferredWidth(100);
                columnModel.getColumn(3).setPreferredWidth(80);
                columnModel.getColumn(4).setPreferredWidth(100);
                columnModel.getColumn(5).setPreferredWidth(150); 
	}
                
                public static void CARGAR_JTABLE_productos_vtacredito() {
            
		String[] titulo={"Código","Descripción","Prec. Vta","Stock Mínimo","Stock"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql="SELECT * FROM productos order by pro_id desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
                            
                            //
				reg[0]=rs.getString("pro_id");
                                reg[1]=rs.getString("pro_desc");
                               // reg[2]=formatea.format(rs.getInt("pro_precioventa"));
				reg[2]=rs.getString("pro_precioventa");
                                reg[3]=rs.getString("pro_stockmin");
                                reg[4]=rs.getString("pro_stock");
				          
				mod.addRow(reg);
			}
			vtacredito.jTable_productos.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		vtacredito.jTable_productos.setAutoResizeMode(vtacredito.jTable_productos.AUTO_RESIZE_OFF);
		vtacredito.jTable_productos.doLayout();
		JTABLE_TAMANHO_vtacredto();
		//////////////////////////////////////////////////
	}
                
                public static void JTABLE_TAMANHO_vtacredto() {
		
                TableColumnModel columnModel = vtacredito.jTable_productos.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(70);
                columnModel.getColumn(1).setPreferredWidth(320);
                columnModel.getColumn(2).setPreferredWidth(110);
                columnModel.getColumn(3).setPreferredWidth(100);
                columnModel.getColumn(4).setPreferredWidth(100);
       
            	}
                
            public static void buscarproducto(){
		String sql="SELECT * FROM productos WHERE pro_desc  LIKE '%"+productos.pro_bus2.getText()+"%' ORDER BY pro_id";
		//System.out.println(sql);
		String[] titulo={"Codigo","Descripción","Prec. Vta","Stock","Porcentaje %","Proveedor"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("pro_id");
                                reg[1]=rs.getString("pro_desc");
				reg[2]=rs.getString("pro_precioventa");
                                reg[3]=rs.getString("pro_stock");
                                reg[4]=rs.getString("pro_ganancia");
                                reg[5]=rs.getString("pro_proveedor");
				mod.addRow(reg);
			}
			productos.jTable_productos.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "error " + e);
		}
		//forma de quetenga la barra orizontal////////////
		productos.jTable_productos.setAutoResizeMode(productos.jTable_productos.AUTO_RESIZE_OFF);
		productos.jTable_productos.doLayout();
		//JTABLE_TAMANHO_buscar();
		//////////////////////////////////////////////////
                
                TableColumnModel columnModel2 = productos.jTable_productos.getColumnModel();

                columnModel2.getColumn(0).setPreferredWidth(70);
                columnModel2.getColumn(1).setPreferredWidth(300);
                columnModel2.getColumn(2).setPreferredWidth(100);
                columnModel2.getColumn(3).setPreferredWidth(80);
                columnModel2.getColumn(4).setPreferredWidth(100);
                columnModel2.getColumn(5).setPreferredWidth(150); 
                
	}
            
 
            
        public static void vaciar_produc(){
                productos.pro_desc.setText("");
                //productos.cmb_grupo.setSelectedItem("");
                productos.pro_compra.setText("");
                productos.pro_venta.setText("");
                productos.pro_mayorista.setText("");
                productos.pro_stock.setText("");
                productos.pro_minimo.setText("");
               // productos.pro_vencimineto.setText("");
                productos.pro_ganancia.setText("");
               // productos.pro_proveedor.setText("");
                productos.pro_obs.setText("");
                productos.pro_lector.setText("");
            
        }
        
        
                public static void CARGAR_JTABLE_prod_pedido() {
            
		String[] titulo={"Codigo","Descripción","Prec. Cpa","Stock"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql="SELECT * FROM productos order by pro_id desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("pro_id");
                                reg[1]=rs.getString("pro_desc");
				reg[2]=rs.getString("pro_preciocompra");
                                //reg[3]=rs.getString("pro_preciomayorista");
                                reg[3]=rs.getString("pro_stock");
				          
				mod.addRow(reg);
			}
			pedidos.jTable_productos_pedido.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		pedidos.jTable_productos_pedido.setAutoResizeMode(pedidos.jTable_productos_pedido.AUTO_RESIZE_OFF);
		pedidos.jTable_productos_pedido.doLayout();
		JTABLE_TAMANHO_pedido();
		//////////////////////////////////////////////////
	}
                        
                        
                public static void JTABLE_TAMANHO_pedido() {
		
                TableColumnModel columnModel = pedidos.jTable_productos_pedido.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(60);
                columnModel.getColumn(1).setPreferredWidth(300);
                columnModel.getColumn(2).setPreferredWidth(150);
                columnModel.getColumn(3).setPreferredWidth(100);
                //columnModel.getColumn(4).setPreferredWidth(100);
    
                }
                
                
                ///--------------------------------------------------------------------------------------------------------------------------
                
                public static void CARGAR_JTABLE_pedido() {
            
		String[] titulo={"Id","Código","Descripción","Cantidad","Total"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		//String sql="SELECT * FROM tmpedido where pedido_suc = '"+Principal.sucursal_id+"' order by pedido_cod desc";
                String sql="SELECT * FROM tmpedido where pedido_suc = '"+Principal.sucursal_id.getText()+"'";

		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("pedido_cod");
                                reg[1]=rs.getString("pedido_cod_prod");
                                reg[2]=rs.getString("pedido_desc");
				reg[3]=rs.getString("pedido_cant");
                                reg[4]=rs.getString("pedido_total");
				          
				mod.addRow(reg);
			}
			pedidos.jTable_pedido.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		pedidos.jTable_pedido.setAutoResizeMode(pedidos.jTable_pedido.AUTO_RESIZE_OFF);
		pedidos.jTable_pedido.doLayout();
		JTABLE_TAMANHO_pedido2();
		//////////////////////////////////////////////////
	}
                        
                        
                public static void JTABLE_TAMANHO_pedido2() {
		
                TableColumnModel columnModel = pedidos.jTable_pedido.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(50);
                columnModel.getColumn(1).setPreferredWidth(100);
                columnModel.getColumn(2).setPreferredWidth(270);
                columnModel.getColumn(3).setPreferredWidth(70);
                columnModel.getColumn(4).setPreferredWidth(113);
    
                }
        
                public static void buscarproducto_pedido(){
		String sql="SELECT * FROM productos WHERE pro_desc  LIKE '%"+pedidos.bus_producto1.getText()+"%' ORDER BY pro_id";
		//System.out.println(sql);
		String[] titulo={"Codigo","Descripción","Prec. Cpa","Stock"};;
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("pro_id");
                                reg[1]=rs.getString("pro_desc");
				reg[2]=rs.getString("pro_preciocompra");
                                reg[3]=rs.getString("pro_stock");
				mod.addRow(reg);
			}
			pedidos.jTable_productos_pedido.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "error " + e);
		}
		//forma de quetenga la barra orizontal////////////
		pedidos.jTable_productos_pedido.setAutoResizeMode(pedidos.jTable_productos_pedido.AUTO_RESIZE_OFF);
		pedidos.jTable_productos_pedido.doLayout();
		JTABLE_TAMANHO_pedido();
		//////////////////////////////////////////////////
	}
                
                
            public static void CARGAR_JTABLE_productos_2() {
               
                
		String[] titulo={"Codigo","Descripción","Prec. Vta","Stock","Porcentaje %","Proveedor"};
               
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql="SELECT * FROM productos order by pro_id desc";
                
                                    
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
                           
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
                            
                             DecimalFormat formatea = new DecimalFormat("###,###,###.##");
				reg[0]=rs.getString("pro_id");
                                reg[1]=rs.getString("pro_desc");
                                reg[2]=formatea.format(rs.getInt("pro_precioventa"));
				//reg[2]=rs.getString("pro_precioventa");
                                reg[3]=rs.getInt("pro_stock");
                                reg[4]=rs.getString("pro_ganancia");
                                reg[5]=rs.getString("pro_proveedor");
                                
                                

				          
				mod.addRow(reg);
			}
			productos.jtable_producto2.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		productos.jtable_producto2.setAutoResizeMode(productos.jtable_producto2.AUTO_RESIZE_OFF);
		productos.jtable_producto2.doLayout();
		JTABLE_TAMANHO_2();
		//////////////////////////////////////////////////
	}
   
        public static void JTABLE_TAMANHO_2() {
		
                TableColumnModel columnModel = productos.jtable_producto2.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(70);
                columnModel.getColumn(1).setPreferredWidth(300);
                columnModel.getColumn(2).setPreferredWidth(100);
                columnModel.getColumn(3).setPreferredWidth(80);
                columnModel.getColumn(4).setPreferredWidth(100);
                columnModel.getColumn(5).setPreferredWidth(150);      
	}
                
        ///////////////////////////////////////////////////sin stock
          public static void CARGAR_JTABLE_productos_sinstock() {
            
		String[] titulo={"Codigo","Descripción","Prec. Vta","Stock","Porcentaje %","Proveedor"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql="SELECT * FROM productos where pro_stock <= 0 order by pro_id desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("pro_id");
                                reg[1]=rs.getString("pro_desc");
				reg[2]=rs.getString("pro_precioventa");
                                reg[3]=rs.getInt("pro_stock");
                                reg[4]=rs.getString("pro_ganancia");
                                reg[5]=rs.getString("pro_proveedor");
				          
				mod.addRow(reg);
			}
			productos.jtable_producto2.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		productos.jtable_producto2.setAutoResizeMode(productos.jtable_producto2.AUTO_RESIZE_OFF);
		productos.jtable_producto2.doLayout();
		JTABLE_TAMANHO_sinstock();
		//////////////////////////////////////////////////
	}
   
        public static void JTABLE_TAMANHO_sinstock() {
		
                TableColumnModel columnModel = productos.jtable_producto2.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(70);
                columnModel.getColumn(1).setPreferredWidth(300);
                columnModel.getColumn(2).setPreferredWidth(100);
                columnModel.getColumn(3).setPreferredWidth(80);
                columnModel.getColumn(4).setPreferredWidth(100);
                columnModel.getColumn(5).setPreferredWidth(150);     
	}
        ///////////////////////////////////////////////////////////
        
        
        
        
        ////------------------------------------------------------------------------------------------------------------
        
                ///////////////////////////////////////////////////sin stock
          public static void CARGAR_JTABLE_productos_constock() {
            
		String[] titulo={"Codigo","Descripción","Prec. Vta","Stock","Porcentaje %","Proveedor"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql="SELECT * FROM productos where pro_stock >= 1 order by pro_id desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("pro_id");
                                reg[1]=rs.getString("pro_desc");
				reg[2]=rs.getString("pro_precioventa");
                                reg[3]=rs.getInt("pro_stock");
                                reg[4]=rs.getString("pro_ganancia");
                                reg[5]=rs.getString("pro_proveedor");
                                
				          
				mod.addRow(reg);
			}
			productos.jtable_producto2.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		productos.jtable_producto2.setAutoResizeMode(productos.jtable_producto2.AUTO_RESIZE_OFF);
		productos.jtable_producto2.doLayout();
		JTABLE_TAMANHO_sinstock();
		//////////////////////////////////////////////////
	}
   
        public static void JTABLE_TAMANHO_constock() {
		
                TableColumnModel columnModel = productos.jtable_producto2.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(70);
                columnModel.getColumn(1).setPreferredWidth(300);
                columnModel.getColumn(2).setPreferredWidth(100);
                columnModel.getColumn(3).setPreferredWidth(80);
                columnModel.getColumn(4).setPreferredWidth(100);
                columnModel.getColumn(5).setPreferredWidth(150);    
	}
        
        ////--------------------------------------------------------------------------------------------------------
        
        
        //////////////////------------------------------------------------------------------------------------------------
        
        public static void CARGAR_JTABLE_productos_prove() {
            
		String[] titulo={"Codigo","Descripción","Prec. Vta","Stock","Porcentaje %","Proveedor"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql="SELECT * FROM productos where pro_proveedor = '"+productos.id_proveedor.getText()+"'";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("pro_id");
                                reg[1]=rs.getString("pro_desc");
				reg[2]=rs.getString("pro_precioventa");
                                reg[3]=rs.getInt("pro_stock");
                                reg[4]=rs.getString("pro_ganancia");
                                reg[5]=rs.getString("pro_proveedor");
				          
				mod.addRow(reg);
			}
			productos.jtable_producto2.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		productos.jtable_producto2.setAutoResizeMode(productos.jtable_producto2.AUTO_RESIZE_OFF);
		productos.jtable_producto2.doLayout();
		JTABLE_TAMANHO_provee();
		//////////////////////////////////////////////////
	}
   
        public static void JTABLE_TAMANHO_provee() {
		
                TableColumnModel columnModel = productos.jtable_producto2.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(70);
                columnModel.getColumn(1).setPreferredWidth(300);
                columnModel.getColumn(2).setPreferredWidth(100);
                columnModel.getColumn(3).setPreferredWidth(80);
                columnModel.getColumn(4).setPreferredWidth(100);
                columnModel.getColumn(5).setPreferredWidth(150);      
	}
        
        /////--------------------------------------------------------------------------------------------------------------
        
        
        
        
        
        
  public static void generar_nro_vta(){
        int j;
        int cont=1;
        String num="";
        String c="";
        
        Conexion cc=new Conexion();
	Connection con=cc.conectar();
         String sql="select max(vta_id) from venta";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sql);
            if(rs.next())
            {
                 c=rs.getString(1);
            }
            if(c==null){
                vtacredito.boleta_vta.setText("00000001");
            }
            else{
                 j=Integer.parseInt(c);
                 GenerarNumero gen= new GenerarNumero();
                 gen.generar(j);
                 vtacredito.boleta_vta.setText(gen.serie());
            }

        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }
  }

  
    public static void generar_nro_vta_uno(){
        int j;
        int cont=1;
        String num="";
        String c="";
        
        Conexion cc=new Conexion();
	Connection con=cc.conectar();
         String sql="select max(vta_id) from venta";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sql);
            if(rs.next())
            {
                 c=rs.getString(1);
            }
            if(c==null){
                vtacredito.ida.setText("1");
            }
            else{
                        ida.setText(rs.getString("max"));
                                 
                        String importe1,lolo;
                        int importe  ,suma;
                        importe1 = ida.getText();
                        importe = parseInt(importe1); 

                        suma = importe + 1;
                        
                        lolo = Integer.toString(suma);
                        ida.setText(lolo); 
            }

        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
    
    
    /////////////////////add stock tabla///////////////////////////////
                public static void buscarproducto_addstock(){
		String sql="SELECT * FROM productos WHERE pro_desc  LIKE '%"+add_stock.bus_addstock.getText()+"%' ORDER BY pro_id";
		//System.out.println(sql);
		String[] titulo={"Codigo","Descripción","Stock","Sucursal"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("pro_id");
                                reg[1]=rs.getString("pro_desc");
				reg[2]=rs.getString("pro_stock");
                                reg[3]=rs.getString("pro_suc");
                               
				mod.addRow(reg);
			}
			add_stock.jtable_addstock.setModel(mod);
                        
                        
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "error " + e);
		}
		//forma de quetenga la barra orizontal////////////
		add_stock.jtable_addstock.setAutoResizeMode(add_stock.jtable_addstock.AUTO_RESIZE_OFF);
		add_stock.jtable_addstock.doLayout();
		JTABLE_TAMANHO_addstock();
		//////////////////////////////////////////////////
	}
                
                
        public static void JTABLE_TAMANHO_addstock() {
		
                TableColumnModel columnModel = add_stock.jtable_addstock.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(70);
                columnModel.getColumn(1).setPreferredWidth(300);
                columnModel.getColumn(2).setPreferredWidth(100);
                columnModel.getColumn(3).setPreferredWidth(100);
                 
	}
    ///////////////////////////////////////////////////
        public static void CARGAR_JTABLE_productos_vtacredito_bus() {
            
		String[] titulo={"Codigo","Descripción","Prec. Vta","Prec. Mayorista","Stock"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql="SELECT * FROM productos WHERE pro_desc  LIKE '%"+vtacredito.buscar_productos.getText()+"%' ORDER BY pro_id";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("pro_id");
                                reg[1]=rs.getString("pro_desc");
				reg[2]=rs.getString("pro_precioventa");
                                reg[3]=rs.getString("pro_preciomayorista");
                                reg[4]=rs.getString("pro_stock");
				          
				mod.addRow(reg);
			}
			vtacredito.jTable_productos.setModel(mod);
                        
                        rs.close();
			st.close();
			con.close();
                        
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		vtacredito.jTable_productos.setAutoResizeMode(vtacredito.jTable_productos.AUTO_RESIZE_OFF);
		vtacredito.jTable_productos.doLayout();
		JTABLE_TAMANHO_vtacredto();
		//////////////////////////////////////////////////
	}
    //////////////////////////////////////////////////////////////////////////////
  	public static void CARGAR_JTABLE_productos_vtacredito_bus_lector() {
            
		String[] titulo={"Codigo","Descripción","Prec. Vta","Prec. Mayorista","Stock"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql="SELECT * FROM productos WHERE pro_lector  LIKE '%"+vtacredito.buscar_productos.getText()+"%' ORDER BY pro_id";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("pro_id");
                                reg[1]=rs.getString("pro_desc");
				reg[2]=rs.getString("pro_precioventa");
                                reg[3]=rs.getString("pro_preciomayorista");
                                reg[4]=rs.getString("pro_stock");
				          
				mod.addRow(reg);
			}
			vtacredito.jTable_productos.setModel(mod);
                        
                        rs.close();
			st.close();
			con.close();
                        
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		vtacredito.jTable_productos.setAutoResizeMode(vtacredito.jTable_productos.AUTO_RESIZE_OFF);
		vtacredito.jTable_productos.doLayout();
		JTABLE_TAMANHO_vtacredto();
		//////////////////////////////////////////////////
	}
        
        /////////////////////////////////////////////////////////////////////////////////
        
        
                public static void buscarproducto2(){
		String sql="SELECT * FROM productos WHERE pro_desc  LIKE '%"+productos.bus_txt3.getText()+"%' ORDER BY pro_id";
		//System.out.println(sql);
		String[] titulo={"Codigo","Descripción","Prec. Vta","Stock","Porcentaje %","Proveedor"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
                             DecimalFormat formatea = new DecimalFormat("###,###,###.##");
				reg[0]=rs.getString("pro_id");
                                reg[1]=rs.getString("pro_desc");
                                reg[2]=formatea.format(rs.getInt("pro_precioventa"));
				//reg[2]=rs.getString("pro_precioventa");
                                reg[3]=rs.getInt("pro_stock");
                                reg[4]=rs.getString("pro_ganancia");
                                reg[5]=rs.getString("pro_proveedor");
				mod.addRow(reg);
			}
			productos.jtable_producto2.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "error " + e);
		}
		//forma de quetenga la barra orizontal////////////
		productos.jtable_producto2.setAutoResizeMode(productos.jtable_producto2.AUTO_RESIZE_OFF);
		productos.jtable_producto2.doLayout();
		JTABLE_TAMANHO_producto2();
		//////////////////////////////////////////////////
	}
                
                public static void JTABLE_TAMANHO_producto2() {
		
                TableColumnModel columnModel = productos.jtable_producto2.getColumnModel();

                  columnModel.getColumn(0).setPreferredWidth(70);
                columnModel.getColumn(1).setPreferredWidth(300);
                columnModel.getColumn(2).setPreferredWidth(100);
                columnModel.getColumn(3).setPreferredWidth(80);
                columnModel.getColumn(4).setPreferredWidth(100);
                columnModel.getColumn(5).setPreferredWidth(150);    
	}
        ////////////////////////////////////////////////
                
                
                
                
                
                ///////////////////----------------------------------------------------------
                
                public static void actualizar_montototal(){
                    
                Conexion cc=new Conexion();
		Connection con=cc.conectar();
                try {

                String sqltotal = "update productos set pro_totalvta = pro_precioventa * pro_stock where pro_id_lg = '"+productos.pro_id.getText()+"'";

                st = con.createStatement();

                st.execute(sqltotal);
                
            } catch (SQLException ex) {
                System.out.println("ver error " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "error" + ex);
            }
                }
                ///////////////////-----------------------------------------------------
                
                                ///////////////////----------------------------------------------------------
                
                public static void actualizar_montogeneral(){
                    
                Conexion cc=new Conexion();
		Connection con=cc.conectar();
                try {

                String sqltotal = "update productos set pro_totalvta = pro_precioventa * pro_stock ";

                st = con.createStatement();

                st.execute(sqltotal);
                
            } catch (SQLException ex) {
                System.out.println("ver error " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "error" + ex);
            }
                }
                ///////////////////-----------------------------------------------------
        
               public static void alignRight(JTable table, int column) {
                    DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
                    rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
                    productos.jtable_producto2.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
                     productos.jtable_producto2.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
                     productos.jtable_producto2.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
                }
                
                public static void alignRight1(JTable table, int column) {
                    DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
                    rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
                    productos.jTable_productos.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
                     productos.jTable_productos.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
                     productos.jTable_productos.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
                }
                
                public static void alignRight_vta(JTable table, int column) {
                    DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
                    rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
                    vtacredito.jTable_productos.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
                     vtacredito.jTable_productos.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
                     vtacredito.jTable_productos.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
                }
                
                public static void alignRight_proveedor(JTable table, int column) {
                    DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
                    rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
                 
                     consulta_proveedor.jTable_proveedor.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
                     
                }
                
                public static void emergente(){
                    
                Conexion cc=new Conexion();
		Connection con=cc.conectar();;
        	try {
		String sql = "Select * from productos where pro_id = '"+productos.id_var.getText()+"'";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {

                    
                         emergente_producto.img_emerg.setText(rs.getString("pro_imgurl"));
                         emergente_producto.txt_id.setText(rs.getString("pro_id"));
                         emergente_producto.txt_stock.setText(rs.getString("pro_stock"));
                         emergente_producto.txt_stockmin.setText(rs.getString("pro_stockmin"));
                       
                         
                         emergente_producto.txt_preciocompra.setText(rs.getString("pro_preciocompra"));
                         
                         emergente_producto.txt_ventapre.setText(rs.getString("pro_precioventa"));
                         emergente_producto.txt_ganancia.setText(rs.getString("pro_ganancia"));
                         emergente_producto.txt_proveedor.setText(rs.getString("pro_proveedor"));
                         
                         emergente_producto.txt_des.setText(rs.getString("pro_desc"));
                         
                         emergente_producto.txt_VEN.setText(rs.getString("pro_fechaven"));

                         //telefono.setText(rs.getString("conf_telefono"));                        
                         ///////////////////////////////////////////////mostrar imagenes en pantalla
                                String url = (rs.getString("pro_imgurl"));
                                ImageIcon fot = new ImageIcon(url);
                                Icon icono = new ImageIcon(fot.getImage().getScaledInstance(emergente_producto.img_emerg.getWidth(), emergente_producto.img_emerg.getHeight(), Image.SCALE_DEFAULT));
                                emergente_producto.img_emerg.setIcon(icono);
                                emergente_producto.img_emerg.repaint();
                    }
                    
             
                                        

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
                    
                }
 
                
                
}
