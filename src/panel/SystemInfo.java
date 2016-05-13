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
	
	ExitButton2 exit;
	SoundControlButton2 sound;
	JLabel roundInfo;
	
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
}

