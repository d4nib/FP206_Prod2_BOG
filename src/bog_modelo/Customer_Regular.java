package bog_modelo;

public class Customer_Regular extends Customer{

    // CONSTRUCTOR
    public Customer_Regular (String firstname, String lastname, String email, String address, String idCardNumbber){
        super(firstname, lastname, email, address, idCardNumbber,type);
        type = CustomerType.REGULAR;
        
    }
    
}
