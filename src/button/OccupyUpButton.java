package button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import element.Map;
import element.Samurai;
import panel.GamePanel;
import system.Game;

/*
 * 向上占领按键类
 */

@SuppressWarnings("serial")
public class OccupyUpButton extends JButton {
	
	Samurai player;
	Map map;
	GamePanel panel;
	
	public OccupyUpButton(Game game, GamePanel panel) {
		super("↑");
		player = game.getNowSamu();
		map = game.getMap();
		this.panel = panel;
		this.addActionListener(new OccupyUpListener());
	}
	
	class OccupyUpListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			player.action(map, 3);
			panel.getScreen().repaint();
			panel.getNowSamuraiInfo().repaint();
		}
	}
	
}
