
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableCellRenderer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vikash
 */
public class ButtonRenderer extends JButton implements TableCellRenderer {
    String text;
    ButtonRenderer(String buttonText) {
        text = buttonText;
    }
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (isSelected) {
		setForeground(table.getSelectionForeground());
		setBackground(table.getSelectionBackground());
        } else{
		setForeground(table.getForeground());
		setBackground(UIManager.getColor("Button.background"));
	
        }
        setText(text);
        //setText( (value ==null) ? "" : value.toString() );
        return this;
    }
    
}
    
    

