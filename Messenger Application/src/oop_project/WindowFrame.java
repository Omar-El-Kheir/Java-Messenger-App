package oop_project;

import java.time.LocalTime;
import javax.swing.JOptionPane;

public class WindowFrame extends javax.swing.JFrame {

    public WindowFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        Button_CreateAccount = new javax.swing.JButton();
        TextField_Name = new javax.swing.JTextField();
        TextField_Password = new javax.swing.JPasswordField();
        Button_Login = new javax.swing.JButton();
        CheckBox_PremiumAccount = new javax.swing.JCheckBox();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea_RecieveMessage = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        TextField_MessageReciever = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea_SendMessage = new javax.swing.JTextArea();
        Button_SendMessage = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Button_refresh = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextArea_SentHistory = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        Button_PlayGame = new javax.swing.JButton();
        TextField_SendMoney = new javax.swing.JTextField();
        Button_AddMoney = new javax.swing.JButton();
        Button_SendMoney = new javax.swing.JButton();
        TextField_AddMoney = new javax.swing.JTextField();
        TextField_Username = new javax.swing.JTextField();
        Button_Upgrade = new javax.swing.JButton();
        Button_LogOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Label_CurrentAccount = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Label_CurrentBalance = new javax.swing.JLabel();
        Label_AccountID = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        A1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        Button_PlayAgain = new javax.swing.JButton();
        Button_GoBack = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 102));
        setMaximumSize(new java.awt.Dimension(720, 720));
        setMinimumSize(new java.awt.Dimension(720, 720));
        setUndecorated(isResizable());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jTabbedPane.setEnabled(false);

        Button_CreateAccount.setText("Create new account");
        Button_CreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CreateAccountActionPerformed(evt);
            }
        });

        TextField_Name.setText("Username");
        TextField_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_NameActionPerformed(evt);
            }
        });

        TextField_Password.setText("1234");
        TextField_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_PasswordActionPerformed(evt);
            }
        });

        Button_Login.setBackground(new java.awt.Color(204, 255, 204));
        Button_Login.setText("Log in");
        Button_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_LoginActionPerformed(evt);
            }
        });

        CheckBox_PremiumAccount.setText("Premium Account");
        CheckBox_PremiumAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_PremiumAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop_project/Login-icon.png"))); // NOI18N

        jButton1.setText("Exit");
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Button_CreateAccount)
                            .addComponent(TextField_Password)
                            .addComponent(TextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_Login)
                            .addComponent(CheckBox_PremiumAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(TextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TextField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button_Login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button_CreateAccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CheckBox_PremiumAccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        CheckBox_PremiumAccount.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane.addTab("", jPanel2);

        TextArea_RecieveMessage.setColumns(20);
        TextArea_RecieveMessage.setRows(5);
        TextArea_RecieveMessage.setEnabled(false);
        jScrollPane1.setViewportView(TextArea_RecieveMessage);

        jLabel2.setText("Inbox");

        TextField_MessageReciever.setEnabled(false);
        TextField_MessageReciever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_MessageRecieverActionPerformed(evt);
            }
        });

        TextArea_SendMessage.setColumns(20);
        TextArea_SendMessage.setRows(5);
        TextArea_SendMessage.setEnabled(false);
        jScrollPane2.setViewportView(TextArea_SendMessage);

        Button_SendMessage.setText("Send");
        Button_SendMessage.setEnabled(false);
        Button_SendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SendMessageActionPerformed(evt);
            }
        });

        jLabel4.setText("target");

        Button_refresh.setText("Refresh");
        Button_refresh.setEnabled(false);
        Button_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_refreshActionPerformed(evt);
            }
        });

        jLabel6.setText("Message box");

        TextArea_SentHistory.setColumns(20);
        TextArea_SentHistory.setRows(5);
        TextArea_SentHistory.setEnabled(false);
        jScrollPane3.setViewportView(TextArea_SentHistory);

        jLabel7.setText("Sent History");

        Button_PlayGame.setText("Play Game");
        Button_PlayGame.setEnabled(false);
        Button_PlayGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PlayGameActionPerformed(evt);
            }
        });

        TextField_SendMoney.setText("0");
        TextField_SendMoney.setEnabled(false);

        Button_AddMoney.setText("Add");
        Button_AddMoney.setEnabled(false);
        Button_AddMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AddMoneyActionPerformed(evt);
            }
        });

        Button_SendMoney.setText("Send Money");
        Button_SendMoney.setEnabled(false);
        Button_SendMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SendMoneyActionPerformed(evt);
            }
        });

        TextField_AddMoney.setText("0");
        TextField_AddMoney.setEnabled(false);
        TextField_AddMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_AddMoneyActionPerformed(evt);
            }
        });

        TextField_Username.setText("Username");
        TextField_Username.setEnabled(false);
        TextField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_UsernameActionPerformed(evt);
            }
        });

        Button_Upgrade.setText("Upgrade");
        Button_Upgrade.setEnabled(false);
        Button_Upgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_UpgradeActionPerformed(evt);
            }
        });

        Button_LogOut.setText("Log out");
        Button_LogOut.setEnabled(false);
        Button_LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_LogOutActionPerformed(evt);
            }
        });

        jLabel1.setText("Current Account: ");

        Label_CurrentAccount.setText("Please Log in");

        jLabel3.setText("Account ID: ");

        jLabel5.setText("Current Balance: ");

        Label_CurrentBalance.setText("#####");

        Label_AccountID.setText("#####");

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Button_refresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_PlayGame))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField_MessageReciever, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_SendMessage))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Button_AddMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button_SendMoney))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextField_SendMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextField_AddMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Button_LogOut)
                                .addGap(18, 18, 18)
                                .addComponent(Button_Upgrade))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Label_CurrentAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Label_AccountID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Label_CurrentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_SendMessage)
                            .addComponent(jLabel4)
                            .addComponent(TextField_MessageReciever, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_CurrentAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Label_AccountID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Label_CurrentBalance))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_Upgrade)
                            .addComponent(Button_LogOut))))
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel7))
                    .addComponent(TextField_AddMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_AddMoney))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_SendMoney))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField_SendMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_refresh)
                            .addComponent(Button_PlayGame)
                            .addComponent(jButton3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("", jPanel3);

        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        Button_PlayAgain.setText("Play Again");
        Button_PlayAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PlayAgainActionPerformed(evt);
            }
        });

        Button_GoBack.setText("Go Back");
        Button_GoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_GoBackActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(Button_GoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(Button_PlayAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addComponent(Button_PlayAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Button_GoBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jTabbedPane.addTab("", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int maxAccounts = 10; //max allowed accounts to have

    public Account[] accountArray = new Account[maxAccounts];
    public int id = 0;
    public Account CurrentAccount;
    public boolean loggedIn = false;
    int k = 0;

    public Account Sender;
    public Account Reciever;
    public Account MessageSender;
    public Account MessageReciever;
    public double TransferedAmmount;

    private void Button_CreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CreateAccountActionPerformed
        // TODO add your handling code here:
        String name = TextField_Name.getText();
        String password = TextField_Password.getText();

        boolean alreadyExists = false;

        for (int i = 0; i < id; i++) {
            if (name.equals(accountArray[i].getName())) {
                alreadyExists = true;
                break;
            }
        }

        if (!alreadyExists) {
            if (id < maxAccounts) {
                accountArray[id] = new Account();
                if (CheckBox_PremiumAccount.isSelected()) {
                    accountArray[id].setPremium(true);
                } else {
                    accountArray[id].setPremium(false);
                }

                accountArray[id].setName(name);
                accountArray[id].setPassword(password);
                accountArray[id].setId(id);

                JOptionPane.showMessageDialog(rootPane, "New account " + accountArray[id].getName() + " created!");

                id++;
            } else {
                JOptionPane.showMessageDialog(rootPane, "Maximum number of accounts reached!");
                System.out.println("maximum number of accounts reached");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "There is already an account with that name!");
            System.out.println("There is already an account with that name!");
        }

    }//GEN-LAST:event_Button_CreateAccountActionPerformed

    public void notifyUser(Account user) {
        if (CurrentAccount == Reciever) {
            JOptionPane.showMessageDialog(rootPane, "You have recieved " + TransferedAmmount + "$ from " + Sender.getName());
            System.out.println("you have recieved " + TransferedAmmount + "$ from " + Sender.getName());
            Reciever = null;
        }
    }


    private void TextField_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_NameActionPerformed
        // TODO add your handling code here

    }//GEN-LAST:event_TextField_NameActionPerformed

    private void Button_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_LoginActionPerformed
        // TODO add your handling code here:
        String inputName = TextField_Name.getText();
        String inputPassword = TextField_Password.getText();

        int found = 0;
        if (!loggedIn) {
            for (int j = 0; j < id; j++) {

                if (accountArray[j].getName().equals((inputName)) && accountArray[j].getPassword().equals(inputPassword)) {
                    loggedIn = true;

                    UpdateButtonsAndFields();

                    CurrentAccount = accountArray[j];
                    System.out.println("Logged in at " + CurrentAccount.toString());

                    updateLabels();
                    notifyUser(CurrentAccount);
                    found++;

                    if (!CurrentAccount.isPremium()) {
                        Button_Upgrade.setEnabled(true);
                    }

                    refreshMessages(CurrentAccount);
                    refreshSentMessages(CurrentAccount);

                    jTabbedPane.setSelectedIndex(1);

                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Already Logged In! Please Log out");
            System.out.println("Already Logged in!");
            found++;
        }

        if (found == 0) {
            JOptionPane.showMessageDialog(rootPane, "Wrong Credentials");
            System.out.println("Wrong Credentials!");
        }

        updateLabels();

    }//GEN-LAST:event_Button_LoginActionPerformed

    private void TextField_AddMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_AddMoneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_AddMoneyActionPerformed

    public void updateLabels() {
        if (loggedIn) {
            Label_CurrentAccount.setText(CurrentAccount.getName());
            Label_AccountID.setText(String.valueOf(CurrentAccount.getId()));
            Label_CurrentBalance.setText(String.valueOf(CurrentAccount.getBalance()) + " $");
        } else {
            Label_CurrentAccount.setText("Please Log in");
            Label_AccountID.setText("#####");
            Label_CurrentBalance.setText("#####");
        }
    }

    private void Button_AddMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AddMoneyActionPerformed
        // TODO add your handling code here:
        if (loggedIn) {
            double moneyToAdd = Double.parseDouble(TextField_AddMoney.getText());
            CurrentAccount.addMoney(moneyToAdd);
            updateLabels();
        }
    }//GEN-LAST:event_Button_AddMoneyActionPerformed

    public void UpdateButtonsAndFields() {
        //buttons enabling - disabling
        Button_AddMoney.setEnabled(loggedIn);
//        Button_WithdrawMoney.setEnabled(loggedIn);
        Button_SendMoney.setEnabled(loggedIn);
        Button_LogOut.setEnabled(loggedIn);

        Button_Login.setEnabled(!loggedIn);
        Button_CreateAccount.setEnabled(!loggedIn);
        Button_Upgrade.setEnabled(false);

        Button_SendMessage.setEnabled(loggedIn);
        Button_refresh.setEnabled(loggedIn);

        //textfields enabling - disabling
        TextField_AddMoney.setEnabled(loggedIn);
//        TextField_WithdrawMoney.setEnabled(loggedIn);
        TextField_SendMoney.setEnabled(loggedIn);
        TextField_Username.setEnabled(loggedIn);

        TextField_Name.setEnabled(!loggedIn);
        TextField_Password.setEnabled(!loggedIn);
        TextField_MessageReciever.setEnabled(loggedIn);

        TextArea_SendMessage.setEnabled(loggedIn);

        CheckBox_PremiumAccount.setEnabled(!loggedIn);
        Button_PlayGame.setEnabled(loggedIn);
    }

    private void Button_LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_LogOutActionPerformed
        // TODO add your handling code here:
        CurrentAccount = null;
        loggedIn = false;
        updateLabels();
        UpdateButtonsAndFields();
        TextArea_SentHistory.setText("");
        TextArea_RecieveMessage.setText("");
        jTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_Button_LogOutActionPerformed

    private void TextField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_UsernameActionPerformed

    public boolean searchFor(Account account) {
        String local_name = account.getName();
        for (int j = 0; j < id; j++) {
            if (accountArray[j].getName().equals(local_name)) {
                return true;
            }
        }
        return false;
    }

    private void Button_SendMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SendMoneyActionPerformed
        // TODO add your handling code here:
        if (loggedIn) {
            double moneyToSend = Double.parseDouble(TextField_SendMoney.getText());
            String targetUser = TextField_Username.getText();

            Account targetAccount = null;

            boolean found = false;

            for (int j = 0; j < id; j++) {
                if (accountArray[j].getName().equals(targetUser)) {
                    targetAccount = accountArray[j];
                    found = true;
                }
            }

            if (!found) {
                JOptionPane.showMessageDialog(rootPane, "No such account found!");
                System.out.println("no account found!");
            }

            if (targetAccount != null) {
                if (targetAccount == CurrentAccount) {
                    JOptionPane.showMessageDialog(rootPane, "You can't send money to yourself!");
                    System.out.println("You can't Send Money to yourself!");
                } else {
                    if (moneyToSend < CurrentAccount.getBalance()) {
                        CurrentAccount.sendMoney(moneyToSend, targetAccount);
                        TransferedAmmount = CurrentAccount.applyTax(moneyToSend);
                        Sender = CurrentAccount;
                        Reciever = targetAccount;
                        JOptionPane.showMessageDialog(rootPane, "You have transfered " + moneyToSend + "$ to " + Reciever.getName());
                        updateLabels();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Insufficient Funds!");
                    }
                }
            }

        }
    }//GEN-LAST:event_Button_SendMoneyActionPerformed

    private void TextField_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_PasswordActionPerformed

    private void Button_UpgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_UpgradeActionPerformed
        // TODO add your handling code here:
        double premiumCost = 150; //how much premium costs

        double newBalance = CurrentAccount.getBalance() - premiumCost;
        boolean sufficientFunds = (newBalance >= 0);

        int confirmationDial = JOptionPane.showConfirmDialog(rootPane, "Upgrade your account to premium for 150$?");

        if (confirmationDial == JOptionPane.YES_OPTION) {
            if (loggedIn && !CurrentAccount.isPremium() && sufficientFunds) {
                CurrentAccount.setPremium(true);
                CurrentAccount.setBalance(newBalance);
                Button_Upgrade.setEnabled(false);
            } else {
                System.out.println("insufficient funds!");
                JOptionPane.showMessageDialog(rootPane, "Insufficient Funds!");
            }
        }

        updateLabels();
    }//GEN-LAST:event_Button_UpgradeActionPerformed

    private void TextField_MessageRecieverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_MessageRecieverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_MessageRecieverActionPerformed

    private void Button_SendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SendMessageActionPerformed
        // TODO add your handling code here:
        String targetUser = TextField_MessageReciever.getText();
        Account targetAccount;
        int found = 0;

        for (int j = 0; j < id; j++) {
            if (accountArray[j].getName().equals(targetUser)) {
                targetAccount = accountArray[j];
                sendMessage(TextArea_SendMessage.getText(), CurrentAccount, targetAccount);
                found++;
                refreshMessages(CurrentAccount);
                refreshSentMessages(CurrentAccount);
                break;
            }
        }

        if (found == 0) {
            System.out.println("User not found! ");
        }

        TextArea_SendMessage.setText("");
    }//GEN-LAST:event_Button_SendMessageActionPerformed

    private void CheckBox_PremiumAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_PremiumAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox_PremiumAccountActionPerformed

    private void Button_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_refreshActionPerformed
        // TODO add your handling code here:
        refreshMessages(CurrentAccount);
        refreshSentMessages(CurrentAccount);
    }//GEN-LAST:event_Button_refreshActionPerformed

    private void Button_PlayGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PlayGameActionPerformed
        // TODO add your handling code here:
        jTabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_Button_PlayGameActionPerformed

    PlayerHandler player = new PlayerHandler();

    double randomizer = 0; //this is for randomizing position if there is no case to study
    double caseStudyRandomizer = 0; //this is used to randomize difficulty based on current level
    int numberOfMoves = 0; //this is to count how many moves the PLAYER has made and NOT the AI
    int difficultyPercentage = 50; //any value above 50 will decrease the difficulty
    int counterForAI = 0; //this should be 0 for the player and 1 for the AI, it stops the AI from performing 2 moves at once


    private void Button_PlayAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PlayAgainActionPerformed
        // TODO add your handling code here:
        counterForAI = 0;
        numberOfMoves = 0;
        randomizer = 0;
        caseStudyRandomizer = 0;

        clearAllButtons();
        enableAllButtons(false);
        enableAllButtons(true);
    }//GEN-LAST:event_Button_PlayAgainActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        // TODO add your handling code here:
        if (player.getTurn()) {
            A1.setText("X");
            A1.setEnabled(false);
            player.endTurn();

            numberOfMoves++;

            counterForAI = 0;

            //            AI
            randomizer = Math.rint(Math.random() * (8));
            System.out.println(randomizer);

            caseStudyRandomizer = Math.rint(Math.random() * (difficultyPercentage));
            System.out.println(caseStudyRandomizer);

            //            if (checkForCaseStudy()) {
            if (caseStudyRandomizer > 0 && caseStudyRandomizer <= 50) {
                if (numberOfMoves <= 4) {
                    caseStudy(randomizer);
                    //                    }
                } else if (caseStudyRandomizer > 50 && caseStudyRandomizer <= 100) {
                    randomizePosition(randomizer);
                }
            } else {
                randomizePosition(randomizer);
            }
            player.endTurn();
            applyWinner();

        }
    }//GEN-LAST:event_A1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        // TODO add your handling code here:
        if (player.getTurn()) {
            A2.setText("X");
            A2.setEnabled(false);
            player.endTurn();

            numberOfMoves++;

            counterForAI = 0;

            //            AI
            randomizer = Math.rint(Math.random() * (8));
            System.out.println(randomizer);

            caseStudyRandomizer = Math.rint(Math.random() * (difficultyPercentage));
            System.out.println(caseStudyRandomizer);

            //            if (checkForCaseStudy()) {
            if (caseStudyRandomizer > 0 && caseStudyRandomizer <= 50) {
                if (numberOfMoves <= 4) {
                    caseStudy(randomizer);
                    //                    }
                } else if (caseStudyRandomizer > 50 && caseStudyRandomizer <= 100) {
                    randomizePosition(randomizer);
                }
            } else {
                randomizePosition(randomizer);
            }
            player.endTurn();
            applyWinner();
        }
    }//GEN-LAST:event_A2ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
        if (player.getTurn()) {
            B1.setText("X");
            B1.setEnabled(false);
            player.endTurn();

            numberOfMoves++;

            counterForAI = 0;

            //            AI
            randomizer = Math.rint(Math.random() * (8));
            System.out.println(randomizer);

            caseStudyRandomizer = Math.rint(Math.random() * (difficultyPercentage));
            System.out.println(caseStudyRandomizer);

            //            if (checkForCaseStudy()) {
            if (caseStudyRandomizer > 0 && caseStudyRandomizer <= 50) {
                if (numberOfMoves <= 4) {
                    caseStudy(randomizer);
                    //                    }
                } else if (caseStudyRandomizer > 50 && caseStudyRandomizer <= 100) {
                    randomizePosition(randomizer);
                }
            } else {
                randomizePosition(randomizer);
            }
            player.endTurn();
            applyWinner();
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
        if (player.getTurn()) {
            B2.setText("X");
            B2.setEnabled(false);
            player.endTurn();

            numberOfMoves++;

            counterForAI = 0;

            //            AI
            randomizer = Math.rint(Math.random() * (8));
            System.out.println(randomizer);

            caseStudyRandomizer = Math.rint(Math.random() * (difficultyPercentage));
            System.out.println(caseStudyRandomizer);

            //            if (checkForCaseStudy()) {
            if (caseStudyRandomizer > 0 && caseStudyRandomizer <= 50) {
                if (numberOfMoves <= 4) {
                    caseStudy(randomizer);
                    //                    }
                } else if (caseStudyRandomizer > 50 && caseStudyRandomizer <= 100) {
                    randomizePosition(randomizer);
                }
            } else {
                randomizePosition(randomizer);
            }
            player.endTurn();
            applyWinner();
        }
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
        if (player.getTurn()) {
            B3.setText("X");
            B3.setEnabled(false);
            player.endTurn();

            numberOfMoves++;

            counterForAI = 0;

            //            AI
            randomizer = Math.rint(Math.random() * (8));
            System.out.println(randomizer);

            caseStudyRandomizer = Math.rint(Math.random() * (difficultyPercentage));
            System.out.println(caseStudyRandomizer);

            //            if (checkForCaseStudy()) {
            if (caseStudyRandomizer > 0 && caseStudyRandomizer <= 50) {
                if (numberOfMoves <= 4) {
                    caseStudy(randomizer);
                    //                    }
                } else if (caseStudyRandomizer > 50 && caseStudyRandomizer <= 100) {
                    randomizePosition(randomizer);
                }
            } else {
                randomizePosition(randomizer);
            }

            player.endTurn();
            applyWinner();
        }
    }//GEN-LAST:event_B3ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
        if (player.getTurn()) {
            C1.setText("X");
            C1.setEnabled(false);
            player.endTurn();

            numberOfMoves++;

            counterForAI = 0;

            //            AI
            randomizer = Math.rint(Math.random() * (8));
            System.out.println(randomizer);

            caseStudyRandomizer = Math.rint(Math.random() * (difficultyPercentage));
            System.out.println(caseStudyRandomizer);

            //            if (checkForCaseStudy()) {
            if (caseStudyRandomizer > 0 && caseStudyRandomizer <= 50) {
                if (numberOfMoves <= 4) {
                    caseStudy(randomizer);
                    //                    }
                } else if (caseStudyRandomizer > 50 && caseStudyRandomizer <= 100) {
                    randomizePosition(randomizer);
                }
            } else {
                randomizePosition(randomizer);
            }

            player.endTurn();
            applyWinner();
        }
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
        if (player.getTurn()) {
            C2.setText("X");
            C2.setEnabled(false);
            player.endTurn();

            numberOfMoves++;
            counterForAI = 0;

            //            AI
            randomizer = Math.rint(Math.random() * (8));
            System.out.println(randomizer);

            caseStudyRandomizer = Math.rint(Math.random() * (difficultyPercentage));
            System.out.println(caseStudyRandomizer);

            //            if (checkForCaseStudy()) {
            if (caseStudyRandomizer > 0 && caseStudyRandomizer <= 50) {
                if (numberOfMoves <= 4) {
                    caseStudy(randomizer);
                    //                    }
                } else if (caseStudyRandomizer > 50 && caseStudyRandomizer <= 100) {
                    randomizePosition(randomizer);
                }
            } else {
                randomizePosition(randomizer);
            }
            player.endTurn();
            applyWinner();
        }
    }//GEN-LAST:event_C2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
        if (player.getTurn()) {
            C3.setText("X");
            C3.setEnabled(false);
            player.endTurn();

            numberOfMoves++;

            counterForAI = 0;

            //            AI
            randomizer = Math.rint(Math.random() * (8));
            System.out.println(randomizer);

            caseStudyRandomizer = Math.rint(Math.random() * (difficultyPercentage));
            System.out.println(caseStudyRandomizer);

            //            if (checkForCaseStudy()) {
            if (caseStudyRandomizer > 0 && caseStudyRandomizer <= 50) {
                if (numberOfMoves <= 4) {
                    caseStudy(randomizer);
                    //                    }
                } else if (caseStudyRandomizer > 50 && caseStudyRandomizer <= 100) {
                    randomizePosition(randomizer);
                }
            } else {
                randomizePosition(randomizer);
            }

            player.endTurn();
            applyWinner();
        }
    }//GEN-LAST:event_C3ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
        if (player.getTurn()) {
            A3.setText("X");
            A3.setEnabled(false);
            player.endTurn();

            numberOfMoves++;

            counterForAI = 0;

            //            AI
            randomizer = Math.rint(Math.random() * (8));
            System.out.println(randomizer);

            caseStudyRandomizer = Math.rint(Math.random() * (difficultyPercentage));
            System.out.println(caseStudyRandomizer);

            //            if (checkForCaseStudy()) {
            if (caseStudyRandomizer > 0 && caseStudyRandomizer <= 50) {
                if (numberOfMoves <= 4) {
                    caseStudy(randomizer);
                    //                    }
                } else if (caseStudyRandomizer > 50 && caseStudyRandomizer <= 100) {
                    randomizePosition(randomizer);
                }
            } else {
                randomizePosition(randomizer);
            }
            player.endTurn();
            applyWinner();
        }
    }//GEN-LAST:event_A3ActionPerformed

    private void Button_GoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_GoBackActionPerformed
        // TODO add your handling code here:
        jTabbedPane.setSelectedIndex(jTabbedPane.getSelectedIndex() - 1);
    }//GEN-LAST:event_Button_GoBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void randomizePosition(double randomizer) {
        boolean flag = true;

        while (flag) {

            if (numberOfMoves == 5) {
                break;
            }

            if (randomizer == 0) {
                if (!"X".equals(A1.getText()) && !"O".equals(A1.getText())) {
                    A1.setText("O");
                    A1.setEnabled(false);
//                    numberOfMoves++;
                    flag = false;
                } else {
                    if ("O".equals(A1.getText()) || "X".equals(A1.getText())) {
                        randomizer++;
                    }
                    if (randomizer > 8) {
                        randomizer = 0;
                    }
                }
            }

            if (randomizer == 1) {
                if (!"X".equals(A2.getText()) && !"O".equals(A2.getText())) {
                    A2.setText("O");
                    A2.setEnabled(false);
//                    numberOfMoves++;
                    flag = false;
                } else {
                    if ("O".equals(A2.getText()) || "X".equals(A2.getText())) {
                        randomizer++;
                    }
                    if (randomizer > 8) {
                        randomizer = 0;
                    }
                }
            }
            if (randomizer == 2) {
                if (!"X".equals(A3.getText()) && !"O".equals(A3.getText())) {
                    A3.setText("O");
                    A3.setEnabled(false);
//                    numberOfMoves++;
                    flag = false;
                } else {
                    if ("O".equals(A3.getText()) || "X".equals(A3.getText())) {
                        randomizer++;
                    }
                    if (randomizer > 8) {
                        randomizer = 0;
                    }
                }
            }
            if (randomizer == 3) {
                if (!"X".equals(B1.getText()) && !"O".equals(B1.getText())) {
                    B1.setText("O");
                    B1.setEnabled(false);
//                    numberOfMoves++;
                    flag = false;
                } else {
                    if ("O".equals(B1.getText()) || "X".equals(B1.getText())) {
                        randomizer++;
                    }
                    if (randomizer > 8) {
                        randomizer = 0;
                    }
                }
            }
            if (randomizer == 4) {
                if (!"X".equals(B2.getText()) && !"O".equals(B2.getText())) {
                    B2.setText("O");
                    B2.setEnabled(false);
//                    numberOfMoves++;
                    flag = false;
                } else {
                    if ("O".equals(B2.getText()) || "X".equals(B2.getText())) {
                        randomizer++;
                    }
                    if (randomizer > 8) {
                        randomizer = 0;
                    }
                }
            }

            if (randomizer == 5) {
                if (!"X".equals(B3.getText()) && !"O".equals(B3.getText())) {
                    B3.setText("O");
                    B3.setEnabled(false);
//                    numberOfMoves++;
                    flag = false;
                } else {
                    if ("O".equals(B3.getText()) || "X".equals(B3.getText())) {
                        randomizer++;
                    }
                    if (randomizer > 8) {
                        randomizer = 0;
                    }
                }
            }
            if (randomizer == 6) {
                if (!"X".equals(C1.getText()) && !"O".equals(C1.getText())) {
                    C1.setText("O");
                    C1.setEnabled(false);
//                    numberOfMoves++;
                    flag = false;
                } else {
                    if ("O".equals(C1.getText()) || "X".equals(C1.getText())) {
                        randomizer++;
                    }
                    if (randomizer > 7) {
                        randomizer = 0;
                    }
                }
            }

            if (randomizer == 7) {
                if (!"X".equals(C2.getText()) && !"O".equals(C2.getText())) {
                    C2.setText("O");
                    C2.setEnabled(false);
//                    numberOfMoves++;
                    flag = false;
                } else {
                    if ("O".equals(C2.getText()) || "X".equals(C2.getText())) {
                        randomizer++;
                    }
                    if (randomizer > 8) {
                        randomizer = 0;
                    }
                }
            }

            if (randomizer == 8) {
                if (!"X".equals(C3.getText()) && !"O".equals(C3.getText())) {
                    C3.setText("O");
                    C3.setEnabled(false);
//                    numberOfMoves++;
                    flag = false;
                } else {
                    if ("O".equals(C3.getText()) || "X".equals(C3.getText())) {
                        randomizer = 0;
                    }
                    if (randomizer > 8) {
                        randomizer = 0;
                    }
                }
            }
        }

    }

    private void caseStudy(double randomizer) {

        if (checkForCaseStudy()) {

            boolean A11 = ("X".equals(A1.getText()));
            boolean A10 = ("O".equals(A1.getText()));

            boolean A21 = ("X".equals(A2.getText()));
            boolean A20 = ("O".equals(A2.getText()));

            boolean A31 = ("X".equals(A3.getText()));
            boolean A30 = ("O".equals(A3.getText()));

            boolean B11 = ("X".equals(B1.getText()));
            boolean B10 = ("O".equals(B1.getText()));

            boolean B21 = ("X".equals(B2.getText()));
            boolean B20 = ("O".equals(B2.getText()));

            boolean B31 = ("X".equals(B3.getText()));
            boolean B30 = ("O".equals(B3.getText()));

            boolean C11 = ("X".equals(C1.getText()));
            boolean C10 = ("O".equals(C1.getText()));

            boolean C21 = ("X".equals(C2.getText()));
            boolean C20 = ("O".equals(C2.getText()));

            boolean C31 = ("X".equals(C3.getText()));
            boolean C30 = ("O".equals(C3.getText()));

            //A11 A21
            if (counterForAI < 1) {
                if (A11 && A21 && !A30 && !A31) {
                    A3.setText("O");
                    A3.setEnabled(false);
                    applyWinner();
                    counterForAI++;
                }
            }

            //A11 A31
            if (counterForAI < 1) {
                if (A11 && A31 && !A20 && !A21) {
                    A2.setText("O");
                    A2.setEnabled(false);
                    applyWinner();
                    counterForAI++;
                }
            }

            //A21 A31
            if (counterForAI < 1) {
                if (A21 && A31 && !A10 && !A11) {
                    A1.setText("O");
                    A1.setEnabled(false);
                    applyWinner();
                    counterForAI++;
                }
            }

            //B11 B21
            if (counterForAI < 1) {
                if (B11 && B21 && !B31 && !B30) {
                    B3.setText("O");
                    B3.setEnabled(false);
                    applyWinner();
                    counterForAI++;
                }
            }

            //B11 B31
            if (counterForAI < 1) {
                if (B11 && B31 && !B21 && !B20) {
                    B2.setText("O");
                    B2.setEnabled(false);
                    applyWinner();
                    counterForAI++;
                }
            }

            //B21 B31
            if (counterForAI < 1) {
                if (B21 && B31 && !B10 && !B11) {
                    B1.setText("O");
                    B1.setEnabled(false);
                    applyWinner();
                    counterForAI++;
                }
            }

            //C11 C31
            if (counterForAI < 1) {
                if (C11 && C31 && !C21 && !C20) {
                    C2.setText("O");
                    C2.setEnabled(false);
                    applyWinner();
                    counterForAI++;
                }
            }

            //C11 C21
            if (counterForAI < 1) {
                if (C11 && C21 && !C31 && !C30) {
                    C3.setText("O");
                    C3.setEnabled(false);
                    applyWinner();
                    counterForAI++;
                }
            }

            //C21 C31
            if (counterForAI < 1) {
                if (C21 && C31 && !C11 && !C10) {
                    C1.setText("O");
                    C1.setEnabled(false);
                    applyWinner();
                    counterForAI++;
                }
            }

            //A11 B11
            if (counterForAI < 1) {
                if (A11 && B11 && !C10 && !C11) {
                    C1.setText("O");
                    C1.setEnabled(false);
                    applyWinner();
                    counterForAI++;
                }
            }

            //A11 C11
            if (counterForAI < 1) {
                if (A11 && C11 && !B11 && !B10) {
                    B1.setText("O");
                    B3.setEnabled(false);
                    applyWinner();
                    counterForAI++;
                }
            }

            //B11 C11
            if (counterForAI < 1) {
                if (B11 && C11 && !A11 && !A10) {
                    A1.setText("O");
                    A1.setEnabled(false);
                    applyWinner();
                    counterForAI++;
                }
            }

            //A21 B21
            if (counterForAI < 1) {
                if (A21 && B21 && !C20 && !C21) {
                    C2.setText("O");
                    C2.setEnabled(false);
                    applyWinner();
                    counterForAI++;
                }
            }

            //A21 C21
            if (counterForAI < 1) {
                if (A21 && C21 && !B21 && !B20) {
                    B2.setText("O");
                    B2.setEnabled(false);
                    applyWinner();
                    counterForAI++;
                }
            }

            //B21 C21
            if (counterForAI < 1) {
                if (B21 && C21 && !A21 && !A20) {
                    A2.setText("O");
                    A2.setEnabled(false);
                    applyWinner();
                    counterForAI++;
                }
            }

            //A31 B31
            if (counterForAI < 1) {
                if (A31 && B31 && !C30 && !C31) {
                    C3.setText("O");
                    C3.setEnabled(false);
                    applyWinner();
                    counterForAI++;
                }
            }

            //A31 C31
            if (counterForAI < 1) {
                if (A31 && C31 && !B31 && !B30) {
                    B3.setText("O");
                    B3.setEnabled(false);
                    applyWinner();
                    counterForAI++;
                }
            }

            //B31 C31
            if (counterForAI < 1) {
                if (B31 && C31 && !A31 && !A30) {
                    A3.setText("O");
                    A3.setEnabled(false);
                    applyWinner();
                    counterForAI++;
                }
            }

            //A11 B21
            if (counterForAI < 1) {
                if (A11 && B21 && !C31 && !C30) {
                    C3.setText("O");
                    C3.setEnabled(false);
                    applyWinner();
                    counterForAI++;
                }
            }

            //A11 C31
            if (counterForAI < 1) {
                if (A11 && C31 && !B21 && !B20) {
                    B2.setText("O");
                    B2.setEnabled(false);
                    applyWinner();
                    counterForAI++;
                }
            }

            //B21 C31
            if (counterForAI < 1) {
                if (B21 && C31 && !A11 && !A10) {
                    A1.setText("O");
                    A1.setEnabled(false);
                    applyWinner();
                    counterForAI++;
                }
            }

            //C11 B21
            if (counterForAI < 1) {
                if (C11 && B21 && !A31 && !A30) {
                    A3.setText("O");
                    A3.setEnabled(false);
                    applyWinner();
                    counterForAI++;
                }
            }

            //C11 A31
            if (counterForAI < 1) {
                if (C11 && A31 && !B21 && !B20) {
                    B2.setText("O");
                    B2.setEnabled(false);
                    applyWinner();
                    counterForAI++;
                }
            }

            //B21 A31
            if (counterForAI < 1) {
                if (B21 && A31 && !C11 && !C10) {
                    C1.setText("O");
                    C1.setEnabled(false);
                    applyWinner();
                    counterForAI++;
                }
            }

        } else {
            randomizePosition(randomizer);
        }

    }

    private boolean checkForCaseStudy() {

        boolean A11 = ("X".equals(A1.getText()));
        boolean A10 = ("O".equals(A1.getText()));

        boolean A21 = ("X".equals(A2.getText()));
        boolean A20 = ("O".equals(A2.getText()));

        boolean A31 = ("X".equals(A3.getText()));
        boolean A30 = ("O".equals(A3.getText()));

        boolean B11 = ("X".equals(B1.getText()));
        boolean B10 = ("O".equals(B1.getText()));

        boolean B21 = ("X".equals(B2.getText()));
        boolean B20 = ("O".equals(B2.getText()));

        boolean B31 = ("X".equals(B3.getText()));
        boolean B30 = ("O".equals(B3.getText()));

        boolean C11 = ("X".equals(C1.getText()));
        boolean C10 = ("O".equals(C1.getText()));

        boolean C21 = ("X".equals(C2.getText()));
        boolean C20 = ("O".equals(C2.getText()));

        boolean C31 = ("X".equals(C3.getText()));
        boolean C30 = ("O".equals(C3.getText()));

        //A11 A21
        if (A11 && A21 && !A30 && !A31) {
            return true;
        }

        //A11 A31
        if (A11 && A31 && !A20 && !A21) {
            return true;
        }

        //A21 A31
        if (A21 && A31 && !A10 && !A11) {
            return true;
        }

        //B11 B21
        if (B11 && B21 && !B31 && !B30) {
            return true;
        }

        //B11 B31
        if (B11 && B31 && !B21 && !B20) {
            return true;
        }

        //B21 B31
        if (B21 && B31 && !B10 && !B11) {
            return true;
        }

        //C11 C31
        if (C11 && C31 && !C21 && !C20) {
            return true;
        }

        //C11 C21
        if (C11 && C21 && !C31 && !C30) {
            return true;
        }

        //C21 C31
        if (C21 && C31 && !C11 && !C10) {
            return true;
        }

        //A11 B11
        if (A11 && B11 && !C10 && !C11) {
            return true;
        }

        //A11 C11
        if (A11 && C11 && !B11 && !B10) {
            return true;
        }

        //B11 C11
        if (B11 && C11 && !A11 && !A10) {
            return true;
        }

        //A21 B21
        if (A21 && B21 && !C20 && !C21) {
            return true;
        }

        //A21 C21
        if (A21 && C21 && !B21 && !B20) {
            return true;
        }

        //B21 C21
        if (B21 && C21 && !A21 && !A20) {
            return true;
        }

        //A31 B31
        if (A31 && B31 && !C30 && !C31) {
            return true;
        }

        //A31 C31
        if (A31 && C31 && !B31 && !B30) {
            return true;
        }

        //B31 C31
        if (B31 && C31 && !A31 && !A30) {
            return true;
        }

        //A11 B21
        if (A11 && B21 && !C31 && !C30) {
            return true;
        }

        //A11 C31
        if (A11 && C31 && !B21 && !B20) {
            return true;
        }

        //B21 C31
        if (B21 && C31 && !A11 && !A10) {
            return true;
        }

        //C11 B21
        if (C11 && B21 && !A31 && !A30) {
            return true;
        }

        //C11 A31
        if (C11 && A31 && !B21 && !B20) {
            return true;
        }

        //B21 A31
        if (B21 && A31 && !C11 && !C10) {
            return true;
        }

        return false;
    }

    public int checkForWinner() {

        boolean A11 = ("X".equals(A1.getText()));
        boolean A10 = ("O".equals(A1.getText()));

        boolean A21 = ("X".equals(A2.getText()));
        boolean A20 = ("O".equals(A2.getText()));

        boolean A31 = ("X".equals(A3.getText()));
        boolean A30 = ("O".equals(A3.getText()));

        boolean B11 = ("X".equals(B1.getText()));
        boolean B10 = ("O".equals(B1.getText()));

        boolean B21 = ("X".equals(B2.getText()));
        boolean B20 = ("O".equals(B2.getText()));

        boolean B31 = ("X".equals(B3.getText()));
        boolean B30 = ("O".equals(B3.getText()));

        boolean C11 = ("X".equals(C1.getText()));
        boolean C10 = ("O".equals(C1.getText()));

        boolean C21 = ("X".equals(C2.getText()));
        boolean C20 = ("O".equals(C2.getText()));

        boolean C31 = ("X".equals(C3.getText()));
        boolean C30 = ("O".equals(C3.getText()));

        if (A11 && A21 && A31) {
            return 1;
        }
        if (A10 && A20 && A30) {
            return 2;
        }

        if (A11 && B11 && C11) {
            return 1;
        }
        if (A10 && B10 && C10) {
            return 2;
        }

        if (A11 && B21 && C31) {
            return 1;
        }
        if (A10 && B20 && C30) {
            return 2;
        }

        if (A21 && B21 && C21) {
            return 1;
        }
        if (A20 && B20 && C20) {
            return 2;
        }

        if (A31 && B31 && C31) {
            return 1;
        }

        if (A30 && B30 && C30) {
            return 2;
        }

        if (C11 && B21 & A31) {
            return 1;
        }
        if (C10 && B20 && A30) {
            return 2;
        }

        if (B11 && B21 && B31) {
            return 1;
        }
        if (B10 && B20 && B30) {
            return 2;
        }

        if (C11 && C21 && C31) {
            return 1;
        }
        if (C10 && C20 && C30) {
            return 2;
        }

        return 0;
    }

    public void applyWinner() {
        int winner = checkForWinner(); //this method return 1 if the player wins and 2 if the AI wins

        if (winner == 1) {
            System.out.println("YOU WIN!");
            JOptionPane.showMessageDialog(rootPane, "You won!");

            double winningAmmount = 5;

            double localBalance = CurrentAccount.getBalance();
            double newBalance = localBalance + winningAmmount;
            CurrentAccount.setBalance(newBalance);
            TextArea_RecieveMessage.append("You have won " + winningAmmount + "$ from playing! \n");
            updateLabels();
            UpdateButtonsAndFields();
            enableAllButtons(false);

        } else if (winner == 2) {
            System.out.println("YOU LOSE!!!!");
            JOptionPane.showMessageDialog(rootPane, "You lost!");
            enableAllButtons(false);
        }
    }

    public void enableAllButtons(boolean isEnabled) {
        A1.setEnabled(isEnabled);
        A2.setEnabled(isEnabled);
        A3.setEnabled(isEnabled);
        B1.setEnabled(isEnabled);
        B2.setEnabled(isEnabled);
        B3.setEnabled(isEnabled);
        C1.setEnabled(isEnabled);
        C2.setEnabled(isEnabled);
        C3.setEnabled(isEnabled);

    }

    public void clearAllButtons() {
        A1.setText("");
        A2.setText("");
        A3.setText("");
        B1.setText("");
        B2.setText("");
        B3.setText("");
        C1.setText("");
        C2.setText("");
        C3.setText("");
    }

    public void sendMessage(String message, Account sender, Account target) {
        if (searchFor(target)) {
            MessageReciever = target;
            MessageSender = sender;
            int counter;
            int counter_02;

            if (sender.premium) {
                target.messages = message;
                counter = target.inc++;
                counter_02 = sender.inc_02++;
                target.messageHistory[counter] = (MessageSender.getName() + ": " + message + " at " + LocalTime.now());
                sender.sentHistory[counter_02] = ("You to " + MessageReciever.getName() + ": " + message + " at " + LocalTime.now());
                target.hasMessage = true;
                updateLabels();
            } else {
                if (sender.getBalance() >= 1) {
                    sender.setBalance(sender.getBalance() - 1);
                    target.messages = message;
                    counter = target.inc++;
                    counter_02 = sender.inc_02++;
                    target.messageHistory[counter] = (MessageSender.getName() + ": " + message + " at " + LocalTime.now());
                    sender.sentHistory[counter_02] = ("You to " + MessageReciever.getName() + ": " + message + " at " + LocalTime.now());
                    target.hasMessage = true;
                    updateLabels();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Insufficient Funds!");
                    System.out.println("Insufficient funds!");
                }
            }
        }
    }

