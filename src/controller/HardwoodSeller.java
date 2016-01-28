/**
 * 
 */
package controller;

import model.Customer;
import model.Order;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author Esteban
 * @author Trevor Helms
 *
 */
public class HardwoodSeller {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws ClassNotFoundException, IOException {
        Order customerOrder = readInputFile("/Users/trevor1/Projects/OracleJava/src/example.txt");
        System.out.println(customerOrder);
    }

    /**
     * Takes the input file and returns a new Order based off the details in the file.
     *
     * @param inputFilePath Path to input file with order details
     * @return A new Order created from the input file
     * @throws IOException If reading the input file fails
     */
	public static Order readInputFile(String inputFilePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(inputFilePath));

        Order theOrder = new Order();

        // First line of the input file contains the buyer name, address, and date of the order
        // Split the said line to start creating the Order
        String[] infoLineItems = lines.get(0).split(";");

        // Name is index 0, address is index 1
        theOrder.setCustomer(new Customer(infoLineItems[0], infoLineItems[1]));
        theOrder.setDate(infoLineItems[2]);     // Date is index 2

        // Next, we'll split the order items into an array
        String[] orderLineItems = lines.get(1).split(";");

        // Each order is formatted as:
        // Wood Type: Qty
        for (String orderItem : orderLineItems) {
            String[] orderItemDetails = orderItem.split(":");
            theOrder.addOrderItem(orderItemDetails[0], orderItemDetails[1]);
        }

        return theOrder;
    }

}
