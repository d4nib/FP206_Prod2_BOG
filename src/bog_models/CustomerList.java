/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    public boolean contains(String nif) {
        for (Iterator iter = this.list.iterator(); iter.hasNext();) {
            Customer c = (Customer) iter.next();
            if (c.getIdCardNumber().equals(nif)) {
                return true;
            }
        }
        return false;
    }
}
