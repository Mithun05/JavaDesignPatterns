/**
 * 
 */
package sample.pattern.name.decorator;

/**
 * @author deshp
 *
 */
public class PenDecorationMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pen regPen = new RegularPen(new BasicPen());
		System.out.println(regPen.type());
		
		Pen styPen = new StylishPen(new BasicPen());
		System.out.println(styPen.type());
		
		Pen regStyPen = new RegularPen(new StylishPen(new BasicPen()));
		System.out.println(regStyPen.type());
	}

}
