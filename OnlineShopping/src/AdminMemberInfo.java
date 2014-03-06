/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AdminMemberInfo.java
 *
 * Created on Mar 9, 2013, 2:40:03 AM
 */
/**
 *
 * @author hp
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AdminMemberInfo extends javax.swing.JPanel {

	/** Creates new form AdminMemberInfo */
	public AdminMemberInfo() {
		initComponents();
		now = true;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",database.uname, database.password);
			String query = "select customer_id from customer";
			st = conn.createStatement();
			rs = st.executeQuery(query);
			
			while (rs.next()) {
				members.addItem(rs.getString(1));
			}
			
			conn.close();
			updateInfo();
		} catch (SQLException ex) {
			Logger.getLogger(AdminMemberInfo.class.getName()).log(Level.SEVERE, null, ex);
		}
		 now = false;
		
	}

	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        members = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jtextname = new javax.swing.JTextField();
        jemail_id = new javax.swing.JLabel();
        jtextemail_id = new javax.swing.JTextField();
        Jlabelpasswd = new javax.swing.JLabel();
        jpassword = new javax.swing.JPasswordField();
        jlabelconpasswd = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        jconfirmpassword = new javax.swing.JPasswordField();
        jusername = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Choose Member User id");
        add(jLabel1);
        jLabel1.setBounds(51, 45, 200, 28);

        members.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                membersItemStateChanged(evt);
            }
        });
        add(members);
        members.setBounds(25, 100, 316, 37);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Member Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 0, 24), new java.awt.Color(255, 51, 51))); // NOI18N

        jtextname.setEditable(false);
        jtextname.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N

        jemail_id.setBackground(new java.awt.Color(255, 0, 255));
        jemail_id.setFont(new java.awt.Font("Calibri", 0, 24));
        jemail_id.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jemail_id.setText("          Email ID");

        jtextemail_id.setEditable(false);
        jtextemail_id.setFont(new java.awt.Font("Calibri", 0, 24));

        Jlabelpasswd.setBackground(new java.awt.Color(255, 0, 255));
        Jlabelpasswd.setFont(new java.awt.Font("Calibri", 0, 24));
        Jlabelpasswd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Jlabelpasswd.setText("Password");

        jlabelconpasswd.setBackground(new java.awt.Color(255, 0, 255));
        jlabelconpasswd.setFont(new java.awt.Font("Calibri", 0, 24));
        jlabelconpasswd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlabelconpasswd.setText("Confirm Password");

        Save.setFont(new java.awt.Font("Batang", 1, 18)); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        jusername.setBackground(new java.awt.Color(255, 0, 204));
        jusername.setFont(new java.awt.Font("Calibri", 0, 24));
        jusername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jusername.setText("Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jusername, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jtextname))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jemail_id)
                        .addGap(46, 46, 46)
                        .addComponent(jtextemail_id, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Jlabelpasswd, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jlabelconpasswd)
                        .addGap(34, 34, 34)
                        .addComponent(jconfirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(Save)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jusername, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jtextname, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jemail_id, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jtextemail_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jlabelpasswd, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabelconpasswd, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jconfirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Save)
                .addGap(22, 22, 22))
        );

        add(jPanel1);
        jPanel1.setBounds(347, 45, 560, 346);
    }// </editor-fold>//GEN-END:initComponents

	private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
		if (jconfirmpassword.getText().equals(jpassword.getText())) {
			try {
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",database.uname, database.password);
				String query = "update Customer set customer_pwd = ? where customer_id = ?";
				
				pst = conn.prepareStatement(query);
				
				String uid = (String) members.getSelectedItem();
				pst.setString(1, jpassword.getText());
				pst.setString(2, uid);
				
				pst.execute();
				
				
				conn.commit();
				conn.close();
				
				JOptionPane.showMessageDialog(this, "Password saved successfully");
			} catch (SQLException ex) {
				Logger.getLogger(AdminMemberInfo.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		else {
			JOptionPane.showMessageDialog(Save, "Passwords Do not Match!", "User Error", 1);
		}
			
	}//GEN-LAST:event_SaveActionPerformed
	
	private void updateInfo()
	{
		try {
			String uid = (String) members.getSelectedItem();
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",database.uname, database.password);
			String query = "Select CUSTOMER_NAME from customer where CUSTOMER_ID = ?";
			pst = conn.prepareStatement(query);
			
			pst.setString(1, uid);
			rs = pst.executeQuery();
			
			if (rs.next()) {
				jtextname.setText(rs.getString(1));
				jconfirmpassword.setText("");
				jpassword.setText("");
				jtextemail_id.setText(uid);
			}
			
			
			conn.close();
		} catch (SQLException ex) {
			Logger.getLogger(AdminMemberInfo.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	private void membersItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_membersItemStateChanged
		if (!now)
		updateInfo();
	}//GEN-LAST:event_membersItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabelpasswd;
    private javax.swing.JButton Save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jconfirmpassword;
    private javax.swing.JLabel jemail_id;
    private javax.swing.JLabel jlabelconpasswd;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField jtextemail_id;
    private javax.swing.JTextField jtextname;
    private javax.swing.JLabel jusername;
    private javax.swing.JComboBox members;
    // End of variables declaration//GEN-END:variables

    private Connection conn;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement pst;
    private boolean now;
    
}
