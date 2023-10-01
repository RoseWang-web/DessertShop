/*
 * File: Lab11i.java
 * Description: Bid's interface, provide some basic function about get bid , get bidders
 * add an abstract method calculateAppraisalPrice().
 * Proved:
 * Create an interface and implement it in an abstract class
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

public interface Biddable {
    public HashMap<String, Double> getBids();
    public double getBid(String key);
    public Set<String> getBidders();
    public int getBidCount();
    public void newBid(String key, Double value);

}
