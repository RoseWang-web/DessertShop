/*
* File: Lab7a.java
* Description: Description: the subclass of DessertItem.Set order for adding dessert and get dessert. Override soString() method to Receive order and print every order out.
* made the body of interface Payable's set/get PayType method.
* Add payType to the print list.
* create method get/set pay type
* make sure new item doesn't same as old item, if so, add the amount to the old item from the new one.
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

import java.util.ArrayList;

public class Order implements Payable{
    private ArrayList<DessertItem> order;
    private String finalOutput;
    private PayType payMethod;
    public Order() {
        order = new ArrayList<DessertItem>();
        payMethod=PayType.Cash;

    }
    public PayType getPayType(){
        return payMethod;
    }
    public void setPayType(PayType paytype){
        payMethod=paytype;
    }
    public ArrayList<DessertItem> getOrderList(){
        return order;
    }
    public void add(DessertItem newDes){
        if (newDes instanceof Candy){
            for(DessertItem existing: this.order){
                if(existing instanceof Candy){
                    if (((Candy)newDes).isSameAs((Candy)existing)){
                        ((Candy) existing).setCandyWeight(((Candy) existing).getCandyWeight()+((Candy) newDes).getCandyWeight());
                        return;
                    }//end of if
                }
            }//end of for
        }//end of if instanceof
        if (newDes instanceof Cookie){
            for(DessertItem existing: this.order){
                if(existing instanceof Cookie){
                    if (((Cookie)newDes).isSameAs((Cookie)existing)){
                        ((Cookie) existing).setCookieQty(((Cookie) existing).getCookieQty()+((Cookie) newDes).getCookieQty());
                        return;
                    }//end of if
                }
            }//end of for
        }//end of if instanceof
        order.add(newDes);
    }
    public int itemCount(){
        return order.size();
    }
    public double  orderCost(){
        double totalcost=0.0;
        for(DessertItem D: order)
        {
           totalcost+= D.calculateCost();

        }
        return totalcost;
    }
    public double  orderTax(){
        double totalTax=0.0;
        for(DessertItem D: order)
        {
            totalTax+= D.calculateTax();

        }
        return totalTax;
    }

    public String toString(){
        finalOutput="";
        finalOutput += "------------------------Receipt-------------------\n";
        for (DessertItem Dessert:order)
        {
            finalOutput +=Dessert;
        }
        finalOutput += "--------------------------------------------------\n";
        String outputVar01=String.format("Total items in the order: "+itemCount()+"\n");
        finalOutput +=outputVar01;
        String outputVar02=String.format("%-47s$%-5.2f [Tax: $%-3.2f]\n","Order Subtotals:",orderCost(),orderTax());
        finalOutput +=outputVar02;
        String outputVar03=String.format("%-47s$%-10.2f%n","Order Total:",orderCost()+orderTax());
        finalOutput +=outputVar03;
        finalOutput += "---------------------------------------------------\n";
        finalOutput += "Paid for with "+payMethod+"\n";

        return finalOutput;
    }
}
