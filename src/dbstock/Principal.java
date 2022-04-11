/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;


import static dbstock.metodos.st;
import static dbstock.productos.jTabbedPane1;
import static dbstock.productos.bus_txt3;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Derlis
 */
public class Principal extends javax.swing.JFrame {

    Statement st;
    Connection con;

    
    
    
    public Principal() {
        initComponents();
        
        this.setLocationRelativeTo(null);//centra el formulario
        this.setTitle("Principal");
        
        //jDesktopPane1.setBorder(new ImagenFondo());
        //this.setExtendedState(Principal.MAXIMIZED_BOTH);
        //this.setExtendedState(MAXIMIZED_BOTH);
        
        //MOSTRAR FECHA Y HORA DEL SISTEMA
        Calendar Cal= Calendar.getInstance();
        String hora=Cal.get(Cal.HOUR_OF_DAY)+":"+Cal.get(Cal.MINUTE)+":"+Cal.get(Cal.SECOND);
        String fecha= Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+"/"+Cal.get(Cal.YEAR);
        fecha_ini.setText(fecha);
        hora_ini.setText(hora);
        
        ////cambiar icono del jframe
        setIconImage(new ImageIcon(getClass().getResource("icono.png")).getImage());
        
        metodos.estirardatos_cotizacion_principal();
        metodos.estirardatos_nombre();
        

        
        metodos.estirardatos_privilegios_principal();
        
        MetodoVentanaP.cant_cliente();
   
        
        contado_credito.setVisible(false);
        
           ////////ajustar imagen se puede colocar en boton                                       
    /*    ImageIcon imgIcon = new ImageIcon(getClass().getResource("imagen_menu2.png"));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(menu_label.getWidth(),
        menu_label.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        menu_label.setIcon(iconoEscalado);
        /////////fin de ajustar imagen*/

  
        zocalo.setVisible(false);

        
        Timer tiempo = new Timer(100, new Principal.horass());
        tiempo.start();

        if(base_datos_lb.getText().equals("1")){
            base_datos.setSelected(true);
            jMenu_basedatos.setVisible(true);
        }else{
            base_datos.setSelected(false);
            jMenu_basedatos.setVisible(false);     
        }
        
        if(adm_privilegios.getText().equals("1")){
            adm_usuarios.setSelected(true);
            jMenu_usuario.setVisible(true);
        }else{
            adm_usuarios.setSelected(false);
            jMenu_usuario.setVisible(false);
        }
        
        if(privi_usuari.getText().equals("1")){
            pri_usuarios.setSelected(true);
            jMenu_privilegios.setVisible(true);
        }else{
            pri_usuarios.setSelected(false);
            jMenu_privilegios.setVisible(false);
        }
        
        if(apariencia_1.getText().equals("1")){
            apariencia.setSelected(true);
            jMenu_apariencia.setVisible(true);
        }else{
            apariencia.setSelected(false);
            jMenu_apariencia.setVisible(false);
        }
        
        if(config_1.getText().equals("1")){
            configuracion.setSelected(true);
            jMenuconfig.setVisible(true);
        }else{
            configuracion.setSelected(false);
            jMenuconfig.setVisible(false);
        }
        
        if(sucu_1.getText().equals("1")){
            sucursal1.setSelected(true);
            jMenu_sucursal.setVisible(true);
        }else{
            sucursal1.setSelected(false);
            jMenu_sucursal.setVisible(false);
        }
        
        if(proveedores_1.getText().equals("1")){
            proveedores.setSelected(true);
            jMenu_proveedor.setVisible(true);
        }else{
            proveedores.setSelected(false);
            jMenu_proveedor.setVisible(false);
        }
        
        if(producto_1.getText().equals("1")){
            productos.setSelected(true);
            jMenu_productos.setVisible(true);
        }else{
            productos.setSelected(false);
            jMenu_productos.setVisible(false);
        }
        
        if(add_stock_1.getText().equals("1")){
            add_stock.setSelected(true);
            jMenu_addstock.setVisible(true);
        }else{
            add_stock.setSelected(false);
            jMenu_addstock.setVisible(false);
        }

        if(add_caja_1.getText().equals("1")){
            add_caja.setSelected(true);
            jMenu_addcaja.setVisible(true);
        }else{
            add_caja.setSelected(false);
            jMenu_addcaja.setVisible(false);
        }
        
        if(add_cliente_1.getText().equals("1")){
            add_cliente.setSelected(true);
            jMenu_cliente.setVisible(true);
            btn_cliente.setEnabled(true);
        }else{
            add_cliente.setSelected(false);
            jMenu_cliente.setVisible(false);
            btn_cliente.setEnabled(false);
        }
        
        if(grupo_pro_1.getText().equals("1")){
            grupo_pro.setSelected(true);
            jMenu_grupopro.setVisible(true);
        }else{
            grupo_pro.setSelected(false);
            jMenu_grupopro.setVisible(false);
        }
        
        if(cotiza.getText().equals("1")){
            cotizaciones.setSelected(true);
            jMenucotizar.setVisible(true);
        }else{
            cotizaciones.setSelected(false);
            jMenucotizar.setVisible(false);
        }
             
        if(compras_1.getText().equals("1")){
            compras.setSelected(true);
            jMenu_compras.setVisible(true);
            btn_compras.setEnabled(true);
        }else{
            compras.setSelected(false);
            jMenu_compras.setVisible(false);
            btn_compras.setEnabled(false);
        }
        
        if(ped_realiz.getText().equals("1")){
            ped_realizados.setSelected(true);
            jMenu_pedrealizado.setVisible(true);
        }else{
            ped_realizados.setSelected(false);
            jMenu_pedrealizado.setVisible(false);
        }
        
        if(confirmar_entre.getText().equals("1")){
            confirmar_entrega.setSelected(true);
            jMenu_confirm.setVisible(true);
        }else{
            confirmar_entrega.setSelected(false);
            jMenu_confirm.setVisible(false);
        }
        
        if(vta_lb.getText().equals("1")){
            vta_1.setSelected(true);
            jMenu_vta.setVisible(true);
            btn_venta.setEnabled(true);
        }else{
            vta_1.setSelected(false);
            jMenu_vta.setVisible(false);
            btn_venta.setEnabled(false);
        }
        
        if(presupu.getText().equals("1")){
            presupuesto.setSelected(true);
            jMenu_presupuesto.setEnabled(true);
        }else{
            presupuesto.setSelected(false);
            jMenu_presupuesto.setVisible(false);
        }
        
        if(cons_vta.getText().equals("1")){
            cons_ventas.setSelected(true);
            jMenu_consultavta.setVisible(true);
            btn_consulta.setEnabled(true);
        }else{
            cons_ventas.setSelected(false);
            jMenu_consultavta.setVisible(false);
            btn_consulta.setEnabled(false);
        }
        
        if(cons_presu.getText().equals("1")){
            consu_presu.setSelected(true);
            jMenu_consultapresupu.setVisible(true);
        }else{
            consu_presu.setSelected(false);
            jMenu_consultapresupu.setVisible(false);
        }
        
        if(cons_clie.getText().equals("1")){
            consu_cliente.setSelected(true);
            jMenu_consulta_cli.setVisible(true);
        }else{
            consu_cliente.setSelected(false);
            jMenu_consulta_cli.setVisible(false);
        }
        
        if(cons_vende.getText().equals("1")){
            consu_vendedor.setSelected(true);
            jMenu_consu_vendedor.setVisible(true);
        }else{
            consu_vendedor.setSelected(false);
            jMenu_consu_vendedor.setVisible(false);
        }
        
        if(saldo_cja.getText().equals("1")){
            saldo_caja.setSelected(true);
            jMenu_saldo.setVisible(true);
            btn_productos.setEnabled(true);
        }else{
            saldo_caja.setSelected(false);
            jMenu_saldo.setVisible(false);
            btn_productos.setEnabled(false);
        }
        
        if(movimi.getText().equals("1")){
            mov_caja.setSelected(true);
            jMenu_movi.setVisible(true);
        }else{
            mov_caja.setSelected(false);
            jMenu_movi.setVisible(false);
        }
        
        if(cobz.getText().equals("1")){
            cobranza.setSelected(true);
            jMenu_cobranza.setEnabled(true);
            btn_cobranza.setVisible(true);
        }else{
            cobranza.setSelected(false);
            jMenu_cobranza.setEnabled(false);
            btn_cobranza.setVisible(false);
        }
        
        if(gtos.getText().equals("1")){
            gastos.setSelected(true);
            jMenu_gastos.setVisible(true);
        }else{
            gastos.setSelected(false);
            jMenu_gastos.setVisible(false);
        }
        
        if(ingres.getText().equals("1")){
            ingresos.setSelected(true);
            jMenu_ingreso.setVisible(true);
        }else{
            ingresos.setSelected(false);
            jMenu_ingreso.setVisible(false);
        }
           
        if(listad.getText().equals("1")){
            listado.setSelected(true);
            jMenu_listado.setVisible(true);
        }else{
            listado.setSelected(false);
            jMenu_listado.setVisible(false);
        }
        
        
        if(cierre_pri_label.getText().equals("1")){
            cierrecaja_pri.setSelected(true);
            //cierrecaja_menu.setEnabled(true);
            cierrecaja_menu.setVisible(true);
        }else{
            
            cierrecaja_pri.setSelected(false);
            //cierrecaja_menu.setEnabled(false);
            cierrecaja_menu.setVisible(false);
        }
        
        ////////////////////////////////////////////////////////////////////////////////////////
        ///label
        base_datos_lb.setVisible(false);
        adm_privilegios.setVisible(false);
        privi_usuari.setVisible(false);
        apariencia_1.setVisible(false);
        config_1.setVisible(false);
        sucu_1.setVisible(false);
        vta_lb.setVisible(false);
        presupu.setVisible(false);
        proveedores_1.setVisible(false);
        producto_1.setVisible(false);
        add_stock_1.setVisible(false);
        add_caja_1.setVisible(false);
        add_cliente_1.setVisible(false);
        grupo_pro_1.setVisible(false);
        cotiza.setVisible(false);
        cons_vta.setVisible(false);
        cons_presu.setVisible(false);
        cons_clie.setVisible(false);
        cons_vende.setVisible(false);
        compras_1.setVisible(false);
        ped_realiz.setVisible(false);
        confirmar_entre.setVisible(false);
        saldo_cja.setVisible(false);
        movimi.setVisible(false);
        cobz.setVisible(false);
        gtos.setVisible(false);
        ingres.setVisible(false);
        listad.setVisible(false);
        cierrecaja_pri.setVisible(false);
        cierre_pri_label.setVisible(false);
        //-----------------------------------------------------
        sistema.setVisible(false);
        base_datos.setVisible(false);
        adm_usuarios.setVisible(false);
        pri_usuarios.setVisible(false);
        apariencia.setVisible(false);
        configuracion.setVisible(false);
        sucursal1.setVisible(false);
        ventas.setVisible(false);
        vta_1.setVisible(false);
        presupuesto.setVisible(false);
        registros.setVisible(false);
        proveedores.setVisible(false);
        productos.setVisible(false);
        add_stock.setVisible(false);
        add_caja.setVisible(false);
        add_cliente.setVisible(false);
        grupo_pro.setVisible(false);
        cotizaciones.setVisible(false);
        cpa.setVisible(false);
        compras.setVisible(false);
        ped_realizados.setVisible(false);
        confirmar_entrega.setVisible(false);
        consultas.setVisible(false);
        cons_ventas.setVisible(false);
        consu_presu.setVisible(false);
        consu_cliente.setVisible(false);
        consu_vendedor.setVisible(false);
        saldo_caja.setVisible(false);
        mov_caja.setVisible(false);
        cobranza.setVisible(false);
        gastos.setVisible(false);
        ingresos.setVisible(false);
        informe.setVisible(false);
        listado.setVisible(false);

        Principal.licencia_porvencer.setVisible(false);
        Principal.licencia_porvencer1.setVisible(false);
        Principal.licencia_porvencer2.setVisible(false);
        Principal.btn_licencia.setVisible(false);     
        
        ////////////////////////////////////////////////////////////////////////////////////////
        
    }

