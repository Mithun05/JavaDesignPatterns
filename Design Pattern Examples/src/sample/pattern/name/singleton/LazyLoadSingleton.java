/**
 * 
 */
package sample.pattern.name.singleton;

/**
 * @author deshp
 *
 */
public class LazyLoadSingleton {
	
	private LazyLoadSingleton() {
		
	}
	
	private static LazyLoadSingleton instance;
	
	public static LazyLoadSingleton getInstance() {
		
		if(instance == null)
			instance = new LazyLoadSingleton();
		
		return instance;
	}

}
