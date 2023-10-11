package ui;
import java.awt.Image;
import java.io.File;
import java.util.regex.Matcher;
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
public class ViewPanel extends javax.swing.JPanel {
    private User newUser;
    private ImageIcon imageIcon;
    public ViewPanel(User newUser) {
        initComponents();
        this.newUser=newUser;
        populateData();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        GenderButtonGrp = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        upload = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        patientCategory = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        maleButton = new javax.swing.JRadioButton();
        femaleButton = new javax.swing.JRadioButton();
        preferNotToSayButton = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        displayImageLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        messageTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        jLabel1.setText("FirstName");
        upload.setText("Upload image");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });
        jLabel3.setText("Age");
        patientCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Insured", "Not insured" }));
        jLabel8.setText("Patient Category");
        GenderButtonGrp.add(maleButton);
        maleButton.setText("Male");
        maleButton.setActionCommand("male");
        GenderButtonGrp.add(femaleButton);
        femaleButton.setText("Female");
        femaleButton.setActionCommand("female");
        femaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleButtonActionPerformed(evt);
            }
        });
        GenderButtonGrp.add(preferNotToSayButton);
        preferNotToSayButton.setText("Prefer not to say");
        preferNotToSayButton.setActionCommand("prefer not to say");
        jLabel7.setText("Gender");
        jLabel4.setText("Email");
        jLabel2.setText("LastName");
        jLabel5.setText("Message");
        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); 
        jLabel6.setText("VIEW PATIENT INFORMATION");
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 50));
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel7)
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(preferNotToSayButton)
                                    .addComponent(femaleButton)
                                    .addComponent(maleButton))
                                .addGap(49, 49, 49))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(202, 202, 202)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(firstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                            .addComponent(lastNameTextField)
                                            .addComponent(emailTextField)
                                            .addComponent(messageTextField)
                                            .addComponent(ageTextField)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                                        .addComponent(patientCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(upload)
                        .addGap(194, 194, 194)))
                .addComponent(displayImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(maleButton))
                                .addGap(8, 8, 8)
                                .addComponent(femaleButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(preferNotToSayButton)
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(patientCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(upload)
                                .addGap(33, 33, 33)))
                        .addComponent(submitButton)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(displayImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );
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
            ImageIcon ii = new ImageIcon(selectedImagePath);
            Image imag = ii.getImage().getScaledInstance(displayImageLabel.getWidth(), displayImageLabel.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon ii2=new ImageIcon(imag);
            displayImageLabel.setIcon(new ImageIcon(imag));
            JOptionPane.showMessageDialog(null,"Successfully uploaded","Display Image", JOptionPane.INFORMATION_MESSAGE, ii2);
    }
    }
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String firstName=firstNameTextField.getText();
        String lastName=lastNameTextField.getText();
        String age=ageTextField.getText();
        String email=emailTextField.getText();
        String message=messageTextField.getText();
        String gender=GenderButtonGrp.getSelection().getActionCommand();
        String type=patientCategory.getSelectedItem().toString();
        User newUser=new User();
        newUser.setFirstName(firstNameTextField.getText());
        newUser.setLastName(lastNameTextField.getText());
        newUser.setAge(ageTextField.getText());
        newUser.setEmail(emailTextField.getText());
        newUser.setGender(GenderButtonGrp.getSelection().getActionCommand());
        newUser.setCategory(patientCategory.getSelectedItem().toString());
        String errorMsg="";
        String infoMsg="";
        String regex1 = "[0-9]+";
        String regex2="[A-Za-z]+";
        Pattern regexString = Pattern.compile(regex1);
        Matcher m=regexString.matcher(firstName);
        Matcher m1=regexString.matcher(lastName);
        Pattern regexString2=Pattern.compile(regex2);
        Matcher m2=regexString2.matcher(age);
        try{
            if(firstName.isEmpty()==true||m.matches()==true){
                errorMsg="Entry in firstname is invalid, field cannot be blank or have numerical entry\n";
            }
            else{
                infoMsg=infoMsg+firstName+"\n";
            }
            if(lastName.isEmpty()==true||m1.matches()==true){
                errorMsg=errorMsg+ " Entry in last name is invalid, field cannot be blank or have numerial entry\n";
            }
            else{
                infoMsg=infoMsg+" "+lastName+"\n";
            }
            if(age.isEmpty()==true||m2.matches()==true){
                errorMsg=errorMsg+ " Entry in field is invalid, age cannot be blank or have characters as input\n";
            }
            else{
                infoMsg=infoMsg+" "+age+"\n";
            }
            String splitEmail[]=email.split("@");
            for(int i=0;i<splitEmail.length;i++){
                System.out.println(splitEmail[i]);
            }
            if(email.isEmpty()==true||!email.contains("@")==true||splitEmail[0].isEmpty()==true||splitEmail[1].isEmpty()==true){
                errorMsg=errorMsg + "Email field should have a valid address containing @ with an existing prefix and suffix\n";
            }
            else{
                infoMsg=infoMsg + " "+email+"\n";
            }
            if(message.isEmpty()==true){
                errorMsg=errorMsg + "message field cannot be empty";
            }
            else{
                infoMsg=infoMsg+ " "+message;
            }
            if(GenderButtonGrp.getSelection()==null){
                errorMsg=errorMsg+ "no gender was selected\n";
            }
            else{
                infoMsg=infoMsg+"\n"+ gender;
            }
            if(type=="None"){
                errorMsg=errorMsg+ "no category was selected, none is not a valid selection";
            }
            else{
                infoMsg=infoMsg+"\n"+ type;
            }
            if(errorMsg.isEmpty()==false){
                JOptionPane.showMessageDialog(this, errorMsg, "Alert", HEIGHT);
                return;
            }
            else{
                JOptionPane.showMessageDialog(this, infoMsg, "Alert", HEIGHT);
                return;
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Default error", "Error", HEIGHT);
        }
    }
    private void femaleButtonActionPerformed(java.awt.event.ActionEvent evt) {
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
    private void assignGenderBtn(){
       String selected_gender=this.newUser.getGender();
        System.out.println(selected_gender);
        String male=maleButton.getActionCommand().toLowerCase();
        System.out.println(male);
        if(selected_gender==maleButton.getActionCommand()){
            maleButton.setSelected(true);
        }
        if(selected_gender==femaleButton.getActionCommand()){
            femaleButton.setSelected(true);
        }
        if(selected_gender==preferNotToSayButton.getActionCommand()){
            preferNotToSayButton.setSelected(true);
        }
    }
        JPanel bottomPanel = new JPanel(); 
        FormPanel formPanel = new FormPanel(bottomPanel);
        Image image = formPanel.getImage();
    private void populateData() {
        firstNameTextField.setText(this.newUser.getFirstName());
        lastNameTextField.setText(this.newUser.getLastName());
        ageTextField.setText(this.newUser.getAge());
        emailTextField.setText(this.newUser.getEmail());
        messageTextField.setText(this.newUser.getMessage());
        assignGenderBtn();
        patientCategory.setSelectedItem(this.newUser.getCategory());
        displayImageLabel.setIcon(this.newUser.getImage());
    }
}