    private void setSelectedIndex(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        class horass implements ActionListener{
         
        public void actionPerformed(ActionEvent e){
            Date sisHora = new Date();
            String pmAm = "hh:mm:ss a";
            SimpleDateFormat format = new SimpleDateFormat(pmAm);
            Calendar hoy = Calendar.getInstance();
            hora_ini.setText(String.format(format.format(sisHora),hoy));
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

        jMenu1 = new javax.swing.JMenu();
        contado_credito = new javax.swing.JInternalFrame();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        btn_venta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nom_empresa = new javax.swing.JLabel();
        pa = new javax.swing.JLabel();
        rs = new javax.swing.JLabel();
        us = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        usuario_ini = new javax.swing.JLabel();
        privilegio_ini = new javax.swing.JLabel();
        fecha_ini = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        logo_pri = new javax.swing.JLabel();
        hora_ini = new javax.swing.JLabel();
        sucursal = new javax.swing.JLabel();
        sucursal_id = new javax.swing.JLabel();
        zocalo = new javax.swing.JLabel();
        sistema = new javax.swing.JCheckBox();
        base_datos_lb = new javax.swing.JLabel();
        base_datos = new javax.swing.JCheckBox();
        adm_usuarios = new javax.swing.JCheckBox();
        adm_privilegios = new javax.swing.JLabel();
        pri_usuarios = new javax.swing.JCheckBox();
        privi_usuari = new javax.swing.JLabel();
        apariencia_1 = new javax.swing.JLabel();
        apariencia = new javax.swing.JCheckBox();
        configuracion = new javax.swing.JCheckBox();
        config_1 = new javax.swing.JLabel();
        sucu_1 = new javax.swing.JLabel();
        sucursal1 = new javax.swing.JCheckBox();
        registros = new javax.swing.JCheckBox();
        proveedores_1 = new javax.swing.JLabel();
        proveedores = new javax.swing.JCheckBox();
        productos = new javax.swing.JCheckBox();
        producto_1 = new javax.swing.JLabel();
        add_stock_1 = new javax.swing.JLabel();
        add_stock = new javax.swing.JCheckBox();
        add_caja = new javax.swing.JCheckBox();
        add_caja_1 = new javax.swing.JLabel();
        add_cliente_1 = new javax.swing.JLabel();
        add_cliente = new javax.swing.JCheckBox();
        grupo_pro = new javax.swing.JCheckBox();
        grupo_pro_1 = new javax.swing.JLabel();
        cotiza = new javax.swing.JLabel();
        cotizaciones = new javax.swing.JCheckBox();
        cpa = new javax.swing.JCheckBox();
        compras_1 = new javax.swing.JLabel();
        compras = new javax.swing.JCheckBox();
        ped_realizados = new javax.swing.JCheckBox();
        ped_realiz = new javax.swing.JLabel();
        confirmar_entrega = new javax.swing.JCheckBox();
        confirmar_entre = new javax.swing.JLabel();
        ventas = new javax.swing.JCheckBox();
        vta_lb = new javax.swing.JLabel();
        vta_1 = new javax.swing.JCheckBox();
        presupuesto = new javax.swing.JCheckBox();
        presupu = new javax.swing.JLabel();
        consultas = new javax.swing.JCheckBox();
        cons_ventas = new javax.swing.JCheckBox();
        cons_vta = new javax.swing.JLabel();
        cons_presu = new javax.swing.JLabel();
        consu_presu = new javax.swing.JCheckBox();
        consu_cliente = new javax.swing.JCheckBox();
        cons_clie = new javax.swing.JLabel();
        cons_vende = new javax.swing.JLabel();
        consu_vendedor = new javax.swing.JCheckBox();
        movimi = new javax.swing.JLabel();
        saldo_caja = new javax.swing.JCheckBox();
        saldo_cja = new javax.swing.JLabel();
        mov_caja = new javax.swing.JCheckBox();
        cobranza = new javax.swing.JCheckBox();
        cobz = new javax.swing.JLabel();
        gtos = new javax.swing.JLabel();
        gastos = new javax.swing.JCheckBox();
        ingresos = new javax.swing.JCheckBox();
        ingres = new javax.swing.JLabel();
        informe = new javax.swing.JCheckBox();
        listad = new javax.swing.JLabel();
        listado = new javax.swing.JCheckBox();
        materialButtomRectangle1 = new principal.MaterialButtomRectangle();
        materialButtomRectangle2 = new principal.MaterialButtomRectangle();
        materialButtomRectangle3 = new principal.MaterialButtomRectangle();
        materialButtomRectangle4 = new principal.MaterialButtomRectangle();
        jPanel1 = new javax.swing.JPanel();
        btn_productos = new javax.swing.JButton();
        btn_consulta = new javax.swing.JButton();
        btn_cliente = new javax.swing.JButton();
        btn_cobranza = new javax.swing.JButton();
        btn_compras = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        cierrecaja_pri = new javax.swing.JCheckBox();
        cierre_pri_label = new javax.swing.JLabel();
        licencia_porvencer = new javax.swing.JLabel();
        licencia_porvencer1 = new javax.swing.JLabel();
        licencia_porvencer2 = new javax.swing.JLabel();
        btn_licencia = new javax.swing.JButton();
        cant_cli = new javax.swing.JLabel();
        cant_contado = new javax.swing.JLabel();
        cant_cr = new javax.swing.JLabel();
        cant_producto = new javax.swing.JLabel();
        cant_compra = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jmenuprincipal = new javax.swing.JMenuBar();
        jMenu_conf = new javax.swing.JMenu();
        jMenu_basedatos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu_usuario = new javax.swing.JMenuItem();
        jMenu_privilegios = new javax.swing.JMenuItem();
        jMenu_apariencia = new javax.swing.JMenuItem();
        jMenuconfig = new javax.swing.JMenuItem();
        jMenu_sucursal = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu_registro = new javax.swing.JMenu();
        jMenu_proveedor = new javax.swing.JMenuItem();
        jMenu_productos = new javax.swing.JMenuItem();
        jMenu_addstock = new javax.swing.JMenuItem();
        jMenu_addcaja = new javax.swing.JMenuItem();
        jMenu_cliente = new javax.swing.JMenuItem();
        jMenu_grupopro = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenucotizar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu_compras = new javax.swing.JMenuItem();
        jMenu_pedrealizado = new javax.swing.JMenuItem();
        jMenu_confirm = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu_vta = new javax.swing.JMenu();
        contado = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu_presupuesto = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenu_consultavta = new javax.swing.JMenuItem();
        jMenu_consultapresupu = new javax.swing.JMenuItem();
        jMenu_consulta_cli = new javax.swing.JMenuItem();
        jMenu_consu_vendedor = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        cierrecaja_menu = new javax.swing.JMenuItem();
        jMenu_saldo = new javax.swing.JMenuItem();
        jMenu_movi = new javax.swing.JMenuItem();
        jMenu_cobranza = new javax.swing.JMenuItem();
        jMenu_gastos = new javax.swing.JMenuItem();
        jMenu_ingreso = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu_listado = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setName("fram12"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contado_credito.setTitle("Condicion");
        contado_credito.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        contado_credito.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        contado_credito.setVisible(true);
        contado_credito.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(0, 153, 0));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton4.setText("CONTADO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });
        contado_credito.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 340, 80));

        jButton8.setBackground(new java.awt.Color(255, 204, 0));
        jButton8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton8.setText("CREDITO");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jButton8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton8KeyPressed(evt);
            }
        });
        contado_credito.getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 340, 80));

        getContentPane().add(contado_credito, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 410, 250));

        btn_venta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btn_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/venta.png"))); // NOI18N
        btn_venta.setText("Ventas (V)");
        btn_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ventaActionPerformed(evt);
            }
        });
        btn_venta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_ventaKeyPressed(evt);
            }
        });
        getContentPane().add(btn_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 160, 50));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Todos los Derechos Reservados - doby_py ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 660, 280, -1));

        nom_empresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nom_empresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nom_empresa.setText("empresa");
        getContentPane().add(nom_empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 640, 450, 30));

        pa.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        pa.setForeground(new java.awt.Color(255, 51, 51));
        pa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pa.setText("pa");
        getContentPane().add(pa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, 70, 30));

        rs.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        rs.setForeground(new java.awt.Color(255, 51, 51));
        rs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rs.setText("rs");
        getContentPane().add(rs, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 70, 30));

        us.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        us.setForeground(new java.awt.Color(255, 51, 51));
        us.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        us.setText("us");
        getContentPane().add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 80, 30));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMACIONES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 180, 150));

        jPanel2.setBackground(new java.awt.Color(153, 153, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UTILIDADES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, 580, 80));

        usuario_ini.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        usuario_ini.setForeground(new java.awt.Color(255, 255, 255));
        usuario_ini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuario_ini.setText("usuario");
        getContentPane().add(usuario_ini, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 140, 20));

        privilegio_ini.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        privilegio_ini.setForeground(new java.awt.Color(255, 255, 255));
        privilegio_ini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        privilegio_ini.setText("privilegios");
        getContentPane().add(privilegio_ini, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 120, 20));

        fecha_ini.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        fecha_ini.setForeground(new java.awt.Color(204, 204, 204));
        fecha_ini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha_ini.setText("fecha");
        getContentPane().add(fecha_ini, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 30, 190, 20));

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 30, 190, 20));

        logo_pri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_pri.setText("img");
        getContentPane().add(logo_pri, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 40));

        hora_ini.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        hora_ini.setForeground(new java.awt.Color(204, 204, 204));
        hora_ini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hora_ini.setText("hora");
        getContentPane().add(hora_ini, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, 190, 30));

        sucursal.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        sucursal.setForeground(new java.awt.Color(255, 255, 255));
        sucursal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sucursal.setText("sucursal");
        getContentPane().add(sucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 140, 20));

        sucursal_id.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        sucursal_id.setForeground(new java.awt.Color(255, 255, 255));
        sucursal_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sucursal_id.setText("id");
        getContentPane().add(sucursal_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 40, 20));

        zocalo.setText("zocalo");
        getContentPane().add(zocalo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 740, 100));

        sistema.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sistema.setForeground(new java.awt.Color(0, 153, 0));
        sistema.setText("SISTEMA");
        sistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sistemaActionPerformed(evt);
            }
        });
        getContentPane().add(sistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        base_datos_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(base_datos_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 20, 20));

        base_datos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        base_datos.setText("Base de Datos");
        base_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                base_datosActionPerformed(evt);
            }
        });
        getContentPane().add(base_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, -1, -1));

        adm_usuarios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        adm_usuarios.setText("Adm. de Usuarios");
        adm_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adm_usuariosActionPerformed(evt);
            }
        });
        getContentPane().add(adm_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        adm_privilegios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(adm_privilegios, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 20, 20));

        pri_usuarios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pri_usuarios.setText("Privilegios de Usuarios");
        pri_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pri_usuariosActionPerformed(evt);
            }
        });
        getContentPane().add(pri_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));

        privi_usuari.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(privi_usuari, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 20, 20));

        apariencia_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(apariencia_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 20, 20));

        apariencia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        apariencia.setText("Apariencia");
        apariencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aparienciaActionPerformed(evt);
            }
        });
        getContentPane().add(apariencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, -1));

        configuracion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        configuracion.setText("Configuración");
        configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configuracionActionPerformed(evt);
            }
        });
        getContentPane().add(configuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, -1, -1));

        config_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(config_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 20, 20));

        sucu_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(sucu_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 20, 20));

        sucursal1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sucursal1.setText("Sucursal");
        sucursal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucursal1ActionPerformed(evt);
            }
        });
        getContentPane().add(sucursal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, -1, -1));

        registros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        registros.setForeground(new java.awt.Color(0, 153, 0));
        registros.setText("REGISTROS");
        registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrosActionPerformed(evt);
            }
        });
        getContentPane().add(registros, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        proveedores_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(proveedores_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 20, 20));

        proveedores.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        proveedores.setText("Proveedores");
        proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedoresActionPerformed(evt);
            }
        });
        getContentPane().add(proveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        productos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        productos.setText("Productos");
        productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosActionPerformed(evt);
            }
        });
        getContentPane().add(productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, -1, -1));

        producto_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(producto_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 20, 20));

        add_stock_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(add_stock_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 20, 20));

        add_stock.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        add_stock.setText("Agregar Stock");
        add_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_stockActionPerformed(evt);
            }
        });
        getContentPane().add(add_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, -1));

        add_caja.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        add_caja.setText("Agregar Caja");
        add_caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_cajaActionPerformed(evt);
            }
        });
        getContentPane().add(add_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, -1, 20));

        add_caja_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(add_caja_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 20, 20));

        add_cliente_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(add_cliente_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 20, 20));

        add_cliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        add_cliente.setText("Agregar Cliente");
        add_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(add_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, -1, 20));

        grupo_pro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        grupo_pro.setText("Grupo de Productos");
        grupo_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupo_proActionPerformed(evt);
            }
        });
        getContentPane().add(grupo_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, -1, -1));

        grupo_pro_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(grupo_pro_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 20, 20));

        cotiza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(cotiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 20, 20));

        cotizaciones.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cotizaciones.setText("Cotizaciones");
        cotizaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cotizacionesActionPerformed(evt);
            }
        });
        getContentPane().add(cotizaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, -1, -1));

        cpa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cpa.setForeground(new java.awt.Color(0, 153, 0));
        cpa.setText("COMPRAS");
        cpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpaActionPerformed(evt);
            }
        });
        getContentPane().add(cpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, -1, -1));

        compras_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(compras_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 20, 20));

        compras.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        compras.setText("Compras");
        compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasActionPerformed(evt);
            }
        });
        getContentPane().add(compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, -1, 20));

        ped_realizados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ped_realizados.setText("Pedidos Realizados");
        ped_realizados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ped_realizadosActionPerformed(evt);
            }
        });
        getContentPane().add(ped_realizados, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, -1, -1));

        ped_realiz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ped_realiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 20, 20));

        confirmar_entrega.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        confirmar_entrega.setText("Confirmar Entrega");
        confirmar_entrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmar_entregaActionPerformed(evt);
            }
        });
        getContentPane().add(confirmar_entrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, -1, 20));

        confirmar_entre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(confirmar_entre, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 20, 20));

        ventas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ventas.setForeground(new java.awt.Color(0, 153, 0));
        ventas.setText("VENTAS");
        ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasActionPerformed(evt);
            }
        });
        getContentPane().add(ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, -1, -1));

        vta_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(vta_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 20, 20));

        vta_1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vta_1.setText("Ventas");
        vta_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vta_1ActionPerformed(evt);
            }
        });
        getContentPane().add(vta_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, -1, 20));

        presupuesto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        presupuesto.setText("Presupuesto");
        presupuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presupuestoActionPerformed(evt);
            }
        });
        getContentPane().add(presupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, -1, 20));

        presupu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(presupu, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 20, 20));

        consultas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        consultas.setForeground(new java.awt.Color(0, 153, 0));
        consultas.setText("CONSULTAS");
        consultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultasActionPerformed(evt);
            }
        });
        getContentPane().add(consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        cons_ventas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cons_ventas.setText("Consultas de Ventas");
        cons_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cons_ventasActionPerformed(evt);
            }
        });
        getContentPane().add(cons_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        cons_vta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(cons_vta, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 20, 20));

        cons_presu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(cons_presu, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, 20, 20));

        consu_presu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        consu_presu.setText("Consultas de Presupuestos");
        consu_presu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consu_presuActionPerformed(evt);
            }
        });
        getContentPane().add(consu_presu, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

        consu_cliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        consu_cliente.setText("Consultas de Clientes");
        consu_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consu_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(consu_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        cons_clie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(cons_clie, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, 20, 20));

        cons_vende.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(cons_vende, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, 20, 20));

        consu_vendedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        consu_vendedor.setText("Consultas de Vendedor");
        consu_vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consu_vendedorActionPerformed(evt);
            }
        });
        getContentPane().add(consu_vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        movimi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(movimi, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 20, 20));

        saldo_caja.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        saldo_caja.setText("Saldo de Caja");
        saldo_caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldo_cajaActionPerformed(evt);
            }
        });
        getContentPane().add(saldo_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, -1, -1));

        saldo_cja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(saldo_cja, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 20, 20));

        mov_caja.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mov_caja.setText("Movimiento de caja");
        mov_caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mov_cajaActionPerformed(evt);
            }
        });
        getContentPane().add(mov_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, -1, -1));

        cobranza.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cobranza.setText("Cobranza");
        cobranza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobranzaActionPerformed(evt);
            }
        });
        getContentPane().add(cobranza, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, -1, -1));

        cobz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(cobz, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, 20, 20));

        gtos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(gtos, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, 20, 20));

        gastos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gastos.setText("Gastos");
        gastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gastosActionPerformed(evt);
            }
        });
        getContentPane().add(gastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, -1, -1));

        ingresos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ingresos.setText("Ingresos");
        ingresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresosActionPerformed(evt);
            }
        });
        getContentPane().add(ingresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, -1, -1));

        ingres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ingres, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, 20, 20));

        informe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        informe.setForeground(new java.awt.Color(0, 153, 0));
        informe.setText("INFORME");
        informe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informeActionPerformed(evt);
            }
        });
        getContentPane().add(informe, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, -1, -1));
        getContentPane().add(listad, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 590, 20, 20));

        listado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listado.setText("Listados");
        listado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoActionPerformed(evt);
            }
        });
        getContentPane().add(listado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, -1, -1));

        materialButtomRectangle1.setBackground(new java.awt.Color(54, 79, 105));
        materialButtomRectangle1.setForeground(new java.awt.Color(255, 255, 255));
        materialButtomRectangle1.setText("Salir");
        materialButtomRectangle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtomRectangle1ActionPerformed(evt);
            }
        });
        getContentPane().add(materialButtomRectangle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 590, 140, 50));

        materialButtomRectangle2.setBackground(new java.awt.Color(54, 79, 105));
        materialButtomRectangle2.setForeground(new java.awt.Color(255, 255, 255));
        materialButtomRectangle2.setText("Calculadora");
        materialButtomRectangle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtomRectangle2ActionPerformed(evt);
            }
        });
        getContentPane().add(materialButtomRectangle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 590, 140, 50));

        materialButtomRectangle3.setBackground(new java.awt.Color(54, 79, 105));
        materialButtomRectangle3.setForeground(new java.awt.Color(255, 255, 255));
        materialButtomRectangle3.setText("Notas");
        materialButtomRectangle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtomRectangle3ActionPerformed(evt);
            }
        });
        getContentPane().add(materialButtomRectangle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 590, 140, 50));

        materialButtomRectangle4.setBackground(new java.awt.Color(54, 79, 105));
        materialButtomRectangle4.setForeground(new java.awt.Color(255, 255, 255));
        materialButtomRectangle4.setText("Explorer");
        materialButtomRectangle4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtomRectangle4ActionPerformed(evt);
            }
        });
        getContentPane().add(materialButtomRectangle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 590, 140, 50));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ACCESOS DIRECTOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 180, 340));

        btn_productos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btn_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/editar.png"))); // NOI18N
        btn_productos.setText("Productos (R)");
        btn_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productosActionPerformed(evt);
            }
        });
        btn_productos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_productosKeyPressed(evt);
            }
        });
        getContentPane().add(btn_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 160, 50));

        btn_consulta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btn_consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/suggestions.png"))); // NOI18N
        btn_consulta.setText("Consulta");
        btn_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultaActionPerformed(evt);
            }
        });
        btn_consulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_consultaKeyPressed(evt);
            }
        });
        getContentPane().add(btn_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 160, 50));

        btn_cliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btn_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/cliente.png"))); // NOI18N
        btn_cliente.setText("Cliente");
        btn_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clienteActionPerformed(evt);
            }
        });
        btn_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_clienteKeyPressed(evt);
            }
        });
        getContentPane().add(btn_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 160, 50));

        btn_cobranza.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btn_cobranza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/cobranza.png"))); // NOI18N
        btn_cobranza.setText("Cobranzas (C)");
        btn_cobranza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cobranzaActionPerformed(evt);
            }
        });
        btn_cobranza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_cobranzaKeyPressed(evt);
            }
        });
        getContentPane().add(btn_cobranza, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 160, 50));

        btn_compras.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btn_compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/shopping-bag.png"))); // NOI18N
        btn_compras.setText("Compras (P)");
        btn_compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comprasActionPerformed(evt);
            }
        });
        btn_compras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_comprasKeyPressed(evt);
            }
        });
        getContentPane().add(btn_compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, 50));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 112, 210, 10));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("VERSION 2.0-17.05");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 190, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 503, 160, 110));

        cierrecaja_pri.setText("Cierre Caja");
        getContentPane().add(cierrecaja_pri, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 414, -1, 20));

        cierre_pri_label.setText("1");
        getContentPane().add(cierre_pri_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 410, 20, 30));

        licencia_porvencer.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        licencia_porvencer.setForeground(new java.awt.Color(153, 0, 0));
        licencia_porvencer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        licencia_porvencer.setText("ATENCION!!!");
        getContentPane().add(licencia_porvencer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 470, 320, 40));

        licencia_porvencer1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        licencia_porvencer1.setForeground(new java.awt.Color(153, 0, 0));
        licencia_porvencer1.setText("La Licencia Esta a punto de expirar");
        getContentPane().add(licencia_porvencer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 490, 320, 40));

        licencia_porvencer2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        licencia_porvencer2.setForeground(new java.awt.Color(153, 0, 0));
        licencia_porvencer2.setText("Comuniquese con el Administrador");
        getContentPane().add(licencia_porvencer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 510, 320, 40));

        btn_licencia.setText("CLICK AQUI!");
        btn_licencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_licenciaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_licencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 550, -1, -1));

        cant_cli.setBackground(new java.awt.Color(153, 0, 0));
        cant_cli.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cant_cli.setForeground(new java.awt.Color(204, 0, 0));
        cant_cli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cant_cli.setText("cant_cli");
        getContentPane().add(cant_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 60, 25));

        cant_contado.setBackground(new java.awt.Color(153, 0, 0));
        cant_contado.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cant_contado.setForeground(new java.awt.Color(204, 0, 0));
        cant_contado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cant_contado.setText("cant_co");
        getContentPane().add(cant_contado, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 25, 50, 20));

        cant_cr.setBackground(new java.awt.Color(153, 0, 0));
        cant_cr.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cant_cr.setForeground(new java.awt.Color(204, 0, 0));
        cant_cr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cant_cr.setText("cant_cr");
        getContentPane().add(cant_cr, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 25, 40, 20));

        cant_producto.setBackground(new java.awt.Color(153, 0, 0));
        cant_producto.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cant_producto.setForeground(new java.awt.Color(204, 0, 0));
        cant_producto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cant_producto.setText("cant_procduto");
        getContentPane().add(cant_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 80, 30));

        cant_compra.setBackground(new java.awt.Color(153, 0, 0));
        cant_compra.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cant_compra.setForeground(new java.awt.Color(204, 0, 0));
        cant_compra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cant_compra.setText("cant_procduto");
        getContentPane().add(cant_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 70, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/diseño_sistema.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        jMenu_conf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/servidor.png"))); // NOI18N
        jMenu_conf.setText("Sistema");
        jMenu_conf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu_basedatos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        jMenu_basedatos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_basedatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/base de datos.png"))); // NOI18N
        jMenu_basedatos.setText("Bases de Datos");
        jMenu_basedatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_basedatosActionPerformed(evt);
            }
        });
        jMenu_conf.add(jMenu_basedatos);
        jMenu_conf.add(jSeparator1);

        jMenu_usuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        jMenu_usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/user.png"))); // NOI18N
        jMenu_usuario.setText("Administrador de Usuario");
        jMenu_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_usuarioActionPerformed(evt);
            }
        });
        jMenu_conf.add(jMenu_usuario);

        jMenu_privilegios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_privilegios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/privilegios.png"))); // NOI18N
        jMenu_privilegios.setText("Privilegios de Usuario");
        jMenu_privilegios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_privilegiosActionPerformed(evt);
            }
        });
        jMenu_conf.add(jMenu_privilegios);

        jMenu_apariencia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_apariencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/mascara.png"))); // NOI18N
        jMenu_apariencia.setText("Apariencia");
        jMenu_apariencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_aparienciaActionPerformed(evt);
            }
        });
        jMenu_conf.add(jMenu_apariencia);

        jMenuconfig.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuconfig.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuconfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/settings.png"))); // NOI18N
        jMenuconfig.setText("Configuraciones");
        jMenuconfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuconfigActionPerformed(evt);
            }
        });
        jMenu_conf.add(jMenuconfig);

        jMenu_sucursal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_sucursal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/layers.png"))); // NOI18N
        jMenu_sucursal.setText("Sucursales");
        jMenu_sucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_sucursalActionPerformed(evt);
            }
        });
        jMenu_conf.add(jMenu_sucursal);
        jMenu_conf.add(jSeparator2);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/cerrar sesion.png"))); // NOI18N
        jMenuItem4.setText("Cerrar Sesion");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu_conf.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/close.png"))); // NOI18N
        jMenuItem5.setText("Salir");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu_conf.add(jMenuItem5);

        jmenuprincipal.add(jMenu_conf);

        jMenu_registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/registro.png"))); // NOI18N
        jMenu_registro.setText("Registros");
        jMenu_registro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu_proveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/Proveedor.png"))); // NOI18N
        jMenu_proveedor.setText("Proveedores");
        jMenu_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_proveedorActionPerformed(evt);
            }
        });
        jMenu_registro.add(jMenu_proveedor);

        jMenu_productos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/producto.png"))); // NOI18N
        jMenu_productos.setText("Productos");
        jMenu_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_productosActionPerformed(evt);
            }
        });
        jMenu_registro.add(jMenu_productos);

        jMenu_addstock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_addstock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/cart.png"))); // NOI18N
        jMenu_addstock.setText("Agregar Stock");
        jMenu_addstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_addstockActionPerformed(evt);
            }
        });
        jMenu_registro.add(jMenu_addstock);

        jMenu_addcaja.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_addcaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/cajamenu.png"))); // NOI18N
        jMenu_addcaja.setText("Agregar Caja");
        jMenu_addcaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_addcajaActionPerformed(evt);
            }
        });
        jMenu_registro.add(jMenu_addcaja);

        jMenu_cliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        jMenu_cliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/cliente.png"))); // NOI18N
        jMenu_cliente.setText("Agregar Cliente");
        jMenu_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_clienteActionPerformed(evt);
            }
        });
        jMenu_registro.add(jMenu_cliente);

        jMenu_grupopro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_grupopro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/grupo.png"))); // NOI18N
        jMenu_grupopro.setText("Grupo de Productos");
        jMenu_grupopro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_grupoproActionPerformed(evt);
            }
        });
        jMenu_registro.add(jMenu_grupopro);
        jMenu_registro.add(jSeparator3);

        jMenucotizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenucotizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/cotizacion.png"))); // NOI18N
        jMenucotizar.setText("Cotizaciones");
        jMenucotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenucotizarActionPerformed(evt);
            }
        });
        jMenu_registro.add(jMenucotizar);

        jmenuprincipal.add(jMenu_registro);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/compras.png"))); // NOI18N
        jMenu2.setText("Compras");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu_compras.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenu_compras.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/bolsa32.png"))); // NOI18N
        jMenu_compras.setText("Compras");
        jMenu_compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_comprasActionPerformed(evt);
            }
        });
        jMenu2.add(jMenu_compras);

        jMenu_pedrealizado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jMenu_pedrealizado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_pedrealizado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/servicio-al-cliente.png"))); // NOI18N
        jMenu_pedrealizado.setText("Pedidos Realizados");
        jMenu_pedrealizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_pedrealizadoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenu_pedrealizado);

        jMenu_confirm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_confirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/payment-method.png"))); // NOI18N
        jMenu_confirm.setText("Confirmar Entrega");
        jMenu_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_confirmActionPerformed(evt);
            }
        });
        jMenu2.add(jMenu_confirm);

        jmenuprincipal.add(jMenu2);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/operaciones.png"))); // NOI18N
        jMenu6.setText("Ventas");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu_vta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/bienes32.png"))); // NOI18N
        jMenu_vta.setText("Ventas");
        jMenu_vta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        contado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        contado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        contado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/notes1.png"))); // NOI18N
        contado.setText("CONTADO");
        contado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contadoActionPerformed(evt);
            }
        });
        jMenu_vta.add(contado);
        jMenu_vta.add(jSeparator6);

        jMenuItem20.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem20.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/credit-card.png"))); // NOI18N
        jMenuItem20.setText("CREDITO");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu_vta.add(jMenuItem20);

        jMenu6.add(jMenu_vta);

        jMenu_presupuesto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_presupuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/presupuesto.png"))); // NOI18N
        jMenu_presupuesto.setText("Presupuestos");
        jMenu_presupuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_presupuestoActionPerformed(evt);
            }
        });
        jMenu6.add(jMenu_presupuesto);

        jmenuprincipal.add(jMenu6);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/servicio-al-cliente.png"))); // NOI18N
        jMenu9.setText("Consultas");
        jMenu9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu_consultavta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        jMenu_consultavta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_consultavta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/suggestions.png"))); // NOI18N
        jMenu_consultavta.setText("Consulta de Ventas");
        jMenu_consultavta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_consultavtaActionPerformed(evt);
            }
        });
        jMenu9.add(jMenu_consultavta);

        jMenu_consultapresupu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_consultapresupu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/presupuesto.png"))); // NOI18N
        jMenu_consultapresupu.setText("Consulta de Presupuestos");
        jMenu_consultapresupu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_consultapresupuActionPerformed(evt);
            }
        });
        jMenu9.add(jMenu_consultapresupu);

        jMenu_consulta_cli.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_consulta_cli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/cliente.png"))); // NOI18N
        jMenu_consulta_cli.setText("Consultas por Cliente");
        jMenu_consulta_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_consulta_cliActionPerformed(evt);
            }
        });
        jMenu9.add(jMenu_consulta_cli);

        jMenu_consu_vendedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_consu_vendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/agent.png"))); // NOI18N
        jMenu_consu_vendedor.setText("Consultas por Vendedor");
        jMenu_consu_vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_consu_vendedorActionPerformed(evt);
            }
        });
        jMenu9.add(jMenu_consu_vendedor);

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/Proveedor.png"))); // NOI18N
        jMenuItem1.setText("Consultas por Proveedor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem1);

        jmenuprincipal.add(jMenu9);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/bitcoin.png"))); // NOI18N
        jMenu7.setText("Caja");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cierrecaja_menu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cierrecaja_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/bolsa-de-dinero.png"))); // NOI18N
        cierrecaja_menu.setText("Cierre de Caja");
        cierrecaja_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cierrecaja_menuActionPerformed(evt);
            }
        });
        jMenu7.add(cierrecaja_menu);

        jMenu_saldo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenu_saldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_saldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/safe-box.png"))); // NOI18N
        jMenu_saldo.setText("Saldos de Caja");
        jMenu_saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_saldoActionPerformed(evt);
            }
        });
        jMenu7.add(jMenu_saldo);

        jMenu_movi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_movi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/moving-home.png"))); // NOI18N
        jMenu_movi.setText("Movimiento de Caja");
        jMenu_movi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_moviActionPerformed(evt);
            }
        });
        jMenu7.add(jMenu_movi);

        jMenu_cobranza.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.ALT_MASK));
        jMenu_cobranza.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_cobranza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/budget.png"))); // NOI18N
        jMenu_cobranza.setText("Cobranza ");
        jMenu_cobranza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_cobranzaActionPerformed(evt);
            }
        });
        jMenu7.add(jMenu_cobranza);

        jMenu_gastos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_gastos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/gastos.png"))); // NOI18N
        jMenu_gastos.setText("Gastos");
        jMenu_gastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_gastosActionPerformed(evt);
            }
        });
        jMenu7.add(jMenu_gastos);

        jMenu_ingreso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_ingreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/ingresos.png"))); // NOI18N
        jMenu_ingreso.setText("Ingresos");
        jMenu_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_ingresoActionPerformed(evt);
            }
        });
        jMenu7.add(jMenu_ingreso);

        jmenuprincipal.add(jMenu7);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/listados.png"))); // NOI18N
        jMenu5.setText("Informes");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu_listado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        jMenu_listado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_listado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/survey.png"))); // NOI18N
        jMenu_listado.setText("Informes Generados");
        jMenu_listado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_listadoActionPerformed(evt);
            }
        });
        jMenu5.add(jMenu_listado);

        jmenuprincipal.add(jMenu5);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/about.png"))); // NOI18N
        jMenu4.setText("Acerca de");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/about.png"))); // NOI18N
        jMenuItem9.setText("Acerca de");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jmenuprincipal.add(jMenu4);

        setJMenuBar(jmenuprincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

    new dbstock.AlertWarningSalir(this, true).setVisible(true);
     
 //   try
 //       {
           /* directorio/ejecutable es el path del ejecutable y un nombre */
 //          Runtime.getRuntime().exec("cmd /c start C:\\Sistema\\dbstock\\cmbRespaldo.bat");
 //       }
  //      catch (Exception e)
 //       {
 //          /* Se lanza una excepción si no se encuentra en ejecutable o el fichero no es ejecutable. */
 //       }
        
 //       System.exit(0);
       
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_usuarioActionPerformed
        
        usuario ver = new usuario();
        ver.setVisible(true);
        
        jMenu_usuario.setEnabled(false);
        
    }//GEN-LAST:event_jMenu_usuarioActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
                acerca acercaa = new acerca();
                acercaa.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        vtacredito ver = new vtacredito();
        ver.setVisible(true);
        contado_credito.setVisible(false);
        vtacredito.sucursal_vta.setText(sucursal_id.getText());
          
        String condicion = "CREDITO";
        vtacredito.cond.setText(condicion);
        vtacredito.jLabel_venta.setForeground(Color.ORANGE);
        
        jMenu_vta.setEnabled(false);
        btn_venta.setEnabled(false);
        
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void contadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contadoActionPerformed
          vtacredito ver = new vtacredito();
        ver.setVisible(true);
        contado_credito.setVisible(false);
        vtacredito.sucursal_vta.setText(sucursal_id.getText());
          
        String condicion = "CONTADO";
        vtacredito.cond.setText(condicion);
        vtacredito.jLabel_venta.setForeground((new Color(0,153,0)));
        
        jMenu_vta.setEnabled(false);
        btn_venta.setEnabled(false);
        
    }//GEN-LAST:event_contadoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Inicio form2 = new  Inicio();
	form2.setVisible(true);
        
       this.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu_privilegiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_privilegiosActionPerformed
        privilegio privi = new privilegio();
        privi.setVisible(true);
    }//GEN-LAST:event_jMenu_privilegiosActionPerformed

    private void jMenu_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_proveedorActionPerformed
       proveedor vera = new proveedor();

       vera.setVisible(true);

        
    /*            proveedor sa = new proveedor();
        desktop.add(sa);
        sa.setVisible(true);
        sa.show();
        sa.pack();*/
        
    }//GEN-LAST:event_jMenu_proveedorActionPerformed

    private void jMenu_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_clienteActionPerformed
        cliente ver = new cliente();
        ver.setVisible(true);
        
        jMenu_cliente.setEnabled(false);
        btn_cliente.setEnabled(false);
    }//GEN-LAST:event_jMenu_clienteActionPerformed

    private void btn_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clienteActionPerformed
        cliente ver = new cliente();
        ver.setVisible(true);
        
        jMenu_cliente.setEnabled(false);
        btn_cliente.setEnabled(false);
    }//GEN-LAST:event_btn_clienteActionPerformed

    private void jMenuconfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuconfigActionPerformed
        config verin = new config();
        verin.setVisible(true);

    }//GEN-LAST:event_jMenuconfigActionPerformed

    private void jMenu_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_productosActionPerformed
        productos produ = new productos();
        produ.setVisible(true);

        
    }//GEN-LAST:event_jMenu_productosActionPerformed

    private void jMenucotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenucotizarActionPerformed
        cotizacion coti = new cotizacion();
        coti.setVisible(true);
    }//GEN-LAST:event_jMenucotizarActionPerformed

    private void jMenu_grupoproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_grupoproActionPerformed
        grupo_prov produ = new grupo_prov();
        produ.setVisible(true);
    }//GEN-LAST:event_jMenu_grupoproActionPerformed

    private void jMenu_comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_comprasActionPerformed
              
        pedidos ver = new pedidos();
        ver.setVisible(true);
        pedidos.id_suc.setText(sucursal_id.getText()); 
        
        jMenu_compras.setEnabled(false);
        btn_compras.setEnabled(false);
        
    }//GEN-LAST:event_jMenu_comprasActionPerformed

    private void jMenu_pedrealizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_pedrealizadoActionPerformed
       PedRealizados mostrar = new PedRealizados();
       mostrar.setVisible(true);
    }//GEN-LAST:event_jMenu_pedrealizadoActionPerformed

    private void btn_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultaActionPerformed
                consulta_vta consulta = new consulta_vta();
                consulta.setVisible(true);
    }//GEN-LAST:event_btn_consultaActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        vtacredito ver = new vtacredito();
        ver.setVisible(true);
        contado_credito.setVisible(false);
        vtacredito.sucursal_vta.setText(sucursal_id.getText());
          
        String condicion = "CREDITO";
        vtacredito.cond.setText(condicion);
        vtacredito.jLabel_venta.setForeground(Color.ORANGE);
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btn_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ventaActionPerformed
       //contado_credito.setVisible(true);
        DetalleVta det = new DetalleVta();
        det.setVisible(true);
        
        jMenu_vta.setEnabled(false);
        btn_venta.setEnabled(false);
        DetalleVta.btn_condicion.requestFocus();
       
    }//GEN-LAST:event_btn_ventaActionPerformed

    private void jMenu_addcajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_addcajaActionPerformed
        caja ver5 = new caja();
        ver5.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu_addcajaActionPerformed

    private void jMenu_sucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_sucursalActionPerformed
        sucursal versuc = new sucursal();
        versuc.setVisible(true);
    }//GEN-LAST:event_jMenu_sucursalActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        vtacredito ver = new vtacredito();
        ver.setVisible(true);
        contado_credito.setVisible(false);
        vtacredito.sucursal_vta.setText(sucursal_id.getText());
          
        String condicion = "CONTADO";
        vtacredito.cond.setText(condicion);
        vtacredito.jLabel_venta.setForeground((new Color(0,153,0)));

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenu_aparienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_aparienciaActionPerformed
        apariencia aparie = new apariencia();
        aparie.setVisible(true);
    }//GEN-LAST:event_jMenu_aparienciaActionPerformed

    private void jMenu_consultavtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_consultavtaActionPerformed
                consulta_vta consulta = new consulta_vta();
                consulta.setVisible(true);
    }//GEN-LAST:event_jMenu_consultavtaActionPerformed

    private void btn_cobranzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cobranzaActionPerformed
        cobranza ve = new cobranza();
        ve.setVisible(true);
    
        Principal.jMenu_cobranza.setEnabled(false);
        Principal.btn_cobranza.setEnabled(false);
        
    }//GEN-LAST:event_btn_cobranzaActionPerformed

    private void jMenu_saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_saldoActionPerformed
        saldo_caja saldo = new saldo_caja();
        saldo.setVisible(true);
        

        
    }//GEN-LAST:event_jMenu_saldoActionPerformed

    private void jMenu_cobranzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_cobranzaActionPerformed
        cobranza cob = new cobranza();
        cob.setVisible(true);
        
        Principal.jMenu_cobranza.setEnabled(false);
        Principal.btn_cobranza.setEnabled(false);
        
    }//GEN-LAST:event_jMenu_cobranzaActionPerformed

    private void btn_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productosActionPerformed
        productos pro = new productos();
        pro.setVisible(true);
        bus_txt3.requestFocus();
       jTabbedPane1.setSelectedIndex(1);
       //productos.jcheck_todos.
       
    }//GEN-LAST:event_btn_productosActionPerformed

    private void jMenu_moviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_moviActionPerformed
        mov_caja ver_caja = new mov_caja();
        ver_caja.setVisible(true);        
    }//GEN-LAST:event_jMenu_moviActionPerformed

    private void jMenu_gastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_gastosActionPerformed
        gastos gasto = new gastos();
        gasto.setVisible(true);
    }//GEN-LAST:event_jMenu_gastosActionPerformed

    private void jMenu_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_ingresoActionPerformed
        ingresos ingreso = new ingresos();
        ingreso.setVisible(true);
    }//GEN-LAST:event_jMenu_ingresoActionPerformed

    private void jMenu_basedatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_basedatosActionPerformed
        base_datos base = new base_datos();
        base.setVisible(true);
    }//GEN-LAST:event_jMenu_basedatosActionPerformed

    private void jMenu_addstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_addstockActionPerformed
        add_stock add = new add_stock();
        add.setVisible(true);
 
         

    
        
    }//GEN-LAST:event_jMenu_addstockActionPerformed

    private void btn_comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comprasActionPerformed
        pedidos ver = new pedidos();
        ver.setVisible(true);
        pedidos.id_suc.setText(sucursal_id.getText()); 
        
        jMenu_compras.setEnabled(false);
        btn_compras.setEnabled(false);
        
    }//GEN-LAST:event_btn_comprasActionPerformed

    private void btn_ventaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_ventaKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_V) {
            btn_venta.doClick(); //VENTA
        }
        if (key == KeyEvent.VK_C) {
            btn_cobranza.doClick(); ///COBRANZA
        }
        if (key == KeyEvent.VK_P) {
            btn_compras.doClick(); ///COMPRA
        }
        if (key == KeyEvent.VK_R) {
            btn_productos.doClick(); ///productos
        }
        
    }//GEN-LAST:event_btn_ventaKeyPressed

    private void btn_cobranzaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_cobranzaKeyPressed
                int key = evt.getKeyCode();
        if (key == KeyEvent.VK_V) {
            btn_venta.doClick(); //VENTA
        }
        if (key == KeyEvent.VK_C) {
            btn_cobranza.doClick(); ///COBRANZA
        }
        if (key == KeyEvent.VK_P) {
            btn_compras.doClick(); ///COBRANZA
        }
        if (key == KeyEvent.VK_SPACE) {
            btn_productos.doClick(); ///productos
        }
    }//GEN-LAST:event_btn_cobranzaKeyPressed

    private void btn_comprasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_comprasKeyPressed
                int key = evt.getKeyCode();
        if (key == KeyEvent.VK_V) {
            btn_venta.doClick(); //VENTA
        }
        if (key == KeyEvent.VK_C) {
            btn_cobranza.doClick(); ///COBRANZA
        }
        if (key == KeyEvent.VK_P) {
            btn_compras.doClick(); ///COMPRA
        }
        
        if (key == KeyEvent.VK_R) {
            btn_productos.doClick(); ///productos
        }
    }//GEN-LAST:event_btn_comprasKeyPressed

    private void jMenu_listadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_listadoActionPerformed
                reportes reporte = new reportes();
                reporte.setVisible(true);
    }//GEN-LAST:event_jMenu_listadoActionPerformed

    private void jMenu_consu_vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_consu_vendedorActionPerformed
          consulta_vendedor vend = new consulta_vendedor();
                vend.setVisible(true);
    }//GEN-LAST:event_jMenu_consu_vendedorActionPerformed

    private void jMenu_consulta_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_consulta_cliActionPerformed
                 consulta_cliente cliente = new consulta_cliente();
                cliente.setVisible(true);
    }//GEN-LAST:event_jMenu_consulta_cliActionPerformed

    private void jMenu_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_confirmActionPerformed

        try {
            pedido_entregado ver_entre;
            ver_entre = new pedido_entregado();
            ver_entre.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenu_confirmActionPerformed

    private void jMenu_consultapresupuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_consultapresupuActionPerformed
        consulta_presupuestos presupuesto = new consulta_presupuestos();
        presupuesto.setVisible(true);
    }//GEN-LAST:event_jMenu_consultapresupuActionPerformed

    private void jMenu_presupuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_presupuestoActionPerformed
        presupuestos verpresu = new presupuestos();
        verpresu.setVisible(true);
        contado_credito.setVisible(false);
        presupuestos.sucursal_vta.setText(sucursal_id.getText());
          
        String condicion = "CONTADO";
        presupuestos.cond.setText(condicion);
        presupuestos.jLabel_venta.setForeground((new Color(255,0,0)));
        
   
     //   vtacredito.btn_ticket.setEnabled(false);
     //   vtacredito.btn_factura.setEnabled(false);
        
    }//GEN-LAST:event_jMenu_presupuestoActionPerformed

    private void sistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sistemaActionPerformed

        if(sistema.isSelected()){
            //base_datos_lb.setText("1");
            base_datos.setEnabled(true);
            adm_usuarios.setEnabled(true);
            pri_usuarios.setEnabled(true);
            apariencia.setEnabled(true);
            configuracion.setEnabled(true);
            sucursal.setEnabled(true);

        }else{
            base_datos.setEnabled(false);
            adm_usuarios.setEnabled(false);
            pri_usuarios.setEnabled(false);
            apariencia.setEnabled(false);
            configuracion.setEnabled(false);
            sucursal.setEnabled(false);
            //  base_datos_lb.setText("0");
        }

    }//GEN-LAST:event_sistemaActionPerformed

    private void base_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_base_datosActionPerformed

        if(base_datos.isSelected()){
            base_datos_lb.setText("1");
        }else{
            base_datos_lb.setText("0");
        }

    }//GEN-LAST:event_base_datosActionPerformed

    private void adm_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adm_usuariosActionPerformed
        if(adm_usuarios.isSelected()){
            adm_privilegios.setText("1");
        }else{
            adm_privilegios.setText("0");
        }
    }//GEN-LAST:event_adm_usuariosActionPerformed

    private void pri_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pri_usuariosActionPerformed
        if(pri_usuarios.isSelected()){
            privi_usuari.setText("1");
        }else{
            privi_usuari.setText("0");
        }
    }//GEN-LAST:event_pri_usuariosActionPerformed

    private void aparienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aparienciaActionPerformed
        if(apariencia.isSelected()){
            apariencia_1.setText("1");
        }else{
            apariencia_1.setText("0");
        }
    }//GEN-LAST:event_aparienciaActionPerformed

    private void configuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configuracionActionPerformed
        if(configuracion.isSelected()){
            config_1.setText("1");
        }else{
            config_1.setText("0");
        }
    }//GEN-LAST:event_configuracionActionPerformed

    private void sucursal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucursal1ActionPerformed
        if(sucursal1.isSelected()){
            sucu_1.setText("1");
        }else{
            sucu_1.setText("0");
        }
    }//GEN-LAST:event_sucursal1ActionPerformed

    private void registrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrosActionPerformed
        if(registros.isSelected()){

            proveedores.setEnabled(true);
            productos.setEnabled(true);
            add_stock.setEnabled(true);
            add_caja.setEnabled(true);
            add_cliente.setEnabled(true);
            grupo_pro.setEnabled(true);
            cotizaciones.setEnabled(true);

        }else{
            proveedores.setEnabled(false);
            productos.setEnabled(false);
            add_stock.setEnabled(false);
            add_caja.setEnabled(false);
            add_cliente.setEnabled(false);
            grupo_pro.setEnabled(false);
            cotizaciones.setEnabled(false);
        }
    }//GEN-LAST:event_registrosActionPerformed

    private void proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedoresActionPerformed
        if(proveedores.isSelected()){
            proveedores_1.setText("1");
        }else{
            proveedores_1.setText("0");
        }
    }//GEN-LAST:event_proveedoresActionPerformed

    private void productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosActionPerformed
        if(productos.isSelected()){
            producto_1.setText("1");
        }else{
            producto_1.setText("0");
        }
    }//GEN-LAST:event_productosActionPerformed

    private void add_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_stockActionPerformed

        if(add_stock.isSelected()){
            add_stock_1.setText("1");
        }else{
            add_stock_1.setText("0");
        }

    }//GEN-LAST:event_add_stockActionPerformed

    private void add_cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_cajaActionPerformed

        if(add_caja.isSelected()){
            add_caja_1.setText("1");
        }else{
            add_caja_1.setText("0");
        }

    }//GEN-LAST:event_add_cajaActionPerformed

    private void add_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_clienteActionPerformed

        if(add_cliente.isSelected()){
            add_cliente_1.setText("1");
        }else{
            add_cliente_1.setText("0");
        }

    }//GEN-LAST:event_add_clienteActionPerformed

    private void grupo_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupo_proActionPerformed

        if(grupo_pro.isSelected()){
            grupo_pro_1.setText("1");
        }else{
            grupo_pro_1.setText("0");
        }

    }//GEN-LAST:event_grupo_proActionPerformed

    private void cotizacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cotizacionesActionPerformed

        if(cotizaciones.isSelected()){
            cotiza.setText("1");
        }else{
            cotiza.setText("0");
        }

    }//GEN-LAST:event_cotizacionesActionPerformed

    private void cpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpaActionPerformed
        if(cpa.isSelected()){

            compras.setEnabled(true);
            ped_realizados.setEnabled(true);
            confirmar_entrega.setEnabled(true);

        }else{
            compras.setEnabled(false);
            ped_realizados.setEnabled(false);
            confirmar_entrega.setEnabled(false);

        }
    }//GEN-LAST:event_cpaActionPerformed

    private void comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasActionPerformed
        if(compras.isSelected()){
            compras_1.setText("1");
        }else{
            compras_1.setText("0");
        }

    }//GEN-LAST:event_comprasActionPerformed

    private void ped_realizadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ped_realizadosActionPerformed

        if(ped_realizados.isSelected()){
            ped_realiz.setText("1");
        }else{
            ped_realiz.setText("0");
        }

    }//GEN-LAST:event_ped_realizadosActionPerformed

    private void confirmar_entregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmar_entregaActionPerformed

        if(confirmar_entrega.isSelected()){
            confirmar_entre.setText("1");
        }else{
            confirmar_entre.setText("0");
        }

    }//GEN-LAST:event_confirmar_entregaActionPerformed

    private void ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasActionPerformed
        if(ventas.isSelected()){
            vta_1.setEnabled(true);
            presupuesto.setEnabled(true);

        }else{
            vta_1.setEnabled(false);
            presupuesto.setEnabled(false);
        }
    }//GEN-LAST:event_ventasActionPerformed

    private void vta_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vta_1ActionPerformed

        if(vta_1.isSelected()){
            vta_lb.setText("1");
        }else{
            vta_lb.setText("0");
        }

    }//GEN-LAST:event_vta_1ActionPerformed

    private void presupuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presupuestoActionPerformed

        if(presupuesto.isSelected()){
            presupu.setText("1");
        }else{
            presupu.setText("0");
        }

    }//GEN-LAST:event_presupuestoActionPerformed

    private void consultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultasActionPerformed
        if(consultas.isSelected()){
            cons_ventas.setEnabled(true);
            consu_presu.setEnabled(true);
            consu_cliente.setEnabled(true);
            consu_vendedor.setEnabled(true);
        }else{
            cons_ventas.setEnabled(false);
            consu_presu.setEnabled(false);
            consu_cliente.setEnabled(false);
            consu_vendedor.setEnabled(false);
        }
    }//GEN-LAST:event_consultasActionPerformed

    private void cons_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cons_ventasActionPerformed

        if(cons_ventas.isSelected()){
            cons_vta.setText("1");
        }else{
            cons_vta.setText("0");
        }

    }//GEN-LAST:event_cons_ventasActionPerformed

    private void consu_presuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consu_presuActionPerformed

        if(consu_presu.isSelected()){
            cons_presu.setText("1");
        }else{
            cons_presu.setText("0");
        }

    }//GEN-LAST:event_consu_presuActionPerformed

    private void consu_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consu_clienteActionPerformed

        if(consu_cliente.isSelected()){
            cons_clie.setText("1");
        }else{
            cons_clie.setText("0");
        }

    }//GEN-LAST:event_consu_clienteActionPerformed

    private void consu_vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consu_vendedorActionPerformed

        if(consu_vendedor.isSelected()){
            cons_vende.setText("1");
        }else{
            cons_vende.setText("0");
        }

    }//GEN-LAST:event_consu_vendedorActionPerformed

    private void saldo_cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldo_cajaActionPerformed
        if(saldo_caja.isSelected()){
            saldo_cja.setText("1");
        }else{
            saldo_cja.setText("0");
        }

    }//GEN-LAST:event_saldo_cajaActionPerformed

    private void mov_cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mov_cajaActionPerformed
        if(mov_caja.isSelected()){
            movimi.setText("1");
        }else{
            movimi.setText("0");
        }

    }//GEN-LAST:event_mov_cajaActionPerformed

    private void cobranzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobranzaActionPerformed
        if(cobranza.isSelected()){
            cobz.setText("1");
        }else{
            cobz.setText("0");
        }

    }//GEN-LAST:event_cobranzaActionPerformed

    private void gastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gastosActionPerformed
        if(gastos.isSelected()){
            gtos.setText("1");
        }else{
            gtos.setText("0");
        }

    }//GEN-LAST:event_gastosActionPerformed

    private void ingresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresosActionPerformed

        if(ingresos.isSelected()){
            ingres.setText("1");
        }else{
            ingres.setText("0");
        }

    }//GEN-LAST:event_ingresosActionPerformed

    private void informeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informeActionPerformed
        if(informe.isSelected()){
            listado.setEnabled(true);

        }else{
            listado.setEnabled(false);

        }
    }//GEN-LAST:event_informeActionPerformed

    private void listadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoActionPerformed

        if(listado.isSelected()){
            listad.setText("1");
        }else{
            listad.setText("0");
        }

    }//GEN-LAST:event_listadoActionPerformed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
            if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
             jButton4.doClick();
            }
    }//GEN-LAST:event_jButton4KeyPressed

    private void jButton8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton8KeyPressed
            if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
             jButton8.doClick();
            }
    }//GEN-LAST:event_jButton8KeyPressed

    private void btn_productosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_productosKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_V) {
            btn_venta.doClick(); //VENTA
        }
        if (key == KeyEvent.VK_C) {
            btn_cobranza.doClick(); ///COBRANZA
        }
        if (key == KeyEvent.VK_P) {
            btn_compras.doClick(); ///COMPRA
        }
        if (key == KeyEvent.VK_R) {
            btn_productos.doClick(); ///productos
        }
        
    }//GEN-LAST:event_btn_productosKeyPressed

    private void btn_clienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_clienteKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_V) {
            btn_venta.doClick(); //VENTA
        }
        if (key == KeyEvent.VK_C) {
            btn_cobranza.doClick(); ///COBRANZA
        }
        if (key == KeyEvent.VK_P) {
            btn_compras.doClick(); ///COMPRA
        }
        if (key == KeyEvent.VK_R) {
            btn_productos.doClick(); ///productos
        }
    }//GEN-LAST:event_btn_clienteKeyPressed

    private void btn_consultaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_consultaKeyPressed
                int key = evt.getKeyCode();
        if (key == KeyEvent.VK_V) {
            btn_venta.doClick(); //VENTA
        }
        if (key == KeyEvent.VK_C) {
            btn_cobranza.doClick(); ///COBRANZA
        }
        if (key == KeyEvent.VK_P) {
            btn_compras.doClick(); ///COMPRA
        }
        if (key == KeyEvent.VK_R ) {
            btn_productos.doClick(); ///productos
        }
    }//GEN-LAST:event_btn_consultaKeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
                consulta_proveedor vendpro = new consulta_proveedor();
                vendpro.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void materialButtomRectangle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtomRectangle2ActionPerformed
            try        
            {
                Runtime rt = Runtime.getRuntime();           
                Process p = rt.exec("calc");            
                p.waitFor();        
            }        
            catch ( IOException ioe )       
            {            
                ioe.printStackTrace();
            }         
            catch ( InterruptedException ie )
            {            
                ie.printStackTrace();     
            }
    }//GEN-LAST:event_materialButtomRectangle2ActionPerformed

    private void materialButtomRectangle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtomRectangle3ActionPerformed
            try        
            {
                Runtime rt = Runtime.getRuntime();           
                Process p = rt.exec("notepad");            
                p.waitFor();        
            }        
            catch ( IOException ioe )       
            {            
                ioe.printStackTrace();
            }         
            catch ( InterruptedException ie )
            {            
                ie.printStackTrace();     
            }
    }//GEN-LAST:event_materialButtomRectangle3ActionPerformed

    private void materialButtomRectangle4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtomRectangle4ActionPerformed
            try        
            {
                Runtime rt = Runtime.getRuntime();           
                Process p = rt.exec("explorer");            
                p.waitFor();        
            }        
            catch ( IOException ioe )       
            {            
                ioe.printStackTrace();
            }         
            catch ( InterruptedException ie )
            {            
                ie.printStackTrace();     
            }
    }//GEN-LAST:event_materialButtomRectangle4ActionPerformed

    private void materialButtomRectangle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtomRectangle1ActionPerformed
        jMenuItem5.doClick();
    }//GEN-LAST:event_materialButtomRectangle1ActionPerformed

    private void cierrecaja_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cierrecaja_menuActionPerformed
        caja_exten lol =new caja_exten();
        lol.setVisible(true);
        
        
        caja_exten.txt_usuario_cierre.setText(usuario_ini.getText());
        
    }//GEN-LAST:event_cierrecaja_menuActionPerformed

    private void btn_licenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_licenciaActionPerformed
            licencia verlice = new licencia();
            verlice.setVisible(true);
    }//GEN-LAST:event_btn_licenciaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox add_caja;
    public static javax.swing.JLabel add_caja_1;
    private javax.swing.JCheckBox add_cliente;
    public static javax.swing.JLabel add_cliente_1;
    private javax.swing.JCheckBox add_stock;
    public static javax.swing.JLabel add_stock_1;
    public static javax.swing.JLabel adm_privilegios;
    private javax.swing.JCheckBox adm_usuarios;
    private javax.swing.JCheckBox apariencia;
    public static javax.swing.JLabel apariencia_1;
    private javax.swing.JCheckBox base_datos;
    public static javax.swing.JLabel base_datos_lb;
    public static javax.swing.JButton btn_cliente;
    public static javax.swing.JButton btn_cobranza;
    public static javax.swing.JButton btn_compras;
    public static javax.swing.JButton btn_consulta;
    public static javax.swing.JButton btn_licencia;
    private javax.swing.JButton btn_productos;
    public static javax.swing.JButton btn_venta;
    public static javax.swing.JLabel cant_cli;
    public static javax.swing.JLabel cant_compra;
    public static javax.swing.JLabel cant_contado;
    public static javax.swing.JLabel cant_cr;
    public static javax.swing.JLabel cant_producto;
    public static javax.swing.JLabel cierre_pri_label;
    private javax.swing.JMenuItem cierrecaja_menu;
    public static javax.swing.JCheckBox cierrecaja_pri;
    private javax.swing.JCheckBox cobranza;
    public static javax.swing.JLabel cobz;
    private javax.swing.JCheckBox compras;
    public static javax.swing.JLabel compras_1;
    public static javax.swing.JLabel config_1;
    private javax.swing.JCheckBox configuracion;
    public static javax.swing.JLabel confirmar_entre;
    private javax.swing.JCheckBox confirmar_entrega;
    public static javax.swing.JLabel cons_clie;
    public static javax.swing.JLabel cons_presu;
    public static javax.swing.JLabel cons_vende;
    private javax.swing.JCheckBox cons_ventas;
    public static javax.swing.JLabel cons_vta;
    private javax.swing.JCheckBox consu_cliente;
    private javax.swing.JCheckBox consu_presu;
    private javax.swing.JCheckBox consu_vendedor;
    private javax.swing.JCheckBox consultas;
    public static javax.swing.JMenuItem contado;
    private javax.swing.JInternalFrame contado_credito;
    public static javax.swing.JLabel cotiza;
    private javax.swing.JCheckBox cotizaciones;
    private javax.swing.JCheckBox cpa;
    public static javax.swing.JLabel fecha_ini;
    private javax.swing.JCheckBox gastos;
    private javax.swing.JCheckBox grupo_pro;
    public static javax.swing.JLabel grupo_pro_1;
    public static javax.swing.JLabel gtos;
    private javax.swing.JLabel hora_ini;
    private javax.swing.JCheckBox informe;
    public static javax.swing.JLabel ingres;
    private javax.swing.JCheckBox ingresos;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    public static javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenu_addcaja;
    private javax.swing.JMenuItem jMenu_addstock;
    private javax.swing.JMenuItem jMenu_apariencia;
    private javax.swing.JMenuItem jMenu_basedatos;
    public static javax.swing.JMenuItem jMenu_cliente;
    public static javax.swing.JMenuItem jMenu_cobranza;
    public static javax.swing.JMenuItem jMenu_compras;
    private javax.swing.JMenu jMenu_conf;
    private javax.swing.JMenuItem jMenu_confirm;
    private javax.swing.JMenuItem jMenu_consu_vendedor;
    private javax.swing.JMenuItem jMenu_consulta_cli;
    private javax.swing.JMenuItem jMenu_consultapresupu;
    private javax.swing.JMenuItem jMenu_consultavta;
    private javax.swing.JMenuItem jMenu_gastos;
    private javax.swing.JMenuItem jMenu_grupopro;
    private javax.swing.JMenuItem jMenu_ingreso;
    private javax.swing.JMenuItem jMenu_listado;
    private javax.swing.JMenuItem jMenu_movi;
    private javax.swing.JMenuItem jMenu_pedrealizado;
    private javax.swing.JMenuItem jMenu_presupuesto;
    private javax.swing.JMenuItem jMenu_privilegios;
    private javax.swing.JMenuItem jMenu_productos;
    private javax.swing.JMenuItem jMenu_proveedor;
    private javax.swing.JMenu jMenu_registro;
    private javax.swing.JMenuItem jMenu_saldo;
    private javax.swing.JMenuItem jMenu_sucursal;
    public static javax.swing.JMenuItem jMenu_usuario;
    public static javax.swing.JMenu jMenu_vta;
    public static javax.swing.JMenuItem jMenuconfig;
    public static javax.swing.JMenuItem jMenucotizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuBar jmenuprincipal;
    public static javax.swing.JLabel licencia_porvencer;
    public static javax.swing.JLabel licencia_porvencer1;
    public static javax.swing.JLabel licencia_porvencer2;
    public static javax.swing.JLabel listad;
    private javax.swing.JCheckBox listado;
    public static javax.swing.JLabel logo_pri;
    private principal.MaterialButtomRectangle materialButtomRectangle1;
    private principal.MaterialButtomRectangle materialButtomRectangle2;
    private principal.MaterialButtomRectangle materialButtomRectangle3;
    private principal.MaterialButtomRectangle materialButtomRectangle4;
    private javax.swing.JCheckBox mov_caja;
    public static javax.swing.JLabel movimi;
    public static javax.swing.JLabel nom_empresa;
    public static javax.swing.JLabel pa;
    public static javax.swing.JLabel ped_realiz;
    private javax.swing.JCheckBox ped_realizados;
    public static javax.swing.JLabel presupu;
    private javax.swing.JCheckBox presupuesto;
    private javax.swing.JCheckBox pri_usuarios;
    public static javax.swing.JLabel privi_usuari;
    public static javax.swing.JLabel privilegio_ini;
    public static javax.swing.JLabel producto_1;
    private javax.swing.JCheckBox productos;
    private javax.swing.JCheckBox proveedores;
    public static javax.swing.JLabel proveedores_1;
    private javax.swing.JCheckBox registros;
    public static javax.swing.JLabel rs;
    private javax.swing.JCheckBox saldo_caja;
    public static javax.swing.JLabel saldo_cja;
    private javax.swing.JCheckBox sistema;
    public static javax.swing.JLabel sucu_1;
    public static javax.swing.JLabel sucursal;
    private javax.swing.JCheckBox sucursal1;
    public static javax.swing.JLabel sucursal_id;
    public static javax.swing.JLabel us;
    public static javax.swing.JLabel usuario_ini;
    private javax.swing.JCheckBox ventas;
    private javax.swing.JCheckBox vta_1;
    public static javax.swing.JLabel vta_lb;
    private javax.swing.JLabel zocalo;
    // End of variables declaration//GEN-END:variables
}
