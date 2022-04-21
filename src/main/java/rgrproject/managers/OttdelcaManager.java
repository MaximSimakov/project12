/*
 * 
 */
package rgrproject.managers;

import rgrproject.types.*;

/**
 * The Class OttdelcaManager extends abstract class BaseManager for calculating the ottdelca.
 */
public abstract class OttdelcaManager extends BaseManager {

	/**
	 * Instantiates a new ottdelca manager.
	 *
	 * @param state the state
	 */
	public OttdelcaManager(CalculatorState state) {
		super(state);
	}
	
	/**
	 * Getter method for the price by type.
	 *
	 * @param type the type
	 * @return the price by type
	 */
	abstract double getPriceByType(OttdelcaTypes type);
}