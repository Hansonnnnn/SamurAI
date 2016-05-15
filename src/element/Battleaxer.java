package element;

/*
 * 战斧武士类
 */

public class Battleaxer extends Samurai {

	public Battleaxer(int team) {
		if(team == 0) {
			this.setTeam(0);
			this.setID(2);
		} else if(team == 1){
			this.setTeam(1);
			this.setID(5);
		}
		//根据队伍设置武士ID
		
	}
	
	public void occupy(Map map, int direction) {
		//占领,传入参数代表方向,1向左,2向右,3向上,4向下
		
		this.setPower(this.getPower() - 4);
		
		if(direction == 1) {
			if(this.getLocationX() > 0) {
				this.occupyBlock(map, this.getLocationX() - 1, this.getLocationY());
				if(this.getLocationY() > 0) {
					this.occupyBlock(map, this.getLocationX() - 1, this.getLocationY() - 1);
				}
				if(this.getLocationY() < map.getSizeY() - 1) {
					this.occupyBlock(map, this.getLocationX() - 1, this.getLocationY() + 1);
				}
			}
			if(this.getLocationY() > 0) {
				this.occupyBlock(map, this.getLocationX(), this.getBaseY() - 1);
				if(this.getLocationX() < map.getSizeX() - 1) {
					this.occupyBlock(map, this.getLocationX() + 1, this.getLocationY() - 1);
				}
			}
			if(this.getLocationY() < map.getSizeY() - 1) {
				this.occupyBlock(map, this.getLocationX(), this.getLocationY() + 1);
				if(this.getLocationX() < map.getSizeX() - 1) {
					this.moveBlock(map, this.getLocationX() + 1, this.getLocationY() + 1);
				}
			}
			
		} else if(direction == 2) {
			if(this.getLocationX() < map.getSizeX() - 1) {
				this.occupyBlock(map, this.getLocationX() + 1, this.getLocationY());
				if(this.getLocationY() > 0) {
					this.occupyBlock(map, this.getLocationX() + 1, this.getLocationY() - 1);
				}
				if(this.getLocationY() < map.getSizeY() - 1) {
					this.occupyBlock(map, this.getLocationX() + 1, this.getLocationY() + 1);
				}
			}
			if(this.getLocationY() > 0) {
				this.occupyBlock(map, this.getLocationX(), this.getLocationY() - 1);
				if(this.getLocationX() > 0) {
					this.occupyBlock(map, this.getLocationX() - 1, this.getLocationY() - 1);
				}
			}
			if(this.getLocationY() < map.getSizeY() - 1) {
				this.occupyBlock(map, this.getLocationX(), this.getLocationY() + 1);
				if(this.getLocationX() > 0) {
					this.occupyBlock(map, this.getLocationX() - 1, this.getLocationY() + 1);
				}
			}
			
		} else if(direction == 3) {
			if(this.getLocationY() > 0) {
				this.occupyBlock(map, this.getLocationX(), this.getLocationY() - 1);
				if(this.getLocationX() > 0) {
					this.occupyBlock(map, this.getLocationX() - 1, this.getLocationY() - 1);
				}
				if(this.getLocationX() < map.getSizeX() - 1) {
					this.occupyBlock(map, this.getLocationX() + 1, this.getLocationY() - 1);
				}
			}
			if(this.getLocationX() > 0) {
				this.occupyBlock(map, this.getLocationX() - 1, this.getLocationY());
				if(this.getLocationY() < map.getSizeY() - 1) {
					this.occupyBlock(map, this.getLocationX() - 1, this.getLocationY() + 1);
				}
			}
			if(this.getLocationX() < map.getSizeX() - 1) {
				this.occupyBlock(map, this.getLocationX() + 1, this.getLocationY());
				if(this.getLocationY() < map.getSizeY() - 1) {
					this.occupyBlock(map, this.getLocationX() + 1, this.getLocationY() + 1);
				}
			}
			
		} else if(direction == 4) {
			if(this.getLocationY() < map.getSizeY() - 1) {
				this.occupyBlock(map, getLocationX(), getLocationY() + 1); 
				if(this.getLocationX() > 0) {
					this.occupyBlock(map, this.getLocationX() - 1, this.getLocationY() + 1);
				}
				if(this.getLocationX() < map.getSizeX() - 1) {
					this.occupyBlock(map, this.getLocationX() + 1, this.getLocationY() + 1);
				}
			}
			if(this.getLocationX() > 0) {
				this.occupyBlock(map, this.getLocationX() - 1, this.getLocationY());
				if(this.getLocationY() > 0) {
					this.occupyBlock(map, this.getLocationX() - 1, this.getLocationY() - 1);
				}
			}
			if(this.getLocationX() < map.getSizeX() - 1) {
				this.occupyBlock(map, this.getLocationX() + 1, this.getLocationY());
				if(this.getLocationY() > 0) {
					this.occupyBlock(map, this.getLocationX() + 1, this.getLocationY() - 1);
				}
			}
			
		}
		
	}

}
