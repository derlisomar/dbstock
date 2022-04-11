/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;

import java.awt.Image;
import java.awt.KeyEventPostProcessor;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Derlis
 */
public class usuario extends javax.swing.JFrame {

    Statement st;
    Connection con;
  private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos con Extension JPG y PNG", "jpg", "png");
    public usuario() {
        initComponents();
        
        this.setLocationRelativeTo(null);//centra el formulario
        this.setTitle("Registro de Usuarios");
        setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE); //inabilida el uso del boton exit X
        this.setResizable(false); //Disable the Resize Button
        
        
        txt_usudocu.setEnabled(false);
        txt_usunombre.setEnabled(false);
        txt_usuario.setEnabled(false);
        txt_pass.setEnabled(false);
        cmb_privilegios.setEnabled(false);
          
          btn_usuguardar.setEnabled(false);
          btn_usuactualizar.setEnabled(false);
          btn_usueditar.setEnabled(false);
          btn_usueliminar.setEnabled(false);
          btn_usucalcelar.setEnabled(false);
          btn_usuexit.setEnabled(true);
          url_ruta.setEnabled(false);
          btn_bus.setEnabled(false);
                ////cambiar icono del jframe
       // setIconImage(new ImageIcon(getClass().getResource("/img/user.png")).getImage());
        
       metodos.CARGAR_JTABLE();
       metodos.cmb_privilegio();
       
