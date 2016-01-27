package model.WoodType;

import model.WoodItem;

/**
 * @author Trevor Helms
 */
public class WhiteOak extends WoodItem {
    private static final String TYPE = "White Oak";
    private static final double BASE_DELIVERY_TIME = 2.3;
    private static final double PRICE = 6.70;

    public WhiteOak() {
        super(TYPE, BASE_DELIVERY_TIME, PRICE);
    }
}
