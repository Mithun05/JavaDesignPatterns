/**
 * 
 */
package sample.pattern.name.flyweight;

import sample.pattern.name.flyweight.ShapeFlyWeight.ShapeType;

/**
 * @author deshp
 *
 */
public class FlyWeightMain {

	public static void main(String[] args) {
		
		
		ShapeType shape[] = {ShapeType.T, ShapeType.R, ShapeType.T, ShapeType.R, ShapeType.T, ShapeType.T, ShapeType.R};
		
		for(int i = 0; i < shape.length; i++) {
			Shape s = ShapeFlyWeight.getShape(shape[i]);
			s.draw();
		}
	}
	
}
