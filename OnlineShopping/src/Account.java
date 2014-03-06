
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vikash
 */

import java.sql.*;
import java.util.*;
import javax.swing.ImageIcon;
public class Account extends javax.swing.JPanel {

    /**
     * Creates new form Account
     */
    database object = new database();
   Image img;
    public Account() {
        initComponents();
        
        ImageIcon ic = new ImageIcon(getClass().getResource("images/bg4Account.jpg"));
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
    
    public void SetFields() {
        jtextemail_id.setText(ShoppingFrame.per.uName);
        jtextname.setText(ShoppingFrame.per.name);
        jtextcity.setText(ShoppingFrame.per.city);
        jtextmobile.setText(ShoppingFrame.per.mobileno);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jAccountPannel = new javax.swing.JPanel();
        jusername = new javax.swing.JLabel();
        jemail_id = new javax.swing.JLabel();
        jmobilenumber = new javax.swing.JLabel();
        jcity = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtextname = new javax.swing.JLabel();
        jtextemail_id = new javax.swing.JLabel();
        jtextcity = new javax.swing.JLabel();
        jtextmobile = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jAccountPannel.setBackground(new java.awt.Color(255, 255, 255));
        jAccountPannel.setOpaque(false);

        jusername.setBackground(new java.awt.Color(255, 255, 255));
        jusername.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jusername.setForeground(new java.awt.Color(204, 0, 0));
        jusername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jusername.setText("Name");

        jemail_id.setBackground(new java.awt.Color(255, 0, 255));
        jemail_id.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jemail_id.setForeground(new java.awt.Color(204, 0, 0));
        jemail_id.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jemail_id.setText("          Email ID");

        jmobilenumber.setBackground(new java.awt.Color(255, 0, 255));
        jmobilenumber.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jmobilenumber.setForeground(new java.awt.Color(204, 0, 0));
        jmobilenumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jmobilenumber.setText("                     Mobile name");

        jcity.setBackground(new java.awt.Color(255, 51, 255));
        jcity.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jcity.setForeground(new java.awt.Color(204, 0, 0));
        jcity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jcity.setText("                      City   ");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Your Account Information");

        jtextname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtextname.setForeground(new java.awt.Color(255, 255, 255));

        jtextemail_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtextemail_id.setForeground(new java.awt.Color(255, 255, 255));

        jtextcity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtextcity.setForeground(new java.awt.Color(255, 255, 255));

        jtextmobile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtextmobile.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jAccountPannelLayout = new javax.swing.GroupLayout(jAccountPannel);
        jAccountPannel.setLayout(jAccountPannelLayout);
        jAccountPannelLayout.setHorizontalGroup(
            jAccountPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAccountPannelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jAccountPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jAccountPannelLayout.createSequentialGroup()
                        .addGroup(jAccountPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcity)
                            .addComponent(jmobilenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jemail_id, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jusername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jAccountPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtextname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtextemail_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtextcity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtextmobile, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jAccountPannelLayout.setVerticalGroup(
            jAccountPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAccountPannelLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jAccountPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jusername, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jtextname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jAccountPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jemail_id, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtextemail_id, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jAccountPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcity, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(jtextcity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jAccountPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jmobilenumber, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jtextmobile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        add(jAccountPannel, "card2");
    }// </editor-fold>//GEN-END:initComponents
  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jAccountPannel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jcity;
    private javax.swing.JLabel jemail_id;
    private javax.swing.JLabel jmobilenumber;
    private javax.swing.JLabel jtextcity;
    private javax.swing.JLabel jtextemail_id;
    private javax.swing.JLabel jtextmobile;
    private javax.swing.JLabel jtextname;
    private javax.swing.JLabel jusername;
    // End of variables declaration//GEN-END:variables
}
