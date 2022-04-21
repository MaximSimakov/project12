/*
 * 
 */
package rgrproject.managers;


/**
 * The abstract Class BaseManager.
 */
public abstract class BaseManager {
	
	/** The state. */
	protected CalculatorState state;
	
	/**
	 * Instantiates a new base manager.
	 *
	 * @param state the state
	 */
	public BaseManager(CalculatorState state) {
		this.state = state;
	}

	/**
	 * Getter method for getting the price from 
	 *
	 * @return the result price
	 */
	abstract double getResultPrice();
}