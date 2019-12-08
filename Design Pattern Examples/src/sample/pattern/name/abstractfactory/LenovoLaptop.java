/**
 * 
 */
package sample.pattern.name.abstractfactory;

/**
 * @author deshp
 *
 */
public class LenovoLaptop extends Laptop {
	
	/**
	 * 
	 */
	public LenovoLaptop() {
		// TODO Auto-generated constructor stub
		laptopName = "Lenovo";
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
