/**
 * 
 */
package controller;

import model.WoodItem;

import java.util.ArrayList;

/**
 * @author Esteban
 * @author Trevor Helms
 *
 */
public class HardwoodSeller {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws ClassNotFoundException {
        // Test WoodTyper
        WoodItem t = WoodTyper.getWoodTypeInstance("Sawdust");

        System.out.println(t);
	}
	
	public void readInputFile(String inputFilePath){
		// TODO Read from input
	}
	
	public Double deliveryTime(){
		Double deliveryETA = 0.0;
		return deliveryETA;
	}
}
