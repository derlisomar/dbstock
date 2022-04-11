/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;

import com.sun.awt.AWTUtilities;
import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static dbstock.productos.pro_bus2;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import static java.lang.Integer.parseInt;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import java.util.HashMap;
import java.util.Map;
import static dbstock.productos.cmb_prov1;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
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
public class pedidos extends javax.swing.JFrame {

    Statement st;
    Connection con;
    /**
     * Creates new form pedidos
     */
    public pedidos() {
        initComponents();

        
        this.setLocationRelativeTo(null);//centra el formulario
        this.setTitle("Pedidos");
        setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE); //inabilida el uso del boton exit X
        this.setResizable(false); //Disable the Resize Button
        
        //MOSTRAR FECHA Y HORA DEL SISTEMA
        Calendar Cal= Calendar.getInstance();
        String fecha= Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+"/"+Cal.get(Cal.YEAR);
        pedido_fecha.setText(fecha);

    //    pedido_cod.setEditable(false);
        
        jTable_productos_pedido.setVisible(false);
        jTable_pedido.setVisible(false);
        bus_producto1.setVisible(false);
        pedido_cant.setVisible(false);
        pedido_obs.setVisible(false);
        jLabel_obs.setVisible(false);
        jLabel_buscar.setVisible(false);
        jLabel_cant.setVisible(false);
        btm_enviar.setVisible(false);
        cmb_pedidos_pro.setEnabled(false);
        cmb_condicion.setEnabled(false);
        btn_eliminaritem.setVisible(false);
        jLabel_cantidadmostrar.setVisible(false);
        lista_pedi_id.setVisible(false);
        btn_generar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        pro_venta.setVisible(false);

        nuevo_pedido.requestFocus();
        
        ///invisible datos usados para calculo como cantidad, id, cant*monto etc
        pedido_desc.setVisible(false);
        pedido_id.setVisible(false);
        pro_stock.setVisible(false);
        monto_total.setVisible(false);
        id.setVisible(false);
        ///////////////////////////////
        
        pedido_cod.setText("0");
        id.setText("0");

        metodoproducto.CARGAR_JTABLE_prod_pedido();
        metodoproducto.CARGAR_JTABLE_pedido();

