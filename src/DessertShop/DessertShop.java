/*
* File: Lab8b.java
* Description: Make a dessertShop. Contain 6 different Dessert items. Add an input interface to let user increase order. Change output method to soString() method.
* provide payment and packaging choice and print that out.
* Sort the cost. Thus, the price will print from the cheap one to the expensive one.
* continuously start an entire order.
* having customer name service.
* Having an Admin module.
* Lessons Learned:
Make use of HashMaps
* Instructor's Name: Barbara Chamberlin
*
* @author     Rose Wang
* @since       03/06/2023
 */
package DessertShop;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;

public class DessertShop {

    public static HashMap<String, Customer> customerDB = new HashMap<String, Customer>();
    private static DessertItem userPromptCandy() {
        Scanner inp = new Scanner(System.in);
        double weight = 0;
        double price = 0;
        System.out.print("please enter the Candy's name: ");
        String name = inp.nextLine();

        boolean done = false;
        while (!done) {
            System.out.print("please enter the Candy's weight: ");
            String answer = inp.nextLine();
            try {
                weight = Double.parseDouble(answer);
                done = true;
            } catch (Exception e) {
                System.out.println("invalid entry.");
            }//end of try/catch
        }//end of input validation for Candy's weight.
        done = false;
        while (!done) {
            System.out.print("please enter the Candy's  price: ");
            String answer = inp.nextLine();
            try {
                price = Double.parseDouble(answer);
                done = true;
            } catch (Exception e) {
                System.out.println("invalid entry.");
            }//end of try/catch
        }//end of input validation for Candy's weight.


        Candy C1 = new Candy(name, weight, price);
        return C1;
    }

    private static DessertItem userPromptCookie() {
        Scanner inp = new Scanner(System.in);
        int Qty = 0;
        double price = 0;
        System.out.print("please enter the Cookie's name: ");
        String name = inp.nextLine();

        boolean done = false;
        while (!done) {
            System.out.print("please enter the Cookie's Qty: ");
            String answer = inp.nextLine();
            try {
                Qty = Integer.parseInt(answer);
                done = true;
            } catch (Exception e) {
                System.out.println("invalid entry.");
            }//end of try/catch
        }//end of input validation for Candy's weight.
        done = false;
        while (!done) {
            System.out.print("please enter the Cookie's  price: ");
            String answer = inp.nextLine();
            try {
                price = Double.parseDouble(answer);
                done = true;
            } catch (Exception e) {
                System.out.println("invalid entry.");
            }//end of try/catch
        }//end of input validation for Candy's weight.


        Cookie Co1 = new Cookie(name, Qty, price);
        return Co1;
    }

    private static DessertItem userPromptIceCream() {
        Scanner inp = new Scanner(System.in);
        int count = 0;
        double price = 0;
        System.out.print("please enter the IceCream's name: ");
        String name = inp.nextLine();

        boolean done = false;
        while (!done) {
            System.out.print("please enter the IceCream's number: ");
            String answer = inp.nextLine();
            try {
                count = Integer.parseInt(answer);
                done = true;
            } catch (Exception e) {
                System.out.println("invalid entry.");
            }//end of try/catch
        }//end of input validation for Candy's weight.
        done = false;
        while (!done) {
            System.out.print("please enter the IceCream's  price: ");
            String answer = inp.nextLine();
            try {
                price = Double.parseDouble(answer);
                done = true;
            } catch (Exception e) {
                System.out.println("invalid entry.");
            }//end of try/catch
        }//end of input validation for Candy's weight.


        IceCream I1 = new IceCream(name, count, price);
        return I1;
    }

    private static DessertItem userPromptSundae() {

        Scanner inp = new Scanner(System.in);
        int count = 0;
        double price = 0;
        double topPrice = 0;
        System.out.print("please enter the iceCream of Sundae's name: ");
        String name = inp.nextLine();

        boolean done = false;
        while (!done) {
            System.out.print("please enter the iceCream of Sundae's number: ");
            String answer = inp.nextLine();
            try {
                count = Integer.parseInt(answer);
                done = true;
            } catch (Exception e) {
                System.out.println("invalid entry.");
            }//end of try/catch
        }//end of input validation for Candy's weight.
        done = false;
        while (!done) {
            System.out.print("please enter the Sundae's price: ");
            String answer = inp.nextLine();
            try {
                price = Double.parseDouble(answer);
                done = true;
            } catch (Exception e) {
                System.out.println("invalid entry.");
            }//end of try/catch
        }//end of input validation for Candy's weight.
        System.out.print("please enter the Sundae's top iceCream's name: ");
        String topName = inp.nextLine();

        done = false;
        while (!done) {
            System.out.print("please enter the Sundae's top iceCream price: ");
            String answer = inp.nextLine();
            try {
                topPrice = Double.parseDouble(answer);
                done = true;
            } catch (Exception e) {
                System.out.println("invalid entry.");
            }//end of try/catch
        }//end of input validation for Candy's weight.

        Sundae S1 = new Sundae(name, count, price, topName, topPrice);
        return S1;
    }

