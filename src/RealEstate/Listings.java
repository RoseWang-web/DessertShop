/*
* File: Lab9i.java
* Description:  Implements the Listable interface
Has a single attribute called listings of type HashMap<String, Residential>
Has a no argument (default) constructor that creates a new listings HashMap<String, Residential>
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Listings implements Listable{

    HashMap<String, Residential> listings;
    public Listings(){
        listings = new HashMap<String, Residential>();
    }

    @Override
    public HashMap<String, Residential> getListings() {
        return listings;
    }
    @Override
    public Residential getListing(String key) {
        return listings.get(key);
    }

    @Override
    public Set<String> getStreetAddresses() {
        Set<String> StreetAddresses= listings.keySet();
        return StreetAddresses;
    }
    //    getStreetAddresses() - Takes no arguments and returns a Set<String> of keys from a HashMap<String, Residential>
//    getResidences() - Takes no arguments and returns a Collection<Residential> of values from a HashMap<String, Residential>
//    getListingCount() - Takes no arguments and returns the number of listings in the HashMap<String, Residential>
//    addListing(String, Residential) Returns void. Adds a new key/value pair in a HashMap<String, Residential>
    @Override
    public Collection<Residential> getResidences() {
        return listings.values();
    }

    @Override
    public int getListingCount() {
        return listings.size();
    }

    @Override
    public void addListing(String key, Residential value) {
listings.put(key,value);
}
}





