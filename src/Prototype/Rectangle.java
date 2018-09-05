/**
 * 
 */
package Prototype;

/**
 * @author pyt
 *
 */
public class Rectangle extends Shape {
	public Rectangle() {
		type = "Rectangle";
	}

	/* (non-Javadoc)
	 * @see Prototype.Shape#draw()
	 */
	@Override
	void draw() {
		System.out.println("Inside Rectangle::draw() method.");
		
	}
}
