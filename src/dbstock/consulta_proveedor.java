/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;

import static dbstock.metodos.st;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author DerlisLM
 */
public class consulta_proveedor extends javax.swing.JFrame {

    private Color defaultColor;
    private Color mouseOverColor;

    /**
     * Creates new form consulta_vendedor
     */
    public consulta_proveedor() {
        initComponents();
        
        this.setLocationRelativeTo(null);//centra el formulario
        this.setTitle("Consulta Proveedor");
        setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE); //inabilida el uso del boton exit X
        this.setResizable(false); //Disable the Resize Button
        
        Calendar Cal12= Calendar.getInstance();
        fecha_fin1.setCalendar(Cal12);
        fecha_ini1.setCalendar(Cal12);
        
        id.setVisible(false);
               
      	Conexion cc=new Conexion();
	Connection con=cc.conectar();;
        String vtagsus="select * from proveedores";
	try {
        cmb_proveedor.removeAllItems();
	st = con.createStatement();
	ResultSet rs=st.executeQuery(vtagsus);
        
		try {
			while(rs.next()){

                                cmb_proveedor.addItem(rs.getString(2));
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
    
    
  
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fecha_ini1 = new com.toedter.calendar.JDateChooser();
        fecha_fin1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        cmb_proveedor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_proveedor = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        mont = new javax.swing.JLabel();
        cant = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("HASTA:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 50, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setText("CONSULTA DE VENTAS POR PROVEEDOR");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Seleccione Proveedor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 190, 20));

        fecha_ini1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fecha_ini1KeyPressed(evt);
            }
        });
        getContentPane().add(fecha_ini1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 130, 30));

        fecha_fin1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fecha_fin1KeyPressed(evt);
            }
        });
        getContentPane().add(fecha_fin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 130, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setText("Desde:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 30));

        cmb_proveedor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cmb_proveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_proveedorActionPerformed(evt);
            }
        });
        cmb_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmb_proveedorKeyPressed(evt);
            }
        });
        getContentPane().add(cmb_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 190, 30));

        jTable_proveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_proveedorKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_proveedor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 700, 250));

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/agent.png"))); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 120, 40));

        mont.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(mont, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 130, 20));

        cant.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 70, 20));

        btn_salir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/exit.png"))); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        btn_salir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_salirKeyPressed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 100, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Cantidad:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Monto:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        id.setText("id");
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 120, 20));

        jPanel1.setBackground(new java.awt.Color(229, 229, 229));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 410, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/printer14.png"))); // NOI18N
        jButton3.setText("Imprimir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 120, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/ayuda.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, 20));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel9.setText("Buscar por Fecha");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, 20));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 700, 90));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/fondosistema.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void cmb_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_proveedorActionPerformed
                Conexion cc=new Conexion();
		Connection con=cc.conectar();

                String prov="select * from proveedores where pro_empresa = '"+cmb_proveedor.getSelectedItem()+"'";
                try {
                //consulta_vta.cmb_suc.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(prov);

			while(rs.next()){
                         id.setText(rs.getString("pro_empresa"));
			}
	
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
    }//GEN-LAST:event_cmb_proveedorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        String[] titulo={"Nro Factura","Descripci??n","Cantidad","Precio Total","Fecha","Proveedor"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[8];
		String sql="select * from detallevta where detvta_proveedor = '"+cmb_proveedor.getSelectedItem()+"' and detvta_fecha>='"+fecha_ini1.getDate()+"' and detvta_fecha<='"+fecha_fin1.getDate()+"'  ORDER BY detvta_id DESC";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
                            
                            DecimalFormat formatea = new DecimalFormat("###,###,###.##");
				reg[0]=rs.getString("detvta_num_deta");
                                reg[1]=rs.getString("detvta_nomb_pro");
                                reg[2]=rs.getString("detvta_cant");
                                reg[3]=formatea.format(rs.getInt("detvta_preciototal"));
                                //reg[3]=rs.getString("detvta_preciototal");
                                reg[4]=rs.getString("detvta_fecha");
                                reg[5]=rs.getString("detvta_proveedor");


				mod.addRow(reg);
			}
			jTable_proveedor.setModel(mod);
                        
                        metodoproducto.alignRight_proveedor(jTable_proveedor, NORMAL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//forma de quetenga la barra orizontal////////////
		jTable_proveedor.setAutoResizeMode(jTable_proveedor.AUTO_RESIZE_OFF);
		jTable_proveedor.doLayout();
                
                TableColumnModel columnModel = jTable_proveedor.getColumnModel();
                columnModel.getColumn(0).setPreferredWidth(80);
                columnModel.getColumn(1).setPreferredWidth(180);
                columnModel.getColumn(2).setPreferredWidth(80);
                columnModel.getColumn(3).setPreferredWidth(100);
                columnModel.getColumn(4).setPreferredWidth(90);
                columnModel.getColumn(5).setPreferredWidth(140);

                
                
                ///////////////////////////////suma total guaranies--------------------------------------
        String suma="select SUM(detvta_preciototal) from detallevta where detvta_proveedor = '"+cmb_proveedor.getSelectedItem()+"' and detvta_fecha>='"+fecha_ini1.getDate()+"' and detvta_fecha<='"+fecha_fin1.getDate()+"' ";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma);
            if(rs.next())
            {
                 mont.setText(rs.getString("sum"));
                      
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        } 
        /////////////////////////////////////////////////////////////////---------------------
                         ///////////////////////////////suma total guaranies--------------------------------------
        String count="select count(*) from detallevta where detvta_proveedor = '"+cmb_proveedor.getSelectedItem()+"' and detvta_fecha>='"+fecha_ini1.getDate()+"' and detvta_fecha<='"+fecha_fin1.getDate()+"' ";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(count);
            if(rs.next())
            {
                 cant.setText(rs.getString("count"));
                      
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        }       
        ////////////////////////////////////////////////////////////////////////////////////////////////////////        
        
        
               //////////////////////////////////////////////////
            
        String cadena1;
        int entero1;
        cadena1 = mont.getText();
        entero1 = parseInt(cadena1);  

        DecimalFormat formatea = new DecimalFormat("###,###,###,###.##");

        mont.setText(formatea.format(entero1));
            
            //////////////////////////////////////////////////////
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                Conexion cc=new Conexion();
		Connection con=cc.conectar();
