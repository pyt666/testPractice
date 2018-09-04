/**
 * 
 */
package Builder;

/**
 * @author pyt
 *
 */
public class ChickenBurger extends Burger {

	/* (non-Javadoc)
	 * @see Builder.Item#name()
	 */
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Chicken Burger";
	}

	/* (non-Javadoc)
	 * @see Builder.Burger#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 50.5f;
	}

}
