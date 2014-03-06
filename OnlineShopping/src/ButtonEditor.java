
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vikash
 */
public class ButtonEditor extends DefaultCellEditor {
  protected JButton button;
  private String label;
  private boolean   isPushed;
   
  public ButtonEditor(JCheckBox checkBox, String buttonText) {
    super(checkBox);
    label = buttonText;
    button = new JButton();
    button.setOpaque(true);
    button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        fireEditingStopped();
      }
    });
  }
  
    @Override
  public Component getTableCellEditorComponent(JTable table, Object value,
                   boolean isSelected, int row, int column) {
    if (isSelected) {
      button.setForeground(table.getSelectionForeground());
      button.setBackground(table.getSelectionBackground());
    } else{
      button.setForeground(table.getForeground());
      button.setBackground(table.getBackground());
    }

    button.setText( label );
    isPushed = true;
    return button;
  }
 
    @Override
  public Object getCellEditorValue() {
    
    isPushed = false;
    return label ;
  }
   
    @Override
  public boolean stopCellEditing() {
    isPushed = false;
    return super.stopCellEditing();
  }
 
    @Override
    protected void fireEditingStopped() {
        
    super.fireEditingStopped();
        ShoppingFrame.sfPublic.actionOfButton(label);
  }
}
