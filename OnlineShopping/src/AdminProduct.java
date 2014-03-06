/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AdminProduct.java
 *
 * Created on Mar 6, 2013, 7:26:20 PM
 */
/**
 *
 * @author hp
 */

import java.sql.*;
import javax.swing.*;
import java.io.*;
import javax.swing.table.*;

public class AdminProduct extends javax.swing.JPanel {

	/** Creates new form AdminProduct */
	public AdminProduct() {
		initComponents();
		fillcombo();
		
		updateTable( (String)categoryBox.getSelectedItem());
	}

	private void fillcombo()
	{
		categoryBox.removeAllItems();
		changestate = false;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",database.uname, database.password);
			String str = "Select * from category";
			pst = conn.prepareStatement(str);
			rs = pst.executeQuery();
			while (rs.next()) {
				
				String name = rs.getString(1);
				
				categoryBox.addItem(name);
			}
			conn.close();
			
			
			changestate = true;
			
		} catch (SQLException ex) {
			System.out.println(ex);
		}
	}
	
	private void updateTable(String cat)
	{
		DefaultTableModel model = new DefaultTableModel(){
		
			@Override
		public boolean isCellEditable(int row, int column){
			return false;
			
		}
		};
		itemtable.setModel(model);
		model.addColumn("Item Name");
		model.addColumn("Item Price");
		model.addColumn("Item Quantity");
		model.addColumn("Item Category");
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", database.uname, database.password);
			String query = "Select item_id, item_name, item_price, item_quantity from item where item_cat = ?";
			pst = conn.prepareStatement("select count(*) from item where item_cat = ?");
			pst.setString(1, cat);
			
			rs = pst.executeQuery();
			
			if (rs.next() && rs.getInt(1) > 0) {
				pst = conn.prepareStatement(query);
				pst.setString(1, cat);
				rs = pst.executeQuery();
				
				while (rs.next()) {
					model.addRow(new Object[] {rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4)});
				}
				
				String id = (String)itemtable.getModel().getValueAt(0, 0);
				
				conn.close();
				
					updateInfo(id);
			}
			else
				clearinfo();
			
			
		} catch (SQLException ex) {
			System.out.println(ex);
		}
		
	}
	
	private void updateInfo(String id)
	{
		try {
			
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",database.uname, database.password);
			
			String query = "Select * from item where item_id = ?";
			
			pst = conn.prepareStatement(query);
			pst.setString(1, id);
			rs =  pst.executeQuery();
			
			
			if (rs.next()) {
				item_id.setText(rs.getString(1));
				name.setText(rs.getString(2));
				price.setText(rs.getString(3));
				quantity.setText(rs.getString(4));
				details.setText(rs.getString(6));

		 
			
			if (rs.getBytes(7) != null) {
				ImageIcon b = new ImageIcon(rs.getBytes(7));
				ima.setIcon(b);
			}
			else {
				ima.setIcon(new ImageIcon());
			}
			
			}
			conn.close();
		} catch (SQLException ex) {
			System.out.println("error in connection");
		}
		
	}
	
	private void clearinfo()
	{
		item_id.setText("");
		name.setText("");
		price.setText("");
		quantity.setText("");
		ima.setIcon(new ImageIcon("nopic.png"));
		details.setText("");
	}
	
	
	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        values = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        item_id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        aId = new javax.swing.JLabel();
        aQuantity = new javax.swing.JLabel();
        aPrice = new javax.swing.JLabel();
        aName = new javax.swing.JLabel();
        changeimage = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        ima = new javax.swing.JLabel();
        commandPanel = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        addcategory = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemtable = new javax.swing.JTable();
        categoryBox = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        details = new javax.swing.JTextArea();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        values.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Shruti", 0, 18), new java.awt.Color(255, 51, 51))); // NOI18N
        values.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        item_id.setFont(new java.awt.Font("Tahoma", 0, 14));

        name.setFont(new java.awt.Font("Tahoma", 0, 14));

        quantity.setFont(new java.awt.Font("Tahoma", 0, 14));

        price.setFont(new java.awt.Font("Tahoma", 0, 14));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(item_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(quantity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(item_id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        aId.setFont(new java.awt.Font("Tahoma", 0, 12));
        aId.setText("Product Id");

        aQuantity.setFont(new java.awt.Font("Tahoma", 0, 12));
        aQuantity.setText("Product Quantity");

        aPrice.setFont(new java.awt.Font("Tahoma", 0, 12));
        aPrice.setText("Product Price");

        aName.setFont(new java.awt.Font("Tahoma", 0, 12));
        aName.setText("Product Name");

        changeimage.setFont(new java.awt.Font("Tahoma", 0, 14));
        changeimage.setText("Attach Image");
        changeimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeimageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(aName, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(aId, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(aQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(aPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                    .addComponent(changeimage))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(aId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(aName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(aPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(changeimage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ima.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ima.setBounds(0, 0, 260, 180);
        jDesktopPane1.add(ima, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout valuesLayout = new javax.swing.GroupLayout(values);
        values.setLayout(valuesLayout);
        valuesLayout.setHorizontalGroup(
            valuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(valuesLayout.createSequentialGroup()
                .addGroup(valuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(valuesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(valuesLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        valuesLayout.setVerticalGroup(
            valuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(valuesLayout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(valuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        add(values, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 380, 490));

        commandPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Commands", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 14), new java.awt.Color(0, 0, 255))); // NOI18N

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        addcategory.setFont(new java.awt.Font("Tahoma", 0, 12));
        addcategory.setText("Add category");
        addcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcategoryActionPerformed(evt);
            }
        });

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Tahoma", 0, 14));
        Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout commandPanelLayout = new javax.swing.GroupLayout(commandPanel);
        commandPanel.setLayout(commandPanelLayout);
        commandPanelLayout.setHorizontalGroup(
            commandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(commandPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(commandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addcategory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(refresh, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(Clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(edit, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addGap(75, 75, 75))
        );
        commandPanelLayout.setVerticalGroup(
            commandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(commandPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Clear)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        add(commandPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 170, 230));

        tablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product Table", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Shruti", 0, 18), java.awt.Color.red)); // NOI18N

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        itemtable.setGridColor(new java.awt.Color(255, 255, 255));
        itemtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(itemtable);

        categoryBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                categoryBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tablePanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(categoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addComponent(categoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(tablePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, -1));

        details.setColumns(20);
        details.setLineWrap(true);
        details.setRows(5);
        details.setWrapStyleWord(true);
        details.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Shruti", 0, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jScrollPane2.setViewportView(details);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 280, 180));
    }// </editor-fold>//GEN-END:initComponents

	private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
		try {
			 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",database.uname, database.password);
			
			String pid = item_id.getText(); 
			String pname = name.getText();
			
			String pcategory = (String) categoryBox.getSelectedItem();
			String pdetail = details.getText();
			
			pst = conn.prepareStatement("select count(*) from item where item_id = ?");
			pst.setString(1, pid);
			rs = pst.executeQuery();
			if (pid.equals("") || pname.equals("") || price.getText().equals("") || quantity.getText().equals("") ) {
				JOptionPane.showMessageDialog(this, "Invalid entry");
				return;
			}
			else if (rs.next() && rs.getInt(1) > 0) {
				JOptionPane.showMessageDialog(this, "Item id already exists");
				return;
			}
			else {
				 int pprice =  Integer.parseInt(price.getText());
				 int pquantity = Integer.parseInt(quantity.getText());
				String query = "Insert into item values(?, ?, ?, ?, ?, ?, ?)";
				pst = conn.prepareStatement(query);
				pst.setString(1, pid);
				pst.setString(2, pname);
				pst.setInt(3, pprice);
				pst.setInt(4, pquantity);
				pst.setString(5, pcategory);
				pst.setString(6, pdetail);
				
				if (imagechange) {
					pst.setBytes(7, image);
					
				}
				else
					pst.setBytes(7, null);
				imagechange = false;
				pst.execute();
				JOptionPane.showMessageDialog(this, "Item added successfully");
				updateTable((String)categoryBox.getSelectedItem());
			}
			conn.close();
			
		} catch (SQLException ex) {
			System.out.println(ex);
		}
	}//GEN-LAST:event_addActionPerformed

	private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
		clearinfo();
	}//GEN-LAST:event_ClearActionPerformed

	private void addcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcategoryActionPerformed
		String s = JOptionPane.showInputDialog("Enter new category name", "");
		while (s.equals("")) {
			JOptionPane.showMessageDialog(this, "plz enter some valid name");
			 s = JOptionPane.showInputDialog("Enter new category name", "");
		}
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",database.uname, database.password);
			
			pst = conn.prepareStatement("Select count(*) from category where cat = ?");
			pst.setString(1, s);
			
			rs = pst.executeQuery();
			if (rs.next() && rs.getInt(1) > 0) {
				JOptionPane.showMessageDialog(this, "category already present");
				return;
			}
			else {
				String insert = "Insert into category values(?)" ;
				pst = conn.prepareStatement(insert);
				pst.setString(1, s);
				boolean x = pst.execute();
				JOptionPane.showMessageDialog(this, "category added successfully");
			}
			conn.close();
			fillcombo();
		} catch (SQLException ex) {
			System.out.println(ex);
		}
		 
	}//GEN-LAST:event_addcategoryActionPerformed

	private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
		updateTable((String)categoryBox.getSelectedItem());
	}//GEN-LAST:event_refreshActionPerformed

	private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
		
		try {
			 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",database.uname, database.password);
			
			String pid = item_id.getText(); 
			String pname = name.getText();
			
			String pcategory = (String) categoryBox.getSelectedItem();
			String pdetail = details.getText();
			
			
			if (pid.equals("") || pname.equals("") || price.getText().equals("") || quantity.getText().equals("") ) {
				JOptionPane.showMessageDialog(this, "Invalid entry");
				return;
			}
			else if (!imagechange) {
				 int pprice =  Integer.parseInt(price.getText());
				 int pquantity = Integer.parseInt(quantity.getText());
				String query = "Update item set item_name = ?, item_price = ?, item_quantity = ?, item_detail = ? where item_id = ?";
				pst = conn.prepareStatement(query);
				pst.setString(1, pname);
				pst.setInt(2, pprice);
				pst.setInt(3, pquantity);
				pst.setString(4, pdetail);
				pst.setString(5, pid);
				pst.execute();
				JOptionPane.showMessageDialog(this, "Item updated successfully");
				conn.close();
				updateTable((String)categoryBox.getSelectedItem());
			}
			else {
				int pprice =  Integer.parseInt(price.getText());
				 int pquantity = Integer.parseInt(quantity.getText());
				String query = "Update item set item_name = ?, item_price = ?, item_quantity = ?, item_detail = ?, image = ? where item_id = ?";
				pst = conn.prepareStatement(query);
				pst.setString(1, pname);
				pst.setInt(2, pprice);
				pst.setInt(3, pquantity);
				pst.setString(4, pdetail);
				pst.setString(6, pid);
				pst.setBytes(5, image);
				imagechange = false;
				pst.execute();
				JOptionPane.showMessageDialog(this, "Item updated successfully");
				conn.close();
				updateTable((String)categoryBox.getSelectedItem());
				
			}
			
			
		} catch (SQLException ex) {
			System.out.println(ex);
		}
	}//GEN-LAST:event_editActionPerformed

	private void changeimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeimageActionPerformed
		if (item_id.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "please enter valid item id");
			return;
		}
			
		JFileChooser jf = new JFileChooser();
		jf.showOpenDialog(null);
		File f = jf.getSelectedFile();
				
		try {
			
			
			FileInputStream fis = new FileInputStream(f);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			byte[] by = new byte[1024];
			
			for (int readnum; (readnum = fis.read(by) ) != -1; ) {
				bos.write(by, 0, readnum);
				
			}
			
			image = bos.toByteArray();
			imagechange = true;
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}//GEN-LAST:event_changeimageActionPerformed

	private void categoryBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_categoryBoxItemStateChanged
		if (changestate) {
		String cat = (String) categoryBox.getSelectedItem();
		
		updateTable(cat);
		}
	}//GEN-LAST:event_categoryBoxItemStateChanged

	private void itemtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemtableMouseClicked
		
		int row = itemtable.getSelectedRow();
		String id = (String)itemtable.getModel().getValueAt(row, 0);
		updateInfo(id);	
	}//GEN-LAST:event_itemtableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JLabel aId;
    private javax.swing.JLabel aName;
    private javax.swing.JLabel aPrice;
    private javax.swing.JLabel aQuantity;
    private javax.swing.JButton add;
    private javax.swing.JButton addcategory;
    private javax.swing.JComboBox categoryBox;
    private javax.swing.JButton changeimage;
    private javax.swing.JPanel commandPanel;
    private javax.swing.JTextArea details;
    private javax.swing.JButton edit;
    private javax.swing.JLabel ima;
    private javax.swing.JTextField item_id;
    private javax.swing.JTable itemtable;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton refresh;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JPanel values;
    // End of variables declaration//GEN-END:variables
    private boolean changestate = false;
    private Connection conn;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement pst;
    boolean imagechange = false;
    byte[] image = null;
}
