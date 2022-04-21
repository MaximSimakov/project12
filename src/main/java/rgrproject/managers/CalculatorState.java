/*
 * 
 */
package rgrproject.managers;

import rgrproject.types.*;


/**
 * The abstract Class CalculatorState for create abstract getter and setter methods.
 */
public abstract class CalculatorState {
	
	
	
	
    /**
     * Setter-method for the height.
     *
     * @param height the new height
     */
    abstract void setHeight(double height);
    
    /**
     * Getter-method the height.
     *
     * @return the height
     */
    abstract double getHeight();
    
    /**
     * Setter-method for the weight.
     *
     * @param weight the new weight
     */
    abstract void setWeight(double weight);
    
    /**
     * Getter-method the weight.
     *
     * @return the weight
     */
    abstract double getWeight();
    
    /**
     * Setter-method for the atazhnost.
     *
     * @param Atazhnost the new atazhnost
     */
    abstract void setAtazhnost(int Atazhnost);
    
    /**
     * Getter-method the atazhnost.
     *
     * @return the atazhnost
     */
    abstract int getAtazhnost();
    
    /**
     * Setter-method for the tsokol.
     *
     * @param Tsokol the new tsokol
     */
    abstract void setTsokol(double Tsokol);
    
    /**
     * Getter-method for the tsokol.
     *
     * @return the tsokol
     */
    abstract double getTsokol();
    
    /**
     * Setter-method for the height atazh.
     *
     * @param HeightAtazh the new height atazh
     */
    abstract void setHeightAtazh(double HeightAtazh);
    
    /**
     * Getter-method for for the height atazh.
     *
     * @return the height atazh
     */
    abstract double getHeightAtazh();
    
    /**
     * Setter-method for the height kon.
     *
     * @param HeightKon the new height kon
     */
    abstract void setHeightKon(double HeightKon);
    
    /**
     * Getter-method for the height kon.
     *
     * @return the height kon
     */
    abstract double getHeightKon();
    
    
    
    
    
    /**
     * Setter-method for the stena type.
     *
     * @param type the new stena type
     */
    abstract void setStenaType(StenaType type);
    
    /**
     * Getter-method for the stena type.
     *
     * @return the stena type
     */
    abstract StenaType getStenaType();
    
    /**
     * Setter-method for the ottdelca types.
     *
     * @param type the new ottdelca types
     */
    abstract void setOttdelcaTypes(OttdelcaTypes type);
    
    /**
     * Getter-method for the ottdelca types.
     *
     * @return the ottdelca types
     */
    abstract OttdelcaTypes getOttdelcaTypes();
    
    /**
     * Setter-method for the fundament types.
     *
     * @param type the new fundament types
     */
    abstract void setFundamentTypes(FundamentTypes type);
    
    /**
     * Getter-method for the fundament types.
     *
     * @return the fundament types
     */
    abstract FundamentTypes getFundamentTypes();
    
    
    /**
     * Setter-method for the peregorodka types.
     *
     * @param type the new peregorodka types
     */
    abstract void setPeregorodkaTypes(PeregorodkaTypes type);
    
    /**
     * Getter-method for the peregorodka types.
     *
     * @return the peregorodka types
     */
    abstract PeregorodkaTypes getPeregorodkaTypes();
    
    
    /**
     * Setter-method for the krsha types.
     *
     * @param type the new krsha types
     */
    abstract void setKrshaTypes(KrshaTypes type);
    
    /**
     * Getter-method for the krsha types.
     *
     * @return the krsha types
     */
    abstract KrshaTypes getKrshaTypes();
        
    /**
     * Setter-method for the okna types.
     *
     * @param type the new okna types
     */
    abstract void setOknaTypes(OknaTypes type);
    
    /**
     * Getter-method for the okna types.
     *
     * @return the okna types
     */
    abstract OknaTypes getOknaTypes();
    
    
    
    
}
