/*
 * 
 */
package rgrproject.managers;

import rgrproject.types.*;


/**
 * The Class OknaManager extends abstract class BaseManager for calculating the okna.
 */
public abstract class OknaManager extends BaseManager {
	
	/**
	 * Instantiates a new okna manager.
	 *
	 * @param state the state
	 */
	public OknaManager(CalculatorState state) {
		super(state);
	}
	
	/**
	 * Getter method for the price by type.
	 *
	 * @param type the type
	 * @return the price by type
	 */
	abstract double getPriceByType(OknaTypes type);
}