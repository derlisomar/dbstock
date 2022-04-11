/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;


import static dbstock.DetalleVta.jTable_vta;
import static dbstock.vtacredito.txt_caja;
import java.awt.Color;
import java.awt.Image;
import java.awt.KeyEventPostProcessor;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;

public class productos extends javax.swing.JFrame {

    clsExportarExcel obj;
    Statement st;
    Connection con;
    public static double compra,venta,mayorista;
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos con Extension JPG y PNG", "jpg", "png");
    DateFormat df = DateFormat.getDateInstance();
     
    
    public productos() {
        initComponents();
        
        this.setLocationRelativeTo(null);//centra el formulario
        this.setTitle("Registro de Productos");
        
         pro_ganancia.setEnabled(false);
         //pro_id.setEnabled(false);
         id_proveedor.setVisible(false);
         pro_id.setEditable(false);
         
        Calendar Cal1= Calendar.getInstance();
        jDateChooser1.setCalendar(Cal1);
        
        //////////////////////////////fecha del sistema
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date fechaActual = new Date();
	pro_vencimineto.setText(sdf.format(fechaActual));
        
         
         pro_ganancia.setText("0");
         

         lavel_total.setBackground(new Color(0,0,0,1));//jtext field transparente

                pro_desc.setEnabled(false);
                cmb_grupo.setEnabled(false);
                pro_compra.setEnabled(false);
                pro_venta.setEnabled(false);
                pro_mayorista.setEnabled(false);
                pro_stock.setEnabled(false);
                pro_minimo.setEnabled(false);
                pro_vencimineto.setEnabled(false);
                cmb_prov1.setEnabled(false);
                pro_obs.setEnabled(false); 
                pro_lector.setEnabled(false);
                pro_img.setEnabled(false);
                
                btn_usunuevo.setEnabled(true);
                btn_usuexit.setEnabled(true);
                btn_usueditar.setEnabled(false);
                btn_usueliminar.setEnabled(false);
                btn_usuguardar.setEnabled(false);
                btn_usucalcelar.setEnabled(false);
                btn_examinar.setEnabled(false);
                id_var.setVisible(false);
                url_milogo.setVisible(false);
                iva_10.setEnabled(false);
                iva_5.setEnabled(false);
                iva_exenta.setEnabled(false);
                jDateChooser1.setEnabled(false);
                
                cargar_iva.setText("10");
                cargar_iva.setVisible(false);
                jcheck_sucu.setVisible(false);
                lavel_total.setEnabled(false);
         
       
  
                
        metodoproducto.cmb_proveedor2();
        metodoproducto.cmb_sucu();
        metodoproducto.cmb_grupo();
        metodoproducto.CARGAR_JTABLE_productos();
        metodoproducto.CARGAR_JTABLE_productos_2();
        
        metodoproducto.alignRight(jTable_productos, NORMAL);
        metodoproducto.alignRight1(jTable_productos, NORMAL);
        

  
       
        //////////////////////////////
        
         	Conexion cc=new Conexion();
		Connection con=cc.conectar();
        	try {
		String sql = "Select count(*) from productos ";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                        cant_pro.setText(rs.getString("count"));
                      
                    }
			/*rs.close();
			st.close();
			con.close();*/
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
                }
                

        	try {
		String sql = "Select sum(pro_totalvta) from productos ";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                        lavel_total.setText(rs.getString("sum"));
                      
                    }
			/*rs.close();
			st.close();
			con.close();*/
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
                }
                

        
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

                id_suc.setText(suc);

            } catch (Exception e) {
                e.printStackTrace();
            }
                
             
                try {
		String sql = "Select * from sucursal where su_codigo = '"+id_suc.getText()+"' ";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                        descri.setText(rs.getString("su_descri"));
                      
                    }
			rs.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
                }

                btn_usunuevo.requestFocus();

        //////////////////////////////////////////////////
        String vacio = lavel_total.getText();

        if (lavel_total.getText().length()==0 && (vacio != null) && (!vacio.equals(" "))) {
            // cadena no está vacía
            //JOptionPane.showMessageDialog(this, "No dejar campos Vacíos", "Error!", JOptionPane.ERROR_MESSAGE);
        } else {
            String cadena1;
            int entero1;
            cadena1 = lavel_total.getText();
            entero1 = parseInt(cadena1);

            DecimalFormat formatea = new DecimalFormat("###,###,###,###.##");

            lavel_total.setText(formatea.format(entero1));
        }


        jtable_producto2.setDefaultRenderer(Object.class, new colour());
        //////////////////////////////////////////////////////
        poputTable();
            
    }

    
