/**
 * 
 */
package sample.pattern.name.decorator;

/**
 * @author deshp
 *
 */
public class RegularPen extends PenDecorator {

	/**
	 * @param pen
	 */
	public RegularPen(Pen pen) {
		super(pen);
		// TODO Auto-generated constructor stub
		System.out.println("Regular Pen");
	}
	
	@Override
	public String type() {
		// TODO Auto-generated method stub
		
		return super.type() + "Regular";
	}
	

}
