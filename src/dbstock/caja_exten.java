/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;

import static dbstock.Principal.fecha_ini;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
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
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
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
public class caja_exten extends javax.swing.JFrame {

        Statement st;
    Connection con;
    /**
     * Creates new form caja_exten
     */
    public caja_exten() {
        initComponents();
        
        this.setLocationRelativeTo(null);//centra el formulario
        this.setTitle("Caja");
        
         //MOSTRAR FECHA Y HORA DEL SISTEMA
        Calendar Cal= Calendar.getInstance();
        String hora=Cal.get(Cal.HOUR_OF_DAY)+":"+Cal.get(Cal.MINUTE)+":"+Cal.get(Cal.SECOND);
        String fecha= Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+"/"+Cal.get(Cal.YEAR);
        cierre_fecha.setText(fecha);
        txt_hora.setText(hora);
        
        Timer tiempo = new Timer(100, new caja_exten.horass());
        tiempo.start();
        
              
        jDateChooser_de.setCalendar(Cal);
        jDateChooser_has.setCalendar(Cal);

        
        MetodoCaja.CARGAR_JTABLE_venta_caja_CONTADO();
        
        MetodoCaja.CARGAR_JTABLE_venta_caja_CREDITO();
        MetodoCaja.CARGAR_JTABLE_detcobranza();
        
        MetodoCaja.CARGAR_JTABLE_ingreso_caja();
        credito_total.setText("0");
        caja_contado.setText("0");
        MetodoCaja.mostrar_monto_credito();
        MetodoCaja.mostrar_monto_contado();
        
        MetodoCaja.mostrar_monto_ingreso();
        MetodoCaja.mostrar_monto_cobranza();
        
        //////gasto/////
        MetodoCaja.CARGAR_JTABLE_gasto_CAJA();
        MetodoCaja.mostrar_monto_egreso();
        //////////////fin gasto
        
        /////////////fecha ultimo cierre
        MetodoCaja.mostrar_ultimocierre();
        ////////////////////////////////
        MetodoCaja.CARGAR_JTABLE_HISTORICO();

        
        credito_total.setEditable(false);
        cobranza_caja.setEditable(false);
        ingreso_dinero.setEditable(false);
        caja_contado.setEditable(false);
        INGRESO_CAJA.setEditable(false);
        EGRESO.setEditable(false);  
        CAJA_TOTAL.setEditable(false); 
        ci_suc.setEditable(false); 
        
        cobranzas_suma_ingreso.setVisible(false);
        ingreso_suma.setVisible(false);
        contado_suma.setVisible(false);
        gasto_caja_suma.setVisible(false);
        ing_parasuma.setVisible(false);
        credito_uso.setVisible(false);
        estado_txt.setVisible(false);
        
       BTN_REIMPRIMIR.setEnabled(false);
        
        btn_print.setEnabled(false);
       
        jDateChooser_de.setEnabled(false);
        jDateChooser_has.setEnabled(false);
        btn_calc.setEnabled(false);
        
       
                    String INGRESO = ingreso_suma.getText();
                    String COBRANZA = cobranzas_suma_ingreso.getText();
                    String CONTADO = contado_suma.getText();

                    int intIngreso = parseInt(INGRESO);
                    int intCobranza = parseInt(COBRANZA);
                    int intcontado = parseInt(CONTADO);

                    int suma_caja_total = intIngreso + intCobranza + intcontado;
                    String StringSUMA = Integer.toString(suma_caja_total);
                    
                    INGRESO_CAJA.setText(StringSUMA);
                    ing_parasuma.setText(StringSUMA);
                    DecimalFormat formatea = new DecimalFormat("###,###,###,###.##");
                    int mostrarngreso = parseInt(StringSUMA); 
                    INGRESO_CAJA.setText(formatea.format(mostrarngreso));
                    
                    
                    ////GASTOS
                    String GASTO = gasto_caja_suma.getText();
                    
                   
                    int intGasto = parseInt(GASTO);
                    DecimalFormat formateaGasto = new DecimalFormat("###,###,###,###.##");
                    gasto_caja.setText(formateaGasto.format(intGasto));
                    EGRESO.setText(formateaGasto.format(intGasto));
                    
                    //// totsl caja//////
                    
                    String CAJA_ingreso= ing_parasuma.getText();
                    String CAJA_egreso= gasto_caja_suma.getText();
                    
                    int intCAJAingreso = parseInt(CAJA_ingreso);
                    int intCAJAsalida = parseInt(CAJA_egreso);
                    
                    int sumatoria = intCAJAingreso - intCAJAsalida;
                    //cajasincoma.getText(sumatoria);
                    DecimalFormat formateacajatotal = new DecimalFormat("###,###,###,###.##");
                    CAJA_TOTAL.setText(formateacajatotal.format(sumatoria));
                    
                    
        int j;
        int cont=1;
        String num="";
        String c="";
        
        Conexion cc=new Conexion();
	Connection con=cc.conectar();
        // String sql="select max(ped_num) from pedido";
        String sql="select count(*) from cierrecaja";
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
                int add = nume ;  
                String cadena = Integer.toString(add);
                id.setText(cadena);
                
            }
            
