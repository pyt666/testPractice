/**
 * 
 */
package Builder;

/**
 * @author pyt
 *
 */
public class Pepsi extends ColdDrink {

	/* (non-Javadoc)
	 * @see Builder.Item#name()
	 */
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Pepsi";
	}

	/* (non-Javadoc)
	 * @see Builder.ColdDrink#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 35.0f;
	}

}
