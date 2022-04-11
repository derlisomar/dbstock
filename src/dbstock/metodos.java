/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;


import static dbstock.cotizacion.us_cpa;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Derlis
 */

 
public class metodos {
     public static Statement st;
   public static Connection con;
    
        public static void cmb_privilegio(){
      		Conexion cc=new Conexion();
		Connection con=cc.conectar();;

        String vtagsus="select * from privilegios";
	try {
        usuario.cmb_privilegios.removeAllItems();
	st = con.createStatement();
	ResultSet rs=st.executeQuery(vtagsus);
        
		try {
			while(rs.next()){

                                usuario.cmb_privilegios.addItem(rs.getString(2));
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
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
            public static void CARGAR_JTABLE() {
            
		String[] titulo={"Nro Documento","Nombre y Apellido", "Privilegios"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql="select * from usuarios ORDER BY usu_id DESC";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("usu_cedula");
                                reg[1]=rs.getString("usu_nombre");
				reg[2]=rs.getString("usu_privilegios");

				          
				mod.addRow(reg);
			}
			usuario.jTable_usuario.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//forma de quetenga la barra orizontal////////////
		usuario.jTable_usuario.setAutoResizeMode(usuario.jTable_usuario.AUTO_RESIZE_OFF);
		usuario.jTable_usuario.doLayout();
		JTABLE_TAMANHO();
		//////////////////////////////////////////////////
	}
            
            
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            
            public static void JTABLE_TAMANHO() {
		
                TableColumnModel columnModel = usuario.jTable_usuario.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(100);
                columnModel.getColumn(1).setPreferredWidth(200);
                columnModel.getColumn(2).setPreferredWidth(150);

                
	}
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            
            public static void CARGAR_JTABLE_PROVEEDOR() {
            
		String[] titulo={"Ruc","Denominación"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql="select * from proveedores ORDER BY pro_ruc DESC";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("pro_ruc");
                                reg[1]=rs.getString("pro_empresa");

				mod.addRow(reg);
			}
			proveedor.jTable_proveedor.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//forma de quetenga la barra orizontal////////////
		proveedor.jTable_proveedor.setAutoResizeMode(proveedor.jTable_proveedor.AUTO_RESIZE_OFF);
		proveedor.jTable_proveedor.doLayout();
		JTABLE_TAMANHO_PROVEEDOR();
		//////////////////////////////////////////////////
	}   
                    
            public static void JTABLE_TAMANHO_PROVEEDOR() {
		
                TableColumnModel columnModel = proveedor.jTable_proveedor.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(100);
                columnModel.getColumn(1).setPreferredWidth(255);
  
 
	}
                
            
                public static void CARGAR_JTABLE_cliente() {
            
		String[] titulo={"Documento","Nombre","Telefono","Limite"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql="select * from clientes ORDER BY cli_cedula DESC";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("cli_cedula");
                                reg[1]=rs.getString("cli_nombre");
                                reg[2]=rs.getString("cli_telefono");
                                reg[3]=rs.getString("cli_limite");

				mod.addRow(reg);
			}
			cliente.jTable_cliente.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//forma de quetenga la barra orizontal////////////
		cliente.jTable_cliente.setAutoResizeMode(cliente.jTable_cliente.AUTO_RESIZE_OFF);
		cliente.jTable_cliente.doLayout();
		JTABLE_TAMANHO_cliente();
		//////////////////////////////////////////////////
	}   
                    
            public static void JTABLE_TAMANHO_cliente() {
		
                TableColumnModel columnModel = cliente.jTable_cliente.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(80);
                columnModel.getColumn(1).setPreferredWidth(200);
                columnModel.getColumn(2).setPreferredWidth(100);
                columnModel.getColumn(3).setPreferredWidth(70);
  
 
	}
            
        public static void buscarcliente(){
		String sql="SELECT * FROM clientes WHERE cli_nombre  LIKE '%"+cliente.buscar_cli.getText()+"%' ORDER BY cli_codigo";
		//System.out.println(sql);
		String[] titulo={"Documento","Nombre","Telefono"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("cli_cedula");
                                reg[1]=rs.getString("cli_nombre");
                                reg[2]=rs.getString("cli_telefono");
                                reg[3]=rs.getString("cli_limite");

				mod.addRow(reg);
			}
			cliente.jTable_cliente.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//forma de quetenga la barra orizontal////////////
		cliente.jTable_cliente.setAutoResizeMode(cliente.jTable_cliente.AUTO_RESIZE_OFF);
		cliente.jTable_cliente.doLayout();
		JTABLE_TAMANHO_cliente();
		//////////////////////////////////////////////////
	}
        
        public static void convertiraMayusculasEnJtextfield(javax.swing.JTextField jTextfieldS){
            String cadena= (jTextfieldS.getText()).toUpperCase();
            jTextfieldS.setText(cadena);
        }
        
        
        public static void estirardatos_conf(){

 		Conexion cc=new Conexion();
		Connection con=cc.conectar();;
        	try {

		//String sql = "Select * from config where conf_ruc = '"+config.conf_ruc.getText()+"'";
		String sql = "Select * from config";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                    
                            
                         config.id_conf.setText(rs.getString("conf_id"));   
                         config.conf_denominacion.setText(rs.getString("conf_denominacion"));
                         config.conf_ruc.setText(rs.getString("conf_ruc"));
                         config.conf_telefono.setText(rs.getString("conf_telefono"));
                         config.conf_direccion.setText(rs.getString("conf_direccion"));
                         config.conf_actividad.setText(rs.getString("conf_actividad"));
                         config.conf_email.setText(rs.getString("conf_email"));
                         config.conf_web.setText(rs.getString("conf_web"));
                         config.Conf_autoimpresor.setText(rs.getString("conf_autoimpresor"));
                         config.conf_timbrado.setText(rs.getString("conf_timbrado"));
                         config.conf_timbradoini.setText(rs.getString("conf_timbradoini"));
                         config.conf_timbradoven.setText(rs.getString("conf_timbradoven"));
                         config.conf_sucursal.setText(rs.getString("conf_sucursal"));
                         config.conf_ciudad.setText(rs.getString("conf_ciudad"));
                         config.url_logo.setText(rs.getString("conf_url"));
                         config.iva1.setText(rs.getString("conf_iva1"));
                         config.divisor1.setText(rs.getString("conf_divisor1"));
                         config.iva2.setText(rs.getString("conf_iva2"));
                         config.divisor2.setText(rs.getString("conf_divisor2"));
                         
                         config.mostrar_bus.setText(rs.getString("conf_buspro"));
                         config.mostrar_fac.setText(rs.getString("conf_factura"));
                         
                         ///////////////////////////////////////////////mostrar imagenes en pantalla
                                String url = (rs.getString("conf_url"));
                                ImageIcon fot = new ImageIcon(url);
                                Icon icono = new ImageIcon(fot.getImage().getScaledInstance(config.milogo.getWidth(), config.milogo.getHeight(), Image.SCALE_DEFAULT));
                                config.milogo.setIcon(icono);
                                config.milogo.repaint();
                          //////////////////////////////////////////////////////fin mostrar pantalla

                    }
			rs.close();
			st.close();
			con.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

        }
        
        
        //////////////////////////////////////////////////////////////////////////////////////////////////////
        
                public static void estirardatos_SECUENCIA(){

 		Conexion cc=new Conexion();
		Connection con=cc.conectar();;
        	try {

		//String sql = "Select * from config where conf_ruc = '"+config.conf_ruc.getText()+"'";
		String sql = "Select * from contador";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                         config.txt_sec.setText(rs.getString("cont_secuencia"));
                         config.caj_cod.setText(rs.getString("caj_codigo"));
                         config.su_cod.setText(rs.getString("cont_id"));

                    }
			rs.close();
			st.close();
			con.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

        }
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
                public static void estirardatos_cotizacion(){

 		Conexion cc=new Conexion();
		Connection con=cc.conectar();;
        	try {

		//String sql = "Select * from config where conf_ruc = '"+config.conf_ruc.getText()+"'";
		String sql = "Select * from cotizar";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                         cotizacion.coti_id.setText(rs.getString("coti_id"));
                         cotizacion.us_cpa.setText(rs.getString("coti_dolar"));
                         cotizacion.rs_cpa.setText(rs.getString("coti_real"));
                         cotizacion.ps_cpa.setText(rs.getString("coti_peso"));

                    }
			rs.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

        }
                
                /////////////////////////////////////////////estirar para principal
                
                public static void estirardatos_cotizacion_principal(){

 		Conexion cc=new Conexion();
		Connection con=cc.conectar();;
        	try {

		String sql = "Select * from cotizar";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                       
                         Principal.us.setText(rs.getString("coti_dolar"));
                         Principal.rs.setText(rs.getString("coti_real"));
                         Principal.pa.setText(rs.getString("coti_peso"));

                    }

			rs.close();
			st.close();
			con.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

        }
                ////////////////////////////////////////////////////////////////////////////
                
                /////////////////////////////////////////////estirar para principal
                
        public static void estirardatos_nombre(){

 		Conexion cc=new Conexion();
		Connection con=cc.conectar();
        	try {
		String sql = "Select * from config";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {                 
                         Principal.nom_empresa.setText(rs.getString("conf_denominacion"));
                    }
			rs.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

        }
                ////////////////////////////////////////////////////////////////////////////
                
                
                ////////////////////////////////////////////////////////////////////////////////////
                
                        
            public static void CARGAR_JTABLE_grupo() {
            
		String[] titulo={"Id Grupo","Descripción"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql="select * from grupopro ORDER BY grup_id asc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("grup_id");
                                reg[1]=rs.getString("grup_desc");
         
				mod.addRow(reg);
			}
			grupo_prov.jTable_grupo.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//forma de quetenga la barra orizontal////////////
		grupo_prov.jTable_grupo.setAutoResizeMode(grupo_prov.jTable_grupo.AUTO_RESIZE_OFF);
		grupo_prov.jTable_grupo.doLayout();
		JTABLE_TAMANHO_grupo();
		//////////////////////////////////////////////////
	}
            
            
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            
            public static void JTABLE_TAMANHO_grupo() {
		
                TableColumnModel columnModel = grupo_prov.jTable_grupo.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(150);
                columnModel.getColumn(1).setPreferredWidth(300);
    
	}
            
            
            
                public static void CARGAR_JTABLE_SUC() {
            
		String[] titulo={"Codigo","Descripcion", "Telefono"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql="select * from sucursal ORDER BY su_codigo DESC";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("su_codigo");
                                reg[1]=rs.getString("su_descri");
				reg[2]=rs.getString("su_telef");

				          
				mod.addRow(reg);
			}
			sucursal.jtable_sucursal.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//forma de quetenga la barra orizontal////////////
		sucursal.jtable_sucursal.setAutoResizeMode(sucursal.jtable_sucursal.AUTO_RESIZE_OFF);
		sucursal.jtable_sucursal.doLayout();
		JTABLE_TAMANHO_SUC();
		//////////////////////////////////////////////////
	}
                
            public static void JTABLE_TAMANHO_SUC() {
		
                TableColumnModel columnModel = sucursal.jtable_sucursal.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(80);
                columnModel.getColumn(1).setPreferredWidth(200);
                columnModel.getColumn(2).setPreferredWidth(100);
	}
        
              public static void CARGAR_JTABLE_SUC_caja() {
            
		String[] titulo={"Codigo","Descripcion"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql="select * from sucursal ORDER BY su_codigo DESC";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("su_codigo");
                                reg[1]=rs.getString("su_descri");
          
				mod.addRow(reg);
			}
			caja.jtable_sucu.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//forma de quetenga la barra orizontal////////////
		caja.jtable_sucu.setAutoResizeMode(caja.jtable_sucu.AUTO_RESIZE_OFF);
		caja.jtable_sucu.doLayout();
		JTABLE_TAMANHO_SUC_caja();
		//////////////////////////////////////////////////
	}
                
            public static void JTABLE_TAMANHO_SUC_caja() {
		
                TableColumnModel columnModel = caja.jtable_sucu.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(80);
                columnModel.getColumn(1).setPreferredWidth(200);
               
	}
        
            
            
                public static void CARGAR_JTABLE_SUC_caja_setting() {
            
		String[] titulo={"Codigo","Descripcion"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql="select * from sucursal ORDER BY su_codigo DESC";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("su_codigo");
                                reg[1]=rs.getString("su_descri");
          
				mod.addRow(reg);
			}
			setting.jtable_sucu.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//forma de quetenga la barra orizontal////////////
		setting.jtable_sucu.setAutoResizeMode(setting.jtable_sucu.AUTO_RESIZE_OFF);
		setting.jtable_sucu.doLayout();
		JTABLE_TAMANHO_SUC_caja_setting();
		//////////////////////////////////////////////////
	}
                
            public static void JTABLE_TAMANHO_SUC_caja_setting() {
		
                TableColumnModel columnModel = setting.jtable_sucu.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(80);
                columnModel.getColumn(1).setPreferredWidth(200);
               
	}
            
            
            
            
        
        public static void cmb_sucursal(){
      	Conexion cc=new Conexion();
	Connection con=cc.conectar();;

        String vtagsus="select * from sucursal";
	try {
        Inicio.cmb_sucursal.removeAllItems();
	st = con.createStatement();
	ResultSet rs=st.executeQuery(vtagsus);
        
		try {
			while(rs.next()){

                            Inicio.cmb_sucursal.addItem(rs.getString(2));
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
 
                
              public static void CARGAR_JTABLE_caja() {
            
		String[] titulo={"Codigo","Descripcion","Sucursal"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql="select * from caja ORDER BY caj_codigo asc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("caj_codigo");
                                reg[1]=rs.getString("caj_descri");
                                reg[2]=rs.getString("caj_suc");
          
				mod.addRow(reg);
			}
			caja.jtable_caja.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//forma de quetenga la barra orizontal////////////
		caja.jtable_caja.setAutoResizeMode(caja.jtable_caja.AUTO_RESIZE_OFF);
		caja.jtable_caja.doLayout();
		JTABLE_TAMANHO_caja();
		//////////////////////////////////////////////////
	}
                
            public static void JTABLE_TAMANHO_caja() {
		
                TableColumnModel columnModel = caja.jtable_caja.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(50);
                columnModel.getColumn(1).setPreferredWidth(120);
               columnModel.getColumn(2).setPreferredWidth(80);
	}
        
            
                public static void CARGAR_JTABLE_caja_setting() {
            
		String[] titulo={"Codigo","Descripcion","Sucursal"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql="select * from caja ORDER BY caj_codigo asc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("caj_codigo");
                                reg[1]=rs.getString("caj_descri");
                                reg[2]=rs.getString("caj_suc");
          
				mod.addRow(reg);
			}
			setting.jtable_caja.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//forma de quetenga la barra orizontal////////////
		setting.jtable_caja.setAutoResizeMode(setting.jtable_caja.AUTO_RESIZE_OFF);
		setting.jtable_caja.doLayout();
		JTABLE_TAMANHO_cajasetting();
		//////////////////////////////////////////////////
	}
                
            public static void JTABLE_TAMANHO_cajasetting() {
		
                TableColumnModel columnModel = setting.jtable_caja.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(50);
                columnModel.getColumn(1).setPreferredWidth(120);
               columnModel.getColumn(2).setPreferredWidth(80);
	}
            
            
            
            
            public static void CARGAR_JTABLE_SUC_saldo() {
            
		String[] titulo={"Codigo","Descripcion"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql="select * from sucursal ORDER BY su_codigo DESC";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("su_codigo");
                                reg[1]=rs.getString("su_descri");
          
				mod.addRow(reg);
			}
			saldo_caja.jtable_sucu.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//forma de quetenga la barra orizontal////////////
		saldo_caja.jtable_sucu.setAutoResizeMode(saldo_caja.jtable_sucu.AUTO_RESIZE_OFF);
		saldo_caja.jtable_sucu.doLayout();
		JTABLE_TAMANHO_SUC_saldo();
		//////////////////////////////////////////////////
	}
                
            public static void JTABLE_TAMANHO_SUC_saldo() {
		
                TableColumnModel columnModel = saldo_caja.jtable_sucu.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(80);
                columnModel.getColumn(1).setPreferredWidth(220);
               
	}
        
            
            public static void CARGAR_JTABLE_PRIVILEGIOS() {
            
		String[] titulo={"ID","Descripción", "Obs"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql="select * from privilegios ORDER BY pri_id DESC";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("pri_id");
                                reg[1]=rs.getString("pri_desc");
				reg[2]=rs.getString("pri_obs");

				          
				mod.addRow(reg);
			}
			privilegio.jtable_pri.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//forma de quetenga la barra orizontal////////////
		privilegio.jtable_pri.setAutoResizeMode(privilegio.jtable_pri.AUTO_RESIZE_OFF);
		privilegio.jtable_pri.doLayout();
		JTABLE_TAMANHO_PRIVILEGIOS();
		//////////////////////////////////////////////////
	}
            
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            
            public static void JTABLE_TAMANHO_PRIVILEGIOS() {
		
                TableColumnModel columnModel = privilegio.jtable_pri.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(30);
                columnModel.getColumn(1).setPreferredWidth(140);
                columnModel.getColumn(2).setPreferredWidth(280);

                
	}    
            
          public static void estirar_suc() {
              
              try {
                ////////////////////////////////suc estirar de bd
                String descripcion_Caja = "";
                String  caja = "";
                String descripcion_sucursal = "";
                String  suc = "";
                String leearchivo = "";
                int i = 0;
                // lee ip y base de datos
                BufferedReader bf = new BufferedReader(new FileReader(new File("caja.txt").getAbsolutePath()));
                while ((leearchivo = bf.readLine()) != null) {
                    
                        if (i == 0) {
                            descripcion_Caja = leearchivo;   
                        }
                        if (i == 1) {
                            caja = leearchivo;                      
                        }
                        if (i == 2) {
                            descripcion_sucursal = leearchivo;                   
                        }
                        if (i == 3) {
                            suc = leearchivo;                     
                        }
                            i++;
                        }
                     Inicio.id_suc.setText(suc);
            ////////////////////////////////suc estirar de bd -fin
            
              } catch (Exception e) {
              }
   
          }    
 
          //////////////////////////////////////////////////////////////////////////-------------------------------------

           
    /////////////////////////////////////////////////////////////////////////----------------------------------------------
          
        public static void cmb_add(){
      		Conexion cc=new Conexion();
		Connection con=cc.conectar();;

        String vtagsus="select * from sucursal";
	try {
        add_stock.cmb_sucadd.removeAllItems();
	st = con.createStatement();
	ResultSet rs=st.executeQuery(vtagsus);
        
		try {
			while(rs.next()){

                                add_stock.cmb_sucadd.addItem(rs.getString(2));
			}
			
		} catch (Exception e1) {
			// TODO: handle exception
		}

	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
        
    }
    
        
        ////////////////////////////////////////////////////////////////////////-----------------------------------
        
        
            public static void CARGAR_JTABLE_addstock() {
            
		String[] titulo={"Codigo","Descripción","Stock","Sucursal"};
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
                                reg[2]=rs.getString("pro_stock");
				reg[3]=rs.getString("pro_suc");
                                
				          
				mod.addRow(reg);
			}
			add_stock.jtable_addstock.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
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
                columnModel.getColumn(2).setPreferredWidth(90);
                columnModel.getColumn(3).setPreferredWidth(80);     
	}
        
        ////////////////////////////////////////////////////////////////////////-----------------------------------
    
        public static void estirardatos_privilegios(){

 		Conexion cc=new Conexion();
		Connection con=cc.conectar();;
        	try {

		//String sql = "Select * from config where conf_ruc = '"+config.conf_ruc.getText()+"'";
		String sql = "Select * from privilegios where pri_id = '"+privilegio.pri_id.getText()+"'";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                         privilegio.base_datos_lb.setText(rs.getString("pri_base_datos"));                     
                         privilegio.adm_privilegios.setText(rs.getString("pri_adm_usuario"));
                         privilegio.privi_usuari.setText(rs.getString("pri_usuarios"));
                         privilegio.apariencia_1.setText(rs.getString("pri_apariencia"));
                         privilegio.config_1.setText(rs.getString("pri_configuracion"));
                         privilegio.sucu_1.setText(rs.getString("pri_sucursal"));
                         
                         privilegio.proveedores_1.setText(rs.getString("pri_proveedores"));                     
                         privilegio.producto_1.setText(rs.getString("pri_productos"));
                         privilegio.add_stock_1.setText(rs.getString("pri_addstock"));
                         privilegio.add_caja_1.setText(rs.getString("pri_addcaja"));
                         privilegio.add_cliente_1.setText(rs.getString("pri_addcliente"));
                         privilegio.grupo_pro_1.setText(rs.getString("pri_grupo_pro"));
                         privilegio.cotiza.setText(rs.getString("pri_cotiza"));
                         
                         privilegio.compras_1.setText(rs.getString("pri_compra"));
                         privilegio.ped_realiz.setText(rs.getString("pri_pedirealiz"));
                         privilegio.confirmar_entre.setText(rs.getString("pri_confentrega"));
                         
                         privilegio.vta_lb.setText(rs.getString("pri_venta"));
                         privilegio.presupu.setText(rs.getString("pri_presupuesto"));
                         
                         privilegio.cons_vta.setText(rs.getString("pri_consultavta"));
                         privilegio.cons_presu.setText(rs.getString("pri_consultapresu"));
                         privilegio.cons_clie.setText(rs.getString("pri_consultacli"));
                         privilegio.cons_vende.setText(rs.getString("pri_consultavendedor"));
                         
                         privilegio.saldo_cja.setText(rs.getString("pri_saldo"));
                         privilegio.movimi.setText(rs.getString("pri_movimiento"));
                         privilegio.cobz.setText(rs.getString("pri_cobranza"));
                         privilegio.gtos.setText(rs.getString("pri_gasto"));
                         privilegio.ingres.setText(rs.getString("pri_ingreso"));
                         
                         privilegio.listad.setText(rs.getString("pri_listado"));
                         privilegio.label_cierrecaja.setText(rs.getString("pri_cierrecaja"));
                        
                         
 
                    }
			rs.close();
			st.close();
			con.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

        }
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////
           
                ////////////////////////////////////////////////////////////////////////-----------------------------------
    
        public static void estirardatos_privilegios_principal(){

 		Conexion cc=new Conexion();
		Connection con=cc.conectar();
        	try {

		//String sql = "Select * from config where conf_ruc = '"+config.conf_ruc.getText()+"'";
		String sql = "Select * from privilegios where pri_desc = '"+Inicio.privile.getText()+"' ";
                //where pri_desc = '"+Principal.privilegio_ini.getText()+"'
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                         Principal.base_datos_lb.setText(rs.getString("pri_base_datos"));                     
                         Principal.adm_privilegios.setText(rs.getString("pri_adm_usuario"));
                         Principal.privi_usuari.setText(rs.getString("pri_usuarios"));
                         Principal.apariencia_1.setText(rs.getString("pri_apariencia"));
                         Principal.config_1.setText(rs.getString("pri_configuracion"));
                         Principal.sucu_1.setText(rs.getString("pri_sucursal"));
                         
                         Principal.proveedores_1.setText(rs.getString("pri_proveedores"));                     
                         Principal.producto_1.setText(rs.getString("pri_productos"));
                         Principal.add_stock_1.setText(rs.getString("pri_addstock"));
                         Principal.add_caja_1.setText(rs.getString("pri_addcaja"));
                         Principal.add_cliente_1.setText(rs.getString("pri_addcliente"));
                         Principal.grupo_pro_1.setText(rs.getString("pri_grupo_pro"));
                         Principal.cotiza.setText(rs.getString("pri_cotiza"));
                         
                         Principal.compras_1.setText(rs.getString("pri_compra"));
                         Principal.ped_realiz.setText(rs.getString("pri_pedirealiz"));
                         Principal.confirmar_entre.setText(rs.getString("pri_confentrega"));
                         
                         Principal.vta_lb.setText(rs.getString("pri_venta"));
                         Principal.presupu.setText(rs.getString("pri_presupuesto"));
                         
                         Principal.cons_vta.setText(rs.getString("pri_consultavta"));
                         Principal.cons_presu.setText(rs.getString("pri_consultapresu"));
                         Principal.cons_clie.setText(rs.getString("pri_consultacli"));
                         Principal.cons_vende.setText(rs.getString("pri_consultavendedor"));
                         
                         Principal.saldo_cja.setText(rs.getString("pri_saldo"));
                         Principal.movimi.setText(rs.getString("pri_movimiento"));
                         Principal.cobz.setText(rs.getString("pri_cobranza"));
                         Principal.gtos.setText(rs.getString("pri_gasto"));
                         Principal.ingres.setText(rs.getString("pri_ingreso"));
                         
                         Principal.listad.setText(rs.getString("pri_listado"));
                         Principal.cierre_pri_label.setText(rs.getString("pri_cierrecaja"));
                         
                        
                         
 
                    }
			rs.close();
			st.close();
			con.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

        }
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        
}
