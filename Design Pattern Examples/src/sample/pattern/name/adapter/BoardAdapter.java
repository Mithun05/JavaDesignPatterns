/**
 * 
 */
package sample.pattern.name.adapter;

/**
 * @author deshp
 *
 */
public class BoardAdapter extends WhiteBoard implements WorkingBoard {
	

	/* (non-Javadoc)
	 * @see sample.pattern.name.adapter.WorkingBoard#getWhiteBoard()
	 */
	@Override
	public Board getWhiteBoard() {
		// TODO Auto-generated method stub
		return new Board(getBoard().getColor());
	}

}
