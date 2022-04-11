/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;

import com.sun.glass.events.KeyEvent;
import static dbstock.Conexion.conn;
import static dbstock.metodos.st;
import java.awt.Font;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Image;
import java.awt.KeyEventPostProcessor;
import java.awt.KeyboardFocusManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.xml.ws.Holder;


import static java.lang.Integer.parseInt;

/**
 *
 * @author Derlis
 */
public class Inicio extends javax.swing.JFrame {

    Statement st;
    Connection con;
    DateFormat df = DateFormat.getDateInstance();
    
    long diffrence;

  //  public JPlaceholderTextField txt_pass;
    public Inicio() {
         initComponents();
         this.setLocationRelativeTo(null);//centra el formulario
         this.setTitle("Inicio de Sesion.");
               setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE); //inabilida el uso del boton exit X
        this.setResizable(false); //Disable the Resize Button
         
         
        Calendar Cal= Calendar.getInstance();
   
        fecha_sistema.setCalendar(Cal);
        
        estirar_fecha_vencimiento();
        
        fecha_sistema.setVisible(false);
        fecha_vencimiento.setVisible(false);
        
         btn_sucursal.setVisible(false);
         sucu_des.setVisible(false);
         sucu.setVisible(false);
         metodos.cmb_sucursal();
         url_logo.setVisible(false);
         url_img.setVisible(false);
         id_suc.setVisible(false);
         su_id2.setVisible(false);
         txt_nombreusu.setVisible(false);
         lolito.setVisible(false);//para abrir nuevo jframe de conf inicial
         
         privile.setVisible(false);
         
         

        ////cambiar icono del jframe
    //    setIconImage(new ImageIcon(getClass().getResource("/img/icono.png")).getImage());
         //MAXIMIZAR VENTANA
        // this.setExtendedState(MAXIMIZED_BOTH);
         
         //CENTRAR TEXTO DE TEXT 
      //  txt_usuario.setHorizontalAlignment(txt_usuario.CENTER); 
          txt_pass.setHorizontalAlignment(txt_pass.CENTER);
          
          txt_usuario.setBackground(new Color(0,0,0,1));// jtext field deja transparente
          //txt_pass.setBackground(new Color(0,0,0,1));//jtext field transparente
          
  
                //icono jframe
                setIconImage(new ImageIcon(getClass().getResource("icono.png")).getImage());
        
