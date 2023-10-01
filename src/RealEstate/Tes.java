/*
* File: Lab8i.java
* Description: Create a class (REO) that contains a main() method to run a user interface that will utilize my Real Estate class structure.
* Lessons Learned:
* Create a User Interface
Use sound programming principles to design a class structure
* Instructor's Name: Barbara Chamberlin
*
* @author     Rose Wang
* @since       03/07/2023
 */
package RealEstate;

import DessertShop.DessertItem;

import java.util.ArrayList;
import java.util.Scanner;

public class Tes {
    static Listings listings;

    private static Residential userPromptHouse(){
        int badC=0;
        int bathC=0;
        double sq=0.0;
        double yard=0.0;
        double listPrice=0.0;
        Scanner in= new Scanner(System.in);
        System.out.println("What is the street address of the House?");
        String streetA=in.nextLine();
        System.out.println("What is the zip of the House?");
        String zip=in.nextLine();
        boolean house = false;
        while (!house) {
            System.out.println("How many badCount of the House?");
            String ans=in.nextLine();
            try {
                badC = Integer.parseInt(ans);
                house = true;
            } catch (Exception e) {
                System.out.println("invalid entry.");
            }//end of try/catch
        }//end of input validation for Candy's weight.
        house = false;
        while (!house) {
            System.out.println("How many bathCount of the House?");
            String ans=in.nextLine();
            try {
                bathC = Integer.parseInt(ans);
                house = true;
            } catch (Exception e) {
                System.out.println("invalid entry.");
            }//end of try/catch
        }//end of input validation for Candy's weight.
        house = false;
        while (!house) {
            System.out.println("How many footage square of the House?");
            String ans=in.nextLine();
            try {
                sq = Double.parseDouble(ans);
                house = true;
            } catch (Exception e) {
                System.out.println("invalid entry.");
            }//end of try/catch
        }//end of input validation for Candy's weight.

        house = false;
        while (!house) {
            System.out.println("How big the yard acres of the House?");
            String ans=in.nextLine();
            try {
                yard = Double.parseDouble(ans);
                house = true;
            } catch (Exception e) {
                System.out.println("invalid entry.");
            }//end of try/catch
        }//end of input validation for Candy's weight.
        House H1= new House(streetA,zip,badC,bathC,sq,yard);
        System.out.printf("%s%f","The Apprisal Price is.",H1.getAppraisalPrice());
        house = false;
        while (!house) {
            System.out.println("What is your list price?");
            String ans=in.nextLine();
            try {
                listPrice = Double.parseDouble(ans);
                house = true;
            } catch (Exception e) {
                System.out.println("invalid entry.");
            }//end of try/catch
        }//end of input validation for Candy's weight.
        return H1;
    }
    private static Residential userPromptCondo(){
        int badC=0;
        int bathC=0;
        double sq=0.0;
        double floor=0.0;
        Scanner in= new Scanner(System.in);
        System.out.println("What is the street address of the Condo?");
        String streetA=in.nextLine();
        System.out.println("What is the zip of the Condo?");
        String zip=in.nextLine();
        boolean house = false;
        while (!house) {
            System.out.println("How many badCount of the Condo?");
            String ans=in.nextLine();
            try {
                badC = Integer.parseInt(ans);
                house = true;
            } catch (Exception e) {
                System.out.println("invalid entry.");
            }//end of try/catch
        }//end of input validation for Candy's weight.
        house = false;
        while (!house) {
            System.out.println("How many bathCount of the Condo?");
            String ans=in.nextLine();
            try {
                bathC = Integer.parseInt(ans);
                house = true;
            } catch (Exception e) {
                System.out.println("invalid entry.");
            }//end of try/catch
        }//end of input validation for Candy's weight.
        house = false;
        while (!house) {
            System.out.println("How many footage square of the Condo?");
            String ans=in.nextLine();
            try {
                sq = Double.parseDouble(ans);
                house = true;
            } catch (Exception e) {
                System.out.println("invalid entry.");
            }//end of try/catch
        }//end of input validation for Candy's weight.

        house = false;
        while (!house) {
            System.out.println("How many floors of the Condo?");
            String ans=in.nextLine();
            try {
                floor = Double.parseDouble(ans);
                house = true;
            } catch (Exception e) {
                System.out.println("invalid entry.");
            }//end of try/catch
        }//end of input validation for Candy's weight.
        Condo C1= new Condo(streetA,zip,badC,bathC,sq,floor);
        return C1;
    }
    public String toString(){
        String finalOutput="";
        finalOutput += "-------------------------------------------------------------------------------------------------------\n";
        String outputVar01=String.format("%s%s%s%s%s%s","Residence Type: ",listings.getStreetAddresses(),"           Address: ","Zip Code: ");
        finalOutput += "--------------------------------------------------\n";


        return finalOutput;
    }
    public static void main(String[] args) {

        Residential existResidential;
        System.out.println("----------------------------------------");
        System.out.println("Main Menu");
        System.out.println("----------------------------------------");
        Scanner in= new Scanner(System.in);
        boolean close=false;
        while(!close) {
            System.out.println("\n1: Listings");
            System.out.println("2: bids");
            System.out.println("What would you like to do? (1-2):");
            String choice = in.nextLine();
            switch(choice){
                case "1":
                    boolean done=false;
                    while (!done) {
                        System.out.println("----------------------------------------");
                        System.out.println("Listing Menu");
                        System.out.println("----------------------------------------");
                        System.out.println("1: Add Listing");
                        System.out.println("2: Show Listings");
                        System.out.println("3: Auto Populate Listings (Dev tool)");
                        System.out.println("ENTER: Exit back to previous menu");
                        System.out.print("\nWhat would you like to add to the order? (1-3): ");
                        String choice1 = in.nextLine();
                        if (choice1.equals("")) {
                            done = true;
                        } else {
                            switch (choice1) {
                                case "1":


                                    System.out.println("----------------------------------------");
                                    System.out.println("Add Listing Menu");
                                    System.out.println("----------------------------------------");
                                    System.out.println("1: Add House");
                                    System.out.println("2: Add Condo");
                                    System.out.println("ENTER: Exit back to previous menu");
                                    System.out.print("\nWhat would you like to add to the order? (1-2):");
                                    String choice2 = in.nextLine();
                                    if (choice2.equals("")) {
                                        break;
                                    } else {
                                        switch (choice2) {
                                            case "1":
                                                listings.addListing(userPromptHouse().getStreetAddress(),userPromptHouse());
                                                double apprisalPrice=listings.getListing(userPromptHouse().getStreetAddress()).calculateAppraisalPrice();
                                                System.out.printf("%s%f","The Apprisal Price is.",apprisalPrice);
                                                boolean house = false;
                                                double listPrice=0.0;
                                                while (!house) {
                                                    System.out.println("What is your list price?");
                                                    String ans=in.nextLine();
                                                    try {
                                                        listPrice = Double.parseDouble(ans);
                                                        house = true;
                                                    } catch (Exception e) {
                                                        System.out.println("invalid entry.");
                                                    }//end of try/catch
                                                }//end of input validation for Candy's weight.
                                                listings.getListing(userPromptHouse().getStreetAddress()).setListPrice(listPrice);

                                                System.out.println("You have created a new listing!");

                                                break;


                                            case "2":
//                                                existProperty = userPromptCondo();
//                                                exist.add(existProperty);
//                                                System.out.printf("%n%s%s%s has been added to your order.%n", existProperty.getStreetAddress(), "Condo");
                                                break;
                                            default:
                                                System.out.println("invalid entry.");
                                        }//the end of Add Listing Menu switch
                                    }// end of else
                                default:
                                    System.out.println("invalid entry.");
                            }//the end of Listing Menu switch

                        }//the end of else

                    }

                    break;

                case "2":
                    done=false;
                    while (!done) {
                        System.out.println("----------------------------------------");
                        System.out.println("Bids Menu");
                        System.out.println("----------------------------------------");
                        System.out.println("1: Add New Bids");
                        System.out.println("2: Show Existing Bids");
                        System.out.println("3: Auto Populate Bids (Dev Tool)");
                        System.out.println("ENTER: Exit back to previous menu");
                        System.out.print("\nWhat would you like to add to the order? (1-3): ");
                        String choice1 = in.nextLine();
                        if (choice1.equals("")) {
                            done= true;
                        }else{
                            switch (choice){
                                case "1":
                                    break;
                            }
                        }
                    }
                default:
                    System.out.println("invalid entry.");
            }

        }
    }


}