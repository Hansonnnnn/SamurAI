package panel;

import javax.swing.JPanel;

import system.Game;

/*
 * 游戏界面面板类
 */

@SuppressWarnings("serial")
public class GamePanel extends JPanel {

	MapScreen screen;
	SystemInfo systemInfo;
	SamuraiInfo samuraiInfo;
	NowSamuraiInfo nowSamuraiInfo;
	SamuraiControl control;
	
	public GamePanel(Game game) {
		super();
		this.setSize(1000, 750);
		this.setLayout(null);
		
		screen = new MapScreen(game);
		this.add(screen);

		systemInfo = new SystemInfo(game);
		this.add(systemInfo);
		
		samuraiInfo = new SamuraiInfo(game);
		this.add(samuraiInfo);
		
		nowSamuraiInfo = new NowSamuraiInfo(game.getNowSamu());
		this.add(nowSamuraiInfo);
		
		control = new SamuraiControl(game);
		this.add(control);
	}
}
