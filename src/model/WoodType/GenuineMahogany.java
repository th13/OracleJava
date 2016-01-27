package model.WoodType;

import model.WoodItem;

/**
 * @author Trevor Helms
 */
public class GenuineMahogany extends WoodItem {
    private static final String TYPE = "Genuine Mahogany";
    private static final double BASE_DELIVERY_TIME = 3.0;
    private static final double PRICE = 9.60;

    public GenuineMahogany() {
        super(TYPE, BASE_DELIVERY_TIME, PRICE);
    }
}
