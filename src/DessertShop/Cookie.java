/*
* File: Lab7a.java
* Description: the subclass of DessertItem. Create get and set function for the weight and price of cookie. Override soString() method to print out Cookie's value
* with pattern "name,price,total price, tax"
* Set Cookie's packaging attribute in default and "Box". Compare Cookie's new item is same as old one or not.
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

public class Cookie extends DessertItem implements SameItem<Cookie>{
    int cookieQty;
    double pricePerDozen;
    public Cookie(){
        super();
        setPackaging("");
        cookieQty=0;
        pricePerDozen=0.0;
    }
    public Cookie(String name, int cookieQty, double pricePerDozen){
        super(name);
        setPackaging("Box");
        this.cookieQty=cookieQty;
        this.pricePerDozen=pricePerDozen;

    }
    public boolean isSameAs(Cookie c){
        if (this.getName().equals(c.getName())&& this.getPricePerDozen()==c.getPricePerDozen())
        {
            return true;
        }
            return false;
    }

    public double calculateCost() {
        return getCookieQty()*getPricePerDozen()/12;
    }

    public void setCookieQty(int cookieQty) {
        this.cookieQty=cookieQty;
    }

    public int getCookieQty(){

        return cookieQty;

    }
    public void setPricePerDozen(double PricePerDozen) {
        pricePerDozen=PricePerDozen;
    }

    public double getPricePerDozen() {
        return pricePerDozen;
    }
    public String toString(){
        String outputVar = String.format("%s(%s)\n\t%-10d cookies @ $%-4.2f/dozen:           $%.2f [Tax:$%5.2f]\n", getName(),getPackaging(), getCookieQty(), getPricePerDozen(),calculateCost(), calculateTax());
        return outputVar;
    }

}