public void poputTable(){
    ///, new ImageIcon(getClass().getResource("/ventas/recursos/submenu_porclientes.png"))
    

    JPopupMenu popupMenu = new JPopupMenu();
    final JMenuItem jMenuItem1 = new JMenuItem("Ver detalle del Producto");
    
    jMenuItem1.addActionListener(new ActionListener(){
        @Override
 
        public void actionPerformed(ActionEvent e) {
                emergente_producto emergente = new emergente_producto();
                emergente.setVisible(true);
           //JOptionPane.showMessageDialog(null,"HOLA");
        }
        
    });
    popupMenu.add(jMenuItem1);
    jtable_producto2.setComponentPopupMenu(popupMenu);
    
    
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pro_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pro_desc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pro_compra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pro_stock = new javax.swing.JTextField();
        pro_ganancia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        descri = new javax.swing.JLabel();
        pro_mayorista = new javax.swing.JTextField();
        cmb_grupo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        pro_venta = new javax.swing.JTextField();
        jCheckganancia = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        pro_minimo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        pro_obs = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_productos = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        pro_vencimineto = new javax.swing.JTextField();
        btn_usuexit = new javax.swing.JButton();
        btn_usueliminar = new javax.swing.JButton();
        btn_usucalcelar = new javax.swing.JButton();
        btn_usueditar = new javax.swing.JButton();
        btn_usuguardar = new javax.swing.JButton();
        btn_usunuevo = new javax.swing.JButton();
        btn_usuactualizar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        pro_lector = new javax.swing.JTextField();
        jCheckBox_barra = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        id_suc = new javax.swing.JLabel();
        pro_img = new javax.swing.JTextField();
        btn_examinar = new javax.swing.JButton();
        cmb_prov1 = new javax.swing.JComboBox<>();
        pro_bus2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        iva_10 = new javax.swing.JCheckBox();
        iva_5 = new javax.swing.JCheckBox();
        iva_exenta = new javax.swing.JCheckBox();
        cargar_iva = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_producto2 = new javax.swing.JTable();
        cant_label = new javax.swing.JLabel();
        jcheck_sinstock = new javax.swing.JCheckBox();
        cant_pro = new javax.swing.JLabel();
        jcheck_todos = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        jcheck_provee = new javax.swing.JComboBox<>();
        jcheck_sucu = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        img_label = new javax.swing.JLabel();
        descri_label = new javax.swing.JLabel();
        btn_usuexit1 = new javax.swing.JButton();
        url_milogo = new javax.swing.JTextField();
        id_var = new javax.swing.JTextField();
        cant_label2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        constock = new javax.swing.JCheckBox();
        id_proveedor = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lavel_total = new javax.swing.JTextField();
        bus_txt3 = new org.jdesktop.swingx.JXSearchField();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setToolTipText("Agregar");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE PRODUCTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Codigo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, 20));

        pro_id.setBackground(new java.awt.Color(255, 153, 153));
        pro_id.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pro_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(pro_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Grupo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 50, 20));

        pro_desc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pro_descKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pro_descKeyTyped(evt);
            }
        });
        jPanel1.add(pro_desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 350, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Precio de Compra");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, 20));

        pro_compra.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pro_compra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pro_compraFocusLost(evt);
            }
        });
        pro_compra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pro_compraKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pro_compraKeyTyped(evt);
            }
        });
        jPanel1.add(pro_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 120, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Stock");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 60, 20));

        pro_stock.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pro_stock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pro_stockKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pro_stockKeyTyped(evt);
            }
        });
        jPanel1.add(pro_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 90, -1));

        pro_ganancia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pro_ganancia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pro_gananciaFocusLost(evt);
            }
        });
        pro_ganancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_gananciaActionPerformed(evt);
            }
        });
        pro_ganancia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pro_gananciaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pro_gananciaKeyTyped(evt);
            }
        });
        jPanel1.add(pro_ganancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 60, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Precio Mayorista");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 110, 20));

        descri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        descri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descri.setText("descrip");
        jPanel1.add(descri, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 160, 20));

        pro_mayorista.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pro_mayorista.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pro_mayoristaFocusLost(evt);
            }
        });
        pro_mayorista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pro_mayoristaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pro_mayoristaKeyTyped(evt);
            }
        });
        jPanel1.add(pro_mayorista, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 130, -1));

        cmb_grupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grupo 1", "Grupo2", "Grupo3" }));
        cmb_grupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmb_grupoKeyPressed(evt);
            }
        });
        jPanel1.add(cmb_grupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 230, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Precio de Venta");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 120, 20));

        pro_venta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pro_venta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pro_ventaFocusLost(evt);
            }
        });
        pro_venta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pro_ventaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pro_ventaKeyTyped(evt);
            }
        });
        jPanel1.add(pro_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 120, -1));

        jCheckganancia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckganancia.setText("% Ganancia");
        jCheckganancia.setOpaque(false);
        jCheckganancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckgananciaActionPerformed(evt);
            }
        });
        jCheckganancia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCheckgananciaKeyPressed(evt);
            }
        });
        jPanel1.add(jCheckganancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Stock Minimo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 90, 20));

        pro_minimo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pro_minimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pro_minimoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pro_minimoKeyTyped(evt);
            }
        });
        jPanel1.add(pro_minimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 90, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("IVA");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 30, 30));

        pro_obs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pro_obsKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pro_obsKeyTyped(evt);
            }
        });
        jPanel1.add(pro_obs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 470, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Imagen URL");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 90, 20));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(810, 559));

        jTable_productos.setModel(new javax.swing.table.DefaultTableModel(
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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable_productosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_productos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 750, 190));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Proveedor");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 90, 20));

        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jDateChooser1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooser1KeyPressed(evt);
            }
        });
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 130, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Obs:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 40, 20));

        pro_vencimineto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(pro_vencimineto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 100, -1));

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
        jPanel1.add(btn_usuexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 110, 40));

        btn_usueliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/eliminar.png"))); // NOI18N
        btn_usueliminar.setText("Eliminar");
        btn_usueliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usueliminarActionPerformed(evt);
            }
        });
        btn_usueliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_usueliminarKeyPressed(evt);
            }
        });
        jPanel1.add(btn_usueliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 110, 40));

        btn_usucalcelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/x-button.png"))); // NOI18N
        btn_usucalcelar.setText("Cancelar");
        btn_usucalcelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usucalcelarActionPerformed(evt);
            }
        });
        btn_usucalcelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_usucalcelarKeyPressed(evt);
            }
        });
        jPanel1.add(btn_usucalcelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 110, 40));

        btn_usueditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/editar.png"))); // NOI18N
        btn_usueditar.setText("Editar");
        btn_usueditar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_usueditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usueditarActionPerformed(evt);
            }
        });
        btn_usueditar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_usueditarKeyPressed(evt);
            }
        });
        jPanel1.add(btn_usueditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 100, 40));

        btn_usuguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/save.png"))); // NOI18N
        btn_usuguardar.setText("Guardar");
        btn_usuguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuguardarActionPerformed(evt);
            }
        });
        btn_usuguardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_usuguardarKeyPressed(evt);
            }
        });
        jPanel1.add(btn_usuguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 110, 40));

        btn_usunuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/add-file.png"))); // NOI18N
        btn_usunuevo.setText("Nuevo");
        btn_usunuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usunuevoActionPerformed(evt);
            }
        });
        btn_usunuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_usunuevoKeyPressed(evt);
            }
        });
        jPanel1.add(btn_usunuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 100, 40));

        btn_usuactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/reload.png"))); // NOI18N
        btn_usuactualizar.setText("Actualizar");
        btn_usuactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuactualizarActionPerformed(evt);
            }
        });
        btn_usuactualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_usuactualizarKeyPressed(evt);
            }
        });
        jPanel1.add(btn_usuactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 110, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Descripción:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 80, 20));

        pro_lector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pro_lectorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pro_lectorKeyTyped(evt);
            }
        });
        jPanel1.add(pro_lector, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 310, -1));

        jCheckBox_barra.setOpaque(false);
        jCheckBox_barra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_barraActionPerformed(evt);
            }
        });
        jCheckBox_barra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCheckBox_barraKeyPressed(evt);
            }
        });
        jPanel1.add(jCheckBox_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Codigo de Barra");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 100, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Sucursal:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 60, 20));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Fecha de Vencimiento");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 20));

        id_suc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        id_suc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_suc.setText("1");
        jPanel1.add(id_suc, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 30, 20));

        pro_img.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(pro_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 300, -1));

        btn_examinar.setText("Examinar");
        btn_examinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_examinarActionPerformed(evt);
            }
        });
        btn_examinar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_examinarKeyPressed(evt);
            }
        });
        jPanel1.add(btn_examinar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, -1, -1));

        cmb_prov1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_prov1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmb_prov1KeyPressed(evt);
            }
        });
        jPanel1.add(cmb_prov1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 200, -1));

        pro_bus2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pro_bus2FocusLost(evt);
            }
        });
        pro_bus2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pro_bus2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pro_bus2KeyTyped(evt);
            }
        });
        jPanel1.add(pro_bus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 230, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Buscar");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 50, 20));

        iva_10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iva_10.setSelected(true);
        iva_10.setText("10%");
        iva_10.setOpaque(false);
        iva_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iva_10ActionPerformed(evt);
            }
        });
        jPanel1.add(iva_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, -1, 30));

        iva_5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iva_5.setText("5%");
        iva_5.setOpaque(false);
        iva_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iva_5ActionPerformed(evt);
            }
        });
        jPanel1.add(iva_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, -1, 30));

        iva_exenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iva_exenta.setText("EXENTAS");
        iva_exenta.setOpaque(false);
        iva_exenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iva_exentaActionPerformed(evt);
            }
        });
        jPanel1.add(iva_exenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, -1, 30));

        cargar_iva.setText("iva");
        jPanel1.add(cargar_iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 20, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("%");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 20, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/fondosistema.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 540));

        jTabbedPane1.addTab("---AGREGAR---", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtable_producto2.setModel(new javax.swing.table.DefaultTableModel(
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
        jtable_producto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_producto2MouseClicked(evt);
            }
        });
        jtable_producto2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtable_producto2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtable_producto2KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jtable_producto2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 37, 770, 370));

        cant_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cant_label.setText("Cantidad");
        jPanel2.add(cant_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, -1, -1));

        jcheck_sinstock.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcheck_sinstock.setText("Sin Stock");
        jcheck_sinstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheck_sinstockActionPerformed(evt);
            }
        });
        jcheck_sinstock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcheck_sinstockKeyPressed(evt);
            }
        });
        jPanel2.add(jcheck_sinstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        cant_pro.setBackground(new java.awt.Color(204, 0, 0));
        cant_pro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cant_pro.setForeground(new java.awt.Color(153, 0, 0));
        cant_pro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cant_pro.setToolTipText("");
        jPanel2.add(cant_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 50, 20));

        jcheck_todos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcheck_todos.setSelected(true);
        jcheck_todos.setText("Todos");
        jcheck_todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheck_todosActionPerformed(evt);
            }
        });
        jcheck_todos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcheck_todosKeyPressed(evt);
            }
        });
        jPanel2.add(jcheck_todos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Proveedor");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, 20));

        jcheck_provee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheck_proveeActionPerformed(evt);
            }
        });
        jcheck_provee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcheck_proveeKeyPressed(evt);
            }
        });
        jPanel2.add(jcheck_provee, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 200, -1));

        jPanel2.add(jcheck_sucu, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 170, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Buscar");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 50, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Cantidad Total de productos");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 180, 20));

        img_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_label.setText("img");
        jPanel2.add(img_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 140, 110));

        descri_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        descri_label.setText("Descripcion");
        jPanel2.add(descri_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 370, -1));

        btn_usuexit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/exit.png"))); // NOI18N
        btn_usuexit1.setText("Salir");
        btn_usuexit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuexit1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_usuexit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, 110, 40));

        url_milogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                url_milogoActionPerformed(evt);
            }
        });
        jPanel2.add(url_milogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 160, -1));
        jPanel2.add(id_var, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 70, -1));

        cant_label2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cant_label2.setText("Cantidad:");
        jPanel2.add(cant_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Monto Total:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, -1));

        constock.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        constock.setText("Con Stock");
        constock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                constockActionPerformed(evt);
            }
        });
        constock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                constockKeyPressed(evt);
            }
        });
        jPanel2.add(constock, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        id_proveedor.setText("id_proveedor");
        jPanel2.add(id_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 80, 20));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMACIONES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lavel_total.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lavel_total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lavel_total.setBorder(null);
        jPanel3.add(lavel_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 74, 150, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 210, 110));

        bus_txt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bus_txt3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bus_txt3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bus_txt3KeyTyped(evt);
            }
        });
        jPanel2.add(bus_txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 230, 30));

        jPanel6.setBackground(new java.awt.Color(0, 153, 51));
        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 20, 20));

        jPanel5.setBackground(new java.awt.Color(204, 204, 0));
        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 20, 20));

        jPanel4.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 20, 20));

        jLabel20.setText(">= 2 - < 7");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, -1, 20));

        jLabel26.setText("<=1");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, -1, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/excel.png"))); // NOI18N
        jButton1.setText("EXPORT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 120, 40));

        jLabel27.setText(">= 7");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, -1, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/fondosistema.jpg"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 530));

        jTabbedPane1.addTab("---LISTADO---", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckgananciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckgananciaActionPerformed
       
        if (pro_ganancia.getText().equals("")){
            
            if(jCheckganancia.isSelected()){
                pro_ganancia.setEnabled(true);
                pro_venta.setEnabled(false);
                pro_ganancia.setText("0");
                }else{
                pro_ganancia.setEnabled(false);
                pro_venta.setEnabled(true);
            }
            
        }
        else {
            
          pro_ganancia.setEnabled(true);
       }
        
        

           
    }//GEN-LAST:event_jCheckgananciaActionPerformed

    private void btn_usuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuexitActionPerformed
        
        metodoproducto.actualizar_montogeneral();
        dispose();

       
    }//GEN-LAST:event_btn_usuexitActionPerformed

    private void btn_usueliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usueliminarActionPerformed

        int aux  =  JOptionPane.showConfirmDialog(null, "Desea Eliminar? ","PRODUCTOS", JOptionPane.YES_NO_OPTION);

        if(aux == JOptionPane.YES_OPTION){

            int nz = jTable_productos.getSelectedRow();
            String id = jTable_productos.getValueAt(nz, 0).toString();
            pro_id.setText(id);

            Conexion cc=new Conexion();
            Connection con=cc.conectar();

            try {

                String sql = "delete from productos where pro_id = '"+pro_id.getText()+"' ";
                st = con.createStatement();

                st.execute(sql);

                metodoproducto.CARGAR_JTABLE_productos();

                pro_desc.setText("");
                cmb_grupo.setSelectedItem("");
                pro_compra.setText("");
                pro_venta.setText("");
                pro_mayorista.setText("");
                pro_stock.setText("");
                pro_minimo.setText("");
                pro_vencimineto.setText("");
                cmb_prov1.setSelectedItem("");
                pro_obs.setText("");

                pro_desc.setEnabled(false);
                cmb_grupo.setEnabled(false);
                pro_compra.setEnabled(false);
                pro_venta.setEnabled(false);
                pro_mayorista.setEnabled(false);
                pro_stock.setEnabled(false);
                pro_minimo.setEnabled(false);
                pro_vencimineto.setEnabled(false);
                cmb_prov1.setEnabled(false);
                pro_obs.setEnabled(false);
                
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

    private void btn_usucalcelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usucalcelarActionPerformed

        int aux  =  JOptionPane.showConfirmDialog(null, "Desea Cancelar Registro?","OBSERVACION", JOptionPane.YES_NO_OPTION);
        if(aux == JOptionPane.YES_OPTION){

                pro_desc.setEnabled(false);
                cmb_grupo.setEnabled(false);
                pro_compra.setEnabled(false);
                pro_venta.setEnabled(false);
                pro_mayorista.setEnabled(false);
                pro_stock.setEnabled(false);
                pro_minimo.setEnabled(false);
                pro_vencimineto.setEnabled(false);
                cmb_prov1.setEnabled(false);
                pro_obs.setEnabled(false);
                
                iva_10.setEnabled(false);
                iva_5.setEnabled(false);
                iva_exenta.setEnabled(false);

            btn_usuguardar.setVisible(true);
            btn_usunuevo.setEnabled(true);
            btn_usuguardar.setEnabled(false);
            btn_usuactualizar.setEnabled(false);
            btn_usueditar.setEnabled(false);
            btn_usueliminar.setEnabled(false);
            btn_usucalcelar.setEnabled(false);
            btn_usuexit.setEnabled(true);
            btn_examinar.setEnabled(false);
            jDateChooser1.setEnabled(false);

        }

    }//GEN-LAST:event_btn_usucalcelarActionPerformed

    private void btn_usueditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usueditarActionPerformed

        metodoproducto.cmb_proveedor();
        pro_desc.setEnabled(true);
        cmb_grupo.setEnabled(true);
        pro_compra.setEnabled(true);
        pro_venta.setEnabled(true);
        pro_mayorista.setEnabled(true);
        pro_stock.setEnabled(true);
        pro_minimo.setEnabled(true);
        pro_vencimineto.setEnabled(true);
        cmb_prov1.setEnabled(true);
        pro_obs.setEnabled(true);

        btn_usuguardar.setVisible(false);
        btn_usuactualizar.setVisible(true);

        btn_usunuevo.setEnabled(false);
        btn_usuguardar.setEnabled(false);
        btn_usuactualizar.setEnabled(true);
        btn_usueditar.setEnabled(false);
        btn_usueliminar.setEnabled(false);
        btn_usucalcelar.setEnabled(true);
        btn_usuexit.setEnabled(true);
        btn_examinar.setEnabled(true);
        
        iva_10.setEnabled(true);
        iva_5.setEnabled(true);
        iva_exenta.setEnabled(true);
        jDateChooser1.setEnabled(true);
       // metodoproducto.vaciar_produc();

    }//GEN-LAST:event_btn_usueditarActionPerformed

    private void btn_usuguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuguardarActionPerformed
