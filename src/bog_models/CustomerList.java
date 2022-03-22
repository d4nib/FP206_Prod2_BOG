package bog_models;

import java.util.Iterator;

/**
 *
 * @author irene
 */
public class CustomerList extends List<Customer> {
    @Override
    public void add(Customer customer) throws Exception {
        if (contains(customer.getEmail())) {
            throw new Exception("El cliente ya existe");
        } else
            this.list.add(customer);
    }

    public  boolean contains(String email) {
        for (Iterator<Customer> iter = this.list.iterator(); iter.hasNext();) {
            Customer c = (Customer) iter.next();
            if (c.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
}
