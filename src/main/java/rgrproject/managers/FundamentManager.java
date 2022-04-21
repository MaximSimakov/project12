/*
 * 
 */
package rgrproject.managers;

import rgrproject.types.*;


/**
 * The abstract Class FundamentManager extends abstract class BaseManager for calculating the fundament.
 */
public abstract class FundamentManager extends BaseManager {
	
	/**
	 * Instantiates a new fundament manager.
	 *
	 * @param state the state
	 */
	public FundamentManager(CalculatorState state) {
		super(state);
	}
	
	/**
	 * Getter method the price by type.
	 *
	 * @param type the type
	 * @return the price by type
	 */
	abstract double getPriceByType(FundamentTypes type);
}