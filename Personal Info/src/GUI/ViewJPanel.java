/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Business.Demographic;
import javax.swing.ImageIcon;
import java.awt.Image;

/**
 *
 * @author owner
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    private Demographic demographic;

    public ViewJPanel(Demographic demographic) {
        initComponents();
        displayDemographic(demographic);
    }

    private void displayDemographic(Demographic demographic) {
        String firstName = demographic.getFirstName();
        FirstNameTextField.setText(firstName);
        FirstNameTextField.setEnabled(false);

        String lastName = demographic.getLastName();
        LastNameTextField.setText(lastName);
        LastNameTextField.setEnabled(false);

        //String phoneNo = Integer.toString(demographic.getPhoneNumber());
        PhoneNumberTextField.setText(demographic.getPhoneNumber());
        PhoneNumberTextField.setEnabled(false);

        DobTextField.setText(demographic.getDateOfBirth());
        DobTextField.setEnabled(false);

//        String dateofbirth = demographic.getDateOfBirth();
//        DobTextField.setText(dateofbirth);
        String age = Integer.toString(demographic.getAge());
        AgeTextField.setText(age);
        AgeTextField.setEnabled(false);

        String weight = Integer.toString(demographic.getWeight());
        WeightTextField.setText(weight);
        WeightTextField.setEnabled(false);

        String height = Integer.toString(demographic.getHeight());
        HeightTextField.setText(height);
        HeightTextField.setEnabled(false);

        //String ssn = Integer.toString(demographic.getSsn());
        SsnTextField.setText(demographic.getSsn());
        SsnTextField.setEnabled(false);

        StreetAddressTextField.setText(demographic.getAddress().getStreetAddress());
        StreetAddressTextField.setEnabled(false);

        CityTextField.setText(demographic.getAddress().getCity());
        CityTextField.setEnabled(false);

        StateTextField.setText(demographic.getAddress().getState());
        StateTextField.setEnabled(false);

        String zip = Integer.toString(demographic.getAddress().getZipCode());
        ZipCodeTextField.setText(zip);
        ZipCodeTextField.setEnabled(false);

        String medicalrecordno = Integer.toString(demographic.getMedicalRecord().getMedicalRecordNo());
        MedicalRecordNoTextField.setText(medicalrecordno);
        MedicalRecordNoTextField.setEnabled(false);

        Alergy1TextField.setText(demographic.getMedicalRecord().getAlergy1());
        Alergy1TextField.setEnabled(false);

        Alergy2TextField.setText(demographic.getMedicalRecord().getAlergy2());
        Alergy2TextField.setEnabled(false);

        Alergy3TextField.setText(demographic.getMedicalRecord().getAlergy3());
        Alergy3TextField.setEnabled(false);

        String licenseno = Integer.toString(demographic.getDriverLicense().getLicenseNo());
        LicenseNoTextField.setText(licenseno);
        LicenseNoTextField.setEnabled(false);

        DOITextField.setText(demographic.getDriverLicense().getDateOfIssue());
        DOITextField.setEnabled(false);

        DOETextField.setText(demographic.getDriverLicense().getDateOfExpiration());
        DOETextField.setEnabled(false);

        BloodTypeTextField.setText(demographic.getDriverLicense().getBloodType());
        BloodTypeTextField.setEnabled(false);

        BankNameTextField.setText(demographic.getAccountInformation().getBankName());
        BankNameTextField.setEnabled(false);

        String routingno = Integer.toString(demographic.getAccountInformation().getRoutingNo());
        RoutingNoTextField.setText(routingno);
        RoutingNoTextField.setEnabled(false);

        String accountno = Integer.toString(demographic.getAccountInformation().getAccountNo());
        AccountNoTextField.setText(accountno);
        AccountNoTextField.setEnabled(false);

        String accountbalance = Integer.toString(demographic.getAccountInformation().getAccountBalance());
        AccountBalanceTextField.setText(accountbalance);
        AccountBalanceTextField.setEnabled(false);

        AccountTypeTextField.setText(demographic.getAccountInformation().getAccountType());
        AccountTypeTextField.setEnabled(false);

        //String filename = demographic.getPathName();
        //ImageIcon icon = new ImageIcon(filename);
        //ImageJLabel.setIcon(icon);
        //ImageJLabel.setEnabled(false);
        //ImageJLabel.setBounds(10, 10, 150, 150);
        
       String filename = demographic.getPathName();
       ImageIcon icon=new ImageIcon(filename);
       ImageJLabel.setIcon(icon);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btNGROUP2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        FirstNameTextField = new javax.swing.JTextField();
        LastNameTextField = new javax.swing.JTextField();
        PhoneNumberTextField = new javax.swing.JTextField();
        DobTextField = new javax.swing.JTextField();
        AgeTextField = new javax.swing.JTextField();
        HeightTextField = new javax.swing.JTextField();
        WeightTextField = new javax.swing.JTextField();
        SsnTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        StreetAddressTextField = new javax.swing.JTextField();
        CityTextField = new javax.swing.JTextField();
        StateTextField = new javax.swing.JTextField();
        ZipCodeTextField = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        MedicalRecordNoTextField = new javax.swing.JTextField();
        Alergy1TextField = new javax.swing.JTextField();
        Alergy2TextField = new javax.swing.JTextField();
        Alergy3TextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        BankNameTextField = new javax.swing.JTextField();
        RoutingNoTextField = new javax.swing.JTextField();
        AccountNoTextField = new javax.swing.JTextField();
        AccountBalanceTextField = new javax.swing.JTextField();
        SavingsRadioBtn = new javax.swing.JRadioButton();
        CheckingRadioBtn = new javax.swing.JRadioButton();
        AccountTypeTextField = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        LicenseNoTextField = new javax.swing.JTextField();
        DOITextField = new javax.swing.JTextField();
        DOETextField = new javax.swing.JTextField();
        BloodTypeTextField = new javax.swing.JTextField();
        ImageJLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIEW DETAILS:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 243, 31));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 376, 966, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 567, 970, 10));

        jLabel2.setText("First Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 74, -1, -1));

        jLabel3.setText("Last Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 118, -1, -1));

        jLabel4.setText("Phone Number:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 153, -1, -1));

        jLabel5.setText("Date of birth:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 188, -1, -1));

        jLabel6.setText("Age:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 230, -1, -1));

        jLabel7.setText("Height:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 266, -1, -1));

        jLabel8.setText("Weight:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 303, -1, -1));

        jLabel9.setText("Social Security Number:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 338, -1, -1));

        FirstNameTextField.setEditable(false);
        FirstNameTextField.setBackground(new java.awt.Color(255, 255, 255));
        add(FirstNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 71, 172, -1));

        LastNameTextField.setEditable(false);
        LastNameTextField.setBackground(new java.awt.Color(255, 255, 255));
        add(LastNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 115, 172, -1));

        PhoneNumberTextField.setEditable(false);
        PhoneNumberTextField.setBackground(new java.awt.Color(255, 255, 255));
        add(PhoneNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 150, 172, -1));

        DobTextField.setEditable(false);
        DobTextField.setBackground(new java.awt.Color(255, 255, 255));
        add(DobTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 185, 172, -1));

        AgeTextField.setEditable(false);
        AgeTextField.setBackground(new java.awt.Color(255, 255, 255));
        add(AgeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 227, 172, -1));

        HeightTextField.setEditable(false);
        HeightTextField.setBackground(new java.awt.Color(255, 255, 255));
        add(HeightTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 262, 172, -1));

        WeightTextField.setEditable(false);
        WeightTextField.setBackground(new java.awt.Color(255, 255, 255));
        WeightTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WeightTextFieldActionPerformed(evt);
            }
        });
        add(WeightTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 300, 172, -1));

        SsnTextField.setEditable(false);
        SsnTextField.setBackground(new java.awt.Color(255, 255, 255));
        add(SsnTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 335, 171, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Profile.jpg"))); // NOI18N
        jLabel10.setText("Demographic Information:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/address.png"))); // NOI18N
        jLabel11.setText("Address:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 130, -1));

        jLabel12.setText("Street Address:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 427, -1, -1));

        jLabel13.setText("City:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 459, -1, -1));

        jLabel14.setText("State:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 494, -1, -1));

        jLabel15.setText("Zip Code:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 529, -1, -1));

        StreetAddressTextField.setEditable(false);
        StreetAddressTextField.setBackground(new java.awt.Color(255, 255, 255));
        add(StreetAddressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 421, 192, -1));

        CityTextField.setEditable(false);
        CityTextField.setBackground(new java.awt.Color(255, 255, 255));
        add(CityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 456, 192, -1));

        StateTextField.setEditable(false);
        StateTextField.setBackground(new java.awt.Color(255, 255, 255));
        add(StateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 491, 192, -1));

        ZipCodeTextField.setEditable(false);
        ZipCodeTextField.setBackground(new java.awt.Color(255, 255, 255));
        ZipCodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZipCodeTextFieldActionPerformed(evt);
            }
        });
        add(ZipCodeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 526, 192, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Medical.jpg"))); // NOI18N
        jLabel27.setText("Medical Record Information:");
        add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 300, -1));

        jLabel28.setText("Medical Record Number:");
        add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 427, -1, -1));

        jLabel29.setText("Alergy One:");
        add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 459, -1, -1));

        jLabel30.setText("Alergy Two:");
        add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 494, -1, -1));

        jLabel31.setText("Alergy Three:");
        add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 529, -1, -1));

        MedicalRecordNoTextField.setEditable(false);
        MedicalRecordNoTextField.setBackground(new java.awt.Color(255, 255, 255));
        add(MedicalRecordNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 150, -1));

        Alergy1TextField.setEditable(false);
        Alergy1TextField.setBackground(new java.awt.Color(255, 255, 255));
        add(Alergy1TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 150, -1));

        Alergy2TextField.setEditable(false);
        Alergy2TextField.setBackground(new java.awt.Color(255, 255, 255));
        add(Alergy2TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, 150, -1));

        Alergy3TextField.setEditable(false);
        Alergy3TextField.setBackground(new java.awt.Color(255, 255, 255));
        add(Alergy3TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, 150, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Account.png"))); // NOI18N
        jLabel16.setText("Account Information:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

        jLabel17.setText("Bank Name:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, -1));

        jLabel18.setText("Bank Routing Number:");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, -1, -1));

        jLabel19.setText("Account Number:");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 700, -1, -1));

        jLabel20.setText("Account Balance:");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 740, -1, -1));

        jLabel21.setText("Account Type:");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 780, -1, -1));

        BankNameTextField.setEditable(false);
        BankNameTextField.setBackground(new java.awt.Color(255, 255, 255));
        add(BankNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 620, 170, -1));

        RoutingNoTextField.setEditable(false);
        RoutingNoTextField.setBackground(new java.awt.Color(255, 255, 255));
        add(RoutingNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 660, 170, 30));

        AccountNoTextField.setEditable(false);
        AccountNoTextField.setBackground(new java.awt.Color(255, 255, 255));
        add(AccountNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 700, 170, -1));

        AccountBalanceTextField.setEditable(false);
        AccountBalanceTextField.setBackground(new java.awt.Color(255, 255, 255));
        add(AccountBalanceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 740, 170, -1));

        SavingsRadioBtn.setBackground(new java.awt.Color(255, 255, 255));
        btNGROUP2.add(SavingsRadioBtn);
        SavingsRadioBtn.setText("Savings");
        SavingsRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavingsRadioBtnActionPerformed(evt);
            }
        });
        add(SavingsRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 780, -1, -1));

        CheckingRadioBtn.setBackground(new java.awt.Color(255, 255, 255));
        btNGROUP2.add(CheckingRadioBtn);
        CheckingRadioBtn.setText("Checking");
        CheckingRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckingRadioBtnActionPerformed(evt);
            }
        });
        add(CheckingRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 780, -1, -1));

        AccountTypeTextField.setEditable(false);
        AccountTypeTextField.setBackground(new java.awt.Color(255, 255, 255));
        add(AccountTypeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 780, 165, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/License.jpg"))); // NOI18N
        jLabel23.setText("Driver's License Information:");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 580, -1, -1));

        jLabel22.setText("License Number:");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 620, -1, -1));

        jLabel24.setText("Date of Issue:");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 660, -1, -1));

        jLabel25.setText("Date of Expiration:");
        add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 700, -1, -1));

        jLabel26.setText("Blood Type:");
        add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 740, -1, -1));

        LicenseNoTextField.setEditable(false);
        LicenseNoTextField.setBackground(new java.awt.Color(255, 255, 255));
        LicenseNoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LicenseNoTextFieldActionPerformed(evt);
            }
        });
        add(LicenseNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 620, 200, -1));

        DOITextField.setEditable(false);
        DOITextField.setBackground(new java.awt.Color(255, 255, 255));
        add(DOITextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 660, 200, -1));

        DOETextField.setEditable(false);
        DOETextField.setBackground(new java.awt.Color(255, 255, 255));
        add(DOETextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 700, 200, -1));

        BloodTypeTextField.setEditable(false);
        BloodTypeTextField.setBackground(new java.awt.Color(255, 255, 255));
        add(BloodTypeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 740, 200, -1));

        ImageJLabel.setBackground(new java.awt.Color(204, 204, 204));
        ImageJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(ImageJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 350, 280));
        ImageJLabel.getAccessibleContext().setAccessibleName("       Your Image Here");
    }// </editor-fold>//GEN-END:initComponents

    private void WeightTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WeightTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WeightTextFieldActionPerformed

    private void ZipCodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZipCodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ZipCodeTextFieldActionPerformed

    private void SavingsRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavingsRadioBtnActionPerformed
        // TODO add your handling code here:
        AccountTypeTextField.setText(SavingsRadioBtn.getText());
    }//GEN-LAST:event_SavingsRadioBtnActionPerformed

    private void CheckingRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckingRadioBtnActionPerformed
        // TODO add your handling code here:
        AccountTypeTextField.setText(CheckingRadioBtn.getText());
    }//GEN-LAST:event_CheckingRadioBtnActionPerformed

    private void LicenseNoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LicenseNoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LicenseNoTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccountBalanceTextField;
    private javax.swing.JTextField AccountNoTextField;
    private javax.swing.JTextField AccountTypeTextField;
    private javax.swing.JTextField AgeTextField;
    private javax.swing.JTextField Alergy1TextField;
    private javax.swing.JTextField Alergy2TextField;
    private javax.swing.JTextField Alergy3TextField;
    private javax.swing.JTextField BankNameTextField;
    private javax.swing.JTextField BloodTypeTextField;
    private javax.swing.JRadioButton CheckingRadioBtn;
    private javax.swing.JTextField CityTextField;
    private javax.swing.JTextField DOETextField;
    private javax.swing.JTextField DOITextField;
    private javax.swing.JTextField DobTextField;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.JTextField HeightTextField;
    private javax.swing.JLabel ImageJLabel;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JTextField LicenseNoTextField;
    private javax.swing.JTextField MedicalRecordNoTextField;
    private javax.swing.JTextField PhoneNumberTextField;
    private javax.swing.JTextField RoutingNoTextField;
    private javax.swing.JRadioButton SavingsRadioBtn;
    private javax.swing.JTextField SsnTextField;
    private javax.swing.JTextField StateTextField;
    private javax.swing.JTextField StreetAddressTextField;
    private javax.swing.JTextField WeightTextField;
    private javax.swing.JTextField ZipCodeTextField;
    private javax.swing.ButtonGroup btNGROUP2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
