package bog_models;

public class CustomerRegular extends Customer {

    // CONSTRUCTOR
    public CustomerRegular(String firstname, String lastname, String email, String address, String idCardNumber) {
        super(firstname, lastname, email, address, idCardNumber, CustomerType.REGULAR);

    }

}
