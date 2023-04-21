package taskmanagementsystem;

import javax.swing.JOptionPane;

public class AdminGui extends javax.swing.JFrame {
 admin a ;
    public AdminGui() {
        
        initComponents();
         a = new admin();
          setLocationRelativeTo(null); // to make jframe appear in middle of screen
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        AdminPane = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        ProjectLabel = new javax.swing.JLabel();
        ProjectIdTextField = new javax.swing.JTextField();
        AddProjectButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Password = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Id = new javax.swing.JLabel();
        AddUserButton = new javax.swing.JButton();
        UserNameTextField = new javax.swing.JTextField();
        IDTextField = new javax.swing.JTextField();
        RoleComboBox1 = new javax.swing.JComboBox<>();
        RoleLabel = new javax.swing.JLabel();
        AgeLabel = new javax.swing.JLabel();
        AgeTextField = new javax.swing.JTextField();
        PasswordUserField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        ProjectIdTPLabel = new javax.swing.JLabel();
        TaskIdLabel = new javax.swing.JLabel();
        TaskPhaseLabel = new javax.swing.JLabel();
        ProjectIdTPTextField = new javax.swing.JTextField();
        TaskIdTextField = new javax.swing.JTextField();
        TaskPhaseTextField = new javax.swing.JTextField();
        AddTaskPhaseButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LogOutButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin ");

        AdminPane.setBackground(new java.awt.Color(204, 204, 255));
        AdminPane.setForeground(new java.awt.Color(0, 0, 204));
        AdminPane.setToolTipText("Admin Page");

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        ProjectLabel.setFont(new java.awt.Font("Palatino Linotype", 2, 48)); // NOI18N
        ProjectLabel.setForeground(new java.awt.Color(0, 0, 204));
        ProjectLabel.setText("Project ID");

        ProjectIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProjectIdTextFieldActionPerformed(evt);
            }
        });
        ProjectIdTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ProjectIdTextFieldKeyPressed(evt);
            }
        });

        AddProjectButton.setBackground(new java.awt.Color(0, 51, 102));
        AddProjectButton.setFont(new java.awt.Font("Palatino Linotype", 2, 23)); // NOI18N
        AddProjectButton.setForeground(new java.awt.Color(255, 255, 255));
        AddProjectButton.setText("Add");
        AddProjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProjectButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 2, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("To add project Please Add Project ID");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel5))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(ProjectLabel))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(ProjectIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(AddProjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(ProjectLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ProjectIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(AddProjectButton)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        AdminPane.addTab("Add Project", jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        Password.setFont(new java.awt.Font("Palatino Linotype", 2, 36)); // NOI18N
        Password.setForeground(new java.awt.Color(0, 0, 204));
        Password.setText("Password");

        Username.setFont(new java.awt.Font("Palatino Linotype", 2, 36)); // NOI18N
        Username.setForeground(new java.awt.Color(0, 0, 204));
        Username.setText("UserName");

        Id.setFont(new java.awt.Font("Palatino Linotype", 2, 36)); // NOI18N
        Id.setForeground(new java.awt.Color(0, 0, 204));
        Id.setText("ID");

        AddUserButton.setBackground(new java.awt.Color(0, 0, 102));
        AddUserButton.setFont(new java.awt.Font("Palatino Linotype", 2, 23)); // NOI18N
        AddUserButton.setForeground(new java.awt.Color(255, 255, 255));
        AddUserButton.setText("Add ");
        AddUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserButtonActionPerformed(evt);
            }
        });

        UserNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameTextFieldActionPerformed(evt);
            }
        });
        UserNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UserNameTextFieldKeyPressed(evt);
            }
        });

        IDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDTextFieldActionPerformed(evt);
            }
        });
        IDTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IDTextFieldKeyPressed(evt);
            }
        });

        RoleComboBox1.setBackground(new java.awt.Color(0, 51, 102));
        RoleComboBox1.setFont(new java.awt.Font("Palatino Linotype", 2, 24)); // NOI18N
        RoleComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        RoleComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "Leader" }));
        RoleComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoleComboBox1ActionPerformed(evt);
            }
        });

        RoleLabel.setFont(new java.awt.Font("Palatino Linotype", 2, 36)); // NOI18N
        RoleLabel.setForeground(new java.awt.Color(0, 0, 204));
        RoleLabel.setText("Role");

        AgeLabel.setFont(new java.awt.Font("Palatino Linotype", 2, 36)); // NOI18N
        AgeLabel.setForeground(new java.awt.Color(0, 0, 204));
        AgeLabel.setText("Age");

        AgeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeTextFieldActionPerformed(evt);
            }
        });
        AgeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AgeTextFieldKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 2, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Name");

        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });
        NameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NameTextFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RoleLabel)
                            .addComponent(AgeLabel)
                            .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Password)
                            .addComponent(Username)
                            .addComponent(jLabel4))
                        .addGap(133, 133, 133)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PasswordUserField)
                            .addComponent(AgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RoleComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                            .addComponent(IDTextField)
                            .addComponent(NameTextField)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(AddUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username)
                    .addComponent(UserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Password)
                    .addComponent(PasswordUserField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Id)
                    .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RoleComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgeLabel))
                .addGap(28, 28, 28)
                .addComponent(AddUserButton)
                .addGap(39, 39, 39))
        );

        AdminPane.addTab("Add User", jPanel5);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        ProjectIdTPLabel.setFont(new java.awt.Font("Palatino Linotype", 2, 36)); // NOI18N
        ProjectIdTPLabel.setForeground(new java.awt.Color(0, 0, 204));
        ProjectIdTPLabel.setText("Project Id");

        TaskIdLabel.setFont(new java.awt.Font("Palatino Linotype", 2, 36)); // NOI18N
        TaskIdLabel.setForeground(new java.awt.Color(0, 0, 204));
        TaskIdLabel.setText("Task Id ");

        TaskPhaseLabel.setFont(new java.awt.Font("Palatino Linotype", 2, 36)); // NOI18N
        TaskPhaseLabel.setForeground(new java.awt.Color(0, 0, 204));
        TaskPhaseLabel.setText("Phase");

        ProjectIdTPTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProjectIdTPTextFieldActionPerformed(evt);
            }
        });
        ProjectIdTPTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ProjectIdTPTextFieldKeyPressed(evt);
            }
        });

        TaskIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaskIdTextFieldActionPerformed(evt);
            }
        });
        TaskIdTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TaskIdTextFieldKeyPressed(evt);
            }
        });

        TaskPhaseTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaskPhaseTextFieldActionPerformed(evt);
            }
        });
        TaskPhaseTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TaskPhaseTextFieldKeyPressed(evt);
            }
        });

        AddTaskPhaseButton.setBackground(new java.awt.Color(0, 51, 102));
        AddTaskPhaseButton.setFont(new java.awt.Font("Palatino Linotype", 2, 24)); // NOI18N
        AddTaskPhaseButton.setForeground(new java.awt.Color(255, 255, 255));
        AddTaskPhaseButton.setText("Submit");
        AddTaskPhaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTaskPhaseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(TaskIdLabel))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(TaskPhaseLabel)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ProjectIdTPTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(TaskIdTextField)
                    .addComponent(TaskPhaseTextField))
                .addGap(251, 251, 251))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(ProjectIdTPLabel))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(AddTaskPhaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(382, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(ProjectIdTPLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ProjectIdTPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TaskIdLabel)
                .addGap(12, 12, 12)
                .addComponent(TaskIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TaskPhaseLabel)
                .addGap(18, 18, 18)
                .addComponent(TaskPhaseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(AddTaskPhaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        AdminPane.addTab("Add TaskPhase", jPanel3);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 2, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("This Is Admin Page");

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Welcome Back Admin ");

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 2, 33)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("After Finishing Your Work , Please Click On Logout Button");

        LogOutButton.setBackground(new java.awt.Color(0, 51, 102));
        LogOutButton.setFont(new java.awt.Font("Palatino Linotype", 2, 18)); // NOI18N
        LogOutButton.setForeground(new java.awt.Color(255, 255, 255));
        LogOutButton.setText("Log Out");
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 50, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(22, 22, 22))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        AdminPane.addTab("Admin Page", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AdminPane, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProjectIdTPTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProjectIdTPTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProjectIdTPTextFieldActionPerformed

    private void TaskPhaseTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaskPhaseTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TaskPhaseTextFieldActionPerformed

    private void AddTaskPhaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTaskPhaseButtonActionPerformed
        // TODO add your handling code here:
        Integer i1 = Integer.valueOf(TaskIdTextField.getText());
        Integer i2 = Integer.valueOf(ProjectIdTPTextField.getText());
        if (TaskPhaseTextField.getText().equalsIgnoreCase("pending")||TaskPhaseTextField.getText().equalsIgnoreCase("underwork")||
                TaskPhaseTextField.getText().equalsIgnoreCase("evaluation")
                ||TaskPhaseTextField.getText().equalsIgnoreCase("test")||TaskPhaseTextField.getText().equalsIgnoreCase("canceled") )
        {
        a.addTaskPhase( i1, i2, TaskPhaseTextField.getText());
         JOptionPane.showMessageDialog(null, "Task Phase added successfully !!");
        }
        else {
         JOptionPane.showMessageDialog(null, "Please , choose one of the following Task Phases [Pending - Underwork - Evaluation - Test - Canceled] !!");

        }
         

    }//GEN-LAST:event_AddTaskPhaseButtonActionPerformed

    private void AddProjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProjectButtonActionPerformed
        // TODO add your handling code here:
        Integer x = Integer.valueOf(ProjectIdTextField.getText());
        project p = new project(x);
        a.addProject(p);
        JOptionPane.showMessageDialog(null, "Project added successfully !!");

    }//GEN-LAST:event_AddProjectButtonActionPerformed

    private void ProjectIdTPTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProjectIdTPTextFieldKeyPressed
        // TODO add your handling code here:
        // code to get only numbers 
      char c = evt.getKeyChar();
      if (Character.isLetter(c))
      {
          ProjectIdTextField.setEditable(false);
         JOptionPane.showMessageDialog(null, "Error , please enter numeric value");
          
      }
      else
      {
          ProjectIdTextField.setEditable(true);
      }
    }//GEN-LAST:event_ProjectIdTPTextFieldKeyPressed

    private void TaskIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaskIdTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TaskIdTextFieldActionPerformed

    private void TaskIdTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TaskIdTextFieldKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
      if (Character.isLetter(c))
      {
          TaskIdTextField.setEditable(false);
         JOptionPane.showMessageDialog(null, "Error , please enter numeric value");
          
      }
      else
      {
          TaskIdTextField.setEditable(true);
      }
    }//GEN-LAST:event_TaskIdTextFieldKeyPressed

    private void IDTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDTextFieldKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
      if (Character.isLetter(c))
      {
          IDTextField.setEditable(false);
         JOptionPane.showMessageDialog(null, "Error , please enter numeric value");
          
      }
      else
      {
          IDTextField.setEditable(true);
      }
    }//GEN-LAST:event_IDTextFieldKeyPressed

    private void ProjectIdTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProjectIdTextFieldKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
      if (Character.isLetter(c))
      {
          ProjectIdTextField.setEditable(false);
         JOptionPane.showMessageDialog(null, "Error , please enter numeric value");
          
      }
      else
      {
          ProjectIdTextField.setEditable(true);
      }
    }//GEN-LAST:event_ProjectIdTextFieldKeyPressed

    private void TaskPhaseTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TaskPhaseTextFieldKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
      if (!Character.isLetter(c))
      {
          TaskPhaseTextField.setEditable(false);
         JOptionPane.showMessageDialog(null, "Error , please enter a string");
          
      }
      else
      {
          TaskPhaseTextField.setEditable(true);
      }
    }//GEN-LAST:event_TaskPhaseTextFieldKeyPressed

    private void UserNameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserNameTextFieldKeyPressed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_UserNameTextFieldKeyPressed

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextFieldActionPerformed

    private void NameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameTextFieldKeyPressed
        // TODO add your handling code here:
                char c = evt.getKeyChar();
      if (!Character.isLetter(c))
      {
          UserNameTextField.setEditable(false);
         JOptionPane.showMessageDialog(null, "Error , please enter a string");
          
      }
      else
      {
          UserNameTextField.setEditable(true);
      }
    }//GEN-LAST:event_NameTextFieldKeyPressed

    private void AgeTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgeTextFieldKeyPressed
        // TODO add your handling code here:
                char c = evt.getKeyChar();
      int n = (AgeTextField.getText().length() );
        if ( n > 2|| Character.isLetter(c)){
                        UserNameTextField.setEditable(false);
                     JOptionPane.showMessageDialog(null, "Error , please enter a numeric value from 2 digits");
        }
      else
      {
          UserNameTextField.setEditable(true);
      }
    }//GEN-LAST:event_AgeTextFieldKeyPressed

    private void AgeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeTextFieldActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_AgeTextFieldActionPerformed

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_LogOutButtonActionPerformed
        // TODO add your handling code here:
       dispose();

    }// GEN-LAST:event_LogOutButtonActionPerformed

    private void UserNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_UserNameTextFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_UserNameTextFieldActionPerformed

    private void IDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_IDTextFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_IDTextFieldActionPerformed

    private void AddUserButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_AddUserButtonActionPerformed
        // TODO add your handling code here:
        Integer i1 = Integer.valueOf(IDTextField.getText());
        Integer i2 = Integer.valueOf(AgeTextField.getText());

       if (RoleComboBox1.getSelectedItem().toString().equalsIgnoreCase("Leader"))
       {
           //  leader(String name, int id, int age, String username, String password) {

           leader l = new leader(NameTextField.getText(),i1,i2,UserNameTextField.getText(),PasswordUserField.getText());
           a.addLeader(l);
            JOptionPane.showMessageDialog(null, "Leader added successfully !!");
       }
       else if (RoleComboBox1.getSelectedItem().toString().equalsIgnoreCase("Employee"))
       {

           employee e = new employee(NameTextField.getText(),i1,i2,UserNameTextField.getText(),PasswordUserField.getText());
           a.addEmp(e);
           JOptionPane.showMessageDialog(null, "Employee added successfully !!");
       }
    }// GEN-LAST:event_AddUserButtonActionPerformed

    private void RoleComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_RoleComboBox1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_RoleComboBox1ActionPerformed

    private void ProjectIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ProjectIdTextFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_ProjectIdTextFieldActionPerformed

    private void ProjectLeaderTextFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ProjectLeaderTextFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_ProjectLeaderTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProjectButton;
    private javax.swing.JButton AddTaskPhaseButton;
    private javax.swing.JButton AddUserButton;
    private javax.swing.JTabbedPane AdminPane;
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JTextField AgeTextField;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JLabel Id;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField PasswordUserField;
    private javax.swing.JLabel ProjectIdTPLabel;
    private javax.swing.JTextField ProjectIdTPTextField;
    private javax.swing.JTextField ProjectIdTextField;
    private javax.swing.JLabel ProjectLabel;
    private javax.swing.JComboBox<String> RoleComboBox1;
    private javax.swing.JLabel RoleLabel;
    private javax.swing.JLabel TaskIdLabel;
    private javax.swing.JTextField TaskIdTextField;
    private javax.swing.JLabel TaskPhaseLabel;
    private javax.swing.JTextField TaskPhaseTextField;
    private javax.swing.JTextField UserNameTextField;
    private javax.swing.JLabel Username;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
