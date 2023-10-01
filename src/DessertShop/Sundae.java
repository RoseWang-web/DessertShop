/*
* File: Lab5b.java
* Description:  the subclass of DessertItem. Create get and set function for Sundae topping name and price. Override soString() method to print out Sundae's value
* with pattern product name, iceCream name, iceCream price,
* Set Sundae's packaging attribute in default and "Box"
* Lessons Learned:
Create an Interface
Implement an Interface in a class
* Instructor's Name: Barbara Chamberlin
*
* @author     Rose Wang
* @since       02/08/2023
 */
package DessertShop;

public class Sundae extends IceCream {
    String toppingName;
    double toppingPrice;

    public Sundae(){

        super("");
        setPackaging("");
        toppingName="";
        toppingPrice=0.0;
    }
    public Sundae(String name, int scoopCount,double pricePerScoop,String toppingName, double toppingPrice){
        super(name,scoopCount,pricePerScoop);
        setPackaging("Boat");
        this.toppingName=toppingName;
        this.toppingPrice=toppingPrice;
    }
    public double calculateCost() {

        return getScoopCount()*getPricePerScoop()+getToppingPrice();
    }
    public void setToppingName(String toppingName) {
        this.toppingName=toppingName;
    }

    public String getToppingName(){

        return this.toppingName;

    }
    public void setToppingPrice(double toppingPrice) {
        this.toppingPrice=toppingPrice;
    }
    public double getToppingPrice() {


        return this.toppingPrice;
    }
    public String toString(){
        String outputVar = String.format("%s (%s)\n\t%-10d scoops of %-4s @ $%s/scoop:\n" +
                        "\t%-10s @ $%-4.2f:                         $%.2f[Tax: $ %5.2f]\n",getName(), getPackaging(), getScoopCount(), getName(), getPricePerScoop() ,
                getToppingName(), getToppingPrice(), calculateCost(), calculateTax());
        return outputVar;
    }
}
