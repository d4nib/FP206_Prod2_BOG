package bog_models;

import java.util.ArrayList;


public class Customer {
    protected String firstname;
    protected String lastname;
    protected String email;
    protected String address;
    protected String idCardNumber;
    protected CustomerType type;
    protected ArrayList<Order> orders;
    private double customerFee = 30;
    private int customerDiscount;

    // CONSTRUCTOR
    public Customer(String firstname, String lastname, String email, String address, String idCardNumber,
            CustomerType type) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.idCardNumber = idCardNumber;
        orders = new ArrayList<Order>();
        this.customerDiscount = calculateDiscount();
    }

    private int calculateDiscount() {
        return this.type == CustomerType.PREMIUM ? 20 : 0;
    }

    // SETTERS & GETTERS
    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdCardNumber() {
        return this.idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public CustomerType getType() {
        return this.type;
    }

    public void setType(CustomerType type) {
       this.type = type;
    }

    public double getCustomerFee() {
        return this.customerFee;
    }

    public void setCustomerFee(double customerFee) {
        this.customerFee = customerFee;
    }

    public int getCustomerDiscount() {
        return this.customerDiscount;
    }

    public void setCustomerDiscount(int customerDiscount) {
        this.customerDiscount = customerDiscount;
    }

   
}
