package dbstock;


import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
 
public class colour extends DefaultTableCellRenderer {
 
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
                                                   boolean isSelected, 
                                                   boolean hasFocus, 
                                                   int row, 
                                                   int column) {
 
//        String nro = (String) table.getValueAt(row, 4);
//        int numero = Integer.parseInt(nro);  
        int numero = (Integer) table.getValueAt(row, 3);
 
        if (numero >= 7) {
            setBackground(Color.GREEN);
            setForeground(Color.BLACK);
        } else if (numero >= 2 && numero < 7) {
            setBackground(Color.YELLOW);
            setForeground(Color.BLACK);
        } else {
            setBackground(Color.RED);
            setForeground(Color.BLACK);
        }
 
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
 
}