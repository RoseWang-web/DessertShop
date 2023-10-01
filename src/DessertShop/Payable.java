/*
* File: Lab6a.java
* Description: Create pay type: CASH, CARD, PHONE.
* create method get/set pay type
* Lessons Learned:
Create an Interface
Implement an Interface in a class
Use an enum
* Instructor's Name: Barbara Chamberlin
*
* @author     Rose Wang
* @since       02/08/2023
 */
package DessertShop;

public interface Payable {
    enum PayType{
        Cash, Card, Phone
    }
    PayType getPayType();
    void setPayType(PayType paytype);
}
