/**
 * 
 */
package sample.pattern.name.factory;

/**
 * @author deshp
 *
 */
public class OSFactory {

	public static enum OSType {
		W, M
	}
	
	
	public static OS getFactory(OSType type) {
		
		switch(type) {
		case W:
			return new WindowsOS("Windows", "Pro", "10");
		case M:
			return new MacOS("Mac", "Retina", "13");
		default:
			System.out.println("No given type present in the subsystem");
		}
		
		return null;
	}
	
}
