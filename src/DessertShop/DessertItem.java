/*
* File: Lab6b.java
* Description: made DessertItem(superclass) become abstract class. Create get Name, set name,setTaxPercent, getTaxPercent,calculateTox function.
* Add packaging attribute and made set/get packaging method.
* Rewrite compareTo method, to compare dessert's cost.
* Lessons Learned:
Use an existing Java library Interface
Implement the Comparable interface in a class you create
Sort an array of objects using the data members of a class
* Instructor's Name: Barbara Chamberlin
*
* @author     Rose Wang
* @since       02/13/2023
 */



package DessertShop;

public abstract class DessertItem implements Packaging, Comparable<DessertItem>{
    private String name;
    private double taxPercent= 7.25;
    private String packaging;

    public DessertItem(){
        name="";
    }
    public DessertItem(String name){
        this.name=name;
    }
    public String getPackaging(){
        return packaging;
    }
    public void setPackaging(String packaging){
        this.packaging=packaging;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setTaxPercent(double t){
        taxPercent=t;
    }
    public double getTaxPercent(){
        return taxPercent/100;
    }
    public abstract double calculateCost();
    public double calculateTax(){
        return calculateCost()*(taxPercent/100);
    }

    public int compareTo(DessertItem other) {
        if (this.calculateCost() > other.calculateCost()) {
            return 1;
        } else if (this.calculateCost() < other.calculateCost()) {
            return -1;
        } else {
            return 0;
        }
    }
}
