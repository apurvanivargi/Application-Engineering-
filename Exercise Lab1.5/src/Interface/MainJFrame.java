/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Address;
import Business.Person;
import javax.swing.JLabel;

/**
 *
 * @author owner
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private Person person;

    public MainJFrame() {
        initComponents();

        person = new Person();
        displayperson(person);
        displayPersonFrame(person);
    }

    private void displayperson(Person person) {

        person.setFirstName("Apurva");
        System.out.println(person.getFirstName());

        person.setLastName("Nivargi");
        System.out.println(person.getLastName());

        person.setDateOfBirth("02/04/1994");
        System.out.println(person.getDateOfBirth());

        person.setPhonenumber("857-399-6716");
        System.out.println(person.getPhonenumber());

        person.setSsn("12345");
        System.out.println(person.getSsn());

        person.setStreetAddress("abc");

        //WORK ADDRESS
        System.out.println("Work Address");
        person.getAddress1().setStreetLine1("61C Smith Street");
        System.out.println(person.getAddress1().getStreetLine1());

        person.getAddress1().setStreetLine2("abc");
        System.out.println(person.getAddress1().getStreetLine2());

        person.getAddress1().setCity("Boston");
        System.out.println(person.getAddress1().getCity());

        person.getAddress1().setCountry("USA");
        System.out.println(person.getAddress1().getCountry());

        person.getAddress1().setState("MA");
        System.out.println(person.getAddress1().getState());

        person.getAddress1().setZipCode("02120");
        System.out.println(person.getAddress1().getZipCode());

        //LOCAL ADDRESS
        System.out.println("Local Address");
        person.getAddress2().setStreetLine1("61C Smith Street");
        System.out.println(person.getAddress2().getStreetLine1());

        person.getAddress2().setStreetLine2("abc");
        System.out.println(person.getAddress2().getStreetLine2());

        person.getAddress2().setCity("Boston");
        System.out.println(person.getAddress2().getCity());

        person.getAddress2().setCountry("USA");
        System.out.println(person.getAddress2().getCountry());

        person.getAddress2().setState("MA");
        System.out.println(person.getAddress2().getState());

        person.getAddress2().setZipCode("02120");
        System.out.println(person.getAddress2().getZipCode());

        //HOME ADDRESS
        System.out.println("Home Address");
        person.getAddress3().setStreetLine1("61C Smith Street");
        System.out.println(person.getAddress3().getStreetLine1());

        person.getAddress3().setStreetLine2("abc");
        System.out.println(person.getAddress3().getStreetLine2());

        person.getAddress3().setCity("Boston");
        System.out.println(person.getAddress3().getCity());

        person.getAddress3().setCountry("USA");
        System.out.println(person.getAddress3().getCountry());

        person.getAddress3().setState("MA");
        System.out.println(person.getAddress3().getState());

        person.getAddress3().setZipCode("02120");
        System.out.println(person.getAddress3().getZipCode());

    }

    private void displayPersonFrame(Person person) {
        String FirstName = person.getFirstName();
        FirstNameTextField.setText(FirstName);
        FirstNameTextField.setEnabled(false);

        String LastName = person.getLastName();
        LastNameTextField.setText(LastName);
        LastNameTextField.setEnabled(false);

        String DOB = person.getDateOfBirth();
        DOBTextField.setText(DOB);
        DOBTextField.setEnabled(false);

        String PhoneNo = person.getPhonenumber();
        PhoneNoTextField.setText(PhoneNo);
        PhoneNoTextField.setEnabled(false);
        
        String Ssn = person.getSsn();
        SSNTextField.setText(Ssn);
        SSNTextField.setEnabled(false);
        
        String address = person.getStreetAddress();
        StreetAddTextField.setText(address);
        StreetAddTextField.setEnabled(false);

        //Work Address
        String streetline1 = person.getAddress1().getStreetLine1();
        StreetLine1TextField1.setText(streetline1);
        StreetLine1TextField1.setEnabled(false);
        
        String streetline2 = person.getAddress1().getStreetLine2();
        StreetLine2TextField.setText(streetline2);
        StreetLine2TextField.setEnabled(false);
        
        String city = person.getAddress1().getCity();
        CityTextField.setText(city);
        CityTextField.setEnabled(false);
        
        String state = person.getAddress1().getState();
        StateTextField.setText(state);
        StateTextField.setEnabled(false);
        
        String country = person.getAddress1().getCountry();
        CountryTextField.setText(country);
        CountryTextField.setEnabled(false);
        
        String zipcode = person.getAddress1().getZipCode();
        ZipCodeTextField.setText(zipcode);
        ZipCodeTextField.setEnabled(false);

        //Local Address 
        String streetline1_local = person.getAddress3().getStreetLine1();
        StreetLine1TextField2.setText(streetline1_local);
        StreetLine1TextField2.setEnabled(false);
        
        String streetline2_local = person.getAddress3().getStreetLine2();
        StreetLine2TextField1.setText(streetline2_local);
        StreetLine2TextField1.setEnabled(false);
        
        String city_local = person.getAddress3().getCity();
        CityTextField1.setText(city_local);
        CityTextField1.setEnabled(false);
        
        String state_local = person.getAddress3().getState();
        StateTextField1.setText(state_local);
        StateTextField1.setEnabled(false);
        
        String country_local = person.getAddress3().getCountry();
        CountryTextField1.setText(country_local);
        CountryTextField1.setEnabled(false);
        
        String zipcode_local = person.getAddress3().getZipCode();
        ZipCodeTextField1.setText(zipcode_local);
        ZipCodeTextField1.setEnabled(false);

        //Home Address
        String streetline1_home = person.getAddress2().getStreetLine1();
        StreetAdd1TextField2.setText(streetline1_home);
        StreetAdd1TextField2.setEnabled(false);
        
        String streetline2_home = person.getAddress2().getStreetLine2();
        StreetLine2TextField2.setText(streetline2_home);
        StreetLine2TextField2.setEnabled(false);
        
        String city_home = person.getAddress2().getCity();
        CityTextField2.setText(city_home);
        CityTextField2.setEnabled(false);
        
        String state_home = person.getAddress2().getState();
        StateTextField2.setText(state_home);
        StateTextField2.setEnabled(false);
        
        String country_home = person.getAddress2().getCountry();
        CountryTextField3.setText(country_home);
        CountryTextField3.setEnabled(false);
        
        String zipcode_home = person.getAddress2().getZipCode();
        ZipCodeTextField2.setText(zipcode_home);
        ZipCodeTextField2.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FirstNameTextField = new javax.swing.JTextField();
        LastNameTextField = new javax.swing.JTextField();
        StreetAddTextField = new javax.swing.JTextField();
        DOBTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        StreetLine1TextField1 = new javax.swing.JTextField();
        StreetLine2TextField = new javax.swing.JTextField();
        CityTextField = new javax.swing.JTextField();
        StateTextField = new javax.swing.JTextField();
        ZipCodeTextField = new javax.swing.JTextField();
        CountryTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        StreetLine1TextField2 = new javax.swing.JTextField();
        StreetLine2TextField1 = new javax.swing.JTextField();
        CityTextField1 = new javax.swing.JTextField();
        StateTextField1 = new javax.swing.JTextField();
        ZipCodeTextField1 = new javax.swing.JTextField();
        CountryTextField1 = new javax.swing.JTextField();
        ZipCodeTextField2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        CityTextField2 = new javax.swing.JTextField();
        StateTextField2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        StreetLine2TextField2 = new javax.swing.JTextField();
        StreetAdd1TextField2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        CountryTextField3 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        PhoneNoTextField = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        SSNTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PERSON PROFILE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jLabel2.setText("First Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 110, -1));

        jLabel3.setText("Last Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 90, -1));

        jLabel4.setText("Street Address:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 120, 27));

        jLabel5.setText("Date Of Birth:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, -1));

        FirstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(FirstNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 235, -1));
        getContentPane().add(LastNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 235, -1));
        getContentPane().add(StreetAddTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 235, 97));

        DOBTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOBTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(DOBTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 109, -1));

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Work Address", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 260, 270));

        jLabel7.setText("Street Line 1:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, 30));

        jLabel8.setText("Street Line 2:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 100, 30));

        jLabel10.setText("City:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, 40));

        jLabel11.setText("State:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, 40));

        jLabel12.setText("Zip Code:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, 40));

        jLabel13.setText("Country:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, 30));

        StreetLine1TextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StreetLine1TextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(StreetLine1TextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 110, -1));

        StreetLine2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StreetLine2TextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(StreetLine2TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 110, -1));

        CityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(CityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 110, -1));
        getContentPane().add(StateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 110, -1));
        getContentPane().add(ZipCodeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 110, -1));

        CountryTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountryTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(CountryTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 110, -1));

        jLabel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Local Address", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 260, 260, 270));

        jLabel14.setText("Street Line 1:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, 30));

        jLabel15.setText("Street Line 2:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 100, 30));

        jLabel16.setText("City:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, 40));

        jLabel17.setText("State:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, 40));

        jLabel18.setText("Zip Code:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, -1, 40));

        jLabel19.setText("Country:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, 30));

        StreetLine1TextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StreetLine1TextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(StreetLine1TextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 110, -1));

        StreetLine2TextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StreetLine2TextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(StreetLine2TextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 110, -1));

        CityTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(CityTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 110, -1));
        getContentPane().add(StateTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 110, -1));
        getContentPane().add(ZipCodeTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 110, -1));

        CountryTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountryTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(CountryTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 110, -1));
        getContentPane().add(ZipCodeTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 110, -1));

        jLabel20.setText("City:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, -1, 40));

        CityTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(CityTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 110, -1));
        getContentPane().add(StateTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, 110, -1));

        jLabel21.setText("State:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, -1, 40));

        jLabel22.setText("Street Line 2:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 100, 30));

        StreetLine2TextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StreetLine2TextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(StreetLine2TextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 110, -1));

        StreetAdd1TextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StreetAdd1TextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(StreetAdd1TextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, 110, -1));

        jLabel23.setText("Country:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, -1, 30));

        jLabel24.setText("Street Line 1:");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, -1, 30));

        jLabel25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Home Address", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 260, 260, 270));

        CountryTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountryTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(CountryTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 480, 110, -1));

        jLabel26.setText("Zip Code:");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, -1, 40));

        jLabel27.setText("Phone Number:");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, -1));
        getContentPane().add(PhoneNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 110, -1));

        jLabel28.setText("SSN:");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));
        getContentPane().add(SSNTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FirstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameTextFieldActionPerformed

    private void StreetLine1TextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StreetLine1TextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StreetLine1TextField1ActionPerformed

    private void StreetLine2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StreetLine2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StreetLine2TextFieldActionPerformed

    private void CityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityTextFieldActionPerformed

    private void CountryTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountryTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CountryTextFieldActionPerformed

    private void StreetLine1TextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StreetLine1TextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StreetLine1TextField2ActionPerformed

    private void StreetLine2TextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StreetLine2TextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StreetLine2TextField1ActionPerformed

    private void CityTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityTextField1ActionPerformed

    private void CountryTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountryTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CountryTextField1ActionPerformed

    private void CityTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityTextField2ActionPerformed

    private void StreetLine2TextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StreetLine2TextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StreetLine2TextField2ActionPerformed

    private void StreetAdd1TextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StreetAdd1TextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StreetAdd1TextField2ActionPerformed

    private void CountryTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountryTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CountryTextField3ActionPerformed

    private void DOBTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOBTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DOBTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CityTextField;
    private javax.swing.JTextField CityTextField1;
    private javax.swing.JTextField CityTextField2;
    private javax.swing.JTextField CountryTextField;
    private javax.swing.JTextField CountryTextField1;
    private javax.swing.JTextField CountryTextField3;
    private javax.swing.JTextField DOBTextField;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JTextField PhoneNoTextField;
    private javax.swing.JTextField SSNTextField;
    private javax.swing.JTextField StateTextField;
    private javax.swing.JTextField StateTextField1;
    private javax.swing.JTextField StateTextField2;
    private javax.swing.JTextField StreetAdd1TextField2;
    private javax.swing.JTextField StreetAddTextField;
    private javax.swing.JTextField StreetLine1TextField1;
    private javax.swing.JTextField StreetLine1TextField2;
    private javax.swing.JTextField StreetLine2TextField;
    private javax.swing.JTextField StreetLine2TextField1;
    private javax.swing.JTextField StreetLine2TextField2;
    private javax.swing.JTextField ZipCodeTextField;
    private javax.swing.JTextField ZipCodeTextField1;
    private javax.swing.JTextField ZipCodeTextField2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    private void displayperson() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
