/*
 * File: Lab7b.java
 * Description: Test Customer class function
 * Lessons Learned:
 * Make use of static fields
 * Instructor's Name: Barbara Chamberlin
 *
 * @author     Rose Wang
 * @since       02/28/2023
 */
package DessertShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getName() {
        Customer c= new Customer("Rose");
        assertEquals("Rose",c.getName());
    }

    @Test
    void getID() {
        Customer d= new Customer("Rose");
        assertEquals(1000,d.getID());
    }

    @Test
    void setName() {
        Customer c= new Customer("Rose");
        c.setName("Isis");
        assertEquals("Isis",c.getName());
    }

}