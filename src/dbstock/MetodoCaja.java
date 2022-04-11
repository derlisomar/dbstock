/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;


import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import static java.lang.Integer.parseInt;

/**
 *
 * @author Derlis
 */
public class MetodoCaja {
    
        Statement st;
    Connection con;
          public static void CARGAR_JTABLE_venta_caja_CONTADO() {
            
		String[] titulo={"ID","Codigo","Documento","Nombre y Apellido","Monto GS","Caja","Fecha"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[12];
                
		//String sql="SELECT * FROM venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1 order by vta_id desc"; 
                String sql="SELECT * FROM venta where vta_fecha='"+caja_exten.cierre_fecha.getText()+"'  and vta_anulado = 1 and vta_condicion = 'CONTADO' and ci_estado = '1'  order by vta_id desc";
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
                                //reg[4]=rs.getString("vta_montogs");
                                reg[4]=formatea.format(rs.getInt("vta_montogs"));
                                reg[5]=rs.getString("vta_caja");
                                reg[6]=rs.getString("vta_fecha");
                              
				          
				mod.addRow(reg);
			}
			caja_exten.jTable_contado.setModel(mod);
                        
                rs.close();
		st.close();
		con.close();
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
               
		//forma de quetenga la barra orizontal////////////
		caja_exten.jTable_contado.setAutoResizeMode(caja_exten.jTable_contado.AUTO_RESIZE_OFF);
		caja_exten.jTable_contado.doLayout();
		JTABLE_TAMANHO_venta();
		//////////////////////////////////////////////////
	}
      
                    public static void CARGAR_JTABLE_venta_caja_CREDITO() {
            
		String[] titulo={"ID","Codigo","Documento","Nombre y Apellido","Monto GS","Caja","Fecha"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[12];
                
		//String sql="SELECT * FROM venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1 order by vta_id desc";
                String sql="SELECT * FROM venta where vta_fecha='"+caja_exten.cierre_fecha.getText()+"'  and vta_anulado = 1 and vta_condicion = 'CREDITO' and ci_estado = '1'  order by vta_id desc";
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
                                //reg[4]=rs.getString("vta_montogs");
                                reg[4]=formatea.format(rs.getInt("vta_montogs"));
                                reg[5]=rs.getString("vta_caja");
                
                                reg[6]=rs.getString("vta_fecha");
                              
				          
				mod.addRow(reg);
                                
                               
			}
			caja_exten.jTable_Credito.setModel(mod);
                        
                           rs.close();
                            st.close();
                            con.close(); 
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		caja_exten.jTable_Credito.setAutoResizeMode(caja_exten.jTable_Credito.AUTO_RESIZE_OFF);
		caja_exten.jTable_Credito.doLayout();
		JTABLE_TAMANHO_venta_credito();
		//////////////////////////////////////////////////
	}
          
          
      public static void JTABLE_TAMANHO_venta() {
		
                TableColumnModel columnModel = caja_exten.jTable_contado.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(40);
                columnModel.getColumn(1).setPreferredWidth(80);
                columnModel.getColumn(2).setPreferredWidth(90);
                columnModel.getColumn(3).setPreferredWidth(200);
                columnModel.getColumn(4).setPreferredWidth(80);
             
                columnModel.getColumn(5).setPreferredWidth(40);
                columnModel.getColumn(6).setPreferredWidth(100);

    
            }
      
            public static void JTABLE_TAMANHO_venta_credito() {
		
                TableColumnModel columnModel = caja_exten.jTable_Credito.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(40);
                columnModel.getColumn(1).setPreferredWidth(80);
                columnModel.getColumn(2).setPreferredWidth(90);
                columnModel.getColumn(3).setPreferredWidth(200);
                columnModel.getColumn(4).setPreferredWidth(80);
             
                columnModel.getColumn(5).setPreferredWidth(40);
                columnModel.getColumn(6).setPreferredWidth(100);

    
            }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////
            
