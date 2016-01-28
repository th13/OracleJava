/**
 * Class defining the elements of a wood type
 */
package model;

import java.text.NumberFormat;

/**
 * @author Trevor Helms
 *
 */
public class WoodItem {

	String type;
	Double baseDeliveryTime;
	Double price;
	Double realizedDeliveryTime;
	
	/**
	 * Default constructor 
	 */
	public WoodItem() {
		this.type = "Empty";
		this.baseDeliveryTime = 0.0;
		this.price = 0.0;
		this.realizedDeliveryTime = 0.0;
	}
	
	/**
	 * Constructor of a WoodItem element with parameters
	 * @param type Name of the wood type
	 * @param baseDeliveryTime base delivery time
	 * @param price price per Bare Foot
	 */
	public WoodItem(String type, Double baseDeliveryTime, Double price) {
		this.type = type;
		this.baseDeliveryTime = baseDeliveryTime;
		this.price = price;
		this.realizedDeliveryTime = baseDeliveryTime;
	}

	/**
	 * Returns the realized (actual) delivery time after mulitplying by the modifier
	 *
	 * @param qty BF of the wood being ordered
	 * @return Realized delivery time
	 */
	public Double getRealizedDeliveryTime(int qty) throws Exception {
		double modifier = 0;

		if (qty <= 0) {
			throw new Exception("Length of wood cannot be 0");
		}
		else if (qty > 0 && qty <= 100) {
			modifier = 1;
		}
		else if (qty > 100 && qty <= 200) {
			modifier = 2;
		}
		else if (qty > 200 && qty <= 300) {
			modifier = 3;
		}
		else if (qty > 300 && qty <= 400) {
			modifier = 4;
		}
		else if (qty > 400 && qty <= 500) {
			modifier = 5;
		}
		else if (qty > 500 && qty <= 1000) {
			modifier = 5.5;
		}
		else {
			throw new Exception("Cannot order more than 1000 BF of any one type of wood.");
		}

		return modifier * baseDeliveryTime;
	}

	/**
	 * Get the type of Wood
	 * 
	 * @return Name of the WoodItem
	 */
	public String getType() {
		return type;
	}

	/**
	 * Get the base delivery time
	 * 
	 * @return the baseDeliverytime
	 */
	public Double getBaseDeliveryTime() {
		return baseDeliveryTime;
	}

	/**
	 * 
	 * Get the price per Bare Foot
	 * 
	 * @return the price for 1 Bare Foot of this WoodItem
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * Return the price for 1 Bare Foot in a currency formatted way
	 * @return Currency formatted price
     */
	public String getPriceFormatted() {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		String moneyString = formatter.format(price);
		return moneyString;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * You may implement this method to fit your needs
	 */
	@Override
	public String toString() {	
		return type;
	}
	
}
