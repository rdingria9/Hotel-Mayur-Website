
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class login extends javax.swing.JFrame {

    String mainName, mainPass;
    CardLayout c;
    Container rootPane;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.out.println("some error occured in loading drivers");
        }
    }

    public login() {
        initComponents();
        rootPane = getContentPane();
        c = (CardLayout) rootPane.getLayout();
        mainMenuBar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pMain = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        passTextField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        WelcomePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        passwordPanel = new javax.swing.JPanel();
        passwordPanelOldName = new javax.swing.JLabel();
        passwordPanelOldPassword = new javax.swing.JLabel();
        passwordPanelOldNameTextField = new javax.swing.JTextField();
        passwordPanelNewName = new javax.swing.JLabel();
        passwordPanelNewPassword = new javax.swing.JLabel();
        passwordPanelReEnterPassword = new javax.swing.JLabel();
        passwordPanelNewNameTextField = new javax.swing.JTextField();
        passwordPanelUpdateButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        paaswordPanelOldPasswordTextField = new javax.swing.JPasswordField();
        passwordPanelNewPasswordTextField = new javax.swing.JPasswordField();
        passwordPanelReEnterPasswordTextField = new javax.swing.JPasswordField();
        jLabel19 = new javax.swing.JLabel();
        discountPanel = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel3 = new javax.swing.JPanel();
        discountPanelUpdatedDiscountLabel = new javax.swing.JLabel();
        discountPanelCombobox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        discountPanelUpdateButton = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        discountTable = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        feedbackPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        feedbackPanelFeedbackTable = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        roomDetailsPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        roomDetailsTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        ratesPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        seasonCombo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        updateRateTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ratesTable = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        roomRateTable = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        customerPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        reportPanel = new javax.swing.JPanel();
        reportCombobox = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        mainMenuBar = new javax.swing.JMenuBar();
        mainMenu = new javax.swing.JMenu();
        changePasswordMenuItem = new javax.swing.JMenuItem();
        logOutMenuItem = new javax.swing.JMenuItem();
        manageMenu = new javax.swing.JMenu();
        ratesMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        discountMenuItem = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        feedbackMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        customerDetails = new javax.swing.JMenuItem();
        reportMenu = new javax.swing.JMenu();
        viewReportMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel Mayur");
        getContentPane().setLayout(new java.awt.CardLayout());

        pMain.setLayout(null);

        jPanel1.setBackground(new Color(0,0,0,0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century", 3, 18), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Password   :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(14, 86, 127, 31);
        jPanel1.add(passTextField);
        passTextField.setBounds(180, 86, 139, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Admin's Name   :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(14, 35, 156, 33);
        jPanel1.add(nameTextField);
        nameTextField.setBounds(180, 43, 139, 20);

        loginButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton);
        loginButton.setBounds(180, 149, 100, 25);

        pMain.add(jPanel1);
        jPanel1.setBounds(810, 300, 392, 207);

        jLabel1.setFont(new java.awt.Font("KodchiangUPC", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        pMain.add(jLabel1);
        jLabel1.setBounds(270, 210, 362, 0);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1714784-1366x768-[DesktopNexus.com].jpg"))); // NOI18N
        pMain.add(jLabel18);
        jLabel18.setBounds(0, -30, 1370, 750);

        getContentPane().add(pMain, "pMain");

        WelcomePanel.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Andalus", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Welcome Admin!!");
        WelcomePanel.add(jLabel4);
        jLabel4.setBounds(420, 60, 301, 56);
        WelcomePanel.add(jLabel17);
        jLabel17.setBounds(0, 0, 1370, 750);

        getContentPane().add(WelcomePanel, "WelcomePanel");

        passwordPanel.setLayout(null);

        passwordPanelOldName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        passwordPanelOldName.setText("Enter old user name  :");
        passwordPanel.add(passwordPanelOldName);
        passwordPanelOldName.setBounds(370, 90, 171, 23);

        passwordPanelOldPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        passwordPanelOldPassword.setText("Enter old password :");
        passwordPanel.add(passwordPanelOldPassword);
        passwordPanelOldPassword.setBounds(370, 130, 159, 22);

        passwordPanelOldNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordPanelOldNameTextFieldActionPerformed(evt);
            }
        });
        passwordPanel.add(passwordPanelOldNameTextField);
        passwordPanelOldNameTextField.setBounds(592, 86, 172, 20);

        passwordPanelNewName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        passwordPanelNewName.setText("Enter new user name :");
        passwordPanel.add(passwordPanelNewName);
        passwordPanelNewName.setBounds(370, 250, 171, 22);

        passwordPanelNewPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        passwordPanelNewPassword.setText("Enter new password :");
        passwordPanel.add(passwordPanelNewPassword);
        passwordPanelNewPassword.setBounds(370, 290, 164, 22);

        passwordPanelReEnterPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        passwordPanelReEnterPassword.setText("Re-enter new paasword :");
        passwordPanel.add(passwordPanelReEnterPassword);
        passwordPanelReEnterPassword.setBounds(370, 330, 190, 22);
        passwordPanel.add(passwordPanelNewNameTextField);
        passwordPanelNewNameTextField.setBounds(592, 252, 172, 20);

        passwordPanelUpdateButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        passwordPanelUpdateButton.setText("Update");
        passwordPanelUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordPanelUpdateButtonActionPerformed(evt);
            }
        });
        passwordPanel.add(passwordPanelUpdateButton);
        passwordPanelUpdateButton.setBounds(592, 400, 170, 25);

        jLabel10.setText("*");
        passwordPanel.add(jLabel10);
        jLabel10.setBounds(768, 78, 6, 14);

        jLabel11.setText("*");
        passwordPanel.add(jLabel11);
        jLabel11.setBounds(768, 126, 6, 14);

        jLabel13.setText("*");
        passwordPanel.add(jLabel13);
        jLabel13.setBounds(768, 299, 6, 14);

        jLabel14.setText("*");
        passwordPanel.add(jLabel14);
        jLabel14.setBounds(768, 334, 6, 14);
        passwordPanel.add(paaswordPanelOldPasswordTextField);
        paaswordPanelOldPasswordTextField.setBounds(592, 133, 172, 20);
        passwordPanel.add(passwordPanelNewPasswordTextField);
        passwordPanelNewPasswordTextField.setBounds(592, 296, 172, 20);
        passwordPanel.add(passwordPanelReEnterPasswordTextField);
        passwordPanelReEnterPasswordTextField.setBounds(592, 337, 172, 20);
        passwordPanel.add(jLabel19);
        jLabel19.setBounds(0, 0, 1370, 750);

        getContentPane().add(passwordPanel, "passwordPanel");

        discountPanel.setLayout(null);

        discountPanelUpdatedDiscountLabel.setForeground(new java.awt.Color(51, 0, 204));

        discountPanelCombobox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        discountPanelCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Select---", "00", "05", "10", "15", "20", "25" }));
        discountPanelCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountPanelComboboxActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Modify to :");

        discountPanelUpdateButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        discountPanelUpdateButton.setText("Update");
        discountPanelUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountPanelUpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(discountPanelUpdatedDiscountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(discountPanelCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(discountPanelUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(discountPanelCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(31, 31, 31)
                .addComponent(discountPanelUpdateButton)
                .addGap(44, 44, 44)
                .addComponent(discountPanelUpdatedDiscountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        discountPanel.add(jLayeredPane1);
        jLayeredPane1.setBounds(113, 63, 360, 200);

        discountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(discountTable);

        discountPanel.add(jScrollPane5);
        jScrollPane5.setBounds(620, 110, 164, 108);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("Discount ");
        discountPanel.add(jLabel16);
        jLabel16.setBounds(660, 70, 72, 22);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1714784-1366x768-[DesktopNexus.com].jpg"))); // NOI18N
        discountPanel.add(jLabel27);
        jLabel27.setBounds(0, 0, 1370, 750);

        getContentPane().add(discountPanel, "discountPanel");

        feedbackPanel.setLayout(null);

        feedbackPanelFeedbackTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(feedbackPanelFeedbackTable);

        feedbackPanel.add(jScrollPane1);
        jScrollPane1.setBounds(240, 140, 855, 402);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("Feedbacks");
        feedbackPanel.add(jLabel15);
        jLabel15.setBounds(580, 60, 120, 40);
        feedbackPanel.add(jLabel21);
        jLabel21.setBounds(0, 0, 1370, 750);

        getContentPane().add(feedbackPanel, "feedbackPanel");

        roomDetailsPanel.setLayout(null);

        roomDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(roomDetailsTable);

        roomDetailsPanel.add(jScrollPane3);
        jScrollPane3.setBounds(330, 140, 740, 402);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Details Of Rooms");
        roomDetailsPanel.add(jLabel5);
        jLabel5.setBounds(590, 80, 174, 28);
        roomDetailsPanel.add(jLabel22);
        jLabel22.setBounds(0, 0, 0, 750);

        getContentPane().add(roomDetailsPanel, "roomDetailsPanel");

        ratesPanel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ratesPanel.setLayout(null);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        seasonCombo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        seasonCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Off", "Moderate", "Peak" }));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Rate :");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Season :");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seasonCombo, 0, 117, Short.MAX_VALUE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(updateRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(seasonCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        ratesPanel.add(jPanel2);
        jPanel2.setBounds(130, 120, 370, 190);

        ratesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(ratesTable);

        ratesPanel.add(jScrollPane2);
        jScrollPane2.setBounds(530, 90, 532, 90);

        roomRateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(roomRateTable);

        ratesPanel.add(jScrollPane6);
        jScrollPane6.setBounds(600, 270, 380, 230);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("Season Rates");
        ratesPanel.add(jLabel23);
        jLabel23.setBounds(730, 50, 130, 22);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setText("Room Rates");
        ratesPanel.add(jLabel25);
        jLabel25.setBounds(730, 240, 130, 22);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1714784-1366x768-[DesktopNexus.com].jpg"))); // NOI18N
        ratesPanel.add(jLabel26);
        jLabel26.setBounds(0, 0, 1370, 750);

        getContentPane().add(ratesPanel, "ratesPanel");

        customerPanel.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("Details of customers");
        customerPanel.add(jLabel9);
        jLabel9.setBounds(336, 48, 218, 28);

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(customerTable);

        customerPanel.add(jScrollPane4);
        jScrollPane4.setBounds(129, 82, 856, 402);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1714784-1366x768-[DesktopNexus.com].jpg"))); // NOI18N
        customerPanel.add(jLabel24);
        jLabel24.setBounds(0, 0, 1370, 750);

        getContentPane().add(customerPanel, "customerPanel");

        reportPanel.setLayout(null);

        reportPanel.add(reportCombobox);
        reportCombobox.setBounds(560, 90, 197, 30);

        jLabel28.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 0, 0));
        jLabel28.setText("Select Customer's Name");
        reportPanel.add(jLabel28);
        jLabel28.setBounds(560, 50, 192, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        reportPanel.add(jButton2);
        jButton2.setBounds(560, 150, 100, 23);

        reportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(reportTable);

        reportPanel.add(jScrollPane7);
        jScrollPane7.setBounds(350, 260, 660, 100);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Print");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        reportPanel.add(jButton3);
        jButton3.setBounds(670, 150, 90, 23);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1714784-1366x768-[DesktopNexus.com].jpg"))); // NOI18N
        reportPanel.add(jLabel29);
        jLabel29.setBounds(0, 0, 1366, 750);

        getContentPane().add(reportPanel, "reportPanel");

        mainMenu.setText("Main");

        changePasswordMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        changePasswordMenuItem.setText("Change Password");
        changePasswordMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordMenuItemActionPerformed(evt);
            }
        });
        mainMenu.add(changePasswordMenuItem);

        logOutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        logOutMenuItem.setText("LogOut");
        logOutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutMenuItemActionPerformed(evt);
            }
        });
        mainMenu.add(logOutMenuItem);

        mainMenuBar.add(mainMenu);

        manageMenu.setText("Manage");

        ratesMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        ratesMenuItem.setText("Rates");
        ratesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratesMenuItemActionPerformed(evt);
            }
        });
        manageMenu.add(ratesMenuItem);
        manageMenu.add(jSeparator1);

        discountMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        discountMenuItem.setText("Discount");
        discountMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountMenuItemActionPerformed(evt);
            }
        });
        manageMenu.add(discountMenuItem);

        mainMenuBar.add(manageMenu);

        viewMenu.setText("View");

        feedbackMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        feedbackMenuItem.setText("Feedback");
        feedbackMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(feedbackMenuItem);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("RoomDetails");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        viewMenu.add(jMenuItem1);

        customerDetails.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        customerDetails.setText("CustomerDetails");
        customerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerDetailsActionPerformed(evt);
            }
        });
        viewMenu.add(customerDetails);

        mainMenuBar.add(viewMenu);

        reportMenu.setText("Report");
        reportMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportMenuActionPerformed(evt);
            }
        });

        viewReportMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        viewReportMenuItem.setText("View Reports");
        viewReportMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReportMenuItemActionPerformed(evt);
            }
        });
        reportMenu.add(viewReportMenuItem);

        mainMenuBar.add(reportMenu);

        setJMenuBar(mainMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        LoginDb l = new LoginDb();
        boolean b = false;
        mainName = nameTextField.getText();
        char p[] = passTextField.getPassword();
        mainPass = new String(p);
        //System.out.println(""+s2);
        if (nameTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Invalid name");
            nameTextField.requestFocus();
        } else if (passTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Invalid password");
            passTextField.requestFocus();
        }
        try {
            b = l.validLogin(mainName, mainPass);
        } catch (Exception e) {
            System.out.println("" + e);
        }
        if (b) {
            //JOptionPane.showMessageDialog(null, "Login Successfull");
            c.show(rootPane, "WelcomePanel");
            mainMenuBar.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Login Unsuccessfull");
        }

    }//GEN-LAST:event_loginButtonActionPerformed

    private void changePasswordMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordMenuItemActionPerformed
        // TODO add your handling code here:
        c.show(rootPane, "passwordPanel");
    }//GEN-LAST:event_changePasswordMenuItemActionPerformed

    private void logOutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutMenuItemActionPerformed
        // TODO add your handling code here:
        c.show(rootPane, "pMain");
        mainMenuBar.setVisible(false);
        nameTextField.setText("");
        passTextField.setText("");
    }//GEN-LAST:event_logOutMenuItemActionPerformed

    private void passwordPanelOldNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordPanelOldNameTextFieldActionPerformed
        // TODO adyour handling code here:
    }//GEN-LAST:event_passwordPanelOldNameTextFieldActionPerformed
    private void passwordPanelUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordPanelUpdateButtonActionPerformed
        // TODO add your handling code here:
        String s1, s2, s3, s4, s5;
        char p1[], p2[], p3[];
        s1 = passwordPanelOldNameTextField.getText();
        p1 = paaswordPanelOldPasswordTextField.getPassword();
        p2 = passwordPanelNewPasswordTextField.getPassword();
        p3 = passwordPanelReEnterPasswordTextField.getPassword();
        s3 = passwordPanelNewNameTextField.getText();
        s2 = new String(p1);
        s4 = new String(p2);
        s5 = new String(p3);
        if (s1.equals("") || (!s1.equals(mainName))) {
            JOptionPane.showMessageDialog(null, "enter valid name");
            passwordPanelOldNameTextField.requestFocus();
        }
        if (s2.equals("") || (!s2.equals(mainPass))) {
            JOptionPane.showMessageDialog(null, "Invalid password");
            paaswordPanelOldPasswordTextField.requestFocus();
        }
        if (s3.equals("")) {
            JOptionPane.showMessageDialog(null, "enter valid name");
            passwordPanelNewNameTextField.requestFocus();
        }
        if (s4.equals("")) {
            JOptionPane.showMessageDialog(null, "enter valid password");
            passwordPanelNewPasswordTextField.requestFocus();
        }
        if (s5.equals("")) {
            JOptionPane.showMessageDialog(null, "enter valid password");
            passwordPanelReEnterPasswordTextField.requestFocus();
        }
        if (!(s4.equals(s5))) {
            JOptionPane.showMessageDialog(null, "Password doen't match the above field");
        }
        boolean a = false;
        LoginDb l = new LoginDb();
        try {
            a = l.changePassword(s3, s5);
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }//GEN-LAST:event_passwordPanelUpdateButtonActionPerformed

    private void ratesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratesMenuItemActionPerformed
        // TODO add your handling code here:
        c.show(rootPane, "ratesPanel");
        rates r = new rates();
        try
        {
        ResultSet rs1 = r.updateRate();
        ratesTable.setModel(DbUtils.resultSetToTableModel(rs1));
        ResultSet rs2 =r.showRoomRate();
        roomRateTable.setModel(DbUtils.resultSetToTableModel(rs2));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Unable to display table");
        }
    }//GEN-LAST:event_ratesMenuItemActionPerformed
    /*    */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int rateUpdated;
        rateUpdated = Integer.parseInt(updateRateTextField.getText());
        String seasonType;
        seasonType = (String) seasonCombo.getSelectedItem();
        rates r = new rates();
        boolean b = false,c;
        try{
            b = r.updateRate(rateUpdated,seasonType);
            ResultSet rs1 = r.updateRate();
            ratesTable.setModel(DbUtils.resultSetToTableModel(rs1));

           
            c= r.updateRoomRate(rateUpdated);
            
            ResultSet rs3 = r.showRoomRate();
            roomRateTable.setModel(DbUtils.resultSetToTableModel(rs3));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Some Error Occured While Changing rates");
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void customerDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerDetailsActionPerformed
        // TODO add your handling code here:
        c.show(rootPane, "customerPanel");
        customer cu = new customer();
         try
        {
        ResultSet rs1 =cu.showCustomer();
        customerTable.setModel(DbUtils.resultSetToTableModel(rs1));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Unable to display table");
        }
    }//GEN-LAST:event_customerDetailsActionPerformed

    private void discountMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountMenuItemActionPerformed
        // TODO add your handling code here:
        c.show(rootPane, "discountPanel");
        discount dis = new discount();
        int r;
         try
        {
        ResultSet rs1 =dis.showDiscount();
      
        discountTable.setModel(DbUtils.resultSetToTableModel(rs1));
        //r = rs1.getInt("dis");
        
        }
        catch(Exception e)
        {
         //   JOptionPane.showMessageDialog(null, "Unable to display table");
        }
    }//GEN-LAST:event_discountMenuItemActionPerformed

    private void feedbackMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackMenuItemActionPerformed
        // TODO add your handling code here:
         c.show(rootPane, "feedbackPanel");
        feedback fed = new feedback();
        int r;
         try
        {
            ResultSet rs1 =fed.showFeedback();
            feedbackPanelFeedbackTable.setModel(DbUtils.resultSetToTableModel(rs1));
        }
        catch(Exception e)
        {
         //   JOptionPane.showMessageDialog(null, "Unable to display table");
        }
    }//GEN-LAST:event_feedbackMenuItemActionPerformed

    private void discountPanelUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountPanelUpdateButtonActionPerformed
        
        try{
        String disc=(String)discountPanelCombobox.getSelectedItem();
         //String query = "select * from dis ";
          discount dis1 = new discount();
          dis1.showDiscount(disc);
           ResultSet rs2 =dis1.showDiscount();
           discountTable.setModel(DbUtils.resultSetToTableModel(rs2));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"cannot update table  :  "+e);
        }
    }//GEN-LAST:event_discountPanelUpdateButtonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         c.show(rootPane, "roomDetailsPanel");
        roomDetails cu = new roomDetails();
         try
        {
        ResultSet rs1 =cu.showRoomDetails();
        roomDetailsTable.setModel(DbUtils.resultSetToTableModel(rs1));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Unable to display table");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void discountPanelComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountPanelComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discountPanelComboboxActionPerformed

    private void reportMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportMenuActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_reportMenuActionPerformed

    private void viewReportMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewReportMenuItemActionPerformed
        // TODO add your handling code here:
        c.show(rootPane, "reportPanel");
        Connection con = null;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "akhil1234");
            String query="select name from customer";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
            while(rs.next())
            {
                reportCombobox.addItem(rs.getString("name"));
            }

        } catch (Exception e) {
            System.out.println("Error in connection" + e);
        }
    }//GEN-LAST:event_viewReportMenuItemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String name = (String)reportCombobox.getSelectedItem();
        Connection con = null;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "akhil1234");
            String query="select name,cid,email,rtype,datefrom,dateto,price from customer where name = '"+name+"'";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
            reportTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            System.out.println("Error in connection" + e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Mayur Hotel Report");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try{
            reportTable.print(JTable.PrintMode.NORMAL, header, footer);
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel WelcomePanel;
    private javax.swing.JMenuItem changePasswordMenuItem;
    private javax.swing.JMenuItem customerDetails;
    private javax.swing.JPanel customerPanel;
    private javax.swing.JTable customerTable;
    private javax.swing.JMenuItem discountMenuItem;
    private javax.swing.JPanel discountPanel;
    private javax.swing.JComboBox discountPanelCombobox;
    private javax.swing.JButton discountPanelUpdateButton;
    private javax.swing.JLabel discountPanelUpdatedDiscountLabel;
    private javax.swing.JTable discountTable;
    private javax.swing.JMenuItem feedbackMenuItem;
    private javax.swing.JPanel feedbackPanel;
    private javax.swing.JTable feedbackPanelFeedbackTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem logOutMenuItem;
    private javax.swing.JButton loginButton;
    private javax.swing.JMenu mainMenu;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JMenu manageMenu;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPanel pMain;
    private javax.swing.JPasswordField paaswordPanelOldPasswordTextField;
    private javax.swing.JPasswordField passTextField;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JLabel passwordPanelNewName;
    private javax.swing.JTextField passwordPanelNewNameTextField;
    private javax.swing.JLabel passwordPanelNewPassword;
    private javax.swing.JPasswordField passwordPanelNewPasswordTextField;
    private javax.swing.JLabel passwordPanelOldName;
    private javax.swing.JTextField passwordPanelOldNameTextField;
    private javax.swing.JLabel passwordPanelOldPassword;
    private javax.swing.JLabel passwordPanelReEnterPassword;
    private javax.swing.JPasswordField passwordPanelReEnterPasswordTextField;
    private javax.swing.JButton passwordPanelUpdateButton;
    private javax.swing.JMenuItem ratesMenuItem;
    private javax.swing.JPanel ratesPanel;
    private javax.swing.JTable ratesTable;
    private javax.swing.JComboBox reportCombobox;
    private javax.swing.JMenu reportMenu;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JTable reportTable;
    private javax.swing.JPanel roomDetailsPanel;
    private javax.swing.JTable roomDetailsTable;
    private javax.swing.JTable roomRateTable;
    private javax.swing.JComboBox seasonCombo;
    private javax.swing.JTextField updateRateTextField;
    private javax.swing.JMenu viewMenu;
    private javax.swing.JMenuItem viewReportMenuItem;
    // End of variables declaration//GEN-END:variables
}
