/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;

import static dbstock.vtacredito.txt_caja;
import java.awt.KeyEventPostProcessor;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
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
public class cobranza extends javax.swing.JFrame {

    /**
     * Creates new form cobranza
     */
    Statement st;
    Connection con;

    
    public cobranza() {
        initComponents();
        
        this.setLocationRelativeTo(null);//centra el formulario
        this.setTitle("Cobranza");
        setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE); //inabilida el uso del boton exit X
        this.setResizable(false); //Disable the Resize Button
        
        jPanel.setVisible(false);
        jpanel_monto.setVisible(false);
        btn_enviar.setVisible(false);
        btn_cobro.setEnabled(false);
        
        total_credito.setVisible(false);
        total_cobrado_2.setVisible(false);
        id_cre.setVisible(false);
        monto_cobranza.setVisible(false);
        metodoventa.cb_ajuste();
        metodoventa.cb_ajuste2();
        
       /* jpanel_monto.setVisible(false);
        btn_enviar.setVisible(false);*/
        idcli.setVisible(false);
        
        
       try {
                String descripcion_Caja = "";
                String  caja = "";
                String descripcion_sucursal = "";
                String  suc = "";
            String leearchivo = "";
            int i = 0;
            // lee ip y base de datos
            BufferedReader bf = new BufferedReader(new FileReader(new File("caja.txt").getAbsolutePath()));
               while ((leearchivo = bf.readLine()) != null) {
                    
                        if (i == 0) {
                            descripcion_Caja = leearchivo;   
                        }
                        if (i == 1) {
                            caja = leearchivo;                      
                        }
                        if (i == 2) {
                            descripcion_sucursal = leearchivo;                   
                        }
                        if (i == 3) {
                            suc = leearchivo;                     
                        }
                            i++;
                        }

           
        caja_txt.setText(caja);

       
            } catch (Exception e) {
                e.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jpanel_monto = new javax.swing.JPanel();
        mongocobrado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_detallecre = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_credito = new javax.swing.JTable();
        jPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablecliente = new javax.swing.JTable();
        buscacli = new javax.swing.JTextField();
        btn_selec = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        cli_cedula = new javax.swing.JTextField();
        cli_telefono = new javax.swing.JTextField();
        cli_nomb = new javax.swing.JTextField();
        cli_direcc = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        idcli = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cre_obs = new javax.swing.JTextField();
        btn_cobro = new javax.swing.JButton();
        id_cre = new javax.swing.JTextField();
        btn_enviar = new javax.swing.JButton();
        total_cobrado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        total_credito = new javax.swing.JTextField();
        total_cobrado_2 = new javax.swing.JTextField();
        caja_txt = new javax.swing.JLabel();
        monto_cobranza = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanel_monto.setBackground(new java.awt.Color(153, 153, 153));
        jpanel_monto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mongocobrado.setBackground(new java.awt.Color(204, 255, 255));
        mongocobrado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mongocobrado.setForeground(new java.awt.Color(255, 0, 0));
        mongocobrado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mongocobrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mongocobradoKeyPressed(evt);
            }
        });
        jpanel_monto.add(mongocobrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 14, 240, 40));

        getContentPane().add(jpanel_monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 260, 70));

        jtable_detallecre.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtable_detallecre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtable_detallecreKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtable_detallecre);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 530, 160));

        jtable_credito.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtable_credito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_creditoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtable_credito);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 840, 170));

        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablecliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        jTablecliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableclienteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTablecliente);

        jPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 300, 100));

        buscacli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscacliKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscacliKeyTyped(evt);
            }
        });
        jPanel.add(buscacli, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 140, -1));

        btn_selec.setText("Seleecionar");
        btn_selec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selecActionPerformed(evt);
            }
        });
        jPanel.add(btn_selec, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Buscar");
        jPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 50, 20));

        getContentPane().add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 320, 150));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/buscarcli.png"))); // NOI18N
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 100, 30));

        cli_cedula.setEditable(false);
        cli_cedula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(cli_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 110, -1));

        cli_telefono.setEditable(false);
        cli_telefono.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(cli_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 110, -1));

        cli_nomb.setEditable(false);
        cli_nomb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(cli_nomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 270, -1));

        cli_direcc.setEditable(false);
        cli_direcc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(cli_direcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 270, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Dirección");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 120, 20));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Nombre y Apellido");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 120, 20));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Documento");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 80, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Telefono");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 70, 20));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Datos de Cliente");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 130, 30));

        idcli.setEditable(false);
        getContentPane().add(idcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 40, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/exit.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, 90, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/x-button.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 120, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cobranza");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("VENTA CREDITO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("OBS:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, 30));

        cre_obs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cre_obsActionPerformed(evt);
            }
        });
        cre_obs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cre_obsKeyTyped(evt);
            }
        });
        getContentPane().add(cre_obs, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 440, 30));

        btn_cobro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cobro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/buy0.png"))); // NOI18N
        btn_cobro.setText("Realizar Cobro");
        btn_cobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cobroActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cobro, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 150, 40));
        getContentPane().add(id_cre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 70, -1));

        btn_enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/sent.png"))); // NOI18N
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, 40, 70));

        total_cobrado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total_cobrado.setForeground(new java.awt.Color(255, 0, 0));
        total_cobrado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(total_cobrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 130, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TOTAL PAGADO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, 30));
        getContentPane().add(total_credito, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 120, -1));
        getContentPane().add(total_cobrado_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 130, -1));

        caja_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        caja_txt.setText("caja");
        getContentPane().add(caja_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));
        getContentPane().add(monto_cobranza, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 70, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("CAJA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/fondosistema.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 890, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        jPanel.setVisible(true);
        
        String[] titulo={"Documento","Nombre"};
        DefaultTableModel mod=new DefaultTableModel(null,titulo);
        Object[] reg=new Object[7];
        String sql="select * from clientes ORDER BY cli_cedula DESC";
        Conexion cc=new Conexion();
        Connection con=cc.conectar();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                reg[0]=rs.getString("cli_cedula");
                reg[1]=rs.getString("cli_nombre");
                //reg[2]=rs.getString("cli_telefono");

                mod.addRow(reg);
            }
            jTablecliente.setModel(mod);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        //forma de quetenga la barra orizontal////////////
        jTablecliente.setAutoResizeMode(jTablecliente.AUTO_RESIZE_OFF);
        jTablecliente.doLayout();
        TableColumnModel columnModel = jTablecliente.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(90);
        columnModel.getColumn(1).setPreferredWidth(200);
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void buscacliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscacliKeyReleased
        metodos.convertiraMayusculasEnJtextfield(buscacli);
    }//GEN-LAST:event_buscacliKeyReleased

    private void buscacliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscacliKeyTyped

        String sql="SELECT * FROM clientes WHERE cli_nombre  LIKE '%"+buscacli.getText()+"%' ORDER BY cli_codigo";

        String[] titulo={"Documento","Nombre","Telefono"};
        DefaultTableModel mod=new DefaultTableModel(null,titulo);
        Object[] reg=new Object[7];
        Conexion cc=new Conexion();
        Connection con=cc.conectar();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                reg[0]=rs.getString("cli_cedula");
                reg[1]=rs.getString("cli_nombre");
                reg[2]=rs.getString("cli_telefono");

                mod.addRow(reg);
            }
            jTablecliente.setModel(mod);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //forma de quetenga la barra orizontal////////////
        jTablecliente.setAutoResizeMode(jTablecliente.AUTO_RESIZE_OFF);
        jTablecliente.doLayout();
        TableColumnModel columnModel = jTablecliente.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(100);
        columnModel.getColumn(1).setPreferredWidth(220);
        columnModel.getColumn(2).setPreferredWidth(120);
        // TODO add your handling code here:
    }//GEN-LAST:event_buscacliKeyTyped

    private void jTableclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableclienteMouseClicked

        int n1 = jTablecliente.getSelectedRow();
        String id = jTablecliente.getValueAt(n1, 0).toString();
        cli_cedula.setText(id);

        Conexion cc=new Conexion();
        Connection con=cc.conectar();
        try {

            String sql = "Select * from clientes where cli_cedula = '"+cli_cedula.getText()+"'";

            st = con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            if (rs.next()) {
                idcli.setText(rs.getString("cli_codigo"));
                cli_cedula.setText(rs.getString("cli_cedula"));
                cli_telefono.setText(rs.getString("cli_telefono"));
                cli_nomb.setText(rs.getString("cli_nombre"));
                cli_direcc.setText(rs.getString("cli_direccion"));
              
            }
            rs.close();
            st.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        if(evt.getClickCount()==1){
            jPanel.setVisible(false);
            // System.out.println("Se ha hecho un click");
        }
        metodoventa.CARGAR_JTABLE_CREDITO();


    }//GEN-LAST:event_jTableclienteMouseClicked

    private void btn_selecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selecActionPerformed

        jPanel.setVisible(false);
    }//GEN-LAST:event_btn_selecActionPerformed

    private void cre_obsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cre_obsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cre_obsActionPerformed

    private void jtable_detallecreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtable_detallecreKeyReleased
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
            try {
                Conexion cc=new Conexion();
                Connection con=cc.conectar();
                
                String cli_id = jtable_detallecre.getValueAt(jtable_detallecre.getSelectedRow(),0).toString();
                String cli_nomb = jtable_detallecre.getValueAt(jtable_detallecre.getSelectedRow(),1).toString();
                String nro_cobranza = jtable_detallecre.getValueAt(jtable_detallecre.getSelectedRow(),2).toString();
                String monto_pagado = jtable_detallecre.getValueAt(jtable_detallecre.getSelectedRow(),3).toString();
                
                String sql = "UPDATE detcobranza SET cbdeta_montopagado ='"+monto_pagado+"' WHERE cbdeta_nrocobranza = '"+nro_cobranza+"' ";
                st = con.createStatement();
                st.execute(sql);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
        }
    }//GEN-LAST:event_jtable_detallecreKeyReleased

    private void btn_cobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cobroActionPerformed
        jpanel_monto.setVisible(true);
        mongocobrado.requestFocus();
        btn_enviar.setVisible(true);
        
         
        
    }//GEN-LAST:event_btn_cobroActionPerformed

    private void jtable_creditoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_creditoMouseClicked
                int n0 = jtable_credito.getSelectedRow();
                String id = jtable_credito.getValueAt(n0, 0).toString();
                id_cre.setText(id);
                
                int n1 = jtable_credito.getSelectedRow();
                String id1 = jtable_credito.getValueAt(n1, 5).toString();
                total_credito.setText(id1);
                
                btn_cobro.setEnabled(true);
                metodoventa.CARGAR_JTABLE_detCREDITO();
                
                        ////////////////////////////////////SUMAR MONTO YA PAGADO DEL CREDITO////////////-----------------------               
        String suma="select SUM(cbdeta_montopago) from detcobranza where cbdeta_nrocobranza = '"+id_cre.getText()+"' and cbdeta_cli_id = '"+cli_cedula.getText()+"' ";                
         Conexion cc=new Conexion();
         Connection con=cc.conectar();
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma);
         
     
            if(rs.next())
            {
                 total_cobrado.setText(rs.getString("sum"));  
                 total_cobrado_2.setText(rs.getString("sum"));
            }

            if(total_cobrado_2.getText().length()==0){
                 total_cobrado_2.setText("0");
            }
            
        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }             
        
        if(total_cobrado.getText().length()==0){
            total_cobrado.setText("0");
            
        }
        else{
                     String cadena1;
                    int entero1;
                    cadena1 = total_cobrado.getText();
                    entero1 = parseInt(cadena1);  

                    DecimalFormat formatea = new DecimalFormat("###,###,###,###.##");

                    total_cobrado.setText(formatea.format(entero1));
        }
        

        /////////////////////////////////////////////---------------------------------------------  
                
                
    }//GEN-LAST:event_jtable_creditoMouseClicked

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed

           // total_cobrado_2.setText("0");
            
            int creditoo,total_pago, total, total_total;
            
            String credito = total_credito.getText();
            String total_pagado = total_cobrado_2.getText();
            String suma1 = mongocobrado.getText();
                    
            creditoo = parseInt(credito);
            total_pago = parseInt(total_pagado);
            total = parseInt(suma1);
            
            total_total = total_pago + total;
            
            if ( creditoo >= total_total ) {
                            
            Conexion cc=new Conexion();
            Connection con=cc.conectar();
            try {
                int estado = 1;
                String sqlinsertar = "INSERT INTO detcobranza (cbdeta_cli_id, cbdeta_cli_nomb, cbdeta_nrocobranza, cbdeta_montopago, cbdeta_obs, cbdeta_fecha, cbdeta_usu_autor, ci_estado) "
                + "values ('"+cli_cedula.getText()+"','"+cli_nomb.getText()+"','"+id_cre.getText()+"','"+mongocobrado.getText()+"',"
                + "'"+cre_obs.getText()+"','"+Principal.fecha_ini.getText()+"','"+Principal.usuario_ini.getText()+"', '"+estado+"')";
                st = con.createStatement();
                st.execute(sqlinsertar);
                
                JOptionPane.showMessageDialog(null, "Cobrado con exito");
               
                metodoventa.CARGAR_JTABLE_detCREDITO();
                
        ////////////////////////////////////SUMAR MONTO YA PAGADO DEL CREDITO////////////-----------------------               
        String suma="select SUM(cbdeta_montopago) from detcobranza where cbdeta_nrocobranza = '"+id_cre.getText()+"' and cbdeta_cli_id = '"+cli_cedula.getText()+"' ";                
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma);
            if(rs.next())
            {
                 total_cobrado.setText(rs.getString("sum"));  
                 total_cobrado_2.setText(rs.getString("sum"));
            }

        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "error" + ex);
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }             
        
 
        
        String cadena1;
        int entero1;
        cadena1 = total_cobrado.getText();
        entero1 = parseInt(cadena1);  

        DecimalFormat formatea = new DecimalFormat("###,###,###,###.##");

        total_cobrado.setText(formatea.format(entero1));
        /////////////////////////////////////////////---------------------------------------------   
           
            int restacre, saldo, monto;            
            String credito2 = total_credito.getText();
            String total_pagado2 = total_cobrado_2.getText();
            restacre = parseInt(credito2);
            monto = parseInt(total_pagado2);                        
            saldo = restacre - monto;           
                try {
                String sql1 = "UPDATE cobranza SET cb_fechapago = '"+Principal.fecha_ini.getText()+"', cb_montopago = '"+total_total+"',"
                + " cb_montosaldo = '"+saldo+"' where cb_nrocobranza = '"+id_cre.getText()+"' and cb_cli_id = '"+cli_cedula.getText()+"' ";
                st = con.createStatement();
                st.execute(sql1);              
                //JOptionPane.showMessageDialog(null, "Cobrado con exito");              
                metodoventa.CARGAR_JTABLE_detCREDITO();
                metodoventa.CARGAR_JTABLE_CREDITO();
                }catch(SQLException ex){
                    
                }
               
        
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error" + ex);
            }


            
            ////////////////////////////////////////////////------------------------------------------------------
                try {           
		String sql = "Select * from caja where caj_codigo = '"+caja_txt.getText()+"' and caj_suc = '"+Principal.sucursal_id.getText()+"'";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                         monto_cobranza.setText(rs.getString("caj_montogs"));
                    }
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
                            
                        String cb_montodecaja, cb_montoingresado,cb_st_incremento;
                        int cb_int_montodecaja,cb_int_montoingresado, cb_incremento;

                        cb_montodecaja = monto_cobranza.getText();
                        cb_montoingresado = mongocobrado.getText(); 

                        cb_int_montodecaja = parseInt(cb_montodecaja);
                        cb_int_montoingresado = parseInt(cb_montoingresado);

                        cb_incremento = cb_int_montodecaja + cb_int_montoingresado;
                        cb_st_incremento = Integer.toString(cb_incremento);
                        //cb_monto_caja.setText(cb_st_incremento); 
        
                try{
                    String cobranzacont = "update caja set caj_montogs ='"+cb_incremento+"' where caj_codigo = '"+caja_txt.getText()+"' and caj_suc = '"+Principal.sucursal_id.getText()+"' ";
                    st = con.createStatement();
                    st.execute(cobranzacont);
                }catch(Exception e11){
                   JOptionPane.showMessageDialog(null, "Error" +e11);
                }
            ///////////////////////////////////////////////////////---------------------------
            
            btn_enviar.setVisible(false);   //ocualta boton enviar
            jpanel_monto.setVisible(false);
            
            
                  ///////////////////////////////impresion/////////////////////////
      
         ////////////////////////////////imprimir/////////////////////////////////

                try {
                URL master = this.getClass().getResource("/reporte/cobranza_ticket.jasper");
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
                    
                    parametros.put("cb_id", Integer.parseInt(id_cre.getText()));
                    JasperPrint print = JasperFillManager.fillReport(masterreport, parametros, con);
                    JasperViewer ver = new JasperViewer(print,false);
                    ver.setTitle("Cobranza");
                    ver.setVisible(true);
            } catch (Exception e) {
                System.out.println("reporte.reporte.Reportefichaupdate()" + e);
                JOptionPane.showMessageDialog(null, "Mensaje  "+ e);
            }    
         
         ///////////////////////////////////////////////////////////////////////////
       ////////////////////////////////////////////////////////////////////////////////////
            
            }else {
                JOptionPane.showMessageDialog(null, "No puede realizar un pago con monto mayor a un credito" );
            }/////////////fin if / else 


    }//GEN-LAST:event_btn_enviarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        
        Principal.jMenu_cobranza.setEnabled(true);
        Principal.btn_cobranza.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mongocobradoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mongocobradoKeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         btn_enviar.doClick();
      }
        
    }//GEN-LAST:event_mongocobradoKeyPressed

    private void cre_obsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cre_obsKeyTyped
        ////convertir a mayusculas
        char c6 = evt.getKeyChar(); 
        if(Character.isLowerCase(c6)){
            String cad = ("" + c6).toUpperCase();
            c6 = cad.charAt(0);
            evt.setKeyChar(c6);
        }
    }//GEN-LAST:event_cre_obsKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(cobranza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cobranza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cobranza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cobranza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cobranza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cobro;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JButton btn_selec;
    private javax.swing.JTextField buscacli;
    private javax.swing.JLabel caja_txt;
    public static javax.swing.JTextField cli_cedula;
    public static javax.swing.JTextField cli_direcc;
    public static javax.swing.JTextField cli_nomb;
    public static javax.swing.JTextField cli_telefono;
    private javax.swing.JTextField cre_obs;
    public static javax.swing.JTextField id_cre;
    private javax.swing.JTextField idcli;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTablecliente;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel jpanel_monto;
    public static javax.swing.JTable jtable_credito;
    public static javax.swing.JTable jtable_detallecre;
    private javax.swing.JTextField mongocobrado;
    private javax.swing.JTextField monto_cobranza;
    public static javax.swing.JTextField total_cobrado;
    private javax.swing.JTextField total_cobrado_2;
    private javax.swing.JTextField total_credito;
    // End of variables declaration//GEN-END:variables
}
