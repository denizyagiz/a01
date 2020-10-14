// Class: CS 5000
// Term: Summer 2020
// Name: Deniz Yagiz
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: Jgrasp
//Scanner is stored in java.util package
import java.util.Scanner;

public class Distance {
//Main method
    public static void main (String[] args)
    { 
       double x1;
       double x2;
       double y1;
       double y2;
       double distance;
       Scanner scan = new Scanner(System.in);
 //Prompt user
       System.out.println("enter first point coordinates:");
       x1=scan.nextDouble();
       y1=scan.nextDouble();
       System.out.println("enter the coordinates for point 2");
       x2=scan.nextDouble();
       y2=scan.nextDouble();
  //Compute distance
       distance= Math.sqrt(Math.pow( (x2-x1), 2) +Math.pow((y2-y1), 2));
  //Print results
       System.out.println("First point coordinates: "+" "+ "("+ x1+ ","+ " "+ y1+")" );
       System.out.println("Second point coordinates: "+ "("+ x2+ ","+ " "+ y2+")" );
       System.out.println("The distance is:\t\t\t "+" "+ distance);
       
       
       
    }
}