            if(c==null){
                pedido_cod.setText("00000001");
                
                id.setText(rs.getString("count"));  
                int nume = parseInt(id.getText());
                int add = nume ;  
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
                int add = nume ;  
                String cadena = Integer.toString(add);
                id.setText(cadena);
            }

        } catch (SQLException ex) {
           //Logger.getLogger(Factura1.class.getName()).log(Level.SEVERE, null, ex);
        }
           MetodoCaja.mostrar_ultimocierre();         
        //MetodoCaja.mostrar_estado();     
        
        MetodoCaja.mostrar_apertura_cierre();
        
    }
    
    
    
    class horass implements ActionListener{
         
        public void actionPerformed(ActionEvent e){
            Date sisHora = new Date();
            String pmAm = "hh:mm:ss a";
            SimpleDateFormat format = new SimpleDateFormat(pmAm);
            Calendar hoy = Calendar.getInstance();
            txt_hora.setText(String.format(format.format(sisHora),hoy));
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

        materialColor1 = new efectos.MaterialColor();
        materialShadow1 = new efectos.MaterialShadow();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Credito = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_cobranzacierre = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_ingreso = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_contado = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        ingreso_suma = new javax.swing.JTextField();
        ingreso_dinero = new javax.swing.JTextField();
        cobranza_caja = new javax.swing.JTextField();
        cobranzas_suma_ingreso = new javax.swing.JTextField();
        credito_total = new javax.swing.JTextField();
        contado_suma = new javax.swing.JTextField();
        caja_contado = new javax.swing.JTextField();
        estado_txt = new javax.swing.JTextField();
        credito_uso = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        JTABLE_GASTO_CAJA = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        gasto_caja = new javax.swing.JTextField();
        gasto_caja_suma = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable_historico = new javax.swing.JTable();
        BTN_REIMPRIMIR = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        id_historico = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        fecha_cierre = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        cierre_fecha = new javax.swing.JLabel();
        pedido_cod = new javax.swing.JLabel();
        txt_hora = new javax.swing.JLabel();
        txt_usuario_cierre = new javax.swing.JLabel();
        fechacierrefin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        INGRESO_CAJA = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        EGRESO = new javax.swing.JTextField();
        egre_parasuma = new javax.swing.JLabel();
        CAJA_TOTAL = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        cierre_caja_button = new javax.swing.JButton();
        ing_parasuma = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btn_calc = new javax.swing.JButton();
        jDateChooser_has = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser_de = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        ci_suc = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        reload_button = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Botones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 370, 70));

        jTable_Credito.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_Credito);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 360, 110));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setText("Detalla de Ventas Crédito");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setText("Total Crédito");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setText("Facturas Crédito Cobradas");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jtable_cobranzacierre.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtable_cobranzacierre);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 360, 110));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setText("Total Cobrado");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, 30));

        jTable_ingreso.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable_ingreso);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 360, 100));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel11.setText("Ingreso de Dinero Efectivo");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jTable_contado.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable_contado);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 520, 340));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel12.setText("Detalle de Ventas Contado");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 160, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("TOTAL CONTADO");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 140, 30));

        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, 110, 40));

        jButton4.setText("DETALLES");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 100, 30));

        jButton5.setText("DETALLES");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 100, 30));

        jButton6.setText("DETALLES");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, 30));

        btn_print.setText("IMPRIMIR ");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        jPanel3.add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 120, 40));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel24.setText("Total Ingreso de Dinero");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, 30));

        ingreso_suma.setText("jTextField1");
        jPanel3.add(ingreso_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        ingreso_dinero.setBackground(new java.awt.Color(0, 102, 0));
        ingreso_dinero.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ingreso_dinero.setForeground(new java.awt.Color(255, 255, 255));
        ingreso_dinero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ingreso_dinero.setText("jTextField1");
        jPanel3.add(ingreso_dinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 120, -1));

        cobranza_caja.setBackground(new java.awt.Color(0, 102, 0));
        cobranza_caja.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cobranza_caja.setForeground(new java.awt.Color(255, 255, 255));
        cobranza_caja.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cobranza_caja.setText("jTextField1");
        jPanel3.add(cobranza_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 300, 100, -1));

        cobranzas_suma_ingreso.setText("jTextField1");
        jPanel3.add(cobranzas_suma_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        credito_total.setBackground(new java.awt.Color(153, 153, 0));
        credito_total.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        credito_total.setForeground(new java.awt.Color(255, 255, 255));
        credito_total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        credito_total.setText("jTextField1");
        jPanel3.add(credito_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 110, -1));

        contado_suma.setText("jTextField1");
        jPanel3.add(contado_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 410, -1, -1));

        caja_contado.setBackground(new java.awt.Color(0, 102, 0));
        caja_contado.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        caja_contado.setForeground(new java.awt.Color(255, 255, 255));
        caja_contado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel3.add(caja_contado, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, 150, -1));

        estado_txt.setText("jTextField1");
        jPanel3.add(estado_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, -1, -1));

        credito_uso.setText("jTextField1");
        jPanel3.add(credito_uso, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 110, -1));

        jTabbedPane1.addTab("-----INGRESO-----", jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTABLE_GASTO_CAJA.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(JTABLE_GASTO_CAJA);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 590, 200));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("TOTAL GASTO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 110, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setText("Detalle de Gastos");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        gasto_caja.setBackground(new java.awt.Color(255, 153, 0));
        gasto_caja.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        gasto_caja.setForeground(new java.awt.Color(255, 255, 255));
        gasto_caja.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        gasto_caja.setText("jTextField1");
        jPanel2.add(gasto_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 120, -1));

        gasto_caja_suma.setText("jTextField2");
        jPanel2.add(gasto_caja_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 120, -1));

        jButton11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton11.setText("Detalles");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 80, -1));

        jTabbedPane1.addTab("-----EGRESOS-----", jPanel2);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_historico.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_historico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_historicoMouseClicked(evt);
            }
        });
        jTable_historico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable_historicoKeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(jTable_historico);

        jPanel6.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 840, 320));

        BTN_REIMPRIMIR.setText("IMPRIMIR");
        BTN_REIMPRIMIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_REIMPRIMIRActionPerformed(evt);
            }
        });
        jPanel6.add(BTN_REIMPRIMIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 100, 40));

        jButton10.setText("SALIR");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 402, 90, 40));
        jPanel6.add(id_historico, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 40, 20));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel14.setText("Fecha Cierre");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 80, 20));
        jPanel6.add(fecha_cierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 100, 20));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel17.setText("ID:");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 20, 20));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel25.setText("HISTORICO DE CIERRES REALIZADOS");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        jTabbedPane1.addTab("-----HISTORICO----", jPanel6);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 910, 510));

        cierre_fecha.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cierre_fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cierre_fecha.setText("txt_fecha");
        getContentPane().add(cierre_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 90, -1));

        pedido_cod.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        pedido_cod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pedido_cod.setText("txt_cierre_nro");
        getContentPane().add(pedido_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 70, -1));

        txt_hora.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_hora.setText("txt_hora");
        getContentPane().add(txt_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 90, -1));

        txt_usuario_cierre.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_usuario_cierre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_usuario_cierre.setText("txt_usuario_caja");
        getContentPane().add(txt_usuario_cierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 150, -1));

        fechacierrefin.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        fechacierrefin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fechacierrefin.setText("txt_fecha_ult");
        getContentPane().add(fechacierrefin, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 130, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setText("CIERRE DE CAJA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cierre", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton1.setText("MOV. CAJA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 140, 40));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TOTAL INGRESO");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 140, -1));

        INGRESO_CAJA.setBackground(new java.awt.Color(0, 102, 0));
        INGRESO_CAJA.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        INGRESO_CAJA.setForeground(new java.awt.Color(255, 255, 255));
        INGRESO_CAJA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(INGRESO_CAJA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 140, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("TOTAL EGRESO");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 140, -1));

        EGRESO.setBackground(new java.awt.Color(204, 153, 0));
        EGRESO.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        EGRESO.setForeground(new java.awt.Color(255, 255, 255));
        EGRESO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(EGRESO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 140, -1));

        egre_parasuma.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        egre_parasuma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        egre_parasuma.setText("CAJA");
        jPanel4.add(egre_parasuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 249, 140, 30));

        CAJA_TOTAL.setBackground(new java.awt.Color(153, 0, 0));
        CAJA_TOTAL.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        CAJA_TOTAL.setForeground(new java.awt.Color(255, 255, 255));
        CAJA_TOTAL.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(CAJA_TOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 140, -1));

        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton2.setText("APERTURA DE CJ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 40));

        cierre_caja_button.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cierre_caja_button.setText("CERRAR CAJA");
        cierre_caja_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cierre_caja_buttonActionPerformed(evt);
            }
        });
        jPanel4.add(cierre_caja_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, 40));

        ing_parasuma.setText("jTextField1");
        jPanel4.add(ing_parasuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 220, 160, 330));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_calc.setText("Calcular");
        jPanel5.add(btn_calc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 90, 30));
        jPanel5.add(jDateChooser_has, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 140, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Fecha Hasta:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 100, 90, -1));
        jPanel5.add(jDateChooser_de, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, 30));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setText("Fecha Desde:");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        ci_suc.setBackground(new java.awt.Color(0, 153, 153));
        ci_suc.setForeground(new java.awt.Color(255, 255, 255));
        ci_suc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ci_suc.setText("SUCURSAL 1");
        jPanel5.add(ci_suc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, 160, 190));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 110, 20));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel18.setText("Fecha de ultimo cierre:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel20.setText("Usuario:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 60, -1));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Fecha:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 90, -1));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel22.setText("Caja");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 40, -1));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Hora:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 0, 60, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setText("Cierre N°:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        reload_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/reload.png"))); // NOI18N
        reload_button.setText("RECALCULO");
        reload_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reload_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(reload_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 160, 30));

        id.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        id.setEnabled(false);
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 30, 20));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbstock/img/fondosistema.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         
                       
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        cobranza cob = new cobranza();
        cob.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ingresos ingreso = new ingresos();
        ingreso.setVisible(true);
        
        ingresos.jTabbedPane1.setSelectedIndex(1);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mov_caja ver_caja = new mov_caja();
        ver_caja.setVisible(true); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
          consulta_vta consulta = new consulta_vta();
                consulta.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        int j;
        int cont=1;
        String num="";
        String c="";
        
        Conexion cc=new Conexion();
	Connection con=cc.conectar();
        // String sql="select max(ped_num) from pedido";
        String sql="select count(*) from cierrecaja";
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
        
        
        apertura APER = new apertura();
        APER.setVisible(true);
        
        apertura.jTabbedPane1.setSelectedIndex(0);
        
        apertura.label_ingreso.setText("APERTURA DE CAJA");
        Calendar Cal= Calendar.getInstance();
        String hora1=Cal.get(Cal.HOUR_OF_DAY)+":"+Cal.get(Cal.MINUTE)+":"+Cal.get(Cal.SECOND);
        String fecha1= Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+"/"+Cal.get(Cal.YEAR);
        apertura.obs_ingreso.setText("APERTURA DE CAJA - FECHA = " + fecha1 + " Hora: " + hora1);
        
        MetodoCaja.mostrar_apertura_cierre();
       // MetodoCaja.mostrar_estado();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void reload_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reload_buttonActionPerformed
        MetodoCaja.CARGAR_JTABLE_venta_caja_CONTADO();
        
        MetodoCaja.CARGAR_JTABLE_venta_caja_CREDITO();
        MetodoCaja.CARGAR_JTABLE_detcobranza();
        
        MetodoCaja.CARGAR_JTABLE_ingreso_caja();

        MetodoCaja.mostrar_monto_credito();
        MetodoCaja.mostrar_monto_contado();
        
        MetodoCaja.mostrar_monto_ingreso();
        MetodoCaja.mostrar_monto_cobranza();
        
        //////gasto/////
        MetodoCaja.CARGAR_JTABLE_gasto_CAJA();
        MetodoCaja.mostrar_monto_egreso();
        
        MetodoCaja.CARGAR_JTABLE_HISTORICO();

        
         
                    String INGRESO = ingreso_suma.getText();
                    String COBRANZA = cobranzas_suma_ingreso.getText();
                    String CONTADO = contado_suma.getText();

                    int intIngreso = parseInt(INGRESO);
                    int intCobranza = parseInt(COBRANZA);
                    int intcontado = parseInt(CONTADO);

                    int suma_caja_total = intIngreso + intCobranza + intcontado;
                    String StringSUMA = Integer.toString(suma_caja_total);
                    
                    INGRESO_CAJA.setText(StringSUMA);
                    ing_parasuma.setText(StringSUMA);
                    DecimalFormat formatea = new DecimalFormat("###,###,###,###.##");
                    int mostrarngreso = parseInt(StringSUMA); 
                    INGRESO_CAJA.setText(formatea.format(mostrarngreso));
                    
                    
                    ////GASTOS
                    String GASTO = gasto_caja_suma.getText();
                    
                   
                    int intGasto = parseInt(GASTO);
                    DecimalFormat formateaGasto = new DecimalFormat("###,###,###,###.##");
                    gasto_caja.setText(formateaGasto.format(intGasto));
                    EGRESO.setText(formateaGasto.format(intGasto));
                    
                    //// totsl caja//////
                    
                    String CAJA_ingreso= ing_parasuma.getText();
                    String CAJA_egreso= gasto_caja_suma.getText();
                    
                    int intCAJAingreso = parseInt(CAJA_ingreso);
                    int intCAJAsalida = parseInt(CAJA_egreso);
                    
                    int sumatoria = intCAJAingreso - intCAJAsalida;
                    
                  //  cajasincoma.setText(Integer.toString(sumatoria));
                    
                 //   String total=String.valueOf(sumatoria);
                   //     cajasincoma.setText(total);
                    DecimalFormat formateacajatotal = new DecimalFormat("###,###,###,###.##");
       
                    CAJA_TOTAL.setText(formateacajatotal.format(sumatoria));
        
                 MetodoCaja.mostrar_ultimocierre();
                 
             
                 
        
    }//GEN-LAST:event_reload_buttonActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        gastos gasto = new gastos();
        gasto.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void cierre_caja_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cierre_caja_buttonActionPerformed
  

                String CAJA_ingreso= ing_parasuma.getText();
                    String CAJA_egreso= gasto_caja_suma.getText();
                    
                    int intCAJAingreso = parseInt(CAJA_ingreso);
                    int intCAJAsalida = parseInt(CAJA_egreso);
                    
                    int sumatoria = intCAJAingreso - intCAJAsalida;
                           
                    
        Conexion cc=new Conexion();
        Connection con=cc.conectar();
        int estad = 2;
        try {     
            
            String updacierre = "UPDATE cierrecaja SET ci_fechacierre = '"+cierre_fecha.getText()+"', ci_usuariocierre ='"+txt_usuario_cierre.getText()+"'"
            + ",ci_credito = '"+credito_uso.getText()+"', ci_cobranza = '"+cobranzas_suma_ingreso.getText()+"', ci_ingreso = '"+ingreso_suma.getText()+"' "
            + ",ci_contado = '"+contado_suma.getText()+"',ci_egreso = '"+gasto_caja_suma.getText()+"', ci_totalingreso = '"+ing_parasuma.getText()+"' "
            + ",ci_totalegreso = '"+gasto_caja_suma.getText()+"', ci_sucursal = '"+ci_suc.getText()+"', ci_totalcaja ='"+sumatoria+"'"
            + ",ci_estado ='"+estad+"' where ci_nro = '"+id.getText()+"' ";
             st = con.createStatement();
             st.execute(updacierre); 

          
     
          //  st.close();
          //  con.close(); 
            
        } catch (SQLException ex) {
                      System.out.println("ver error " + ex.getMessage());

        }  
        
        int estado = 2;
  

        try {     
            
            String updactevta = "UPDATE venta SET ci_estado = '"+estado+"'  where vta_fecha = '"+cierre_fecha.getText()+"' and ci_estado = '1' ";
             st = con.createStatement();
             st.execute(updactevta); 

            //JOptionPane.showMessageDialog(null, "Cierre de Caja Realizada con exito"); 
     
           // st.close();
           // con.close(); 
            
        } catch (SQLException ex) {
            System.out.println("ver error " + ex.getMessage());

        } 
        
        try {     
            
            String updacteingreso = "UPDATE ingreso SET ci_estado = '"+estado+"'  where ing_fecha = '"+cierre_fecha.getText()+"' and ci_estado = '1' ";
             st = con.createStatement();
             st.execute(updacteingreso); 

            //JOptionPane.showMessageDialog(null, "Cierre de Caja Realizada con exito"); 
     
          //  st.close();
          //  con.close(); 
            
        } catch (SQLException ex) {
            System.out.println("ver error " + ex.getMessage());

        }
        
        try {     
            
            String updacteingreso = "UPDATE detcobranza SET ci_estado = '"+estado+"'  where cbdeta_fecha = '"+cierre_fecha.getText()+"' and ci_estado = '1' ";
             st = con.createStatement();
             st.execute(updacteingreso); 

            //JOptionPane.showMessageDialog(null, "Cierre de Caja Realizada con exito"); 
     
          //  st.close();
          //  con.close(); 
            
        } catch (SQLException ex) {
            System.out.println("ver error " + ex.getMessage());

        }
        

        
        int estadogasto =2;
        try {     
            
            String updactegastp = "UPDATE gastos SET ci_estado = '"+estadogasto+"'  where gas_fecha = '"+cierre_fecha.getText()+"' and ci_estado = '1' ";
             st = con.createStatement();
             st.execute(updactegastp); 

            //JOptionPane.showMessageDialog(null, "Cierre de Caja Realizada con exito"); 
     
           // st.close();
           // con.close(); 
            
        } catch (SQLException ex) {
            System.out.println("ver error " + ex.getMessage());

        }
        
        
                    
      int cerarcaja = 0;
        try {     
            
            String updactecaja = "UPDATE caja SET caj_montogs = '"+cerarcaja+"' ";
             st = con.createStatement();
             st.execute(updactecaja); 

            //JOptionPane.showMessageDialog(null, "Cierre de Caja Realizada con exito"); 
     
           // st.close();
            //con.close(); 
            
                 
        
        JOptionPane.showMessageDialog(null, "Cierre de Caja Realizada con exito"); 
        
        
        } catch (SQLException ex) {
            System.out.println("ver error " + ex.getMessage());

        }
        
       // reload_button.doClick();
    
        
        
        
          
        credito_total.setText("0");
        cobranza_caja.setText("0");
        ingreso_dinero.setText("0");
        caja_contado.setText("0");
        credito_uso.setText("0");
        cobranzas_suma_ingreso.setText("0");
        ingreso_suma.setText("0");
        contado_suma.setText("0");
    
        gasto_caja_suma.setText("0");
        INGRESO_CAJA.setText("0");
        CAJA_TOTAL.setText("0");
        EGRESO.setText("0");
       
        jButton2.setEnabled(true);
        cierre_caja_button.setEnabled(false);
        
        jTable_contado.setModel(new DefaultTableModel());
        jTable_Credito.setModel(new DefaultTableModel());
        jtable_cobranzacierre.setModel(new DefaultTableModel());
        JTABLE_GASTO_CAJA.setModel(new DefaultTableModel());
        jTable_ingreso.setModel(new DefaultTableModel());
        
        
        
        
        
        
        //Conexion cc=new Conexion();
          //  Connection con=cc.conectar();
         ////////////////////////////////imprimir/////////////////////////////////

                try {
                URL master = this.getClass().getResource("/reporte/cierrecaja_report.jasper");
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
                    
                    parametros.put("id_cierre", Integer.parseInt(id.getText()));
                    JasperPrint print = JasperFillManager.fillReport(masterreport, parametros, con);
                    JasperViewer ver = new JasperViewer(print,false);
                    ver.setTitle("Cierre de Caja");
                    ver.setVisible(true);
            } catch (Exception e) {
                System.out.println("reporte.reporte.Reportefichaupdate()" + e);
                JOptionPane.showMessageDialog(null, "Mensaje  "+ e);
            }    
        
        reload_button.doClick();
                
        
    }//GEN-LAST:event_cierre_caja_buttonActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
 /*               Conexion cc=new Conexion();
            Connection con=cc.conectar();
         ////////////////////////////////imprimir/////////////////////////////////

                try {
                URL master = this.getClass().getResource("/reporte/cierrecaja_report.jasper");
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
                    
                    parametros.put("id_cierre", Integer.parseInt(id.getText()));
                    JasperPrint print = JasperFillManager.fillReport(masterreport, parametros, con);
                    JasperViewer ver = new JasperViewer(print,false);
                    ver.setTitle("Cierre de Caja");
                    ver.setVisible(true);
            } catch (Exception e) {
                System.out.println("reporte.reporte.Reportefichaupdate()" + e);
                JOptionPane.showMessageDialog(null, "Mensaje  "+ e);
            }  */
    }//GEN-LAST:event_btn_printActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTable_historicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_historicoMouseClicked
       
        int n1 = jTable_historico.getSelectedRow();
        String id = jTable_historico.getValueAt(n1, 0).toString();
        id_historico.setText(id);
        
        int n2 = jTable_historico.getSelectedRow();
        String id2 = jTable_historico.getValueAt(n2, 2).toString();
        fecha_cierre.setText(id2);
        
        BTN_REIMPRIMIR.setEnabled(true);
        
    }//GEN-LAST:event_jTable_historicoMouseClicked

    private void jTable_historicoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_historicoKeyReleased
                if ((evt.getKeyCode() == KeyEvent.VK_DOWN) || (evt.getKeyCode() == KeyEvent.VK_UP)) {
                int filaSeleccionada = this.jTable_historico.getSelectedRow();//Identificamos que fila ha sido seleccionada

                try {
                    this.id_historico.setText(jTable_historico.getValueAt(filaSeleccionada, 0).toString());
                    this.fecha_cierre.setText(jTable_historico.getValueAt(filaSeleccionada, 2).toString());
                   // this.cli_direccion.setText(jTable_cliente.getValueAt(filaSeleccionada, 2).toString());
                    //this.cli_direccion.setSelectedItem(jTable_cliente.getValueAt(filaSeleccionada, 2).toString());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al leer datos de la tabla", "Error", JOptionPane.WARNING_MESSAGE);
                }
        }
    }//GEN-LAST:event_jTable_historicoKeyReleased

    private void BTN_REIMPRIMIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_REIMPRIMIRActionPerformed
                Conexion cc=new Conexion();
            Connection con=cc.conectar();
         ////////////////////////////////imprimir/////////////////////////////////

                try {
                URL master = this.getClass().getResource("/reporte/cierrecaja_report.jasper");
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
                    
                    parametros.put("id_cierre", Integer.parseInt(id_historico.getText()));
                    JasperPrint print = JasperFillManager.fillReport(masterreport, parametros, con);
                    JasperViewer ver = new JasperViewer(print,false);
                    ver.setTitle("Cierre de Caja");
                    ver.setVisible(true);
            } catch (Exception e) {
                System.out.println("reporte.reporte.Reportefichaupdate()" + e);
                JOptionPane.showMessageDialog(null, "Mensaje  "+ e);
            }    
    }//GEN-LAST:event_BTN_REIMPRIMIRActionPerformed

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
            java.util.logging.Logger.getLogger(caja_exten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(caja_exten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(caja_exten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(caja_exten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new caja_exten().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_REIMPRIMIR;
    public static javax.swing.JTextField CAJA_TOTAL;
    public static javax.swing.JTextField EGRESO;
    public static javax.swing.JTextField INGRESO_CAJA;
    public static javax.swing.JTable JTABLE_GASTO_CAJA;
    private javax.swing.JButton btn_calc;
    private javax.swing.JButton btn_print;
    public static javax.swing.JTextField caja_contado;
    public static javax.swing.JTextField ci_suc;
    public static javax.swing.JButton cierre_caja_button;
    public static javax.swing.JLabel cierre_fecha;
    public static javax.swing.JTextField cobranza_caja;
    public static javax.swing.JTextField cobranzas_suma_ingreso;
    public static javax.swing.JTextField contado_suma;
    public static javax.swing.JTextField credito_total;
    public static javax.swing.JTextField credito_uso;
    private javax.swing.JLabel egre_parasuma;
    public static javax.swing.JTextField estado_txt;
    private javax.swing.JLabel fecha_cierre;
    public static javax.swing.JLabel fechacierrefin;
    public static javax.swing.JTextField gasto_caja;
    public static javax.swing.JTextField gasto_caja_suma;
    public static javax.swing.JTextField id;
    private javax.swing.JLabel id_historico;
    public static javax.swing.JTextField ing_parasuma;
    public static javax.swing.JTextField ingreso_dinero;
    public static javax.swing.JTextField ingreso_suma;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    public static javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser_de;
    private com.toedter.calendar.JDateChooser jDateChooser_has;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTable jTable_Credito;
    public static javax.swing.JTable jTable_contado;
    public static javax.swing.JTable jTable_historico;
    public static javax.swing.JTable jTable_ingreso;
    public static javax.swing.JTable jtable_cobranzacierre;
    private efectos.MaterialColor materialColor1;
    private efectos.MaterialShadow materialShadow1;
    private javax.swing.JLabel pedido_cod;
    public static javax.swing.JButton reload_button;
    private javax.swing.JLabel txt_hora;
    public static javax.swing.JLabel txt_usuario_cierre;
    // End of variables declaration//GEN-END:variables
}
