/**
 * 
 */
package sample.pattern.name.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author deshp
 *
 */
public class Paper implements Cloneable {
	
	
	private Integer paperId;
	private List<Integer> paperCount = new ArrayList<>();
	
	/**
	 * 
	 */ 
	public Paper(Integer id, List<Integer> list) {
		// TODO Auto-generated constructor stub
		paperId = id;
		paperCount = list;
	}
	
	public void addCount() {
		paperCount.add(1);
		paperCount.add(11);
		paperCount.add(111);
		paperCount.add(1111);
		paperCount.add(11111);
		paperCount.add(111111);
	}

	/**
	 * @return the paperCount
	 */
	public List<Integer> getPaperCount() {
		return paperCount;
	}
	

	
	/**
	 * @param paperCount the paperCount to set
	 */
	public void setPaperCount(List<Integer> paperCount) {
		this.paperCount = paperCount;
	}
	
	

	/**
	 * @return the paperId
	 */
	public Integer getPaperId() {
		return paperId;
	}

	/**
	 * @param paperId the paperId to set
	 */
	public void setPaperId(Integer paperId) {
		this.paperId = paperId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return new Paper(paperId, paperCount);
	}
	

}
