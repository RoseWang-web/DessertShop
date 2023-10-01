/*
* File: Lab9i.java
* Description: The subclass of Residential class. Intend function have: set/get Yard Acres.
 * Calculate House Appraisal price by abstract method calculateAppraisalPrice().
* Lessons Learned:
* Create an interface
Implement the interface in a class
Utilize a HashMap
Use an existing structure of Java classes to build an application
Use sound programming principles to design an application
* Instructor's Name: Barbara Chamberlin
*
* @author     Rose Wang
* @since       03/21/2023
 */
package RealEstate;

public class House extends Residential{
    private double yardAcres;
    public House(){
        super();
        yardAcres=0.0;
    }//make default constructor for House Class
    public House(String streetAddress, String zip, int badCount, int bathCount, double sqFootage, double yardAcres){
        super(streetAddress,zip,badCount,bathCount, sqFootage);
        this.yardAcres=yardAcres<0 ? 0 : yardAcres;
    }//make initial argument constructor for House Class
    public double getYard(){
        return yardAcres;
    }//get yard area
    public void setYardAcres(double yardAcres){
        this.yardAcres=yardAcres<0 ? 0 : yardAcres;
    }//set yard's area
    public double calculateAppraisalPrice(){
        double BasicFootPrice =97.00;
        double BasicBedroomPrice=10000.00;
        double BasicBathroomPrice =12000.00;
        double BasicYardPrice= 460000.00;
        double AP = getSqFootage()*BasicFootPrice+getBedCount()*BasicBedroomPrice+getBathCount()*BasicBathroomPrice;
        AP+=getYard()>0 ? getYard()*BasicYardPrice:0;
        setAppraisalPrice(AP);
        return AP;
    }
    public String toString(){
        String outputVar="";
        outputVar += "-------------------------------------------------------------------------------------------------------\n";
        outputVar+=String.format("%s%s%s%s%s%s\n","Residence Type: ","House", " Address: ",getStreetAddress()," Zip Code: ", getZip());
        outputVar += "-------------------------------------------------------------------------------------------------------\n";
        outputVar+=String.format("%s%10.2f\n%s%10d\n%s%10d\n%s%10.2f\n","Sq Footage: ",getSqFootage(),"Bedrooms:",getBedCount(),
                "Bathrooms:", getBathCount(),"Yard Size (Acres):", getYard());

        outputVar+="------------------------------------------\n";
        outputVar+=String.format("%s%10.2f\n%s%10.2f\n","Appraisal Price:",getAppraisalPrice(),"List Price:",getListPrice());
        outputVar+="------------------------------------------\n";
        return outputVar;
    }
}
