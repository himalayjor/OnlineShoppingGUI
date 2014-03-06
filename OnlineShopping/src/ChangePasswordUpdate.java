
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ChangePasswordUpdate extends javax.swing.JPanel {

    /**
     * Creates new form ChangePasswordUpdate
     */
    Image img;
    public ChangePasswordUpdate() {
        initComponents();
        
        ImageIcon ic = new ImageIcon(getClass().getResource("images/bgchangePassword.jpg"));
        img = ic.getImage();
        
        Dimension d = new Dimension(img.getWidth(null), img.getHeight(null));
        setPreferredSize(d);
        setMinimumSize(d);
        setMaximumSize(d);
        setSize(d);
        
    }
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.drawImage(img, 0, 0, this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpassword = new javax.swing.JLabel();
        jnewpassword = new javax.swing.JLabel();
        jretypepassword = new javax.swing.JLabel();
        newpassword = new javax.swing.JPasswordField();
        currentpassword = new javax.swing.JPasswordField();
        retypepassword = new javax.swing.JPasswordField();
        savechnges = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        jpassword.setBackground(new java.awt.Color(255, 255, 255));
        jpassword.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jpassword.setForeground(new java.awt.Color(204, 51, 0));
        jpassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jpassword.setText("Current Password");

        jnewpassword.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jnewpassword.setForeground(new java.awt.Color(153, 0, 102));
        jnewpassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jnewpassword.setText("New Password");

        jretypepassword.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jretypepassword.setForeground(new java.awt.Color(153, 0, 102));
        jretypepassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jretypepassword.setText("Re Type Password");

        newpassword.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        newpassword.setForeground(new java.awt.Color(102, 102, 102));
        newpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newpassword.setBorder(null);
        newpassword.setCaretColor(new java.awt.Color(102, 102, 255));
        newpassword.setEchoChar('.');
        newpassword.setMargin(new java.awt.Insets(2, 15, 2, 2));

        currentpassword.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        currentpassword.setForeground(new java.awt.Color(102, 102, 102));
        currentpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        currentpassword.setBorder(null);
        currentpassword.setCaretColor(new java.awt.Color(102, 102, 255));
        currentpassword.setEchoChar('.');
        currentpassword.setMargin(new java.awt.Insets(2, 50, 2, 2));

        retypepassword.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        retypepassword.setForeground(new java.awt.Color(102, 102, 102));
        retypepassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        retypepassword.setBorder(null);
        retypepassword.setCaretColor(new java.awt.Color(102, 102, 255));
        retypepassword.setEchoChar('.');
        retypepassword.setMargin(new java.awt.Insets(2, 15, 2, 2));

        savechnges.setBackground(new java.awt.Color(153, 153, 255));
        savechnges.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        savechnges.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        savechnges.setText("Save Change");
        savechnges.setOpaque(true);
        savechnges.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savechngesMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("High Tower Text", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choose New Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(savechnges, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jretypepassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jnewpassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(currentpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(newpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(retypepassword))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpassword)
                    .addComponent(currentpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jnewpassword)
                    .addComponent(newpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jretypepassword)
                    .addComponent(retypepassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(savechnges, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void savechngesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savechngesMouseClicked
        String cupasswd = currentpassword.getText();
        String newpasswd = newpassword.getText();
        String repasswd = retypepassword.getText();
        
        if(!ShoppingFrame.per.pass.equals(cupasswd)){
            JOptionPane.showMessageDialog(null,"Current Password did not matched!", "oops!", 2);
            reset();
        }else if(newpasswd.equals("") || repasswd.equals("")){
            JOptionPane.showMessageDialog(null,"Invalid Password");
            reset();
        }else if(ShoppingFrame.per.pass.equals(cupasswd) && newpasswd.equals(repasswd)){
            ShoppingFrame.per.updatePassword(newpasswd);
            JOptionPane.showMessageDialog(null, "Password updated successfully");
        }else {
            JOptionPane.showMessageDialog(null,"Passwords did not matched", "oops!", 2);
            reset();
        }
        
    }//GEN-LAST:event_savechngesMouseClicked

    void reset() {
        currentpassword.setText("");
        newpassword.setText("");
        retypepassword.setText("");
        currentpassword.requestFocus();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField currentpassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jnewpassword;
    private javax.swing.JLabel jpassword;
    private javax.swing.JLabel jretypepassword;
    private javax.swing.JPasswordField newpassword;
    private javax.swing.JPasswordField retypepassword;
    private javax.swing.JLabel savechnges;
    // End of variables declaration//GEN-END:variables
}
