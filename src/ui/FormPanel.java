package ui;

import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.User;

/**
 *
 * @author varun
 */
public class FormPanel extends javax.swing.JPanel {
    private JPanel bottomPanel;
    private Image image;
    private boolean submitted;
    private ImageIcon icon;
    private User newUser = new User();

public FormPanel(){
    submitted = false;
    icon = null;
    image = null;
    bottomPanel = null;
    newUser = null;
}    

    public Image getImage() {
        return image;
    }

    public boolean getSubmiited() {
        return submitted;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public FormPanel(JPanel bottomPanel) {
        initComponents();
        this.bottomPanel = bottomPanel;
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        GenderButtonGrp = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        messageTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        upload = new javax.swing.JButton();
        firstNameTextField = new javax.swing.JTextField();
        displayImageLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        maleButton = new javax.swing.JRadioButton();
        femaleButton = new javax.swing.JRadioButton();
        preferNotToSayButton = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        patientCategory = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel3.setText("Age");
        jLabel4.setText("Email");
        jLabel5.setText("Message");
        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 24));
        jLabel6.setText("REGISTRATION FORM");
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 50));
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 362,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(212, 212, 212)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 24, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jLabel1.setText("FirstName");
        upload.setText("Upload image");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });
        jLabel2.setText("LastName");
        GenderButtonGrp.add(maleButton);
        maleButton.setText("Male");
        maleButton.setActionCommand("male");
        GenderButtonGrp.add(femaleButton);
        femaleButton.setText("Female");
        femaleButton.setActionCommand("female");
        GenderButtonGrp.add(preferNotToSayButton);
        preferNotToSayButton.setText("Prefer not to say");
        preferNotToSayButton.setActionCommand("prefer not to say");
        jLabel7.setText("Gender");
        patientCategory
                .setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Insured", "Not insured" }));
        jLabel8.setText("Patient Category");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(169, 169, 169)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel7)
                                                                .addGap(220, 220, 220)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(preferNotToSayButton)
                                                                        .addComponent(femaleButton)
                                                                        .addComponent(maleButton))
                                                                .addGap(49, 49, 49))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel8)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        Short.MAX_VALUE)
                                                                                .addComponent(patientCategory,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        162,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel1)
                                                                                        .addComponent(jLabel2)
                                                                                        .addComponent(jLabel3)
                                                                                        .addComponent(jLabel4)
                                                                                        .addComponent(jLabel5))
                                                                                .addGap(202, 202, 202)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                                        false)
                                                                                        .addComponent(
                                                                                                firstNameTextField,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                152, Short.MAX_VALUE)
                                                                                        .addComponent(lastNameTextField)
                                                                                        .addComponent(emailTextField)
                                                                                        .addComponent(messageTextField)
                                                                                        .addComponent(ageTextField))))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)
                                                        .addComponent(upload)
                                                        .addGap(194, 194, 194)))
                                .addComponent(displayImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 263,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(33, 33, 33)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel1)
                                                                        .addComponent(firstNameTextField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                23,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(lastNameTextField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(22, 22, 22)
                                                                                .addComponent(jLabel3))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(ageTextField,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(33, 33, 33)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(emailTextField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(38, 38, 38)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(messageTextField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(31, 31, 31)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel7)
                                                                        .addComponent(maleButton))
                                                                .addGap(8, 8, 8)
                                                                .addComponent(femaleButton)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(preferNotToSayButton)
                                                                .addGap(37, 37, 37)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(patientCategory,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                17,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel8))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        103, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(upload)
                                                                .addGap(33, 33, 33)))
                                                .addComponent(submitButton)
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(displayImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62)))));
    }

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String firstName = firstNameTextField.getText();
        String lastName = lastNameTextField.getText();
        String age = ageTextField.getText();
        String email = emailTextField.getText();
        String message = messageTextField.getText();
        String gender = GenderButtonGrp.getSelection().getActionCommand();
        String type = patientCategory.getSelectedItem().toString();

        String errorMsg = "";
        String infoMsg = "";
        String stringDataRegex = "[A-Za-z]+";
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern checkingString = Pattern.compile(stringDataRegex);
        Pattern checkingEmail = Pattern.compile(emailRegex);

        try {
            if (firstName.isEmpty() || !checkingString.matcher(firstName).matches()) {
                errorMsg = "Entry in firstname is invalid, field cannot be blank or have numerical entry\n";
            } else {
                infoMsg = infoMsg + firstName + "\n";
            }
            if (lastName.isEmpty() || !checkingString.matcher(lastName).matches()) {
                errorMsg = errorMsg + " Entry in last name is invalid, field cannot be blank or have numerial entry\n";
            } else {
                infoMsg = infoMsg + " " + lastName + "\n";
            }
            if (age.isEmpty() || checkingString.matcher(age).matches() || Integer.parseInt(age) < 0) {
                errorMsg = errorMsg
                        + " Entry in field is invalid, age cannot be blank,negative or have characters as input\n";
            } else {
                infoMsg = infoMsg + " " + age + "\n";
            }
            
            if (email.isEmpty() || !checkingEmail.matcher(email).matches()) {
                errorMsg = errorMsg
                        + "Email field should have a valid address containing @ with an existing prefix and suffix\n";
            } else {
                infoMsg = infoMsg + " " + email + "\n";
            }
            if (message.isEmpty()) {
                errorMsg = errorMsg + "message field cannot be empty";
            } else {
                infoMsg = infoMsg + " " + message;
            }
            if (GenderButtonGrp.getSelection() == null) {
                errorMsg = errorMsg + "no gender was selected\n";
            } else {
                infoMsg = infoMsg + "\n" + gender;
            }
            if (type == "None") {
                errorMsg = errorMsg + "no category was selected, none is not a valid selection";
            } else {
                infoMsg = infoMsg + "\n" + type;
            }
            if (!errorMsg.isEmpty()) {
                JOptionPane.showMessageDialog(this, errorMsg, "Alert", HEIGHT);
            } else {
                JOptionPane.showMessageDialog(this, infoMsg, "Alert", HEIGHT);
                ViewPanel newFormPanel2 = new ViewPanel(newUser);
                bottomPanel.add(newFormPanel2);
                CardLayout layout = (CardLayout) bottomPanel.getLayout();
                layout.next(bottomPanel);
                newUser.setImage(icon);
                newUser.setFirstName(firstNameTextField.getText());
                newUser.setLastName(lastNameTextField.getText());
                newUser.setAge(ageTextField.getText());
                newUser.setEmail(emailTextField.getText());
                newUser.setGender(GenderButtonGrp.getSelection().getActionCommand());
                newUser.setCategory(patientCategory.getSelectedItem().toString());
                newUser.setMessage(messageTextField.getText());
                submitted = true;
            }
        } catch (Exception e) {
            System.out.println("Exception occured: " + e.getMessage());
        }
    }

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser browseImageFile = new JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(null, selectedImagePath);
            icon = new ImageIcon(selectedImagePath);
            image = icon.getImage().getScaledInstance(displayImageLabel.getWidth(), displayImageLabel.getHeight(),
                    Image.SCALE_SMOOTH);
            displayImageLabel.setIcon(new ImageIcon(image));

        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    private javax.swing.ButtonGroup GenderButtonGrp;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel displayImageLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JRadioButton femaleButton;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JComboBox<String> patientCategory;
    private javax.swing.JRadioButton preferNotToSayButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton upload;

    public boolean getSubmitted() {
        return submitted;
    }

    public JPanel getBottomPanel() {
        return bottomPanel;
    }

    public void setBottomPanel(JPanel bottomPanel) {
        this.bottomPanel = bottomPanel;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setSubmitted(boolean submitted) {
        this.submitted = submitted;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public User getNewUser() {
        return newUser;
    }

    public void setNewUser(User newUser) {
        this.newUser = newUser;
    }

    public javax.swing.ButtonGroup getGenderButtonGrp() {
        return GenderButtonGrp;
    }

    public void setGenderButtonGrp(javax.swing.ButtonGroup genderButtonGrp) {
        GenderButtonGrp = genderButtonGrp;
    }

    public javax.swing.JTextField getAgeTextField() {
        return ageTextField;
    }

    public void setAgeTextField(javax.swing.JTextField ageTextField) {
        this.ageTextField = ageTextField;
    }

    public javax.swing.JLabel getDisplayImageLabel() {
        return displayImageLabel;
    }

    public void setDisplayImageLabel(javax.swing.JLabel displayImageLabel) {
        this.displayImageLabel = displayImageLabel;
    }

    public javax.swing.JTextField getEmailTextField() {
        return emailTextField;
    }

    public void setEmailTextField(javax.swing.JTextField emailTextField) {
        this.emailTextField = emailTextField;
    }

    public javax.swing.JRadioButton getFemaleButton() {
        return femaleButton;
    }

    public void setFemaleButton(javax.swing.JRadioButton femaleButton) {
        this.femaleButton = femaleButton;
    }

    public javax.swing.JTextField getFirstNameTextField() {
        return firstNameTextField;
    }

    public void setFirstNameTextField(javax.swing.JTextField firstNameTextField) {
        this.firstNameTextField = firstNameTextField;
    }

    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public javax.swing.JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public javax.swing.JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public javax.swing.JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(javax.swing.JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public javax.swing.JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(javax.swing.JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public javax.swing.JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(javax.swing.JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public javax.swing.JTextField getLastNameTextField() {
        return lastNameTextField;
    }

    public void setLastNameTextField(javax.swing.JTextField lastNameTextField) {
        this.lastNameTextField = lastNameTextField;
    }

    public javax.swing.JRadioButton getMaleButton() {
        return maleButton;
    }

    public void setMaleButton(javax.swing.JRadioButton maleButton) {
        this.maleButton = maleButton;
    }

    public javax.swing.JTextField getMessageTextField() {
        return messageTextField;
    }

    public void setMessageTextField(javax.swing.JTextField messageTextField) {
        this.messageTextField = messageTextField;
    }

    public javax.swing.JComboBox<String> getPatientCategory() {
        return patientCategory;
    }

    public void setPatientCategory(javax.swing.JComboBox<String> patientCategory) {
        this.patientCategory = patientCategory;
    }

    public javax.swing.JRadioButton getPreferNotToSayButton() {
        return preferNotToSayButton;
    }

    public void setPreferNotToSayButton(javax.swing.JRadioButton preferNotToSayButton) {
        this.preferNotToSayButton = preferNotToSayButton;
    }

    public javax.swing.JButton getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(javax.swing.JButton submitButton) {
        this.submitButton = submitButton;
    }

    public javax.swing.JButton getUpload() {
        return upload;
    }

    public void setUpload(javax.swing.JButton upload) {
        this.upload = upload;
    }
}
