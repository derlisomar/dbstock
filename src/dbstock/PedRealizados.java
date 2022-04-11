/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;

import static dbstock.pedidos.id;
import static dbstock.productos.jTable_productos;
import static dbstock.productos.pro_compra;
import static dbstock.productos.pro_desc;
import static dbstock.productos.pro_ganancia;
import static dbstock.productos.pro_id;
import static dbstock.productos.pro_mayorista;
import static dbstock.productos.pro_minimo;
import static dbstock.productos.pro_obs;
import static dbstock.productos.pro_stock;
import static dbstock.productos.pro_vencimineto;
import static dbstock.productos.pro_venta;
import static dbstock.proveedor.jTable_proveedor;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import static java.lang.Integer.parseInt;

/**
 *
 * @author Derlis
 */
public class PedRealizados extends javax.swing.JFrame {

    /**
     * Creates new form PedRealizados
     */
    DateFormat df = DateFormat.getDateInstance();
    public static Statement st;
    public static Connection con;
    
    public PedRealizados() {
        initComponents();
        
        this.setLocationRelativeTo(null);//centra el formulario
        this.setTitle("Pedidos Realizados");
        

        Calendar Cal= Calendar.getInstance();
        fecha_final.setCalendar(Cal);
        fecha_inicial.setCalendar(Cal);
        
        btn_anular.setEnabled(false);
        btn_reimprimirpedido.setEnabled(false);
        
        id_ped.setVisible(false);
        estados.setVisible(false);

                    
                //MOSTRAR FECHA Y HORA DEL SISTEMA
  /*      Calendar Cal= Calendar.getInstance();
        String fecha= Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+"/"+Cal.get(Cal.YEAR);
        fecha_ini.setText(fecha);
        fecha_fin.setText(fecha);*/
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_contado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_pedidorea = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_peddetalles = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_calcular = new javax.swing.JButton();
        contado = new javax.swing.JCheckBox();
        credito = new javax.swing.JCheckBox();
        fecha_final = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fecha_fin = new javax.swing.JTextField();
        fecha_inicial = new com.toedter.calendar.JDateChooser();
        fecha_ini = new javax.swing.JTextField();
        todos = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        btn_reimprimirpedido = new javax.swing.JButton();
        btn_usuexit1 = new javax.swing.JButton();
        btn_anular = new javax.swing.JButton();
        estados = new javax.swing.JLabel();
        cantidad = new javax.swing.JLabel();
        id_ped = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cant_detalle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(830, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_contado.setForeground(new java.awt.Color(255, 51, 51));
        jPanel_contado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel_contado.setMinimumSize(new java.awt.Dimension(760, 540));
        jPanel_contado.setName("Contado"); // NOI18N
        jPanel_contado.setPreferredSize(new java.awt.Dimension(760, 540));
        jPanel_contado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_pedidorea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id Pedido", "Proveedor", "Fecha", "Monto", "Título 5", "Título 6"
            }
        ));
        jTable_pedidorea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_pedidoreaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_pedidorea);

        jPanel_contado.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 740, 180));

        jTable_peddetalles.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable_peddetalles);

        jPanel_contado.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 590, 190));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Detalles");
        jPanel_contado.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 80, 20));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_calcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_calcular.setText("Calcular");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });
        jPanel1.add(btn_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 90, 40));

        contado.setText("CONTADO");
        contado.setOpaque(false);
        contado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contadoActionPerformed(evt);
            }
        });
        jPanel1.add(contado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        credito.setText("CREDITO");
        credito.setOpaque(false);
        credito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditoActionPerformed(evt);
            }
        });
        jPanel1.add(credito, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        fecha_final.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(fecha_final, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Hasta:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 50, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Desde:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 30));
        jPanel1.add(fecha_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, -1));

        fecha_inicial.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(fecha_inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, -1));
        jPanel1.add(fecha_ini, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, -1));

        todos.setSelected(true);
        todos.setText("TODOS");
        todos.setOpaque(false);
        todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosActionPerformed(evt);
            }
        });
        jPanel1.add(todos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jPanel_contado.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 110));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Pedidos");
        jPanel_contado.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, 20));

        btn_reimprimirpedido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_reimprimirpedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/printer.png"))); // NOI18N
        btn_reimprimirpedido.setText("ReImprimir");
        btn_reimprimirpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reimprimirpedidoActionPerformed(evt);
            }
        });
        jPanel_contado.add(btn_reimprimirpedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 130, 40));

        btn_usuexit1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_usuexit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/exit.png"))); // NOI18N
        btn_usuexit1.setText("Salir");
        btn_usuexit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuexit1ActionPerformed(evt);
            }
        });
        jPanel_contado.add(btn_usuexit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, 130, 40));

        btn_anular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_anular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/eliminar.png"))); // NOI18N
        btn_anular.setText("Anular ");
        btn_anular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anularActionPerformed(evt);
            }
        });
        jPanel_contado.add(btn_anular, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 130, 40));

        estados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estados.setText("estado");
        jPanel_contado.add(estados, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 100, -1));

        cantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cantidad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cantidad.setText("cant");
        jPanel_contado.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 60, 20));
        jPanel_contado.add(id_ped, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 70, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Cant.Pedido:");
        jPanel_contado.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 80, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Cant.Detalle:");
        jPanel_contado.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 80, 20));

        cant_detalle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cant_detalle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cant_detalle.setText("cant");
        jPanel_contado.add(cant_detalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 60, 20));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PEDIDOS REALIZADOS");
        jPanel_contado.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 370, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/fondosistema.jpg"))); // NOI18N
        jPanel_contado.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 580));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Desde:");
        jPanel_contado.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 50, 20));

        getContentPane().add(jPanel_contado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 590));
        jPanel_contado.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_reimprimirpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reimprimirpedidoActionPerformed

            Conexion cc=new Conexion();
            Connection con=cc.conectar();
                ////////////////////////////////imprimir/////////////////////////////////

                try {
                URL master = this.getClass().getResource("/reporte/re_nota_pedido.jasper");
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
                    
                    parametros.put("pedido_id", Integer.parseInt(id_ped.getText()));
                    JasperPrint print = JasperFillManager.fillReport(masterreport, parametros, con);
                    JasperViewer ver = new JasperViewer(print,false);
                    ver.setTitle("Re Imprimir Pedido");
                    ver.setVisible(true);
            } catch (Exception e) {
                System.out.println("reporte.reporte.Reportefichaupdate()" + e);
                JOptionPane.showMessageDialog(null, "Mensaje  "+ e);
            }    
         
         ///////////////////////////////////////////////////////////////////////////
        

    }//GEN-LAST:event_btn_reimprimirpedidoActionPerformed

    private void btn_usuexit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuexit1ActionPerformed
      dispose();
    }//GEN-LAST:event_btn_usuexit1ActionPerformed

    private void btn_anularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anularActionPerformed
        
        int aux  =  JOptionPane.showConfirmDialog(null, "Desea Anular Pedido ","Sistema", JOptionPane.YES_NO_OPTION);

        if(aux == JOptionPane.YES_OPTION){

            int n1 = jTable_pedidorea.getSelectedRow();
            String id1 = jTable_pedidorea.getValueAt(n1, 0).toString();
            id_ped.setText(id1);

            Conexion cc=new Conexion();
            Connection con=cc.conectar();

            try {

                String sql = "UPDATE pedido SET ped_anulada = '"+0+"' where ped_num_lg = '"+id_ped.getText()+"'";	
		
                st = con.createStatement();
                st.execute(sql);

               met_pedrealizados.CARGAR_JTABLE_pedido();

            }catch (Exception ee) {
                ee.printStackTrace();
            }

        }else{if(aux == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null,  "Cancelado", "Sistema", JOptionPane.INFORMATION_MESSAGE);

        }
        }
        
        btn_anular.setEnabled(false);
        btn_reimprimirpedido.setEnabled(false);
        
    }//GEN-LAST:event_btn_anularActionPerformed

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
       
        if(todos.isSelected()){
                String fechaObtenida = df.format(fecha_inicial.getDate());
                fecha_ini.setText(fechaObtenida);
        
                String fechafinal = df.format(fecha_final.getDate());
                fecha_fin.setText(fechafinal);
                met_pedrealizados.CARGAR_JTABLE_pedido_todos();
                
                Conexion cc=new Conexion();
                Connection con=cc.conectar();
                String sql="select count(*) from pedido where ped_fecha>='"+fecha_ini.getText()+"' and ped_fecha>='"+fecha_fin.getText()+"'";
                try {
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
                if(rs.next())
                {
                    cantidad.setText(rs.getString("count"));
                }

                } catch (SQLException ex) {
                    //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
                }

        }else if (contado.isSelected()) {
            
                String fechaObtenida = df.format(fecha_inicial.getDate());
                fecha_ini.setText(fechaObtenida);
        
                String fechafinal = df.format(fecha_final.getDate());
                fecha_fin.setText(fechafinal);
                met_pedrealizados.CARGAR_JTABLE_pedido();
               
                Conexion cc=new Conexion();
                Connection con=cc.conectar();
                String sql="select count(*) from pedido where ped_fecha>='"+fecha_ini.getText()+"' and ped_fecha>='"+fecha_fin.getText()+"' and ped_condicion = 'CONTADO'";
                try {
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
                if(rs.next())
                {
                    cantidad.setText(rs.getString("count"));
                }

                } catch (SQLException ex) {
                    //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        }else{
                String fechaObtenida = df.format(fecha_inicial.getDate());
                fecha_ini.setText(fechaObtenida);
        
                String fechafinal = df.format(fecha_final.getDate());
                fecha_fin.setText(fechafinal);
                met_pedrealizados.CARGAR_JTABLE_pedido_credito();
            
                Conexion cc=new Conexion();
                Connection con=cc.conectar();
                String sql="select count(*) from pedido where ped_fecha>='"+fecha_ini.getText()+"' and ped_fecha>='"+fecha_fin.getText()+"' and ped_condicion = 'CREDITO'";
                try {
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
                    if(rs.next())
                    {
                        cantidad.setText(rs.getString("count"));
                    }

                } catch (SQLException ex) {
                    //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        }
   
        
        btn_reimprimirpedido.setEnabled(true);


    }//GEN-LAST:event_btn_calcularActionPerformed

    private void jTable_pedidoreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_pedidoreaMouseClicked
        
 /*               int n0 = jTable_pedidorea.getSelectedRow();
                String id = jTable_pedidorea.getValueAt(n0, 0).toString();
                id_ped.setText(id);
        
 		Conexion cc=new Conexion();
		Connection con=cc.conectar();;
        	try {

		String sql = "Select ped_monto from pedido where pedido_id = '"+id_ped.getText()+"'";
		
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		if (rs.next()) {
                        monto.setText(rs.getString("ped_monto"));

                    }
			rs.close();
			st.close();
			con.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}*/
                int n12 = jTable_pedidorea.getSelectedRow();
                String id12 = jTable_pedidorea.getValueAt(n12, 4).toString();
                estados.setText(id12);
 
 
                int n1 = jTable_pedidorea.getSelectedRow();
                String id1 = jTable_pedidorea.getValueAt(n1, 0).toString();
                id_ped.setText(id1);
        
 		Conexion cc=new Conexion();
		Connection con=cc.conectar();;
        	try {

                String[] titulo={"id Ped","id prod.","Descripción","Cantidad","Precio"};
		DefaultTableModel mod=new DefaultTableModel(null,titulo);
		Object[] reg=new Object[7];
		String sql = "Select * from detallespedido where '"+id_ped.getText()+"' = pedido_id ";

                
                st = con.createStatement();
                ResultSet rs=st.executeQuery(sql);
		while (rs.next()) {
                    
                    
                       	reg[0]=rs.getString("pedido_id");
                        reg[1]=rs.getString("pedido_cod_prod");
			reg[2]=rs.getString("pedido_desc");
                        reg[3]=rs.getString("pedido_cant");
                        reg[4]=rs.getString("pedido_preciocompra");
				          
			mod.addRow(reg);

                    }
                    jTable_peddetalles.setModel(mod);
                    
                    TableColumnModel columnModel = jTable_peddetalles.getColumnModel();

                    columnModel.getColumn(0).setPreferredWidth(50);
                    columnModel.getColumn(1).setPreferredWidth(50);
                    columnModel.getColumn(2).setPreferredWidth(250);
                    columnModel.getColumn(3).setPreferredWidth(70);
                    columnModel.getColumn(4).setPreferredWidth(150);

			rs.close();
			st.close();
			con.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
          
        if (estados.getText().equals("ENTREGADO")){
            btn_anular.setEnabled(false);
        }
        if (estados.getText().equals("PENDIENTE")){
            btn_anular.setEnabled(true);
        }
                
        
    }//GEN-LAST:event_jTable_pedidoreaMouseClicked

    private void contadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contadoActionPerformed
           if(contado.isSelected()){
           //metodoproducto.CARGAR_JTABLE_productos_2();
           this.todos.setSelected(false);
           this.credito.setSelected(false);
        } 
    }//GEN-LAST:event_contadoActionPerformed

    private void todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosActionPerformed
           if(todos.isSelected()){
           //metodoproducto.CARGAR_JTABLE_productos_2();
           this.contado.setSelected(false);
           this.credito.setSelected(false);
        } 
    }//GEN-LAST:event_todosActionPerformed

    private void creditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditoActionPerformed
          if(credito.isSelected()){
           //metodoproducto.CARGAR_JTABLE_productos_2();
           this.contado.setSelected(false);
           this.todos.setSelected(false);
        } 
    }//GEN-LAST:event_creditoActionPerformed

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
            java.util.logging.Logger.getLogger(PedRealizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedRealizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedRealizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedRealizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedRealizados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_anular;
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_reimprimirpedido;
    private javax.swing.JButton btn_usuexit1;
    private javax.swing.JLabel cant_detalle;
    private javax.swing.JLabel cantidad;
    private javax.swing.JCheckBox contado;
    private javax.swing.JCheckBox credito;
    private javax.swing.JLabel estados;
    public static javax.swing.JTextField fecha_fin;
    private com.toedter.calendar.JDateChooser fecha_final;
    public static javax.swing.JTextField fecha_ini;
    private com.toedter.calendar.JDateChooser fecha_inicial;
    private javax.swing.JTextField id_ped;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_contado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_peddetalles;
    public static javax.swing.JTable jTable_pedidorea;
    private javax.swing.JCheckBox todos;
    // End of variables declaration//GEN-END:variables
}
