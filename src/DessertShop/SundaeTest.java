/*
* File: Lab4a.java
* Description: Test class Sundae's function. Added calculateTax and calculateCost test.
* Lessons Learned:
Create an abstract Java class
Create an abstract Java method and the associated concrete methods in the subclasses
Update an existing Java class structure to include additional methods
Add additional JUnit test cases to existing test classes
Regression test existing methods through JUnit test cases
*
* Instructor's Name: Barbara Chamberlin
*
* @author     Rose Wang
* @since       02/2/2023
 */

package DessertShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SundaeTest {

    @Test
    void setToppingName() {
        Sundae S1=new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29);
        S1.setToppingName("is me");
        assertEquals(S1.getToppingName(),"is me");
    }

    @Test
    void getToppingName() {
        Sundae S1=new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29);
        assertEquals(S1.getToppingName(),"Hot Fudge");
    }

    @Test
    void setToppingPrice() {
        Sundae S1=new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29);
        S1.setToppingPrice(8.0);
        assertEquals(S1.getToppingPrice(),8.0);
    }

    @Test
    void getToppingPrice() {
        Sundae S1=new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29);
        assertEquals(S1.getToppingPrice(),1.29);
    }

    @Test
    void calculateTax() {
        Sundae S1=new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29);
        assertEquals(S1.calculateTax(),S1.calculateCost()*S1.getTaxPercent());

    }

    @Test
    void calculateCost() {
        Sundae S1=new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29);
        assertEquals(S1.calculateCost(),S1.getScoopCount()*S1.getPricePerScoop()+S1.getToppingPrice());
    }
}