package system;

import element.*;

public class Game {
	
	private int totalRounds; //总回合数
	private int nowRound; //当前回合
	private int recoveryTime = 12; //恢复周期,12个回合
	private Map map; //战场地图
	private Sworder samu0, samu3; //双方的剑武士
	private Spearer samu1, samu4; //双方的矛武士
	private Battleaxer samu2, samu5; //双方的斧武士
	
	public Game() {
		//初始化游戏
		
		totalRounds = 504;
		nowRound = 1;
		//初始化总回合数和当前回合数
		
		map = new Map();
		//初始化战场地图
		
		samu0 = new Sworder(0);
		samu1 = new Spearer(0);
		samu2 = new Battleaxer(0);
		samu3 = new Sworder(1);
		samu4 = new Spearer(1);
		samu5 = new Battleaxer(1);
		//初始化双方武士
		
		map.setRandomBase(samu0);
		map.setRandomBase(samu1);
		map.setRandomBase(samu2);
		map.setRandomBase(samu3);
		map.setRandomBase(samu4);
		map.setRandomBase(samu5);
		//初始化双方武士的基地
		
		getNowSamu().setPower(6);
		//初始化当前武士的体力为6
		
	}
	
	public void endGame() {
		//结束游戏,计算分数,得出胜利队伍
		
		int team0points = samu0.getPoints() + samu1.getPoints() + samu2.getPoints();
		int team1points = samu3.getPoints() + samu4.getPoints() + samu5.getPoints();
		
		if(team0points == team1points) {
			//平局
		} else if(team0points > team1points) {
			//队伍0获胜
		} else {
			//队伍1获胜
		}
		
	}
	
	public void nextRound() {
		//结束回合后,改变当前回合数,重新设置当前行动的武士
		//如果当前回合等于总回合数,则结束游戏
		
		if(nowRound == totalRounds) {
			endGame();
		} else {
			nowRound++;
			getNowSamu().setPower(6);
		}
	}
	
	public Samurai getNowSamu() {
		//返回当前行动的武士
		
		switch(nowRound % 12) {
		case 1:
		case 8:
			return samu0;
		case 2:
		case 7:
			return samu3;
		case 3:
		case 10:
			return samu4;
		case 4:
		case 9:
			return samu1;
		case 0:
		case 5:
			return samu2;
		default:
			return samu5;
		}
	}
	
	public String getRoundInfo() {
		//返回当前回合和总回合数信息
		
		String info = "回合:" + nowRound + "/" + totalRounds;
		return info;
	}
	
	public int getTotalRounds() {
		return this.totalRounds;
	}
	
	public void setTotalRounds(int totalRounds) {
		this.totalRounds = totalRounds;
	}
	
	public int getNowRound() {
		return this.nowRound;
	}
	
	public void setNowRound(int nowRound) {
		this.nowRound = nowRound;
	}
	
	public int getRecoveryTime() {
		return this.recoveryTime;
	}
	
	public void setRecoveryTime(int recoveryTime) {
		this.recoveryTime = recoveryTime;
	}
	
	public Map getMap() {
		return this.map;
	}
	
	public void setMap(Map map) {
		this.map = map;
	}

	public Sworder getSamu0() {
		return this.samu0;
	}

	public void setSamu0(Sworder samu0) {
		this.samu0 = samu0;
	}

	public Spearer getSamu1() {
		return this.samu1;
	}

	public void setSamu1(Spearer samu1) {
		this.samu1 = samu1;
	}

	public Battleaxer getSamu2() {
		return this.samu2;
	}

	public void setSamu2(Battleaxer samu2) {
		this.samu2 = samu2;
	}

	public Sworder getSamu3() {
		return this.samu3;
	}

	public void setSamu3(Sworder samu3) {
		this.samu3 = samu3;
	}

	public Spearer getSamu4() {
		return this.samu4;
	}

	public void setSamu4(Spearer samu4) {
		this.samu4 = samu4;
	}

	public Battleaxer getSamu5() {
		return this.samu5;
	}

	public void setSamu5(Battleaxer samu5) {
		this.samu5 = samu5;
	}
	
}
