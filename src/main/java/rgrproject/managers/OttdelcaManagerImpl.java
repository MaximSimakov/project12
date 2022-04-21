/*
 * 
 */
package rgrproject.managers;

import rgrproject.types.OttdelcaTypes;


/**
 * The Class OttdelcaManagerImpl for make calculations for ottdelca.
 */
public class OttdelcaManagerImpl extends OttdelcaManager {
	
	/** The field layer thickness. */
	private final double layer_thickness=0.5;
	
	/** The field pack weight. */
	private final int pack_weight=30;
	
	/** The field  summ. */
	private double summ;
	
	/** The field expenditure on metr. */
	private final int expenditure_on_metr=9;	
	
	/**
	 * Instantiates a new ottdelca manager impl.
	 *
	 * @param state the state
	 */
	public OttdelcaManagerImpl(CalculatorState state) {
		super(state);
	}

	/**
	 * Getter method the price by type.
	 *
	 * @param type the type
	 * @return the price by type
	 */
	@Override
	double getPriceByType(OttdelcaTypes type) {
		int price=-1;
		switch (type){
		case SHTUCATURKA -> price = 880; 
		case OBLIC_KIRP -> price= 1000;
		case DIKI_KAMEN -> price= 1100;
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
		OttdelcaTypes type=state.getOttdelcaTypes();
		double price =getPriceByType(type);
		summ=(state.getHeight()*state.getWeight())*(layer_thickness*expenditure_on_metr)*price;
		return summ;
	}
}