package element;

/*
 * 矛武士类
 */

public class Spearer extends Samurai {

	public Spearer(int team) {
		if(team == 0) {
			this.setTeam(0);
			this.setID(1);
		} else if(team == 1){
			this.setTeam(1);
			this.setID(4);
		}
		//根据队伍设置武士ID
		
	}
	
	public void occupy(Map map, int direction) {
		//占领,传入参数代表方向,1向左,2向右,3向上,4向下
		
		this.setPower(this.getPower() - 4);
		
		if(direction == 1) {
			if(this.getLocationX() > 0) {
				this.occupyBlock(map, getLocationX() - 1, getLocationY());
			}
			if(this.getLocationX() > 1) {
				this.occupyBlock(map, getLocationX() - 2, getLocationY());
			}
			if(this.getLocationX() > 2) {
				this.occupyBlock(map, getLocationX() - 3, getLocationY());
			}
			if(this.getLocationX() > 3) {
				this.occupyBlock(map, getLocationX() - 4, getLocationY());
			}
			
		} else if(direction == 2) {
			if(this.getLocationX() < map.getSizeX() - 1) {
				this.occupyBlock(map, getLocationX() + 1, getLocationY());
			}
			if(this.getLocationX() < map.getSizeX() - 2) {
				this.occupyBlock(map, getLocationX() + 2, getLocationY());
			}
			if(this.getLocationX() < map.getSizeX() - 3) {
				this.occupyBlock(map, getLocationX() + 3, getLocationY());
			}
			if(this.getLocationX() < map.getSizeX() - 4) {
				this.occupyBlock(map, getLocationX() + 4, getLocationY());
			}
			
		} else if(direction == 3) {
			if(this.getLocationY() > 0) {
				this.occupyBlock(map, getLocationX(), getLocationY() - 1);
			}
			if(this.getLocationY() > 1) {
				this.occupyBlock(map, getLocationX(), getLocationY() - 2);
			}
			if(this.getLocationY() > 2) {
				this.occupyBlock(map, getLocationX(), getLocationY() - 3);
			}
			if(this.getLocationY() > 3) {
				this.occupyBlock(map, getLocationX(), getLocationY() - 4);
			}
			
		} else if(direction == 4) {
			if(this.getLocationY() < map.getSizeY() - 1) {
				this.occupyBlock(map, getLocationX(), getLocationY() + 1);
			}
			if(this.getLocationY() < map.getSizeY() - 2) {
				this.occupyBlock(map, getLocationX(), getLocationY() + 2);
			}
			if(this.getLocationY() < map.getSizeY() - 3) {
				this.occupyBlock(map, getLocationX(), getLocationY() + 3);
			}
			if(this.getLocationY() < map.getSizeY() - 4) {
				this.occupyBlock(map, getLocationX(), getLocationY() + 4);
			}
			
		}
		
	}

}
