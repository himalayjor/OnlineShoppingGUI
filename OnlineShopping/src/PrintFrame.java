/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PrintFrame.java
 *
 * Created on Mar 10, 2013, 12:40:14 AM
 */
/**
 *
 * @author hp
 */


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.table.*;

public class PrintFrame extends javax.swing.JFrame implements Printable {

	/** Creates new form PrintFrame */
	public PrintFrame(OrderClass order, Person per) {
		this.order = order;
		this.per = per;
		initComponents();
		setResizable(false);
		Initialize();
		
	}

	private void Initialize()
	{
		emaiid.setText(per.uName);
		custName.setText(per.name);
		custMobile.setText(per.mobileno);
		custCity.setText(per.city);
		
		shipName.setText(order.ship_name);
		ShipMob.setText(order.ship_mob);
		String add = order.ship_address;
		String add1 = "";
		String add2 = "";
		
                for (int i = 0; i < add.length(); i++) {
			if (i < 30)
				add1 += add.charAt(i);
			else
				add2 += add.charAt(i);
		}
		ShipAdd1.setText(add1);
		ShipAdd2.setText(add2);
		invoiceID.setText(invoiceID.getText() + " " + order.order_no);
		date.setText(date.getText() + " " + order.date);
		
		produceTable();
	}
	
	private void produceTable()
	{
		DefaultTableModel model = new DefaultTableModel(new Object[][]{},
			new String[] {"aaa", "bbb", "ccc", "ddd"} )
		 {
		 	@Override
		public boolean isCellEditable(int row, int column){
			return false;
			
		}
		
		 
		 };
		
		
		
		 jTable1.setModel(model);
		/*model.addColumn("    Item Name   ");
		model.addColumn("Quantity");
		model.addColumn("Price");
		model.addColumn("Total Price");
		*/
		TableColumn col = null;
		col = jTable1.getColumnModel().getColumn(0);
		col.setPreferredWidth(200);
		
		col = jTable1.getColumnModel().getColumn(1);
		col.setPreferredWidth(50);
		
		col = jTable1.getColumnModel().getColumn(2);
		col.setPreferredWidth(100);
		
		col = jTable1.getColumnModel().getColumn(3);
		col.setPreferredWidth(100);
		
		try {
			 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", database.uname, database.password);
			
			String query = "Select item_id, QUANTITY, SHOP_PRICE from invoice where ORDER_NO = ?";
			 pst = conn.prepareStatement(query);
			 pst.setInt(1, order.order_no);
			 rs = pst.executeQuery();
			 int quan, price;
			 
			 while (rs.next()) {
				
				quan = rs.getInt(2);
				price = rs.getInt(3);
				model.addRow(new Object[] {getName(rs.getString(1)), quan, price, getTot(quan, price) });
			 }
			
		} catch (SQLException ex) {
			Logger.getLogger(PrintFrame.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}
	
	private int getTot(int quan, int price)
	{
		int tot = price * quan;
		
		return tot;
	}
	
	private String getName(String itemid)
	{
		String val = null;
		try {
			String query = "Select item_name from item where item_id = ?";
			PreparedStatement ps = conn.prepareStatement(query);
		
			ps.setString(1, itemid);
			ResultSet r = ps.executeQuery();
			
			if (r.next()) {
				val = r.getString(1);
                        }
			
			
		} catch (SQLException ex) {
			Logger.getLogger(PrintFrame.class.getName()).log(Level.SEVERE, null, ex);
		}
		return val;
	}
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CompanyName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        date = new javax.swing.JLabel();
        invoiceID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        infoPAnel = new javax.swing.JPanel();
        emaiid = new javax.swing.JLabel();
        custCity = new javax.swing.JLabel();
        custName = new javax.swing.JLabel();
        custMobile = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        printButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ShipPanel = new javax.swing.JPanel();
        shipName = new javax.swing.JLabel();
        ShipAdd2 = new javax.swing.JLabel();
        ShipMob = new javax.swing.JLabel();
        ShipAdd1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        CompanyName1 = new javax.swing.JLabel();
        CompanyName2 = new javax.swing.JLabel();
        CompanyName3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTable1 = new javax.swing.JTable(new Object[][]{}, new String[] {

            "aaa", "bbb", "ccc", "ddd"});

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    CompanyName.setFont(new java.awt.Font("Monotype Corsiva", 0, 24));
    CompanyName.setForeground(new java.awt.Color(255, 51, 51));
    CompanyName.setText("Metro Credit Union");

    date.setFont(new java.awt.Font("Monotype Corsiva", 0, 24));
    date.setForeground(new java.awt.Color(255, 51, 51));
    date.setText("DATE:   ");

    invoiceID.setFont(new java.awt.Font("Monotype Corsiva", 0, 24));
    invoiceID.setForeground(new java.awt.Color(255, 51, 51));
    invoiceID.setText("Invoice no:      ");

    jLabel2.setFont(new java.awt.Font("Shruti", 0, 18));
    jLabel2.setText("Ship To");

    infoPAnel.setBackground(new java.awt.Color(255, 255, 255));
    infoPAnel.setLayout(null);

    emaiid.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18));
    emaiid.setText("email id");
    infoPAnel.add(emaiid);
    emaiid.setBounds(0, 0, 280, 25);

