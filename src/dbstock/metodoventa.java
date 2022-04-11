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
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Derlis
 */
public class metodoventa {
    
     public static void CARGAR_JTABLE_vtadetalle() {
            
		String[] titulo={"ID","Codigo","Descripción","Cantidad","Precio","Total","Proveedor"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
                //String sql="SELECT * FROM tmpdetallevta order by detvta_id desc";
		String sql="SELECT * FROM tmpdetallevta where detvta_caja = '"+vtacredito.txt_caja.getText()+"' and detvta_suc = '"+vtacredito.sucursal_vta.getText()+"' and detvta_num_deta = '"+vtacredito.ida.getText()+"' order by detvta_id desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("detvta_id");
                                reg[1]=rs.getString("detvta_id_lg");
                                reg[2]=rs.getString("detvta_nomb_pro");
				reg[3]=rs.getString("detvta_cant");
                                reg[4]=rs.getString("detvta_preciogs");
                                reg[5]=rs.getString("detvta_preciototal");
                                reg[6]=rs.getString("detvta_proveedor");
				          
				mod.addRow(reg);
			}
			vtacredito.jtable_vtadetalle.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		vtacredito.jtable_vtadetalle.setAutoResizeMode(vtacredito.jtable_vtadetalle.AUTO_RESIZE_OFF);
		vtacredito.jtable_vtadetalle.doLayout();
		JTABLE_TAMANHO_vtadetalle();
		//////////////////////////////////////////////////
	}
                        
                        
                public static void JTABLE_TAMANHO_vtadetalle() {
		
                TableColumnModel columnModel = vtacredito.jtable_vtadetalle.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(40);
                columnModel.getColumn(1).setPreferredWidth(100);
                columnModel.getColumn(2).setPreferredWidth(273);
                columnModel.getColumn(3).setPreferredWidth(60);
                columnModel.getColumn(4).setPreferredWidth(110);
                columnModel.getColumn(5).setPreferredWidth(110);
                columnModel.getColumn(6).setPreferredWidth(180);
    
                }
    
    
      public static void CARGAR_JTABLE_venta() {
            
		String[] titulo={"ID","Codigo","Documento","Nombre y Apellido","Monto GS","Monto US","Item","Caja","Suc","Condicion","Fecha","A/N"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[12];
                //String sql="SELECT * FROM tmpdetallevta order by detvta_id desc";
		String sql="SELECT * FROM venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1 order by vta_id desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
                            
                              DecimalFormat formatea = new DecimalFormat("###,###,###.##");
				reg[0]=rs.getString("vta_num_deta");
                                reg[1]=rs.getString("vta_codigo");
                                reg[2]=rs.getString("vta_cliente_id");
				reg[3]=rs.getString("vta_cliente_nom");
                                reg[4]=formatea.format(rs.getInt("vta_montogs"));
                                //reg[4]=rs.getString("vta_montogs");
                                reg[5]=rs.getString("vta_montous");
                                reg[6]=rs.getString("vta_cant");
                                reg[7]=rs.getString("vta_caja");
                                reg[8]=rs.getString("vta_suc");
                                reg[9]=rs.getString("vta_condicion");
                                reg[10]=rs.getString("vta_fecha");
                                reg[11]=rs.getString("vta_anulado");
				          
				mod.addRow(reg);
			}
			consulta_vta.jtable_venta.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		consulta_vta.jtable_venta.setAutoResizeMode(consulta_vta.jtable_venta.AUTO_RESIZE_OFF);
		consulta_vta.jtable_venta.doLayout();
		JTABLE_TAMANHO_venta();
		//////////////////////////////////////////////////
	}
      
      public static void JTABLE_TAMANHO_venta() {
		
                TableColumnModel columnModel = consulta_vta.jtable_venta.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(40);
                columnModel.getColumn(1).setPreferredWidth(80);
                columnModel.getColumn(2).setPreferredWidth(90);
                columnModel.getColumn(3).setPreferredWidth(200);
                columnModel.getColumn(4).setPreferredWidth(80);
                columnModel.getColumn(5).setPreferredWidth(70);
                columnModel.getColumn(6).setPreferredWidth(40);
                columnModel.getColumn(7).setPreferredWidth(40);
                columnModel.getColumn(8).setPreferredWidth(40);
                columnModel.getColumn(9).setPreferredWidth(70);
                columnModel.getColumn(10).setPreferredWidth(80);
                columnModel.getColumn(11).setPreferredWidth(30);
    
            }
      
      
      
