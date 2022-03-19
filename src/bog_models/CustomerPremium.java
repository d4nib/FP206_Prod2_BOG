package bog_models;

public class CustomerPremium extends Customer {
    private double customerFee;
    private int customerDiscount;

    // CONSTRUCTOR
    public CustomerPremium(String firstname, String lastname, String email, String address, String idCardNumbber,
            double customerFee, int customerDiscount) {
        super(firstname, lastname, email, address, idCardNumbber, type);
        this.customerFee = customerFee;
        this.customerDiscount = customerDiscount;
        type = CustomerType.PREMIUM;

    }

    // GETTERS & SETTERS
    public double getCustomerFee() {
        return customerFee;
    }

    public void setCustomerFee(double customerFee) {
        this.customerFee = customerFee;
    }

    public int getCustomerDiscount() {
        return customerDiscount;
    }

    public void setCustomerDiscount(int customerDiscount) {
        this.customerDiscount = customerDiscount;
    }

}
