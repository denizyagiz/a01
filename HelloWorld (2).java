
// Class: CS 5000
// Term: Summer 2020
// Name: Deniz Yagiz
// Instructor: Dr. Haddad
// Assignment: 1
// IDE: Jgrasp
import java.util.Scanner; //import scanner class
public class HelloWorld (2)
{
 public static void main(String args[]) //program main method
 {
 Scanner s = new Scanner(System.in);
 System.out.print("Please enter your name: "); //prompt user for input
 String name = s.nextLine(); //read user input
 System.out.println("Hello " + name + "!"); //print out your message
 }
} 