/**
 * 
 */
package Prototype;

/**
 * @author pyt
 *
 */
public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}

	/* (non-Javadoc)
	 * @see Prototype.Shape#draw()
	 */
	@Override
	void draw() {
		System.out.println("Inside Circle::draw() method.");
		
	}

}
