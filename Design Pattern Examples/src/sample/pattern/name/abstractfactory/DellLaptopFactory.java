/**
 * 
 */
package sample.pattern.name.abstractfactory;

/**
 * @author deshp
 *
 */
public class DellLaptopFactory implements LaptopAbstractFactory {

	/* (non-Javadoc)
	 * @see sample.pattern.name.abstractfactory.LaptopFactory#getLaptop()
	 */
	@Override
	public Laptop getLaptop() {
		// TODO Auto-generated method stub
		return new DellLaptop();
	}

}
