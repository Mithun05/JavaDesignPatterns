/**
 * 
 */
package sample.pattern.name.composite;

/**
 * @author deshp
 *
 */
public class ContainerMain {
	
	
	
	public static void main(String[] args) {
		
		Container c1 = new DockerContainer();
		Container c2 = new KubernetsContainer();
		
		Container c3 = new ContainerGroup();
		c3.add(c1);
		c3.add(c2);
		
		c3.applyPatch();
		
	}

}
