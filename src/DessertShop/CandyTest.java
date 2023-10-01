/*
* File: Lab7a.java
* Description: Test class Candy's function. Added calculateTax and calculateCost test.
* test isSameAs method
* Lessons Learned:
Create a generic Interface
Use instanceof to test is an object belongs to a Class
Cast objects from one Class to another
* Instructor's Name: Barbara Chamberlin
*
* @author     Rose Wang
* @since       02/27/2023
 */


package DessertShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandyTest {

    @Test
    void setCandyWeight() {
        Candy C1 = new Candy("Rose", 3, 4.0);
        C1.setCandyWeight(2);
        assertEquals(2, C1.getCandyWeight());
    }

    @Test
    void getCandyWeight() {
        Candy C1 = new Candy("Rose", 3, 4.0);
        assertEquals(C1.getCandyWeight(), 3);
    }

    @Test
    void setPricePerPound() {
        Candy C1 = new Candy("Rose", 3, 4.0);
        C1.setPricePerPound(5.0);
        assertEquals(C1.getPricePerPound(), 5.0);
    }

    @Test
    void getPricePerPound() {
        Candy C1 = new Candy("Rose", 3, 4.0);
        assertEquals(C1.getPricePerPound(), 4.0);
    }

    @Test
    void calculateTax() {
        Candy C1 = new Candy("Rose", 3, 4.0);
        assertEquals(C1.calculateTax(), C1.calculateCost() * C1.getTaxPercent());
    }

    @Test
    void calculateCost() {
        Candy C1 = new Candy("Rose", 3, 4.0);
        assertEquals(C1.calculateCost(), C1.getCandyWeight() * C1.getPricePerPound());
    }

    @Test
    void isSameAsTrue() {
        Candy C1 = new Candy("Rose", 3, 4.0);
        Candy C2 = new Candy("Rose", 1, 4.0);
        assertEquals(true, C1.isSameAs(C2));
    }//Test true
    @Test
    void isSameAsFalse() {
        Candy C1 = new Candy("Rose", 3, 4.0);
        Candy C2 = new Candy("Rose", 3, 2.0);
        assertEquals(false, C1.isSameAs(C2));
    }//Test False
}