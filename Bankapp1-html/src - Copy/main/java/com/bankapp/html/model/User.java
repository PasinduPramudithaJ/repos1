package com.bankapp.html.model;

public class User {
    private String firstname;
    private String lastname;
    private String date;
    private String sex;
    private String NIC_No;
    private String contact_No;
    private String street_Address;
    private String street_Address2;
    private String city;
    private String province;
    private String password;
    private String confirm_password;
   
    // Getters and setters
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNIC_No() {
        return NIC_No;
    }

    public void setNIC_No(String NIC_No) {
        this.NIC_No = NIC_No;
    }

    public String getContact_No() {
        return contact_No;
    }

    public void setContact_No(String contact_No) {
        this.contact_No = contact_No;
    }

    public String getStreet_Address() {
        return street_Address;
    }

    public void setStreet_Address(String street_Address) {
        this.street_Address = street_Address;
    }

    public String getStreet_Address2() {
        return street_Address2;
    }

    public void setStreet_Address2(String street_Address2) {
        this.street_Address2 = street_Address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm_password() {
        return confirm_password;
    }

    public void setConfirm_password(String confirm_password) {
        this.confirm_password = confirm_password;
    }

    @Override
    public String toString() {
        return "User [firstname=" + firstname + ", lastname=" + lastname + ", date=" + date + ", sex=" + sex
                + ", NIC_No=" + NIC_No + ", contact_No=" + contact_No + ", street_Address=" + street_Address
                + ", street_Address2=" + street_Address2 + ", city=" + city + ", province=" + province
                + ", password=" + password + ", confirm_password=" + confirm_password + "]";
    }
}
