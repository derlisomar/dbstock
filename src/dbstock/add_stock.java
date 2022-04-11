/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;

import com.sun.awt.AWTUtilities;
import static dbstock.metodoproducto.st;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Derlis
 */
public class add_stock extends javax.swing.JFrame {

    public static Statement st;
    public static Connection con;
    
    public add_stock() {
       // this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);//centra el formulario
        
        ///FORMA REDONDEADA//
        //Shape forma = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getBounds().height,30,30);
        //AWTUtilities.setWindowShape(this, forma);
             
        this.setTitle("Agregar Stock");
        setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE); //inabilida el uso del boton exit X
        this.setResizable(false); //Disable the Resize Button  
        
        id_producto.setVisible(false);
        
        metodos.cmb_add();
        metodos.CARGAR_JTABLE_addstock();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_addstock = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        bus_addstock = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_usuexit = new javax.swing.JButton();
        cmb_sucadd = new javax.swing.JComboBox<>();
        cant_add = new javax.swing.JTextField();
        btn_enviar1 = new javax.swing.JButton();
        id_producto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(580, 390));
        setPreferredSize(new java.awt.Dimension(580, 390));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("AGREGAR STOCK");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jtable_addstock.setModel(new javax.swing.table.DefaultTableModel(
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
        jtable_addstock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_addstockMouseClicked(evt);
            }
        });
        jtable_addstock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtable_addstockKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtable_addstockKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jtable_addstock);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 530, 200));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Sucursal");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, 20));

        bus_addstock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bus_addstockKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bus_addstockKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bus_addstockKeyTyped(evt);
            }
        });
        getContentPane().add(bus_addstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 210, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Buscar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

        btn_usuexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/exit.png"))); // NOI18N
        btn_usuexit.setText("Salir");
        btn_usuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuexitActionPerformed(evt);
            }
        });
        btn_usuexit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_usuexitKeyPressed(evt);
            }
        });
        getContentPane().add(btn_usuexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 90, 40));

        cmb_sucadd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_sucadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmb_sucaddKeyPressed(evt);
            }
        });
        getContentPane().add(cmb_sucadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 180, -1));

        cant_add.setBackground(new java.awt.Color(204, 102, 0));
        cant_add.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        cant_add.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cant_add.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cant_addKeyPressed(evt);
            }
        });
        getContentPane().add(cant_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 80, 40));

        btn_enviar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_enviar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/sent.png"))); // NOI18N
        btn_enviar1.setText("Agregar Stock");
        btn_enviar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_enviar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 150, 40));

        id_producto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        id_producto.setText("id_producto");
        getContentPane().add(id_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 90, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("CANTIDAD");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 100, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/fondosistema.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_usuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuexitActionPerformed
        dispose();

    }//GEN-LAST:event_btn_usuexitActionPerformed

    private void btn_enviar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviar1ActionPerformed
        
            int n1 = jtable_addstock.getSelectedRow();
            String id5 = jtable_addstock.getValueAt(n1, 0).toString();
            id_producto.setText(id5);

            Conexion cc=new Conexion();
            Connection con=cc.conectar();

            try {

                String sql = "UPDATE productos SET pro_stock = pro_stock + '"+cant_add.getText()+"' where pro_id = '"+id_producto.getText()+"'";	
		
                st = con.createStatement();
                st.execute(sql);

               metodos.CARGAR_JTABLE_addstock();

            }catch (Exception ee) {
                ee.printStackTrace();
            }
            
            try {

                String sqltotal = "update productos set pro_totalvta = pro_precioventa * pro_stock where pro_id = '"+id_producto.getText()+"'";

                st = con.createStatement();

                st.execute(sqltotal);
                
            } catch (SQLException ex) {
                System.out.println("ver error " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "error" + ex);
            }
            
            cant_add.setText("");

    }//GEN-LAST:event_btn_enviar1ActionPerformed

    private void bus_addstockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bus_addstockKeyTyped
  
        metodoproducto.buscarproducto_addstock();
        
    }//GEN-LAST:event_bus_addstockKeyTyped

    private void bus_addstockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bus_addstockKeyReleased
       metodos.convertiraMayusculasEnJtextfield(bus_addstock);
    }//GEN-LAST:event_bus_addstockKeyReleased

    private void jtable_addstockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtable_addstockKeyTyped
        
        
        
       
    }//GEN-LAST:event_jtable_addstockKeyTyped

    private void jtable_addstockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_addstockMouseClicked
                int n1 = jtable_addstock.getSelectedRow();
                String id1 = jtable_addstock.getValueAt(n1, 0).toString();
                id_producto.setText(id1);
                
                cant_add.requestFocus();
                cant_add.setText("");
    }//GEN-LAST:event_jtable_addstockMouseClicked

    private void cant_addKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cant_addKeyPressed
        
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btn_enviar1.requestFocus();
            btn_enviar1.doClick();
            bus_addstock.setText("");
            bus_addstock.requestFocus();
      }
        
    }//GEN-LAST:event_cant_addKeyPressed

    private void bus_addstockKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bus_addstockKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            } // TODO add your handling code here:
    }//GEN-LAST:event_bus_addstockKeyPressed

    private void cmb_sucaddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_sucaddKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_sucaddKeyPressed

    private void jtable_addstockKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtable_addstockKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_jtable_addstockKeyPressed

    private void btn_usuexitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_usuexitKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_usuexitKeyPressed

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
            java.util.logging.Logger.getLogger(add_stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enviar1;
    private javax.swing.JButton btn_usuexit;
    public static javax.swing.JTextField bus_addstock;
    private javax.swing.JTextField cant_add;
    public static javax.swing.JComboBox<String> cmb_sucadd;
    private javax.swing.JLabel id_producto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jtable_addstock;
    // End of variables declaration//GEN-END:variables
}
