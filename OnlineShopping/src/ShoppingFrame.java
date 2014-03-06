
import java.awt.CardLayout;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 * 
 * 
 */

public class ShoppingFrame extends javax.swing.JFrame {
        public static ShoppingFrame sfPublic;
        public static Person per;
        CartClass cartObject;
        
        public ShoppingFrame(Person per) {
                initComponents();
                this.setResizable(false);
                //this.setBounds(0, 0, 959, 600);
                
                obtaindate(); // Initialise Date-Time
                userid_txt.setText("Welcome, " + per.name);
                
                adsPanel1.changeImage(); // Start Thread for Image ads. :)
		
                this.sfPublic = this;
		this.per = per;
                history1.askParent();
                cartObject = new CartClass();
		product1.printTable(category1.firstItem());
                
                checkout1 = new Checkout();        /* Make new Checkout card manually. Unable from drag n drop! :( */
                account1 = new Account(); /* Make new Account card manually. Unable from drag n drop! :( */
                
                right.add(checkout1, "checkout");  /* Adding this card to right panel */
		right.add(account1, "account");    /* Adding this card to right panel */
		
                CardLayout card = (CardLayout) right.getLayout();
		card.show(right, "product1");
                card = (CardLayout) left.getLayout();
                card.show(left, "category");
                
                // Adding temporary items to cart for functionality
                cartObject.add("1", 2);
                cartObject.add("2", 2);
                cartObject.add("5", 2);
                cartObject.add("Book2", 3);
                cartObject.add("3", 4);
                cartObject.add("3", 4);
                cartObject.add("3", 4);
                cartObject.add("3", 4);
                cartObject.add("3", 4);
                cartObject.add("Musci1", 4);
        }

	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Banner = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        signOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userid_txt = new javax.swing.JLabel();
        time_txt = new javax.swing.JLabel();
        date_text = new javax.swing.JLabel();
        MCUlogo = new javax.swing.JLabel();
        right = new javax.swing.JPanel();
        product1 = new Product();
        history1 = new History();
        cartPanel1 = new CartPanel();
        updateProfile1 = new updateProfile();
        changePasswordUpdate1 = new ChangePasswordUpdate();
        left = new javax.swing.JPanel();
        updateInformation1 = new UpdateInformation();
        category1 = new Category();
        ads = new javax.swing.JPanel();
        adsPanel1 = new adsPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Banner.setBackground(new java.awt.Color(204, 204, 255));

