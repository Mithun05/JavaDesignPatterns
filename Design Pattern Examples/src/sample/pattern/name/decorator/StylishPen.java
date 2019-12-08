/**
 * 
 */
package sample.pattern.name.decorator;

/**
 * @author deshp
 *
 */
public class StylishPen extends PenDecorator {

	/**
	 * @param pen
	 */
	public StylishPen(Pen pen) {
		super(pen);
		// TODO Auto-generated constructor stub
		System.out.println("Stylish Pen");
	}
	
	
	@Override
	public String type() {
		// TODO Auto-generated method stub
		
		return super.type() + "Stylish";
	}

}
