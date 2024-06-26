package com.bankapp.html.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="user_data")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name="SN")
	private int sn;
	
	@Column(name="firstname")
    private String firstname;
	
	@Column(name="lastname")
    private String lastname;
	
	@Column(name="date")
    private String date;
	
	@Column(name="sex")
    private String sex;
	
	@Column(name="NIC_No")
    private String NIC_No;
	
	@Column(name="contact_No")
    private String contact_No;
	
	@Column(name="street_Address")
    private String street_Address;
	
	@Column(name="street_Address2")
    private String street_Address2;

	@Column(name="city")
    private String city;
	
	@Column(name="province")
    private String province;
	
	@Column(name="password")
    private String password;
	
	@Column(name="confirm_password")
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
