/*
 * 
 */
package rgrproject.managers;

import rgrproject.types.FundamentTypes;
import rgrproject.types.KrshaTypes;
import rgrproject.types.OknaTypes;


/**
 * The Class FundamentManagerImpl for make calculations for fundamnet.
 */
public class FundamentManagerImpl extends FundamentManager {

/** The field summ. */
private double summ;

/** The field dig. */
private int dig=180;

/** The field fittings. */
private int fittings=170;

/** The field opalubka. */
private int opalubka=200;

/** The field length. */
private double length;

/** The field width. */
private double width;

/** The field tsokol height. */
private double tsokol_height;

/** The field depth. */
private double depth=0.5;
	
	/**
	 * Instantiates a new fundament manager impl.
	 *
	 * @param state the state
	 */
	public FundamentManagerImpl(CalculatorState state) {
		super(state);
	}

	/**
	 * Getter method for the price by type.
	 *
	 * @param type the type
	 * @return the price by type
	 */
	@Override
	double getPriceByType(FundamentTypes type) {
		int price=-1;
		switch (type){
		case BYRONABIV -> price = 5000; 
		case LENTOCHN -> price= 6000;
		case PLITN -> price= 5700;
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
		length=state.getHeight();
		width=state.getWeight();
		tsokol_height=state.getHeightAtazh();
		FundamentTypes type=state.getFundamentTypes();
		double price =getPriceByType(type);
		summ=(width*length*depth)*dig+(width*length*depth)*fittings+2*(length+width)*opalubka+(length*width*depth)*price;
		return summ;
	}
}