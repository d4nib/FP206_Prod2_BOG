package bog_models;

public class CustomerPremium extends Customer {

    // CONSTRUCTOR
    public CustomerPremium(String firstname, String lastname, String email, String address, String idCardNumber,
            double customerFee, int customerDiscount) {
        super(firstname, lastname, email, address, idCardNumber, CustomerType.PREMIUM);
        

    }
}
