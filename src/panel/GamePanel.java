package panel;

import javax.swing.JPanel;

import system.Game;

/*
 * 游戏界面面板类
 */

@SuppressWarnings("serial")
public class GamePanel extends JPanel {

	private MapScreen screen;
	private SystemInfo systemInfo;
	private SamuraiInfo samuraiInfo;
	private NowSamuraiInfo nowSamuraiInfo;
	private SamuraiControl control;
	
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
		
		nowSamuraiInfo = new NowSamuraiInfo(game);
		this.add(nowSamuraiInfo);
		
		control = new SamuraiControl(game, this);
		this.add(control);
	}

	public MapScreen getScreen() {
		return screen;
	}

	public void setScreen(MapScreen screen) {
		this.screen = screen;
	}

	public SystemInfo getSystemInfo() {
		return systemInfo;
	}

	public void setSystemInfo(SystemInfo systemInfo) {
		this.systemInfo = systemInfo;
	}

	public SamuraiInfo getSamuraiInfo() {
		return samuraiInfo;
	}

	public void setSamuraiInfo(SamuraiInfo samuraiInfo) {
		this.samuraiInfo = samuraiInfo;
	}

	public NowSamuraiInfo getNowSamuraiInfo() {
		return nowSamuraiInfo;
	}

	public void setNowSamuraiInfo(NowSamuraiInfo nowSamuraiInfo) {
		this.nowSamuraiInfo = nowSamuraiInfo;
	}

	public SamuraiControl getControl() {
		return control;
	}

	public void setControl(SamuraiControl control) {
		this.control = control;
	}
	
}