    public static <Set> void main(String[] args) {
        boolean closed = false;
        while (!closed) {
            Order order1 = new Order();
            Scanner sIn = new Scanner(System.in);
            String choice;
            DessertItem orderItem;
            String paymentMethod;

            boolean done = false;
            while (!done) {
                System.out.println("\n1: Candy");
                System.out.println("2: Cookie");
                System.out.println("3: Ice Cream");
                System.out.println("4: Sunday");
                System.out.println("5: Admin Module");

                System.out.print("\nWhat would you like to add to the order? (1-5, Enter for done): ");
                choice = sIn.nextLine();

                if (choice.equals("")) {
                    done = true;
                } else {
                    switch (choice) {
                        case "1":
                            orderItem = userPromptCandy();
                            order1.add(orderItem);
                            System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                            break;
                        case "2":
                            orderItem = userPromptCookie();
                            order1.add(orderItem);
                            System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                            break;
                        case "3":
                            orderItem = userPromptIceCream();
                            order1.add(orderItem);
                            System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                            break;
                        case "4":
                            orderItem = userPromptSundae();
                            order1.add(orderItem);
                            System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                            break;
                        case "5":
                            boolean admin=false;
                            while (!admin) {
                                System.out.println("\n1: Shop Customer List");
                                System.out.println("2: Customer Order History");
                                System.out.println("3: Best Customer");
                                System.out.println("4: Exit Admin Module");
                                System.out.print("\nWhat would you like to add to the order? (1-4): ");
                                String choice1 = sIn.nextLine();
                                    switch (choice1) {
                                        case "1":
//                                            ArrayList<String> cus=new ArrayList<String>(customerDB.keySet());
//
//                                                Collections.sort(cus);
                                            for (String n: customerDB.keySet()) {
                                                System.out.printf("%-10s%s%20s%d\n","Customer Name:", n, "Customer ID:", customerDB.get(n).getID());
                                            }
                                            break;
                                        case "2":
                                            boolean tt=false;
                                            while(!tt) {
                                                System.out.print("Enter the name of the customer:");
                                                String nam = sIn.nextLine();

                                                if (!customerDB.containsKey(nam)) {
                                                    System.out.println("The name is not listed");

                                                } else {
                                                    System.out.printf("%-10s%s%20s%d\n", "Customer Name:", nam, "Customer ID:", customerDB.get(nam).getID());
                                                    System.out.println("-------------------------------------------------------------------------");
                                                    int i = 1;
                                                    for (Order o : customerDB.get(nam).getOrderHistory()) {
                                                        System.out.printf("%s%s\n", "Order #:", i);

                                                        System.out.println(o);
                                                        i++;
                                                    }//end of for loop
                                                    tt=true;
                                                }//end of else
                                            }
                                            break;

                                        case "3":
                                            String bestCus="";
                                            int Max=0;
                                            for (String n: customerDB.keySet()){
                                                int i1=customerDB.get(n).getOrderHistory().size();
                                                if (i1>Max){
                                                    Max=i1;
                                                    bestCus=n;
                                                }

                                            }
                                            System.out.println("-------------------------------------------------------------------------");
                                            System.out.printf("%s%s\n","The Dessert Shop's most valued customer is: ",bestCus);
                                            System.out.println("-------------------------------------------------------------------------");
                                            break;
                                        case "4":
                                            admin = true;
                                    }
                                }

                            break;
                        default:
                            System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
                            break;
                    }//end of switch (choice)
                }//end of if (choice.equals(""))
            }//end of while (!done)
            System.out.println("\n");
            DessertItem A = new Candy("Candy Corn", 1.5, 0.25);
            order1.add(A);
            DessertItem B = new Candy("Gummy Bears", .25, 0.35);
            order1.add(B);
            DessertItem C = new Cookie("Chocolate Chip", 6, 3.99);
            order1.add(C);
            DessertItem D = new IceCream("Pistachio", 2, 0.79);
            order1.add(D);
            DessertItem E = new Sundae("Vanilla", 3, 0.69, "Hot Fudge", 1.29);
            order1.add(E);
            DessertItem F = new Cookie("Oatmeal Raisin", 2, 3.45);
            order1.add(F);


            Scanner n=new Scanner(System.in);
            System.out.println("what is your name?");
            String in = n.nextLine();

            if(customerDB.containsKey(in))
            {
                customerDB.get(in).addToHistory(order1);

            }else{
                Customer Cus = new Customer(in);
                Cus.addToHistory(order1);
                customerDB.put(in, Cus);
            }

            boolean valid = false;
            while (!valid) {
                System.out.print("What form of payment will be used?( Cash, Card, Phone):");
                Scanner inp = new Scanner(System.in);
                paymentMethod = inp.nextLine();

                for (Payable.PayType myPay : Payable.PayType.values()) {
                    if (paymentMethod.equals(myPay.name())) {
                        order1.setPayType(myPay);
                        valid = true;
                    }
                }
                if (!valid) {
                    System.out.println("That's not a valid form of payment. Try Cash, Card, or Phone");
                }

            }//end of while



           /* for(DessertItem Dessert:order1.getOrderList())
        {
            System.out.printf("%-20s$%-10.2f[Tax: $%-3.2f]\n",Dessert.getName(),Dessert.calculateCost(),Dessert.calculateTax());

        }
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-20s$%-10.2f[Tax: $%-3.2f]\n","Order Subtotals:",order1.orderCost(),order1.orderTax());

        System.out.printf("%-20s$%-10.2f%n","Order Total:",order1.orderCost()+order1.orderTax());
        System.out.println("Total items in the order: "+order1.itemCount());

            */
            Collections.sort(order1.getOrderList());
            System.out.println(order1);
            System.out.println("---------------------------------------------------------------------------");
            System.out.printf("%-10s%s%20s%d%20s%d\n","Customer Name:",customerDB.get(in).getName(),"Customer ID: ",customerDB.get(in).getID(),"Total Orders: ",
                    customerDB.get(in).getOrderHistory().size());

            Scanner inp = new Scanner(System.in);
            boolean joke = false;
            while (!joke) {
                System.out.println("hit enter to start a new order");
                String ans = inp.nextLine();
                if (ans.equals("")) {
                    closed = false;
                    joke = true;
                } else {
                    System.out.println("You don't want to have candy? No way!");
                }

            }
        }//the end of for loop for entire main() method
    }
}

