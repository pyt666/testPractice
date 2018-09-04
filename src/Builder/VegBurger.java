/**
 * 
 */
package Builder;

/**
 * @author pyt
 *
 */
public class VegBurger extends Burger {

	/* (non-Javadoc)
	 * @see Builder.Item#name()
	 */
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Veg Burger";
	}

	/* (non-Javadoc)
	 * @see Builder.Burger#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 25.0f;
	}

}