//        String fechaObtenida1 = df.format(jDateChooser1.getDate());
//        pro_vencimineto.setText(fechaObtenida1);
        
        int aux  =  JOptionPane.showConfirmDialog(null, "Desea Guardar el Registro?","OBSERVACION", JOptionPane.YES_NO_OPTION);
        if(aux == JOptionPane.YES_OPTION){

            Conexion cc=new Conexion();
            Connection con=cc.conectar();
            try {

                String sql = "INSERT INTO productos ( pro_desc, pro_grupo, pro_preciocompra, pro_ganancia,pro_precioventa, pro_preciomayorista,"
                + " pro_stock, pro_stockmin, pro_proveedor, pro_obs,pro_lector,pro_suc,pro_imgurl,pro_id_lg, pro_ivaporcentaje) "
                + "values ('"+pro_desc.getText()+"','"+cmb_grupo.getSelectedItem()+"','"+pro_compra.getText()+"','"+pro_ganancia.getText()+"',"
                + "'"+pro_venta.getText()+"', '"+pro_mayorista.getText()+"','"+pro_stock.getText()+"','"+pro_minimo.getText()+"',"
                + "'"+cmb_prov1.getSelectedItem()+"','"+pro_obs.getText()+"','"+pro_lector.getText()+"','"+id_suc.getText()+"'," 
                + "'"+pro_img.getText()+"','"+pro_id.getText()+"','"+cargar_iva.getText()+"')";

                st = con.createStatement();
                st.execute(sql);
                metodoproducto.CARGAR_JTABLE_productos();
                metodoproducto.CARGAR_JTABLE_productos_2();
                
                MetodoVentanaP.cant_cliente();

                pro_desc.setEnabled(false);
                cmb_grupo.setEnabled(false);
                pro_compra.setEnabled(false);
                pro_venta.setEnabled(false);
                pro_mayorista.setEnabled(false);
                pro_stock.setEnabled(false);
                pro_minimo.setEnabled(false);
                pro_vencimineto.setEnabled(false);
                cmb_prov1.setEnabled(false);
                pro_obs.setEnabled(false);
                btn_examinar.setEnabled(false);
                jDateChooser1.setEnabled(false);
                
                pro_desc.setText("");
                pro_compra.setText("");
                pro_venta.setText("");
                pro_mayorista.setText("");
                pro_stock.setText("");
                pro_minimo.setText("");
                pro_vencimineto.setText("");
                pro_obs.setText("");
                pro_img.setText("");
                
                iva_10.setEnabled(false);
                iva_5.setEnabled(false);
                iva_exenta.setEnabled(false);
                
            btn_usuguardar.setVisible(true);
            btn_usunuevo.setEnabled(true);
            btn_usuguardar.setEnabled(false);
            btn_usuactualizar.setEnabled(false);
            btn_usueditar.setEnabled(false);
            btn_usueliminar.setEnabled(false);
            btn_usucalcelar.setEnabled(false);
            btn_usuexit.setEnabled(true);

            } catch (SQLException ex) {
                System.out.println("ver error " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "error" + ex);
            }
        }


        metodoproducto.actualizar_montototal();
        
        
        btn_usunuevo.requestFocus();
        
    }//GEN-LAST:event_btn_usuguardarActionPerformed

    private void btn_usunuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usunuevoActionPerformed
       
        
        int j;
        int cont=1;
        String num="";
        String c="";
        
        Conexion cc=new Conexion();
	Connection con=cc.conectar();
         String sql="select max(pro_id) from productos";
        //String SQL="select count(*) from factura";
        //String SQL="SELECT MAX(cod_clients) AS cod_emp FROM clients";
        //String SQL="SELECT @@identity AS ID";
        try {
         st = con.createStatement();
         ResultSet rs=st.executeQuery(sql);
            if(rs.next())
            {
                 c=rs.getString(1);
            }
 
            if(c==null){
                pro_id.setText("00000001");
            }
            else{
                 j=Integer.parseInt(c);
                 GenerarNumero gen= new GenerarNumero();
                 gen.generar(j);
                 pro_id.setText(gen.serie());
 
            }

        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        metodoproducto.cmb_proveedor();
        
        pro_desc.setEnabled(true);
        cmb_grupo.setEnabled(true);
        pro_compra.setEnabled(true);
        pro_venta.setEnabled(true);
        pro_mayorista.setEnabled(true);
        pro_stock.setEnabled(true);
        pro_minimo.setEnabled(true);
        pro_vencimineto.setEnabled(true);
        cmb_prov1.setEnabled(true);
        pro_obs.setEnabled(true);

        btn_usunuevo.setEnabled(false);
        btn_usuguardar.setEnabled(true);
        btn_usuactualizar.setEnabled(false);
        btn_usueditar.setEnabled(false);
        btn_usueliminar.setEnabled(false);
        btn_usucalcelar.setEnabled(true);
        btn_usuexit.setEnabled(true);
        btn_examinar.setEnabled(true);
        jDateChooser1.setEnabled(true);

        iva_10.setEnabled(true);
        iva_5.setEnabled(true);
        iva_exenta.setEnabled(true);
        
        metodoproducto.vaciar_produc();

        pro_ganancia.setText("0");
        pro_mayorista.setText("0");
        pro_venta.setText("0");
        pro_compra.setText("0");
        pro_stock.setText("0");
        pro_minimo.setText("0");
        
        pro_desc.requestFocus();
        
        
                        

               
        
    }//GEN-LAST:event_btn_usunuevoActionPerformed

    private void btn_usuactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuactualizarActionPerformed
