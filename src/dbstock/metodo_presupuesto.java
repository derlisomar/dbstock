/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;

import static dbstock.metodoproducto.st;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author DerlisLM
 */
public class metodo_presupuesto {
    
    
      public static void generar_nro_presupuesto(){
        int j;
        int cont=1;
        String num="";
        String c="";
        
        Conexion cc=new Conexion();
	Connection con=cc.conectar();
         String sql="select max(vta_id) from presupuesto";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sql);
            if(rs.next())
            {
                 c=rs.getString(1);
            }
            if(c==null){
                presupuestos.boleta_vta.setText("00000001");
            }
            else{
                 j=Integer.parseInt(c);
                 GenerarNumero gen= new GenerarNumero();
                 gen.generar(j);
                 presupuestos.boleta_vta.setText(gen.serie());
            }

        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
      
      /////////////////////////////////////////////////////////////////////////////////
          public static void generar_nro_presupuesto_uno(){
        int j;
        int cont=1;
        String num="";
        String c="";
        
        Conexion cc=new Conexion();
	Connection con=cc.conectar();
         String sql="select max(vta_id) from presupuesto";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sql);
            if(rs.next())
            {
                 c=rs.getString(1);
            }
            if(c==null){
                presupuestos.ida.setText("1");
            }
            else{
                        presupuestos.ida.setText(rs.getString("max"));
                                 
                        String importe1,lolo;
                        int importe  ,suma;
                        importe1 = presupuestos.ida.getText();
                        importe = parseInt(importe1); 

                        suma = importe + 1;
                        
                        lolo = Integer.toString(suma);
                        presupuestos.ida.setText(lolo); 
            }

        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
      //////////////////////////////////////////////////////////////////////////////////
    
      /////////////////////////////////////////////////////////////////////////////////
                public static void CARGAR_JTABLE_productos_presupuestos() {
            
		String[] titulo={"Codigo","Descripción","Prec. Vta","Prec. Mayorista","Stock"};
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
				reg[2]=rs.getString("pro_precioventa");
                                reg[3]=rs.getString("pro_preciomayorista");
                                reg[4]=rs.getString("pro_stock");
				          
				mod.addRow(reg);
			}
			presupuestos.jTable_productos.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		presupuestos.jTable_productos.setAutoResizeMode(presupuestos.jTable_productos.AUTO_RESIZE_OFF);
		presupuestos.jTable_productos.doLayout();
		JTABLE_TAMANHO_presupuesto();
		//////////////////////////////////////////////////
	}
                
                public static void JTABLE_TAMANHO_presupuesto() {
		
                TableColumnModel columnModel = presupuestos.jTable_productos.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(70);
                columnModel.getColumn(1).setPreferredWidth(300);
                columnModel.getColumn(2).setPreferredWidth(130);
                columnModel.getColumn(3).setPreferredWidth(130);
                columnModel.getColumn(4).setPreferredWidth(100);
       
            	}
      ////////////////////////////////////////////////////////////////////////////////    
          
      //////////////////////////////////////////////////////////////////////////////////
                
                 public static void CARGAR_JTABLE_vtadetalle_presupuesto() {
            
		String[] titulo={"ID","Codigo","Descripción","Cantidad","Precio","Total","Proveedor"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
                //String sql="SELECT * FROM tmpdetallevta order by detvta_id desc";
		String sql="SELECT * FROM tmpdetpresu where detvta_caja = '"+presupuestos.txt_caja.getText()+"' and detvta_suc = '"+presupuestos.sucursal_vta.getText()+"' and detvta_num_deta = '"+presupuestos.ida.getText()+"' order by detvta_id desc";
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
			presupuestos.jtable_vtadetalle.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"ERROR" + e);
		}
		//forma de quetenga la barra orizontal////////////
		presupuestos.jtable_vtadetalle.setAutoResizeMode(presupuestos.jtable_vtadetalle.AUTO_RESIZE_OFF);
		presupuestos.jtable_vtadetalle.doLayout();
		JTABLE_TAMANHO_vtadetalle_presupuesto();
		//////////////////////////////////////////////////
	}
                        
                        
                public static void JTABLE_TAMANHO_vtadetalle_presupuesto() {
		
                TableColumnModel columnModel = presupuestos.jtable_vtadetalle.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(40);
                columnModel.getColumn(1).setPreferredWidth(100);
                columnModel.getColumn(2).setPreferredWidth(273);
                columnModel.getColumn(3).setPreferredWidth(60);
                columnModel.getColumn(4).setPreferredWidth(110);
                columnModel.getColumn(5).setPreferredWidth(110);
                columnModel.getColumn(6).setPreferredWidth(180);
    
                }    
      /////////////////////////////////////////////////////////////////////////////////          
    
    
}
