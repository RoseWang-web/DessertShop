/*
* File: Lab9i.java
* Description:  Interface for listing residential. Have basic function for get listing, get residence, get addresses for the whole listings.
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

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public interface Listable {
    public HashMap<String,Residential> getListings();
    public Residential getListing(String key);
    public Set<String> getStreetAddresses();
    public Collection<Residential> getResidences();
    public int getListingCount();
    public void addListing(String key, Residential rvalue);
}
