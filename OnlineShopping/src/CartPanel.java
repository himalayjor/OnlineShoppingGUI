
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.*;


public class CartPanel extends javax.swing.JPanel {
    
    
    // do not remove this model, it sets the renderer and editor for the cells.
    DefaultTableModel model = new DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "  Name  ", "Price", "Quantity", "Amount", "Remove"
            }
         ) {
             Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
	     
            boolean[] canEdit = new boolean [] {false, false, false, true, false, true};
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
             @Override
            public Class<?> getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
         };
    
    public CartPanel() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                buyButton = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                totalAmount = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable(model);
                jLabel2 = new javax.swing.JLabel();
                okButton = new javax.swing.JButton();
                jSpinner1 = new javax.swing.JSpinner();

                setBackground(new java.awt.Color(204, 204, 255));

                buyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add to Cart.jpg"))); // NOI18N
                buyButton.setText("Check Out");
                buyButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                buyButtonMouseClicked(evt);
                        }
                });
                buyButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                buyButtonActionPerformed(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("MS PMincho", 1, 24)); // NOI18N
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                jLabel1.setText("Total    Rs. ");

                totalAmount.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
                totalAmount.setForeground(new java.awt.Color(0, 153, 153));
                totalAmount.setText("00");

                jLabel3.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/continue_shopping.png"))); // NOI18N
                jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jLabel3.setOpaque(true);
                jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jLabel3MouseClicked(evt);
                        }
                });

                jTable1.getColumn("Remove").setCellRenderer(new ButtonRenderer("X"));
                jTable1.getColumn("Remove").setCellEditor(new ButtonEditor(new JCheckBox(), "X"));
                jTable1.setModel(model);
                jTable1.setRowHeight(25);
                jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jTable1MouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(jTable1);
                jTable1.setFillsViewportHeight(true);

                jLabel2.setText("Change Quantity:");

                okButton.setText("ok");
                okButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                okButtonActionPerformed(evt);
                        }
                });

                jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999, 1));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(94, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(okButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addComponent(jLabel3)))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(totalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(buyButton))
                                .addGap(24, 24, 24))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(totalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(okButton)
                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addComponent(jLabel3)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                                .addComponent(buyButton)
                                                .addGap(22, 22, 22))))
                );
        }// </editor-fold>//GEN-END:initComponents

    private void buyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyButtonMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_buyButtonMouseClicked

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        // TODO add your handling code here:
        updateTable();
    }//GEN-LAST:event_okButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        if (index >= 0) {
            int q = (Integer) jTable1.getValueAt(index, 2);
            jSpinner1.setValue(q);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        
        CardLayout card = (CardLayout)(this.getParent()).getLayout();
        card.show(this.getParent(), "product");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        // TODO add your handling code here:
        if (jTable1.getRowCount() < 1) {
            JOptionPane.showMessageDialog(null, "Empty Cart");
        } else {
            
            CardLayout card = (CardLayout)this.getParent().getLayout();
            card.show(this.getParent(), "checkout");
            ShoppingFrame.sfPublic.fillFields();
        }
    }//GEN-LAST:event_buyButtonActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton buyButton;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JSpinner jSpinner1;
        public javax.swing.JTable jTable1;
        private javax.swing.JButton okButton;
        private javax.swing.JLabel totalAmount;
        // End of variables declaration//GEN-END:variables
    
    
    void updater(ArrayList arr) {
        model = new DefaultTableModel(
            new Object [][] {},
            new String [] {"  Name  ", "Price", "Quantity", "Amount", "Remove"}
         ) {
             Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {false, false, false, false, true};
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
            
             @Override
            public Class<?> getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        };
        jTable1.setModel(model);
        
        TableColumn column = null;
        column = jTable1.getColumnModel().getColumn(0);
        column.setPreferredWidth(200);
        column = jTable1.getColumnModel().getColumn(1);
        column.setPreferredWidth(50);
        column = jTable1.getColumnModel().getColumn(2);
        column.setPreferredWidth(50);
        column = jTable1.getColumnModel().getColumn(3);
        column.setPreferredWidth(50);
        column = jTable1.getColumnModel().getColumn(4);
        column.setPreferredWidth(5);
        
        
        for (int i = 0; i < arr.size(); i++) {
            
            itemObject x = (itemObject) arr.get(i);
            String str = "   " + x.name;
            model.addRow(new Object[] {str, x.price, x.quantity, x.quantity * x.price, ""});
            jTable1.getColumn("Remove").setCellRenderer(new ButtonRenderer("X"));
           jTable1.getColumn("Remove").setCellEditor(new ButtonEditor(new JCheckBox(), "X"));
            
        }
        updateTotalAmount();
    }
    
    void deleteSelectedRow() {
        int choice;
        choice = JOptionPane.showConfirmDialog(null, "Are you sure ?", "Confirm", 2);
        
        if (choice == 0) {
            int selectedRow = jTable1.getSelectedRow();
            itemObject item = (itemObject) ShoppingFrame.sfPublic.cartObject.getAtIndex(selectedRow);
            
            ((DefaultTableModel)jTable1.getModel()).removeRow(selectedRow); // Removed from table
            ShoppingFrame.sfPublic.cartObject.remove(item.id); // Removed from DataStructure
            
            updateTotalAmount();
        }
    }
    
    void updateTotalAmount() {
        int total = ShoppingFrame.sfPublic.cartObject.getFinalPrice();
        totalAmount.setText(String.valueOf(total));
    }
    
    void updateTable() {
        int numberOfRows = jTable1.getRowCount();
        int selectedRow = jTable1.getSelectedRow();
        int quantity;

        quantity = (Integer) jSpinner1.getValue();
        if (quantity < 1) {
            JOptionPane.showMessageDialog(null, "oops! Invalid Quantity");
            jSpinner1.setValue(1);
            return;
        }
        else if (quantity > 1000) {
            JOptionPane.showMessageDialog(null, "Sorry! That's too Large Quantity. (Max 1000 at a time)");
            jSpinner1.setValue(1);
            return;
        }
        
        if (selectedRow >= 0) {
            int price = (Integer) jTable1.getValueAt(selectedRow, 1);
            

            ShoppingFrame.sfPublic.cartObject.changeQuantity(selectedRow, quantity);
            int amount = price * quantity;
	    
            jTable1.setValueAt(quantity, selectedRow, 2);
            jTable1.setValueAt(amount, selectedRow, 3);
            jSpinner1.setValue(1);
            
            updateTotalAmount();
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select an Item frist.");
        }
    }
    
}
