/*
 * 
 */
package rgrproject.managers;

import rgrproject.types.KrshaTypes;


/**
 * The Class KrshaManagerImpl for make calculations for krsha.
 */
public class KrshaManagerImpl extends KrshaManager {
	
	/** The field summ. */
	private double summ;
	
	/**
	 * Instantiates a new krsha manager impl.
	 *
	 * @param state the state
	 */
	public KrshaManagerImpl(CalculatorState state) {
		super(state);
		
	}
	
	/**
	 * Getter method the price by type.
	 *
	 * @param type the type
	 * @return the price by type
	 */
	@Override
	double getPriceByType(KrshaTypes type) {
		int price=-1;
		switch (type){
		case METALLO : price = 4000;
		break;
		case MYAGKHAYA : price=5000;
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
		KrshaTypes type=state.getKrshaTypes();
		double price =getPriceByType(type);
		summ=state.getHeightKon()*price;
	return summ;
	}
}