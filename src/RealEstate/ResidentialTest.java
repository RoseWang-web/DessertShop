/*
 * File: Lab6i.java
 * Description: Test subclass Residential function, include set/get bad count, set/get bath count, set/get Square footage.
 * Instructor's Name: Barbara Chamberlin
 *
 * @author     Rose Wang
 * @since       02/20/2023
 */
package RealEstate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResidentialTest {

    @Test
    void setBeds() {
        House H1= new House("Rose Street","85113", 4,3, 500, 50);
        H1.setBeds(2);
        assertEquals(H1.getBedCount(),2);
    }//Test method "setBeds" with subclass House
    @Test
    void setBedsNeg() {
        House H1= new House("Rose Street","85113", 4,3, 500, 50);
        H1.setBeds(-2);
        assertEquals(0, H1.getBedCount());
    }//Test method "setBeds" with subclass House in Negative number

    @Test
    void getBadCount() {
        House H1= new House("Rose Street","85113", 4,3, 500, 50);
        assertEquals(H1.getBedCount(),4);
    }//Test method "getBedCount" with subclass House
    @Test
    void getBadCountNeg() {
        House H1= new House("Rose Street","85113", -4,3, 500, 50);
        assertEquals(0, H1.getBedCount());
    }//Test method "getBedCount" with subclass House in Negative

    @Test
    void setBaths() {
        House H1= new House("Rose Street","85113", 4,3, 500, 50);
        H1.setBaths(1);
        assertEquals(H1.getBathCount(),1);
    }//Test method "setBaths" with subclass House
    @Test
    void setBathsNeg() {
        House H1= new House("Rose Street","85113", 4,3, 500, 50);
        H1.setBaths(-1);
        assertEquals(0, H1.getBathCount());
    }//Test method "setBaths" with subclass House in Neg

    @Test
    void getBathCount() {
        House H1= new House("Rose Street","85113", 4,3, 500, 50);
        assertEquals(H1.getBathCount(),3);
    }//Test method "getBaths" with subclass House
    @Test
    void getBathCountNeg() {
        House H1= new House("Rose Street","85113", 4,-3, 500, 50);
        assertEquals(0, H1.getBathCount());
    }//Test method "getBaths" with subclass House in Neg

    @Test
    void setSize() {
        House H1= new House("Rose Street","85113", 4,3, 500, 50);
        H1.setSize(100);
        assertEquals(H1.getSqFootage(),100);
    }//Test method "setSize" with subclass House
    @Test
    void setSizeNeg() {
        House H1= new House("Rose Street","85113", 4,3, 500, 50);
        H1.setSize(-100);
        assertEquals(0, H1.getSqFootage());
    }//Test method "setSize" with subclass House in Negative
    @Test
    void getSqFootage() {
        House H1= new House("Rose Street","85113", 4,3, 500, 50);
        assertEquals(H1.getSqFootage(),500);
    }//Test method "getSqFootage" with subclass House
    @Test
    void getSqFootageNeg() {
        House H1= new House("Rose Street","85113", 4,3, -500, 50);
        assertEquals(0, H1.getSqFootage());
    }//Test method "getSqFootage" with subclass House in Negative
}