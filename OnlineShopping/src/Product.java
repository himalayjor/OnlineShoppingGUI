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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
public class Product extends javax.swing.JPanel {

    /**
     * Creates new form Product
     */
   ArrayList arr;
   DefaultTableModel model = new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
            },
            new String [] {"Item Name", "Item Price", "Add to Cart"}
        )  {
                boolean[] canEdit = new boolean [] {false, false, true};
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                     return canEdit [columnIndex];
                }
            };
           
   
   protected String[] columnToolTips = { "you wana to buy CLICK add to cart", "you wana to buy CLICK add to cart", null };
    
   public Product()  {
        initComponents();
    }
   
   
    public void printTable(String cat){
           arr = new ArrayList();
	   
           try {
             Class.forName("oracle.jdbc.driver.OracleDriver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
            }
	   
	   
         Connection con = null;
	 
         try {
               con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", database.uname, database.password);
               String query = "select * from item where item_cat = '" + cat + "'";
	    
               PreparedStatement st = con.prepareStatement("select count(*) from item where item_cat = ?");
               st.setString(1, cat);
               ResultSet rs = st.executeQuery();
               if(rs.next() && rs.getInt(1) > 0){
                   st = con.prepareStatement(query);
                   rs = st.executeQuery();
		   
                    while(rs.next()){
			if (rs.getBytes(7) != null) {
                            arr.add(new ItemInfo(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6),(new ImageIcon(rs.getBytes(7)))));
                        }
			else {
                            arr.add(new ItemInfo(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6),(new ImageIcon() ) ) );
                        }
                    }
              }
	       
	       con.close();
            }catch (SQLException ex) {
              System.out.println(" sucess fully first2");
             System.out.println(ex);
         }
            
             update(arr);
    }
    
    void update(ArrayList arr){
         model = new DefaultTableModel(
                 new Object [][] {
            },
            new String [] {
                "Item Name", "Item Price", "Add to Cart"
            }
            )
                      
            {
                boolean[] canEdit = new boolean [] {false, false, true};
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                     return canEdit [columnIndex];
                }
            };
        jproducttable.setModel(model);
        TableColumn column = jproducttable.getColumnModel().getColumn(2);
        column.setPreferredWidth(10);
        if(arr.size() > 0){
            ItemInfo x = (ItemInfo)arr.get(0);
            jpricelabel.setText(String.valueOf(x.Item_Price));
            jpiclabel.setIcon(x.b);
            jtextdet.setText(x.Item_det);
            jitemnamelabel.setText(x.Item_Name);

            for(int j = 0; j < arr.size(); j++ ){
                x = (ItemInfo)arr.get(j);
                model.insertRow(j, new Object[]{x.Item_Name, x.Item_Price,""});
                 jproducttable.getColumn("Add to Cart").setCellRenderer(new ButtonRenderer("+"));
                 jproducttable.getColumn("Add to Cart").setCellEditor(new ButtonEditor(new JCheckBox(), "+"));
            }
        }else {
            jpricelabel.setText("");
            jpiclabel.setIcon(new ImageIcon());
            jtextdet.setText("");
            jitemnamelabel.setText("");
            JOptionPane.showMessageDialog(null, " No Item Available In This Category ");
        }
    }
  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jproduct = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jproducttable = new javax.swing.JTable(model);
        jpiclabel = new javax.swing.JLabel();
        jpricelabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtextdet = new javax.swing.JTextArea();
        jpricelabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jitemnamelabel = new javax.swing.JLabel();

        jScrollPane3.setViewportView(jEditorPane1);

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new java.awt.CardLayout());

        jproduct.setBackground(new java.awt.Color(255, 204, 153));
        jproduct.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jproduct.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N

        jScrollPane2.setBackground(new java.awt.Color(153, 153, 255));

        jproducttable.setFillsViewportHeight(true);
        jproducttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jproducttableMouseClicked(evt);
            }
        });
        jproducttable.getColumn("Add to Cart").setCellRenderer(new ButtonRenderer("+"));
        jproducttable.getColumn("Add to Cart").setCellEditor(new ButtonEditor(new JCheckBox(), "+"));
        jproducttable.setRowHeight(25);
        jScrollPane2.setViewportView(jproducttable);
        jproducttable.setFillsViewportHeight(true);

        jpiclabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));

        jpricelabel.setBackground(new java.awt.Color(153, 153, 153));
        jpricelabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jpricelabel.setForeground(new java.awt.Color(51, 0, 51));
        jpricelabel.setText("00");

        jtextdet.setEditable(false);
        jtextdet.setBackground(new java.awt.Color(204, 255, 204));
        jtextdet.setColumns(20);
        jtextdet.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jtextdet.setLineWrap(true);
        jtextdet.setRows(5);
        jtextdet.setWrapStyleWord(true);
        jtextdet.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("AngsanaUPC", 0, 24), new java.awt.Color(51, 102, 255))); // NOI18N
        jScrollPane1.setViewportView(jtextdet);

        jpricelabel1.setBackground(new java.awt.Color(153, 153, 153));
        jpricelabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jpricelabel1.setForeground(new java.awt.Color(0, 153, 51));
        jpricelabel1.setText("Price");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stock-vector-vector-shopping-cart-item-add-buttons-90691471.jpg"))); // NOI18N
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jitemnamelabel.setFont(new java.awt.Font("Microsoft Himalaya", 0, 36)); // NOI18N
        jitemnamelabel.setForeground(new java.awt.Color(255, 0, 0));
        jitemnamelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jitemnamelabel.setText("Name");

        javax.swing.GroupLayout jproductLayout = new javax.swing.GroupLayout(jproduct);
        jproduct.setLayout(jproductLayout);
        jproductLayout.setHorizontalGroup(
            jproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jproductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpiclabel, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jproductLayout.createSequentialGroup()
                        .addComponent(jpricelabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpricelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jitemnamelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jproductLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );
        jproductLayout.setVerticalGroup(
            jproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jproductLayout.createSequentialGroup()
                .addGroup(jproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jproductLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jproductLayout.createSequentialGroup()
                                .addComponent(jitemnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jpricelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpricelabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jproductLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpiclabel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jproduct, "card2");
    }// </editor-fold>//GEN-END:initComponents

    
    private void jproducttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jproducttableMouseClicked
       
            int  index = jproducttable.getSelectedRow();
            if(arr.size() >= index){
                updateInfo(index);
            }
      
    }//GEN-LAST:event_jproducttableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int  index = (jproducttable.getSelectedRow() >= 0 ? jproducttable.getSelectedRow() : 0);
            if(index >= 0){
                ItemInfo x = (ItemInfo) arr.get(index);
                ShoppingFrame.sfPublic.addTOcartobject(x.Item_Id);
                JOptionPane.showMessageDialog(null, "Added!");
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    void updateInfo(int i){
        
        ItemInfo x = (ItemInfo) arr.get(i);
        jpricelabel.setText(String.valueOf(x.Item_Price));
        jpiclabel.setIcon(x.b);
        jtextdet.setText(x.Item_det);
        jitemnamelabel.setText(x.Item_Name);
        
        
    }
    public void addToCart(){
        int index = jproducttable.getSelectedRow();
        ItemInfo x = (ItemInfo) arr.get(index);
        ShoppingFrame.sfPublic.addTOcartobject(x.Item_Id);
        JOptionPane.showMessageDialog(null, " added ");
    }
   
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jitemnamelabel;
    private javax.swing.JLabel jpiclabel;
    private javax.swing.JLabel jpricelabel;
    private javax.swing.JLabel jpricelabel1;
    private javax.swing.JPanel jproduct;
    public javax.swing.JTable jproducttable;
    private javax.swing.JTextArea jtextdet;
    // End of variables declaration//GEN-END:variables

}   
