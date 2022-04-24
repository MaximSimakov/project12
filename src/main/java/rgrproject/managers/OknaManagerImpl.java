/*
 * 
 */
package rgrproject.managers;

import rgrproject.types.OknaTypes;


/**
 * The Class OknaManagerImpl for make calculations for okna.
 */
public class OknaManagerImpl extends OknaManager {
	
	/** The field window quanity. */
	private final int window_quanity=4;
	
	/** The field door quanity. */
	private final int door_quanity=2;
	
	/** The field summ. */
	private double summ;
	
	/**
	 * Instantiates a new okna manager impl.
	 *
	 * @param state the state
	 */
	public OknaManagerImpl(CalculatorState state) {
		super(state);
	}
	
	/**
	 * Getter method for the price by type.
	 *
	 * @param type the type
	 * @return the price by type
	 */
	@Override
	double getPriceByType(OknaTypes type) {
		int price=-1;
		switch (type){
		case DA : price = 16000; 
		break;
		case NET : price=0;
		break;
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
		OknaTypes type=state.getOknaTypes();
		double price =getPriceByType(type);
		summ=(window_quanity+door_quanity)*price*state.getAtazhnost();
		return summ;
	}
}