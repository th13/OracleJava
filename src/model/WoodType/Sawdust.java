package model.WoodType;

import model.WoodItem;

/**
 * @author Trevor Helms
 */
public class Sawdust extends WoodItem {
    private static final String TYPE = "Sawdust";
    private static final double BASE_DELIVERY_TIME = 1.0;
    private static final double PRICE = 1.50;

    public Sawdust() {
        super(TYPE, BASE_DELIVERY_TIME, PRICE);
    }
}
