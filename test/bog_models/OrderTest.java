/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bog_models;

import java.time.LocalDateTime;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author irene
 */
public class OrderTest {
    
    public OrderTest() {
    }
    
    
    @Test
    public void testIsCancellable() {
        System.out.println("isCancellable");
        Product productoTest = new Product("codTest", "nombreTest", "descripcionTest", 5.0, 1, 2);
        Customer clienteTest = new Customer("NombreClienteTest", "ApellidoClienteTest", "emailClienteTest", "direccionClienteTest", "dniClienteTest", CustomerType.REGULAR);
        Order pedidoTest = new Order (productoTest, clienteTest, 3); 
        pedidoTest.sethandlingTime(2);
        pedidoTest.setcreationDataTime(LocalDateTime.now());//pedido hecho hoy        
        boolean expResult = true;
        boolean result = pedidoTest.isCancellable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of clientExists method, of class Order.
     */
    @Test
    public void testClientExists() {
        System.out.println("clientExists");
        Product productoTest = new Product("codTest", "nombreTest", "descripcionTest", 5.75, 0.75, 2  );
        Customer clienteTest = new Customer("NombreClienteTest", "ApellidoClienteTest", "emailClienteTest", "direccionClienteTest", "dniClienteTest", CustomerType.PREMIUM);
        Order pedidoTest = new Order (productoTest, clienteTest, 3);
        boolean expResult = false;
        boolean result = pedidoTest.clientExists();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculateShipping method, of class Order.
     */
    @Test
    public void testCalculateShipping() {
        System.out.println("calculateShipping");
        Product productoTest = new Product("codTest", "nombreTest", "descripcionTest", 5.0, 1.0, 2);
        Customer clienteTest = new Customer("NombreClienteTest", "ApellidoClienteTest", "emailClienteTest", "direccionClienteTest", "dniClienteTest", CustomerType.REGULAR);
        Order pedidoTest = new Order (productoTest, clienteTest, 3);        
        double expResult = 1.0;
        double result = pedidoTest.calculateShipping();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculateOrderTotal method, of class Order.
     */
    @Test
    public void testCalculateOrderTotal() {
        System.out.println("calculateOrderTotal");
        Product productoTest = new Product("codTest", "nombreTest", "descripcionTest", 5.0, 1.0, 2);
        Customer clienteTest = new Customer("NombreClienteTest", "ApellidoClienteTest", "emailClienteTest", "direccionClienteTest", "dniClienteTest", CustomerType.REGULAR);
        Order pedidoTest = new Order (productoTest, clienteTest, 3);   //precio total 5.0*3+1=16 
        double expResult = 16; //no se por qué da 15 y no 16, no parece que este sumando el shipping
        double result = pedidoTest.calculateOrderTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of orderSent method, of class Order.
     */
    @Test
    public void testOrderSent() {
        System.out.println("orderSent");
        Product productoTest = new Product("codTest", "nombreTest", "descripcionTest", 5.0, 1, 2);
        Customer clienteTest = new Customer("NombreClienteTest", "ApellidoClienteTest", "emailClienteTest", "direccionClienteTest", "dniClienteTest", CustomerType.REGULAR);
        Order pedidoTest = new Order (productoTest, clienteTest, 3); 
        pedidoTest.sethandlingTime(2);
        pedidoTest.setcreationDataTime(LocalDateTime.now());//pedido hecho hoy
        LocalDateTime handlingResult = pedidoTest.getcreationDataTime().plusDays(pedidoTest.gethandlingTime());//el pedido se enviara 2 dias despues del creationDataTime (ahora)
        boolean expResult = false;
        boolean result = pedidoTest.orderSent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}