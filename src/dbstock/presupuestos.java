/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;

import com.sun.glass.events.KeyEvent;
import static dbstock.caja.pedido_cod;
import static dbstock.metodos.st;
import static dbstock.pedidos.id;
import java.awt.Image;
import java.awt.KeyEventPostProcessor;
import java.awt.KeyboardFocusManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
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
public class presupuestos extends javax.swing.JFrame {

    /**
     * Creates new form vtacredito
     */
    Statement st;
    Connection con;
    public presupuestos() {
        initComponents();
        
        this.setLocationRelativeTo(null);//centra el formulario
        this.setTitle("Presupuesto");
        setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE); //inabilida el uso del boton exit X
        this.setResizable(false); //Disable the Resize Button
        
        ventanainterna.setVisible(false);

        metodo_presupuesto.generar_nro_presupuesto();
       // txt_caja.setEnabled(false);
       id_prod.setVisible(false);
       url.setVisible(false);
       iddeta.setVisible(false);
       vta_id_pro.setVisible(false);
       vta_id_lector.setVisible(false);
       vta_nomb_pro.setVisible(false);
       vta_proveedor.setVisible(false);
       vta_precio.setVisible(false);
       vta_total.setVisible(false);
       ivat.setVisible(false);
       monto_caja.setVisible(false);
       total_gs.setVisible(false);
       pedido_cod.setVisible(false);
       id.setVisible(false);
       impot.setVisible(false);
       //vta_importe.setVisible(false);
       gss.setVisible(false);
     //  ida.setVisible(false);
       vta_importe.setText("0");
      // btn_presupuesto.setEnabled(false);
       
     /*  liq_exenta.setVisible(false);
       liq_5.setVisible(false);
       liq_10.setVisible(false);*/
       
