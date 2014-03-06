
import java.awt.*;
import java.net.URL;
import javax.swing.*;

/**
 *
 * @author vikash
 */
public class UpdateInformation extends javax.swing.JPanel {

    
    Image img;
    
    public UpdateInformation() {
        initComponents();
        
        ImageIcon ic = new ImageIcon(getClass().getResource("images/bgUpdatePanel.jpg"));
        img = ic.getImage();
        
        Dimension d = new Dimension(img.getWidth(null), img.getHeight(null));
        setPreferredSize(d);
        setMinimumSize(d);
        setMaximumSize(d);
        setSize(d);
        
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.drawImage(img, 0, 0, this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewHistory = new javax.swing.JLabel();
        updateprofile = new javax.swing.JLabel();
        changepassword = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setOpaque(false);

        ViewHistory.setBackground(new java.awt.Color(255, 255, 255));
        ViewHistory.setFont(new java.awt.Font("French Script MT", 1, 36)); // NOI18N
        ViewHistory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewHistory.setText("View History");
        ViewHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewHistoryMouseClicked(evt);
            }
        });

        updateprofile.setBackground(new java.awt.Color(255, 255, 255));
        updateprofile.setFont(new java.awt.Font("French Script MT", 1, 36)); // NOI18N
        updateprofile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateprofile.setText("Update Profile");
        updateprofile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateprofileMouseClicked(evt);
            }
        });

        changepassword.setBackground(new java.awt.Color(255, 255, 255));
        changepassword.setFont(new java.awt.Font("French Script MT", 1, 36)); // NOI18N
        changepassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changepassword.setText("Change Password");
        changepassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changepasswordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ViewHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateprofile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changepassword, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(ViewHistory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateprofile)
                .addGap(12, 12, 12)
                .addComponent(changepassword)
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void changepasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepasswordMouseClicked
        CardLayout card = (CardLayout)(ShoppingFrame.sfPublic.right).getLayout();
        card.show((ShoppingFrame.sfPublic.right), "changePassword");
    }//GEN-LAST:event_changepasswordMouseClicked

    private void updateprofileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateprofileMouseClicked
        CardLayout card = (CardLayout)(ShoppingFrame.sfPublic.right).getLayout();
        card.show((ShoppingFrame.sfPublic.right), "updateProfile");
        ShoppingFrame.sfPublic.setFieldsOfUpdateProfile();
    }//GEN-LAST:event_updateprofileMouseClicked

    private void ViewHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewHistoryMouseClicked
        ShoppingFrame.sfPublic.callHistoryPanelForUpdate();
        CardLayout card = (CardLayout)(ShoppingFrame.sfPublic.right).getLayout();
        card.show((ShoppingFrame.sfPublic.right), "history");
    }//GEN-LAST:event_ViewHistoryMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ViewHistory;
    private javax.swing.JLabel changepassword;
    private javax.swing.JLabel updateprofile;
    // End of variables declaration//GEN-END:variables
}
