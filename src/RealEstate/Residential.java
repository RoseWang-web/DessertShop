/*
 * File: Lab11i.java
 * Description: The subclass of Property class. Intend function have: set/get bad count, set/get bath count, set/get Square footage.
 * add an abstract method calculateAppraisalPrice().
 * Proved:Create an interface and implement it in an abstract class
Use the Random module to make your autopopulate method provide more realistic test data
Use sound programming principles to design an application
 * Instructor's Name: Barbara Chamberlin
 *
 * @author     Rose Wang
 * @since       03/30/2023
 */
package RealEstate;

import java.util.HashMap;
import java.util.Set;

public abstract class Residential extends Property implements Biddable{
    private HashMap<String, Double> bids= new HashMap<String, Double>();
    private int badCount;
    private int bathCount;
    private double sqFootage;
    public Residential(){
        super();
        badCount=0;
        bathCount=0;
        sqFootage=0.0;

    }//make default constructor for Residential Class
    public Residential(String streetAddress, String zip, int badCount, int bathCount, double sqFootage){
        super(streetAddress,zip);
        this.badCount= Math.max(badCount, 0);
        this.bathCount=Math.max(bathCount, 0);
        this.sqFootage=Math.max(sqFootage, 0);
    }//make initial argument constructor for Residential Class
    public void setBeds(int badCount){
        this.badCount=Math.max(badCount, 0);
    }
    //set Bedroom's number
    public int getBedCount(){
        return badCount;
    }//get Bedroom's number
    public void setBaths(int bathCount){
        this.bathCount=Math.max(bathCount, 0);;
    }//set Bathroom's number

    public int getBathCount() {
        return bathCount;
    }//get Bathroom's number

    public void setSize(double sqFootage){
        this.sqFootage=Math.max(sqFootage, 0);
    }//set Square footage

    public double getSqFootage() {
        return sqFootage;
    }//get Square footage
    public abstract double calculateAppraisalPrice();
    public HashMap<String, Double> getBids(){
        return bids;
    }
    public double getBid(String key){
        return bids.get(key);
    }
    public Set<String> getBidders(){
        return bids.keySet();
    }
    public int getBidCount(){

            return bids.size();
    }
    public void newBid(String key, Double value){
        bids.put(key,value);
    }

}
