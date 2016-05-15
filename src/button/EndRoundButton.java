package button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import panel.GamePanel;
import panel.SamuraiControl;
import panel.SystemInfo;
import system.Game;

/*
 * 结束回合按键类
 */

@SuppressWarnings("serial")
public class EndRoundButton extends JButton {
	Game game;
	GamePanel panel;
	
	public EndRoundButton(Game game, GamePanel panel) {
		super(new ImageIcon("image/button/结束回合1.jpg"));
		this.setBounds(0, 250, 250, 50);
		this.game = game;
		this.panel = panel;
		this.addActionListener(new EndRoundListener());
	}
	
	class EndRoundListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			game.nextRound();
			panel.getNowSamuraiInfo().repaint();
			
			panel.remove(panel.getSystemInfo());
			panel.setSystemInfo(new SystemInfo(game));
			panel.add(panel.getSystemInfo());
			panel.getSystemInfo().getRoundInfo().repaint();
			
			panel.remove(panel.getControl());
			panel.setControl(new SamuraiControl(game, panel));
			panel.add(panel.getControl());
			
			panel.revalidate();
		}
	}
}