//    public void recieveMessage(Account target) {
//        if (MessageReciever == target) {
//            TextArea_RecieveMessage.append(target.messages);
//        }
//    }
    public void refreshMessages(Account target) {
        TextArea_RecieveMessage.setText("");
        if (target != null) {
            if (target.hasMessage) {
                int counter = target.inc;
                for (int i = 0; i < counter; i++) {
                    TextArea_RecieveMessage.append(target.messageHistory[i] + "\n");
                }
            }
        }

    }

    public void refreshSentMessages(Account currentAccount) {
        TextArea_SentHistory.setText("");
        if (currentAccount != null) {
            int counter = currentAccount.inc_02;
            for (int i = 0; i < counter; i++) {
                TextArea_SentHistory.append(currentAccount.sentHistory[i] + "\n");
            }
        }
    }

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowFrame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton A1;
    public static javax.swing.JButton A2;
    public static javax.swing.JButton A3;
    public static javax.swing.JButton B1;
    public static javax.swing.JButton B2;
    public static javax.swing.JButton B3;
    private javax.swing.JButton Button_AddMoney;
    private javax.swing.JButton Button_CreateAccount;
    private javax.swing.JButton Button_GoBack;
    private javax.swing.JButton Button_LogOut;
    private javax.swing.JButton Button_Login;
    private javax.swing.JButton Button_PlayAgain;
    private javax.swing.JButton Button_PlayGame;
    private javax.swing.JButton Button_SendMessage;
    private javax.swing.JButton Button_SendMoney;
    private javax.swing.JButton Button_Upgrade;
    private javax.swing.JButton Button_refresh;
    public static javax.swing.JButton C1;
    public static javax.swing.JButton C2;
    public static javax.swing.JButton C3;
    private javax.swing.JCheckBox CheckBox_PremiumAccount;
    private javax.swing.JLabel Label_AccountID;
    private javax.swing.JLabel Label_CurrentAccount;
    private javax.swing.JLabel Label_CurrentBalance;
    private javax.swing.JTextArea TextArea_RecieveMessage;
    private javax.swing.JTextArea TextArea_SendMessage;
    private javax.swing.JTextArea TextArea_SentHistory;
    private javax.swing.JTextField TextField_AddMoney;
    private javax.swing.JTextField TextField_MessageReciever;
    private javax.swing.JTextField TextField_Name;
    private javax.swing.JPasswordField TextField_Password;
    private javax.swing.JTextField TextField_SendMoney;
    private javax.swing.JTextField TextField_Username;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