         	Conexion cc=new Conexion();
		Connection con=cc.conectar();;
        	try {
		String sql = "Select * from config";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {

                         Inicio.url_logo.setText(rs.getString("conf_url"));
                         denominacion.setText(rs.getString("conf_denominacion"));
                         telefono.setText(rs.getString("conf_telefono"));                        
                         ///////////////////////////////////////////////mostrar imagenes en pantalla
                                String url = (rs.getString("conf_url"));
                                ImageIcon fot = new ImageIcon(url);
                                Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Inicio.milogo.getWidth(), Inicio.milogo.getHeight(), Image.SCALE_DEFAULT));
                                Inicio.milogo.setIcon(icono);
                                Inicio.milogo.repaint();
                    }
                    
                metodos.estirar_suc();
                
                
                                        

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
                

        	try {
		String sql = "Select * from sucursal where su_codigo = '"+id_suc.getText()+"'";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {                 
                         su_id2.setText(rs.getString("su_codigo"));      
                         
                    }
			rs.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
                
                String cadena_based = new String(su_id2.getText());
                //String cadena_estiratxt = new String(id_suc.getText());
                

                
                if (su_id2.getText().isEmpty()) {
                    
                    cmb_sucursal.setVisible(true);
                    
                }else{
                    int entero_idsuc = parseInt(cadena_based);
              
                    int rest = entero_idsuc - 1;
                    
                    cmb_sucursal.setSelectedIndex(rest);
                   cmb_sucursal.setEnabled(false);
                }


         //////////////////////////////////CIERRA LA VENTANA CON ESCAPE////////////////////////
        KeyboardFocusManager kb = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        kb.addKeyEventPostProcessor(new KeyEventPostProcessor(){
            public boolean postProcessKeyEvent(java.awt.event.KeyEvent e){
//                Principal.jMenu_cliente.setEnabled(true);
//                Principal.btn_cliente.setEnabled(true);
                if (e.getKeyCode() == java.awt.event.KeyEvent.VK_F3 && this != null){
                   
                    lolito.setVisible(true);
                    lolito.requestFocus();
                    return false;
                }
                return true;
            }
        });
       //////////////////////////////////////////////////////////////////////////////////////
 
        
              this.calculo_resta_fecha();  

        
      
    }

    public void calculo_resta_fecha(){

        Date firstDate = fecha_sistema.getDate();
        Date secondDate = fecha_vencimiento.getDate();

        long diff = secondDate.getTime() - firstDate.getTime();

        TimeUnit time = TimeUnit.DAYS; 
        long diffrence = time.convert(diff, TimeUnit.MILLISECONDS);
        
        if (diffrence <= 15) {

            licencia verlice = new licencia();
            verlice.setVisible(true);

           // diferencia.set(diffrence);

        }
        if (diffrence <= 1) {
            btn_login.setEnabled(false);
        }
        
        
//        System.out.println("The difference 1 : "+firstDate);
//        System.out.println("The difference venc : "+secondDate);
//        System.out.println("The difference in days is : "+diffrence);
        
    }
    
    
        public void estirar_fecha_vencimiento() {

        Conexion cc = new Conexion();
        Connection con = cc.conectar();;
        try {

            String sql88 = "Select * from config";
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql88);
            if (rs.next()) {

                fecha_vencimiento.setDate(rs.getDate("conf_licencia"));

            }
            rs.close();
            st.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_usuario = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        milogo = new javax.swing.JLabel();
        url_logo = new javax.swing.JTextField();
        denominacion = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        lolito = new jtextfieldround.JPasswordFieldRound();
        cmb_sucursal = new javax.swing.JComboBox<>();
        btn_sucursal = new javax.swing.JButton();
        sucu = new javax.swing.JTextField();
        sucu_des = new javax.swing.JTextField();
        url_img = new javax.swing.JTextField();
        id_suc = new javax.swing.JTextField();
        su_id2 = new javax.swing.JTextField();
        privile = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_pass = new jtextfieldround.JPasswordFieldRound();
        fecha_sistema = new com.toedter.calendar.JDateChooser();
        fecha_vencimiento = new com.toedter.calendar.JDateChooser();
        txt_nombreusu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(392, 408));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_usuario =new JPlaceholderTextField("Ingrese usuario");
        txt_usuario.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(255, 255, 255));
        txt_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_usuario.setBorder(null);
        txt_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyTyped(evt);
            }
        });
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 200, 30));

        btn_login.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/log-in.png"))); // NOI18N
        btn_login.setText("Ingresar");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 170, 40));

        btn_salir.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 80, 30));

        milogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        milogo.setText("Mi Logo");
        getContentPane().add(milogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 330, 70));
        getContentPane().add(url_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 260, -1));

        denominacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        denominacion.setForeground(new java.awt.Color(51, 51, 51));
        denominacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        denominacion.setText("empresa");
        getContentPane().add(denominacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 470, -1));

        telefono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        telefono.setForeground(new java.awt.Color(51, 51, 51));
        telefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telefono.setText("telefono");
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 670, 260, 20));

        lolito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lolitoKeyPressed(evt);
            }
        });
        getContentPane().add(lolito, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 170, 30));

        cmb_sucursal.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        cmb_sucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmb_sucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 240, 30));

        btn_sucursal.setText("btn_sucursal");
        btn_sucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sucursalActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 60, 20));
        getContentPane().add(sucu, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 40, -1));
        getContentPane().add(sucu_des, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 40, -1));
        getContentPane().add(url_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 440, 130, -1));
        getContentPane().add(id_suc, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, 30, 30));
        getContentPane().add(su_id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 480, 40, -1));
        getContentPane().add(privile, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 80, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Vo. 10.05.21");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, -1, -1));

        txt_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passKeyPressed(evt);
            }
        });
        getContentPane().add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 200, -1));
        getContentPane().add(fecha_sistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 100, 140, -1));
        getContentPane().add(fecha_vencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 130, -1));
        getContentPane().add(txt_nombreusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 170, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/loginV2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1370, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
       
        Conexion cc=new Conexion();
	Connection con=cc.conectar();
        
            String passText = new String(txt_pass.getPassword());
        
        	try {

		String sql = "Select * from usuarios where usu_alias = '"+txt_usuario.getText()+"' and usu_pass = '"+passText+"'";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
                    if (rs.next()) {

                    txt_nombreusu.setText(rs.getString("usu_nombre"));
                    //txt_pass.setText(rs.getString("usu_privilegios"));
                    url_img.setText(rs.getString("usu_urlimg"));
                    privile.setText(rs.getString("usu_privilegios"));
                    
                    Principal form1 = new  Principal();
                    form1.setVisible(true);
                    //form1.setExtendedState(MAXIMIZED_BOTH);
                    Principal.usuario_ini.setText(txt_nombreusu.getText());
                    Principal.privilegio_ini.setText(privile.getText());
                    
                    /////////////////////////////////////////////////////////////////
                    
                    metodos.estirardatos_privilegios_principal();
                    
                    ///////////////////////////////////////////////mostrar imagenes en pantalla
                                String url = (rs.getString("usu_urlimg"));
                                ImageIcon fot = new ImageIcon(url);
                                Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Principal.logo_pri.getWidth(), Principal.logo_pri.getHeight(), Image.SCALE_DEFAULT));
                                Principal.logo_pri.setIcon(icono);
                                Principal.logo_pri.repaint();
                    //////////////////////////////////////////////////////fin mostrar pantalla
                    
                    
                    btn_sucursal.doClick();

                        Date firstDate = fecha_sistema.getDate();
                        Date secondDate = fecha_vencimiento.getDate();

                        long diff = secondDate.getTime() - firstDate.getTime();

                        TimeUnit time = TimeUnit.DAYS;
                        long diffrence = time.convert(diff, TimeUnit.MILLISECONDS);

                        if (diffrence <= 15) {

                            licencia verlice = new licencia();
                            verlice.setVisible(true);

                            Principal.licencia_porvencer.setVisible(true);
                            Principal.licencia_porvencer1.setVisible(true);
                            Principal.licencia_porvencer2.setVisible(true);
                            Principal.btn_licencia.setVisible(true);
                        }
                        if (diffrence <= 1) {
                            btn_login.setEnabled(false);
                        }

                          

                        
                    setVisible(false);
                                
                    }else {
   
                        
			JOptionPane.showMessageDialog(null, "Usuario no existe !!!");
                        txt_usuario.setText("");
                        txt_pass.setText("");
                        txt_usuario.requestFocus();
				}
			rs.close();
			st.close();
			con.close();
                    } catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
                    }
        
    }//GEN-LAST:event_btn_loginActionPerformed

    private void txt_usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyReleased
       
      //  Metodo_Limites.convertiraMayusculasEnJtextfield(txt_usuario);
    }//GEN-LAST:event_txt_usuarioKeyReleased

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void txt_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyTyped
        
        char c = evt.getKeyChar(); 
        if(Character.isLowerCase(c)){
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        
    }//GEN-LAST:event_txt_usuarioKeyTyped

    private void txt_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          txt_pass.requestFocus();
         
      }
    }//GEN-LAST:event_txt_usuarioKeyPressed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void btn_sucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sucursalActionPerformed

                String valorsuc = (String) cmb_sucursal.getSelectedItem();

 		Conexion cc=new Conexion();
		Connection con=cc.conectar();;
        	try {

		String sql = "Select * from sucursal where su_descri = '"+valorsuc+"'";
		//ResultSet resultado = st.executeQuery(sql);
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                       sucu.setText(rs.getString("su_codigo"));
                       sucu_des.setText(rs.getString("su_descri"));
                       
                       Principal.sucursal.setText(sucu_des.getText());
                       Principal.sucursal_id.setText(sucu.getText());
                    }
			rs.close();
			st.close();
			con.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
                
        
    }//GEN-LAST:event_btn_sucursalActionPerformed

    private void lolitoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lolitoKeyPressed
            if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {

                String passText = new String(lolito.getPassword());
      
            if ("dbstock14512".equals(passText)) {

                lolito.setText("");
                lolito.setVisible(false);
                setting ve = new setting();
                ve.setVisible(true);

            }else{
                JOptionPane.showMessageDialog(null, "Contraseña ingresada es INCORRECTA, Ingrese Contraseña Unica");
            }
        }
    }//GEN-LAST:event_lolitoKeyPressed

    private void txt_passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_login.requestFocus();
            btn_login.doClick();
        }
    }//GEN-LAST:event_txt_passKeyPressed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
    

                    new Inicio().setVisible(true);
          
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_sucursal;
    public static javax.swing.JComboBox<String> cmb_sucursal;
    private javax.swing.JLabel denominacion;
    private com.toedter.calendar.JDateChooser fecha_sistema;
    private com.toedter.calendar.JDateChooser fecha_vencimiento;
    public static javax.swing.JTextField id_suc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private jtextfieldround.JPasswordFieldRound lolito;
    public static javax.swing.JLabel milogo;
    public static javax.swing.JTextField privile;
    private javax.swing.JTextField su_id2;
    private javax.swing.JTextField sucu;
    private javax.swing.JTextField sucu_des;
    private javax.swing.JLabel telefono;
    public static javax.swing.JTextField txt_nombreusu;
    private jtextfieldround.JPasswordFieldRound txt_pass;
    private javax.swing.JTextField txt_usuario;
    private javax.swing.JTextField url_img;
    public static javax.swing.JTextField url_logo;
    // End of variables declaration//GEN-END:variables
}
