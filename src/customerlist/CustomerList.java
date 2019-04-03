/*
   Matt Ludwig
   3 April 2019
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
    public static void main(String[] args) throws IOException{
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
                int custNum = i + 1;
                name = JOptionPane.showInputDialog("Enter the name of customer " + custNum +":");
                if (name.equals("")) {
                    break;
                }
                province = JOptionPane.showInputDialog("Enter customer "+ custNum + "'s "+ "home province:");
                if (province.equals("")) {
                    break;
                }
                city = JOptionPane.showInputDialog("Enter customer "+ custNum + "'s home city:");
                if (city.equals("")) {
                    break;
                }
                address = JOptionPane.showInputDialog("Enter customer "+ custNum + "'s " + "address:");
                if (address.equals("")) {
                    break;
                }
                postalCode = JOptionPane.showInputDialog("Enter customer " + custNum + "'s " + "postal code:");
                if (postalCode.equals("")) {
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
       catch (NullPointerException exc2) {
           System.out.println(exc2 + " ");
       }
       catch (FileNotFoundException x) {
           System.out.println(x + " Please enter an accessable file name");
       }
    }
    
}
