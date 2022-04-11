/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;

import static dbstock.productos.pro_vencimineto;
import java.awt.KeyEventPostProcessor;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
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
public class cotizacion extends javax.swing.JFrame {

    Statement st;
    Connection con;
    /**
     * Creates new form cotizacion
     */
    public cotizacion() {
        initComponents();
        this.setLocationRelativeTo(null);//centra el formulario
        this.setTitle("Cotizaciones");
        setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE); //inabilida el uso del boton exit X
        this.setResizable(false); //Disable the Resize Button
        
          //MOSTRAR FECHA Y HORA DEL SISTEMA
        Calendar Cal= Calendar.getInstance();
        String fecha= Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+"/"+Cal.get(Cal.YEAR);
        fecha_inicoti.setText(fecha);
        
        coti_id.setVisible(false);
        
        metodos.estirardatos_cotizacion();
        
        String cadena12 = us_cpa.getText();
        int entero12 = parseInt(cadena12);  
        
        String cadena13 = rs_cpa.getText();
        int entero13 = parseInt(cadena13); 
        DecimalFormat formatea = new DecimalFormat("###,###,###.##");
        us_cpa.setText(formatea.format(entero12));
        rs_cpa.setText(formatea.format(entero13));
        
                //////////////////////////////////CIERRA LA VENTANA CON ESCAPE////////////////////////
        KeyboardFocusManager kb = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        kb.addKeyEventPostProcessor(new KeyEventPostProcessor(){
            public boolean postProcessKeyEvent(KeyEvent e){
                Principal.jMenucotizar.setEnabled(true);
                //Principal.btn_cliente.setEnabled(true);
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE && this != null){
                    //System.out.println("probando...");
                    dispose();
                    return false;
                }
                return true;
            }
        });
       //////////////////////////////////////////////////////////////////////////////////////
    
       fecha_inicoti.setVisible(false);
       us_cpa2.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coti_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rs_cpa = new javax.swing.JTextField();
        ps_cpa = new javax.swing.JTextField();
        fecha_inicoti = new javax.swing.JLabel();
        btn_usuactualizar = new javax.swing.JButton();
        btn_usuexit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        ps_cpa2 = new javax.swing.JTextField();
        us_cpa2 = new javax.swing.JTextField();
        rs_cpa2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        us_cpa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 290));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        coti_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coti_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(coti_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("COTIZACIONES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("DOLAR");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 80, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("REAL");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 60, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("PESO ARG.");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 100, 30));

        rs_cpa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rs_cpa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(rs_cpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 120, 30));

        ps_cpa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ps_cpa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ps_cpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 120, 30));

        fecha_inicoti.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fecha_inicoti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha_inicoti.setText("fecha");
        getContentPane().add(fecha_inicoti, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 20));

        btn_usuactualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_usuactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/reload.png"))); // NOI18N
        btn_usuactualizar.setText("Actualizar");
        btn_usuactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_usuactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 120, 40));

        btn_usuexit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_usuexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/exit.png"))); // NOI18N
        btn_usuexit.setText("Salir");
        btn_usuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuexitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_usuexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 120, 40));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nueva Cotización", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ps_cpa2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ps_cpa2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ps_cpa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 120, 30));

        us_cpa2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        us_cpa2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(us_cpa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 120, 30));

        rs_cpa2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rs_cpa2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(rs_cpa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 120, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("REAL");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 60, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("PESO ARG.");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("DOLAR");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 80, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 270, 160));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cotización Actual", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        us_cpa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        us_cpa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(us_cpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 120, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 270, 160));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/fondosistema.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_usuactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuactualizarActionPerformed

        int aux  =  JOptionPane.showConfirmDialog(null, "Desea Actualizar los Datos","OBSERVACION", JOptionPane.YES_NO_OPTION);
        if(aux == JOptionPane.YES_OPTION){

            Conexion cc=new Conexion();
            Connection con=cc.conectar();
            try {

                String sql = "UPDATE cotizar SET coti_fecha = '"+fecha_inicoti.getText()+"', coti_dolar  = '"+us_cpa2.getText()+"',"
                + " coti_real= '"+rs_cpa2.getText()+"', coti_peso= '"+ps_cpa2.getText()+"'  where coti_id = '"+coti_id.getText()+"'";

                st = con.createStatement();

                st.execute(sql);
              

            //    JOptionPane.showMessageDialog(null,  "Registro Actualizado", "Usuarios", JOptionPane.INFORMATION_MESSAGE);
                metodos.estirardatos_cotizacion();
                metodos.estirardatos_cotizacion_principal();
                
                us_cpa2.setText("");
                rs_cpa2.setText("");
                ps_cpa2.setText("");
                
            } catch (SQLException ex) {
                System.out.println("ver error " + ex.getMessage());

            }
        }
    }//GEN-LAST:event_btn_usuactualizarActionPerformed

    private void btn_usuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuexitActionPerformed
        dispose();

    }//GEN-LAST:event_btn_usuexitActionPerformed

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
            java.util.logging.Logger.getLogger(cotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cotizacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_usuactualizar;
    private javax.swing.JButton btn_usuexit;
    public static javax.swing.JTextField coti_id;
    private javax.swing.JLabel fecha_inicoti;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JTextField ps_cpa;
    public static javax.swing.JTextField ps_cpa2;
    public static javax.swing.JTextField rs_cpa;
    public static javax.swing.JTextField rs_cpa2;
    public static javax.swing.JTextField us_cpa;
    public static javax.swing.JTextField us_cpa2;
    // End of variables declaration//GEN-END:variables
}
