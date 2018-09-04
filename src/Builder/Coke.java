/**
 * 
 */
package Builder;

/**
 * @author pyt
 *
 */
public class Coke extends ColdDrink {

	/* (non-Javadoc)
	 * @see Builder.Item#name()
	 */
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Coke";
	}

	/* (non-Javadoc)
	 * @see Builder.ColdDrink#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 30.0f;
	}

}