//        String fechaObtenida2 = df.format(jDateChooser1.getDate());
//        pro_vencimineto.setText(fechaObtenida2);
        
        int aux  =  JOptionPane.showConfirmDialog(null, "Desea Actualizar los Datos","OBSERVACION", JOptionPane.YES_NO_OPTION);
        if(aux == JOptionPane.YES_OPTION){

            Conexion cc=new Conexion();
            Connection con=cc.conectar();
            try {

                String sql = "UPDATE productos SET  pro_desc = '"+pro_desc.getText()+"', pro_grupo = '"+cmb_grupo.getSelectedItem()+"',"
                + " pro_preciocompra= '"+pro_compra.getText()+"', pro_ganancia= '"+pro_ganancia.getText()+"',pro_precioventa ='"+pro_venta.getText()+"',"
                + " pro_preciomayorista= '"+pro_mayorista.getText()+"',pro_stock= '"+pro_stock.getText()+"',pro_stockmin= '"+pro_minimo.getText()+"',"
                + " pro_proveedor= '"+cmb_prov1.getSelectedItem()+"', pro_obs= '"+pro_obs.getText()+"',"
                + " pro_lector= '"+pro_lector.getText()+"', pro_suc= '"+id_suc.getText()+"', pro_imgurl= '"+pro_img.getText()+"', pro_id_lg= '"+pro_id.getText()+"', pro_ivaporcentaje= '"+cargar_iva.getText()+"'"
                + " where pro_id_lg = '"+pro_id.getText()+"'";

                st = con.createStatement();

                st.execute(sql);

                JOptionPane.showMessageDialog(null,  "Registro Actualizado", "Usuarios", JOptionPane.INFORMATION_MESSAGE);

                metodoproducto.CARGAR_JTABLE_productos();
                metodoproducto.CARGAR_JTABLE_productos_2();

                btn_usuguardar.setVisible(true);
                btn_usuactualizar.setVisible(false);

                btn_usunuevo.setEnabled(true);
                btn_usuguardar.setEnabled(false);
                btn_usuactualizar.setEnabled(false);
                btn_usueditar.setEnabled(false);
                btn_usueliminar.setEnabled(false);
                btn_usucalcelar.setEnabled(false);
                btn_usuexit.setEnabled(true);

                 metodoproducto.CARGAR_JTABLE_productos();
                pro_desc.setEnabled(false);
                cmb_grupo.setEnabled(false);
                pro_compra.setEnabled(false);
                pro_venta.setEnabled(false);
                pro_mayorista.setEnabled(false);
                pro_stock.setEnabled(false);
                pro_minimo.setEnabled(false);
                pro_vencimineto.setEnabled(false);
                cmb_prov1.setEnabled(false);
                pro_obs.setEnabled(false);
                btn_examinar.setEnabled(false);
                iva_10.setEnabled(false);
                iva_5.setEnabled(false);
                iva_exenta.setEnabled(false);

            } catch (SQLException ex) {
                System.out.println("ver error " + ex.getMessage());

            }
            
            
            metodoproducto.actualizar_montototal();
            
            
        }
        

    }//GEN-LAST:event_btn_usuactualizarActionPerformed

    private void pro_compraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pro_compraKeyTyped
              /////////////////////////////ingresa solo numeros
        char caracter = evt.getKeyChar();
      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
      {
         evt.consume();  // ignorar el evento de teclado
      }
    }//GEN-LAST:event_pro_compraKeyTyped

    private void pro_gananciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pro_gananciaKeyTyped
              /////////////////////////////ingresa solo numeros
        char caracter = evt.getKeyChar();
      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
      {
         evt.consume();  // ignorar el evento de teclado
      }
      /////////////////////////////////////////////////////////////////
      
    
      
    }//GEN-LAST:event_pro_gananciaKeyTyped

    private void pro_ventaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pro_ventaKeyTyped
             /////////////////////////////ingresa solo numeros
        char caracter = evt.getKeyChar();
      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
      {
         evt.consume();  // ignorar el evento de teclado
      }
      /////////////////////////////////////////////////////////////////
    }//GEN-LAST:event_pro_ventaKeyTyped

    private void pro_mayoristaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pro_mayoristaKeyTyped
               /////////////////////////////ingresa solo numeros
        char caracter = evt.getKeyChar();
      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
      {
         evt.consume();  // ignorar el evento de teclado
      }
      /////////////////////////////////////////////////////////////////
    }//GEN-LAST:event_pro_mayoristaKeyTyped

    private void pro_stockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pro_stockKeyTyped
               /////////////////////////////ingresa solo numeros
        char caracter = evt.getKeyChar();
      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
      {
         evt.consume();  // ignorar el evento de teclado
      }
      /////////////////////////////////////////////////////////////////
    }//GEN-LAST:event_pro_stockKeyTyped

    private void pro_minimoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pro_minimoKeyTyped
                /////////////////////////////ingresa solo numeros
        char caracter = evt.getKeyChar();
      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
      {
         evt.consume();  // ignorar el evento de teclado
      }
      /////////////////////////////////////////////////////////////////
    }//GEN-LAST:event_pro_minimoKeyTyped

    private void pro_gananciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pro_gananciaFocusLost
        try {
                    String caden1,caden3,cadenacaracter;
                    int enter1,enter3,resulado,resufinal;

                    caden1 = pro_compra.getText();
                    caden3 = pro_ganancia.getText();
    
                    enter1 = parseInt(caden1);
                    enter3 = parseInt(caden3);

                    resulado = (enter1 * enter3) / 100;
                    resufinal = enter1 + resulado;
                    cadenacaracter = Integer.toString(resufinal);
                    
                    pro_venta.setText(cadenacaracter);
        } catch (Exception e) {
            System.out.println("error" + e );
        }

    }//GEN-LAST:event_pro_gananciaFocusLost

    private void jTable_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_productosMouseClicked
                pro_desc.setEnabled(false);
                cmb_grupo.setEnabled(false);
                pro_compra.setEnabled(false);
                pro_venta.setEnabled(false);
                pro_mayorista.setEnabled(false);
                pro_stock.setEnabled(false);
                pro_minimo.setEnabled(false);
                pro_vencimineto.setEnabled(false);
                cmb_prov1.setEnabled(false);
                pro_obs.setEnabled(false); 
        
          btn_usunuevo.setEnabled(true);
          btn_usuguardar.setEnabled(false);
          btn_usuactualizar.setEnabled(false);
          btn_usueditar.setEnabled(true);
          btn_usueliminar.setEnabled(true);
          btn_usucalcelar.setEnabled(false);
          btn_usuexit.setEnabled(true);
        
        int n0 = jTable_productos.getSelectedRow();
        String id = jTable_productos.getValueAt(n0, 0).toString();
        pro_id.setText(id);
        
 		Conexion cc=new Conexion();
		Connection con=cc.conectar();;
        	try {

		String sql = "Select * from productos where pro_id = '"+pro_id.getText()+"'";
		//ResultSet resultado = st.executeQuery(sql);
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                        pro_id.setText(rs.getString("pro_id_lg"));
                        pro_desc.setText(rs.getString("pro_desc"));
                     // cmb_grupo.getSelectedItem(rs.get);
                        pro_ganancia.setText(rs.getString("pro_ganancia"));
                        pro_compra.setText(rs.getString("pro_preciocompra"));
                        pro_venta.setText(rs.getString("pro_precioventa"));
                        pro_mayorista.setText(rs.getString("pro_preciomayorista"));  
                        pro_stock.setText(rs.getString("pro_stock"));
                        pro_minimo.setText(rs.getString("pro_stockmin"));
                        pro_vencimineto.setText(rs.getString("pro_fechaven"));
                       // pro_proveedor.setSelectedItem(rs.getNString("pro_proveedor"));
                        pro_obs.setText(rs.getString("pro_obs"));
                        pro_lector.setText(rs.getString("pro_lector"));
                       // id.setText(rs.getString("pro_suc"));
                        pro_img.setText(rs.getString("pro_imgurl"));
                        pro_id.setText(rs.getString("pro_id_lg"));
              

                    }
			rs.close();
			st.close();
			con.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
    }//GEN-LAST:event_jTable_productosMouseClicked

    private void pro_descKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pro_descKeyTyped
        ////convertir a mayusculas
        char c6 = evt.getKeyChar(); 
        if(Character.isLowerCase(c6)){
            String cad = ("" + c6).toUpperCase();
            c6 = cad.charAt(0);
            evt.setKeyChar(c6);
        }
    }//GEN-LAST:event_pro_descKeyTyped

    private void pro_obsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pro_obsKeyTyped
        ////convertir a mayusculas
        char c6 = evt.getKeyChar(); 
        if(Character.isLowerCase(c6)){
            String cad = ("" + c6).toUpperCase();
            c6 = cad.charAt(0);
            evt.setKeyChar(c6);
        }
    }//GEN-LAST:event_pro_obsKeyTyped

    private void jTable_productosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_productosKeyReleased
      
    }//GEN-LAST:event_jTable_productosKeyReleased

    private void pro_compraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pro_compraFocusLost
