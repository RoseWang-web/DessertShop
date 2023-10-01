/*
* File: Lab6i.java
* Description: make Basic class Property to create others subclass. This class contain set/get street address, set/get street Zip
 * set get list price and appraisal price function.
 * add an abstract method calculateAppraisalPrice().
 * Instructor's Name: Barbara Chamberlin
 *
 * @author     Rose Wang
 * @since       02/20/2023
 */
package RealEstate;

public abstract class Property {
    private String streetAddress;
    private String zip;
    public double listPrice;
    public double appraisalPrice;
    public Property(){
        streetAddress="";
        zip="";
        appraisalPrice=0;
        listPrice=0;
    }//make default constructor for Property Class
    public Property(String streetAddress, String zip){
        this.streetAddress=streetAddress;
        this.zip=zip;
    }//make initial argument constructor for Property Class

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }//set Street Address
    public String getStreetAddress(){
        return streetAddress;
    }//get Street Address

    public void setZip(String zip) {
        this.zip = zip;
    }//set Street Zip

    public String getZip() {
        return zip;
    }//get Street Zip
    public double getListPrice(){
        return listPrice;
    }
    public void setListPrice(double lP){
        listPrice=lP;
    }
    public double getAppraisalPrice(){
        return appraisalPrice;
    }
    protected void setAppraisalPrice(double AP){
        appraisalPrice=AP;
    }
    public abstract double calculateAppraisalPrice();
}//the end of Property class