        Calendar Cal= Calendar.getInstance();
        String fecha= Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+"/"+Cal.get(Cal.YEAR);
        txt_fechavta.setText(fecha);
        
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

           
        txt_caja.setText(caja);
        sucursal_vta.setText(suc);

            } catch (Exception e) {
                e.printStackTrace();
            }
            metodo_presupuesto.generar_nro_presupuesto_uno();
            
            metodo_presupuesto.CARGAR_JTABLE_productos_presupuestos();
            metodo_presupuesto.CARGAR_JTABLE_vtadetalle_presupuesto();
            
 		Conexion cc=new Conexion();
		Connection con=cc.conectar();;
        	try {
		String sql = "Select * from config ";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                        jLabel_factura.setText(rs.getString("conf_factura"));
                        bus_pro.setText(rs.getString("conf_buspro"));
                    }
			rs.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
                }
                
        ///////////////////////////para buscar producto        
        if(bus_pro.getText().equals("0")){ //CON LECTOR

            jComboBoxbus.setSelectedIndex(1);
 
        }
       if(bus_pro.getText().equals("1")){// es descripcion o id de producto
           jComboBoxbus.setSelectedIndex(0);
       }
  /*     ///////////////////para factura
        if(jLabel_factura.getText().equals("0")){ //sin factura

           
 
        }
       if(jLabel_factura.getText().equals("1")){// con factura
           
           
           
       }*/
        
          ///////////////////////////////////////////////////////////////---------------------------------------------------
         if(jLabel_factura.getText().equals("1")){////si es sin factura que no haga el update de contador
//             btn_factura.setVisible(false);
         }
            //btn_factura.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_productos = new javax.swing.JTable();
        ventanainterna = new javax.swing.JInternalFrame();
        buscacli = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablecliente = new javax.swing.JTable();
        btn_selec = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txt_caja = new javax.swing.JLabel();
        cli_direcc = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        venta_suma = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        cli_nomb = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        cli_cedula = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        vtacreditodoc5 = new javax.swing.JTextField();
        gss = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_vtadetalle = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        buscar_productos = new javax.swing.JTextField();
        idcli = new javax.swing.JTextField();
        vta_rs = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        vta_peso = new javax.swing.JTextField();
        impot = new javax.swing.JLabel();
        item_cant = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel_venta = new javax.swing.JLabel();
        vta_cant = new javax.swing.JTextField();
        vta_importe = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jComboBoxbus = new javax.swing.JComboBox<>();
        cli_limite = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        vta_us = new javax.swing.JTextField();
        btn_salirvta = new javax.swing.JButton();
        cli_telefono = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        btn_presupuesto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        sucursal_vta = new javax.swing.JLabel();
        boleta_vta = new javax.swing.JLabel();
        cond = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_fechavta = new javax.swing.JLabel();
        id_prod = new javax.swing.JTextField();
        url = new javax.swing.JTextField();
        img_foto = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txt_obs = new javax.swing.JTextField();
        vta_id_pro = new javax.swing.JTextField();
        vta_id_lector = new javax.swing.JTextField();
        vta_nomb_pro = new javax.swing.JTextField();
        vta_proveedor = new javax.swing.JTextField();
        vta_precio = new javax.swing.JTextField();
        vta_total = new javax.swing.JTextField();
        iddeta = new javax.swing.JTextField();
        ida = new javax.swing.JLabel();
        total_gs = new javax.swing.JTextField();
        monto_caja = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        exenta_iva = new javax.swing.JLabel();
        iva_55 = new javax.swing.JLabel();
        total_total = new javax.swing.JLabel();
        tt1 = new javax.swing.JLabel();
        iva_100 = new javax.swing.JLabel();
        jLabel_factura = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bus_pro = new javax.swing.JLabel();
        liq_5 = new javax.swing.JTextField();
        ivat = new javax.swing.JTextField();
        liq_10 = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        pedido_cod = new javax.swing.JLabel();
        liq_exenta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_productos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_productosMouseClicked(evt);
            }
        });
        jTable_productos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_productosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_productos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 720, 190));

        ventanainterna.setTitle("Buscar Cliente");
        ventanainterna.setVisible(true);
        ventanainterna.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscacli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscacliKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscacliKeyTyped(evt);
            }
        });
        ventanainterna.getContentPane().add(buscacli, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 190, -1));

        jLabel3.setText("Buscar");
        ventanainterna.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

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

        ventanainterna.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 37, 400, 150));

        btn_selec.setText("Seleecionar");
        btn_selec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selecActionPerformed(evt);
            }
        });
        ventanainterna.getContentPane().add(btn_selec, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        getContentPane().add(ventanainterna, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 420, 220));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("gs.");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 250, 20, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/anadir-amigo.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 60, 40, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/menos.png"))); // NOI18N
        jButton2.setText("Quitar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Letras");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 40, 30));

        txt_caja.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_caja.setForeground(new java.awt.Color(204, 0, 0));
        txt_caja.setText("CAJA");
        getContentPane().add(txt_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 40, 30));

        cli_direcc.setEditable(false);
        cli_direcc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(cli_direcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 270, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Documento");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 80, 20));

        venta_suma.setEditable(false);
        venta_suma.setBackground(new java.awt.Color(204, 255, 204));
        venta_suma.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        venta_suma.setForeground(new java.awt.Color(255, 0, 0));
        venta_suma.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(venta_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 170, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Nombre y Apellido");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 120, 20));

        cli_nomb.setEditable(false);
        cli_nomb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(cli_nomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 270, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Dirección");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 120, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Telefono");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, 70, 20));

        cli_cedula.setEditable(false);
        cli_cedula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(cli_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 110, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Deuda Acumulada");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 230, 130, 20));

        vtacreditodoc5.setEditable(false);
        vtacreditodoc5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(vtacreditodoc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 250, 120, -1));

        gss.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gss.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gss.setText("GS");
        gss.setFocusable(false);
        gss.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(gss, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 20, 30));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("gs.");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 250, 20, 20));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Cant. Item:");
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 90, 20));

        jtable_vtadetalle.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtable_vtadetalle);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 720, 210));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/buscarcli.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, 40, 30));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Cantidad");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, 60, 20));

        buscar_productos.setBackground(new java.awt.Color(0, 153, 102));
        buscar_productos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscar_productosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscar_productosKeyTyped(evt);
            }
        });
        getContentPane().add(buscar_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 270, -1));

        idcli.setEditable(false);
        getContentPane().add(idcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 80, 40, -1));

        vta_rs.setBackground(new java.awt.Color(204, 255, 204));
        vta_rs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vta_rs.setForeground(new java.awt.Color(255, 0, 0));
        vta_rs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(vta_rs, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 80, -1));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("REAL");
        jLabel51.setFocusable(false);
        jLabel51.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 80, 20));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("DOLAR");
        jLabel50.setFocusable(false);
        jLabel50.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 70, 20));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("PESO");
        jLabel52.setFocusable(false);
        jLabel52.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 90, 20));

        vta_peso.setBackground(new java.awt.Color(204, 255, 204));
        vta_peso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vta_peso.setForeground(new java.awt.Color(255, 0, 0));
        vta_peso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(vta_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 90, -1));

        impot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        impot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        impot.setText("Importe");
        getContentPane().add(impot, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 70, 30));

        item_cant.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        item_cant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(item_cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 50, 20));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("GUARANIES");
        jLabel39.setFocusable(false);
        jLabel39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 170, 30));

        jLabel_venta.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel_venta.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_venta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_venta.setText("Presupuesto");
        getContentPane().add(jLabel_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 50));

        vta_cant.setBackground(new java.awt.Color(255, 204, 204));
        vta_cant.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        vta_cant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vta_cant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                vta_cantKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                vta_cantKeyTyped(evt);
            }
        });
        getContentPane().add(vta_cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, 60, 30));

        vta_importe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vta_importe.setForeground(new java.awt.Color(255, 0, 0));
        vta_importe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vta_importe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                vta_importeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                vta_importeKeyTyped(evt);
            }
        });
        getContentPane().add(vta_importe, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 120, 30));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Datos de Cliente");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 110, 30));

        jComboBoxbus.setBackground(new java.awt.Color(255, 51, 51));
        jComboBoxbus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DESCRIPCION", "LECTOR" }));
        jComboBoxbus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxbusActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxbus, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 130, -1));

        cli_limite.setEditable(false);
        cli_limite.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(cli_limite, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 120, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Credito a Favor");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 110, 20));

        btn_agregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/agregarvta.png"))); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.setHideActionText(true);
        btn_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_agregar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 90, 60));

        vta_us.setBackground(new java.awt.Color(204, 255, 204));
        vta_us.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vta_us.setForeground(new java.awt.Color(255, 0, 0));
        vta_us.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(vta_us, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 70, -1));

        btn_salirvta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/exit.png"))); // NOI18N
        btn_salirvta.setText("Salir");
        btn_salirvta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirvtaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salirvta, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 570, 130, 40));

        cli_telefono.setEditable(false);
        cli_telefono.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(cli_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, 110, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/x-button.png"))); // NOI18N
        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 570, 140, 40));

        btn_presupuesto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_presupuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/budget1.png"))); // NOI18N
        btn_presupuesto.setText("Imprimir Presupuesto");
        btn_presupuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_presupuestoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_presupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 510, 280, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/fondgris.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 300, 230));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/fondgris.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 730, 290));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setText("Importe");
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 60, 30));

        sucursal_vta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sucursal_vta.setForeground(new java.awt.Color(204, 0, 0));
        sucursal_vta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sucursal_vta.setText("suc");
        getContentPane().add(sucursal_vta, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 40, 30));

        boleta_vta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boleta_vta.setForeground(new java.awt.Color(204, 0, 0));
        boleta_vta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boleta_vta.setText("id_boleta");
        getContentPane().add(boleta_vta, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 90, 30));

        cond.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cond.setForeground(new java.awt.Color(204, 0, 0));
        cond.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cond.setText("COND");
        getContentPane().add(cond, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 90, 30));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("GS");
        jLabel40.setFocusable(false);
        jLabel40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 30, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("CAJA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 50, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("SUCURSAL");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 90, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("NRO OPE.");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 80, 20));

        txt_fechavta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_fechavta.setForeground(new java.awt.Color(255, 0, 0));
        txt_fechavta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_fechavta.setText("FECHA");
        getContentPane().add(txt_fechavta, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 90, 30));
        getContentPane().add(id_prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 30, -1));
        getContentPane().add(url, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 280, 100, -1));

        img_foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(img_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, 140, 110));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("CONDICION");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 90, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("FECHA");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 90, 20));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Buscar por");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 80, 20));
        getContentPane().add(txt_obs, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 680, 30));
        getContentPane().add(vta_id_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 30, -1));
        getContentPane().add(vta_id_lector, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 130, -1));
        getContentPane().add(vta_nomb_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 140, -1));
        getContentPane().add(vta_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 160, -1));
        getContentPane().add(vta_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 90, -1));
        getContentPane().add(vta_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 80, -1));
        getContentPane().add(iddeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 60, -1));

        ida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ida.setForeground(new java.awt.Color(255, 0, 0));
        ida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ida.setText("ID");
        getContentPane().add(ida, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 90, 30));
        getContentPane().add(total_gs, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 90, -1));
        getContentPane().add(monto_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 280, 70, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setText("Total 10%:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, 60, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("IVA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel8.setText("Total 5%:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, 60, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setText("Exentas:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, 50, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setText("Sub Total");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel15.setText("Liquidación");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 300, -1, -1));

        exenta_iva.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        exenta_iva.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        exenta_iva.setText("0");
        getContentPane().add(exenta_iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 320, 60, -1));

        iva_55.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        iva_55.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        iva_55.setText("0");
        getContentPane().add(iva_55, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 340, 60, -1));

        total_total.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        total_total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total_total.setText("0");
        getContentPane().add(total_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(942, 380, 60, -1));

        tt1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tt1.setText("TOTAL");
        getContentPane().add(tt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 380, -1, -1));

        iva_100.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        iva_100.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        iva_100.setText("0");
        getContentPane().add(iva_100, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 360, 60, -1));

        jLabel_factura.setText("LECTOR");
        getContentPane().add(jLabel_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, 260, 110));

        bus_pro.setText("DESCRIPCION");
        getContentPane().add(bus_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        liq_5.setEditable(false);
        liq_5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        liq_5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        liq_5.setBorder(null);
        liq_5.setOpaque(false);
        getContentPane().add(liq_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 340, 70, -1));
        getContentPane().add(ivat, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 60, -1));

        liq_10.setEditable(false);
        liq_10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        liq_10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        liq_10.setBorder(null);
        liq_10.setOpaque(false);
        getContentPane().add(liq_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 360, 70, -1));

        id.setText("id");
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 60, -1));

        pedido_cod.setText("pedido_cod");
        getContentPane().add(pedido_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 70, -1));

        liq_exenta.setEditable(false);
        liq_exenta.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        liq_exenta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        liq_exenta.setBorder(null);
        liq_exenta.setOpaque(false);
        getContentPane().add(liq_exenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, 70, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/fondosistema.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirvtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirvtaActionPerformed
        int aux  =  JOptionPane.showConfirmDialog(null, "Desea Salir","Venta", JOptionPane.YES_NO_OPTION);

        if(aux == JOptionPane.YES_OPTION){
            
       
            Conexion cc=new Conexion();
            Connection con=cc.conectar();
            try {

                String sqleliminar1 = "delete from tmpdetpresu where detvta_caja = '"+txt_caja.getText()+"' and detvta_suc = '"+sucursal_vta.getText()+"' and detvta_num_deta = '"+ida.getText()+"'";
                st = con.createStatement();
                st.execute(sqleliminar1);

            dispose();
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error" + ex);
            }
            
        }
    }//GEN-LAST:event_btn_salirvtaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
                ventanainterna.setVisible(true);
       
       		String[] titulo={"Documento","Nombre","Telefono"};
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

            buscacli.requestFocus();                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_selecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selecActionPerformed
                

        
        ventanainterna.setVisible(false);
    }//GEN-LAST:event_btn_selecActionPerformed

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

    private void buscacliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscacliKeyReleased
        metodos.convertiraMayusculasEnJtextfield(buscacli);
    }//GEN-LAST:event_buscacliKeyReleased

    private void jTableclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableclienteMouseClicked
        
                int n1 = jTablecliente.getSelectedRow();
                String id = jTablecliente.getValueAt(n1, 0).toString();
                cli_cedula.setText(id);
        
 		Conexion cc=new Conexion();
		Connection con=cc.conectar();;
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
                        cli_limite.setText(rs.getString("cli_limite"));

                    }
			rs.close();
			st.close();
			con.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
                
        if(evt.getClickCount()==1){
           ventanainterna.setVisible(false);
           // System.out.println("Se ha hecho un click");
        }
        buscar_productos.requestFocus();
     
                //pedido_cant.requestFocus();
               // pedido_cant.setText("")
        
    }//GEN-LAST:event_jTableclienteMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cliente ver11 = new cliente();
        ver11.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxbusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxbusActionPerformed
     /*   if (jComboBoxbus.getSelectedItem().toString().equals("Codigo")){
            System.out.println("Codigo1");
        }else{
            System.out.println("Descripcion1");
        }*/
  /*  if(jComboBoxbus.getSelectedItem().equals("Codigo")){
        System.out.println("Codigo1");
    }*/

    if(jComboBoxbus.getSelectedItem().equals("Descripcion")){
        System.out.println("Descripcion1");
    }
    }//GEN-LAST:event_jComboBoxbusActionPerformed

    private void jTable_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_productosMouseClicked
               
                ///////////////////////////////////////////////
                int n0 = jTable_productos.getSelectedRow();
                String id = jTable_productos.getValueAt(n0, 0).toString();
                id_prod.setText(id);
                
                Conexion cc=new Conexion();
		Connection con=cc.conectar();;
        	try {
		
		String sql = "Select * from productos where pro_id = '"+id_prod.getText()+"'";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {

                         url.setText(rs.getString("pro_imgurl"));
                         vta_id_pro.setText(rs.getString("pro_id_lg"));
                         vta_id_lector.setText(rs.getString("pro_lector"));
                         
                         vta_nomb_pro.setText(rs.getString("pro_desc"));
                         vta_proveedor.setText(rs.getString("pro_proveedor"));
                         vta_precio.setText(rs.getString("pro_precioventa"));
                         ivat.setText(rs.getString("pro_ivaporcentaje"));

                         ///////////////////////////////////////////////mostrar imagenes en pantalla
                        String url = (rs.getString("pro_imgurl"));
                        ImageIcon fot = new ImageIcon(url);
                        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(img_foto.getWidth(), img_foto.getHeight(), Image.SCALE_DEFAULT));
                        img_foto.setIcon(icono);
                        img_foto.repaint();

                    }
			rs.close();
			st.close();
			con.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
                
                vta_cant.requestFocus();
                vta_cant.setText("");
        ////////////////////////////////////////////////
    }//GEN-LAST:event_jTable_productosMouseClicked

    private void vta_cantKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vta_cantKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          buscar_productos.requestFocus();
          btn_agregar.doClick();
      }
    }//GEN-LAST:event_vta_cantKeyPressed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
 //        if (cli_cedula.getText().isEmpty() ) {
         
  /*          JOptionPane.showMessageDialog(null, "Favor Registre el cliente para continuar");
            
            ventanainterna.setVisible(true);
       
       		String[] titulo={"Documento","Nombre","Telefono"};
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

            buscacli.requestFocus();
            buscacli.setText("");    */
            
  //      }else{
                    buscar_productos.setText("");
  
                    String cadena1, cadena2;
                    int entero1,entero2;
        
                    cadena1 = vta_precio.getText();
                    cadena2 = vta_cant.getText(); 

                    entero1 = parseInt(cadena1);
                    entero2 = parseInt(cadena2);

                    entero1 = entero1 * entero2;
                    cadena1 = Integer.toString(entero1);
                    vta_total.setText(cadena1);
            
