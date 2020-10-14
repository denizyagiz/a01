// Class: CS 5000
// Term: Summer 2020
// Name: Deniz Yagiz
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: Jgrasp
import java.util.Scanner;

public class DrivingCost {
//Main method
    public static void main (String[] args)
    { 
    double distance ;
    double efficiency ;
    double price ;
    double cost ;
    Scanner scan = new Scanner(System.in);
//Prompt user
       System.out.println("The distance (miles)");
       distance=scan.nextDouble();
       System.out.println("Fuel efficiency (mpg)");
       efficiency=scan.nextDouble();
       System.out.println("Price per gallon (dollars)");
       price=scan.nextDouble();
//Compute cost
       cost=distance*(1/efficiency)*price;
//Print results
       System.out.println("The distance (miles):\t\t "+ distance);
       System.out.println("Fuel efficiency (mpg):\t\t "+ efficiency);
       System.out.println("Price per gallon (dollars): "+ "$"+ price);
       System.out.println("The trip cost (dollars):\t "+ "$"+ cost);
       
       
    
        }
}
