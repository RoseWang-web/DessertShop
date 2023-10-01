/*
* File: Lab7a.java
* Description:generic interface to Compare new item is same as old one or not.
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

public interface SameItem<T> {
    public boolean isSameAs(T Deseert);

}
