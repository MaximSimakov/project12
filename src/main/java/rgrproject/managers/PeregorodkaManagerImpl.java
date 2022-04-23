/*
 * 
 */
package rgrproject.managers;

import rgrproject.types.PeregorodkaTypes;


/**
 * The Class PeregorodkaManagerImpl for make calculations for the peregorodka.
 */
public class PeregorodkaManagerImpl extends PeregorodkaManager {
	
	/** The field summ. */
	private double summ;
	
	/**
	 * Instantiates a new peregorodka manager impl.
	 *
	 * @param state the state
	 */
	public PeregorodkaManagerImpl(CalculatorState state) {
		super(state);
	}

	/**
	 * Getter method the price by type.
	 *
	 * @param type the type
	 * @return the price by type
	 */
	@Override
	double getPriceByType(PeregorodkaTypes type) {
		int price=-1;
		switch (type){
		case DA : price = 10000; 
		break;
		case NET : price=0;
		break;
		}
		return price;
	}

	/**
	 * Getter method the result price.
	 *
	 * @return the result price
	 */
	@Override
	double getResultPrice() {
		PeregorodkaTypes type=state.getPeregorodkaTypes();
		double price =getPriceByType(type);
		summ=state.getHeight()*state.getWeight()/20*price;
		return summ;
	}
}