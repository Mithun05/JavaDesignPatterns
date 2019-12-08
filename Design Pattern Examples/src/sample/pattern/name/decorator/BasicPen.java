/**
 * 
 */
package sample.pattern.name.decorator;

/**
 * @author deshp
 *
 */
public class BasicPen implements Pen {
	
	/**
	 * 
	 */
	public BasicPen() {
		// TODO Auto-generated constructor stub
		System.out.println("Basic");
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "Basic + ";
	}

}
