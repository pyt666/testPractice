/**
 * 
 */
package Builder;

/**
 * @author pyt
 *
 */
public abstract class ColdDrink implements Item {

	/* (non-Javadoc)
	 * @see Builder.Item#packing()
	 */
	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	/* (non-Javadoc)
	 * @see Builder.Item#price()
	 */
	@Override
	public abstract float price();

}
