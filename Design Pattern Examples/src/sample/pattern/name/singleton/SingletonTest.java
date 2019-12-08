/**
 * 
 */
package sample.pattern.name.singleton;

/**
 * @author deshp
 *
 */
public class SingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Load time singleton instance 
		ClassLoadSingleton obj1 = ClassLoadSingleton.getInstance();
		ClassLoadSingleton obj2 = ClassLoadSingleton.getInstance();
		
		assert obj1.hashCode() == obj2.hashCode();
		
		System.out.println("Eager Singleton Initialization Worked!!");
		
		// Lazy time singleton instance 
		LazyLoadSingleton obj3 = LazyLoadSingleton.getInstance();
		LazyLoadSingleton obj4 = LazyLoadSingleton.getInstance();
				
		assert obj3.hashCode() == obj4.hashCode();
				
		System.out.println("Lazy Singleton Initialization Worked!!");
		
	}

}
