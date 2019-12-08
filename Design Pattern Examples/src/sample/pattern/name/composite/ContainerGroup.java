/**
 * 
 */
package sample.pattern.name.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author deshp
 *
 */
public class ContainerGroup implements Container {
	
	
	List<Container> containerList = new ArrayList<>();

	/* (non-Javadoc)
	 * @see sample.pattern.name.composite.Container#add(sample.pattern.name.composite.Container)
	 */
	@Override
	public void add(Container container) {
		// TODO Auto-generated method stub
		containerList.add(container);
	}

	/* (non-Javadoc)
	 * @see sample.pattern.name.composite.Container#remove(sample.pattern.name.composite.Container)
	 */
	@Override
	public void remove(Container container) {
		// TODO Auto-generated method stub
		containerList.remove(container);
	}

	/* (non-Javadoc)
	 * @see sample.pattern.name.composite.Container#get(int)
	 */
	@Override
	public Container get(int containerIndex) {
		// TODO Auto-generated method stub
		return containerList.get(containerIndex);
	}

	/* (non-Javadoc)
	 * @see sample.pattern.name.composite.Container#applyPatch(java.lang.String)
	 */
	@Override
	public void applyPatch() {
		// TODO Auto-generated method stub
		for(Container container : containerList) {
			container.applyPatch();
		}
	}
	
	

}
