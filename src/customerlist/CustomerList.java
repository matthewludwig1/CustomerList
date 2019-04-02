/*
   Matt Ludwig
   2 April 2019
   This program writes customer data to an external text file
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
       String line = "";
           while((line = readFile.readLine()) != null){ //EOF
           System.out.println(line);
        }
       
       readFile.close();
       try {
            numCustomers = Integer.parseInt(JOptionPane.showInputDialog("How Many Customers do"
                + " you want to enter?"));
                PrintWriter fileOut = new PrintWriter(new FileWriter( 
                "customers.txt", true));
       
            for (int i = 0; i < numCustomers; i++) { //EOF
                int custNum = i +1;
                name = JOptionPane.showInputDialog("Enter the name of customer " + custNum +":");
                province = JOptionPane.showInputDialog("Enter customer "+ custNum + "'s "+ "home province:");
                city = JOptionPane.showInputDialog("Enter the customer's city");
                address = JOptionPane.showInputDialog("Enter the customer's address:");
                postalCode = JOptionPane.showInputDialog("Enter the customer's postal code:");
              
              if (name == null || province == null || city == null || address == null || postalCode == null) {
                  break;
              }
           
                fileOut.println();
                fileOut.println();
                fileOut.append("Name: "+ name);
                fileOut.println();
                fileOut.append("Province: "+ province);
                fileOut.println();
                fileOut.append("City: "+ city);
                fileOut.println();
                fileOut.append("Address: "+ address);
                fileOut.println();
                fileOut.append("Postal Code: "+ postalCode);
          
            }
            fileOut.close();
       }
       catch (NumberFormatException exc) { 
           System.out.println(exc); 
       } 
    }
    
}
