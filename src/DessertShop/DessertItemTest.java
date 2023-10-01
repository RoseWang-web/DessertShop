/*
* File: Lab6b.java
* Description: Test class DessertItem's function. Added setTaxPercent and getTaxPercent test. Change setName and getName
* object type from DessertItem to Candy type.
* test all possible return values of compareTo(DessertItem)
* Lessons Learned:
Use an existing Java library Interface
Implement the Comparable interface in a class you create
Sort an array of objects using the data members of a class
* Instructor's Name: Barbara Chamberlin
*
* @author     Rose Wang
* @since       02/13/2023
 */

package DessertShop;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class DessertItemTest {
    @org.junit.jupiter.api.Test
    void setName() {
        Candy D1= new Candy("Rose",3,4.0);
        D1.setName("Queen");
        assertEquals(D1.getName(),"Queen");
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Candy D1= new Candy("Rose",3,4.0);
        assertEquals(D1.getName(),"Rose");
    }

    @Test
    void setTaxPercent() {
        Candy D1= new Candy("Rose",3,4.0);
        D1.setTaxPercent(2.1);
        assertEquals(D1.getTaxPercent(),0.021);
    }

    @Test
    void getTaxPercent() {
        Candy D1= new Candy("Rose",3,4.0);
        assertEquals(D1.getTaxPercent(),0.0725);
    }

    @Test
    void getPackaging() {
        Candy D1= new Candy("Rose",3,4.0);
        assertEquals("Bag",D1.getPackaging());
    }

    @Test
    void setPackaging() {
        Candy D1= new Candy("Rose",3,4.0);
        D1.setPackaging("bowl");
        assertEquals("bowl",D1.getPackaging());
    }

    @Test
    void compareToEqual() {

        DessertItem A = new Candy("Candy Corn", 1, 0.25);
        DessertItem B = new Candy("Gummy Bears", 1, 0.25);
        assertEquals(0,A.compareTo(B));
    }//test compareTo method in equal
    @Test
    void compareToGreater() {
        DessertItem A = new Candy("Candy Corn", 2, 0.35);
        DessertItem B = new Candy("Gummy Bears", 1, 0.25);
        assertEquals(1,A.compareTo(B));
    }//test compareTo method in greater way
    @Test
    void compareToLess() {
        DessertItem A = new Candy("Candy Corn", 1.5, 0.25);
        DessertItem B = new Candy("Gummy Bears", 2.25, 0.35);
        assertEquals(-1,A.compareTo(B));
    }//test compareTo method in less way
}