/*
* File: Lab7a.java
* Description: the subclass of DessertItem. Create get and set function for the weight and price of Candy. Override soString() method to print out Candy's value
* with pattern "name,price,total price, tax"
* Set Candy's packaging attribute in default and "Box". compare Candy's new item is same as old one or not.
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

public class Candy extends DessertItem implements SameItem<Candy>{
    double candyWeight;
    double pricePerPound;

    public Candy(){
        super();
        setPackaging("");
        candyWeight=0.0;
        pricePerPound=0.0;
    }

    @Override
    public double calculateCost() {
        return getCandyWeight()*getPricePerPound();
    }
    public boolean isSameAs(Candy c){
        if (this.getName().equals(c.getName())&& this.getPricePerPound()==c.getPricePerPound())
        {
            return true;
        }
        return false;
    }


    public Candy(String name, double candyWeight,double pricePerPound){
        super(name);
        setPackaging("Bag");
        this.candyWeight=candyWeight;
        this.pricePerPound=pricePerPound;
    }
    public void setCandyWeight(double candyWeight){

        this.candyWeight=candyWeight;
    }
    public double getCandyWeight(){
        return this.candyWeight;
    }
    public void setPricePerPound(double pricePerPound){
        this.pricePerPound=pricePerPound;
    }
    public double getPricePerPound(){
        return this.pricePerPound;
    }
    public String toString(){
        String outputVar = String.format("%s(%s)\n\t%-10.2f lbs.    @ $%-4.2f/lb:              $%.2f [Tax:$%5.2f]\n", getName(),getPackaging(),getCandyWeight(),getPricePerPound() ,calculateCost(), calculateTax());
        return outputVar;
    }
}

