/*
 * 
 */
package rgrproject.managers;


import rgrproject.types.StenaType;

/**
 * The Class StenaManagerImpl for make calculations for the stena.
 */
public class StenaManagerImpl extends StenaManager {
	
	/** The field summ. */
	private double summ;
	
	/** The field thickness wall. */
	private final double thickness_wall=0.35;
	
	/**
	 * Instantiates a new stena manager impl.
	 *
	 * @param state the state
	 */
	public StenaManagerImpl(CalculatorState state) {
		super(state);
	}

	/**
	 * Getter method for the price of Stena by type.
	 *
	 * @param type the type
	 * @return the price by type
	 */
	@Override
	double getPriceByType(StenaType type) {
		int price=-1;
		switch (type){
		case KIRPICH_1 -> price = 4000; 
		case KIRPICH_1_5 -> price= 4500;
		case KIRPICH_2 -> price= 5600;
		}
		return price;
	}

	/**
	 * Getter method for the result price.
	 *
	 * @return the result price
	 */
	@Override
	double getResultPrice() {
		summ=(2*(state.getHeight()+state.getWeight())*thickness_wall)*getPriceByType(state.getStenaType());
		return summ;
	}
}