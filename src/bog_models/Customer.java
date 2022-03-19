package bog_models;

import java.util.ArrayList;

public class Customer {
    protected String firstname;
    protected String lastname;
    protected String email;
    protected String address;
    protected String idCardNumber;
    protected static CustomerType type;
    protected ArrayList<Order> orders;

    // CONSTRUCTOR
    public Customer(String firstname, String lastname, String email, String address, String idCardNumber,
            CustomerType type) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.idCardNumber = idCardNumber;
        orders = new ArrayList<Order>();
    }

    // CUSTOMER TYPE CHECK
    // *********************************************************************************************************
    // */
    /*
     * Según demanda del producto faltarían los métodos:
     * 
     * public abstract Strig getCustomerType()
     * public abstract float calcAnual()
     * public abstract float shippingDiscuount()
     * 
     */

    // SETTERS & GETTERS
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumbber) {
        this.idCardNumber = idCardNumbber;
    }

    // Joan

}
