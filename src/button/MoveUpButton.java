package button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import element.Map;
import element.Samurai;
import panel.GamePanel;
import system.Game;

/*
 * 向上移动按键类
 */

@SuppressWarnings("serial")
public class MoveUpButton extends JButton {
	
	Samurai player;
	Map map;
	GamePanel panel;
	
	public MoveUpButton(Game game, GamePanel panel) {
		super("↑");
		player = game.getNowSamu();
		map = game.getMap();
		this.panel = panel;
		this.addActionListener(new MoveUpListener());
	}
	
	class MoveUpListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			player.action(map, 7);
			panel.getScreen().repaint();
			panel.getNowSamuraiInfo().repaint();
		}
	}
	
}
