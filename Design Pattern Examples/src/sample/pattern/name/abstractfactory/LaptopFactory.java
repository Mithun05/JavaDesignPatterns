/**
 * 
 */
package sample.pattern.name.abstractfactory;

/**
 * @author deshp
 *
 */
public class LaptopFactory {
	
	public static Laptop getLaptop(LaptopAbstractFactory factory) {
		return factory.getLaptop();
	}

}
