package model;

import java.util.HashMap;
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


}
