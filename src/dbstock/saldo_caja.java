/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;

import static dbstock.PedRealizados.st;
import java.awt.KeyEventPostProcessor;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import static java.lang.Integer.parseInt;
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
public class saldo_caja extends javax.swing.JFrame {

    /**
     * Creates new form caja
     */
    Statement st;
    Connection con;

    public saldo_caja() {
        initComponents();

        this.setLocationRelativeTo(null);//centra el formulario
        this.setTitle("Registro de Cajas");

        metodos.CARGAR_JTABLE_SUC_saldo();
        cj_suc.setVisible(false);
        cj_caja.setVisible(false);
        //////////////////////////////////CIERRA LA VENTANA CON ESCAPE////////////////////////
        KeyboardFocusManager kb = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        kb.addKeyEventPostProcessor(new KeyEventPostProcessor() {
            public boolean postProcessKeyEvent(KeyEvent e) {
//                Principal.jMenu_cliente.setEnabled(true);
//                Principal.btn_cliente.setEnabled(true);
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE && this != null) {
                    dispose();
                    //ventana_agregar.setVisible(false);
                    return false;
                }
                return true;
            }
        });
        //////////////////////////////////////////////////////////////////////////////////////

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_sucu = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_caja = new javax.swing.JTable();
        btn_usuexit = new javax.swing.JButton();
        suma_total_gs = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cj_suc = new javax.swing.JTextField();
        cj_caja = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("SALDO DE CAJA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jtable_sucu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Descripcion"
            }
        ));
        jtable_sucu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_sucuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable_sucu);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 300, 190));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Monto Total GS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, 20));

        jtable_caja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Caja", "Monto GS"
            }
        ));
        jScrollPane2.setViewportView(jtable_caja);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 340, 190));

        btn_usuexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/exit.png"))); // NOI18N
        btn_usuexit.setText("Salir");
        btn_usuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuexitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_usuexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 90, 40));

        suma_total_gs.setEditable(false);
        suma_total_gs.setBackground(new java.awt.Color(204, 255, 204));
        suma_total_gs.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        suma_total_gs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(suma_total_gs, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 180, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Seleccione Sucursal");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));
        getContentPane().add(cj_suc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 110, -1));
        getContentPane().add(cj_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 100, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Caja");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/fondosistema.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_usuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuexitActionPerformed
        dispose();


    }//GEN-LAST:event_btn_usuexitActionPerformed

    private void jtable_sucuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_sucuMouseClicked

        int n1 = jtable_sucu.getSelectedRow();
        String id1 = jtable_sucu.getValueAt(n1, 0).toString();
        cj_suc.setText(id1);

        Conexion cc = new Conexion();
        Connection con = cc.conectar();;
        try {

            String[] titulo = {"Codigo", "Descripcion", "Monto GS"};
            DefaultTableModel mod = new DefaultTableModel(null, titulo);
            Object[] reg = new Object[7];
            String sql = "Select * from caja where '" + cj_suc.getText() + "' = caj_suc ";

            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                reg[0] = rs.getString("caj_codigo");
                reg[1] = rs.getString("caj_descri");
                reg[2] = rs.getString("caj_montogs");

                mod.addRow(reg);

            }
            jtable_caja.setModel(mod);

            TableColumnModel columnModel = jtable_caja.getColumnModel();

            columnModel.getColumn(0).setPreferredWidth(50);
            columnModel.getColumn(1).setPreferredWidth(120);
            columnModel.getColumn(2).setPreferredWidth(100);



        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
        String sumatota="select SUM(caj_montogs) from caja where caj_suc = '"+cj_suc.getText()+"'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sumatota);
            if(rs.next())
            {
                 suma_total_gs.setText(rs.getString("sum"));               
            }
            
            rs.close();
            st.close();
            con.close();
        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        String cadena12;
        int ente;
        cadena12 = suma_total_gs.getText();
        ente = parseInt(cadena12);  

        DecimalFormat formatea = new DecimalFormat("###,###,###,###.##");

        suma_total_gs.setText(formatea.format(ente));
        
    }//GEN-LAST:event_jtable_sucuMouseClicked

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
            java.util.logging.Logger.getLogger(saldo_caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(saldo_caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(saldo_caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(saldo_caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new saldo_caja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_usuexit;
    private javax.swing.JTextField cj_caja;
    private javax.swing.JTextField cj_suc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jtable_caja;
    public static javax.swing.JTable jtable_sucu;
    private javax.swing.JTextField suma_total_gs;
    // End of variables declaration//GEN-END:variables
}