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
public class PaperPrototypeMain {

	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(11);
		
		Paper paper = new Paper(1, list);
		
		System.out.println("Ori Obj" + paper.getPaperId() + "----" + paper.getPaperCount().size());

		Paper papClone = (Paper) paper.clone();
		papClone.getPaperCount().add(3);
		
		System.out.println("Clone Obj" + papClone.getPaperId() + "---" + papClone.getPaperCount().size());
	}
	
}
