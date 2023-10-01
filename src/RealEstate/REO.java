/*
* File: Lab11i.java
* Description: Create a class (REO) that contains a main() method to run a user interface that will utilize my Real Estate class structure.
Proved:
* Create an interface and implement it in an abstract class
Use the Random module to make your autopopulate method provide more realistic test data
Use sound programming principles to design an application
 * Instructor's Name: Barbara Chamberlin
* @author     Rose Wang
* @since       03/30/2023
 */
package RealEstate;

import DessertShop.DessertItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class REO {
    static Listings reoListings = new Listings();


    public static void main(String[] args) {
        String delimeter = "----------------------------------------";
        System.out.println(delimeter);
        System.out.println("Main Menu");
        System.out.println(delimeter);
        Scanner in = new Scanner(System.in);
        boolean close = false;
        while (!close) {
            System.out.println("\n1: Listings");
            System.out.println("2: bids");
            System.out.println("What would you like to do? (1-2):");
            String choice = in.nextLine();

            switch (choice) {
                case "1":
                    boolean done = false;
                    while (!done) {
                        System.out.println(delimeter);
                        System.out.println("Listing Menu");
                        System.out.println(delimeter);
                        System.out.println("1: Add Listing");
                        System.out.println("2: Show Listings");
                        System.out.println("3: Auto Populate Listings (Dev tool)");
                        System.out.println("ENTER: Exit back to previous menu");
                        System.out.print("\nWhat would you like to add to the order? (1-3): ");
                        String choice1 = in.nextLine();
                        if (choice1.equals("")) {
                            done = true;
                        } else {
                            listingMenu(choice1, in);
                        }//the end of else
                    }
                    break;


                case "2":
                    done = false;
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
                            done = true;
                        } else {
                            switch (choice1) {
                                case "1":
                                    ArrayList<Residential> ResiList = new ArrayList<Residential>();
                                    System.out.println("Current Listings for REO:\n");
                                    System.out.println("\nNo.      Property (bids)\n");
                                    System.out.println("---------------------------\n");
                                    boolean addBidDone = false;
                                    while (!addBidDone) {
                                        int listNo = 1;
                                        for (String key : reoListings.listings.keySet()) {
                                            System.out.printf("%d:  %-28s (%d)\n", listNo, key, reoListings.getListing(key).getBidCount());
                                            ResiList.add(reoListings.getListing(key));
                                            listNo++;
                                        }
                                        System.out.println("ENTER: Exit back to previous menu\n");

                                        System.out.print("For which property would you like to add a bid?:");

                                        String propChoice = in.nextLine();
                                        if (propChoice.equals("")) {
                                            break;
                                        } else {
                                            try {
                                                int num = Integer.parseInt(propChoice);
                                                System.out.println(ResiList.get(num - 1));
                                                System.out.print("Please enter the name of the bidder: ");
                                                String bidderName = in.nextLine();
                                                boolean bidNum = false;
                                                double newBid = 0;
                                                while (!bidNum) {
                                                    System.out.print("Please enter the new bid: ");
                                                    String answer = in.nextLine();
                                                    try {
                                                        newBid = Double.parseDouble(answer);
                                                        bidNum = true;
                                                    } catch (Exception e) {
                                                        System.out.println("invalid entry.");
                                                    }
                                                }
                                                reoListings.getListing(ResiList.get(num - 1).getStreetAddress()).newBid(bidderName, newBid);
                                                System.out.printf("New bid for property '%s' added.\n", ResiList.get(num - 1).getStreetAddress());
                                            } catch (Exception e) {
                                                System.out.println("invalid entry.");
                                                System.out.println("Hint: put a number");
                                            }
                                        }
                                    }

                                case "2":
                                    addBidDone = false;
                                    while (!addBidDone) {
                                        ArrayList<Residential> ResiList1 = new ArrayList<Residential>();
                                        System.out.println("\nCurrent Listings for REO:\n");
                                        System.out.println("\nNo.      Property (bids)\n");
                                        System.out.println("---------------------------\n");
                                        int listNo = 1;
                                        for (String key : reoListings.listings.keySet()) {
                                            System.out.printf("%d:  %-28s (%d)\n", listNo, key, reoListings.getListing(key).getBidCount());
                                            ResiList1.add(reoListings.getListing(key));
                                            listNo++;
                                        }

                                        System.out.println("ENTER: Exit back to previous menu\n");
                                        System.out.print("For which property would you like to see the current bids?:");
                                        String propChoice = in.nextLine();
                                        if (propChoice.equals("")) {
                                            addBidDone = true;
                                        } else {
                                            try {
                                                int num = Integer.parseInt(propChoice);
                                                System.out.println(ResiList1.get(num - 1));

                                                System.out.println("Current bids for this listing:\n" +
                                                        "---------------------------------------------\n" +
                                                        "         Bidder                          Bid\n" +
                                                        "---------------------------------------------");
                                                for (String name : ResiList1.get(num - 1).getBidders()) {
                                                    System.out.printf("%-20s $%f\n", name, ResiList1.get(num - 1).getBid(name));
                                                }
                                            } catch (Exception e) {
                                                System.out.println("invalid entry.");
                                                System.out.println("Hint: put a number");
                                            }
                                        }
                                    }
                                    break;
                                case "3":
                                    String[] autoBidders = {"Patric Stewart", "Walter Koenig", "William Shatner", "Leonard Nimoy", "DeForect Kelley", "James Doohan", "George Takei", "Majel Barrett", "Nichelle Nichol", "Jonathan Frank"
                                            , "Marina Sirtis", "Brent Spiner", "Gates McFadden", "Michael Dorn", "LeVar Burton", "Wil Wheaton", "Colm Meaney", "Michelle Forbes"};
                                    Random r = new Random();


                                    for (Residential res : reoListings.getResidences()) {
                                        int times = r.nextInt(10);
                                        while (res.getBidCount() < times) {
                                            double maxBid = res.calculateAppraisalPrice() * 1.1;

                                            double minBid = res.calculateAppraisalPrice() * .9;
                                            int index = r.nextInt((autoBidders.length - 1) + 1);
                                            double bidAmount = Math.random() * (maxBid - minBid + 1) + minBid;
                                            res.newBid(autoBidders[index], bidAmount);
                                        }
                                        System.out.printf("%d new bids have been added to listing %s\n", times, res.getStreetAddress());
                                    }

                                    break;
                                default:
                                    System.out.println("Invalid entry");
                                    break;
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("??invalid entry.");
                    break;
            }//first case 1
        }
    }

    static public void listingMenu(String choice1, Scanner in){
        Residential R1;
        switch (choice1) {
            case "1":
                boolean lisFinish = false;
                while (!lisFinish) {
                    System.out.println("----------------------------------------");
                    System.out.println("Add Listing Menu");
                    System.out.println("----------------------------------------");
                    System.out.println("1: Add House");
                    System.out.println("2: Add Condo");
                    System.out.println("ENTER: Exit back to previous menu");
                    System.out.print("\nWhat would you like to add to the order? (1-2):");
                    String choice2 = in.nextLine();
                    if (choice2.equals("")) {
                        lisFinish=true;
                    } else {
                        switch (choice2) {
                            case "1":
                                R1 = userPromptHouse();
                                boolean house = false;
                                while (!house) {
                                    System.out.println("What is your list price?");
                                    String ans = in.nextLine();
                                    try {
                                        R1.setListPrice(Double.parseDouble(ans));
                                        house = true;
                                    } catch (Exception e) {
                                        System.out.println("invalid entry.");
                                    }//end of try/catch
                                }//end of input validation for Candy's weight.
                                reoListings.addListing(R1.getStreetAddress(), R1);
                                System.out.println("You have created a new listing!");
                                System.out.println(R1);
                                break;

                            case "2":
                                R1 = userPromptCondo();
                                house = false;
                                while (!house) {
                                    System.out.println("What is your list price?");
                                    String ans = in.nextLine();
                                    try {
                                        R1.setListPrice(Double.parseDouble(ans));
                                        house = true;
                                    } catch (Exception e) {
                                        System.out.println("invalid entry.");
                                    }//end of try/catch
                                }//end of input validation for Candy's weight.
                                reoListings.addListing(R1.getStreetAddress(), R1);
                                System.out.println("You have created a new listing!");
                                System.out.println(R1);
                                break;
                            default:
                                System.out.println("invalid entry.");
                                break;
                        }//the end of Add Listing Menu switch
                    }// end of else
//
                }//the end of Listing Menu switch
                break;
            case "2":
                int listNo=1;
                System.out.println("Current Listings for REO:\n");
                for(String key:reoListings.listings.keySet()) {

                    System.out.println("Listing No:"+listNo);
                    System.out.println(reoListings.getListing(key));
                    listNo++;
                }
                break;
            case "3":
                int currentSize = reoListings.getListings().size();
                House house1 = new House("34 Elm","95129", 3, 2, 2200, .2);
                house1.setListPrice(house1.calculateAppraisalPrice() * 1.1);
                reoListings.addListing("34 Elm", house1);
                House house2 = new House("42 Hitchhikers","95136", 4, 3, 2800, .3);
                house2.setListPrice(house2.calculateAppraisalPrice() * 1.1);
                reoListings.addListing("42 Hitchhikers", house2);
                Condo condo1 = new Condo("4876 Industrial", "95177", 3, 1, 1800, 3);
                condo1.setListPrice(condo1.calculateAppraisalPrice() * 1.1);
                reoListings.addListing("4876 Industrial", condo1);
                House house3 = new House("2654 Oak","84062", 5, 53, 4200, .5);
                house3.setListPrice(house3.calculateAppraisalPrice() * 1.1);
                reoListings.addListing("2654 Oak", house3);
                Condo condo2 = new Condo("9875 Lexington","84063", 2, 1, 1500, 1);
                condo2.setListPrice(condo2.calculateAppraisalPrice() * 1.1);
                reoListings.addListing("9875 Lexington", condo2);
                Condo condo3 = new Condo("3782 Market", "84066", 3, 1, 1800, 2);
                condo3.setListPrice(condo3.calculateAppraisalPrice() * 1.1);
                reoListings.addListing("3782 Market", condo3);
                House house4 = new House("7608 Glenwood", "84055", 6, 3, 3900, .4);
                house4.setListPrice(house4.calculateAppraisalPrice() * 1.1);
                reoListings.addListing("7608 Glenwood", house4);
                House house5 = new House("1220 Apple", "84057", 8, 7, 7900, 1);
                house5.setListPrice(house5.calculateAppraisalPrice() * 1.1);
                reoListings.addListing("1220 Apple", house5);
                System.out.println("8 residences have been added to the listings for testing purposes.");
                break;
        }

    }
    private static Residential userPromptHouse() {
        int badC = 0;
        int bathC = 0;
        double sq = 0.0;
        double yard = 0.0;
        Scanner in = new Scanner(System.in);
        System.out.println("What is the street address of the House?");
        String streetA = in.nextLine();
        System.out.println("What is the zip of the House?");
        String zip = in.nextLine();
        boolean house = false;
        while (!house) {
            System.out.println("How many badCount of the House?");
            String ans = in.nextLine();
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
            String ans = in.nextLine();
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
            String ans = in.nextLine();
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
            String ans = in.nextLine();
            try {
                yard = Double.parseDouble(ans);
                house = true;
            } catch (Exception e) {
                System.out.println("invalid entry.");
            }//end of try/catch
        }//end of input validation for Candy's weight.
        House H1 = new House(streetA, zip, badC, bathC, sq, yard);

        System.out.printf("%s%10.2f\n", "The Apprisal Price is.", H1.calculateAppraisalPrice());


        return H1;
    }

    private static Residential userPromptCondo() {
        int badC = 0;
        int bathC = 0;
        double sq = 0.0;
        double floor = 0.0;
        Scanner in = new Scanner(System.in);
        System.out.println("What is the street address of the Condo?");
        String streetA = in.nextLine();
        System.out.println("What is the zip of the Condo?");
        String zip = in.nextLine();
        boolean house = false;
        while (!house) {
            System.out.println("How many badCount of the Condo?");
            String ans = in.nextLine();
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
            String ans = in.nextLine();
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
            String ans = in.nextLine();
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
            String ans = in.nextLine();
            try {
                floor = Double.parseDouble(ans);
                house = true;
            } catch (Exception e) {
                System.out.println("invalid entry.");
            }//end of try/catch
        }//end of input validation for Candy's weight.
        Condo C1 = new Condo(streetA, zip, badC, bathC, sq, floor);
        System.out.printf("%s%10.2f\n", "The Apprisal Price is.", C1.calculateAppraisalPrice());

        return C1;
    }

}