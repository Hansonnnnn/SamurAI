package element;

/*
 * 武士类
 */

public abstract class Samurai {

	private int id; //编号,0-5,其中0-2为队伍0,3-5为队伍1
	private int team; //队伍编号,0或1
	private int baseX; //基地横坐标
	private int baseY; //基地纵坐标
	private int power; //体力,未受伤时每回合开始时体力为7,当体力为0时就不能行动
	private int points; //占领点数
	private int locationX; //当前位置横坐标
	private int locationY; //当前位置纵坐标
	private int hurtRoundId; //受伤时的回合id
	private boolean ifHurt; //是否受伤
	
	public void action(Map map, int action) {
		//武士的行动,传入参数为1-8,分别代表不同行动
		
		if(action >= 1 && action <= 4 && power >= 4) {
			occupy(map, action);
			//行动指令在1-4之间时,如果体力大于等于4,则进行占领行为
			
		} else if(action >= 5 && action <= 8 && power >= 2) {
			move(map, action);
			//行动指令在5-8之间时,如果体力大于等于2,则进行移动行为
			
		}
		
	}
	
	public abstract void occupy(Map map, int direction);
	
	public void occupyBlock(Map map, int targetX, int targetY) {
		//如果目标区块未被别的武士占领则对占领该区块
		
		if(map.getOccupyer(targetX, targetY) == 8) {
			map.setOccupyer(targetX, targetY, this.id);
			this.setPoints(this.getPoints() + 1);
			setPower(getPower() - 4);
		}
	}
	
	public void moveBlock(Map map, int targetX, int targetY) {
		//如果目标区块没有别的武士站在上面则移动到该区块
		
		if(map.getLocater(targetX, targetY) == 9) {
			map.setLocater(this.locationX, this.locationY, 9);
			map.setLocater(targetX, targetY, this.id);
			setLocationX(targetX);
			setLocationY(targetY);
			setPower(getPower() - 2);
		}
		
	}
	
	public void move(Map map, int direction) {
		//移动,传入参数代表方向,5向左,6向右,7向上,8向下
		
		if(direction == 5 && this.locationX > 0) {
			moveBlock(map, this.locationX - 1, this.locationY);
		} else if(direction == 6 && this.locationX < (map.getSizeX() - 1)) {
			moveBlock(map, this.locationX + 1, this.locationY);
		} else if(direction == 7 && this.locationY > 0) {
			moveBlock(map, this.locationX, this.locationY - 1);
		} else if(direction == 8 && this.locationY < (map.getSizeY() - 1)) {
			moveBlock(map, this.locationX, this.locationY + 1);
		}
	}
	
	public void recover() {
		//恢复周期过了之后可以开始行动
		
		this.setIfHurt(false);
	}
	
	public String getInfoStr() {
		//返回显示在屏幕上的武士信息
		
		String info = "武士" + id + "分数:" + points;
		return info;
	}
	
	public int getX() {
		//返回武士当前位置在地图上的横坐标
		
		return 1+50*locationX;
	}
	
	public int getY() {
		//返回武士当前位置在地图上的纵坐标
		
		return 1+50*locationY;
	}
	
	public int getID() {
		return id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public int getBaseX() {
		return baseX;
	}
	
	public void setBaseX(int baseX) {
		this.baseX = baseX;
	}

	public int getBaseY() {
		return baseY;
	}

	public void setBaseY(int baseY) {
		this.baseY = baseY;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int occupationPoints) {
		this.points = occupationPoints;
	}

	public int getLocationX() {
		return locationX;
	}

	public void setLocationX(int locationX) {
		this.locationX = locationX;
	}

	public int getLocationY() {
		return locationY;
	}

	public void setLocationY(int locationY) {
		this.locationY = locationY;
	}

	public int getHurtRoundId() {
		return hurtRoundId;
	}

	public void setHurtRoundId(int hurtRoundId) {
		this.hurtRoundId = hurtRoundId;
	}

	public boolean getIfHurt() {
		return ifHurt;
	}

	public void setIfHurt(boolean ifHurt) {
		this.ifHurt = ifHurt;
	}

	public int getTeam() {
		return team;
	}

	public void setTeam(int team) {
		this.team = team;
	}

}