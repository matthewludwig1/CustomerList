/*
   Matt Ludwig
   2 April 2019
 */

package customerlist;

/**
 *
 * @author malud0519
 */
import java.io.*;
import javax.swing.*;

public class CustomerList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
       String name, address, province, city, postalCode;
       int numCustomers;
       
       BufferedReader readFile = new BufferedReader(new FileReader("customers.txt"));
       System.out.println(readFile.readLine());
       readFile.close();
       numCustomers = Integer.parseInt(JOptionPane.showInputDialog("How Many Customers do"
               + " you want to enter?"));
       PrintWriter fileOut = new PrintWriter(new FileWriter( 
        "customers.txt", true));
       
       for (int i = 0; i < numCustomers; i++) {
            name = JOptionPane.showInputDialog("Enter the name of the customer:");
            province = JOptionPane.showInputDialog("Enter the customer's home province:");
            city = JOptionPane.showInputDialog("Enter the customer's city");
            address = JOptionPane.showInputDialog("Enter the customer's address:");
            postalCode = JOptionPane.showInputDialog("Enter the customer's postal code:");
            
            fileOut.println();
            fileOut.println("Name: "+ name);
            fileOut.println();
            fileOut.println("Province: "+ province);
            fileOut.println();
            fileOut.println("City: "+ city);
            fileOut.println();
       
       }
    }
    
}
