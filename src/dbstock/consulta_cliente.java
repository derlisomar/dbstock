/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;

import static dbstock.metodos.st;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class consulta_cliente extends javax.swing.JFrame {

    /**
     * Creates new form consulta_vendedor
     */
    public consulta_cliente() {
        initComponents();
        
        this.setLocationRelativeTo(null);//centra el formulario
        this.setTitle("Consulta de Clientes");
        setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE); //inabilida el uso del boton exit X
        this.setResizable(false); //Disable the Resize Button
        
        Calendar Cal12= Calendar.getInstance();
        fecha_fin1.setCalendar(Cal12);
        fecha_ini1.setCalendar(Cal12);
        
        id.setVisible(false);
               
      	Conexion cc=new Conexion();
	Connection con=cc.conectar();;
        String vtagsus="select * from clientes";
	try {
        cmb_cliente.removeAllItems();
	st = con.createStatement();
	ResultSet rs=st.executeQuery(vtagsus);
        
		try {
			while(rs.next()){

                                cmb_cliente.addItem(rs.getString(3));
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
        cmb_cliente = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_cliente = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        mont = new javax.swing.JLabel();
        cant = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("FECHA HASTA:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 60, 110, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setText("CONSULTA DE VENTAS POR CLIENTE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Seleccione Cliente");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));
        getContentPane().add(fecha_ini1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, -1));
        getContentPane().add(fecha_fin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 130, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("FECHA DESDE:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        cmb_cliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmb_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 200, -1));

        jTable_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_cliente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 670, 220));

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/agent.png"))); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 120, 40));

        mont.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(mont, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 130, 20));

        cant.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 70, 20));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/exit.png"))); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 100, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Cantidad:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Monto:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, -1));

        id.setText("id");
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 30, 20));

        jPanel1.setBackground(new java.awt.Color(229, 229, 229));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 410, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/printer14.png"))); // NOI18N
        jButton3.setText("Imprimir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 120, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/fondosistema.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmb_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_clienteActionPerformed
                Conexion cc=new Conexion();
		Connection con=cc.conectar();

                String prov="select * from clientes where cli_nombre = '"+cmb_cliente.getSelectedItem()+"'";
                try {
                //consulta_vta.cmb_suc.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(prov);

			while(rs.next()){
                         id.setText(rs.getString("cli_cedula"));
			}
	
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
    }//GEN-LAST:event_cmb_clienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        String[] titulo={"id Venta","Fecha","CI/RUC","Cliente","Monto","Vendedor","Condici??n","Item"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[8];
		String sql="select * from venta where vta_cliente_nom = '"+cmb_cliente.getSelectedItem()+"' and vta_fecha>='"+fecha_ini1.getDate()+"' and vta_fecha<='"+fecha_fin1.getDate()+"' and vta_anulado = 1  ORDER BY vta_num_deta DESC";
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				reg[0]=rs.getString("vta_codigo");
                                reg[1]=rs.getString("vta_fecha");
                                reg[2]=rs.getString("vta_cliente_id");
                                reg[3]=rs.getString("vta_cliente_nom");
                                reg[4]=rs.getString("vta_montogs");
                                reg[5]=rs.getString("vta_vendedor");
                                reg[6]=rs.getString("vta_condicion");
                                reg[7]=rs.getString("vta_cant");

				mod.addRow(reg);
			}
			jTable_cliente.setModel(mod);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//forma de quetenga la barra orizontal////////////
		jTable_cliente.setAutoResizeMode(jTable_cliente.AUTO_RESIZE_OFF);
		jTable_cliente.doLayout();
                
                TableColumnModel columnModel = jTable_cliente.getColumnModel();
                columnModel.getColumn(0).setPreferredWidth(80);
                columnModel.getColumn(1).setPreferredWidth(80);
                columnModel.getColumn(2).setPreferredWidth(100);
                columnModel.getColumn(3).setPreferredWidth(150);
                columnModel.getColumn(4).setPreferredWidth(80);
                columnModel.getColumn(5).setPreferredWidth(150);
                columnModel.getColumn(6).setPreferredWidth(70);
                columnModel.getColumn(7).setPreferredWidth(50);
                
                
                ///////////////////////////////suma total guaranies--------------------------------------
        String suma="select SUM(vta_montogs) from venta where vta_cliente_nom = '"+cmb_cliente.getSelectedItem()+"' and vta_fecha>='"+fecha_ini1.getDate()+"' and vta_fecha<='"+fecha_fin1.getDate()+"' and vta_anulado = 1 ";
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
        String count="select count(*) from venta where vta_cliente_nom = '"+cmb_cliente.getSelectedItem()+"' and vta_fecha>='"+fecha_ini1.getDate()+"' and vta_fecha<='"+fecha_fin1.getDate()+"' and vta_anulado = 1 ";
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
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                Conexion cc=new Conexion();
		Connection con=cc.conectar();
////////////////////////////////imprimir/////////////////////////////////

                   try {
                URL master = this.getClass().getResource("/reporte/report_cliente.jasper");
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
                    parametros.put("vendedor", cmb_cliente.getSelectedItem());
                     //parametros.put("total_sum", mont.getText()); //si es string
                    parametros.put("total_sum", Integer.parseInt(mont.getText()));
                    parametros.put("total_cant", Integer.parseInt(cant.getText()));
                   
               
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
            java.util.logging.Logger.getLogger(consulta_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consulta_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consulta_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consulta_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consulta_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cant;
    private javax.swing.JComboBox<String> cmb_cliente;
    private com.toedter.calendar.JDateChooser fecha_fin1;
    private com.toedter.calendar.JDateChooser fecha_ini1;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_cliente;
    private javax.swing.JLabel mont;
    // End of variables declaration//GEN-END:variables
}