    custCity.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18));
    custCity.setText("City");
    infoPAnel.add(custCity);
    custCity.setBounds(0, 90, 280, 30);

    custName.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18));
    custName.setText("Name");
    infoPAnel.add(custName);
    custName.setBounds(0, 30, 280, 30);

    custMobile.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18));
    custMobile.setText("mobile");
    infoPAnel.add(custMobile);
    custMobile.setBounds(0, 60, 280, 25);

    printButton.setText("Print");
    printButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            PrintActionPerformed(evt);
        }
    });

    jLabel7.setFont(new java.awt.Font("Shruti", 0, 18));
    jLabel7.setText("Bill To:");

    ShipPanel.setBackground(new java.awt.Color(255, 255, 255));
    ShipPanel.setLayout(null);

    shipName.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18));
    shipName.setText("NAme");
    ShipPanel.add(shipName);
    shipName.setBounds(0, 5, 280, 20);

    ShipAdd2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18));
    ShipAdd2.setText("City");
    ShipPanel.add(ShipAdd2);
    ShipAdd2.setBounds(0, 110, 280, 25);

    ShipMob.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18));
    ShipMob.setText("mob");
    ShipPanel.add(ShipMob);
    ShipMob.setBounds(0, 30, 280, 40);

    ShipAdd1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18));
    ShipAdd1.setText("City");
    ShipPanel.add(ShipAdd1);
    ShipAdd1.setBounds(0, 80, 280, 25);

    logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mcuLogo.png"))); // NOI18N

    CompanyName1.setFont(new java.awt.Font("Monotype Corsiva", 0, 18));
    CompanyName1.setForeground(new java.awt.Color(51, 51, 51));
    CompanyName1.setText("1600 Amphitheatre Parkway,");

    CompanyName2.setFont(new java.awt.Font("Monotype Corsiva", 0, 18));
    CompanyName2.setText("Mountain View, CA 94043");

    CompanyName3.setFont(new java.awt.Font("Monotype Corsiva", 0, 18));
    CompanyName3.setText("California");

    jLabel1.setText("Item info");

    jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(infoPAnel, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(logo)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CompanyName2)
                        .addComponent(CompanyName)
                        .addComponent(CompanyName1)
                        .addComponent(CompanyName3))))
            .addGap(56, 56, 56)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(349, 349, 349)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(invoiceID, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(date))
                    .addContainerGap(74, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ShipPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26))))
        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(302, 302, 302)
            .addComponent(jLabel1)
            .addContainerGap(667, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(721, Short.MAX_VALUE)
            .addComponent(printButton)
            .addGap(236, 236, 236))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(280, 280, 280)
            .addComponent(jTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(282, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addComponent(date))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(34, 34, 34)
                                            .addComponent(CompanyName1))
                                        .addComponent(logo))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CompanyName3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(invoiceID))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(infoPAnel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(ShipPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel7))))
                    .addGap(27, 27, 27)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CompanyName)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                    .addComponent(CompanyName2)
                    .addGap(268, 268, 268)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(33, 33, 33)
            .addComponent(printButton)
            .addGap(114, 114, 114))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents
	
	private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
			
	PrinterJob job = PrinterJob.getPrinterJob();
		
         job.setPrintable(this);
         boolean ok = job.printDialog();
         if (ok) {
             try {
                  job.print();
             } catch (PrinterException ex) {
              /* The job did not successfully complete */
             }
	  
	 }
	}//GEN-LAST:event_PrintActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(PrintFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(PrintFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(PrintFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(PrintFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				Person p = null;
				OrderClass order = null;
				new PrintFrame(order, p).setVisible(true);
			}
		});
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CompanyName;
    private javax.swing.JLabel CompanyName1;
    private javax.swing.JLabel CompanyName2;
    private javax.swing.JLabel CompanyName3;
    private javax.swing.JLabel ShipAdd1;
    private javax.swing.JLabel ShipAdd2;
    private javax.swing.JLabel ShipMob;
    private javax.swing.JPanel ShipPanel;
    private javax.swing.JLabel custCity;
    private javax.swing.JLabel custMobile;
    private javax.swing.JLabel custName;
    private javax.swing.JLabel date;
    private javax.swing.JLabel emaiid;
    private javax.swing.JPanel infoPAnel;
    private javax.swing.JLabel invoiceID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logo;
    private javax.swing.JButton printButton;
    private javax.swing.JLabel shipName;
    // End of variables declaration//GEN-END:variables
    private OrderClass order;
    private Person per;
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    
	@Override
	public int print(Graphics g, PageFormat pf, int pageIndex) throws PrinterException {
		if (pageIndex > 0) 
			return NO_SUCH_PAGE;
		printButton.setVisible(false);
		
		 Graphics2D g2d = (Graphics2D)g;
			g2d.translate(pf.getImageableX(), pf.getImageableY());
		
		
		double pageWidth = pf.getImageableWidth();
		double x = this.getWidth();
		
		
		double scale = 1;
		if (x > pageWidth)
			scale = pageWidth/x;
		
		g2d.scale(scale, scale);
			
		
		this.print(g);
		
		if (pageIndex >= 1)
		return NO_SUCH_PAGE;
		
		return Printable.PAGE_EXISTS;
	}
}