                 public static void CARGAR_JTABLE_ingreso_caja() {
            
		String[] titulo={"ID","Fecha","Caja","MontoGS","Obs","Operador"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
                //String sql="SELECT * FROM tmpdetallevta order by detvta_id desc";
		String sql="SELECT * FROM ingreso where ing_fecha ='"+caja_exten.cierre_fecha.getText()+"' and ci_estado = '1'  order by ing_id desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
                            
                            DecimalFormat formatea = new DecimalFormat("###,###,###.##");
                            
				reg[0]=rs.getString("ing_id");
                                reg[1]=rs.getString("ing_fecha");
                                
				reg[2]=rs.getString("ing_cajades");
                                reg[3]=formatea.format(rs.getInt("ing_montogs"));
                                //reg[3]=rs.getString("ing_montogs");
                                reg[4]=rs.getString("ing_obs");
                                reg[5]=rs.getString("ing_usuario");
				          
				mod.addRow(reg);
			}
			caja_exten.jTable_ingreso.setModel(mod);
                        
                         rs.close();
                        st.close();
                        con.close();
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		caja_exten.jTable_ingreso.setAutoResizeMode(caja_exten.jTable_ingreso.AUTO_RESIZE_OFF);
		caja_exten.jTable_ingreso.doLayout();
		JTABLE_TAMANHO_ingreso_bus();
		//////////////////////////////////////////////////
	}
                        
                        
                public static void JTABLE_TAMANHO_ingreso_bus() {
		
                TableColumnModel columnModel = caja_exten.jTable_ingreso.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(30);
                columnModel.getColumn(1).setPreferredWidth(80);
                
                columnModel.getColumn(2).setPreferredWidth(80);
                columnModel.getColumn(3).setPreferredWidth(100);
                columnModel.getColumn(4).setPreferredWidth(200);
                columnModel.getColumn(5).setPreferredWidth(150);
             
    
                }  
            
            
            
            ////////////////////////////////////////////////////////////////////////////////////
            
                    //////////////////////////////////////////////////////////////---------------------------------------
                
                public static void CARGAR_JTABLE_detcobranza() {
            
		String[] titulo={"ID","Documento","Monto Cobrado","Fecha","Nro"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[10];
                //String sql="SELECT * FROM tmpdetallevta order by detvta_id desc";
		String sql="SELECT * FROM detcobranza WHERE cbdeta_fecha = '"+caja_exten.cierre_fecha.getText()+"' and ci_estado = '1'  order by cbdeta_id desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
                            
                            DecimalFormat formatea = new DecimalFormat("###,###,###.##");
                            
				reg[0]=rs.getString("cbdeta_id");
                                reg[1]=rs.getString("cbdeta_cli_id");
                                reg[2]=formatea.format(rs.getInt("cbdeta_montopago"));
                               // reg[2]=rs.getString("cbdeta_montopago");
                                reg[3]=rs.getString("cbdeta_fecha");
                                reg[4]=rs.getString("cbdeta_nrocobranza");
				          
				mod.addRow(reg);
			}
			caja_exten.jtable_cobranzacierre.setModel(mod);
                        
                           rs.close();
                            st.close();
                            con.close(); 
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		caja_exten.jtable_cobranzacierre.setAutoResizeMode(caja_exten.jtable_cobranzacierre.AUTO_RESIZE_OFF);
		caja_exten.jtable_cobranzacierre.doLayout();
		JTABLE_TAMANHO_detCREDITO();
		//////////////////////////////////////////////////
	}
                        
                        
                public static void JTABLE_TAMANHO_detCREDITO() {
		
                TableColumnModel columnModel = caja_exten.jtable_cobranzacierre.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(50);
                columnModel.getColumn(1).setPreferredWidth(100);
    
                columnModel.getColumn(2).setPreferredWidth(90);
                columnModel.getColumn(3).setPreferredWidth(80);
                columnModel.getColumn(4).setPreferredWidth(70);
    
                } 
              
