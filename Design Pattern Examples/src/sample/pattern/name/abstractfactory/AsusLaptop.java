/**
 * 
 */
package sample.pattern.name.abstractfactory;

/**
 * @author deshp
 *
 */
public class AsusLaptop extends Laptop {
	/**
	 * 
	 */
	public AsusLaptop() {
		// TODO Auto-generated constructor stub
		laptopName = "Asus";
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