        jToolBar1.setBorder(null);
        jToolBar1.setRollover(true);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account.png"))); // NOI18N
        jButton2.setText("Account");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/continue.jpg"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1361639918_shopping-cart.png"))); // NOI18N
        jButton3.setText("Cart");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help-icon.jpg"))); // NOI18N
        jButton4.setText("Help");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton4);

        signOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sign-Shutdown-icon.png"))); // NOI18N
        signOut.setText("Sign Out");
        signOut.setFocusable(false);
        signOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signOut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        signOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutActionPerformed(evt);
            }
        });
        jToolBar1.add(signOut);

        jLabel1.setBackground(new java.awt.Color(255, 204, 102));
        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("MCU Online Shoping");
        jLabel1.setOpaque(true);

        userid_txt.setFont(new java.awt.Font("Miriam Fixed", 0, 18)); // NOI18N
        userid_txt.setForeground(new java.awt.Color(0, 204, 102));
        userid_txt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userid_txt.setText("Welcome, Username");

        time_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        time_txt.setText("hh:mm:ss");

        date_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        date_text.setText("dd/mm/yyy");

        MCUlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mcuLogo.png"))); // NOI18N

        javax.swing.GroupLayout BannerLayout = new javax.swing.GroupLayout(Banner);
        Banner.setLayout(BannerLayout);
        BannerLayout.setHorizontalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MCUlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userid_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BannerLayout.createSequentialGroup()
                        .addComponent(time_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date_text, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        BannerLayout.setVerticalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BannerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MCUlogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BannerLayout.createSequentialGroup()
                        .addComponent(userid_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(time_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        right.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        right.setLayout(new java.awt.CardLayout());
        right.add(product1, "product");
        right.add(history1, "history");
        right.add(cartPanel1, "cartpanel1");
        right.add(updateProfile1, "updateProfile");
        right.add(changePasswordUpdate1, "changePassword");

        left.setLayout(new java.awt.CardLayout());
        left.add(updateInformation1, "updateInfo");
        left.add(category1, "category");

        javax.swing.GroupLayout adsLayout = new javax.swing.GroupLayout(ads);
        ads.setLayout(adsLayout);
        adsLayout.setHorizontalGroup(
            adsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(adsPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        adsLayout.setVerticalGroup(
            adsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(adsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Banner, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(left, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(ads, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addComponent(right, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(right, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ads, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutActionPerformed
		new LoginFrame().setVisible(true);
                dispose();
	}//GEN-LAST:event_signOutActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CardLayout card = (CardLayout) right.getLayout();
	card.show(right, "cartpanel1");
        cartPanel1.updater(cartObject.getList());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        account1.SetFields();
        CardLayout card = (CardLayout) right.getLayout();
	card.show(right, "account");
        account1.SetFields();
        card = (CardLayout) left.getLayout();
        card.show(left, "updateInfo");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        ShoppingFrame sf = ShoppingFrame.sfPublic;
        CardLayout card2 = (CardLayout) sf.right.getLayout();
        card2.show(sf.right, "product");
        card2 = (CardLayout) sf.left.getLayout();
        card2.show(sf.left, "category");
    }//GEN-LAST:event_jButton1MouseClicked

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
			java.util.logging.Logger.getLogger(ShoppingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ShoppingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ShoppingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ShoppingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				Person p = new Customer();
                                p.name = "viaksh";
                                p.uName = "iit2011209";
                                p.city = "city";
                                p.mobileno = "9234567567";
                                p.pass = "209";
				new ShoppingFrame(p).setVisible(true);
			}
		});
	}
	
   public void callProductPanel(String c) {
        
	product1.printTable(c);
    }
     
   
   public void actionOfButton(String buttonType) {
       if (buttonType.equals("+")) {
           product1.addToCart();
       }
       else {
           cartPanel1.deleteSelectedRow();
       }
   }
   
   public void addTOcartobject(String itemID) {
       cartObject.add(itemID, 1);
   }
   
   public void fillFields() {
       checkout1.fillFeilds();
   }
   
   public void setFieldsOfUpdateProfile() {
       updateProfile1.SetFields();
   }
   
   public void callHistoryPanelForUpdate() {
       history1.connection();
   }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Banner;
    private javax.swing.JLabel MCUlogo;
    private javax.swing.JPanel ads;
    private adsPanel adsPanel1;
    private CartPanel cartPanel1;
    private Category category1;
    private ChangePasswordUpdate changePasswordUpdate1;
    private javax.swing.JLabel date_text;
    private History history1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JPanel left;
    private Product product1;
    public javax.swing.JPanel right;
    private javax.swing.JButton signOut;
    private javax.swing.JLabel time_txt;
    private UpdateInformation updateInformation1;
    private updateProfile updateProfile1;
    private javax.swing.JLabel userid_txt;
    // End of variables declaration//GEN-END:variables

    private Checkout checkout1;
    private Account account1;
    
    private void obtaindate()
	{
		Thread th = new Thread() {

			@Override
			public void run() {
				
				for (; true;) {
					Calendar cd = new GregorianCalendar();
				
					int mon = cd.get(Calendar.MONTH);
					mon++;
					int year = cd.get(Calendar.YEAR);
					int day = cd.get(Calendar.DAY_OF_MONTH);
					date_text.setText("" + day + "/" + mon + "/" + year);	
				
					int hh = cd.get(Calendar.HOUR_OF_DAY);
					int min = cd.get(Calendar.MINUTE);
					int sec = cd.get(Calendar.SECOND);
					time_txt.setText("" + hh + ":" + min + ":" + sec);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Amin.class.getName()).log(Level.SEVERE, null, ex);
					}
				}
			}
		};
		
		th.setDaemon(true);
		th.start();
		
 	}
    
}
