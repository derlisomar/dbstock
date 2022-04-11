/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;


import java.awt.event.KeyEvent;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Derlis
 */
public class consulta_vta extends javax.swing.JFrame {

    Statement st;
    Connection con;
    DateFormat df = DateFormat.getDateInstance();
    
    public consulta_vta() {
        initComponents();
        
        this.setLocationRelativeTo(null);//centra el formulario
        this.setTitle("CONSULTAS");
        
        Calendar Cal1= Calendar.getInstance();
        fecha_fin.setCalendar(Cal1);
        fecha_ini.setCalendar(Cal1);

        Calendar Cal= Calendar.getInstance();
        String fecha= Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+"/"+Cal.get(Cal.YEAR);
        fecha_inicial.setText(fecha);
        fecha_final.setText(fecha);
        
        metodoventa.cmb_caja_vta();
        //metodoventa.cmb_vendedor_vta();
        metodoventa.cmb_sucursal_vta();
        
        metodoventa.cmb_vendedor_vta_ajuste();
        metodoventa.cmb_vendedor_vta_ajuste2();
        
    
        btn_reimprmir.setEnabled(false);
        btn_listaado.setEnabled(false);
        btn_anulado.setEnabled(false);
        btn_reimprmir_fac.setEnabled(false);
        condici.setVisible(false);
        btm_boleta.setEnabled(false);
        
        id_vta.setVisible(false);
        documento_ci.setVisible(false);
        fecha_inicial.setVisible(false);
        fecha_final.setVisible(false);
        jButton2.setVisible(false);
        monto.setVisible(false);
        
        
    }

