/*
* File: Lab5b.java
* Description: the subclass of DessertItem. Create get and set function for the weight and price of IceCream.. Override soString() method to print out IceCream's value
* with pattern "name,price,total price, tax"
* Set IceCream's packaging attribute in default and "Box"
* Lessons Learned:
Create an Interface
Implement an Interface in a class
* Instructor's Name: Barbara Chamberlin
*
* @author     Rose Wang
* @since       02/08/2023
 */

package DessertShop;

public class IceCream extends DessertItem{
    int scoopCount;
    double pricePerScoop;

    public IceCream(String name){
        super();
        setPackaging("");
        this.scoopCount=0;
        this.pricePerScoop=0.0;
    }
    public IceCream(String name, int scoopCount,double pricePerScoop){
        super(name);
        setPackaging("Bowl");
        this.scoopCount=scoopCount;
        this.pricePerScoop=pricePerScoop;
    }
    public double calculateCost() {
        return getScoopCount()*getPricePerScoop();
    }

    public void setScoopCount(int scoopCount){
        this.scoopCount=scoopCount;
    }
    public int getScoopCount(){
        return this.scoopCount;
    }
    public void setPricePerScoop(double pricePerScoop){
        this.pricePerScoop=pricePerScoop;
    }
    public double getPricePerScoop(){
        return this.pricePerScoop;
    }
    public String toString(){
        String outputVar = String.format("%s(%s)\n\t%-10d scoops @ $%-4.2f /scoop:           $%.2f [Tax: $%5.2f]\n", getName(), getPackaging(), getScoopCount(),getPricePerScoop() ,calculateCost(), calculateTax());
        return outputVar;
    }


}