///////////////////////////////////////////////////////////////////////////////////////////////
            String ivatt = ivat.getText();
            if (ivatt.equals("10")){
                
                int calc1,sumiva10;
                String iva10;
                String ivaaa5 = "0";
                String ivaaaex = "0";
                String vta_tota = vta_total.getText();

                calc1 = parseInt(vta_tota);
                sumiva10 = calc1 / 11;
                iva10 = Integer.toString(sumiva10);
                iva_100.setText(iva10);
                iva_55.setText(ivaaa5);
                exenta_iva.setText(ivaaaex);
                

             }
            
            if(ivatt.equals("5")){
                int calc2,sumiva5;
                String iva5;
                String ivaaa10 = "0";
                String ivaaex = "0";
                String vta_tota = vta_total.getText();

                calc2 = parseInt(vta_tota);
                sumiva5 = calc2 / 21;
                iva5 = Integer.toString(sumiva5);
                iva_55.setText(iva5);
                iva_100.setText(ivaaa10);
                exenta_iva.setText(ivaaex);
      
                String cero = "0";
                liq_exenta.setText(cero);
                liq_10.setText(cero);
             }
            
            if(ivatt.equals("1")){
     
                int calc3,sumiva8;
                String iva8;
                String ivaaaa10 = "0";
                String ivaaaa5 = "0";
                String vta_tot = vta_total.getText();

                calc3 = parseInt(vta_tot);
                sumiva8 = calc3;
                iva8 = Integer.toString(sumiva8);
                exenta_iva.setText(iva8);
                iva_55.setText(ivaaaa5);
                iva_100.setText(ivaaaa10);

                String cero = "0";
                liq_5.setText(cero);
                liq_10.setText(cero);
               
             } 
         ///////////////////////////////////////////////////////////
                    
                    
            Conexion cc=new Conexion();
            Connection con=cc.conectar();
            try {
               
                String sql = "INSERT INTO tmpdetpresu (detvta_num_deta, detvta_id_prod, detvta_id_lector, detvta_nomb_pro,detvta_cant, detvta_proveedor, detvta_fecha,detvta_preciogs,detvta_preciototal,"
                + "detvta_caja,detvta_id_lg,detvta_suc,detvta_iva5, detvta_iva10, detvta_exenta) "
                + "values ('"+boleta_vta.getText()+"','"+vta_id_pro.getText()+"','"+vta_id_lector.getText()+"','"+vta_nomb_pro.getText()+"',"
                + "'"+vta_cant.getText()+"','"+vta_proveedor.getText()+"','"+txt_fechavta.getText()+"','"+vta_precio.getText()+"','"+vta_total.getText()+"',"
                + "'"+txt_caja.getText()+"','"+vta_id_pro.getText()+"','"+sucursal_vta.getText()+"','"+iva_55.getText()+"','"+iva_100.getText()+"','"+exenta_iva.getText()+"')";

                st = con.createStatement();
                st.execute(sql);
                metodo_presupuesto.CARGAR_JTABLE_vtadetalle_presupuesto();

            } catch (SQLException ex) {
                //System.out.println("ver error " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "error" + ex);
            }
 
            
        String sql="select count(*) from tmpdetpresu where detvta_caja = '"+txt_caja.getText()+"' and detvta_suc = '"+sucursal_vta.getText()+"' and detvta_num_deta = '"+ida.getText()+"'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sql);
            if(rs.next())
            {
                 item_cant.setText(rs.getString("count"));
            }

        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   
        
        String suma="select SUM(detvta_preciototal) from tmpdetpresu where detvta_caja = '"+txt_caja.getText()+"' and detvta_suc = '"+sucursal_vta.getText()+"' and detvta_num_deta = '"+ida.getText()+"'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma);
            if(rs.next())
            {
                 venta_suma.setText(rs.getString("sum"));
                 total_gs.setText(rs.getString("sum"));
                 
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        }        
        vta_cant.setText("");
        
        //////////////////////////////////

