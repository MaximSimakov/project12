/*
 * 
 */
package rgrproject.managers;

import rgrproject.types.StenaType;


/**
 * The Class StenaManager extends abstract class BaseManager for calculating the stena.
 */
public abstract class StenaManager extends BaseManager {
	
	/**
	 * Instantiates a new stena manager.
	 *
	 * @param state the state
	 */
	public StenaManager(CalculatorState state) {
		super(state);
	}

	/**
	 * Getter method the price by type.
	 *
	 * @param type the type
	 * @return the price by type
	 */
	abstract double getPriceByType(StenaType type);
	
	
}