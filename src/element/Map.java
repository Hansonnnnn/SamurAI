package element;

/*
 * 战场地图类
 */

public class Map {

	private int sizeX = 15; //战场横向区块数为15
	private int sizeY = 15; //战场纵向区块数为15
	private Block[][] battleField; //用区块的二维数组表示战场
	
	public Map() {

		this.battleField = new Block[sizeY][sizeX];
		//战场地图,根据战场尺寸使用一个区块的二维数组来表示
		
		for(int tempInt1 = 0; tempInt1 < sizeY; tempInt1++) {
			for(int tempInt2 = 0; tempInt2 < sizeX; tempInt2++) {
				this.battleField[tempInt1][tempInt2] = new Block();
			}
		}
		//全部区块初始化
		
	}
	
	public void setRandomBase(Samurai samu) {
		//随机设置武士基地,位于战场地图边缘的一个方格
		//先根据一个0到3的随机数randomNum1来随机选取一条边
		//再根据这条边的区块数量设置随机数randomNum2来随机选取其中一个区块
		//若得出的格子已经被选取为基地,则重新取随机数
		
		int randomNum1;
		int randomNum2;
		while(true) {
			randomNum1 = (int)(Math.random() * 4);
			
			if(randomNum1 == 0) {
				randomNum2 = (int)(Math.random() * (sizeX - 1));
				
				if(this.battleField[0][randomNum2].getOccupyer() == 8) {
					this.battleField[0][randomNum2].setOccupyer(samu.getID());
					this.battleField[0][randomNum2].setLocater(samu.getID());
					samu.setBaseX(randomNum2);
					samu.setBaseY(0);
					break;
				} else {
					continue;
				}
				
			} else if(randomNum1 == 1) {
				randomNum2 = (int)(Math.random() * (sizeY - 1));
				
				if(this.battleField[randomNum2][sizeX - 1].getOccupyer() == 8) {
					this.battleField[randomNum2][sizeX - 1].setOccupyer(samu.getID());
					this.battleField[randomNum2][sizeX - 1].setLocater(samu.getID());
					samu.setBaseX(sizeX - 1);
					samu.setBaseY(randomNum2);
					break;
				} else {
					continue;
				}
				
			} else if(randomNum1 == 2) {
				randomNum2 = 1 + (int)(Math.random() * (sizeX - 1));
				
				if(this.battleField[sizeY - 1][randomNum2].getOccupyer() == 8) {
					this.battleField[sizeY - 1][randomNum2].setOccupyer(samu.getID());
					this.battleField[sizeY - 1][randomNum2].setLocater(samu.getID());
					samu.setBaseX(randomNum2);
					samu.setBaseY(sizeY - 1);
					break;
				} else {
					continue;
				}
				
			} else if(randomNum1 == 3){
				randomNum2 = 1 + (int)(Math.random() * (sizeY - 1));
				
				if(this.battleField[randomNum2][0].getOccupyer() == 8) {
					this.battleField[randomNum2][0].setOccupyer(samu.getID());
					this.battleField[randomNum2][0].setLocater(samu.getID());
					samu.setBaseX(0);
					samu.setBaseY(randomNum2);
					break;
				} else {
					continue;
				}
				
			}
		}
		
		samu.setLocationX(samu.getBaseX());
		samu.setLocationY(samu.getBaseY());
		//初始化武士当前位置
		
	}
	
	public int getLocater(int targetX, int targetY) {
		return this.battleField[targetY][targetX].getLocater();
	}
	
	public void setLocater(int targetX, int targetY, int locaterID) {
		this.battleField[targetY][targetX].setLocater(locaterID);
	}
	
	public int getOccupyer(int targetX, int targetY) {
		return this.battleField[targetY][targetX].getOccupyer();
	}
	
	public void setOccupyer(int targetX, int targetY, int occupyerID) {
		this.battleField[targetY][targetX].setOccupyer(occupyerID);
	}
	
	public int getSizeX() {
		return this.sizeX;
	}
	
	public int getSizeY() {
		return this.sizeY;
	}

}