///////////////////////////////////////muestra suma de iva///////////////////////////////////////////        
       String suma8="select SUM(detvta_iva10) from tmpdetpresu where detvta_caja = '"+txt_caja.getText()+"' and detvta_suc = '"+sucursal_vta.getText()+"' and detvta_num_deta = '"+ida.getText()+"'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma8);
            if(rs.next())
            {
                 iva_100.setText(rs.getString("sum"));

            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        }  
        
        String suma9="select SUM(detvta_iva5) from tmpdetpresu where detvta_caja = '"+txt_caja.getText()+"' and detvta_suc = '"+sucursal_vta.getText()+"' and detvta_num_deta = '"+ida.getText()+"'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma9);
            if(rs.next())
            {
                 iva_55.setText(rs.getString("sum"));

            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        }  
        
    /*    String suma10="select SUM(detvta_exenta) from tmpdetallevta where detvta_caja = '"+vtacredito.txt_caja.getText()+"' and detvta_suc = '"+sucursal_vta.getText()+"' and detvta_num_deta = '"+ida.getText()+"'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma10);
            if(rs.next())
            {
                 exenta_iva.setText(rs.getString("sum"));

            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        }  */
        
        ///------------------------------muestra suma de liquidacion iva 10------------------------------------------////////////////////////
        
        String sumaliq="select SUM(detvta_preciototal) from tmpdetpresu where detvta_iva10 <> 0 and detvta_caja = '"+txt_caja.getText()+"' and detvta_suc = '"+sucursal_vta.getText()+"' and detvta_num_deta = '"+ida.getText()+"'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sumaliq);
            if(rs.next())
            {
                 liq_10.setText(rs.getString("sum"));

            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        }  
