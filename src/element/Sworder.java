package element;

/*
 * 剑武士类
 */

public class Sworder extends Samurai {

	public Sworder(int team) {
		if(team == 0) {
			this.setTeam(0);
			this.setID(0);
		} else if(team == 1){
			this.setTeam(1);
			this.setID(3);
		}
		//根据队伍设置武士ID
		
		this.setIfHiding(false);
	}
	
	public void occupy(Map map, int direction) {
		//占领,传入参数代表方向,1向左,2向右,3向上,4向下
		
		this.setPower(this.getPower() - 4);
		
		if(this.getIfHiding() == true) {
			this.panish(map);
			//隐身时不能占领,否则将被罚下
			
		}
		
		if(direction == 1) {
			if(this.getLocationX() > 1) {
				this.occupyBlock(map, this.getLocationX() - 2, this.getLocationY());
			}
			if(this.getLocationX() > 0) {
				this.occupyBlock(map, this.getLocationX() - 1, this.getLocationY());
			}
			if(this.getLocationY() < map.getMapSizeY() - 2) {
				this.occupyBlock(map, this.getLocationX(), this.getLocationY() + 2);
			}
			if(this.getLocationY() < map.getMapSizeY() - 1) {
				this.occupyBlock(map, this.getLocationX(), this.getLocationY() + 1);
				if(this.getLocationX() > 0) {
					this.occupyBlock(map, this.getLocationX() - 1, this.getLocationY() + 1);
				}
			}
		} else if(direction == 2) {
			if(this.getLocationX() < map.getMapSizeX() - 2) {
				this.occupyBlock(map, this.getLocationX() + 2, this.getLocationY());
			}
			if(this.getLocationX() < map.getMapSizeX() - 1) {
				this.occupyBlock(map, this.getLocationX() + 1, this.getLocationY());
			}
			if(this.getLocationY() > 1) {
				this.occupyBlock(map, this.getLocationX(), this.getLocationY() - 2);
			}
			if(this.getLocationY() > 0) {
				this.occupyBlock(map, this.getLocationX(), this.getLocationY() - 1);
				if(this.getLocationX() < map.getMapSizeX() - 1) {
					this.occupyBlock(map, this.getLocationX() + 1, this.getLocationY() - 1);
				}
			}
		} else if(direction == 3) {
			if(this.getLocationX() > 1) {
				this.occupyBlock(map, this.getLocationX() - 2, this.getLocationY());
			}
			if(this.getLocationX() > 0) {
				this.occupyBlock(map, this.getLocationX() - 1, this.getLocationY());
			}
			if(this.getLocationY() > 1) {
				this.occupyBlock(map, this.getLocationX(), this.getLocationY() - 2);
			}
			if(this.getLocationY() > 0) {
				this.occupyBlock(map, this.getLocationX(), this.getLocationY() - 1);
				if(this.getLocationX() > 0) {
					this.occupyBlock(map, this.getLocationX() - 1, this.getLocationY() - 1);
				}
			}
		} else if(direction == 4) {
			if(this.getLocationX() < map.getMapSizeX() - 2) {
				this.occupyBlock(map, this.getLocationX() + 2, this.getLocationY());
			}
			if(this.getLocationX() < map.getMapSizeX() - 1) {
				this.occupyBlock(map, this.getLocationX() + 1, this.getLocationY());
			}
			if(this.getLocationY() < map.getMapSizeY() - 2) {
				this.occupyBlock(map, this.getLocationX(), this.getLocationY() + 2);
			}
			if(this.getLocationY() < map.getMapSizeY() - 1) {
				this.occupyBlock(map, this.getLocationX(), this.getLocationY() + 1);
				if(this.getLocationX() < map.getMapSizeX() - 1) {
					this.occupyBlock(map, this.getLocationX() + 1, this.getLocationY() + 1);
				}
			}
		} else {
			this.panish(map);
			//行动指令不符合要求时罚下
		}
		
	}

}
