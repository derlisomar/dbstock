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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


/**
 *
 * @author Derlis
 */
public class caja extends javax.swing.JFrame {

    /**
     * Creates new form caja
     */
    Statement st;
    Connection con;
    public caja() {
        initComponents();
        
        ventana_agregar.setVisible(false);
        this.setLocationRelativeTo(null);//centra el formulario
        this.setTitle("Registro de Cajas");
        cj_suc.setEnabled(false);
        btn_addcaja.setEnabled(false);

        metodos.CARGAR_JTABLE_SUC_caja();
                //////////////////////////////////CIERRA LA VENTANA CON ESCAPE////////////////////////
        KeyboardFocusManager kb = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        kb.addKeyEventPostProcessor(new KeyEventPostProcessor(){
            public boolean postProcessKeyEvent(KeyEvent e){
//                Principal.jMenu_cliente.setEnabled(true);
//                Principal.btn_cliente.setEnabled(true);
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE && this != null){
                    //System.out.println("probando...");
                    ventana_agregar.setVisible(false);
                    return false;
                }
                return true;
            }
        });
       //////////////////////////////////////////////////////////////////////////////////////
        pedido_cod.setText("0");
        id.setVisible(false);
        pedido_cod.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventana_agregar = new javax.swing.JInternalFrame();
        jLabel6 = new javax.swing.JLabel();
        cj_suc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cj_descri = new javax.swing.JTextField();
        btn_usuguardar = new javax.swing.JButton();
        btn_cajacancelar = new javax.swing.JButton();
        cj_codigo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_sucu = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_caja = new javax.swing.JTable();
        btn_addcaja = new javax.swing.JButton();
        btn_usuexit = new javax.swing.JButton();
        pedido_cod = new javax.swing.JTextField();
        btn_usueliminar = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(660, 380));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ventana_agregar.setVisible(true);
        ventana_agregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ventana_agregarKeyPressed(evt);
            }
        });
        ventana_agregar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Sucursal");
        ventana_agregar.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, 20));

        cj_suc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cj_sucKeyTyped(evt);
            }
        });
        ventana_agregar.getContentPane().add(cj_suc, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 60, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Descripcion");
        ventana_agregar.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 20));

        cj_descri.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cj_descriKeyTyped(evt);
            }
        });
        ventana_agregar.getContentPane().add(cj_descri, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 190, -1));

        btn_usuguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/save.png"))); // NOI18N
        btn_usuguardar.setText("Guardar");
        btn_usuguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuguardarActionPerformed(evt);
            }
        });
        ventana_agregar.getContentPane().add(btn_usuguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 110, 40));

        btn_cajacancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/x-button.png"))); // NOI18N
        btn_cajacancelar.setText("Cancelar");
        btn_cajacancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cajacancelarActionPerformed(evt);
            }
        });
        ventana_agregar.getContentPane().add(btn_cajacancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 110, 40));

        cj_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cj_codigoKeyTyped(evt);
            }
        });
        ventana_agregar.getContentPane().add(cj_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 70, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Codigo");
        ventana_agregar.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 20));

        getContentPane().add(ventana_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 420, 150));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE CAJA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jScrollPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jScrollPane1KeyPressed(evt);
            }
        });

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
        jtable_sucu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtable_sucuKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtable_sucu);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 290, 140));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Seleccione Sucursal");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

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
                "Codigo", "Caja", "Sucursal"
            }
        ));
        jScrollPane2.setViewportView(jtable_caja);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 320, 190));

        btn_addcaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/add-file.png"))); // NOI18N
        btn_addcaja.setText("Agregar Caja");
        btn_addcaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addcajaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_addcaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 130, 40));

        btn_usuexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/exit.png"))); // NOI18N
        btn_usuexit.setText("Salir");
        btn_usuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuexitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_usuexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 90, 40));

        pedido_cod.setBackground(new java.awt.Color(255, 153, 153));
        pedido_cod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pedido_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedido_codActionPerformed(evt);
            }
        });
        getContentPane().add(pedido_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 100, -1));

        btn_usueliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/eliminar.png"))); // NOI18N
        btn_usueliminar.setText("Eliminar");
        btn_usueliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usueliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_usueliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 100, 40));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 70, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/fondosistema.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cj_sucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cj_sucKeyTyped
        ////convertir a mayusculas
        char c6 = evt.getKeyChar();
        if(Character.isLowerCase(c6)){
            String cad = ("" + c6).toUpperCase();
            c6 = cad.charAt(0);
            evt.setKeyChar(c6);
        }
    }//GEN-LAST:event_cj_sucKeyTyped

    private void cj_descriKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cj_descriKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cj_descriKeyTyped

    private void btn_usuguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuguardarActionPerformed

        
        int aux  =  JOptionPane.showConfirmDialog(null, "Desea Guardar el Registro?","OBSERVACION", JOptionPane.YES_NO_OPTION);
        if(aux == JOptionPane.YES_OPTION){
     
    	Conexion cc=new Conexion();
	Connection con=cc.conectar();
        int monto = 0;
        try {
        
        String sql = "INSERT INTO caja (caj_codigo, caj_descri, caj_suc,caj_montogs ) "
        + "values ('"+cj_codigo.getText()+"','"+cj_descri.getText()+"','"+cj_suc.getText()+"','"+monto+"')";	
        
        st = con.createStatement();			
        st.execute(sql); 
        metodos.CARGAR_JTABLE_caja();
        
        ////////////////////////////////////////////////////////////////////////////////////
        
        /*    try {
                String sq2 = "INSERT INTO contador (caj_codigo, su_codigo) "
                + "values ('"+cj_codigo.getText()+"','"+cj_suc.getText()+"')";	

                st = con.createStatement();			
                st.execute(sq2); 
                        
            } catch (Exception e) {
                System.out.println("ver error " + e.getMessage());
                
            }*/
        
        int j;
        int cont=1;
        String num="";
        String c="";
        
        //Conexion cc=new Conexion();
	//Connection con=cc.conectar();
        String sql1="select cont_secuencia from contador where cj_codigo = '"+cj_codigo.getText()+"' and su_codigo = '"+cj_suc.getText()+"'";
        //String SQL="select count(*) from factura";
        //String SQL="SELECT MAX(cod_clients) AS cod_emp FROM clients";
        //String SQL="SELECT @@identity AS ID";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sql1);
            if(rs.next())
            {
                c=rs.getString(1); 
                
                id.setText(rs.getString("cont_secuencia"));
                int nume = parseInt(id.getText());
                int add = nume + 1;  
                String cadena = Integer.toString(add);
                id.setText(cadena);
                
            }
 
            if(c==null){
                pedido_cod.setText("00000001");
                
                id.setText(rs.getString("cont_secuencia"));  
                int nume = parseInt(id.getText());
                int add = nume + 1;  
                String cadena = Integer.toString(add);
                id.setText(cadena);
            }
            else{
                 j=Integer.parseInt(c);
                 GenerarNumero gen= new GenerarNumero();
                 gen.generar(j);
                 pedido_cod.setText(gen.serie());
                 
                id.setText(rs.getString("cont_secuencia"));
                int nume = parseInt(id.getText());
                int add = nume + 1;  
                String cadena = Integer.toString(add);
                id.setText(cadena);
            }

        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            try {
                String sq2 = "INSERT INTO contador (caj_codigo, su_codigo, cont_secuencia ) "
                + "values ('"+cj_codigo.getText()+"','"+cj_suc.getText()+"','"+pedido_cod.getText()+"')";	

                st = con.createStatement();			
                st.execute(sq2); 
                        
            } catch (Exception e) {
            }
        /////////////////////////////////////////////////////////////////////////////////////////

       ventana_agregar.setVisible(false);

       } catch (SQLException ex) {
          System.out.println("ver error " + ex.getMessage());
           
       }
        }
    }//GEN-LAST:event_btn_usuguardarActionPerformed

    private void btn_cajacancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cajacancelarActionPerformed
 ventana_agregar.setVisible(false);
      
    }//GEN-LAST:event_btn_cajacancelarActionPerformed

    private void btn_usueliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usueliminarActionPerformed

    }//GEN-LAST:event_btn_usueliminarActionPerformed

    private void btn_addcajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addcajaActionPerformed
    ventana_agregar.setVisible(true);
     
    }//GEN-LAST:event_btn_addcajaActionPerformed

    private void cj_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cj_codigoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cj_codigoKeyTyped

    private void btn_usuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuexitActionPerformed
        dispose();


    }//GEN-LAST:event_btn_usuexitActionPerformed

    private void ventana_agregarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ventana_agregarKeyPressed
   
       // TODO add your handling code here:
    }//GEN-LAST:event_ventana_agregarKeyPressed

    private void jtable_sucuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_sucuMouseClicked
             
                int n1 = jtable_sucu.getSelectedRow();
                String id1 = jtable_sucu.getValueAt(n1, 0).toString();
                cj_suc.setText(id1);
                btn_addcaja.setEnabled(true);
 		
                Conexion cc=new Conexion();
		Connection con=cc.conectar();;
        	try {

                String[] titulo={"Codigo","Descripcion","Sucursal"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql = "Select * from caja where '"+cj_suc.getText()+"' = caj_suc ";

                
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		while (rs.next()) {
                    
                    reg[0]=rs.getString("caj_codigo");
                    reg[1]=rs.getString("caj_descri");
                    reg[2]=rs.getString("caj_suc");
				          
			mod.addRow(reg);

                    }
            jtable_caja.setModel(mod);
                    
            TableColumnModel columnModel = jtable_caja.getColumnModel();

                columnModel.getColumn(0).setPreferredWidth(50);
                columnModel.getColumn(1).setPreferredWidth(120);
               columnModel.getColumn(2).setPreferredWidth(80);

			rs.close();
			st.close();
			con.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
          
                
    }//GEN-LAST:event_jtable_sucuMouseClicked

    private void pedido_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedido_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pedido_codActionPerformed

    private void jScrollPane1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jScrollPane1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1KeyPressed

    private void jtable_sucuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtable_sucuKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }         // TODO add your handling code here:
    }//GEN-LAST:event_jtable_sucuKeyPressed

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
            java.util.logging.Logger.getLogger(caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new caja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addcaja;
    private javax.swing.JButton btn_cajacancelar;
    private javax.swing.JButton btn_usueliminar;
    private javax.swing.JButton btn_usuexit;
    private javax.swing.JButton btn_usuguardar;
    private javax.swing.JTextField cj_codigo;
    private javax.swing.JTextField cj_descri;
    private javax.swing.JTextField cj_suc;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jtable_caja;
    public static javax.swing.JTable jtable_sucu;
    public static javax.swing.JTextField pedido_cod;
    private javax.swing.JInternalFrame ventana_agregar;
    // End of variables declaration//GEN-END:variables
}