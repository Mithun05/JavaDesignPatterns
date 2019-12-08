/**
 * 
 */
package sample.pattern.name.factory;

import sample.pattern.name.factory.OSFactory.OSType;

/**
 * @author deshp
 *
 */
public class MainFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OSFactory.getFactory(OSType.W).getOSInfo();
		OSFactory.getFactory(OSType.M).getOSInfo();
	}

}
