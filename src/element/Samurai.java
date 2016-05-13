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
	private boolean ifHiding; //是否隐身
	private boolean ifPanished; //是否被罚下
	
	public void action(Map map, int action) {
		//武士的行动,传入参数为0-10,分别代表不同行动
		
		if(action >= 1 && action <= 4 && power >= 4) {
			occupy(map, action);
			//行动指令在1-4之间时,如果体力大于等于4,则进行占领行为
			
		} else if(action >= 5 && action <= 8 && power >= 2) {
			move(map, action);
			//行动指令在5-8之间时,如果体力大于等于2,则进行移动行为
			
		} else if(action == 9 && power >= 1 && ifHiding == false) {
			hide(map);
			//行动指令为9时,如果未处于隐身状态且体力大于等于1,则进行隐身行为
			
		} else if(action == 10 && power >= 1 && ifHiding == true) {
			show(map);
			//行动指令为10时,如果处于隐身状态且体力大于等于1,则进行取消现身行为
			
		} else if(action == 0){
			endRound();
			//行动指令为0时,结束当前回合
			
		} else {
			panish(map);
			//行动指令不符合要求时罚下
		}
		
	}
	
	public abstract void occupy(Map map, int direction);
	
	public void occupyBlock(Map map, int targetX, int targetY) {
		//如果目标区块未被别的武士占领则对占领该区块
		
		if(map.getOccupyer(targetX, targetY) == 8) {
			map.setOccupyer(targetX, targetY, this.id);
			this.setOccupationPoints(this.getOccupationPoints() + 1);
		}
	}
	
	public void moveBlock(Map map, int targetX, int targetY) {
		//未隐身时,如果目标区块没有别的武士站在上面则移动到该区块,如果
		//隐身时,只能移动到自己和友方占领的区块,目标区块有武士也可以移动到该区块
		
		if(this.ifHiding == false) {
			if(map.getLocater(targetX, targetY) == 9) {
				map.setLocater(this.locationX, this.locationY, 9);
				map.setLocater(targetX, targetY, this.id);
				this.setLocationX(targetX);
				this.setLocationY(targetY);
			} else {
				this.panish(map);
				//行动指令不符合要求时罚下
				
			}
		} else {
			if(this.team == 0) {
				if(map.getOccupyer(targetX, targetY) < 3) {
					this.setLocationX(targetX);
					this.setLocationY(targetY);
				}
			} else if(this.team == 1){
				if(map.getOccupyer(targetX, targetY) > 2) {
					this.setLocationX(targetX);
					this.setLocationY(targetY);
				}
			} else {
				this.panish(map);
				//行动指令不符合要求时罚下
				
			}
		}
	}
	
	public void move(Map map, int direction) {
		//移动,消耗2体力,传入参数代表方向,5向左,6向右,7向上,8向下
		
		if(direction == 5 && this.locationX > 0) {
			moveBlock(map, this.locationX - 1, this.locationY);
		} else if(direction == 6 && this.locationX < (map.getMapSizeX() - 1)) {
			moveBlock(map, this.locationX + 1, this.locationY);
		} else if(direction == 7 && this.locationY > 0) {
			moveBlock(map, this.locationX, this.locationY - 1);
		} else if(direction == 8 && this.locationY < (map.getMapSizeY() - 1)) {
			moveBlock(map, this.locationX, this.locationY + 1);
		} else {
			this.panish(map);
			//行动指令不符合要求时罚下
			
		}
	}
	
	public void hide(Map map) {
		//隐身,消耗1体力,只能在自己或友方占领的区块隐身
		
		this.setPower(this.getPower() - 1);
		if(this.team == 0) {
			if(map.getOccupyer(this.locationX, this.locationY) < 3) {
				this.setIfHiding(true);
				map.setLocater(this.locationX, this.locationY, 9);
			} else {
				this.panish(map);
			}
		} else {
			if(map.getOccupyer(this.locationX, this.locationY) > 2) {
				this.setIfHiding(true);
				map.setLocater(this.locationX, this.locationY, 9);
			} else {
				this.panish(map);
			}
		}
		
	}
	
	public void show(Map map) {
		//取消隐身,消耗1体力
		
		if(map.getLocater(this.locationX, this.locationY) == 9) {
			this.setIfHiding(false);
			map.setLocater(this.locationX, this.locationY, this.getID());
		} else {
			this.panish(map);
		}
	}
	
	public void endRound() {
		//结束当前回合操作
		
	}
	
	public void getHurt(int nowRound) {
		//受伤后隐身并返回主基地
		
		this.setHurtRoundId(nowRound);
		this.setIfHurt(true);
		this.setIfHiding(true);
		this.setLocationX(this.getBaseX());
		this.setLocationY(this.getBaseY());
	}
	
	public void recover() {
		//恢复周期过了之后可以开始行动
		
		this.setIfHurt(false);
	}
	
	public void panish(Map map) {
		//超时未操作或传入指令错误则罚下,隐身并返回基地一直到游戏结束,什么都不能做
		
		this.setIfPanished(true);
		this.setLocationX(this.getBaseX());
		this.setLocationY(this.getBaseY());
		this.setIfHiding(true);
		
	}
	
	public String getInfoStr() {
		//返回显示在屏幕上的武士信息
		
		String info = "武士" + id + "分数:" + points;
		return info;
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

	public int getOccupationPoints() {
		return points;
	}

	public void setOccupationPoints(int occupationPoints) {
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

	public boolean getIfHiding() {
		return ifHiding;
	}

	public void setIfHiding(boolean ifHiding) {
		this.ifHiding = ifHiding;
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

	public boolean getIfPanished() {
		return ifPanished;
	}

	public void setIfPanished(boolean ifPanished) {
		this.ifPanished = ifPanished;
	}

	public int getTeam() {
		return team;
	}

	public void setTeam(int team) {
		this.team = team;
	}

}