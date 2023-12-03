/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import javax.swing.JOptionPane;

/**
 *
 * @author ataturkoglu
 */
public class TeacherGUI extends javax.swing.JFrame {

    /**
     * Creates new form TeacherGUI
     */
    public TeacherGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        teacherForm = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        age = new javax.swing.JLabel();
        subject = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        subjectField = new javax.swing.JTextField();
        location = new javax.swing.JLabel();
        locationField = new javax.swing.JTextField();
        experience = new javax.swing.JLabel();
        experienceField = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        availability = new javax.swing.JLabel();
        availabilityField = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        submitBtn = new javax.swing.JButton();
        voluntierBox = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        navBar = new javax.swing.JMenuBar();
        homeF = new javax.swing.JMenu();
        homeItem = new javax.swing.JMenuItem();
        coursesF = new javax.swing.JMenu();
        coursesItem = new javax.swing.JMenuItem();
        signupMenu = new javax.swing.JMenuItem();
        schoolF = new javax.swing.JMenu();
        donationItem = new javax.swing.JMenuItem();
        schoolItem = new javax.swing.JMenuItem();
        teacherItem = new javax.swing.JMenuItem();
        feedbackT = new javax.swing.JMenu();
        feedbackItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        teacherForm.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        teacherForm.setText("Teacher Form");

        name.setText("Name:");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        age.setText("Age:");

        subject.setText("Subject:");

        email.setText("Email:");

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        subjectField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectFieldActionPerformed(evt);
            }
        });

        location.setText("Location:");

        experience.setText("Experience");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        experienceField.setViewportView(jTextArea1);

        availability.setText("Availability:");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        availabilityField.setViewportView(jTextArea2);

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        voluntierBox.setText("I am a voluntier");
        voluntierBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voluntierBoxActionPerformed(evt);
            }
        });

        jButton1.setText("Upload Document");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        homeF.setText("Home");

        homeItem.setText("Home");
        homeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeItemActionPerformed(evt);
            }
        });
        homeF.add(homeItem);

        navBar.add(homeF);

        coursesF.setText("Courses");

        coursesItem.setText("Courses");
        coursesItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesItemActionPerformed(evt);
            }
        });
        coursesF.add(coursesItem);

        signupMenu.setText("Sign Up");
        signupMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupMenuActionPerformed(evt);
            }
        });
        coursesF.add(signupMenu);

        navBar.add(coursesF);

        schoolF.setText("School");

        donationItem.setText("Donation");
        donationItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donationItemActionPerformed(evt);
            }
        });
        schoolF.add(donationItem);

        schoolItem.setText("School Application");
        schoolItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolItemActionPerformed(evt);
            }
        });
        schoolF.add(schoolItem);

        teacherItem.setText("Voluntarily Teacher");
        teacherItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherItemActionPerformed(evt);
            }
        });
        schoolF.add(teacherItem);

        navBar.add(schoolF);

        feedbackT.setText("Feedback");

        feedbackItem.setText("Feedback");
        feedbackItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackItemActionPerformed(evt);
            }
        });
        feedbackT.add(feedbackItem);

        navBar.add(feedbackT);

        setJMenuBar(navBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(teacherForm))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(name)
                            .addComponent(email)
                            .addComponent(subject)
                            .addComponent(location)
                            .addComponent(age)
                            .addComponent(experience)
                            .addComponent(availability))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(emailField)
                                .addComponent(nameField)
                                .addComponent(subjectField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(locationField)
                                .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(experienceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availabilityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(voluntierBox)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(submitBtn)
                                .addComponent(jButton1)))))
                .addGap(128, 162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(teacherForm)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(email)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subject)
                    .addComponent(subjectField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(location)
                    .addComponent(locationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(experience)
                    .addComponent(experienceField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(availability)
                    .addComponent(availabilityField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(voluntierBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitBtn)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void subjectFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectFieldActionPerformed

    private void voluntierBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voluntierBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voluntierBoxActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Thanks for your submit");
    }//GEN-LAST:event_submitBtnActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void homeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeItemActionPerformed
        // TODO add your handling code here:
        ProjectGUI appGUI = new ProjectGUI();

        // make the new ui appear
        appGUI.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_homeItemActionPerformed

    private void coursesItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesItemActionPerformed
        // TODO add your handling code here:
        CoursesGUI appGUI = new CoursesGUI();

        // make the new ui appear
        appGUI.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_coursesItemActionPerformed

    private void signupMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupMenuActionPerformed
        // TODO add your handling code here:
        SignupGUI newSignupGUI = new SignupGUI();
        newSignupGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signupMenuActionPerformed

    private void donationItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donationItemActionPerformed
        // TODO add your handling code here:
        DonationGUI appGUI = new DonationGUI();

        // make the new ui appear
        appGUI.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_donationItemActionPerformed

    private void schoolItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolItemActionPerformed
        // TODO add your handling code here:
        ApplicationGUI appGUI = new ApplicationGUI();

        // make the new ui appear
        appGUI.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_schoolItemActionPerformed

    private void teacherItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherItemActionPerformed
        // TODO add your handling code here:
        TeacherGUI appGUI = new TeacherGUI();

        // make the new ui appear
        appGUI.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_teacherItemActionPerformed

    private void feedbackItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackItemActionPerformed
        // TODO add your handling code here:
        FeedbackGUI appGUI = new FeedbackGUI();

        // make the new ui appear
        appGUI.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_feedbackItemActionPerformed

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
            java.util.logging.Logger.getLogger(TeacherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel availability;
    private javax.swing.JScrollPane availabilityField;
    private javax.swing.JMenu coursesF;
    private javax.swing.JMenuItem coursesItem;
    private javax.swing.JMenuItem donationItem;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel experience;
    private javax.swing.JScrollPane experienceField;
    private javax.swing.JMenuItem feedbackItem;
    private javax.swing.JMenu feedbackT;
    private javax.swing.JMenu homeF;
    private javax.swing.JMenuItem homeItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel location;
    private javax.swing.JTextField locationField;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameField;
    private javax.swing.JMenuBar navBar;
    private javax.swing.JMenu schoolF;
    private javax.swing.JMenuItem schoolItem;
    private javax.swing.JMenuItem signupMenu;
    private javax.swing.JLabel subject;
    private javax.swing.JTextField subjectField;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel teacherForm;
    private javax.swing.JMenuItem teacherItem;
    private javax.swing.JCheckBox voluntierBox;
    // End of variables declaration//GEN-END:variables
}
