package button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import element.Map;
import element.Samurai;
import panel.GamePanel;
import system.Game;

/*
 * 向下移动按键类
 */

@SuppressWarnings("serial")
public class MoveDownButton extends JButton {

	Samurai player;
	Map map;
	GamePanel panel;
	
	public MoveDownButton(Game game, GamePanel panel) {
		super("↓");
		player = game.getNowSamu();
		map = game.getMap();
		this.panel = panel;
		this.addActionListener(new MoveDownListener());
	}
	
	class MoveDownListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			player.action(map, 8);
			panel.getScreen().repaint();
			panel.getNowSamuraiInfo().repaint();
		}
	}
	
}
