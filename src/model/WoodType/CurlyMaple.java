package model.WoodType;

import model.WoodItem;

/**
 * @author Trevor Helms
 */
public class CurlyMaple extends WoodItem {
    private static final String TYPE = "Curly Maple";
    private static final double BASE_DELIVERY_TIME = 1.5;
    private static final double PRICE = 6.00;

    public CurlyMaple() {
        super(TYPE, BASE_DELIVERY_TIME, PRICE);
    }
}
