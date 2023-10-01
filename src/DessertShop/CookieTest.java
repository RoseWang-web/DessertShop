/*
* File: Lab7a.java
* Description: Test class Cookie's function. Added calculateTax and calculateCost test.
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

class CookieTest {

    @Test
    void setCookieQty() {
        Cookie Co1=new Cookie("Rose",3,4.0);
        Co1.setCookieQty(2);
        assertEquals(Co1.getCookieQty(),2);
    }

    @Test
    void getCookieQty() {
        Cookie Co1=new Cookie("Rose",3,4.0);
        assertEquals(Co1.getCookieQty(),3);
    }

    @Test
    void setPricePerDozen() {
        Cookie Co1=new Cookie("Rose",3,4.0);
        Co1.setPricePerDozen(5.0);
        assertEquals(Co1.getPricePerDozen(),5.0);
    }

    @Test
    void getPricePerDozen() {
        Cookie Co1=new Cookie("Rose",3,4.0);
        assertEquals(Co1.getPricePerDozen(),4.0);
    }

    @Test
    void calculateTax() {
        Cookie Co1=new Cookie("Rose",3,4.0);
        assertEquals(Co1.calculateTax(),Co1.calculateCost()*Co1.getTaxPercent());
    }

    @Test
    void calculateCost() {
        Cookie Co1=new Cookie("Rose",3,4.0);
        assertEquals(Co1.calculateCost(),Co1.getCookieQty()*Co1.getPricePerDozen()/12);
    }

    @Test
    void isSameAsTrue() {
        Cookie Co1=new Cookie("Rose",3,4.0);
        Cookie Co2=new Cookie("Rose",1,4.0);
        assertEquals(true, Co1.isSameAs(Co2));

    }
    @Test
    void isSameAsFalse() {
        Cookie Co1=new Cookie("Rose",3,4.0);
        Cookie Co2=new Cookie("Rose",3,2.0);
        assertEquals(false, Co1.isSameAs(Co2));

    }

}