/**
 * 
 */
package sample.pattern.name.decorator;

/**
 * @author deshp
 *
 */
public class ColorPen extends PenDecorator {

	/**
	 * @param pen
	 */
	public ColorPen(Pen pen) {
		super(pen);
		System.out.println("Color Pen");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String type() {
		// TODO Auto-generated method stub
		
		return super.type() + "Color";
	}

}
