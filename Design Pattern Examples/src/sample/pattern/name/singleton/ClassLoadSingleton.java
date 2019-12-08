/**
 * 
 */
package sample.pattern.name.singleton;

/**
 * @author deshp
 *
 */
public class ClassLoadSingleton {
	
	private ClassLoadSingleton() {
		
	}
	
	private static ClassLoadSingleton instance = new ClassLoadSingleton();
	
	public static ClassLoadSingleton getInstance() {
		return instance;
	}
			
}
