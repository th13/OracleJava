package model.WoodType;

import model.WoodItem;

/**
 * @author Trevor Helms
 */
public class Wenge extends WoodItem {
    private static final String TYPE = "Wenge";
    private static final double BASE_DELIVERY_TIME = 5.0;
    private static final double PRICE = 22.35;

    public Wenge() {
        super(TYPE, BASE_DELIVERY_TIME, PRICE);
    }
}
