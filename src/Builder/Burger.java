/**
 * 
 */
package Builder;

/**
 * @author pyt
 *
 */
public abstract class Burger implements Item {

	/* (non-Javadoc)
	 * @see Builder.Item#packing()
	 */
	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	/* (non-Javadoc)
	 * @see Builder.Item#price()
	 */
	@Override
	public abstract float price();

}
