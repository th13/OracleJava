package model;

import controller.WoodTyper;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * @author Trevor Helms
 */
public class Order {
    private Customer customer;
    private String date;
    private HashMap<String, String> orderItems;

    public Order() {
        customer = null;
        date = "";
        orderItems = new HashMap<>();
    }

    public Order(Customer customer, String date, HashMap<String, String> orderItems) {
        this.customer = customer;
        this.date = date;
        this.orderItems = orderItems;
    }

    public Double getETA() {
        Double eta = 0.0;
        Double curr = 0.0;

        Iterator it = orderItems.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry) it.next();
            try {
                WoodItem item = WoodTyper.getWoodTypeInstanceOf(pair.getKey().toString());
                curr = item.getRealizedDeliveryTime(Integer.parseInt(pair.getValue().toString()));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

            // Get the max delivery time
            if (curr > eta) {
                eta = curr;
            }
        }

        return eta;
    }

    public String getTotalPriceFormatted() {
        Double total = 0.0;

        Iterator it = orderItems.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry) it.next();
            WoodItem item = null;
            try {
                item = WoodTyper.getWoodTypeInstanceOf(pair.getKey().toString());
                total += item.getPrice();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String moneyString = formatter.format(total);
        return moneyString;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public HashMap<String, String> getOrderItems() {
        return orderItems;
    }

    public void addOrderItem(String woodType, String qty) {
        this.orderItems.put(woodType, qty);
    }

    @Override
    public String toString() {
        String theString = "";
        theString += "Order for: " + customer.getName() + "\n";
        theString += "Delivery Address: " + customer.getAddress() + "\n";
        theString += "Date Placed: " + date + "\n\n";
        theString += "List of Wood Ordered (price/BF):" + "\n";

        Iterator it = orderItems.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry) it.next();
            theString += "  - " + pair.getKey() + ": " + pair.getValue() + " @ ";
            try {
                theString += WoodTyper.getWoodTypeInstanceOf(pair.getKey().toString()).getPriceFormatted() + "\n";
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        theString += "\nEstimated Delivery Time: " + getETA() + " hours\n";
        theString += "Total Price: " + getTotalPriceFormatted() + "\n";

        return theString;
    }
}