       //////////////////////////////////CIERRA LA VENTANA CON ESCAPE////////////////////////
        KeyboardFocusManager kb = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        kb.addKeyEventPostProcessor(new KeyEventPostProcessor(){
            public boolean postProcessKeyEvent(KeyEvent e){
                Principal.jMenu_usuario.setEnabled(true);
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE && this != null){
                    //System.out.println("probando...");
                    dispose();
                    return false;
                    
                }
                return true;
                
            }
        });
       ////////////////////////////////////////////////////////////////////////////////////////
       
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_usunombre = new javax.swing.JTextField();
        txt_usuario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_usuario = new javax.swing.JTable();
        btn_usuexit = new javax.swing.JButton();
        btn_usueditar = new javax.swing.JButton();
        btn_usunuevo = new javax.swing.JButton();
        btn_usucalcelar = new javax.swing.JButton();
        cmb_privilegios = new javax.swing.JComboBox<>();
        btn_usuguardar = new javax.swing.JButton();
        btn_usueliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_usudocu = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        btn_usuactualizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        url_ruta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_bus = new javax.swing.JButton();
        mylogo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(760, 425));
        setPreferredSize(new java.awt.Dimension(920, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Img URL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 60, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("REGISTRO DE USUARIOS / VENDEDORES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel4.setBackground(new java.awt.Color(204, 0, 51));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("solo números");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Nombre");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        txt_usunombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_usunombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usunombreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_usunombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 260, 30));

        txt_usuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyTyped(evt);
            }
        });
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 180, 30));

        jTable_usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
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
                "Nro Documento", "Nombre y Apellido", "Privilegio"
            }
        ));
        jTable_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_usuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_usuario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 450, 270));

        btn_usuexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/exit.png"))); // NOI18N
        btn_usuexit.setText("Salir");
        btn_usuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuexitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_usuexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 110, 40));

        btn_usueditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/editar.png"))); // NOI18N
        btn_usueditar.setText("Editar");
        btn_usueditar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_usueditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usueditarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_usueditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 100, 40));

        btn_usunuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/add-file.png"))); // NOI18N
        btn_usunuevo.setText("Nuevo");
        btn_usunuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usunuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_usunuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 100, 40));

        btn_usucalcelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/x-button.png"))); // NOI18N
        btn_usucalcelar.setText("Cancelar");
        btn_usucalcelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usucalcelarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_usucalcelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 110, 40));

        cmb_privilegios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Vendedor", "Cajero" }));
        getContentPane().add(cmb_privilegios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 180, 30));

        btn_usuguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/save.png"))); // NOI18N
        btn_usuguardar.setText("Guardar");
        btn_usuguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_usuguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 110, 40));

        btn_usueliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/eliminar.png"))); // NOI18N
        btn_usueliminar.setText("Eliminar");
        btn_usueliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usueliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_usueliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 110, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Nro de Documento");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txt_usudocu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_usudocu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usudocuKeyTyped(evt);
            }
        });
        getContentPane().add(txt_usudocu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 180, 30));
        getContentPane().add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 180, 30));

        btn_usuactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/reload.png"))); // NOI18N
        btn_usuactualizar.setText("Actualizar");
        btn_usuactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_usuactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 110, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/printer14.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(825, 360, 60, -1));
        getContentPane().add(url_ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 230, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Privilegios");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        btn_bus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/buscarcli.png"))); // NOI18N
        btn_bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_busActionPerformed(evt);
            }
        });
        getContentPane().add(btn_bus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 40, 30));
        getContentPane().add(mylogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 190, 180));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Contraseña");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/fondosistema.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_usuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuexitActionPerformed
        dispose();
        
       Principal.jMenu_usuario.setEnabled(true);
    }//GEN-LAST:event_btn_usuexitActionPerformed

    private void txt_usudocuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usudocuKeyTyped
        ////convertir a mayusculas
        char c6 = evt.getKeyChar(); 
        if(Character.isLowerCase(c6)){
            String cad = ("" + c6).toUpperCase();
            c6 = cad.charAt(0);
            evt.setKeyChar(c6);
        }
    }//GEN-LAST:event_txt_usudocuKeyTyped

    private void txt_usunombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usunombreKeyTyped
        ////convertir a mayusculas
        char c6 = evt.getKeyChar(); 
        if(Character.isLowerCase(c6)){
            String cad = ("" + c6).toUpperCase();
            c6 = cad.charAt(0);
            evt.setKeyChar(c6);
        }
    }//GEN-LAST:event_txt_usunombreKeyTyped

    private void txt_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyTyped
                   ////convertir a mayusculas
        char c6 = evt.getKeyChar(); 
        if(Character.isLowerCase(c6)){
            String cad = ("" + c6).toUpperCase();
            c6 = cad.charAt(0);
            evt.setKeyChar(c6);
        }
    }//GEN-LAST:event_txt_usuarioKeyTyped

    private void btn_usunuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usunuevoActionPerformed

        txt_usudocu.setText("");
        txt_usunombre.setText("");
        txt_usuario.setText("");
        txt_pass.setText("");
       
        txt_usudocu.setEnabled(true);
        txt_usunombre.setEnabled(true);
        txt_usuario.setEnabled(true);
        txt_pass.setEnabled(true);
        cmb_privilegios.setEnabled(true);
        
          btn_usunuevo.setEnabled(false);
          btn_usuguardar.setEnabled(true);
          btn_usuactualizar.setEnabled(false);
          btn_usueditar.setEnabled(false);
          btn_usueliminar.setEnabled(false);
          btn_usucalcelar.setEnabled(true);
          btn_usuexit.setEnabled(true);
          url_ruta.setEnabled(true);
          btn_bus.setEnabled(true);
          
          
    }//GEN-LAST:event_btn_usunuevoActionPerformed

    private void btn_usuguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuguardarActionPerformed
       
        int aux  =  JOptionPane.showConfirmDialog(null, "Desea Guardar el Registro?","OBSERVACION", JOptionPane.YES_NO_OPTION);
        if(aux == JOptionPane.YES_OPTION){
     
    	Conexion cc=new Conexion();
	Connection con=cc.conectar();
        try {
        
        String sql = "INSERT INTO usuarios (usu_cedula, usu_nombre, usu_alias,usu_pass, usu_privilegios, usu_urlimg) "
                + "values ('"+txt_usudocu.getText()+"','"+txt_usunombre.getText()+"','"+txt_usuario.getText()+"','"+txt_pass.getText()+"',"
                + "'"+cmb_privilegios.getSelectedItem()+"','"+url_ruta.getText()+"')";	
        
        st = con.createStatement();			
        st.execute(sql); 
        metodos.CARGAR_JTABLE();

        btn_usueditar.setEnabled(true);
        btn_usueliminar.setEnabled(true);

       } catch (SQLException ex) {
          System.out.println("ver error " + ex.getMessage());
           
       }
        }
        
    }//GEN-LAST:event_btn_usuguardarActionPerformed

    private void btn_usucalcelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usucalcelarActionPerformed
   
            int aux  =  JOptionPane.showConfirmDialog(null, "Desea Cancelar Registro?","OBSERVACION", JOptionPane.YES_NO_OPTION);
            if(aux == JOptionPane.YES_OPTION){

        txt_usudocu.setEnabled(false);
        txt_usunombre.setEnabled(false);
        txt_usuario.setEnabled(false);
        txt_pass.setEnabled(false);
        cmb_privilegios.setEnabled(false);      
                
          btn_usuguardar.setVisible(true);   
          btn_usunuevo.setEnabled(true);
          btn_usuguardar.setEnabled(false);
          btn_usuactualizar.setEnabled(false);
          btn_usueditar.setEnabled(false);
          btn_usueliminar.setEnabled(false);
          btn_usucalcelar.setEnabled(false);
          btn_usuexit.setEnabled(true);
          url_ruta.setEnabled(false);
          btn_bus.setEnabled(false);
             
        }
        
    }//GEN-LAST:event_btn_usucalcelarActionPerformed

    private void btn_usuactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuactualizarActionPerformed
       

        int aux  =  JOptionPane.showConfirmDialog(null, "Desea Actualizar los Datos","OBSERVACION", JOptionPane.YES_NO_OPTION);
        if(aux == JOptionPane.YES_OPTION){
        
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
        try {
        
        String sql = "UPDATE usuarios SET usu_cedula = '"+txt_usudocu.getText()+"', usu_nombre = '"+txt_usunombre.getText()+"',"
                + " usu_alias= '"+txt_usuario.getText()+"', usu_pass= '"+txt_pass.getText()+"',"
                + "usu_privilegios ='"+cmb_privilegios.getSelectedItem()+"', usu_urlimg ='"+url_ruta.getText()+"' where usu_cedula = '"+txt_usudocu.getText()+"'";	
						
        st = con.createStatement();
				
        st.execute(sql);
       
        JOptionPane.showMessageDialog(null,  "Registro Actualizado", "Usuarios", JOptionPane.INFORMATION_MESSAGE);
        

        
        metodos.CARGAR_JTABLE();
           
        btn_usuguardar.setVisible(true);
        btn_usuactualizar.setVisible(false);
   
          btn_usunuevo.setEnabled(true);
          btn_usuguardar.setEnabled(false);
          btn_usuactualizar.setEnabled(false);
          btn_usueditar.setEnabled(false);
          btn_usueliminar.setEnabled(false);
          btn_usucalcelar.setEnabled(false);
          btn_usuexit.setEnabled(true);
          url_ruta.setEnabled(false);
          btn_bus.setEnabled(false);
        
          
        metodos.CARGAR_JTABLE();
       txt_usudocu.setEnabled(false);
        txt_usunombre.setEnabled(false);
        txt_usuario.setEnabled(false);
        txt_pass.setEnabled(false);
        cmb_privilegios.setEnabled(false);
        
       } catch (SQLException ex) {
          System.out.println("ver error " + ex.getMessage());
        
       }
        }
        
    }//GEN-LAST:event_btn_usuactualizarActionPerformed

    private void btn_usueditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usueditarActionPerformed
              
        txt_usudocu.setEnabled(true);
        txt_usunombre.setEnabled(true);
        txt_usuario.setEnabled(true);
        txt_pass.setEnabled(true);
        cmb_privilegios.setEnabled(true);
        
          btn_usuguardar.setVisible(false);
          btn_usuactualizar.setVisible(true);
           
          btn_usunuevo.setEnabled(false);
          btn_usuguardar.setEnabled(false);
          btn_usuactualizar.setEnabled(true);
          btn_usueditar.setEnabled(false);
          btn_usueliminar.setEnabled(false);
          btn_usucalcelar.setEnabled(true);
          btn_usuexit.setEnabled(true);
          url_ruta.setEnabled(true);
          btn_bus.setEnabled(true);
          
        
    }//GEN-LAST:event_btn_usueditarActionPerformed

    private void jTable_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_usuarioMouseClicked
        
        txt_usudocu.setEnabled(false);
        txt_usunombre.setEnabled(false);
        txt_usuario.setEnabled(false);
        txt_pass.setEnabled(false);
        cmb_privilegios.setEnabled(false);  
        
          btn_usunuevo.setEnabled(true);
          btn_usuguardar.setEnabled(false);
          btn_usuactualizar.setEnabled(false);
          btn_usueditar.setEnabled(true);
          btn_usueliminar.setEnabled(true);
          btn_usucalcelar.setEnabled(false);
          btn_usuexit.setEnabled(true);
          url_ruta.setEnabled(false);
          btn_bus.setEnabled(false);
        
        int n0 = jTable_usuario.getSelectedRow();
        String id = jTable_usuario.getValueAt(n0, 0).toString();
        txt_usudocu.setText(id);
        
 		Conexion cc=new Conexion();
		Connection con=cc.conectar();;
        	try {

		String sql = "Select * from usuarios where usu_cedula = '"+txt_usudocu.getText()+"'";
		//ResultSet resultado = st.executeQuery(sql);
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                        txt_usudocu.setText(rs.getString("usu_cedula"));
                        txt_usunombre.setText(rs.getString("usu_nombre"));
                        txt_usuario.setText(rs.getString("usu_alias"));
                        txt_pass.setText(rs.getString("usu_pass"));
                        url_ruta.setText(rs.getString("usu_urlimg"));
                       // cmb_privilegios.setSelectedItem("usu_privilegios");         //***************************

                        ///////////////////////////////////////////////mostrar imagenes en pantalla
                                String url = (rs.getString("usu_urlimg"));
                                ImageIcon fot = new ImageIcon(url);
                                Icon icono = new ImageIcon(fot.getImage().getScaledInstance(mylogo.getWidth(), mylogo.getHeight(), Image.SCALE_DEFAULT));
                                mylogo.setIcon(icono);
                                mylogo.repaint();
                          //////////////////////////////////////////////////////fin mostrar pantalla
                        
                    }
			rs.close();
			st.close();
			con.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
        
    }//GEN-LAST:event_jTable_usuarioMouseClicked

    private void btn_usueliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usueliminarActionPerformed
        
            int aux  =  JOptionPane.showConfirmDialog(null, "Desea eliminar ","Sistema Ficha del cliente", JOptionPane.YES_NO_OPTION);
				
            if(aux == JOptionPane.YES_OPTION){
                
                int nz = jTable_usuario.getSelectedRow();
                String id = jTable_usuario.getValueAt(nz, 0).toString();
                txt_usudocu.setText(id);

           	Conexion cc=new Conexion();
		Connection con=cc.conectar();
                
		try {
					
			String sql = "delete from usuarios where usu_cedula = '"+txt_usudocu.getText()+"' ";	
                        st = con.createStatement();

                        st.execute(sql);

                        metodos.CARGAR_JTABLE();		

                            txt_usudocu.setText("");
                            txt_usunombre.setText("");
                            txt_usuario.setText("");
                            txt_pass.setText("");
                           // cmb_privilegios.setText("");
                                    
                           txt_usudocu.setEnabled(false);
                            txt_usunombre.setEnabled(false);
                            txt_usuario.setEnabled(false);
                            txt_pass.setEnabled(false);
                            cmb_privilegios.setEnabled(false);
                        btn_usuguardar.setVisible(true);   
                        btn_usunuevo.setEnabled(true);
                        btn_usuguardar.setEnabled(false);
                        btn_usuactualizar.setEnabled(false);
                        btn_usueditar.setEnabled(false);
                        btn_usueliminar.setEnabled(false);
                        btn_usucalcelar.setEnabled(false);
                        btn_usuexit.setEnabled(true);
                        
                        
		}catch (Exception ee) {
                    ee.printStackTrace();
		}
			 
		}else{if(aux == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null,  "Cancelado", "Sistema", JOptionPane.INFORMATION_MESSAGE);
					
		}
				
		}
        
    }//GEN-LAST:event_btn_usueliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          	Conexion cc=new Conexion();
		Connection con=cc.conectar();
                try {
                URL master = this.getClass().getResource("/reporte/reusuario.jasper");
                //System.out.println("master" + master);
                
                if (master == null) {
                    System.out.println("No se encontro el archivo");                   
                    //System.exit(0);
                }
                
                JasperReport masterreport = null;
                try {
                    masterreport = (JasperReport) JRLoader.loadObject(master);
          
                } catch (Exception e) {
                    System.out.println("error al cargar reporte " + e.getMessage());                 
                }
                    Map parametros= new HashMap();
                    //parametros.put("documento", Ficha_Cliente.txt_docu.getText());
                    JasperPrint print = JasperFillManager.fillReport(masterreport, parametros, con);
                    JasperViewer ver = new JasperViewer(print,false);
                    ver.setTitle("Resgistro de Usuario");
                    ver.setVisible(true);
            } catch (Exception e) {
                System.out.println("reporte.reporte.Reportefichaupdate()" + e);      
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_busActionPerformed
        JFileChooser filechoose = new JFileChooser();
        filechoose.setFileFilter(filter);
        int opcion = filechoose.showOpenDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            //OBTENER EL NOMBRE DEL ARCHIVO SELECCIONADO
            String nombre_archivo = filechoose.getSelectedFile().getName();
            //OBTENER LA RUTA DEL ARCHIVO SELECCIONADO
            String ruta = filechoose.getSelectedFile().getPath();
            //seteamos el nombre del archivo
            mylogo.setText(nombre_archivo);
            //seteamos la ruta
            url_ruta.setText(ruta);
           
            //System.out.println(ruta);
            
            mylogo.setIcon(new ImageIcon(ruta));
            
        
        ImageIcon fot = new ImageIcon(ruta);
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(mylogo.getWidth(), mylogo.getHeight(), Image.SCALE_DEFAULT));
        mylogo.setIcon(icono);
        this.repaint();
   
        }
    }//GEN-LAST:event_btn_busActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bus;
    private javax.swing.JButton btn_usuactualizar;
    private javax.swing.JButton btn_usucalcelar;
    private javax.swing.JButton btn_usueditar;
    private javax.swing.JButton btn_usueliminar;
    private javax.swing.JButton btn_usuexit;
    private javax.swing.JButton btn_usuguardar;
    private javax.swing.JButton btn_usunuevo;
    public static javax.swing.JComboBox<String> cmb_privilegios;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_usuario;
    private javax.swing.JLabel mylogo;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_usuario;
    private javax.swing.JTextField txt_usudocu;
    private javax.swing.JTextField txt_usunombre;
    private javax.swing.JTextField url_ruta;
    // End of variables declaration//GEN-END:variables
}