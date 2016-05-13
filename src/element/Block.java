package element;

/*
 * 区块类
 */

public class Block {
	
	private int occupyer; //占领此区块的武士id
	private int locater; //当前站在此区块的武士id
	//没有武士占领的区块设为8
	//隐身的武士站立的区块和没有武士站立的区块设为9
	
	public int getOccupyer() {
		return occupyer;
	}
	public void setOccupyer(int occupyer) {
		this.occupyer = occupyer;
	}
	public int getLocater() {
		return locater;
	}
	public void setLocater(int locater) {
		this.locater = locater;
	}
	
	public Block() {
		this.occupyer = 8;
		this.locater = 9;
	}
	
}