package bog_modelo;

import java.util.ArrayList;

public abstract class Customer {
    protected String firstname;
    protected String lastname;
    protected String email;
    protected String address;
    protected String idCardNumbber;
    protected static CustomerType type;
    protected ArrayList<Order> orders;
    


    // CONSTRUCTOR
    public Customer(String firstname, String lastname, String email, String address, String idCardNumbber, CustomerType type) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.idCardNumbber = idCardNumbber;
        orders = new ArrayList<Order>();
    }


    // CUSTOMER TYPE CHECK
//********************************************************************************************************* */
 /*  Según demanda del producto faltarían los métodos:

        public abstract Strig getCustomerType()
        public abstract float calcAnual()
        public abstract float shippingDiscuount()

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


    public String getIdCardNumbber() {
        return idCardNumbber;
    }


    public void setIdCardNumbber(String idCardNumbber) {
        this.idCardNumbber = idCardNumbber;
    }


    

    
    


    


    
}

