/**
 * 
 */
package sample.pattern.name.composite;

/**
 * @author deshp
 *
 */
public interface Container {

	public void add(Container container);
	public void remove(Container container);
	public Container get(int containerIndex);
	
	public void applyPatch();
}
