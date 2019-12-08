/**
 * 
 */
package sample.pattern.name.flyweight;

/**
 * @author deshp
 *
 */
public class Triangle implements Shape {
	
	
	/**
	 * 
	 */
	public Triangle() {
		// TODO Auto-generated constructor stub
		System.out.println("Creating the triangle object");
		
		try {
			Thread.sleep(1000);
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
		System.out.println("T drawing");
	}

}
