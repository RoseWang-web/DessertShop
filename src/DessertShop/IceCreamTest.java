/*
* File: Lab4a.java
* Description: Test class IceCream's function. Added calculateTax and calculateCost test.
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

class IceCreamTest {

    @Test
    void setScoopCount() {
        IceCream I1=new IceCream("Rose",3,4.0);
        I1.setScoopCount(4);
        assertEquals(I1.getScoopCount(),4);
    }

    @Test
    void getScoopCount() {
        IceCream I1=new IceCream("Rose",3,4.0);
        assertEquals(I1.getScoopCount(),3);
    }

    @Test
    void setPricePerScoop() {
        IceCream I1=new IceCream("Rose",3,4.0);
        I1.setPricePerScoop(7.0);
        assertEquals(I1.getPricePerScoop(),7.0);
    }

    @Test
    void getPricePerScoop() {
        IceCream I1=new IceCream("Rose",3,4.0);
        assertEquals(I1.getPricePerScoop(),4.0);
    }

    @Test
    void calculateTax() {
        IceCream I1=new IceCream("Rose",3,4.0);
        assertEquals(I1.calculateTax(),I1.calculateCost()*I1.getTaxPercent());
    }

    @Test
    void calculateCost() {
        IceCream I1=new IceCream("Rose",3,4.0);
        assertEquals(I1.calculateCost(),I1.getScoopCount()*I1.getPricePerScoop());
    }
}