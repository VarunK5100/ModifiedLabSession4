/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.ImageIcon;

/**
 *
 * @author varun
 */
public class User {
    private String firstNameTextField;
    private String lastNameTextField;
    private String ageTextField;
    private String emailTextField;
    private String gender;
    private String patientCategory;
    private String messageTextField;
    private ImageIcon image;
    
    public String getFirstName() {
        return firstNameTextField;
    }

    public void setFirstName(String firstNameTextField) {
        this.firstNameTextField = firstNameTextField;
    }

    public String getLastName() {
        return lastNameTextField;
    }

    public void setLastName(String lastNameTextField) {
        this.lastNameTextField = lastNameTextField;
    }

    public String getAge() {
        return ageTextField;
    }

    public void setAge(String ageTextField) {
        this.ageTextField = ageTextField;
    }

    public String getEmail() {
        return emailTextField;
    }

    public void setEmail(String emailTextField) {
        this.emailTextField = emailTextField;
    }
    public String getMessage(){
        return this.messageTextField;
    }
    public void setMessage(String messageTextField){
        this.messageTextField=messageTextField;
    }
    public String getGender(){
        return this.gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
      public String getCategory(){
        return this.patientCategory;
    }
    public void setCategory(String patientCategory){
        this.patientCategory=patientCategory;
    }

    public String getFirstNameTextField() {
        return firstNameTextField;
    }

    public void setFirstNameTextField(String firstNameTextField) {
        this.firstNameTextField = firstNameTextField;
    }

    public String getLastNameTextField() {
        return lastNameTextField;
    }

    public void setLastNameTextField(String lastNameTextField) {
        this.lastNameTextField = lastNameTextField;
    }

    public String getAgeTextField() {
        return ageTextField;
    }

    public void setAgeTextField(String ageTextField) {
        this.ageTextField = ageTextField;
    }

    public String getEmailTextField() {
        return emailTextField;
    }

    public void setEmailTextField(String emailTextField) {
        this.emailTextField = emailTextField;
    }

    public String getPatientCategory() {
        return patientCategory;
    }

    public void setPatientCategory(String patientCategory) {
        this.patientCategory = patientCategory;
    }

    public String getMessageTextField() {
        return messageTextField;
    }

    public void setMessageTextField(String messageTextField) {
        this.messageTextField = messageTextField;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }
    
}