    void pintarColumnaTabla(){
        ColorearFilas color = new ColorearFilas(9);
        jtable_venta.getColumnModel().getColumn(9).setCellRenderer(color);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_venta = new javax.swing.JTable();
        cant_vta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fecha_fin = new com.toedter.calendar.JDateChooser();
        fecha_ini = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        cmb_suc = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmb_caja = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_calcular = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        monto_gs = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_vta_detalle = new javax.swing.JTable();
        btn_usuexit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        canti = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        contado = new javax.swing.JCheckBox();
        credito = new javax.swing.JCheckBox();
        todos = new javax.swing.JCheckBox();
        lb_suc = new javax.swing.JLabel();
        lb_caja = new javax.swing.JLabel();
        monto_us = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        monto_rs = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        monto_pa = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btn_reimprmir = new javax.swing.JButton();
        fecha_inicial = new javax.swing.JTextField();
        fecha_final = new javax.swing.JTextField();
        id_vta = new javax.swing.JTextField();
        monto = new javax.swing.JLabel();
        documento_ci = new javax.swing.JTextField();
        btn_anulado = new javax.swing.JButton();
        btn_listaado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        condici = new javax.swing.JLabel();
        btn_reimprmir_fac = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btm_boleta = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtable_venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Codigo", "Documento", "Nombre y Apellido", "null", "Título 6", "Título 7", "Título 8", "Título 9", "Título 10", "Título 11"
            }
        ));
        jtable_venta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_ventaMouseClicked(evt);
            }
        });
        jtable_venta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtable_ventaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtable_ventaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtable_venta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 870, 200));

        cant_vta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cant_vta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cant_vta.setText("cant");
        getContentPane().add(cant_vta, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, 50, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("FECHA DESDE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        fecha_fin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fecha_finKeyPressed(evt);
            }
        });
        getContentPane().add(fecha_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 140, -1));

        fecha_ini.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fecha_iniKeyPressed(evt);
            }
        });
        getContentPane().add(fecha_ini, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("FECHA HASTA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 100, 20));

        cmb_suc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sucActionPerformed(evt);
            }
        });
        cmb_suc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmb_sucKeyPressed(evt);
            }
        });
        getContentPane().add(cmb_suc, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 140, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Filtros");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 50, 20));

        cmb_caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_cajaActionPerformed(evt);
            }
        });
        cmb_caja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmb_cajaKeyPressed(evt);
            }
        });
        getContentPane().add(cmb_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 140, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CAJA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 40, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("SUCURSAL");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, 20));

        btn_calcular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_calcular.setText("Calcular");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });
        btn_calcular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_calcularKeyPressed(evt);
            }
        });
        getContentPane().add(btn_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 90, 60));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 300, 40, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Cant:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 40, 20));

        monto_gs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        monto_gs.setForeground(new java.awt.Color(255, 0, 0));
        monto_gs.setText("montoGS");
        getContentPane().add(monto_gs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 160, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Monto total GS:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 110, 20));

        jtable_vta_detalle.setModel(new javax.swing.table.DefaultTableModel(
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
        jtable_vta_detalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtable_vta_detalleKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jtable_vta_detalle);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 660, 180));

        btn_usuexit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
        getContentPane().add(btn_usuexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 540, 100, 40));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(51, 255, 51));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("ITEM CANTIDAD");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 110, 20));

        canti.setBackground(new java.awt.Color(51, 255, 51));
        canti.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        canti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        canti.setText("CANT");
        jPanel1.add(canti, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 50, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 660, 20));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 60));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contado.setText("Contado");
        contado.setBorderPainted(true);
        contado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contadoActionPerformed(evt);
            }
        });
        contado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contadoKeyPressed(evt);
            }
        });
        jPanel3.add(contado, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 46, -1, -1));

        credito.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        credito.setText("Credito");
        credito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditoActionPerformed(evt);
            }
        });
        credito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                creditoKeyPressed(evt);
            }
        });
        jPanel3.add(credito, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 46, -1, -1));

        todos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        todos.setSelected(true);
        todos.setText("Todos");
        todos.setBorderPainted(true);
        todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosActionPerformed(evt);
            }
        });
        todos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                todosKeyPressed(evt);
            }
        });
        jPanel3.add(todos, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 46, -1, -1));
        jPanel3.add(lb_suc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 40, 20));
        jPanel3.add(lb_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 30, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 480, 90));

        monto_us.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        monto_us.setForeground(new java.awt.Color(255, 0, 0));
        monto_us.setText("montoUS");
        getContentPane().add(monto_us, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 150, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Monto total US:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 110, 20));

        monto_rs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        monto_rs.setForeground(new java.awt.Color(255, 0, 0));
        monto_rs.setText("montoRS");
        getContentPane().add(monto_rs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 160, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Monto total RS:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 110, 20));

        monto_pa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        monto_pa.setForeground(new java.awt.Color(255, 0, 0));
        monto_pa.setText("montoPA");
        getContentPane().add(monto_pa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 160, 20));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Monto total PA:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 110, 20));

        btn_reimprmir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_reimprmir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/printer14.png"))); // NOI18N
        btn_reimprmir.setText("Re Ticket");
        btn_reimprmir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reimprmirActionPerformed(evt);
            }
        });
        btn_reimprmir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_reimprmirKeyPressed(evt);
            }
        });
        getContentPane().add(btn_reimprmir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 130, 40));
        getContentPane().add(fecha_inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 90, -1));
        getContentPane().add(fecha_final, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 90, -1));
        getContentPane().add(id_vta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 40, -1));
        getContentPane().add(monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 80, 20));
        getContentPane().add(documento_ci, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 80, -1));

        btn_anulado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_anulado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/x-button.png"))); // NOI18N
        btn_anulado.setText("Anular Boleta");
        btn_anulado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anuladoActionPerformed(evt);
            }
        });
        btn_anulado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_anuladoKeyPressed(evt);
            }
        });
        getContentPane().add(btn_anulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 540, 140, 40));

        btn_listaado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_listaado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/printer.png"))); // NOI18N
        btn_listaado.setText("Listado");
        btn_listaado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listaadoActionPerformed(evt);
            }
        });
        btn_listaado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_listaadoKeyPressed(evt);
            }
        });
        getContentPane().add(btn_listaado, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 540, 110, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Consulta de Ventas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        condici.setText("CONTADO");
        getContentPane().add(condici, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 120, 20));

        btn_reimprmir_fac.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_reimprmir_fac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/recepcion.png"))); // NOI18N
        btn_reimprmir_fac.setText("Re Factura");
        btn_reimprmir_fac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reimprmir_facActionPerformed(evt);
            }
        });
        btn_reimprmir_fac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_reimprmir_facKeyPressed(evt);
            }
        });
        getContentPane().add(btn_reimprmir_fac, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 130, 40));

        jLabel10.setText("Re imprimir");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, -1, 20));

        jLabel12.setText("solo si es Boleta");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, -1, -1));

        jLabel13.setText("solo si es Ticket");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 370, -1));

        btm_boleta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btm_boleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/printer.png"))); // NOI18N
        btm_boleta.setText("Reimprimir Boleta");
        btm_boleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_boletaActionPerformed(evt);
            }
        });
        getContentPane().add(btm_boleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 170, 40));

        jLabel14.setText("solo si es factura");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/fondosistema.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_usuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuexitActionPerformed
        dispose();

   
    }//GEN-LAST:event_btn_usuexitActionPerformed

    private void jtable_ventaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtable_ventaKeyReleased

    }//GEN-LAST:event_jtable_ventaKeyReleased

    private void btn_reimprmirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reimprmirActionPerformed
        
        
            Conexion cc=new Conexion();
            Connection con=cc.conectar();
         ////////////////////////////////imprimir/////////////////////////////////

                try {
                URL master = this.getClass().getResource("/reporte/vta_ticket_sinfac.jasper");
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
                    
                    parametros.put("vta_id", Integer.parseInt(id_vta.getText()));
                    JasperPrint print = JasperFillManager.fillReport(masterreport, parametros, con);
                    JasperViewer ver = new JasperViewer(print,false);
                    ver.setTitle("Reimprimir Ticket");
                    ver.setVisible(true);
            } catch (Exception e) {
                System.out.println("reporte.reporte.Reportefichaupdate()" + e);
                JOptionPane.showMessageDialog(null, "Mensaje  "+ e);
            }    
         
         ///////////////////////////////////////////////////////////////////////////
         
         
    }//GEN-LAST:event_btn_reimprmirActionPerformed

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed

       
        //////////////////////
                Conexion cc=new Conexion();
		Connection con=cc.conectar();

                String prov12="select * from caja where caj_descri = '"+cmb_caja.getSelectedItem()+"'";
                try {
                //consulta_vta.cmb_suc.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(prov12);

			while(rs.next()){

                                consulta_vta.lb_caja.setText(rs.getString("caj_codigo"));
			}
	
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
        ////////////////////////
        
               // Conexion cc=new Conexion();
		//Connection con=cc.conectar();

                String prov="select * from sucursal where su_descri = '"+cmb_suc.getSelectedItem()+"'";
                try {
                //consulta_vta.cmb_suc.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(prov);

			while(rs.next()){

                                consulta_vta.lb_suc.setText(rs.getString("su_codigo"));
			}
	
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
        
        
        String fechaObtenida = df.format(fecha_ini.getDate());
        fecha_inicial.setText(fechaObtenida);

        String fechafinal = df.format(fecha_fin.getDate());
        fecha_final.setText(fechafinal);    
        
        metodoventa.CARGAR_JTABLE_venta();
        pintarColumnaTabla();
        

        String sql="select count(*) from venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sql);
            if(rs.next())
            {
                 cant_vta.setText(rs.getString("count"));
            }

        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ///////////////////////////////suma total guaranies--------------------------------------
        String suma="select SUM(vta_montogs) from venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma);
            if(rs.next())
            {
                 monto_gs.setText(rs.getString("sum"));
                      
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        } 
        /////////////////////////////////////////////////////////////////---------------------
                ///////////////////////////////suma total dolares--------------------------------------
        String suma_us="select SUM(vta_montous) from venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma_us);
            if(rs.next())
            {
                 monto_us.setText(rs.getString("sum")); 
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        } 
        /////////////////////////////////////////////////////////////////---------------------
        
        ///////////////////////////////suma total reales--------------------------------------
        String suma_rs="select SUM(vta_montors) from venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma_rs);
            if(rs.next())
            {
                 monto_rs.setText(rs.getString("sum"));  
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        } 
        /////////////////////////////////////////////////////////////////---------------------
                ///////////////////////////////suma total reales--------------------------------------
        String suma_pa="select SUM(vta_montoar) from venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma_pa);
            if(rs.next())
            {
                 monto_pa.setText(rs.getString("sum"));  
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        } 
        /////////////////////////////////////////////////////////////////---------------------
        /////////////////////////////////convertir a numeros con comas------------------------------------------------
        String guarani, dolar, real, peso;
        int entero1,dolarint, realint, pesoint;
        guarani = monto_gs.getText();
        entero1 = parseInt(guarani);  

        dolar = monto_us.getText();
        dolarint = parseInt(dolar); 
        
        real = monto_rs.getText();
        realint = parseInt(real);
        
        peso = monto_pa.getText();
        pesoint = parseInt(peso);
        
        DecimalFormat formatea = new DecimalFormat("###,###,###,###,###.##");

        monto_gs.setText(formatea.format(entero1));
        monto_us.setText(formatea.format(dolarint));
        monto_rs.setText(formatea.format(realint));
        monto_pa.setText(formatea.format(pesoint));
        ////////////////////////////////////////////------------------------------------------------------------------
        
         btn_listaado.setEnabled(true);
         
    }//GEN-LAST:event_btn_calcularActionPerformed

    private void jtable_ventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_ventaMouseClicked
         
                int n0 = jtable_venta.getSelectedRow();
                String id = jtable_venta.getValueAt(n0, 0).toString();
                id_vta.setText(id);
                
                int n1 = jtable_venta.getSelectedRow();
                String id2 = jtable_venta.getValueAt(n1, 2).toString();
                documento_ci.setText(id2);
                
                int n2 = jtable_venta.getSelectedRow();
                String id3 = jtable_venta.getValueAt(n2, 4).toString();
                monto.setText(id3);
                
                int n3 = jtable_venta.getSelectedRow();
                String id4 = jtable_venta.getValueAt(n3, 9).toString();
                condici.setText(id4);
        
                btn_reimprmir.setEnabled(true);
                btn_anulado.setEnabled(true);
                btn_reimprmir_fac.setEnabled(true);
                btm_boleta.setEnabled(true);
                
                
        Conexion cc=new Conexion();
        Connection con=cc.conectar();;
        try {
            
            String[] titulo={"id prod","Descripcion","Precio","Cantidad","Total"};
            DefaultTableModel mod=new DefaultTableModel(null,titulo);
        
            Object[] reg=new Object[7];
            String sql = "Select * from detallevta where '"+id_vta.getText()+"' = detvta_num_deta ";

            st = con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while (rs.next()) {

                reg[0]=rs.getString("detvta_id_prod");
                reg[1]=rs.getString("detvta_nomb_pro");
                reg[2]=rs.getString("detvta_preciogs");
                reg[3]=rs.getString("detvta_cant");
                reg[4]=rs.getString("detvta_preciototal");

                mod.addRow(reg);

            }
            jtable_vta_detalle.setModel(mod);

            TableColumnModel columnModel = jtable_vta_detalle.getColumnModel();

            columnModel.getColumn(0).setPreferredWidth(60);
            columnModel.getColumn(1).setPreferredWidth(200);
            columnModel.getColumn(2).setPreferredWidth(80);
            columnModel.getColumn(3).setPreferredWidth(30);
            columnModel.getColumn(4).setPreferredWidth(80);


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

         
         
        String sql="select count(*) from detallevta where '"+id_vta.getText()+"' = detvta_num_deta";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sql);
            if(rs.next())
            {
                 canti.setText(rs.getString("count"));
            }

        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jtable_ventaMouseClicked

    private void todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosActionPerformed
        if(todos.isSelected()){ 
            
           this.contado.setSelected(false);
           this.credito.setSelected(false);
           ////////////////////////////////////////////////////
           
                 
        //////////////////////
                Conexion cc=new Conexion();
		Connection con=cc.conectar();

                String prov12="select * from caja where caj_descri = '"+cmb_caja.getSelectedItem()+"'";
                try {
                //consulta_vta.cmb_suc.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(prov12);

			while(rs.next()){

                                consulta_vta.lb_caja.setText(rs.getString("caj_codigo"));
			}
	
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
        ////////////////////////
        
               // Conexion cc=new Conexion();
		//Connection con=cc.conectar();

                String prov="select * from sucursal where su_descri = '"+cmb_suc.getSelectedItem()+"'";
                try {
                //consulta_vta.cmb_suc.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(prov);

			while(rs.next()){

                                consulta_vta.lb_suc.setText(rs.getString("su_codigo"));
			}
	
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
        
        
        String fechaObtenida = df.format(fecha_ini.getDate());
        fecha_inicial.setText(fechaObtenida);

        String fechafinal = df.format(fecha_fin.getDate());
        fecha_final.setText(fechafinal);    
        
        metodoventa.CARGAR_JTABLE_venta();
        pintarColumnaTabla();
        

        String sql="select count(*) from venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sql);
            if(rs.next())
            {
                 cant_vta.setText(rs.getString("count"));
            }

        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ///////////////////////////////suma total guaranies--------------------------------------
        String suma="select SUM(vta_montogs) from venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma);
            if(rs.next())
            {
                 monto_gs.setText(rs.getString("sum"));
                      
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        } 
        /////////////////////////////////////////////////////////////////---------------------
                ///////////////////////////////suma total dolares--------------------------------------
        String suma_us="select SUM(vta_montous) from venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma_us);
            if(rs.next())
            {
                 monto_us.setText(rs.getString("sum")); 
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        } 
        /////////////////////////////////////////////////////////////////---------------------
        
        ///////////////////////////////suma total reales--------------------------------------
        String suma_rs="select SUM(vta_montors) from venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma_rs);
            if(rs.next())
            {
                 monto_rs.setText(rs.getString("sum"));  
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        } 
        /////////////////////////////////////////////////////////////////---------------------
                ///////////////////////////////suma total reales--------------------------------------
        String suma_pa="select SUM(vta_montoar) from venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma_pa);
            if(rs.next())
            {
                 monto_pa.setText(rs.getString("sum"));  
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        } 
        /////////////////////////////////////////////////////////////////---------------------
        /////////////////////////////////convertir a numeros con comas------------------------------------------------
        String guarani, dolar, real, peso;
        int entero1,dolarint, realint, pesoint;
        guarani = monto_gs.getText();
        entero1 = parseInt(guarani);  

        dolar = monto_us.getText();
        dolarint = parseInt(dolar); 
        
        real = monto_rs.getText();
        realint = parseInt(real);
        
        peso = monto_pa.getText();
        pesoint = parseInt(peso);
        
        DecimalFormat formatea = new DecimalFormat("###,###,###,###,###.##");

        monto_gs.setText(formatea.format(entero1));
        monto_us.setText(formatea.format(dolarint));
        monto_rs.setText(formatea.format(realint));
        monto_pa.setText(formatea.format(pesoint));
        ////////////////////////////////////////////------------------------------------------------------------------
        
         btn_listaado.setEnabled(true);
         
           
           ////////////////////////////////////////////////
        } 

    }//GEN-LAST:event_todosActionPerformed

    private void creditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditoActionPerformed
        if(credito.isSelected()){
           //metodoproducto.CARGAR_JTABLE_productos_2();
           this.todos.setSelected(false);
           this.contado.setSelected(false);
           
           /////////////////////////////////////////////////////////////////////////////////////////
            //////////////////////
                Conexion cc=new Conexion();
		Connection con=cc.conectar();

                String prov12="select * from caja where caj_descri = '"+cmb_caja.getSelectedItem()+"'";
                try {
                //consulta_vta.cmb_suc.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(prov12);

			while(rs.next()){

                                consulta_vta.lb_caja.setText(rs.getString("caj_codigo"));
			}
	
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
        ////////////////////////
        
               // Conexion cc=new Conexion();
		//Connection con=cc.conectar();

                String prov="select * from sucursal where su_descri = '"+cmb_suc.getSelectedItem()+"'";
                try {
                //consulta_vta.cmb_suc.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(prov);

			while(rs.next()){

                                consulta_vta.lb_suc.setText(rs.getString("su_codigo"));
			}
	
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
        
        
        String fechaObtenida = df.format(fecha_ini.getDate());
        fecha_inicial.setText(fechaObtenida);

        String fechafinal = df.format(fecha_fin.getDate());
        fecha_final.setText(fechafinal);    
        
        metodoventa.CARGAR_JTABLE_venta_CREDITO();
        pintarColumnaTabla();
        

        String sql="select count(*) from venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1 and vta_condicion = 'CREDITO'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sql);
            if(rs.next())
            {
                 cant_vta.setText(rs.getString("count"));
            }

        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ///////////////////////////////suma total guaranies--------------------------------------
        String suma="select SUM(vta_montogs) from venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1 and vta_condicion = 'CREDITO'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma);
            if(rs.next())
            {
                 monto_gs.setText(rs.getString("sum"));
                      
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        } 
        /////////////////////////////////////////////////////////////////---------------------
                ///////////////////////////////suma total dolares--------------------------------------
        String suma_us="select SUM(vta_montous) from venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1 and vta_condicion ='CREDITO'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma_us);
            if(rs.next())
            {
                 monto_us.setText(rs.getString("sum")); 
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        } 
        /////////////////////////////////////////////////////////////////---------------------
        
        ///////////////////////////////suma total reales--------------------------------------
        String suma_rs="select SUM(vta_montors) from venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1 and vta_condicion = 'CREDITO'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma_rs);
            if(rs.next())
            {
                 monto_rs.setText(rs.getString("sum"));  
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        } 
        /////////////////////////////////////////////////////////////////---------------------
                ///////////////////////////////suma total reales--------------------------------------
        String suma_pa="select SUM(vta_montoar) from venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1 and vta_condicion = 'CREDITO'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma_pa);
            if(rs.next())
            {
                 monto_pa.setText(rs.getString("sum"));  
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        } 
        /////////////////////////////////////////////////////////////////---------------------
        /////////////////////////////////convertir a numeros con comas------------------------------------------------
        String guarani, dolar, real, peso;
        int entero1,dolarint, realint, pesoint;
        guarani = monto_gs.getText();
        entero1 = parseInt(guarani);  

        dolar = monto_us.getText();
        dolarint = parseInt(dolar); 
        
        real = monto_rs.getText();
        realint = parseInt(real);
        
        peso = monto_pa.getText();
        pesoint = parseInt(peso);
        
        DecimalFormat formatea = new DecimalFormat("###,###,###,###,###.##");

        monto_gs.setText(formatea.format(entero1));
        monto_us.setText(formatea.format(dolarint));
        monto_rs.setText(formatea.format(realint));
        monto_pa.setText(formatea.format(pesoint));
        ////////////////////////////////////////////------------------------------------------------------------------
        
         btn_listaado.setEnabled(true);
           
           //////////////////////////////////////////////////////////////////////
           ////////////////////////////////////////////////////////////////////////////////////
           
           
        } 
    }//GEN-LAST:event_creditoActionPerformed

    private void contadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contadoActionPerformed
        if(contado.isSelected()){
           //metodoproducto.CARGAR_JTABLE_productos_2();
           this.todos.setSelected(false);
           this.credito.setSelected(false);
           
           /////////////////////////////////////////////////////////////////
           
                 
        //////////////////////
                Conexion cc=new Conexion();
		Connection con=cc.conectar();

                String prov12="select * from caja where caj_descri = '"+cmb_caja.getSelectedItem()+"'";
                try {
                //consulta_vta.cmb_suc.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(prov12);

			while(rs.next()){

                                consulta_vta.lb_caja.setText(rs.getString("caj_codigo"));
			}
	
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
        ////////////////////////
        
               // Conexion cc=new Conexion();
		//Connection con=cc.conectar();

                String prov="select * from sucursal where su_descri = '"+cmb_suc.getSelectedItem()+"'";
                try {
                //consulta_vta.cmb_suc.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(prov);

			while(rs.next()){

                                consulta_vta.lb_suc.setText(rs.getString("su_codigo"));
			}
	
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
        
        
        String fechaObtenida = df.format(fecha_ini.getDate());
        fecha_inicial.setText(fechaObtenida);

        String fechafinal = df.format(fecha_fin.getDate());
        fecha_final.setText(fechafinal);    
        
        metodoventa.CARGAR_JTABLE_venta_CONTADO();
        pintarColumnaTabla();
        

        String sql="select count(*) from venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1 and vta_condicion = 'CONTADO'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sql);
            if(rs.next())
            {
                 cant_vta.setText(rs.getString("count"));
            }

        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ///////////////////////////////suma total guaranies--------------------------------------
        String suma="select SUM(vta_montogs) from venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1 and vta_condicion = 'CONTADO'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma);
            if(rs.next())
            {
                 monto_gs.setText(rs.getString("sum"));
                      
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        } 
        /////////////////////////////////////////////////////////////////---------------------
                ///////////////////////////////suma total dolares--------------------------------------
        String suma_us="select SUM(vta_montous) from venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1 and vta_condicion ='CONTADO'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma_us);
            if(rs.next())
            {
                 monto_us.setText(rs.getString("sum")); 
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        } 
        /////////////////////////////////////////////////////////////////---------------------
        
        ///////////////////////////////suma total reales--------------------------------------
        String suma_rs="select SUM(vta_montors) from venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1 and vta_condicion = 'CONTADO'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma_rs);
            if(rs.next())
            {
                 monto_rs.setText(rs.getString("sum"));  
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        } 
        /////////////////////////////////////////////////////////////////---------------------
                ///////////////////////////////suma total reales--------------------------------------
        String suma_pa="select SUM(vta_montoar) from venta where vta_fecha>='"+consulta_vta.fecha_inicial.getText()+"' and vta_fecha<='"+consulta_vta.fecha_final.getText()+"' and vta_anulado = 1 and vta_condicion = 'CONTADO'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma_pa);
            if(rs.next())
            {
                 monto_pa.setText(rs.getString("sum"));  
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        } 
        /////////////////////////////////////////////////////////////////---------------------
        /////////////////////////////////convertir a numeros con comas------------------------------------------------
        String guarani, dolar, real, peso;
        int entero1,dolarint, realint, pesoint;
        guarani = monto_gs.getText();
        entero1 = parseInt(guarani);  

        dolar = monto_us.getText();
        dolarint = parseInt(dolar); 
        
        real = monto_rs.getText();
        realint = parseInt(real);
        
        peso = monto_pa.getText();
        pesoint = parseInt(peso);
        
        DecimalFormat formatea = new DecimalFormat("###,###,###,###,###.##");

        monto_gs.setText(formatea.format(entero1));
        monto_us.setText(formatea.format(dolarint));
        monto_rs.setText(formatea.format(realint));
        monto_pa.setText(formatea.format(pesoint));
        ////////////////////////////////////////////------------------------------------------------------------------
        
         btn_listaado.setEnabled(true);
           
           //////////////////////////////////////////////////////////////////////
        } 
    }//GEN-LAST:event_contadoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String opcion = cmb_suc.getSelectedItem().toString();
        if (opcion.equals("TODOS")){
            String opcion1 = cmb_caja.getSelectedItem().toString();
            if (opcion1.equals("TODOS")){
                
            }else{
                
            }
        }else{
        
        }
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmb_sucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sucActionPerformed
                Conexion cc=new Conexion();
		Connection con=cc.conectar();

                String prov="select * from sucursal where su_descri = '"+cmb_suc.getSelectedItem()+"'";
                try {
                //consulta_vta.cmb_suc.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(prov);

			while(rs.next()){

                                consulta_vta.lb_suc.setText(rs.getString("su_codigo"));
			}
	
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
    }//GEN-LAST:event_cmb_sucActionPerformed

    private void btn_anuladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anuladoActionPerformed
        int aux  =  JOptionPane.showConfirmDialog(null, "Desea Anular Operación","OBSERVACION", JOptionPane.YES_NO_OPTION);
        if(aux == JOptionPane.YES_OPTION){
        
		Conexion cc=new Conexion();
		Connection con=cc.conectar();
            try {
             int lcero = 0;
            String sql = "UPDATE venta SET vta_anulado = '"+lcero+"' where vta_num_deta = '"+id_vta.getText()+"'";	

            st = con.createStatement();

            st.execute(sql);

            JOptionPane.showMessageDialog(null,  "Registro Anulado", "Ventas", JOptionPane.INFORMATION_MESSAGE);

            metodoventa.CARGAR_JTABLE_venta();

           } catch (SQLException ex) {
              System.out.println("ver error " + ex.getMessage());

           }

            String credi = condici.getText();
            if (credi.equals("CONTADO")){
                
                       try {
                   
                        String sql = "UPDATE caja SET caj_montogs = caj_montogs - '"+monto.getText()+"' where caj_codigo = '"+lb_caja.getText()+"' and caj_suc = '"+lb_suc.getText()+"'";	

                        st = con.createStatement();

                        st.execute(sql);


                  } catch (SQLException ex) {
                     System.out.println("ver error " + ex.getMessage());
                  }
            }
            
 
        }
    }//GEN-LAST:event_btn_anuladoActionPerformed

    private void btn_listaadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listaadoActionPerformed

                Conexion cc=new Conexion();
		Connection con=cc.conectar();
////////////////////////////////imprimir/////////////////////////////////

                   try {
                URL master = this.getClass().getResource("/reporte/report_venta.jasper");
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

                     /*       Date  fecha=fecha_ini.getDate();
                            DateFormat f=new SimpleDateFormat("yyyy-MM-dd");
                            String fecha2=f.format(fecha);
                            System.out.println("imp " + fecha2);
                        
                            Date fecha5 = fecha_fin.getDate();
                            DateFormat f2=new SimpleDateFormat("yyyy-MM-dd");
                            String fecha3=f2.format(fecha5);
                            System.out.println("imp " + fecha3);*////////no funciono

                    Date dateStarting  = (Date) fecha_ini.getDate();
                    Date dateEnding    = (Date) fecha_fin.getDate();
                    //parametros.put("fechaini", Integer.parseInt(fecha_inicial.getText()));
                    //parametros.put("Fechaini", new SimpleDateFormat("yyyy/MM/dd").format(new java.text.SimpleDateFormat(fecha2).parse(fecha2)));
                    //parametros.put("Fechafin", new SimpleDateFormat("yyyy/MM/dd").format(new java.text.SimpleDateFormat(fecha3).parse(fecha3)));
                    parametros.put("fechaini", dateStarting );
                    parametros.put("fechafin", dateEnding );
                   
               
                    JasperPrint print = JasperFillManager.fillReport(masterreport, parametros, con);
                    JasperViewer ver = new JasperViewer(print,false);
                    ver.setTitle("Listado de Ventas");
                    ver.setVisible(true);
            } catch (Exception e) {
                System.out.println("reporte.reporte.Reportefichaupdate()" + e);
                JOptionPane.showMessageDialog(null, "Mensaje  "+ e);
            }    
         
         ///////////////////////////////////////////////////////////////////////////
    }//GEN-LAST:event_btn_listaadoActionPerformed

    private void cmb_sucKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_sucKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }
                
        
    }//GEN-LAST:event_cmb_sucKeyPressed

    private void cmb_cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_cajaActionPerformed
                Conexion cc=new Conexion();
		Connection con=cc.conectar();

                String prov="select * from caja where caj_descri = '"+cmb_caja.getSelectedItem()+"'";
                try {
                //consulta_vta.cmb_suc.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(prov);

			while(rs.next()){

                                consulta_vta.lb_caja.setText(rs.getString("caj_codigo"));
			}
	
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
    }//GEN-LAST:event_cmb_cajaActionPerformed

    private void btn_reimprmir_facActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reimprmir_facActionPerformed
        
        
            Conexion cc=new Conexion();
            Connection con=cc.conectar();
         ////////////////////////////////imprimir/////////////////////////////////

                try {
                URL master = this.getClass().getResource("/reporte/vta_ticket.jasper");
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
                    
                    parametros.put("vta_id", Integer.parseInt(id_vta.getText()));
                    JasperPrint print = JasperFillManager.fillReport(masterreport, parametros, con);
                    JasperViewer ver = new JasperViewer(print,false);
                    ver.setTitle("Reimprimir Ticket");
                    ver.setVisible(true);
            } catch (Exception e) {
                System.out.println("reporte.reporte.Reportefichaupdate()" + e);
                JOptionPane.showMessageDialog(null, "Mensaje  "+ e);
            }    
         
         ///////////////////////////////////////////////////////////////////////////
    }//GEN-LAST:event_btn_reimprmir_facActionPerformed

    private void fecha_iniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fecha_iniKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_iniKeyPressed

    private void fecha_finKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fecha_finKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_finKeyPressed

    private void cmb_cajaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_cajaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_cajaKeyPressed

    private void todosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_todosKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_todosKeyPressed

    private void contadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contadoKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_contadoKeyPressed

    private void creditoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_creditoKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_creditoKeyPressed

    private void btn_calcularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_calcularKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_calcularKeyPressed

    private void jtable_ventaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtable_ventaKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_jtable_ventaKeyPressed

    private void jtable_vta_detalleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtable_vta_detalleKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_jtable_vta_detalleKeyPressed

    private void btn_reimprmir_facKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_reimprmir_facKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reimprmir_facKeyPressed

    private void btn_reimprmirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_reimprmirKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reimprmirKeyPressed

    private void btn_listaadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_listaadoKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_listaadoKeyPressed

    private void btn_anuladoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_anuladoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_anuladoKeyPressed

    private void btn_usuexitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_usuexitKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_usuexitKeyPressed

    private void btm_boletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_boletaActionPerformed
             
         /*       Conexion cc=new Conexion();
                Connection con=cc.conectar();
                ////////////////////////////////imprimir/////////////////////////////////
                try {
                    URL master = this.getClass().getResource("/reporte/vta_matricial_sinfac.jasper");
                    //System.out.println("master" + master);
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

                    parametros.put("vta_id", Integer.parseInt(ida.getText()));
                    JasperPrint print = JasperFillManager.fillReport(masterreport, parametros, con);

                    JasperPrintManager.printReport(print, true);////mustra cuadro de impresora sin vista previa
                    JasperPrintManager.printReport(print, false);////imprime directo

                    JasperViewer ver = new JasperViewer(print,false);// imprime con vista previa
                    ver.setTitle("Venta");
                    ver.setVisible(true);
                } catch (Exception e) {
                    System.out.println("reporte.reporte.Reportefichaupdate()" + e);
                    JOptionPane.showMessageDialog(null, "Mensaje  "+ e);
                }*/
         
         
           Conexion cc=new Conexion();
            Connection con=cc.conectar();
         ////////////////////////////////imprimir/////////////////////////////////

                try {
                URL master = this.getClass().getResource("/reporte/vta_matricial_sinfac.jasper");
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
                    
                    parametros.put("vta_id", Integer.parseInt(id_vta.getText()));
                    JasperPrint print = JasperFillManager.fillReport(masterreport, parametros, con);
                    JasperViewer ver = new JasperViewer(print,false);
                    ver.setTitle("Reimprimir boleta");
                    ver.setVisible(true);
            } catch (Exception e) {
                System.out.println("reporte.reporte.Reportefichaupdate()" + e);
                JOptionPane.showMessageDialog(null, "Mensaje  "+ e);
            }    
         
         ///////////////////////////////////////////////////////////////////////////
    }//GEN-LAST:event_btm_boletaActionPerformed

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
            java.util.logging.Logger.getLogger(consulta_vta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consulta_vta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consulta_vta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consulta_vta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consulta_vta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btm_boleta;
    private javax.swing.JButton btn_anulado;
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_listaado;
    private javax.swing.JButton btn_reimprmir;
    private javax.swing.JButton btn_reimprmir_fac;
    private javax.swing.JButton btn_usuexit;
    private javax.swing.JLabel cant_vta;
    private javax.swing.JLabel canti;
    public static javax.swing.JComboBox<String> cmb_caja;
    public static javax.swing.JComboBox<String> cmb_suc;
    private javax.swing.JLabel condici;
    private javax.swing.JCheckBox contado;
    private javax.swing.JCheckBox credito;
    private javax.swing.JTextField documento_ci;
    private com.toedter.calendar.JDateChooser fecha_fin;
    public static javax.swing.JTextField fecha_final;
    private com.toedter.calendar.JDateChooser fecha_ini;
    public static javax.swing.JTextField fecha_inicial;
    private javax.swing.JTextField id_vta;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable jtable_venta;
    public static javax.swing.JTable jtable_vta_detalle;
    public static javax.swing.JLabel lb_caja;
    public static javax.swing.JLabel lb_suc;
    private javax.swing.JLabel monto;
    private javax.swing.JLabel monto_gs;
    private javax.swing.JLabel monto_pa;
    private javax.swing.JLabel monto_rs;
    private javax.swing.JLabel monto_us;
    private javax.swing.JCheckBox todos;
    // End of variables declaration//GEN-END:variables
}