///////////////////////////////////////////////////////////////////////////////////////////////
        ///------------------------------muestra suma de liquidacion iva 5------------------------------------------////////////////////////
        
        String sumaliq5="select SUM(detvta_preciototal) from tmpdetpresu where detvta_iva5 <> 0 and detvta_caja = '"+txt_caja.getText()+"' and detvta_suc = '"+sucursal_vta.getText()+"' and detvta_num_deta = '"+ida.getText()+"'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sumaliq5);
            if(rs.next())
            {
                 liq_5.setText(rs.getString("sum"));

            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        }  
///////////////////////////////////////////////////////////////////////////////////////////////

        ///------------------------------muestra suma de liquidacion exenta------------------------------------------////////////////////////
        
        String sumaliqex="select SUM(detvta_preciototal) from tmpdetpresu where detvta_exenta <> 0 and detvta_caja = '"+txt_caja.getText()+"' and detvta_suc = '"+sucursal_vta.getText()+"' and detvta_num_deta = '"+ida.getText()+"'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sumaliqex);
            if(rs.next())
            {
                 liq_exenta.setText(rs.getString("sum"));

            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        }  
///////////////////////////////////////////////////////////////////////////////////////////////

       // }
        
        //////////////////////////////////////////////////////////////////////////
        String ivas5, ivas10,ivastot;
        int ent,ent2,entsum;
        
        ivas5 = iva_55.getText();
        ivas10 = iva_100.getText(); 
        
        ent = parseInt(ivas5);
        ent2 = parseInt(ivas10);
        
        entsum = ent + ent2;
        ivastot = Integer.toString(entsum);
        total_total.setText(ivastot);
        //////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////
        String cadena3, cadena4;
        int entero3,entero4;
        
        cadena3 = venta_suma.getText();
        cadena4 = Principal.us.getText(); 
        
        entero3 = parseInt(cadena3);
        entero4 = parseInt(cadena4);
        
        entero3 = entero3 / entero4;
        cadena3 = Integer.toString(entero3);
        vta_us.setText(cadena3);
        //////////////////////////////////////////////////////////////////////////
        
        //////////////////////////////////////////////////////////////////////////
        String cadena5, cadena6;
        int entero5,entero6;
        
        cadena5 = venta_suma.getText();
        cadena6 = Principal.rs.getText(); 
        
        entero5 = parseInt(cadena5);
        entero6 = parseInt(cadena6);
        
        entero5 = entero5 / entero6;
        cadena5 = Integer.toString(entero5);
        vta_rs.setText(cadena5);
        //////////////////////////////////////////////////////////////////////////
        
        ///////////CALCULO PESO ARGENTINO/////////////////////////////////////////
        String cadena7, cadena8;
        int entero7,entero8;
        
        cadena7 = venta_suma.getText();
        cadena8 = Principal.pa.getText(); 
        
        entero7 = parseInt(cadena7);
        entero8 = parseInt(cadena8);
        
        entero7 = entero7 / entero8;
        cadena7 = Integer.toString(entero7);
        vta_peso.setText(cadena7);
        //////////////////////////////////////////////////////////////////////////
                   
        //////////////////////////////////////////////////////////////////////////
        String cadena12;
        int entero12;
        cadena12 = venta_suma.getText();
        entero12 = parseInt(cadena12);  

        DecimalFormat formatea = new DecimalFormat("###,###,###,###.##");

        venta_suma.setText(formatea.format(entero12));
        //System.out.println(formatea.format(entero1));
        //////////////////llamar metodo de numeros a letras//////////////////////////////////////////////////////// 
        String total = total_gs.getText();
        Numero_Letras letritas = new Numero_Letras();
        txt_obs.setText(letritas.Convertir(total + "", true));
        //////////////////////////////////////////////////////////
     
        
            
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                int n1 = jtable_vtadetalle.getSelectedRow();
                String id = jtable_vtadetalle.getValueAt(n1, 0).toString();
                iddeta.setText(id);


            Conexion cc=new Conexion();
            Connection con=cc.conectar();

            try {

                String sql = "delete from tmpdetpresu where detvta_id = '"+iddeta.getText()+"' ";
                st = con.createStatement();

                st.execute(sql);
                
                 metodoventa.CARGAR_JTABLE_vtadetalle();
                
            }catch (Exception ee) {
                ee.printStackTrace();
            }
            
        String sql="select count(*) from tmpdetpresu where detvta_caja = '"+txt_caja.getText()+"' and detvta_suc = '"+sucursal_vta.getText()+"' and detvta_num_deta = '"+ida.getText()+"'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sql);
            if(rs.next())
            {
                 item_cant.setText(rs.getString("count"));
            }

        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String suma="select SUM(detvta_preciototal) from tmpdetpresu where detvta_caja = '"+txt_caja.getText()+"' and detvta_suc = '"+sucursal_vta.getText()+"' and detvta_num_deta = '"+ida.getText()+"'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma);
            if(rs.next())
            {

                 venta_suma.setText(rs.getString("sum"));
                 total_gs.setText(rs.getString("sum"));
            }

        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
               
