/*
 * File: Lab6i.java
 * Description: Test super class property function, include set/get street address, set/get street Zip,
 * set get list price and appraisal price function.
 * add an abstract method calculateAppraisalPrice().
 * Instructor's Name: Barbara Chamberlin
 *
 * @author     Rose Wang
 * @since       02/20/2023
 */
package RealEstate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyTest {

    @Test
    void setStreetAddress() {
        House H1= new House("Rose Street","85113", 4,3, 500, 50);
        H1.setStreetAddress("Tina Street");
        assertEquals(H1.getStreetAddress(),"Tina Street");
    }//Test method "set street Address" with subclass House

    @Test
    void getStreetAddress() {
        House H1= new House("Rose Street","85113", 4,3, 500, 50);
        assertEquals(H1.getStreetAddress(),"Rose Street");
    }//Test method "get street Address" with subclass House


    @Test
    void setZip() {
        House H1= new House("Rose Street","85113", 4,3, 500, 50);
        H1.setZip("75833");
        assertEquals(H1.getZip(),"75833");
    }//Test method "set street zip" with subclass House

    @Test
    void getZip() {
        House H1= new House("Rose Street","85113", 4,3, 500, 50);
        assertEquals(H1.getZip(),"85113");
    }//Test method "get street zip" with subclass House

    @Test
    void getListPrice() {
        House H1= new House("Rose Street","85113", 4,3, 500, 50);
        H1.setListPrice(200.00);
        assertEquals(200.00, H1.getListPrice());
    }

    @Test
    void setListPrice() {
        House H1= new House("Rose Street","85113", 4,3, 500, 50);
        H1.setListPrice(200.00);
        assertEquals(200.00, H1.getListPrice());
    }

    @Test
    void getAppraisalPrice() {
        House H1= new House("Rose Street","85113", 4,3, 500, 50);
        H1.setAppraisalPrice(300.00);
        assertEquals(300.00, H1.getAppraisalPrice());
    }

    @Test
    void setAppraisalPrice() {
        House H1= new House("Rose Street","85113", 4,3, 500, 50);
        H1.setAppraisalPrice(300.00);
        assertEquals(300.00, H1.getAppraisalPrice());    }

    @Test
    void calculateAppraisalPrice() {
        House H1= new House("Rose Street","85113", 4,3, 500, 50);
        assertEquals(374500.0, H1.calculateAppraisalPrice());
    }
}//The end of the Property Test.