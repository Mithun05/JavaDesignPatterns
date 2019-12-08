/**
 * 
 */
package sample.pattern.name.flyweight;

/**
 * @author deshp
 *
 */
public class Rectangle implements Shape {
	
	/**
	 * 
	 */
	public Rectangle() {
		// TODO Auto-generated constructor stub
		System.out.println("Create the rectangle object");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

	/* (non-Javadoc)
	 * @see sample.pattern.name.flyweight.Shape#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("R drawing");
	}

}