///////////////////////////////////////muestra suma de iva///////////////////////////////////////////        
       String suma8="select SUM(detvta_iva10) from tmpdetpresu where detvta_caja = '"+presupuestos.txt_caja.getText()+"' and detvta_suc = '"+sucursal_vta.getText()+"' and detvta_num_deta = '"+ida.getText()+"'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma8);
            if(rs.next())
            {
                 iva_100.setText(rs.getString("sum"));

            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        }  
        
        String suma9="select SUM(detvta_iva5) from tmpdetpresu where detvta_caja = '"+presupuestos.txt_caja.getText()+"' and detvta_suc = '"+sucursal_vta.getText()+"' and detvta_num_deta = '"+ida.getText()+"'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma9);
            if(rs.next())
            {
                 iva_55.setText(rs.getString("sum"));

            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        }  
        
    /*    String suma10="select SUM(detvta_exenta) from tmpdetallevta where detvta_caja = '"+vtacredito.txt_caja.getText()+"' and detvta_suc = '"+sucursal_vta.getText()+"' and detvta_num_deta = '"+ida.getText()+"'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(suma10);
            if(rs.next())
            {
                 exenta_iva.setText(rs.getString("sum"));

            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        }  */
        
        ///------------------------------muestra suma de liquidacion iva 10------------------------------------------////////////////////////
        
        String sumaliq="select SUM(detvta_preciototal) from tmpdetpresu where detvta_iva10 <> 0 and detvta_caja = '"+presupuestos.txt_caja.getText()+"' and detvta_suc = '"+sucursal_vta.getText()+"' and detvta_num_deta = '"+ida.getText()+"'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sumaliq);
            if(rs.next())
            {
                 liq_10.setText(rs.getString("sum"));

            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        }  
///////////////////////////////////////////////////////////////////////////////////////////////
        ///------------------------------muestra suma de liquidacion iva 5------------------------------------------////////////////////////
        
        String sumaliq5="select SUM(detvta_preciototal) from tmpdetpresu where detvta_iva5 <> 0 and detvta_caja = '"+presupuestos.txt_caja.getText()+"' and detvta_suc = '"+sucursal_vta.getText()+"' and detvta_num_deta = '"+ida.getText()+"'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sumaliq5);
            if(rs.next())
            {
                 liq_5.setText(rs.getString("sum"));

            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        }  
///////////////////////////////////////////////////////////////////////////////////////////////

        ///------------------------------muestra suma de liquidacion exenta------------------------------------------////////////////////////
        
        String sumaliqex="select SUM(detvta_preciototal) from tmpdetpresu where detvta_exenta <> 0 and detvta_caja = '"+presupuestos.txt_caja.getText()+"' and detvta_suc = '"+sucursal_vta.getText()+"' and detvta_num_deta = '"+ida.getText()+"'";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sumaliqex);
            if(rs.next())
            {
                 liq_exenta.setText(rs.getString("sum"));

            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error" + ex);
        }  
