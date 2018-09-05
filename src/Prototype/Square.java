/**
 * 
 */
package Prototype;

/**
 * @author pyt
 *
 */
public class Square extends Shape {

	public Square() {
		type = "Square";
	}

	/* (non-Javadoc)
	 * @see Prototype.Shape#draw()
	 */
	@Override
	void draw() {
		System.out.println("Inside Square::draw() method.");
		
	}

}
