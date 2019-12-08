/**
 * 
 */
package sample.pattern.name.abstractfactory;

/**
 * @author deshp
 *
 */
public class TestFactoryMain {
	
	public static void main(String[] args) {
		LaptopFactory.getLaptop(new LenovoLaptopFactory()).getLaptopName();
	}

}
