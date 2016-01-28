package controller;

import model.WoodItem;
import model.WoodType.*;

/**
 * This class instantiates and returns new instances of a wood type (from package WoodType) based
 * on the name of the wood type.
 * Will throw an error on invalid wood type.
 *
 * @author Trevor Helms
 */
public class WoodTyper {

    // Private constructor to display instantiation
    private WoodTyper() {}

    public static WoodItem getWoodTypeInstanceOf(String type) throws ClassNotFoundException {
        type = type.replaceAll("\\s", "");

        switch(type) {
            case "Cherry":
                return new Cherry();
            case "CurlyMaple":
                return new CurlyMaple();
            case "GenuineMahogany":
                return new GenuineMahogany();
            case "Sawdust":
                return new Sawdust();
            case "Wenge":
                return new Wenge();
            case "WhiteOak":
                return new WhiteOak();
            default:
                throw new ClassNotFoundException("The WoodType you specified is invalid");
        }
    }
}
