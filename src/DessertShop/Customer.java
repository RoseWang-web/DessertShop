/*
 * File: Lab7b.java
 * Description: save customer's information
 * Lessons Learned:
 * Make use of static fields
 * Instructor's Name: Barbara Chamberlin
 *
 * @author     Rose Wang
 * @since       02/28/2023
 */

package DessertShop;

import java.util.ArrayList;

public class Customer {

    private String custName="";
    private ArrayList<Order> orderHistory;;
    int custID=0;
    static int nextCustID= 1000;

    public Customer(String n){
        custName=n;
        this.custID= nextCustID;
        nextCustID++;
        orderHistory= new ArrayList<Order>();
    }
    public String getName(){
        return custName;
    }
    public int getID(){
        return custID;
    }
    public ArrayList<Order> getOrderHistory(){
        return orderHistory;
    }
    public void setName(String n){
        custName=n;

    }
    public void addToHistory(Order o){
        orderHistory.add(o);
    }
}