/*                compra = Double.parseDouble(pro_compra.getText());
                DecimalFormat df = new DecimalFormat("#,###,###,###");
                String sumcompra = df.format(compra);
                pro_compra.setText("  "+sumcompra);*/
    }//GEN-LAST:event_pro_compraFocusLost

    private void pro_ventaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pro_ventaFocusLost
       
  /*              venta = Double.parseDouble(pro_venta.getText());
                DecimalFormat df = new DecimalFormat("#,###,###,###");
                String sumventa = df.format(venta);
                pro_venta.setText("  "+sumventa);*/
            try {
                    String caden1,caden3,cadenacaracter;
                    int enter1,enter3,resulado,resufinal;

                    caden1 = pro_compra.getText();
                    caden3 = pro_venta.getText();
    
                    enter1 = parseInt(caden1);
                    enter3 = parseInt(caden3);

                    resufinal = enter3 - enter1;
                    
                    resulado = (resufinal * 100) / enter1;
                   
                    cadenacaracter = Integer.toString(resulado);
                    
                    pro_ganancia.setText(cadenacaracter);
                    
        } catch (Exception e) {
            System.out.println("error" + e );
        }
  
  
    }//GEN-LAST:event_pro_ventaFocusLost

    private void pro_mayoristaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pro_mayoristaFocusLost
        
    /*         mayorista = Double.parseDouble(pro_mayorista.getText());
                DecimalFormat df = new DecimalFormat("#,###,###,###");
                String summayo = df.format(mayorista);
                pro_mayorista.setText("  "+summayo);*/
        
    }//GEN-LAST:event_pro_mayoristaFocusLost

    private void pro_lectorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pro_lectorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_pro_lectorKeyTyped

    private void jCheckBox_barraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_barraActionPerformed
        if(jCheckBox_barra.isSelected()){
           pro_lector.setEnabled(true);
          pro_lector.requestFocus();
       }else{
           pro_lector.setEnabled(false);
       
       }
    }//GEN-LAST:event_jCheckBox_barraActionPerformed

    private void btn_usuexit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuexit1ActionPerformed
        dispose();
    }//GEN-LAST:event_btn_usuexit1ActionPerformed

    private void btn_examinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_examinarActionPerformed
        JFileChooser filechoose = new JFileChooser();
        filechoose.setFileFilter(filter);
        int opcion = filechoose.showOpenDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            //OBTENER EL NOMBRE DEL ARCHIVO SELECCIONADO
            String nombre_archivo = filechoose.getSelectedFile().getName();
            //OBTENER LA RUTA DEL ARCHIVO SELECCIONADO
            String ruta = filechoose.getSelectedFile().getPath();
            //seteamos el nombre del archivo
           // nombre_logo.setText(nombre_archivo);
            //seteamos la ruta
            pro_img.setText(ruta);    
            System.out.println(ruta);
            
   //         milogo.setIcon(new ImageIcon(ruta));

   /*     ImageIcon fot = new ImageIcon(ruta);
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(milogo.getWidth(), milogo.getHeight(), Image.SCALE_DEFAULT));
        milogo.setIcon(icono);
        this.repaint();*/
   
        }
    }//GEN-LAST:event_btn_examinarActionPerformed

    private void jtable_producto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_producto2MouseClicked
        
                ///////////////////////////////////////////////
                int n0 = jtable_producto2.getSelectedRow();
                String id = jtable_producto2.getValueAt(n0, 0).toString();
                id_var.setText(id);
                
                Conexion cc=new Conexion();
		Connection con=cc.conectar();;
        	try {
		
		String sql = "Select * from productos where pro_id = '"+id_var.getText()+"'";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {

                         url_milogo.setText(rs.getString("pro_imgurl"));
                         descri_label.setText(rs.getString("pro_desc"));
                         cant_label.setText(rs.getString("pro_stock"));
                         

                         ///////////////////////////////////////////////mostrar imagenes en pantalla
                        String url = (rs.getString("pro_imgurl"));
                        ImageIcon fot = new ImageIcon(url);
                        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(img_label.getWidth(), img_label.getHeight(), Image.SCALE_DEFAULT));
                        img_label.setIcon(icono);
                        img_label.repaint();

                    }
			rs.close();
			st.close();
			con.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
        ////////////////////////////////////////////////
    }//GEN-LAST:event_jtable_producto2MouseClicked

    private void jcheck_todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheck_todosActionPerformed
       
        if(jcheck_todos.isSelected()){
           metodoproducto.CARGAR_JTABLE_productos_2();
           this.jcheck_sinstock.setSelected(false);
           constock.setSelected(false);
           
           Conexion cc=new Conexion();
		Connection con=cc.conectar();
        	try {
		String sql = "Select count(*) from productos ";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                        cant_pro.setText(rs.getString("count"));
                      
                    }
			/*rs.close();
			st.close();
			con.close();*/
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
                }
                

        	try {
		String sql = "Select sum(pro_totalvta) from productos ";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                        lavel_total.setText(rs.getString("sum"));
                      
                    }
			/*rs.close();
			st.close();
			con.close();*/
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
                }
           
           
       //////////////////////////////////////////////////
            
        String cadena1;
        int entero1;
        cadena1 = lavel_total.getText();
        entero1 = parseInt(cadena1);  

        DecimalFormat formatea = new DecimalFormat("###,###,###,###.##");

        lavel_total.setText(formatea.format(entero1));
            
            //////////////////////////////////////////////////////
                
       }else{ 
           //this.jcheck_sinstock.setSelected(true);
       } 
    }//GEN-LAST:event_jcheck_todosActionPerformed

    private void jcheck_sinstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheck_sinstockActionPerformed
        if(jcheck_sinstock.isSelected()){
            
           metodoproducto.CARGAR_JTABLE_productos_sinstock();
           
           Conexion cc=new Conexion();
		Connection con=cc.conectar();
        	try {
		String sql = "Select count(*) from productos where pro_stock <= 0";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                        cant_pro.setText(rs.getString("count"));
                      
                    }
			/*rs.close();
			st.close();
			con.close();*/
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
                }
                

        	try {
		String sql = "Select sum(pro_totalvta) from productos where pro_stock <= 0 ";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                        lavel_total.setText(rs.getString("sum"));
                      
                    }
			/*rs.close();
			st.close();
			con.close();*/
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
                }
           
            this.jcheck_todos.setSelected(false);
            constock.setSelected(false);
            
            
                        //////////////////////////////////////////////////
            
                    String cadena1;
        int entero1;
        cadena1 = lavel_total.getText();
        entero1 = parseInt(cadena1);  

        DecimalFormat formatea = new DecimalFormat("###,###,###,###.##");

        lavel_total.setText(formatea.format(entero1));
            
            //////////////////////////////////////////////////////
            
            
            
        }else{
            
                Conexion cc=new Conexion();
		Connection con=cc.conectar();
        	try {
		String sql = "Select count(*) from productos ";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                        cant_pro.setText(rs.getString("count"));
                      
                    }
			/*rs.close();
			st.close();
			con.close();*/
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
                }
                

        	try {
		String sql = "Select sum(pro_precioventa) from productos ";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                        lavel_total.setText(rs.getString("sum"));
                      
                    }
			/*rs.close();
			st.close();
			con.close();*/
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
                }
                   
            
        this.jcheck_todos.setSelected(true);
        
        
               //////////////////////////////////////////////////
            
        String cadena1;
        int entero1;
        cadena1 = lavel_total.getText();
        entero1 = parseInt(cadena1);  

        DecimalFormat formatea = new DecimalFormat("###,###,###,###.##");

        lavel_total.setText(formatea.format(entero1));
            
            //////////////////////////////////////////////////////
        
        
        }
    }//GEN-LAST:event_jcheck_sinstockActionPerformed

    private void pro_gananciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_gananciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pro_gananciaActionPerformed

    private void pro_bus2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pro_bus2KeyTyped
        metodoproducto.buscarproducto();
    }//GEN-LAST:event_pro_bus2KeyTyped

    private void pro_bus2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pro_bus2KeyReleased
       metodos.convertiraMayusculasEnJtextfield(pro_bus2);
    }//GEN-LAST:event_pro_bus2KeyReleased

    private void iva_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iva_10ActionPerformed
       if(iva_10.isSelected()){
           iva_5.setSelected(false);
           iva_exenta.setSelected(false);
           
           cargar_iva.setText("10");
       }
    }//GEN-LAST:event_iva_10ActionPerformed

    private void iva_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iva_5ActionPerformed
        if(iva_5.isSelected()){
           iva_10.setSelected(false);
           iva_exenta.setSelected(false);
           
           cargar_iva.setText("5");
       }
    }//GEN-LAST:event_iva_5ActionPerformed

    private void iva_exentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iva_exentaActionPerformed
        if(iva_exenta.isSelected()){
           iva_10.setSelected(false);
           iva_5.setSelected(false);
           
           cargar_iva.setText("1");
       }
    }//GEN-LAST:event_iva_exentaActionPerformed

    private void pro_bus2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pro_bus2FocusLost
        btn_usuguardar.requestFocus();
        
        /////////////////////////
  

     
        //////////////////////
        
  
    }//GEN-LAST:event_pro_bus2FocusLost

    private void btn_usuguardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_usuguardarKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             btn_usuguardar.doClick();
            }
            
            
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }
    }//GEN-LAST:event_btn_usuguardarKeyPressed

    private void btn_usunuevoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_usunuevoKeyPressed
            
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             btn_usunuevo.doClick();
            }
        
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }
                    
    }//GEN-LAST:event_btn_usunuevoKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }
        
    }//GEN-LAST:event_formKeyPressed

    private void pro_descKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pro_descKeyPressed
            
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }
    }//GEN-LAST:event_pro_descKeyPressed

    private void cmb_grupoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_grupoKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }
    }//GEN-LAST:event_cmb_grupoKeyPressed

    private void pro_compraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pro_compraKeyPressed
           if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }
    }//GEN-LAST:event_pro_compraKeyPressed

    private void jCheckgananciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckgananciaKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }
    }//GEN-LAST:event_jCheckgananciaKeyPressed

    private void pro_gananciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pro_gananciaKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }
    }//GEN-LAST:event_pro_gananciaKeyPressed

    private void pro_ventaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pro_ventaKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }
    }//GEN-LAST:event_pro_ventaKeyPressed

    private void pro_mayoristaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pro_mayoristaKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }
    }//GEN-LAST:event_pro_mayoristaKeyPressed

    private void pro_stockKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pro_stockKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }
    }//GEN-LAST:event_pro_stockKeyPressed

    private void pro_minimoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pro_minimoKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }
    }//GEN-LAST:event_pro_minimoKeyPressed

    private void jDateChooser1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser1KeyPressed
           if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }
    }//GEN-LAST:event_jDateChooser1KeyPressed

    private void cmb_prov1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_prov1KeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }
    }//GEN-LAST:event_cmb_prov1KeyPressed

    private void btn_examinarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_examinarKeyPressed
                   if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }
    }//GEN-LAST:event_btn_examinarKeyPressed

    private void pro_obsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pro_obsKeyPressed
                  if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }
    }//GEN-LAST:event_pro_obsKeyPressed

    private void jTable_productosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_productosKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }
    }//GEN-LAST:event_jTable_productosKeyPressed

    private void btn_usueditarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_usueditarKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }
    }//GEN-LAST:event_btn_usueditarKeyPressed

    private void btn_usucalcelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_usucalcelarKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }
    }//GEN-LAST:event_btn_usucalcelarKeyPressed

    private void btn_usueliminarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_usueliminarKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }
    }//GEN-LAST:event_btn_usueliminarKeyPressed

    private void btn_usuexitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_usuexitKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }
    }//GEN-LAST:event_btn_usuexitKeyPressed

    private void jCheckBox_barraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckBox_barraKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }
    }//GEN-LAST:event_jCheckBox_barraKeyPressed

    private void pro_lectorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pro_lectorKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }
    }//GEN-LAST:event_pro_lectorKeyPressed

    private void constockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_constockActionPerformed
        if(constock.isSelected()){
           metodoproducto.CARGAR_JTABLE_productos_constock();
           this.jcheck_sinstock.setSelected(false);
           jcheck_todos.setSelected(false);
           
                Conexion cc=new Conexion();
		Connection con=cc.conectar();
        	try {
		String sql = "Select count(*) from productos where pro_stock >= 1";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                        cant_pro.setText(rs.getString("count"));
                      
                    }
			/*rs.close();
			st.close();
			con.close();*/
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
                }
                

        	try {
		String sql = "Select sum(pro_totalvta) from productos where pro_stock >= 1 ";
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                        lavel_total.setText(rs.getString("sum"));
                      
                    }
			/*rs.close();
			st.close();
			con.close();*/
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
                }
           
            this.jcheck_todos.setSelected(false);
            constock.setSelected(true);
           
           
            //////////////////////////////////////////////////
            
                    String cadena1;
        int entero1;
        cadena1 = lavel_total.getText();
        entero1 = parseInt(cadena1);  

        DecimalFormat formatea = new DecimalFormat("###,###,###,###.##");

        lavel_total.setText(formatea.format(entero1));
            
            //////////////////////////////////////////////////////
            
            
       }else{ 
           this.jcheck_todos.setSelected(true);
       } 
    }//GEN-LAST:event_constockActionPerformed

    private void jtable_producto2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtable_producto2KeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit1.doClick();
            }
            
            if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
                    emergente_producto emergente = new emergente_producto();
                    emergente.setVisible(true);
            }
            
    }//GEN-LAST:event_jtable_producto2KeyPressed

    private void jcheck_todosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcheck_todosKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit1.doClick();
            }
    }//GEN-LAST:event_jcheck_todosKeyPressed

    private void jcheck_sinstockKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcheck_sinstockKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit1.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_jcheck_sinstockKeyPressed

    private void constockKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_constockKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit1.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_constockKeyPressed

    private void jcheck_proveeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcheck_proveeKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit1.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_jcheck_proveeKeyPressed

    private void jcheck_proveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheck_proveeActionPerformed
                Conexion cc=new Conexion();
		Connection con=cc.conectar();

                String prov="select * from proveedores where pro_empresa = '"+jcheck_provee.getSelectedItem()+"'";
                try {
                //consulta_vta.cmb_suc.removeAllItems();
                st = con.createStatement();
                ResultSet rs=st.executeQuery(prov);

			while(rs.next()){

                                id_proveedor.setText(rs.getString("pro_empresa"));
			}
	
	} catch (SQLException e1) {
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null," Ocurrio un problema en la SD " + e1.getMessage());
	}
                
           metodoproducto.CARGAR_JTABLE_productos_prove();     
    }//GEN-LAST:event_jcheck_proveeActionPerformed

    private void btn_usuactualizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_usuactualizarKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit.doClick();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_usuactualizarKeyPressed

    private void url_milogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_url_milogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_url_milogoActionPerformed

    private void jtable_producto2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtable_producto2KeyReleased
                if ((evt.getKeyCode() == KeyEvent.VK_DOWN) || (evt.getKeyCode() == KeyEvent.VK_UP)) {
                int filaSeleccionada = this.jtable_producto2.getSelectedRow();//Identificamos que fila ha sido seleccionada

                try {
                    this.id_var.setText(jtable_producto2.getValueAt(filaSeleccionada, 0).toString());
                    this.descri_label.setText(jtable_producto2.getValueAt(filaSeleccionada, 1).toString());
                    this.cant_label.setText(jtable_producto2.getValueAt(filaSeleccionada, 3).toString());
                    
                    
                    //this.cli_direccion.setText(jtable_producto2.getValueAt(filaSeleccionada, 2).toString());
                    //this.cli_direccion.setSelectedItem(jTable_cliente.getValueAt(filaSeleccionada, 2).toString());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al leer datos de la tabla", "Error", JOptionPane.WARNING_MESSAGE);
                }
                
                
 
                
                
        }
    }//GEN-LAST:event_jtable_producto2KeyReleased

    private void bus_txt3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bus_txt3KeyPressed
           if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
             btn_usuexit1.doClick();
            }
    }//GEN-LAST:event_bus_txt3KeyPressed

    private void bus_txt3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bus_txt3KeyReleased
        metodos.convertiraMayusculasEnJtextfield(bus_txt3);
    }//GEN-LAST:event_bus_txt3KeyReleased

    private void bus_txt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bus_txt3KeyTyped
         metodoproducto.buscarproducto2();
    }//GEN-LAST:event_bus_txt3KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            obj = new clsExportarExcel();
            obj.exportarExcel(jtable_producto2);
        } catch (IOException ex) {
            //Logger.getLogger(JFExportar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productos().setVisible(true);
            }
        });
        

        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_examinar;
    private javax.swing.JButton btn_usuactualizar;
    private javax.swing.JButton btn_usucalcelar;
    private javax.swing.JButton btn_usueditar;
    private javax.swing.JButton btn_usueliminar;
    private javax.swing.JButton btn_usuexit;
    private javax.swing.JButton btn_usuexit1;
    private javax.swing.JButton btn_usuguardar;
    private javax.swing.JButton btn_usunuevo;
    public static org.jdesktop.swingx.JXSearchField bus_txt3;
    private javax.swing.JLabel cant_label;
    private javax.swing.JLabel cant_label2;
    private javax.swing.JLabel cant_pro;
    private javax.swing.JLabel cargar_iva;
    public static javax.swing.JComboBox<String> cmb_grupo;
    public static javax.swing.JComboBox<String> cmb_prov1;
    private javax.swing.JCheckBox constock;
    public static javax.swing.JLabel descri;
    private javax.swing.JLabel descri_label;
    public static javax.swing.JLabel id_proveedor;
    public static javax.swing.JLabel id_suc;
    public static javax.swing.JTextField id_var;
    private javax.swing.JLabel img_label;
    private javax.swing.JCheckBox iva_10;
    private javax.swing.JCheckBox iva_5;
    private javax.swing.JCheckBox iva_exenta;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox_barra;
    private javax.swing.JCheckBox jCheckganancia;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTable jTable_productos;
    public static javax.swing.JComboBox<String> jcheck_provee;
    private javax.swing.JCheckBox jcheck_sinstock;
    public static javax.swing.JComboBox<String> jcheck_sucu;
    public static javax.swing.JCheckBox jcheck_todos;
    public static javax.swing.JTable jtable_producto2;
    private javax.swing.JTextField lavel_total;
    public static javax.swing.JTextField pro_bus2;
    public static javax.swing.JTextField pro_compra;
    public static javax.swing.JTextField pro_desc;
    public static javax.swing.JTextField pro_ganancia;
    public static javax.swing.JTextField pro_id;
    public static javax.swing.JTextField pro_img;
    public static javax.swing.JTextField pro_lector;
    public static javax.swing.JTextField pro_mayorista;
    public static javax.swing.JTextField pro_minimo;
    public static javax.swing.JTextField pro_obs;
    public static javax.swing.JTextField pro_stock;
    public static javax.swing.JTextField pro_vencimineto;
    public static javax.swing.JTextField pro_venta;
    private javax.swing.JTextField url_milogo;
    // End of variables declaration//GEN-END:variables
}
