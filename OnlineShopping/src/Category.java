

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vikash
 */


public class Category extends javax.swing.JPanel {

    /**
     * Creates new form Category
     */
    ArrayList<String> cat = new ArrayList<String>();
    int i = 0;
   DefaultTableModel model = new javax.swing.table.DefaultTableModel(
            new Object [][]{},
            new String [] {
                "Categories"
            }
            )
                      
            {
                boolean[] canEdit = new boolean [] {false};
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                     return canEdit [columnIndex];
                }
            };
    
    public Category() {
        initComponents();
        
        connection();
        
            for(int j = 0; j < cat.size(); j++){
               model.insertRow(j,new Object[]{ cat.get(j)});
            }
        
    }
    
    void connection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
                System.out.println(ex);
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", database.uname, database.password);
                String query = "select * from category";
                PreparedStatement st = con.prepareStatement(query);
                ResultSet rs = st.executeQuery(query);
                
                while(rs.next()){
                    String s = rs.getString(1);
                    cat.add(s);
                    i++;
                }
                con.close();
            
           
        } catch (SQLException ex) {
            System.out.println(ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jcategorytable = new javax.swing.JTable(model);

        jcategorytable.setModel(model);
        jcategorytable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcategorytableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jcategorytable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcategorytableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcategorytableMouseClicked
        int index = jcategorytable.getSelectedRow();
        if(cat.size() >= index && index >= 0){
            ShoppingFrame.sfPublic.callProductPanel(cat.get(index));
        }
    }//GEN-LAST:event_jcategorytableMouseClicked

       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jcategorytable;
    // End of variables declaration//GEN-END:variables
    String firstItem(){
        if(cat.size() > 0){
            return cat.get(0);
        }
        return "";
    }
  
   
}