/*
* File: Lab9i.java
* Description:  The subclass of Residential class. Intend function have: set/get floor level
 * Calculate Condo Appraisal price by abstract method calculateAppraisalPrice().
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

public class Condo extends Residential{
    private double floorLvl;
    public Condo(){
        super();
        floorLvl=0.0;
    }//make default constructor for Condo Class
    public Condo(String streetAddress, String zip, int badCount, int bathCount, double sqFootage, double floorLvl){
        super(streetAddress,zip,badCount,bathCount, sqFootage);
        this.floorLvl= floorLvl<=0 ? 0:floorLvl;
    }//make initial argument constructor for Condo Class
    public void setFloorLvl(double floorLvl) {
        this.floorLvl = floorLvl<=0 ? 0:floorLvl;
    }//set floor's level
    public double getFloorLvl(){
        return floorLvl;
    }//get floor level
    public double calculateAppraisalPrice(){
        double BasicFootPrice =88.00;
        double BasicBedroomPrice=8000.00;
        double BasicBathroomPrice =10000.00;
        double BasicLevelPrice= 5000.00;
        double AP = getSqFootage()*BasicFootPrice+getBedCount()*BasicBedroomPrice+getBathCount()*BasicBathroomPrice;
        AP+=getFloorLvl()>1 ? (getFloorLvl()-1)*BasicLevelPrice:0;
        setAppraisalPrice(AP);
        return AP;
    }
    public String toString(){
        String outputVar="";
        outputVar += "-------------------------------------------------------------------------------------------------------\n";
        outputVar+=String.format("%s%s%s%s%s%s\n","Residence Type: ","Condo", " Address: ",getStreetAddress()," zip Code: ", getZip());
        outputVar += "-------------------------------------------------------------------------------------------------------\n";
        outputVar+=String.format("%s%10.2f\n%s%10d\n%s%10d\n%s%10.2f\n","Sq Footage: ",getSqFootage(),"Bedrooms:",getBedCount(),
                "Bathrooms:", getBathCount(),"Floor:", getFloorLvl());

        outputVar+="------------------------------------------\n";
        outputVar+=String.format("%s%10.2f\n%s%10.2f\n","Appraisal Price:",getAppraisalPrice(),"List Price:",getListPrice());
        outputVar+="------------------------------------------\n";
        return outputVar;
    }
}
