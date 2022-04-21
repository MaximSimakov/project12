/*
 * 
 */
package rgrproject.managers;

import rgrproject.types.*;


/**
 * The Class PeregorodkaManager extends abstract class BaseManager for calculating the peregorodka.
 */
public abstract class PeregorodkaManager extends BaseManager {
	
	/**
	 * Instantiates a new peregorodka manager.
	 *
	 * @param state the state
	 */
	public PeregorodkaManager(CalculatorState state) {
		super(state);
	}
	
	/**
	 * Getter method the price by type.
	 *
	 * @param type the type
	 * @return the price by type
	 */
	abstract double getPriceByType(PeregorodkaTypes type);
}