///////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////
        String ivas5, ivas10,ivastot;
        int ent,ent2,entsum;
        
        ivas5 = iva_55.getText();
        ivas10 = iva_100.getText(); 
        
        ent = parseInt(ivas5);
        ent2 = parseInt(ivas10);
        
        entsum = ent + ent2;
        ivastot = Integer.toString(entsum);
        total_total.setText(ivastot);
        //////////////////////////////////////////////////////////////////////////
         //////////////////////////////////////////////////////////////////////////----------------------------------
        String cadena3, cadena4;
        int entero3,entero4;
        
        cadena3 = venta_suma.getText();
        cadena4 = Principal.us.getText(); 
        
        entero3 = parseInt(cadena3);
        entero4 = parseInt(cadena4);
        
        entero3 = entero3 / entero4;
        cadena3 = Integer.toString(entero3);
        vta_us.setText(cadena3);
        //////////////////////////////////////////////////////////////////////////
        
        //////////////////////////////////////////////////////////////////////////
        String cadena5, cadena6;
        int entero5,entero6;
        
        cadena5 = venta_suma.getText();
        cadena6 = Principal.rs.getText(); 
        
        entero5 = parseInt(cadena5);
        entero6 = parseInt(cadena6);
        
        entero5 = entero5 / entero6;
        cadena5 = Integer.toString(entero5);
        vta_rs.setText(cadena5);
        //////////////////////////////////////////////////////////////////////////
        
        ///////////CALCULO PESO ARGENTINO/////////////////////////////////////////
        String cadena7, cadena8;
        int entero7,entero8;
        
        cadena7 = venta_suma.getText();
        cadena8 = Principal.pa.getText(); 
        
        entero7 = parseInt(cadena7);
        entero8 = parseInt(cadena8);
        
        entero7 = entero7 / entero8;
        cadena7 = Integer.toString(entero7);
        vta_peso.setText(cadena7);
        //////////////////////////////////////////////////////////////////////////
                
        //////////////////////////////////////////////////////////////////////////
        String cadena1;
        int entero1;
        cadena1 = venta_suma.getText();
        entero1 = parseInt(cadena1);  

        DecimalFormat formatea = new DecimalFormat("###,###,###,###.##");

        venta_suma.setText(formatea.format(entero1));
       // System.out.println(formatea.format(entero1));
        ///////////////de numeros a letras///////////////////////////////////////////////////////////            
        String total = total_gs.getText();
        Numero_Letras letritas = new Numero_Letras();
        txt_obs.setText(letritas.Convertir(total + "", true));
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void vta_importeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vta_importeKeyTyped

    }//GEN-LAST:event_vta_importeKeyTyped

    private void vta_importeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vta_importeKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          btn_presupuesto.requestFocus();
          btn_presupuesto.doClick();
      } 

    }//GEN-LAST:event_vta_importeKeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         
         int aux  =  JOptionPane.showConfirmDialog(null, "Desea Cancelar","Venta", JOptionPane.YES_NO_OPTION);

        if(aux == JOptionPane.YES_OPTION){
            
       
            Conexion cc=new Conexion();
            Connection con=cc.conectar();
            try {

                String sqleliminar = "delete from tmpdetpresu where detvta_caja = '"+txt_caja.getText()+"' and detvta_suc = '"+sucursal_vta.getText()+"' and detvta_num_deta = '"+ida.getText()+"'";
                st = con.createStatement();
                st.execute(sqleliminar);

            metodo_presupuesto.CARGAR_JTABLE_vtadetalle_presupuesto();
            venta_suma.setText("");
            vta_peso.setText("");
            vta_rs.setText("");
            vta_us.setText("");
            total_gs.setText("");
            cli_cedula.setText("");
            cli_telefono.setText("");
            cli_nomb.setText("");
            cli_direcc.setText("");
            cli_limite.setText("");
            vtacreditodoc5.setText("");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error" + ex);
            }
            
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void buscar_productosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar_productosKeyReleased
        metodos.convertiraMayusculasEnJtextfield(buscar_productos);
    }//GEN-LAST:event_buscar_productosKeyReleased

    private void buscar_productosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar_productosKeyTyped
      
               ///////////////////para factura
        if(bus_pro.getText().equals("0")){ //sin factura

           
           metodoproducto.CARGAR_JTABLE_productos_vtacredito_bus_lector(); 
 
        }
       if(bus_pro.getText().equals("1")){// con factura
           
           metodoproducto.CARGAR_JTABLE_productos_vtacredito_bus();
           
       }
        
    }//GEN-LAST:event_buscar_productosKeyTyped

    private void jTable_productosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_productosKeyPressed
              
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
              vta_cant.requestFocus();
                vta_cant.setText("");
        }
    }//GEN-LAST:event_jTable_productosKeyPressed

    private void vta_cantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vta_cantKeyTyped
       char car = evt.getKeyChar();
        if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_vta_cantKeyTyped

    private void btn_presupuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_presupuestoActionPerformed
        //if(jLabel_factura.getText().equals("0")){////si es sin factura que no haga el update de contador
        int j;
        int cont=1;
        String num="";
        String c="";
        
        Conexion cc=new Conexion();
	Connection con=cc.conectar();
        String sql1="select max(vta_id) from presupuesto";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sql1);
            if(rs.next())
            {
                c=rs.getString(1);  
            }
            if(c==null){
                ida.setText("00000001");
            }
            else{
                 j=Integer.parseInt(c);
                 GenerarNumero gen= new GenerarNumero();
                 gen.generar(j);
                 ida.setText(gen.serie());
            }

        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String sql2="select max(vta_id) from presupuesto";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sql2);
            if(rs.next())
            {
                c=rs.getString(1);  
            }
            if(c==null){
                boleta_vta.setText("00000001");
            }
            else{
                 j=Integer.parseInt(c);
                 GenerarNumero gen= new GenerarNumero();
                 gen.generar(j);
                 boleta_vta.setText(gen.serie());
            }

        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
 // }////fin si factura es igual a 0

        String nrofac = "00"+sucursal_vta.getText()+"-00"+txt_caja.getText()+"-"+pedido_cod.getText()+"";
        

