/*
 * 
 */
package rgrproject.managers;

import rgrproject.types.FundamentTypes;
import rgrproject.types.KrshaTypes;
import rgrproject.types.StenaType;
import rgrproject.types.OknaTypes;
import rgrproject.types.OttdelcaTypes;
import rgrproject.types.PeregorodkaTypes;

/**
 * The Class CalculatorStateImpl extends abstract class CalculatorState for create a getter and setter-methods.
 */
public class CalculatorStateImpl extends CalculatorState {
	
	/** The field height. */
	private double height;
	
	/** The field weight. */
	private double weight;
	
	/** The field Atazhnost. */
	private int Atazhnost;
	
	/** The field Tsokol. */
	private double Tsokol;
	
	/** The field Height atazh. */
	private double HeightAtazh;
	
	/** The field Height kon. */
	private double HeightKon;
	
	/** The field type 1. */
	private StenaType type1;
	
	/** The field type 2. */
	private OttdelcaTypes type2;
	
	/** The field type 3. */
	private FundamentTypes type3;
	
	/** The field type 4. */
	private PeregorodkaTypes type4;
	
	/** The field type 5. */
	private KrshaTypes type5;
	
	/** The field type 6. */
	private OknaTypes type6;

	
	/**
	 * Setter method for the height.
	 *
	 * @param height the new height
	 */
	@Override
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Getter method for the height.
	 *
	 * @return the height
	 */
	@Override
	public double getHeight() {
		return height;
	}

	/**
	 * Setter method for the weight.
	 *
	 * @param weight the new weight
	 */
	@Override
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * Getter method for the weight.
	 *
	 * @return the weight
	 */
	@Override
	public double getWeight() {
		return weight;
	}

	/**
	 * Setter method for the atazhnost.
	 *
	 * @param Atazhnost the new atazhnost
	 */
	@Override
	public void setAtazhnost(int Atazhnost) {
		this.Atazhnost = Atazhnost;
	}

	/**
	 * Getter method for the atazhnost.
	 *
	 * @return the atazhnost
	 */
	@Override
	public int getAtazhnost() {
		return Atazhnost;
	}

	/**
	 * Setter method for the tsokol.
	 *
	 * @param Tsokol the new tsokol
	 */
	@Override
	public void setTsokol(double Tsokol) {
		this.Tsokol = Tsokol;
	}

	/**
	 * Getter method for the tsokol.
	 *
	 * @return the tsokol
	 */
	@Override
	public double getTsokol() {

		return Tsokol;
	}

	/**
	 * Setter method for the height atazh.
	 *
	 * @param HeightAtazh the new height atazh
	 */
	@Override
	public void setHeightAtazh(double HeightAtazh) {
		this.HeightAtazh = HeightAtazh;
	}

	/**
	 * Getter method for the height atazh.
	 *
	 * @return the height atazh
	 */
	@Override
	public double getHeightAtazh() {
		return HeightAtazh;
	}

	/**
	 * Setter method for the height kon.
	 *
	 * @param HeightKon the new height kon
	 */
	@Override
	public void setHeightKon(double HeightKon) {
		this.HeightKon = HeightKon;
	}

	/**
	 * Getter method for the height kon.
	 *
	 * @return the height kon
	 */
	@Override
	public double getHeightKon() {
		return HeightKon;
	}

	/**
	 * Setter method for the stena type.
	 *
	 * @param type the new stena type
	 */
	@Override
	public void setStenaType(StenaType type) {
		type1 = type;
	}

	/**
	 * Getter method for method for the stena type.
	 *
	 * @return the stena type
	 */
	@Override
	public StenaType getStenaType() {
		return type1;
	}

	/**
	 * Setter method for the ottdelca types.
	 *
	 * @param type the new ottdelca types
	 */
	@Override
	public void setOttdelcaTypes(OttdelcaTypes type) {
		type2 = type;
	}


	/**
	 * Getter method for the ottdelca types.
	 *
	 * @return the ottdelca types
	 */
	@Override
	public OttdelcaTypes getOttdelcaTypes() {
		return type2;
	}

	/**
	 * Setter method for the fundament types.
	 *
	 * @param type the new fundament types
	 */
	@Override
	public void setFundamentTypes(FundamentTypes type) {
		type3 = type;
	}

	/**
	 * Getter method for the fundament types.
	 *
	 * @return the fundament types
	 */
	@Override
	public FundamentTypes getFundamentTypes() {
		return type3;
	}

	/**
	 * Setter method for the peregorodka types.
	 *
	 * @param type the new peregorodka types
	 */
	@Override
	public void setPeregorodkaTypes(PeregorodkaTypes type) {
		type4 = type;
	}

	/**
	 * Getter method for the peregorodka types.
	 *
	 * @return the peregorodka types
	 */
	@Override
	public PeregorodkaTypes getPeregorodkaTypes() {
		return type4;
	}

	/**
	 * Setter method for the krsha types.
	 *
	 * @param type the new krsha types
	 */
	@Override
	public void setKrshaTypes(KrshaTypes type) {
		type5 = type;
	}

	/**
	 * Getter method for the krsha types.
	 *
	 * @return the krsha types
	 */
	@Override
	public KrshaTypes getKrshaTypes() {
		return type5;
	}

	/**
	 * Setter method for the okna types.
	 *
	 * @param type the new okna types
	 */
	@Override
	public void setOknaTypes(OknaTypes type) {
		type6 = type;
	}

	/**
	 * Getter method for the okna types.
	 *
	 * @return the okna types
	 */
	@Override
	public OknaTypes getOknaTypes() {
		return type6;
	}

}