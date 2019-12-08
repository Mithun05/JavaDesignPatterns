/**
 * 
 */
package sample.pattern.name.decorator;

/**
 * @author deshp
 *
 */
public class PenDecorator implements Pen {
	
	//composition
	protected Pen pen;
	
	
	public PenDecorator(Pen pen) {
		// TODO Auto-generated constructor stub
		this.pen = pen;
	}
	

	//delegates
	/* (non-Javadoc)
	 * @see sample.pattern.name.decorator.Pen#type()
	 */
	@Override
	public String type() {
		// TODO Auto-generated method stub
		return this.pen.type();
	}

}
