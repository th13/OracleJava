package model.WoodType;

import model.WoodItem;

/**
 * @author Trevor Helms
 */
public class Cherry extends WoodItem {
    private static final String TYPE = "Cherry";
    private static final double BASE_DELIVERY_TIME = 2.5;
    private static final double PRICE = 5.95;

    public Cherry() {
        super(TYPE, BASE_DELIVERY_TIME, PRICE);
    }
}
