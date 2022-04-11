/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;

import com.sun.glass.events.KeyEvent;
import static dbstock.caja_exten.cierre_caja_button;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
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
public class apertura extends javax.swing.JFrame {

    /**
     * Creates new form gastos
     */
    
    Statement st;
    Connection con;
    DateFormat df = DateFormat.getDateInstance();
    public apertura() {
        initComponents();
        
        this.setLocationRelativeTo(null);//centra el formulario
        this.setTitle("Ingresos");
       setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE); //inabilida el uso del boton exit X
        this.setResizable(false); //Disable the Resize Button

        metodoingreso.cmb_sucursal_apertura();
       // metodoingreso.cmb_sucursal_ingreso2();
        metodoingreso.CARGAR_JTABLE_apertura();
        jpanel_filter.setVisible(false);
        
        Calendar Cal1= Calendar.getInstance();
        fecha_fin.setCalendar(Cal1);
        fecha_ini.setCalendar(Cal1);

        Calendar Cal= Calendar.getInstance();
        String fecha= Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+"/"+Cal.get(Cal.YEAR);
        fecha_inicial.setText(fecha);
        fecha_final.setText(fecha);
        
        fecha_inicial.setVisible(false);
        fecha_final.setVisible(false);
        monto.setVisible(false);
        id_suc.setVisible(false);
        monto_ingreso.setEnabled(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_caja1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        descri = new javax.swing.JLabel();
        cmb_sucu_gasto = new javax.swing.JComboBox<>();
        monto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        label_ingreso = new javax.swing.JLabel();
        btn_confirmar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        monto_ingreso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        id_suc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        obs_ingreso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_gasto = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        check_filter = new javax.swing.JCheckBox();
        check_todos = new javax.swing.JCheckBox();
        jpanel_filter = new javax.swing.JPanel();
        fecha_fin = new com.toedter.calendar.JDateChooser();
        fecha_ini = new com.toedter.calendar.JDateChooser();
        jButton5 = new javax.swing.JButton();
        cmb_suc_gasto = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fecha_inicial = new javax.swing.JTextField();
        fecha_final = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(204, 255, 204));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtable_caja1.setModel(new javax.swing.table.DefaultTableModel(
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
        jtable_caja1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_caja1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtable_caja1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 310, 150));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Caja:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, 20));

        descri.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        descri.setText("caja");
        jPanel1.add(descri, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 50, 20));

        cmb_sucu_gasto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmb_sucu_gasto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_sucu_gasto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_sucu_gastoMouseClicked(evt);
            }
        });
        cmb_sucu_gasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sucu_gastoActionPerformed(evt);
            }
        });
        jPanel1.add(cmb_sucu_gasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 230, -1));
        jPanel1.add(monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 120, -1));

        jLabel3.setText("Seleccione Cja");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        id.setText("id");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 40, 20));

        label_ingreso.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        label_ingreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_ingreso.setText("APERTURA DE CAJA");
        jPanel1.add(label_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 10, 270, -1));

        btn_confirmar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_confirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/bien.png"))); // NOI18N
        btn_confirmar.setText("Confirmar");
        btn_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmarActionPerformed(evt);
            }
        });
        btn_confirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_confirmarKeyPressed(evt);
            }
        });
        jPanel1.add(btn_confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 120, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/log-in.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 100, 40));

        monto_ingreso.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        monto_ingreso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        monto_ingreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                monto_ingresoKeyPressed(evt);
            }
        });
        jPanel1.add(monto_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 220, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Codigo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, 20));
        jPanel1.add(id_suc, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 40, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Observación");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Monto en GUARANIES");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        jLabel12.setText("Seleccione Sucursal");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        obs_ingreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                obs_ingresoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                obs_ingresoKeyTyped(evt);
            }
        });
        jPanel1.add(obs_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 560, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/fondosistema.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 350));

        jTabbedPane1.addTab("Ingresos", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtable_gasto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtable_gasto);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 580, 200));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 110, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Imprimir");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 110, 30));

        check_filter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        check_filter.setText("Filtrar");
        check_filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_filterActionPerformed(evt);
            }
        });
        jPanel2.add(check_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        check_todos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        check_todos.setSelected(true);
        check_todos.setText("Todos los Ingresos");
        check_todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_todosActionPerformed(evt);
            }
        });
        jPanel2.add(check_todos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jpanel_filter.setBackground(new java.awt.Color(204, 204, 204));
        jpanel_filter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpanel_filter.add(fecha_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 140, -1));
        jpanel_filter.add(fecha_ini, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/buscarcli.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jpanel_filter.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 13, 50, 40));

        cmb_suc_gasto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpanel_filter.add(cmb_suc_gasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 210, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Seleccione Sucursal");
        jpanel_filter.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Hasta");
        jpanel_filter.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Desde");
        jpanel_filter.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel2.add(jpanel_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 370, 90));
        jPanel2.add(fecha_inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 60, -1));
        jPanel2.add(fecha_final, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 60, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/fondosistema.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 350));

        jTabbedPane1.addTab("Detalle de Ingresos", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_sucu_gastoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_sucu_gastoMouseClicked
        metodoingreso.ingreso();

        Conexion cc = new Conexion();
        Connection con = cc.conectar();;
        try {
            String[] titulo = {"Codigo", "Descripcion", "Monto GS"};
            DefaultTableModel mod = new DefaultTableModel(null, titulo);
            Object[] reg = new Object[7];
            String sql = "Select * from caja where '" +id_suc.getText()+ "' = caj_suc ";
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                reg[0] = rs.getString("caj_codigo");
                reg[1] = rs.getString("caj_descri");
                reg[2] = rs.getString("caj_montogs");
                mod.addRow(reg);
            }
            jtable_caja1.setModel(mod);

            TableColumnModel columnModel = jtable_caja1.getColumnModel();

            columnModel.getColumn(0).setPreferredWidth(50);
            columnModel.getColumn(1).setPreferredWidth(120);
            columnModel.getColumn(2).setPreferredWidth(100);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_cmb_sucu_gastoMouseClicked

    private void cmb_sucu_gastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sucu_gastoActionPerformed
        metodoingreso.ingresoaper();

        Conexion cc = new Conexion();
        Connection con = cc.conectar();;
        try {
            String[] titulo = {"Codigo", "Descripcion", "Monto GS"};
            DefaultTableModel mod = new DefaultTableModel(null, titulo);
            Object[] reg = new Object[7];
            String sql = "Select * from caja where '" +id_suc.getText()+ "' = caj_suc ";
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                reg[0] = rs.getString("caj_codigo");
                reg[1] = rs.getString("caj_descri");
                reg[2] = rs.getString("caj_montogs");
                mod.addRow(reg);
            }
            jtable_caja1.setModel(mod);

            TableColumnModel columnModel = jtable_caja1.getColumnModel();

            columnModel.getColumn(0).setPreferredWidth(50);
            columnModel.getColumn(1).setPreferredWidth(120);
            columnModel.getColumn(2).setPreferredWidth(100);
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_cmb_sucu_gastoActionPerformed

    private void jtable_caja1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_caja1MouseClicked

        int n1 = jtable_caja1.getSelectedRow();
        String id1 = jtable_caja1.getValueAt(n1, 0).toString();
        id.setText(id1);

        int n2 = jtable_caja1.getSelectedRow();
        String id2 = jtable_caja1.getValueAt(n2, 1).toString();
        descri.setText(id2);

        int n3 = jtable_caja1.getSelectedRow();
        String id3 = jtable_caja1.getValueAt(n3, 2).toString();
        monto.setText(id3);
        
        monto_ingreso.setEnabled(true);
        monto_ingreso.requestFocus();

    }//GEN-LAST:event_jtable_caja1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        caja_exten.reload_button.doClick();
        caja_exten.jButton2.setEnabled(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmarActionPerformed
        if(obs_ingreso.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Agregue una Observación sobre el Ingreso");
            obs_ingreso.requestFocus();
        }else{
                    
                String monto1 = monto.getText();
                String monto_ingre = monto_ingreso.getText();
                                
                int montoo = parseInt(monto1);
                int monto_ingresa = parseInt(monto_ingre);
                
                if (monto_ingresa <= montoo) {
                    
                    int sum = montoo + monto_ingresa;
                    
                    Conexion cc=new Conexion();
                    Connection con=cc.conectar();
                    try {
                    String updasum = "UPDATE caja SET caj_montogs = '"+sum+"'"
                    + " where caj_codigo = '"+id.getText()+"' and caj_suc = '"+id_suc.getText()+"' ";
                    st = con.createStatement();
                    st.execute(updasum);              

                    }catch(SQLException ex){
                            System.out.println("ver error " + ex.getMessage());
                    }
                    
                    
                       
                    
                    
        try {     
            int estado = 1;
        String sqlinser = "INSERT INTO ingreso (ing_sucid, ing_sucdes, ing_cajaid, ing_cajades, ing_montogs,"
        + "ing_fecha, ing_usuario, ing_obs, ci_estado )"
        + "values ('"+id_suc.getText()+"' ,'"+cmb_sucu_gasto.getSelectedItem()+"','"+id.getText()+"','"+descri.getText()+"','"+monto_ingreso.getText()+"',"
        + "'"+Principal.fecha_ini.getText()+"', '"+Principal.usuario_ini.getText()+"','"+obs_ingreso.getText()+"', '"+estado+"')";	

                    st = con.createStatement();			
                    st.execute(sqlinser); 
                    
                    JOptionPane.showMessageDialog(null, "Ingreso de Dinero realizado con exito"); 
        } catch (SQLException ex) {
                      System.out.println("ver error " + ex.getMessage());

        }  
        

        try {     
            
        int estado = 1;
        String sqlinser = "INSERT INTO cierrecaja (ci_fechaape, ci_nro, ci_usuarioaper, ci_montoaper, ci_estado )"
        + "values ('"+caja_exten.cierre_fecha.getText()+"' ,'"+caja_exten.id.getText()+"','"+caja_exten.txt_usuario_cierre.getText()+"','"+monto_ingreso.getText()+"' , '"+estado+"')";	

                    st = con.createStatement();			
                    st.execute(sqlinser); 
                    
                    JOptionPane.showMessageDialog(null, "Apertura de Caja realizada con exito"); 
                    
                   
                            st.close();
                            con.close();
                    
        } catch (SQLException ex) {
                      System.out.println("ver error " + ex.getMessage());

        } 
          
        cierre_caja_button.setEnabled(true);
        monto_ingreso.setText("");
        obs_ingreso.setText("");
                    
        this.jButton1.doClick();
        
       
                }
            
        }
    }//GEN-LAST:event_btn_confirmarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void check_filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_filterActionPerformed
      if(check_filter.isSelected()){
         this.check_todos.setSelected(false);
         jpanel_filter.setVisible(true);
      }else{
         this.check_todos.setSelected(true);
         jpanel_filter.setVisible(false);
      }
        
    }//GEN-LAST:event_check_filterActionPerformed

    private void check_todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_todosActionPerformed
        if(check_todos.isSelected()){
         this.check_filter.setSelected(false);
         jpanel_filter.setVisible(false);
         metodoingreso.CARGAR_JTABLE_ingreso();
      }else{
         this.check_filter.setSelected(true);
         jpanel_filter.setVisible(true);
            
        }
    }//GEN-LAST:event_check_todosActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String fechaObtenida = df.format(fecha_ini.getDate());
        fecha_inicial.setText(fechaObtenida);

        String fechafinal = df.format(fecha_fin.getDate());
        fecha_final.setText(fechafinal);  
        
        metodoingreso.CARGAR_JTABLE_ingreso_bus();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void obs_ingresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_obs_ingresoKeyTyped
        ////convertir a mayusculas
        char c6 = evt.getKeyChar(); 
        if(Character.isLowerCase(c6)){
            String cad = ("" + c6).toUpperCase();
            c6 = cad.charAt(0);
            evt.setKeyChar(c6);
        }
    }//GEN-LAST:event_obs_ingresoKeyTyped

    private void monto_ingresoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_monto_ingresoKeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          obs_ingreso.requestFocus();
      }
    }//GEN-LAST:event_monto_ingresoKeyPressed

    private void obs_ingresoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_obs_ingresoKeyPressed
        
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          btn_confirmar.requestFocus();
          
      }        
                
    }//GEN-LAST:event_obs_ingresoKeyPressed

    private void btn_confirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_confirmarKeyPressed
             if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          btn_confirmar.doClick();
          
      }  
    }//GEN-LAST:event_btn_confirmarKeyPressed

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
            java.util.logging.Logger.getLogger(apertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(apertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(apertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(apertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new apertura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_confirmar;
    private javax.swing.JCheckBox check_filter;
    private javax.swing.JCheckBox check_todos;
    public static javax.swing.JComboBox<String> cmb_suc_gasto;
    public static javax.swing.JComboBox<String> cmb_sucu_gasto;
    private javax.swing.JLabel descri;
    private com.toedter.calendar.JDateChooser fecha_fin;
    public static javax.swing.JTextField fecha_final;
    private com.toedter.calendar.JDateChooser fecha_ini;
    public static javax.swing.JTextField fecha_inicial;
    private javax.swing.JLabel id;
    public static javax.swing.JTextField id_suc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpanel_filter;
    public static javax.swing.JTable jtable_caja1;
    public static javax.swing.JTable jtable_gasto;
    public static javax.swing.JLabel label_ingreso;
    private javax.swing.JTextField monto;
    private javax.swing.JTextField monto_ingreso;
    public static javax.swing.JTextField obs_ingreso;
    // End of variables declaration//GEN-END:variables
}
