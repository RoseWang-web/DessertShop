/*
 * File: Lab6i.java
 * Description: Test subclass Condo function, include function have: set/get Yard Acres
 * test calculateAppraisalPrice() method.
 * Instructor's Name: Barbara Chamberlin
 *
 * @author     Rose Wang
 * @since       02/20/2023
 */
package RealEstate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    @Test
    void getYard() {
        House H1= new House("Rose Street","85113", 4,3, 500, 50);
        assertEquals(H1.getYard(), 50);
    }//Test method "getYard"
    @Test
    void getYardNegative() {
        House H1= new House("Rose Street","85113", 4,3, 500, -50);
        assertEquals(0, H1.getYard());
    }//Test method "getYard" in negative number

    @Test
    void setYardAcres() {
        House H1= new House("Rose Street","85113", 4,3, 500, 50);
        H1.setYardAcres(200);
        assertEquals(H1.getYard(), 200);
    }//Test method "setYardAcres"
    @Test
    void setYardAcresNegative() {
        House H1= new House("Rose Street","85113", 4,3, 500, 50);
        H1.setYardAcres(-23);
        assertEquals(0, H1.getYard());
    }//Test method "setYardAcres" in Negative

    @Test
    void calculateAppraisalPrice() {
        House H1= new House("Rose Street","85113", 4,2, 2600, 1.75);
        assertEquals(1121200.0, H1.calculateAppraisalPrice());
    }

}