////////////////////////////////imprimir/////////////////////////////////

                   try {
                URL master = this.getClass().getResource("/reporte/report_proveedor.jasper");
                System.out.println("master" + master);
              //  JOptionPane.showMessageDialog(null, "Mensaje  "+ master);
                if (master == null) {
                    System.out.println("No se encontro el archivo");                   
                    System.exit(0);
                }
                
                JasperReport masterreport = null;
                try {
                    masterreport = (JasperReport) JRLoader.loadObject(master);
          
                } catch (Exception e) {
                    System.out.println("error al cargar reporte " + e.getMessage()); 
                    JOptionPane.showMessageDialog(null, "Mensaje1  "+ e);
                }
                    Map parametros= new HashMap();

                    Date dateStarting  = (Date) fecha_ini1.getDate();
                    Date dateEnding    = (Date) fecha_fin1.getDate();
                    
                    parametros.put("fechaini", dateStarting );
                    parametros.put("fechafin", dateEnding );
                    parametros.put("vendedor", cmb_proveedor.getSelectedItem());
                     //parametros.put("total_sum", mont.getText()); //si es string
                   // parametros.put("total_sum", Integer.parseInt(mont.getText()));
                    //parametros.put("total_cant", Integer.parseInt(cant.getText()));
                   
               
                    JasperPrint print = JasperFillManager.fillReport(masterreport, parametros, con);
                    JasperViewer ver = new JasperViewer(print,false);
                    ver.setTitle("Listado de Ventas por Vendedor");
                    ver.setVisible(true);
            } catch (Exception e) {
                System.out.println("reporte.reporte.Reportefichaupdate()" + e);
                JOptionPane.showMessageDialog(null, "Mensaje  "+ e);
            }    
         
         ///////////////////////////////////////////////////////////////////////////
    }//GEN-LAST:event_jButton3ActionPerformed

    private void fecha_ini1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fecha_ini1KeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_salir.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_ini1KeyPressed

    private void fecha_fin1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fecha_fin1KeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_salir.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_fin1KeyPressed

    private void cmb_proveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_proveedorKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_salir.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_proveedorKeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_salir.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyPressed

    private void jTable_proveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_proveedorKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_salir.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_proveedorKeyPressed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_salir.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3KeyPressed

    private void btn_salirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_salirKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_salir.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salirKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(consulta_proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consulta_proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consulta_proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consulta_proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consulta_proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel cant;
    private javax.swing.JComboBox<String> cmb_proveedor;
    private com.toedter.calendar.JDateChooser fecha_fin1;
    private com.toedter.calendar.JDateChooser fecha_ini1;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_proveedor;
    private javax.swing.JLabel mont;
    // End of variables declaration//GEN-END:variables
}
