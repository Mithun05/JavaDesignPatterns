/**
 * 
 */
package sample.pattern.name.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author deshp
 *
 */
public class ShapeFlyWeight {
	
	private static final Map<ShapeType, Shape> objPool = new HashMap<>();
	
	public static Shape getShape(ShapeType type) {
		
		Shape shape = objPool.get(type);
		
		if(shape == null) {
				switch(type) {
					case T :
						shape = new Triangle();
						break;
					case R :
						shape = new Rectangle();
						break;
					default:
				}
			objPool.put(type, shape);
		}
		
		
		return shape;
		
	}
	
	
	public static enum ShapeType {
		T, R
	}
	

}