            public static void CARGAR_JTABLE_venta_CONTADO() {
            
		String[] titulo={"ID","Codigo","Documento","Nombre y Apellido","Monto GS","Monto US","Item","Caja","Suc","Condicion","Fecha","A/N"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[12];
                //String sql="SELECT * FROM tmpdetallevta order by detvta_id desc";
		String sql="SELECT * FROM venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1 and vta_condicion = 'CONTADO' order by vta_id desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("vta_num_deta");
                                reg[1]=rs.getString("vta_codigo");
                                reg[2]=rs.getString("vta_cliente_id");
				reg[3]=rs.getString("vta_cliente_nom");
                                reg[4]=rs.getString("vta_montogs");
                                reg[5]=rs.getString("vta_montous");
                                reg[6]=rs.getString("vta_cant");
                                reg[7]=rs.getString("vta_caja");
                                reg[8]=rs.getString("vta_suc");
                                reg[9]=rs.getString("vta_condicion");
                                reg[10]=rs.getString("vta_fecha");
                                reg[11]=rs.getString("vta_anulado");
				          
				mod.addRow(reg);
			}
			consulta_vta.jtable_venta.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		consulta_vta.jtable_venta.setAutoResizeMode(consulta_vta.jtable_venta.AUTO_RESIZE_OFF);
		consulta_vta.jtable_venta.doLayout();
		JTABLE_TAMANHO_venta_CONTADO();
		//////////////////////////////////////////////////
	}
      
      public static void JTABLE_TAMANHO_venta_CONTADO() {
		
                TableColumnModel columnModel = consulta_vta.jtable_venta.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(40);
                columnModel.getColumn(1).setPreferredWidth(80);
                columnModel.getColumn(2).setPreferredWidth(90);
                columnModel.getColumn(3).setPreferredWidth(200);
                columnModel.getColumn(4).setPreferredWidth(80);
                columnModel.getColumn(5).setPreferredWidth(70);
                columnModel.getColumn(6).setPreferredWidth(40);
                columnModel.getColumn(7).setPreferredWidth(40);
                columnModel.getColumn(8).setPreferredWidth(40);
                columnModel.getColumn(9).setPreferredWidth(70);
                columnModel.getColumn(10).setPreferredWidth(80);
                columnModel.getColumn(11).setPreferredWidth(30);
    
            }
      
      
      
            public static void CARGAR_JTABLE_venta_CREDITO() {
            
		String[] titulo={"ID","Codigo","Documento","Nombre y Apellido","Monto GS","Monto US","Item","Caja","Suc","Condicion","Fecha","A/N"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[12];
                //String sql="SELECT * FROM tmpdetallevta order by detvta_id desc";
		String sql="SELECT * FROM venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1 and vta_condicion = 'CREDITO' order by vta_id desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("vta_num_deta");
                                reg[1]=rs.getString("vta_codigo");
                                reg[2]=rs.getString("vta_cliente_id");
				reg[3]=rs.getString("vta_cliente_nom");
                                reg[4]=rs.getString("vta_montogs");
                                reg[5]=rs.getString("vta_montous");
                                reg[6]=rs.getString("vta_cant");
                                reg[7]=rs.getString("vta_caja");
                                reg[8]=rs.getString("vta_suc");
                                reg[9]=rs.getString("vta_condicion");
                                reg[10]=rs.getString("vta_fecha");
                                reg[11]=rs.getString("vta_anulado");
				          
				mod.addRow(reg);
			}
			consulta_vta.jtable_venta.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		consulta_vta.jtable_venta.setAutoResizeMode(consulta_vta.jtable_venta.AUTO_RESIZE_OFF);
		consulta_vta.jtable_venta.doLayout();
		JTABLE_TAMANHO_venta_CREDITO();
		//////////////////////////////////////////////////
	}
      
