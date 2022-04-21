/*
 * 
 */
package rgrproject.managers;

// TODO: Auto-generated Javadoc
/**
 * The Class CalculatorManagerImpl extends  CalculatorManager for return all calculations .
 */
public class CalculatorManagerImpl extends CalculatorManager {
	
	/** The fields fn, kr, ns, ok, ot, per. */
	private double fn,kr,ns,ok,ot,per;
	
	/**
	 * Instantiates a new calculator manager impl.
	 *
	 * @param state the state
	 */
	public CalculatorManagerImpl(CalculatorStateImpl state) {
		 super(state);
		 fn =new FundamentManagerImpl(state).getResultPrice();
		 kr = new KrshaManagerImpl(state).getResultPrice();
		 ns = new StenaManagerImpl(state).getResultPrice();
		 ok = new OknaManagerImpl(state).getResultPrice();
		 ot = new OttdelcaManagerImpl(state).getResultPrice();
		 per = new PeregorodkaManagerImpl(state).getResultPrice();
	 }
	
	/**
	 * Getter method for the fn.
	 *
	 * @return the fn
	 */
	public double getFn() {
		return fn;
	}

	/**
	 * Getter method for the kr.
	 *
	 * @return the kr
	 */
	public double getKr() {
		return kr;
	}
	
	/**
	 * Getter method for the ns.
	 *
	 * @return the ns
	 */
	public double getNs() {
		return ns;
	}
	
	/**
	 * Getter method for the ok.
	 *
	 * @return the ok
	 */
	public double getOk() {
		return ok;
	}
	
	/**
	 * Getter method for the ot.
	 *
	 * @return the ot
	 */
	public double getOt() {
		return ot;
	}
	
	/**
	 * Getter method for the per.
	 *
	 * @return the per
	 */
	public double getPer() {
		return per;
	}

	/**
	 * Getter method for the result price.
	 *
	 * @return the result price
	 */
	public double getResultPrice() {
		return Math.round(kr + ns + ok + ot + per+fn);
	}
}