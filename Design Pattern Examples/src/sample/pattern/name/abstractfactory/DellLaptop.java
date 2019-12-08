/**
 * 
 */
package sample.pattern.name.abstractfactory;

/**
 * @author deshp
 *
 */
public class DellLaptop extends Laptop {
	
	/**
	 * 
	 */
	public DellLaptop() {
		// TODO Auto-generated constructor stub
		laptopName = "Dell";
	}

	/* (non-Javadoc)
	 * @see sample.pattern.name.abstractfactory.Laptop#getLaptopName()
	 */
	@Override
	public void getLaptopName() {
		// TODO Auto-generated method stub
		System.out.println(laptopName);
	}

}