      public static void JTABLE_TAMANHO_venta_CREDITO() {
		
                TableColumnModel columnModel = consulta_vta.jtable_venta.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(40);
                columnModel.getColumn(1).setPreferredWidth(80);
                columnModel.getColumn(2).setPreferredWidth(90);
                columnModel.getColumn(3).setPreferredWidth(200);
                columnModel.getColumn(4).setPreferredWidth(80);
                columnModel.getColumn(5).setPreferredWidth(70);
                columnModel.getColumn(6).setPreferredWidth(40);
                columnModel.getColumn(7).setPreferredWidth(40);
                columnModel.getColumn(8).setPreferredWidth(40);
                columnModel.getColumn(9).setPreferredWidth(70);
                columnModel.getColumn(10).setPreferredWidth(80);
                columnModel.getColumn(11).setPreferredWidth(30);
    
            }
      
      
        public static void CARGAR_JTABLE_venta_count() {
            
		String[] titulo={"ID","Codigo","Documento","Nombre y Apellido","Monto GS","Monto US","Item","Caja","Suc","Condicion","Fecha","A/N"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[12];
                //String sql="SELECT * FROM tmpdetallevta order by detvta_id desc";
		String sql="SELECT * FROM venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' order by vta_id desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("vta_num_deta");
                                reg[1]=rs.getString("vta_codigo");
                                reg[2]=rs.getString("vta_cliente_id");
				reg[3]=rs.getString("vta_cliente_nom");
                                reg[4]=rs.getString("vta_montogs");
                                reg[5]=rs.getString("vta_montous");
                                reg[6]=rs.getString("vta_cant");
                                reg[7]=rs.getString("vta_caja");
                                reg[8]=rs.getString("vta_suc");
                                reg[9]=rs.getString("vta_condicion");
                                reg[10]=rs.getString("vta_fecha");
                                reg[11]=rs.getString("vta_anulado");
				          
				mod.addRow(reg);
			}
			consulta_vta.jtable_venta.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		consulta_vta.jtable_venta.setAutoResizeMode(consulta_vta.jtable_venta.AUTO_RESIZE_OFF);
		consulta_vta.jtable_venta.doLayout();
		//JTABLE_TAMANHO_venta();
		//////////////////////////////////////////////////
	}
      
