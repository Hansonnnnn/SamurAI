package panel;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import button.ExitButton2;
import button.SoundControlButton2;
import system.Game;

/*
 * 系统信息面板类
 */

@SuppressWarnings("serial")
public class SystemInfo extends JPanel{
	
	private ExitButton2 exit;
	private SoundControlButton2 sound;
	private JLabel roundInfo;
	
	public SystemInfo(Game game) {
		super();
		this.setName("GameInfo");
		this.setBounds(750, 0, 250, 150);
		this.setLayout(null);
		this.setBackground(Color.DARK_GRAY);

		sound = new SoundControlButton2();
		this.add(sound);
		
		exit = new ExitButton2();
		this.add(exit);
		
		roundInfo = new JLabel(game.getRoundInfo(), JLabel.CENTER);
		roundInfo.setBounds(0, 50, 250, 100);
		roundInfo.setForeground(Color.WHITE);
		this.add(roundInfo);
	}

	public ExitButton2 getExit() {
		return exit;
	}

	public void setExit(ExitButton2 exit) {
		this.exit = exit;
	}

	public SoundControlButton2 getSound() {
		return sound;
	}

	public void setSound(SoundControlButton2 sound) {
		this.sound = sound;
	}

	public JLabel getRoundInfo() {
		return roundInfo;
	}

	public void setRoundInfo(JLabel roundInfo) {
		this.roundInfo = roundInfo;
	}
}

