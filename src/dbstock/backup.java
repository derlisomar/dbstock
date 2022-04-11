/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;

import static java.awt.PageAttributes.MediaType.C;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.TryNode;

/**
 *
 * @author Derlis
 */
public class backup {
    
public static void backup() throws IOException {
    
        Calendar Cal= Calendar.getInstance();
        String hora=Cal.get(Cal.HOUR_OF_DAY)+":"+Cal.get(Cal.MINUTE)+":"+Cal.get(Cal.SECOND);
        String fecha= Cal.get(Cal.DATE)+"-"+(Cal.get(Cal.MONTH)+1)+"-"+Cal.get(Cal.YEAR);


        File directorio = new File("C:\\Sistema\\dbstock\\Backup\\"+fecha+"");
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                
                Runtime.getRuntime().exec("cmd /c start C:\\Sistema\\dbstock\\cmbRespaldo.bat");
                System.out.println("Directorio creado");
                
                //Runtime.getRuntime().exec("cmd /c start C:\\Sistema\\dbstock\\cmbRespaldo2.bat");
                
                
            } else {
                System.out.println("Error al crear directorio");
            }
        }
          
    
}

        
    
}
