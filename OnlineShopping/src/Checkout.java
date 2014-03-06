
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vaibhavatul47
 */
public class Checkout extends javax.swing.JPanel {

    /**
     * Creates new form Checkout
     */
    Person reciever = new Customer();
    Person person;
    CardLayout card;
    int invoiceID;
    OrderClass order;
    String captchaAns;
    public Checkout() {
        initComponents();
        
        hideOptions();
        bar.setValue(34);
        step1.setFont(new java.awt.Font("SansSerif", 0, 14));
        card = (CardLayout) checkoutTray.getLayout();
        
        ButtonGroup bg1 = new ButtonGroup();
        ButtonGroup bg2 = new ButtonGroup();
        person = ShoppingFrame.sfPublic.per;

        bg1.add(jRadioButton1);
        bg1.add(jRadioButton2);
        
        bg2.add(ccRadio);
        bg2.add(nbRadio);
        bg2.add(dcRadio);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bar = new javax.swing.JProgressBar();
        step1 = new javax.swing.JLabel();
        step2 = new javax.swing.JLabel();
        step3 = new javax.swing.JLabel();
        checkoutTray = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mobileText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        addressText = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        cityText = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        nbRadio = new javax.swing.JRadioButton();
        dcRadio = new javax.swing.JRadioButton();
        ccRadio = new javax.swing.JRadioButton();
        codImage = new javax.swing.JLabel();
        nbImage = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nbNameLabel = new javax.swing.JLabel();
        nbPasswordLabel = new javax.swing.JLabel();
        nbCardLabel = new javax.swing.JLabel();
        nbExpDateLabel = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        nbName = new javax.swing.JTextField();
        monthCombobox = new javax.swing.JComboBox();
        nbExpSlashLabel = new javax.swing.JLabel();
        yearCombobox = new javax.swing.JComboBox();
        nbCaptcha = new javax.swing.JTextField();
        nbCaptcha1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        nbPassword = new javax.swing.JPasswordField();
        nbCaptcha2 = new javax.swing.JLabel();
        nbCaptcha3 = new javax.swing.JLabel();
        nbCaptcha4 = new javax.swing.JLabel();
        nbCaptcha5 = new javax.swing.JLabel();
        nbCard = new javax.swing.JFormattedTextField();
        refreshButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        nbBankGateway = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        step1.setText("Step 1");

        step2.setText("Step 2");

        step3.setText("Step 3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(step1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(step2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(step3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(step2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(step3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(step1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        checkoutTray.setBackground(new java.awt.Color(255, 255, 255));
        checkoutTray.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgShipping.jpg"))); // NOI18N
        jLabel4.setIconTextGap(0);
        jLabel4.setInheritsPopupMenu(false);
        jLabel4.setOpaque(true);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 757, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
        );

        jLabel5.setBackground(new java.awt.Color(255, 51, 51));
        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        jLabel5.setText("Shipping Details");
        jLabel5.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("City");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mobile");

        jButton1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next2.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        addressText.setColumns(20);
        addressText.setLineWrap(true);
        addressText.setRows(5);
        jScrollPane2.setViewportView(addressText);

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(332, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nameText))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mobileText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mobileText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        checkoutTray.add(jPanel2, "card1");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setBackground(new java.awt.Color(255, 0, 153));
        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(50, 102, 102));
        jLabel10.setText("Choose Payment Option");

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(51, 51, 255));
        jRadioButton1.setText("Cash On Delivery");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(51, 51, 255));
        jRadioButton2.setText("Online Payment");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        nbRadio.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        nbRadio.setForeground(new java.awt.Color(0, 51, 51));
        nbRadio.setText("Net banking");

        dcRadio.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        dcRadio.setForeground(new java.awt.Color(0, 51, 51));
        dcRadio.setText("Debit Card");

        ccRadio.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        ccRadio.setForeground(new java.awt.Color(0, 51, 51));
        ccRadio.setText("Credit Card");

        codImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cashONdelivery.jpg"))); // NOI18N

        nbImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/card4.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codImage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(nbRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dcRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ccRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nbImage)
                        .addGap(91, 91, 91)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(codImage))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nbRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dcRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(nbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );

        checkoutTray.add(jPanel4, "card2");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 102));
        jLabel11.setText("Your Transaction Details");

        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("Invoice No. 55698532");

        jScrollPane1.setOpaque(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Price", "Quantity", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFillsViewportHeight(true);
        jScrollPane1.setViewportView(jTable1);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Total Rs. 10000.00");

        jButton3.setForeground(new java.awt.Color(102, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Printer-icon.png"))); // NOI18N
        jButton3.setMargin(new java.awt.Insets(2, 4, 2, 14));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/continue_shopping.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Script MT Bold", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/thank_you.jpg"))); // NOI18N

        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("Shipped to: ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134)
                .addComponent(jButton3)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        checkoutTray.add(jPanel5, "card3");

        jLabel2.setBackground(new java.awt.Color(0, 255, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Please give your details :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Online Payment");

        nbNameLabel.setForeground(new java.awt.Color(51, 0, 204));
        nbNameLabel.setText("Name on Card");

        nbPasswordLabel.setForeground(new java.awt.Color(51, 0, 204));
        nbPasswordLabel.setText("CVV");

        nbCardLabel.setForeground(new java.awt.Color(51, 0, 204));
        nbCardLabel.setText("Card No.");

        nbExpDateLabel.setForeground(new java.awt.Color(51, 0, 204));
        nbExpDateLabel.setText("Expiry Date");

        jLabel.setForeground(new java.awt.Color(51, 0, 204));
        jLabel.setText("Verify");

        monthCombobox.setMaximumRowCount(6);
        monthCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        nbExpSlashLabel.setText(" / ");

        yearCombobox.setMaximumRowCount(6);
        yearCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "year", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033" }));

        nbCaptcha.setToolTipText("Enter the shown text without Space and without Capslock ON!");

        nbCaptcha1.setBackground(new java.awt.Color(204, 255, 204));
        nbCaptcha1.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        nbCaptcha1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nbCaptcha1.setText("q");
        nbCaptcha1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        nbCaptcha1.setOpaque(true);

        jButton7.setForeground(new java.awt.Color(0, 153, 153));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rupee-icon.PNG"))); // NOI18N
        jButton7.setText("Pay");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setForeground(new java.awt.Color(51, 0, 51));
        jButton8.setText("Back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        nbPassword.setMaximumSize(new java.awt.Dimension(3, 2147483647));

        nbCaptcha2.setBackground(new java.awt.Color(204, 255, 204));
        nbCaptcha2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nbCaptcha2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nbCaptcha2.setText("q");
        nbCaptcha2.setOpaque(true);

        nbCaptcha3.setBackground(new java.awt.Color(204, 255, 204));
        nbCaptcha3.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        nbCaptcha3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nbCaptcha3.setText("q");
        nbCaptcha3.setOpaque(true);

        nbCaptcha4.setBackground(new java.awt.Color(204, 255, 204));
        nbCaptcha4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nbCaptcha4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nbCaptcha4.setText("q");
        nbCaptcha4.setOpaque(true);

        nbCaptcha5.setBackground(new java.awt.Color(204, 255, 204));
        nbCaptcha5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nbCaptcha5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nbCaptcha5.setText("q");
        nbCaptcha5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nbCaptcha5.setOpaque(true);

        nbCard.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####,####,####,####"))));

        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reload.png"))); // NOI18N
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(51, 0, 204));
        jLabel13.setText("Choose BANK");

        nbBankGateway.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Gateway --", "SBI", "HDFC", "Punjab National Bank", "Axis Bank", "ICICI", "Bank of Baroda", "Allahabad Bank", "Indian Overseas Bank", "Yes bank", "Oriental Bank", "IDBI Bank", "Central Bank", "Co-operative Bank" }));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gradient-blue-background.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 752, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 752, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 425, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nbCardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nbNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nbPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nbExpDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(nbCaptcha1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(nbCaptcha2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(nbCaptcha3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(nbCaptcha4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(nbCaptcha5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nbCaptcha)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(monthCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nbExpSlashLabel)
                                .addGap(10, 10, 10)
                                .addComponent(yearCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nbName)
                            .addComponent(nbBankGateway, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nbCard)
                            .addComponent(nbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nbBankGateway)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nbNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nbName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nbCardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nbCard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nbPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nbExpDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(monthCombobox, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                .addComponent(nbExpSlashLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(yearCombobox))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nbCaptcha3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nbCaptcha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nbCaptcha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nbCaptcha4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(nbCaptcha5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(nbCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8)
                        .addGap(18, 18, 18)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        checkoutTray.add(jPanel3, "nbCard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(checkoutTray, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(405, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 76, Short.MAX_VALUE)
                    .addComponent(checkoutTray, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if (nameText.getText().equals("") || addressText.getText().equals("") || mobileText.getText().equals("") || cityText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Some field is missing");
            if (nameText.getText().equals("")) {
                nameText.requestFocus();
            }
            else if (addressText.getText().equals("")) {
                addressText.requestFocus();
            }
            else if (mobileText.getText().equals("")) {
                mobileText.requestFocus();
            } else {
               cityText.requestFocus();
            }
        }
        else {
           
          step2.setFont(new java.awt.Font("SansSerif", 0, 14));
          step1.setFont(new java.awt.Font("Tahoma", 0, 11));
          bar.setValue(66);
          
          reciever.name = nameText.getText();
          reciever.mobileno = mobileText.getText();
          reciever.city = cityText.getText();
          reciever.address = addressText.getText();
          
          card.show(checkoutTray, "card2");
        }      
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ShoppingFrame sf = (ShoppingFrame)this.getTopLevelAncestor();
         CardLayout card2 = (CardLayout)sf.right.getLayout();
         card2.show(sf.right, "cartpanel1");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         // TODO add your handling code here:
        ShoppingFrame.sfPublic.cartObject.clearCart();
        ShoppingFrame sf = (ShoppingFrame)this.getTopLevelAncestor();
        CardLayout card2 = (CardLayout) sf.right.getLayout();
        card2.show(sf.right, "product");
        card2 = (CardLayout) sf.left.getLayout();
        card2.show(sf.left, "category");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //JOptionPane.showMessageDialog(null, "PrintFrame will throw exception !!!", "Error", 2);
        new PrintFrame(order, ShoppingFrame.per).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        updateCaptcha();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        resetNBPanel();
        card.show(checkoutTray, "card2");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (nbBankGateway.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please select a Bank Gateway", "Error", 2);
            resetNBPanel();
        }
        else if (!nbCaptcha.getText().equals(captchaAns)) {
            JOptionPane.showMessageDialog(null, "Captcha Verification failed!", "Error", 2);
            resetNBPanel();
        }
        else {
            if (nbRadio.isSelected()) {
                // Check for NetBanking Details
                if (nbName.getText().equals("") || nbPassword.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Some fields empty!", "oops", 2);
                }
                else {
                    int choice = JOptionPane.showConfirmDialog(null, "Rs. " + ShoppingFrame.sfPublic.cartObject.getFinalPrice() + " will be deducted from your Account. Are you sure ?", "Confirm", 2);
                    if (choice == 0) {
                        addToDatabase();
                        updateCart();

                        step3.setFont(new java.awt.Font("SansSerif", 0, 14));
                        step2.setFont(new java.awt.Font("Tahoma", 0, 11));
                        bar.setValue(100);

                        card.show(checkoutTray, "card3");
                    }
                    else {
                        resetNBPanel();
                    }
                }
            }
            else {
                // Check fo Card Details
                if (nbName.getText().equals("") || nbPassword.getText().equals("") || nbCard.getText().equals("") || monthCombobox.getSelectedIndex() == 0 || yearCombobox.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "Some fields empty!", "oops!", 2);
                }
                else {
                    int choice = JOptionPane.showConfirmDialog(null, "Rs. " + ShoppingFrame.sfPublic.cartObject.getFinalPrice() + " will be deducted from your Account. Are you sure ?", "Confirm", 2);
                    if (choice == 0) {
                        addToDatabase();
                        updateCart();

                        step3.setFont(new java.awt.Font("SansSerif", 0, 14));
                        step2.setFont(new java.awt.Font("Tahoma", 0, 11));
                        bar.setValue(100);

                        card.show(checkoutTray, "card3");
                    }
                    else {
                        resetNBPanel();
                    }
                }
            }
        }        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        step1.setFont(new java.awt.Font("SansSerif", 0, 14));
        step2.setFont(new java.awt.Font("Tahoma", 0, 11));
        bar.setValue(34);

        card.show(checkoutTray, "card1");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (jRadioButton1.isSelected()) {
            addToDatabase();
            updateCart();

            step3.setFont(new java.awt.Font("SansSerif", 0, 14));
            step2.setFont(new java.awt.Font("Tahoma", 0, 11));
            bar.setValue(100);

            card.show(checkoutTray, "card3");
        }
        else if (jRadioButton2.isSelected()) {
            if (nbRadio.isSelected()) {
                // Set Net Banking Interface
                nbNameLabel.setText("Username");
                nbPasswordLabel.setText("Password");
                //nbPassword.setBounds(WIDTH, WIDTH, WIDTH, WIDTH);
                //nbPassword.setColumns(20);

                nbCard.setVisible(false);
                nbCardLabel.setVisible(false);
                nbExpDateLabel.setVisible(false);
                nbExpSlashLabel.setVisible(false);
                monthCombobox.setVisible(false);
                yearCombobox.setVisible(false);

                card.show(checkoutTray, "nbCard");
            }
            else if (dcRadio.isSelected() || ccRadio.isSelected()) {
                // Set Debit/Credit Card Interface
                nbNameLabel.setText("Name on Card");
                nbCard.setVisible(true);
                nbCardLabel.setVisible(true);
                nbPasswordLabel.setText("CVV");
                nbPassword.setSize(6, 10);
                nbPassword.setColumns(3);

                nbExpDateLabel.setVisible(true);
                nbExpSlashLabel.setVisible(true);
                monthCombobox.setVisible(true);
                yearCombobox.setVisible(true);

                card.show(checkoutTray, "nbCard");

            }
            else {
                JOptionPane.showMessageDialog(null, "Please select an option", "Error", 2);
            }
            updateCaptcha();
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select an option", "Error", 2);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        showOptions();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        hideOptions();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressText;
    private javax.swing.JProgressBar bar;
    private javax.swing.JRadioButton ccRadio;
    private javax.swing.JPanel checkoutTray;
    private javax.swing.JTextField cityText;
    private javax.swing.JLabel codImage;
    private javax.swing.JRadioButton dcRadio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mobileText;
    private javax.swing.JComboBox monthCombobox;
    private javax.swing.JTextField nameText;
    private javax.swing.JComboBox nbBankGateway;
    private javax.swing.JTextField nbCaptcha;
    private javax.swing.JLabel nbCaptcha1;
    private javax.swing.JLabel nbCaptcha2;
    private javax.swing.JLabel nbCaptcha3;
    private javax.swing.JLabel nbCaptcha4;
    private javax.swing.JLabel nbCaptcha5;
    private javax.swing.JFormattedTextField nbCard;
    private javax.swing.JLabel nbCardLabel;
    private javax.swing.JLabel nbExpDateLabel;
    private javax.swing.JLabel nbExpSlashLabel;
    private javax.swing.JLabel nbImage;
    private javax.swing.JTextField nbName;
    private javax.swing.JLabel nbNameLabel;
    private javax.swing.JPasswordField nbPassword;
    private javax.swing.JLabel nbPasswordLabel;
    private javax.swing.JRadioButton nbRadio;
    private javax.swing.JButton refreshButton;
    private javax.swing.JLabel step1;
    private javax.swing.JLabel step2;
    private javax.swing.JLabel step3;
    private javax.swing.JComboBox yearCombobox;
    // End of variables declaration//GEN-END:variables

    private void addToDatabase() {
        //JOptionPane.showMessageDialog(null, "Get Person from Login Frame!");
        Person per = ShoppingFrame.sfPublic.per;
        
        int quan = 0;
        
        // Log ID
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", database.uname, database.password);
            
            // Get new Invoice ID
            String querry1 = "select order_seq.nextval from dual";
            PreparedStatement pstmt1 = conn.prepareStatement(querry1);
            ResultSet rset1 = pstmt1.executeQuery();
            if (rset1.next()) {
                invoiceID = rset1.getInt(1);
            }
            pstmt1.close();
            
            Date d = new Date();
            order = new OrderClass(invoiceID, d, ShoppingFrame.sfPublic.cartObject.getFinalPrice(), reciever.name, reciever.address, reciever.mobileno);
            // Enter to Log Table
            String sql = "INSERT INTO LOG_TABLE VALUES (?, to_date(sysdate, 'dd-mm-yy'), ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            pstmt.setInt(1, invoiceID);
            pstmt.setString(2, per.uName);
            pstmt.setInt(3, ShoppingFrame.sfPublic.cartObject.getFinalPrice());
            pstmt.setString(4, reciever.name);
            pstmt.setString(5, reciever.address);
            pstmt.setString(6, reciever.mobileno);

            pstmt.executeUpdate();
            pstmt.close();
            conn.commit();
            
            // Enter into Invoice Table. and item table
            ArrayList arr = ShoppingFrame.sfPublic.cartObject.getList();
            for (Object i : arr) {
                itemObject item = (itemObject)i;
                sql = "INSERT INTO INVOICE VALUES (?, ?, ?, ?)";
                pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, invoiceID);
                pstmt.setString(2, item.id);
                pstmt.setInt(3, item.quantity);
                pstmt.setInt(4, item.price);
                
                pstmt.executeUpdate();
                pstmt.close();
                conn.commit();
                
                sql = "select item_quantity from item where item_id = ?";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, String.valueOf(invoiceID));
                rset1 = pstmt.executeQuery();
                if (rset1.next()) {
                    quan = rset1.getInt(1);
                }
                pstmt.close();
                
                quan = (item.quantity > quan) ? 0 : quan - item.quantity;
                
                sql = "update item set item_quantity = ? where item_id = ?";
                pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, quan);
                pstmt.setString(2, item.id);
                pstmt.executeUpdate();
                conn.commit();
            }
            conn.close();
        } catch (SQLException ex) {
		Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
	}
                  

    }

    private void updateCart() {
        
        DefaultTableModel model = new DefaultTableModel(
            new Object [][] {},
            new String [] {"  Name  ", "Price", "Quantity", "Amount"}
         ) {
            boolean[] canEdit = new boolean [] {false, false, false, false};
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };
        jTable1.setModel(model);
        ArrayList arr = ShoppingFrame.sfPublic.cartObject.getList();
        
        for (int i = 0; i < arr.size(); i++) {
            itemObject x = (itemObject) arr.get(i);
            String str = "   " + x.name;
            model.addRow(new Object[] {str, x.price, x.quantity, x.quantity * x.price});
        }
        
        jLabel12.setText("Invoice No. " + invoiceID);
        jLabel1.setText("Shipped to: " + reciever.name);
        jLabel14.setText("Total Rs. " + ShoppingFrame.sfPublic.cartObject.getFinalPrice());
        
        ShoppingFrame.sfPublic.cartObject.clearCart();
    }
    
    public void fillFeilds() {
        nameText.setText(ShoppingFrame.per.name);
        cityText.setText(ShoppingFrame.per.city);
        mobileText.setText(ShoppingFrame.per.mobileno);
        addressText.setFocusable(true);
        addressText.requestFocus();
    }
    
    public void showOptions() {
        nbRadio.setVisible(true);
        ccRadio.setVisible(true);
        dcRadio.setVisible(true);
        nbImage.setVisible(true);
        codImage.setVisible(false);
    }
    
    public void hideOptions() {
        nbRadio.setVisible(false);
        ccRadio.setVisible(false);
        dcRadio.setVisible(false);
        nbImage.setVisible(false);
        codImage.setVisible(true);
    }

    public void updateCaptcha() {
        int i = (int) (Math.random() * 1317);
        String a = getRandomString();
        String b = getRandomString();
        String c = getRandomString();
        String d = getRandomString();
        String e = getRandomString();
        nbCaptcha1.setText(a);
        nbCaptcha2.setText(b);
        nbCaptcha3.setText(c);
        nbCaptcha4.setText(d);
        nbCaptcha5.setText(e);
        if (i % 5 == 0) {
            nbCaptcha1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            nbCaptcha2.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            nbCaptcha3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            nbCaptcha4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            nbCaptcha5.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        }
        else if (i % 5 == 1) {
            nbCaptcha1.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            nbCaptcha2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            nbCaptcha3.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            nbCaptcha4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            nbCaptcha5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        }
        else if (i % 5 == 2) {
            nbCaptcha1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            nbCaptcha2.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            nbCaptcha3.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            nbCaptcha4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            nbCaptcha5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        }
        else if (i % 5 == 3) {
            nbCaptcha1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            nbCaptcha2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            nbCaptcha3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            nbCaptcha4.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            nbCaptcha5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        }
        else if (i % 5 == 4) {
            nbCaptcha1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            nbCaptcha2.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            nbCaptcha3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            nbCaptcha4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            nbCaptcha5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        }
        //System.out.println(i % 5);
        captchaAns = a + b + c + d + e;
    }
    
    String getRandomString() {
        String s = "a";
        int i = (int) (Math.random() * 1317);
        if (i % 2 == 0) {
            i = i % 10 + 48;
            s = String.valueOf((char)i);
        }
        else {
            i = i % 26 + 97;
            s = String.valueOf((char)i);
        }
        return s;
    }
    
    void resetNBPanel() {
        nbBankGateway.setSelectedIndex(0);
        nbName.setText("");
        nbPassword.setText("");
        nbCard.setText("");
        monthCombobox.setSelectedIndex(0);
        yearCombobox.setSelectedIndex(0);
        nbCaptcha.setText("");
        updateCaptcha();
    }
}
