/*
 * 
 */
package rgrproject.managers;

import rgrproject.types.*;


/**
 * The Class KrshaManager extends abstract class BaseManager for calculating the krsha.
 */
public abstract class KrshaManager extends BaseManager{
	
	/**
	 * Instantiates a new krsha manager.
	 *
	 * @param state the state
	 */
	public KrshaManager(CalculatorState state) {
		super(state);
		
	}
	
	/**
	 * Getter method the price by type.
	 *
	 * @param type the type
	 * @return the price by type
	 */
	abstract double getPriceByType(KrshaTypes type);
}