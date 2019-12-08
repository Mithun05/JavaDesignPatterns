/**
 * 
 */
package sample.pattern.name.composite;

/**
 * @author deshp
 *
 */
public class KubernetsContainer implements Container {
	
	String patchName;
	
	/**
	 * 
	 */
	public KubernetsContainer() {
		// TODO Auto-generated constructor stub
		this.patchName = "Kubernets";
	}

	/* (non-Javadoc)
	 * @see sample.pattern.name.composite.Container#add(sample.pattern.name.composite.Container)
	 */
	@Override
	public void add(Container container) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see sample.pattern.name.composite.Container#remove(sample.pattern.name.composite.Container)
	 */
	@Override
	public void remove(Container container) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see sample.pattern.name.composite.Container#get(int)
	 */
	@Override
	public Container get(int containerIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see sample.pattern.name.composite.Container#applyPatch(java.lang.String)
	 */
	@Override
	public void applyPatch() {
		// TODO Auto-generated method stub
		System.out.println(patchName);
	}

}
