/*
 * File: Lab6i.java
 * Description: Test subclass Condo function, include function have: set/get floor level
 * test calculateAppraisalPrice() method.
 * Instructor's Name: Barbara Chamberlin
 *
 * @author     Rose Wang
 * @since       02/20/2023
 */
package RealEstate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CondoTest {

    @Test
    void setFloorLvl() {
        Condo C1= new Condo("Rose Street","85113", 4,3, 500, 5);
        C1.setFloorLvl(2);
        assertEquals(C1.getFloorLvl(), 2);
    }//Test method "setFloorLvl"
    @Test
    void setFloorLvlNegative() {
        Condo C1= new Condo("Rose Street","85113", 4,3, 500, 5);
        C1.setFloorLvl(-2);
        assertEquals(0, C1.getFloorLvl());
    }//Test method "setFloorLvl" in negative number
    @Test
    void getFloorLvl() {
        Condo C1= new Condo("Rose Street","85113", 4,3, 500, 5);
        assertEquals(C1.getFloorLvl(), 5);
    }//Test method "getFloorLvl"
    @Test
    void getFloorLvlNegative() {
        Condo C1= new Condo("Rose Street","85113", 4,3, 500, -5);
        assertEquals(0, C1.getFloorLvl());
    }//Test method "getFloorLvl" in negative number

    @Test
    void calculateAppraisalPrice() {
        Condo C1= new Condo("Rose Street","85113", 4,3, 500, 5);
        assertEquals(131000.0, C1.calculateAppraisalPrice());
    }
}