        metodoproducto.cmb_proveedor_pedido();
        
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
        jTable_productos_pedido = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        pro_venta = new javax.swing.JTextField();
        bus_producto1 = new javax.swing.JTextField();
        pedido_id = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_pedido = new javax.swing.JTable();
        id_suc = new javax.swing.JLabel();
        btm_enviar = new javax.swing.JButton();
        pedido_desc = new javax.swing.JTextField();
        pro_stock = new javax.swing.JTextField();
        pedido_cant = new javax.swing.JTextField();
        jLabel_buscar = new javax.swing.JLabel();
        jLabel_obs = new javax.swing.JLabel();
        pedido_cod = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cmb_pedidos_pro = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_eliminaritem = new javax.swing.JButton();
        btn_generar = new javax.swing.JButton();
        nuevo_pedido = new javax.swing.JButton();
        lista_pedi_id = new javax.swing.JTextField();
        jLabel_cant = new javax.swing.JLabel();
        cant = new javax.swing.JLabel();
        jLabel_cantidadmostrar = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cmb_condicion = new javax.swing.JComboBox<>();
        btn_cancelar = new javax.swing.JButton();
        btn_usuexit1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pedido_obs = new javax.swing.JTextArea();
        id = new javax.swing.JTextField();
        monto_total = new javax.swing.JLabel();
        total_total = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pedido_fecha = new javax.swing.JLabel();
        jLabel_cant1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(830, 630));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PEDIDO DE COMPRAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jTable_productos_pedido.setModel(new javax.swing.table.DefaultTableModel(
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_productos_pedido.setGridColor(new java.awt.Color(255, 0, 0));
        jTable_productos_pedido.setSelectionBackground(new java.awt.Color(0, 204, 204));
        jTable_productos_pedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_productos_pedidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_productos_pedido);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 610, 160));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Lista de Pedidos");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 160, 20));

        pro_venta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pro_venta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pro_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_ventaActionPerformed(evt);
            }
        });
        getContentPane().add(pro_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 120, -1));

        bus_producto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bus_producto1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bus_producto1KeyTyped(evt);
            }
        });
        getContentPane().add(bus_producto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 260, -1));
        getContentPane().add(pedido_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 70, -1));

        jTable_pedido.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_pedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_pedidoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_pedido);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 610, 160));

        id_suc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        id_suc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_suc.setText("id_suc");
        getContentPane().add(id_suc, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 50, 20));

        btm_enviar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btm_enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/paper.png"))); // NOI18N
        btm_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_enviarActionPerformed(evt);
            }
        });
        getContentPane().add(btm_enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 90, 30));
        getContentPane().add(pedido_desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 170, -1));
        getContentPane().add(pro_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 80, -1));

        pedido_cant.setBackground(new java.awt.Color(255, 153, 153));
        pedido_cant.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pedido_cant.setForeground(new java.awt.Color(255, 255, 255));
        pedido_cant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pedido_cant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pedido_cantKeyPressed(evt);
            }
        });
        getContentPane().add(pedido_cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 60, 30));

        jLabel_buscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_buscar.setText("Buscar Producto:");
        getContentPane().add(jLabel_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, 20));

        jLabel_obs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_obs.setText("OBSERCIONES");
        getContentPane().add(jLabel_obs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 110, 20));

        pedido_cod.setBackground(new java.awt.Color(255, 153, 153));
        pedido_cod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pedido_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedido_codActionPerformed(evt);
            }
        });
        getContentPane().add(pedido_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Id de Pedido:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 90, 20));

        cmb_pedidos_pro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(cmb_pedidos_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 240, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Proveedor");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 70, 20));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 660, 10));

        btn_eliminaritem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/menos.png"))); // NOI18N
        btn_eliminaritem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminaritemActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminaritem, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 50, -1));

        btn_generar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_generar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/bien.png"))); // NOI18N
        btn_generar.setText("Generar Pedido");
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, 160, 40));

        nuevo_pedido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nuevo_pedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/mas.png"))); // NOI18N
        nuevo_pedido.setText("Nuevo");
        nuevo_pedido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nuevo_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo_pedidoActionPerformed(evt);
            }
        });
        getContentPane().add(nuevo_pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 100, 40));
        getContentPane().add(lista_pedi_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 70, -1));

        jLabel_cant.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_cant.setText("Precio por defecto");
        getContentPane().add(jLabel_cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 150, 30));

        cant.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, 30, 20));

        jLabel_cantidadmostrar.setText("Cant. Articulos:");
        getContentPane().add(jLabel_cantidadmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, -1, 20));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Fecha:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 50, 20));

        cmb_condicion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmb_condicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONTADO", "CREDITO" }));
        getContentPane().add(cmb_condicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 110, -1));

        btn_cancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/close.png"))); // NOI18N
        btn_cancelar.setText("Cancelar Pedido");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, 160, 40));

        btn_usuexit1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_usuexit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/exit.png"))); // NOI18N
        btn_usuexit1.setText("Salir");
        btn_usuexit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuexit1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_usuexit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 550, 90, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Condición:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 80, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Sucursal");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 80, 20));

        pedido_obs.setColumns(20);
        pedido_obs.setRows(5);
        pedido_obs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pedido_obsKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(pedido_obs);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 170, 100));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 60, -1));

        monto_total.setText("total monto");
        getContentPane().add(monto_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 110, 20));

        total_total.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        total_total.setForeground(new java.awt.Color(255, 0, 51));
        total_total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(total_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, 150, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Monto Total:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, -1, 30));

        pedido_fecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pedido_fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(pedido_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 90, 20));

        jLabel_cant1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_cant1.setText("Cantidad:");
        getContentPane().add(jLabel_cant1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 60, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/fondosistema.jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(949, 651));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-460, -20, 1320, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_productos_pedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_productos_pedidoMouseClicked
      
        
                int n0 = jTable_productos_pedido.getSelectedRow();
                String id = jTable_productos_pedido.getValueAt(n0, 0).toString();
                pedido_id.setText(id);
        
 		Conexion cc=new Conexion();
		Connection con=cc.conectar();;
        	try {

		String sql = "Select * from productos where pro_id = '"+pedido_id.getText()+"'";
		
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                        pedido_id.setText(rs.getString("pro_id"));
                        pedido_desc.setText(rs.getString("pro_desc"));
                        pro_venta.setText(rs.getString("pro_preciocompra"));
                        pro_stock.setText(rs.getString("pro_stock"));

                    }
			rs.close();
			st.close();
			con.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
                
                pedido_cant.requestFocus();
                pedido_cant.setText("");
        
    }//GEN-LAST:event_jTable_productos_pedidoMouseClicked

    private void btm_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_enviarActionPerformed
        
        
            int sumaped, montopd, cantped;
            String ped1, ped2, ped3;
            
            ped1 = pedido_cant.getText();
            ped2 = pro_venta.getText();
            cantped = parseInt(ped1); 
            montopd = parseInt(ped2);
            
            sumaped = cantped * montopd;
  
            ped3 = Integer.toString(sumaped);
            monto_total.setText(ped3);
            

            Conexion cc=new Conexion();
            Connection con=cc.conectar();
            boolean falsebo= false;
            int nroentregado = 0;
            try {

                String sql = "INSERT INTO tmpedido (pedido_cod_prod, pedido_desc, pedido_cant, pedido_fecha,pedido_proveedor, pedido_id, pedido_preciocompra,"
                + "pedido_entregado,pedido_bolean,pedido_suc, pedido_total) "
                + "values ('"+pedido_id.getText()+"','"+pedido_desc.getText()+"','"+pedido_cant.getText()+"','"+pedido_fecha.getText()+"',"
                + "'"+cmb_pedidos_pro.getSelectedItem()+"','"+pedido_cod.getText()+"','"+pro_venta.getText()+"','"+nroentregado+"',"
                + "'"+falsebo+"','"+id_suc.getText()+"','"+monto_total.getText()+"')";

                st = con.createStatement();
                st.execute(sql);
                metodoproducto.CARGAR_JTABLE_pedido();

            } catch (SQLException ex) {
                System.out.println("ver error " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "error" + ex);
            }
 
            
        String sql="select count(*) from tmpedido";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sql);
            if(rs.next())
            {
                 cant.setText(rs.getString("count"));
            }

        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        String calcularmonto5 = "select sum(pedido_total) from tmpedido where pedido_id = '"+id.getText()+"'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(calcularmonto5);
            if(rs.next())
            {
                 total_total.setText(rs.getString("sum"));
            }

        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        cmb_pedidos_pro.setEnabled(false);
        cmb_condicion.setEnabled(false);
        
        
        
        
        
        
    }//GEN-LAST:event_btm_enviarActionPerformed

    private void nuevo_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_pedidoActionPerformed
     
        int j;
        int cont=1;
        String num="";
        String c="";
        
        Conexion cc=new Conexion();
	Connection con=cc.conectar();
        // String sql="select max(ped_num) from pedido";
        String sql="select count(*) from pedido";
        //String SQL="SELECT MAX(cod_clients) AS cod_emp FROM clients";
        //String SQL="SELECT @@identity AS ID";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sql);
            if(rs.next())
            {
                c=rs.getString(1); 
                
                id.setText(rs.getString("count"));
                int nume = parseInt(id.getText());
                int add = nume + 1;  
                String cadena = Integer.toString(add);
                id.setText(cadena);
                
            }
            
            if(c==null){
                pedido_cod.setText("00000001");
                
                id.setText(rs.getString("count"));  
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
                 
                id.setText(rs.getString("count"));
                int nume = parseInt(id.getText());
                int add = nume + 1;  
                String cadena = Integer.toString(add);
                id.setText(cadena);
            }

        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTable_productos_pedido.setVisible(true);
        jTable_pedido.setVisible(true);
        bus_producto1.setVisible(true);
        pedido_cant.setVisible(true);
        pedido_obs.setVisible(true);
        jLabel_obs.setVisible(true);
        jLabel_buscar.setVisible(true);
        jLabel_cant.setVisible(true);
        btm_enviar.setVisible(true);
        cmb_pedidos_pro.setEnabled(true);
        cmb_condicion.setEnabled(true);
        btn_eliminaritem.setVisible(true);
        jLabel_cantidadmostrar.setVisible(true);
        pro_venta.setVisible(true);
        
        nuevo_pedido.setEnabled(false);
        btn_generar.setEnabled(true);
        btn_cancelar.setEnabled(true);
        
    }//GEN-LAST:event_nuevo_pedidoActionPerformed

    private void btn_eliminaritemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminaritemActionPerformed
        
        int aux  =  JOptionPane.showConfirmDialog(null, "Desea eliminar? ","LISTA DE PEDIDOS", JOptionPane.YES_NO_OPTION);

        if(aux == JOptionPane.YES_OPTION){

                int n1 = jTable_pedido.getSelectedRow();
                String id = jTable_pedido.getValueAt(n1, 0).toString();
                lista_pedi_id.setText(id);

            Conexion cc=new Conexion();
            Connection con=cc.conectar();

            try {

                String sql = "delete from tmpedido where pedido_cod = '"+lista_pedi_id.getText()+"' ";
                st = con.createStatement();

                st.execute(sql);
                
                metodoproducto.CARGAR_JTABLE_pedido();
                
            }catch (Exception ee) {
                ee.printStackTrace();
            }
       
        String sql1="select count(*) from tmpedido ";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sql1);
            if(rs.next())
            {
                 cant.setText(rs.getString("count"));
            }

        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        String calcularmonto1 = "select sum(pedido_total) from tmpedido where pedido_id = '"+pedidos.id.getText()+"'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(calcularmonto1);
            if(rs.next())
            {
                 total_total.setText(rs.getString("sum"));
            }

        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        

        }else{if(aux == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null,  "Cancelado", "Sistema", JOptionPane.INFORMATION_MESSAGE);

        }

        }
        
    }//GEN-LAST:event_btn_eliminaritemActionPerformed

    private void jTable_pedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_pedidoMouseClicked
        
                int n1 = jTable_pedido.getSelectedRow();
                String id = jTable_pedido.getValueAt(n1, 0).toString();
                lista_pedi_id.setText(id);
        
 		Conexion cc=new Conexion();
		Connection con=cc.conectar();;
        	try {

		String sql = "select * from tmpedido where pedido_cod = '"+lista_pedi_id.getText()+"'";
		
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                        lista_pedi_id.setText(rs.getString("pedido_cod"));

                    }
			rs.close();
			st.close();
			con.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
        
    }//GEN-LAST:event_jTable_pedidoMouseClicked

    private void bus_producto1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bus_producto1KeyTyped
      metodoproducto.buscarproducto_pedido();
    }//GEN-LAST:event_bus_producto1KeyTyped

    private void bus_producto1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bus_producto1KeyReleased
        metodos.convertiraMayusculasEnJtextfield(bus_producto1);
    }//GEN-LAST:event_bus_producto1KeyReleased

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed

        int aux  =  JOptionPane.showConfirmDialog(null, "Desea CANCELAR Pedido ","Sistema", JOptionPane.YES_NO_OPTION);

        if(aux == JOptionPane.YES_OPTION){

            Conexion cc=new Conexion();
            Connection con=cc.conectar();

            try {

                String sql = "delete from tmpedido where pedido_suc = '"+id_suc.getText()+"'  ";
                st = con.createStatement();

                st.execute(sql);
                
                metodoproducto.CARGAR_JTABLE_pedido();
                
            }catch (Exception ee) {
                ee.printStackTrace();
            }
            
            
        jTable_productos_pedido.setVisible(false);
        jTable_pedido.setVisible(false);
        bus_producto1.setVisible(false);
        pedido_cant.setVisible(false);
        pedido_obs.setVisible(false);
        jLabel_obs.setVisible(false);
        jLabel_buscar.setVisible(false);
        jLabel_cant.setVisible(false);
        btm_enviar.setVisible(false);
        cmb_pedidos_pro.setEnabled(false);
        cmb_condicion.setEnabled(false);
        btn_eliminaritem.setVisible(false);
        jLabel_cantidadmostrar.setVisible(false);
        nuevo_pedido.setEnabled(true);
        pro_venta.setVisible(false);
        
        btn_generar.setEnabled(false);
        cmb_pedidos_pro.setEnabled(true);
        cmb_condicion.setEnabled(true);
        
            
        }else{if(aux == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null,  "Cancelado", "Sistema", JOptionPane.INFORMATION_MESSAGE);

        }
        }

        
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void pedido_cantKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pedido_cantKeyPressed
          ///////AL PRECIONAR ENTER
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          btm_enviar.requestFocus();
          btm_enviar.doClick();
          bus_producto1.requestFocus();
          bus_producto1.setText("");
          metodoproducto.CARGAR_JTABLE_prod_pedido();
      }
    }//GEN-LAST:event_pedido_cantKeyPressed

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed

            Conexion cc=new Conexion();
            Connection con=cc.conectar();
            
            try {

                String sql = "INSERT INTO detallespedido select * from tmpedido where pedido_suc = '"+id_suc.getText()+"'";
                //    String sql = "INSERT INTO detallespedido select * from tmpedido ";

                st = con.createStatement();
                st.execute(sql);

                String sqleliminar = "delete from tmpedido where pedido_suc = '"+id_suc.getText()+"'";
                //String sqleliminar = "delete from tmpedido ";
                st = con.createStatement();
                st.execute(sqleliminar);

                
                metodoproducto.CARGAR_JTABLE_pedido();

                
        String calcularmonto = "select sum(pedido_total) from detallespedido where pedido_id = '"+id.getText()+"'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(calcularmonto);
            if(rs.next())
            {
                 total_total.setText(rs.getString("sum"));
            }

        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
                String Condicion = "PENDIENTE";
                int anulada = 1;//anulado es 0, activo es 1
                String sqlinsertar = "INSERT INTO pedido (ped_provee, ped_fecha, ped_obs, ped_condicion,pedido_id,ped_suc ,ped_num_lg, ped_estado, ped_usuario, ped_monto, ped_anulada) "
                + "values ('"+cmb_pedidos_pro.getSelectedItem()+"','"+pedido_fecha.getText()+"','"+pedido_obs.getText()+"','"+cmb_condicion.getSelectedItem()+"',"
                + "'"+pedido_cod.getText()+"','"+id_suc.getText()+"','"+pedido_cod.getText()+"','"+Condicion+"','"+Principal.usuario_ini.getText()+"','"+total_total.getText()+"','"+anulada+"')";
                st = con.createStatement();
                st.execute(sqlinsertar);
                

         ////////////////////////////////imprimir/////////////////////////////////

                   try {
                URL master = this.getClass().getResource("/reporte/nota_pedido.jasper");
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
                    
                    parametros.put("pedido_id", Integer.parseInt(id.getText()));
                    JasperPrint print = JasperFillManager.fillReport(masterreport, parametros, con);
                    JasperViewer ver = new JasperViewer(print,false);
                    ver.setTitle("Pedido");
                    ver.setVisible(true);
            } catch (Exception e) {
                System.out.println("reporte.reporte.Reportefichaupdate()" + e);
                JOptionPane.showMessageDialog(null, "Mensaje  "+ e);
            }    
         
         ///////////////////////////////////////////////////////////////////////////
                
                
                
            } catch (SQLException ex) {
                System.out.println("ver error " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "error" + ex);
            }
        
           
        
    }//GEN-LAST:event_btn_generarActionPerformed

    private void btn_usuexit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuexit1ActionPerformed
      
        
        int aux  =  JOptionPane.showConfirmDialog(null, "Desea Salir? ","Al salir cancelará todo", JOptionPane.YES_NO_OPTION);

        if(aux == JOptionPane.YES_OPTION){

            Conexion cc=new Conexion();
            Connection con=cc.conectar();

            try {

                String sql = "delete from tmpedido where pedido_suc = '"+id_suc.getText()+"'  ";
                st = con.createStatement();

                st.execute(sql);

                Principal.jMenu_compras.setEnabled(true);
                Principal.btn_compras.setEnabled(true);
          
                dispose();
            }catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        
        
        
    }//GEN-LAST:event_btn_usuexit1ActionPerformed

    private void pedido_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedido_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pedido_codActionPerformed

    private void pedido_obsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pedido_obsKeyTyped
                ////convertir a mayusculas
        char c6 = evt.getKeyChar(); 
        if(Character.isLowerCase(c6)){
            String cad = ("" + c6).toUpperCase();
            c6 = cad.charAt(0);
            evt.setKeyChar(c6);
        }
    }//GEN-LAST:event_pedido_obsKeyTyped

    private void pro_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pro_ventaActionPerformed

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
            java.util.logging.Logger.getLogger(pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btm_enviar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminaritem;
    private javax.swing.JButton btn_generar;
    private javax.swing.JButton btn_usuexit1;
    public static javax.swing.JTextField bus_producto1;
    private javax.swing.JLabel cant;
    private javax.swing.JComboBox<String> cmb_condicion;
    public static javax.swing.JComboBox<String> cmb_pedidos_pro;
    public static javax.swing.JTextField id;
    public static javax.swing.JLabel id_suc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_buscar;
    private javax.swing.JLabel jLabel_cant;
    private javax.swing.JLabel jLabel_cant1;
    private javax.swing.JLabel jLabel_cantidadmostrar;
    private javax.swing.JLabel jLabel_obs;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable jTable_pedido;
    public static javax.swing.JTable jTable_productos_pedido;
    private javax.swing.JTextField lista_pedi_id;
    private javax.swing.JLabel monto_total;
    private javax.swing.JButton nuevo_pedido;
    public static javax.swing.JTextField pedido_cant;
    public static javax.swing.JTextField pedido_cod;
    public static javax.swing.JTextField pedido_desc;
    private javax.swing.JLabel pedido_fecha;
    public static javax.swing.JTextField pedido_id;
    private javax.swing.JTextArea pedido_obs;
    public static javax.swing.JTextField pro_stock;
    public static javax.swing.JTextField pro_venta;
    private javax.swing.JLabel total_total;
    // End of variables declaration//GEN-END:variables
}
