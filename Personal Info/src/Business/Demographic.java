/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author owner
 */
public class Demographic {

    String firstName;
    String lastName;
    String phoneNumber;
    String dateOfBirth;
    int age;
    int height;
    int weight;
    String ssn;
    Address address;
    Driverlicense driverLicense;
    MedicalRecord medicalRecord;
    AccountInformation accountInformation;
    String pathName;

    public Demographic() {
        address = new Address();
        driverLicense = new Driverlicense();
        medicalRecord = new MedicalRecord();
        accountInformation = new AccountInformation();
    }

    
    public String getPathName() {
        return pathName;
    }

    public void setpathName(String pathName) {
       this.pathName = pathName;
    }
    /*public void setPathName(String pathName) {
        this.pathName = pathName;
    }*/

    public String getFirstName() {
        return firstName;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Driverlicense getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(Driverlicense driverLicense) {
        this.driverLicense = driverLicense;
    }

    public AccountInformation getAccountInformation() {
        return accountInformation;
    }

    public void setAccountInformation(AccountInformation accountInformation) {
        this.accountInformation = accountInformation;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }



   

}