                public static void mostrar_monto_credito(){
                    
                     //////////////////////////////suma total guaranies--------------------------------------.
                Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
                     String suma123="select SUM(vta_montogs) from venta where vta_fecha>='"+caja_exten.cierre_fecha.getText()+"' and vta_fecha<='"+caja_exten.cierre_fecha.getText()+"' and vta_condicion = 'CREDITO' and vta_anulado = 1 and ci_estado = '1' ";
                     try {
                      st = con.createStatement();
                      ResultSet rs=st.executeQuery(suma123);
                         if(rs.next())
                         {
                              caja_exten.credito_total.setText(rs.getString("sum"));
                              caja_exten.credito_uso.setText(rs.getString("sum"));
                              
                 
                         }
                             if (  (caja_exten.credito_total.getText().length()==0) && (caja_exten.credito_total != null) && (!caja_exten.credito_total.equals(" ")) ) {
                                     caja_exten.credito_total.setText("0");
                                     caja_exten.credito_uso.setText("0");
                                     //JOptionPane.showMessageDialog(this, "No dejar campos Vacíos", "Error!", JOptionPane.ERROR_MESSAGE);   
                             }else{
                                         DecimalFormat formatea = new DecimalFormat("###,###,###.##");
                                         String guarani = caja_exten.credito_total.getText();
                                         int entero1 = parseInt(guarani); 
                                         caja_exten.credito_total.setText(formatea.format(entero1));
                             }
                             
                            rs.close();
                            st.close();
                            con.close(); 
                     } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "error" + ex);
                     } 
                     /////////////////////////////////////////////////////////////////---------------------
                    
                }///fin public static void mostrar_monto_credito(){

    
                public static void mostrar_monto_contado(){
                    
                 //////////////////////////////suma total guaranies--------------------------------------.
                Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
                     String suma13="select SUM(vta_montogs) from venta where vta_fecha>='"+caja_exten.cierre_fecha.getText()+"' and vta_fecha<='"+caja_exten.cierre_fecha.getText()+"' and vta_condicion = 'CONTADO' and vta_anulado = 1 and ci_estado = '1' ";
                     try {
                      st = con.createStatement();
                      ResultSet rs=st.executeQuery(suma13);
                         if(rs.next())
                         {
                              caja_exten.caja_contado.setText(rs.getString("sum"));
                              caja_exten.contado_suma.setText(rs.getString("sum"));
                              

                         }
                             if ( (caja_exten.caja_contado.getText().length()==0) && (caja_exten.caja_contado != null) && (!caja_exten.caja_contado.equals(" ")) ) {
                                     caja_exten.caja_contado.setText("0");
                                     caja_exten.contado_suma.setText("0");
                                     //JOptionPane.showMessageDialog(this, "No dejar campos Vacíos", "Error!", JOptionPane.ERROR_MESSAGE);   
                             }else{
                                         DecimalFormat formatea = new DecimalFormat("###,###,###.##");
                                         String guarani = caja_exten.caja_contado.getText();
                                         int entero1 = parseInt(guarani); 
                                         caja_exten.caja_contado.setText(formatea.format(entero1));
                             }
                            rs.close();
                            st.close();
                            con.close(); 
                     } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error no se encontro venta" + ex);
                     } 
                     /////////////////////////////////////////////////////////////////---------------------
                    
                }
                
                public static void mostrar_monto_ingreso(){
                    
                /////////////////////////////suma total guaranies--------------------------------------.
                Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
                     String suma13="select SUM(ing_montogs) from ingreso where ing_fecha>='"+caja_exten.cierre_fecha.getText()+"' and ing_fecha<='"+caja_exten.cierre_fecha.getText()+"' and ci_estado = '1' ";
                     try {
                      st = con.createStatement();
                      ResultSet rs=st.executeQuery(suma13);
                         if(rs.next())
                         {
                              caja_exten.ingreso_dinero.setText(rs.getString("sum"));
                              caja_exten.ingreso_suma.setText(rs.getString("sum"));
                               

                         }
                         
                           // caja_exten.INGRESO.setText("0");
                           // caja_exten.ingreso_suma.setText("0");
                         
                             if ( (caja_exten.ingreso_dinero.getText().length()==0) && (caja_exten.ingreso_dinero != null) ) {
                                     caja_exten.ingreso_dinero.setText("0");
                                     caja_exten.ingreso_suma.setText("0");
                                     //JOptionPane.showMessageDialog(this, "No dejar campos Vacíos", "Error!", JOptionPane.ERROR_MESSAGE);   
                             }else{
                                         DecimalFormat formatea = new DecimalFormat("###,###,###.##");
                                         String guarani = caja_exten.ingreso_dinero.getText();
                                         int entero1 = parseInt(guarani); 
                                         caja_exten.ingreso_dinero.setText(formatea.format(entero1));
                             }

                             
                            rs.close();
                            st.close();
                            con.close(); 
                     } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "error" + ex);
                     } 
                     /////////////////////////////////////////////////////////////////---------------------
                    
                }
                
                public static void mostrar_monto_cobranza(){
                    
                /////////////////////////////suma total guaranies--------------------------------------.
                Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
                     String suma13="select SUM(cbdeta_montopago) from detcobranza where cbdeta_fecha>='"+caja_exten.cierre_fecha.getText()+"' and cbdeta_fecha<='"+caja_exten.cierre_fecha.getText()+"' and ci_estado = '1'  ";
                     try {
                      st = con.createStatement();
                      ResultSet rs=st.executeQuery(suma13);
                         if(rs.next())
                         {
                              caja_exten.cobranza_caja.setText(rs.getString("sum"));
                              caja_exten.cobranzas_suma_ingreso.setText(rs.getString("sum"));

                         }
                             if ( (caja_exten.cobranza_caja.getText().length()==0) && (caja_exten.cobranza_caja != null) && (!caja_exten.cobranza_caja.equals(" ")) ) {
                                     caja_exten.cobranza_caja.setText("0");
                                     caja_exten.cobranzas_suma_ingreso.setText("0");
                                     
                                     //JOptionPane.showMessageDialog(this, "No dejar campos Vacíos", "Error!", JOptionPane.ERROR_MESSAGE);   
                             }else{
                                         DecimalFormat formatea = new DecimalFormat("###,###,###.##");
                                         String guarani = caja_exten.cobranza_caja.getText();
                                         int entero1 = parseInt(guarani); 
                                         caja_exten.cobranza_caja.setText(formatea.format(entero1));
                             }
                            rs.close();
                            st.close();
                            con.close(); 
                     } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "error" + ex);
                     } 
                     /////////////////////////////////////////////////////////////////---------------------
                    
                }

                //////////////////////////////////GASTOS/////////////////////////////////////////////////
                
                public static void CARGAR_JTABLE_gasto_CAJA() {
            
		String[] titulo={"ID","Fecha","Caja","MontoGS","Obs","Operador"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
                //String sql="SELECT * FROM tmpdetallevta order by detvta_id desc";
		String sql="SELECT * FROM gastos  where gas_fecha>='"+caja_exten.cierre_fecha.getText()+"' and gas_fecha<='"+caja_exten.cierre_fecha.getText()+"' and ci_estado = '1' order by gas_id desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
                            
                                 DecimalFormat formatea = new DecimalFormat("###,###,###.##");

				reg[0]=rs.getString("gas_id");
                                reg[1]=rs.getString("gas_fecha");
                               
				reg[2]=rs.getString("gas_cajades");
                                reg[3]=formatea.format(rs.getInt("gas_montogs"));
                                //reg[4]=rs.getString("gas_montogs");
                                reg[4]=rs.getString("gas_obs");
                                reg[5]=rs.getString("gas_usuario");
				          
				mod.addRow(reg);
			}
			caja_exten.JTABLE_GASTO_CAJA.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		caja_exten.JTABLE_GASTO_CAJA.setAutoResizeMode(caja_exten.JTABLE_GASTO_CAJA.AUTO_RESIZE_OFF);
		caja_exten.JTABLE_GASTO_CAJA.doLayout();
		JTABLE_TAMANHO_gasto();
		//////////////////////////////////////////////////
	}
                        
                        
                public static void JTABLE_TAMANHO_gasto() {
		
                TableColumnModel columnModel = caja_exten.JTABLE_GASTO_CAJA.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(30);
                columnModel.getColumn(1).setPreferredWidth(80);
               
                columnModel.getColumn(2).setPreferredWidth(100);
                columnModel.getColumn(3).setPreferredWidth(100);
                columnModel.getColumn(4).setPreferredWidth(200);
                columnModel.getColumn(5).setPreferredWidth(150);
             
    
                }
                
                
                //////////------------------------------------------------------------------
                
                public static void mostrar_monto_egreso(){
                    
                /////////////////////////////suma total guaranies--------------------------------------.
                Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
                     String suma143="select SUM(gas_montogs) from gastos where gas_fecha>='"+caja_exten.cierre_fecha.getText()+"' and gas_fecha<='"+caja_exten.cierre_fecha.getText()+"' and ci_estado = '1'   ";
                     try {
                      st = con.createStatement();
                      ResultSet rs=st.executeQuery(suma143);
                         if(rs.next())
                         {
                              caja_exten.gasto_caja.setText(rs.getString("sum"));
                              caja_exten.gasto_caja_suma.setText(rs.getString("sum"));
                               

                         }
                         
                           // caja_exten.INGRESO.setText("0");
                           // caja_exten.ingreso_suma.setText("0");
                         
                             if ( (caja_exten.gasto_caja.getText().length()==0) && (caja_exten.gasto_caja != null) ) {
                                     caja_exten.gasto_caja.setText("0");
                                     caja_exten.gasto_caja_suma.setText("0");
                                     //JOptionPane.showMessageDialog(this, "No dejar campos Vacíos", "Error!", JOptionPane.ERROR_MESSAGE);   
                             }else{
                                         DecimalFormat formatea = new DecimalFormat("###,###,###.##");
                                         String guarani = caja_exten.gasto_caja.getText();
                                         int entero1 = parseInt(guarani); 
                                         caja_exten.gasto_caja.setText(formatea.format(entero1));
                             }

                            rs.close();
                            st.close();
                            con.close(); 
                     } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "error" + ex);
                     } 
                     /////////////////////////////////////////////////////////////////---------------------
                    
                }
                
                /////////////////////////////////////////////////////////////////////////////////////////
                
                
               public static void mostrar_estado(){
                    
                /////////////////////////////suma total guaranies--------------------------------------.
                Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
                     String suma143="select * from cierrecaja where ci_nro>='"+caja_exten.id.getText()+"' and ci_fechaape<='"+caja_exten.cierre_fecha.getText()+"'  ";
                     try {
                      st = con.createStatement();
                      ResultSet rs=st.executeQuery(suma143);
                         if(rs.next())
                         {
                              caja_exten.estado_txt.setText(rs.getString("ci_estado"));

                         }

                        String est= "1";
                        
                             if ( (caja_exten.estado_txt.getText().length()==0) && (caja_exten.estado_txt != null)) {
                                   caja_exten.cierre_caja_button.setEnabled(false);
                                   caja_exten.jButton2.setEnabled(true);
                                   
                                     //JOptionPane.showMessageDialog(this, "No dejar campos Vacíos", "Error!", JOptionPane.ERROR_MESSAGE);   
                             }else if(caja_exten.estado_txt.getText() == est) {
                                         caja_exten.cierre_caja_button.setEnabled(false);
                                         caja_exten.jButton2.setEnabled(true);
                             }else{
                                 caja_exten.cierre_caja_button.setEnabled(true);
                                 caja_exten.jButton2.setEnabled(false);
                                 
                               
                         
                                            caja_exten.credito_total.setText("0");
                                            caja_exten.cobranza_caja.setText("0");
                                            caja_exten.ingreso_dinero.setText("0");
                                            caja_exten.caja_contado.setText("0");
                                            caja_exten.credito_uso.setText("0");
                                            caja_exten.cobranzas_suma_ingreso.setText("0");
                                           caja_exten.ingreso_suma.setText("0");
                                            caja_exten.contado_suma.setText("0");
                                           
                                            caja_exten.gasto_caja_suma.setText("0");
                                            caja_exten.INGRESO_CAJA.setText("0");
                                            caja_exten.CAJA_TOTAL.setText("0");
                                            caja_exten.EGRESO.setText("0");

                                        caja_exten.jButton2.setEnabled(true);
                                        caja_exten.cierre_caja_button.setEnabled(false);

                                        caja_exten.jTable_contado.setModel(new DefaultTableModel());
                                        caja_exten.jTable_Credito.setModel(new DefaultTableModel());
                                        caja_exten.jtable_cobranzacierre.setModel(new DefaultTableModel());
                                        caja_exten.JTABLE_GASTO_CAJA.setModel(new DefaultTableModel());
                                        caja_exten.jTable_ingreso.setModel(new DefaultTableModel());
                                 
                                 
                             }

                            rs.close();
                            st.close();
                            con.close(); 
                     } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "error" + ex);
                     } 
                     /////////////////////////////////////////////////////////////////---------------------
                    
                }
               
               
                public static void mostrar_ultimocierre(){
                    
                /////////////////////////////suma total guaranies--------------------------------------.
                Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
                     String suma143="select ci_fechacierre from cierrecaja where  ci_estado = '2' order by ci_id desc limit 1 ";
                     try {
                      st = con.createStatement();
                      ResultSet rs=st.executeQuery(suma143);
                         if(rs.next())
                         {
                              caja_exten.fechacierrefin.setText(rs.getString("ci_fechacierre"));

                         }

                            rs.close();
                            st.close();
                            con.close(); 
                     } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "error" + ex);
                     } 
                     /////////////////////////////////////////////////////////////////---------------------
                    
                }
               

                
               public static void mostrar_apertura_cierre(){
                    
                /////////////////////////////suma total guaranies--------------------------------------.
                Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
                     String suma13="select ci_estado from cierrecaja order by ci_id desc limit 1  ";
                     try {
                      st = con.createStatement();
                      ResultSet rs=st.executeQuery(suma13);
                         if(rs.next())
                         {
                              caja_exten.estado_txt.setText(rs.getString("ci_estado"));
 
                         }
                         

                             String est= "1";
                             String est2="2";
                             
                             if (est.equals(caja_exten.estado_txt.getText()) ==true){
                                      caja_exten.cierre_caja_button.setEnabled(true);
                                      caja_exten.jButton2.setEnabled(false);
                             }else{
                                            caja_exten.cierre_caja_button.setEnabled(false);
                                            caja_exten.jButton2.setEnabled(true);
                                 
                               
                         
                                            caja_exten.credito_total.setText("0");
                                            caja_exten.cobranza_caja.setText("0");
                                            caja_exten.ingreso_dinero.setText("0");
                                            caja_exten.caja_contado.setText("0");
                                            caja_exten.credito_uso.setText("0");
                                            caja_exten.cobranzas_suma_ingreso.setText("0");
                                           caja_exten.ingreso_suma.setText("0");
                                            caja_exten.contado_suma.setText("0");
                                           
                                            caja_exten.gasto_caja_suma.setText("0");
                                            caja_exten.INGRESO_CAJA.setText("0");
                                            caja_exten.CAJA_TOTAL.setText("0");
                                            caja_exten.EGRESO.setText("0");

                   

                                        caja_exten.jTable_contado.setModel(new DefaultTableModel());
                                        caja_exten.jTable_Credito.setModel(new DefaultTableModel());
                                        caja_exten.jtable_cobranzacierre.setModel(new DefaultTableModel());
                                        caja_exten.JTABLE_GASTO_CAJA.setModel(new DefaultTableModel());
                                        caja_exten.jTable_ingreso.setModel(new DefaultTableModel());
                                 
                             }
                             
                             
                        
                        /*     if(caja_exten.estado_txt.getText() == est) {
                                         caja_exten.cierre_caja_button.setEnabled(true);
                                         caja_exten.jButton2.setEnabled(false);
                             }else{
                                 JOptionPane.showMessageDialog(null, "no encontro 1" );
                             }
                             
                             if(caja_exten.estado_txt.getText() == est2){
                                 caja_exten.cierre_caja_button.setEnabled(false);
                                 caja_exten.jButton2.setEnabled(true);
                                 
                               
                         
                                            caja_exten.credito_total.setText("0");
                                            caja_exten.cobranza_caja.setText("0");
                                            caja_exten.ingreso_dinero.setText("0");
                                            caja_exten.caja_contado.setText("0");
                                            caja_exten.credito_uso.setText("0");
                                            caja_exten.cobranzas_suma_ingreso.setText("0");
                                           caja_exten.ingreso_suma.setText("0");
                                            caja_exten.contado_suma.setText("0");
                                           
                                            caja_exten.gasto_caja_suma.setText("0");
                                            caja_exten.INGRESO_CAJA.setText("0");
                                            caja_exten.CAJA_TOTAL.setText("0");
                                            caja_exten.EGRESO.setText("0");

                   

                                        caja_exten.jTable_contado.setModel(new DefaultTableModel());
                                        caja_exten.jTable_Credito.setModel(new DefaultTableModel());
                                        caja_exten.jtable_cobranzacierre.setModel(new DefaultTableModel());
                                        caja_exten.JTABLE_GASTO_CAJA.setModel(new DefaultTableModel());
                                        caja_exten.jTable_ingreso.setModel(new DefaultTableModel());
                                 
                                 
                             }else{
                                 JOptionPane.showMessageDialog(null, "no encontro 2" );
                             }
*/
                            rs.close();
                            st.close();
                            con.close(); 
                     } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "error" + ex);
                     } 
                     
                     }
                     /////////////////////////////////////////////////////////////////---------------------
                
            //////////////////////////////////historico/////////////////////////////////////////////////
                
                public static void CARGAR_JTABLE_HISTORICO() {
            
		String[] titulo={"Nro","Fecha Apertura","Fecha Cierre","Total Ingresos","Total Egresos","Total Caja" ,"Usuario","Monto Apertura"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[8];
                //String sql="SELECT * FROM tmpdetallevta order by detvta_id desc";
		String sql="SELECT * FROM cierrecaja order by ci_nro desc";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
                            
                                 DecimalFormat formatea = new DecimalFormat("###,###,###.##");

				reg[0]=rs.getString("ci_nro");
                                reg[1]=rs.getString("ci_fechaape");
				reg[2]=rs.getString("ci_fechacierre");
                                reg[3]=formatea.format(rs.getInt("ci_totalingreso"));
                                reg[4]=formatea.format(rs.getInt("ci_totalegreso"));
                               reg[5]=formatea.format(rs.getInt("ci_totalcaja"));
                                
                                reg[6]=rs.getString("ci_usuariocierre");
                                reg[7]=formatea.format(rs.getInt("ci_montoaper"));
                             
				          
				mod.addRow(reg);
			}
			caja_exten.jTable_historico.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		caja_exten.jTable_historico.setAutoResizeMode(caja_exten.jTable_historico.AUTO_RESIZE_OFF);
		caja_exten.jTable_historico.doLayout();
		JTABLE_TAMANHO_HISTORICO();
		//////////////////////////////////////////////////
	}
                        
                        
                public static void JTABLE_TAMANHO_HISTORICO() {
		
                TableColumnModel columnModel = caja_exten.jTable_historico.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(40);
                columnModel.getColumn(1).setPreferredWidth(100);
               
                columnModel.getColumn(2).setPreferredWidth(100);
                columnModel.getColumn(3).setPreferredWidth(100);
                columnModel.getColumn(4).setPreferredWidth(100);
                columnModel.getColumn(5).setPreferredWidth(100);
                columnModel.getColumn(6).setPreferredWidth(200);
             columnModel.getColumn(7).setPreferredWidth(100);
    
                }
               
                
}///FIN