        public static void cmb_sucursal_vta(){
      		Conexion cc=new Conexion();
		Connection con=cc.conectar();

                String prov="select * from sucursal";
                try {
                //consulta_vta.cmb_suc.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(prov);

			while(rs.next()){

                                consulta_vta.cmb_suc.addItem(rs.getString(2));
                                consulta_vta.lb_suc.setText(rs.getString("su_codigo"));
			}
	
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
                
        }
        
        /////////////////////////////////////////////////////////--------------------------------------------
                public static void cmb_caja_vta(){
      		Conexion cc=new Conexion();
		Connection con=cc.conectar();

                String prov="select * from caja";
                try {
                //consulta_vta.cmb_caja.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(prov);

			while(rs.next()){
                           
                            consulta_vta.cmb_caja.addItem(rs.getString(2));
                          
                            consulta_vta.lb_caja.setText(rs.getString("caj_codigo"));
			}

                } catch (SQLException e1) {
                    e1.printStackTrace();
                    JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
                }
                
        }
        ////////////////////////////////////////////////////////-------------------------------------------
                        /////////////////////////////////////////////////////////--------------------------------------------
                public static void cmb_vendedor_vta(){
      		Conexion cc=new Conexion();
		Connection con=cc.conectar();

                String prov="select * from usuarios";
                try {
                //consulta_vta.cmb_vendedor.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(prov);

			while(rs.next()){
                           // consulta_vta.cmb_vendedor.addItem(rs.getString(3));
			}
	
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
                
        }
        ////////////////////////////////////////////////////////-------------------------------------------
        public static void cmb_vendedor_vta_ajuste(){
        Conexion cc=new Conexion();
        Connection con=cc.conectar();;
        String[] titulo={"id prod","Descripcion","Precio","Cantidad","Total"};
        DefaultTableModel mod=new DefaultTableModel(null,titulo);
        
        consulta_vta.jtable_vta_detalle.setModel(mod);
        
        TableColumnModel columnModel = consulta_vta.jtable_vta_detalle.getColumnModel();
        
        columnModel.getColumn(0).setPreferredWidth(60);
        columnModel.getColumn(1).setPreferredWidth(200);
        columnModel.getColumn(2).setPreferredWidth(80);
        columnModel.getColumn(3).setPreferredWidth(30);
        columnModel.getColumn(4).setPreferredWidth(80);

        }   
        
        /////////////////////////////////////////////////////////////---------------------------------
        public static void cmb_vendedor_vta_ajuste2(){
        Conexion cc=new Conexion();
        Connection con=cc.conectar();;
        String[] titulo={"ID","Codigo","Documento","Nombre y Apellido","Monto GS","Monto US","Item","Caja","Suc","Condicion","Fecha","A/N"};
        DefaultTableModel mod=new DefaultTableModel(null,titulo);
        
        consulta_vta.jtable_venta.setModel(mod);
        
        TableColumnModel columnModel = consulta_vta.jtable_venta.getColumnModel();
        
                columnModel.getColumn(0).setPreferredWidth(40);
                columnModel.getColumn(1).setPreferredWidth(80);
                columnModel.getColumn(2).setPreferredWidth(90);
                columnModel.getColumn(3).setPreferredWidth(200);
                columnModel.getColumn(4).setPreferredWidth(80);
                columnModel.getColumn(5).setPreferredWidth(70);
                columnModel.getColumn(6).setPreferredWidth(40);
                columnModel.getColumn(7).setPreferredWidth(40);
                columnModel.getColumn(8).setPreferredWidth(40);
                columnModel.getColumn(9).setPreferredWidth(70);
                columnModel.getColumn(10).setPreferredWidth(80);
                columnModel.getColumn(11).setPreferredWidth(30);

        }   
        /////////////////////////////////////////////////////////////----------------------------------
        //////////////////////////MOSTRAR CREDITO/////////------------------------------------------------------
        
             public static void CARGAR_JTABLE_CREDITO() {
            
		String[] titulo={"Codigo","Documento","Nombre y Apellido","F. Credito","F. Pago","Credito","Pagado","Saldo"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[10];
                //String sql="SELECT * FROM tmpdetallevta order by detvta_id desc";
		String sql="SELECT * FROM cobranza where cb_cli_id = '"+cobranza.cli_cedula.getText()+"'  order by cb_id desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("cb_nrocobranza");
                                reg[1]=rs.getString("cb_cli_id");
                                reg[2]=rs.getString("cb_cli_nomb");
				reg[3]=rs.getString("cb_fechacredito");
                                reg[4]=rs.getString("cb_fechapago");
                                reg[5]=rs.getString("cb_montocre");
                                reg[6]=rs.getString("cb_montopago");
                                reg[7]=rs.getString("cb_montosaldo");
				          
				mod.addRow(reg);
			}
			cobranza.jtable_credito.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		cobranza.jtable_credito.setAutoResizeMode(cobranza.jtable_credito.AUTO_RESIZE_OFF);
		cobranza.jtable_credito.doLayout();
		JTABLE_TAMANHO_CREDITO();
		//////////////////////////////////////////////////
	}
                        
                        
                public static void JTABLE_TAMANHO_CREDITO() {
		
                TableColumnModel columnModel = cobranza.jtable_credito.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(50);
                columnModel.getColumn(1).setPreferredWidth(100);
                columnModel.getColumn(2).setPreferredWidth(200);
                columnModel.getColumn(3).setPreferredWidth(90);
                columnModel.getColumn(4).setPreferredWidth(90);
                columnModel.getColumn(5).setPreferredWidth(100);
                columnModel.getColumn(6).setPreferredWidth(100);
                columnModel.getColumn(7).setPreferredWidth(100);
    
                }
        
        //////////////////////////////////////////////////////////////---------------------------------------
                
                public static void CARGAR_JTABLE_detCREDITO() {
            
		String[] titulo={"ID","Documento","Observación","Monto Cobrado","Fecha","Nro"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[10];
                //String sql="SELECT * FROM tmpdetallevta order by detvta_id desc";
		String sql="SELECT * FROM detcobranza WHERE cbdeta_nrocobranza = '"+cobranza.id_cre.getText()+"' and cbdeta_cli_id = '"+cobranza.cli_cedula.getText()+"' order by cbdeta_id desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("cbdeta_id");
                                reg[1]=rs.getString("cbdeta_cli_id");
                                reg[2]=rs.getString("cbdeta_obs");
                                reg[3]=rs.getString("cbdeta_montopago");
                                reg[4]=rs.getString("cbdeta_fecha");
                                reg[5]=rs.getString("cbdeta_nrocobranza");
				          
				mod.addRow(reg);
			}
			cobranza.jtable_detallecre.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		cobranza.jtable_detallecre.setAutoResizeMode(cobranza.jtable_detallecre.AUTO_RESIZE_OFF);
		cobranza.jtable_detallecre.doLayout();
		JTABLE_TAMANHO_detCREDITO();
		//////////////////////////////////////////////////
	}
                        
                        
                public static void JTABLE_TAMANHO_detCREDITO() {
		
                TableColumnModel columnModel = cobranza.jtable_detallecre.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(50);
                columnModel.getColumn(1).setPreferredWidth(100);
                columnModel.getColumn(2).setPreferredWidth(200);
                
                columnModel.getColumn(3).setPreferredWidth(90);
                columnModel.getColumn(4).setPreferredWidth(80);
                columnModel.getColumn(5).setPreferredWidth(70);
    
                }        
                
        //////////////////////////////////////////////////////////---------------------------------------
                
        public static void cb_ajuste(){
        //Conexion cc=new Conexion();
        //Connection con=cc.conectar();;
        String[] titulo={"id prod","Descripcion","Precio","Cantidad","Total"};
        DefaultTableModel mod=new DefaultTableModel(null,titulo);
        
        cobranza.jtable_detallecre.setModel(mod);
        
        TableColumnModel columnModel = cobranza.jtable_detallecre.getColumnModel();
        
        columnModel.getColumn(0).setPreferredWidth(60);
        columnModel.getColumn(1).setPreferredWidth(200);
        columnModel.getColumn(2).setPreferredWidth(80);
        columnModel.getColumn(3).setPreferredWidth(30);
        columnModel.getColumn(4).setPreferredWidth(80);

        } 
                
        public static void cb_ajuste2(){
        //Conexion cc=new Conexion();
        //Connection con=cc.conectar();;
        String[] titulo={"Codigo","Documento","Nombre y Apellido","F. Credito","F. Pago","Credito","Pagado","Saldo"};
        DefaultTableModel mod=new DefaultTableModel(null,titulo);
        
        cobranza.jtable_credito.setModel(mod);
        
        TableColumnModel columnModel = cobranza.jtable_credito.getColumnModel();
        
                columnModel.getColumn(0).setPreferredWidth(50);
                columnModel.getColumn(1).setPreferredWidth(100);
                columnModel.getColumn(2).setPreferredWidth(200);
                columnModel.getColumn(3).setPreferredWidth(90);
                columnModel.getColumn(4).setPreferredWidth(90);
                columnModel.getColumn(5).setPreferredWidth(100);
                columnModel.getColumn(6).setPreferredWidth(100);
                columnModel.getColumn(7).setPreferredWidth(100);

        }
        
        public static void cmb_sucursal_mov1(){
      		Conexion cc=new Conexion();
		Connection con=cc.conectar();

                String prov="select * from sucursal";
                try {
                mov_caja.cmb_sucu1.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(prov);

			while(rs.next()){

                                mov_caja.cmb_sucu1.addItem(rs.getString(2));
			}
	
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
        }
        
        public static void cmb_sucursal_mov2(){
      		Conexion cc=new Conexion();
		Connection con=cc.conectar();

                String prov="select * from sucursal";
                try {
                mov_caja.cmb_sucu2.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(prov);

			while(rs.next()){

                                mov_caja.cmb_sucu2.addItem(rs.getString(2));
                                
			}
	
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
        }
                
        /////////////////////////////////////////////////////////////////////////--------------------------------------------


        public static void mov_entrecaja(){

 		Conexion cc=new Conexion();
		Connection con=cc.conectar();;
        	try {
		String sql = "Select * from sucursal where su_descri = '"+mov_caja.cmb_sucu1.getSelectedItem()+"'";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                         mov_caja.id_caja1.setText(rs.getString("su_codigo"));
                    }
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

        }

        ///////////////////////////////////////////////////////////////////////////-----------------------------------------
           
        
        //////////////////////////////////////////////////////////////////----------------------------------------------
        
        
        public static void mov_entrecaja2(){

 		Conexion cc=new Conexion();
		Connection con=cc.conectar();;
        	try {
		String sql = "Select * from sucursal where su_descri = '"+mov_caja.cmb_sucu2.getSelectedItem()+"'";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                         mov_caja.id_caja2.setText(rs.getString("su_codigo"));
                    }
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

        }
        
        ///////////////////////////////////////////////////////////////////////////----------------------
       
        ///////////////////////////////GASTOS////////////////////////////////////--------------------
        
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
                           // ingresos.cmb_sucu_gasto.addItem(rs.getString(2));
                                
			}
	
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
        }
        
        //////////////////////////////////////////////////////-----------------------------------
        
                public static void gasto(){

 		Conexion cc=new Conexion();
		Connection con=cc.conectar();;
        	try {
		String sql = "Select * from sucursal where su_descri = '"+gastos.cmb_sucu_gasto.getSelectedItem()+"'";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                         gastos.id_caja1.setText(rs.getString("su_codigo"));
                    }
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

        }
                
                
                 public static void CARGAR_JTABLE_venta_detalle() {
            
                    
		String[] titulo={"ID","Codigo","Documento","Nombre y Apellido","Monto GS","Monto US","Item","Caja","Suc","Condicion","Fecha","Vendedor"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[12];
                //String sql="SELECT * FROM tmpdetallevta order by detvta_id desc";
		String sql="SELECT * FROM venta where vta_fecha='"+DetalleVta.fecha_txt.getText()+"'  and vta_anulado = 1 order by vta_id desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
                            
                              DecimalFormat formatea = new DecimalFormat("###,###,###.##");
				reg[0]=rs.getString("vta_num_deta");
                                reg[1]=rs.getString("vta_codigo");
                                reg[2]=rs.getString("vta_cliente_id");
				reg[3]=rs.getString("vta_cliente_nom");
                                reg[4]=formatea.format(rs.getInt("vta_montogs"));
                                //reg[4]=rs.getString("vta_montogs");
                                reg[5]=rs.getString("vta_montous");
                                reg[6]=rs.getString("vta_cant");
                                reg[7]=rs.getString("vta_caja");
                                reg[8]=rs.getString("vta_suc");
                                reg[9]=rs.getString("vta_condicion");
                                reg[10]=rs.getString("vta_fecha");
                                reg[11]=rs.getString("vta_vendedor");
				
                                
				mod.addRow(reg);
			}
			DetalleVta.jTable_vta.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		DetalleVta.jTable_vta.setAutoResizeMode(DetalleVta.jTable_vta.AUTO_RESIZE_OFF);
		DetalleVta.jTable_vta.doLayout();
		JTABLE_TAMANHO_venta_detalle();
		//////////////////////////////////////////////////
	}
      
    public static void JTABLE_TAMANHO_venta_detalle() {

        TableColumnModel columnModel = DetalleVta.jTable_vta.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(90);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(250);
        columnModel.getColumn(4).setPreferredWidth(90);
        columnModel.getColumn(5).setPreferredWidth(80);
        columnModel.getColumn(6).setPreferredWidth(50);
        columnModel.getColumn(7).setPreferredWidth(50);
        columnModel.getColumn(8).setPreferredWidth(50);
        columnModel.getColumn(9).setPreferredWidth(80);
        columnModel.getColumn(10).setPreferredWidth(90);
        columnModel.getColumn(11).setPreferredWidth(120);
        

    }
                
        
}