///////////////////////////////////////////////////////////////////////////////////////////
            if(liq_5.getText().isEmpty()){
                liq_5.setText("0");
            }
            if(liq_10.getText().isEmpty()){
                liq_10.setText("0");
            }
            if(liq_exenta.getText().isEmpty()){
                liq_exenta.setText("0");
            }
    
            if (cli_cedula.getText().isEmpty()) {
                
                     

                        JOptionPane.showMessageDialog(null, "Favor Registre el cliente para continuar");

                        ventanainterna.setVisible(true);

                            String[] titulo={"Documento","Nombre","Telefono"};
                            DefaultTableModel mod=new DefaultTableModel(null,titulo);
                            Object[] reg=new Object[7];
                            String sql="select * from clientes ORDER BY cli_cedula DESC";
                           // Conexion cc=new Conexion();
                           // Connection con=cc.conectar();
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
                                    
                                   /* rs.close();
                                    st.close();
                                    con.close();*/
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

                        buscacli.requestFocus();
                        buscacli.setText("");
     
              
                
                
            }else{
                
/////////////////////////////////////////////////////////////////////////////////////////////////////////
                 
           // Conexion cc=new Conexion();
          //  Connection con=cc.conectar();
            try {
                int exenta = 0;
                int anulado = 1;///dato no esta anulado
                String sqlinsertar1 = "INSERT INTO presupuesto (vta_num_deta, vta_codigo, vta_fecha, vta_cliente_id, vta_cliente_nom,vta_montogs"
                + ",vta_montous, vta_montors,vta_montoar,vta_czus,vta_czrs,vta_czar, vta_condicion, vta_caja, vta_suc, vta_importe, vta_obs,"
                + " vta_cant,vta_id, vta_anulado, vta_vendedor, vta_iva5, vta_iva10, vta_exenta, vta_ivatotal, vta_liq5, vta_liq10, vta_liqex, vta_nrofac ) "
                + "values ('"+boleta_vta.getText()+"','"+boleta_vta.getText()+"','"+txt_fechavta.getText()+"','"+cli_cedula.getText()+"',"
                + "'"+cli_nomb.getText()+"','"+total_gs.getText()+"','"+vta_us.getText()+"','"+vta_rs.getText()+"','"+vta_peso.getText()+"',"
                + "'"+Principal.us.getText()+"','"+Principal.rs.getText()+"','"+Principal.pa.getText()+"','"+cond.getText()+"','"+txt_caja.getText()+"',"
                + "'"+sucursal_vta.getText()+"','"+vta_importe.getText()+"','"+txt_obs.getText()+"','"+item_cant.getText()+"','"+ida.getText()+"' ,'"+anulado+"',"
                + "'"+Principal.usuario_ini.getText()+"', '"+iva_55.getText()+"', '"+iva_100.getText()+"', '"+exenta+"',"
                + " '"+total_total.getText()+"','"+liq_5.getText()+"','"+liq_10.getText()+"','"+liq_exenta.getText()+"','"+nrofac+"')";
                st = con.createStatement();
                st.execute(sqlinsertar1);
                
                JOptionPane.showMessageDialog(null, "Presupuesto realizado con exito");
                
 
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error" + ex);
            }
              
        
  
       //////////////////////////////////////////////////////////////////-----------------------------------------------------
                try{
                String sqlINS = "INSERT INTO detpresupuesto select * from tmpdetpresu where detvta_caja = '"+presupuestos.txt_caja.getText()+"' and detvta_suc = '"+sucursal_vta.getText()+"' and detvta_num_deta = '"+ida.getText()+"'";
                st = con.createStatement();
                st.execute(sqlINS);

                String sqleliminar = "delete from tmpdetpresu where detvta_caja = '"+presupuestos.txt_caja.getText()+"' and detvta_suc = '"+sucursal_vta.getText()+"' and detvta_num_deta = '"+ida.getText()+"'";
                //and detvta_num_deta = '"+ida.getText()+"'
                st = con.createStatement();
                st.execute(sqleliminar);
                
          /*      String sqlUPDATE = "update detpresupuesto set detvta_num_deta = '"+ida.getText()+"' where detvta_caja = '"+presupuestos.txt_caja.getText()+"' and detvta_suc = '"+sucursal_vta.getText()+"'";
                
                //and detvta_num_deta = '"+ida.getText()+"'
                st = con.createStatement();
                st.execute(sqlUPDATE);*/
                
                }catch(Exception e1){
                    JOptionPane.showMessageDialog(null, "Error" +e1);
                }

            metodo_presupuesto.CARGAR_JTABLE_productos_presupuestos();
            metodo_presupuesto.CARGAR_JTABLE_vtadetalle_presupuesto();
                

                


        ///////////////////////////////////////////////////////////////---------------------------------------------------
   
            venta_suma.setText("");
            vta_peso.setText("");
            vta_rs.setText("");
            vta_us.setText("");
            total_gs.setText("");
            cli_cedula.setText("");
            cli_telefono.setText("");
            cli_nomb.setText("");
            cli_direcc.setText("");
            cli_limite.setText("");
            vtacreditodoc5.setText("");
            /////////////////////
            vta_importe.setText("");
            vta_us.setText("");
            vta_rs.setText("");       
            vta_peso.setText("");
            venta_suma.setText("");
            item_cant.setText("");

         vta_importe.setText("0");
          
         ////////////////////////IMPRIMIR
         
           ////////////////////////////////imprimir/////////////////////////////////
                try {
                URL master = this.getClass().getResource("/reporte/vta_matricial_presupuesto.jasper");
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
                    //JasperPrintManager.printReport(print, false);////imprime directo
                    
                    
                   /* JasperViewer ver = new JasperViewer(print,false);
                    ver.setTitle("Venta");
                    ver.setVisible(true);*/
                    
                    
            } catch (Exception e) {
                System.out.println("reporte.reporte.Reportefichaupdate()" + e);
                JOptionPane.showMessageDialog(null, "Mensaje  "+ e);
            }   
         
         //////////////////////////////////////FIN IMPRIMIR
         
         metodo_presupuesto.generar_nro_presupuesto_uno();
         metodo_presupuesto.generar_nro_presupuesto();
         vta_importe.setText("0");
         
}
    }//GEN-LAST:event_btn_presupuestoActionPerformed

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
            java.util.logging.Logger.getLogger(presupuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(presupuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(presupuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(presupuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new presupuestos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel boleta_vta;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_presupuesto;
    private javax.swing.JButton btn_salirvta;
    private javax.swing.JButton btn_selec;
    private javax.swing.JLabel bus_pro;
    private javax.swing.JTextField buscacli;
    public static javax.swing.JTextField buscar_productos;
    public static javax.swing.JTextField cli_cedula;
    public static javax.swing.JTextField cli_direcc;
    public static javax.swing.JTextField cli_limite;
    public static javax.swing.JTextField cli_nomb;
    public static javax.swing.JTextField cli_telefono;
    public static javax.swing.JLabel cond;
    private javax.swing.JLabel exenta_iva;
    private javax.swing.JLabel gss;
    private javax.swing.JLabel id;
    private javax.swing.JTextField id_prod;
    public static javax.swing.JLabel ida;
    private javax.swing.JTextField idcli;
    private javax.swing.JTextField iddeta;
    private javax.swing.JLabel img_foto;
    private javax.swing.JLabel impot;
    private javax.swing.JLabel item_cant;
    private javax.swing.JLabel iva_100;
    private javax.swing.JLabel iva_55;
    private javax.swing.JTextField ivat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBoxbus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_factura;
    public static javax.swing.JLabel jLabel_venta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTable jTable_productos;
    private javax.swing.JTable jTablecliente;
    public static javax.swing.JTable jtable_vtadetalle;
    private javax.swing.JTextField liq_10;
    private javax.swing.JTextField liq_5;
    private javax.swing.JTextField liq_exenta;
    private javax.swing.JTextField monto_caja;
    private javax.swing.JLabel pedido_cod;
    public static javax.swing.JLabel sucursal_vta;
    private javax.swing.JTextField total_gs;
    private javax.swing.JLabel total_total;
    private javax.swing.JLabel tt1;
    public static javax.swing.JLabel txt_caja;
    private javax.swing.JLabel txt_fechavta;
    private javax.swing.JTextField txt_obs;
    private javax.swing.JTextField url;
    public static javax.swing.JTextField venta_suma;
    private javax.swing.JInternalFrame ventanainterna;
    public static javax.swing.JTextField vta_cant;
    private javax.swing.JTextField vta_id_lector;
    private javax.swing.JTextField vta_id_pro;
    public static javax.swing.JTextField vta_importe;
    private javax.swing.JTextField vta_nomb_pro;
    private javax.swing.JTextField vta_peso;
    private javax.swing.JTextField vta_precio;
    private javax.swing.JTextField vta_proveedor;
    private javax.swing.JTextField vta_rs;
    private javax.swing.JTextField vta_total;
    private javax.swing.JTextField vta_us;
    public static javax.swing.JTextField vtacreditodoc5;
    // End of variables declaration//GEN-END:variables

    private Object getText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
