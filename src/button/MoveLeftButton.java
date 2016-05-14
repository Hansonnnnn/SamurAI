package button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import element.Map;
import element.Samurai;
import system.Game;

/*
 * 向左移动按键类
 */

@SuppressWarnings("serial")
public class MoveLeftButton extends JButton {
	Samurai playerWhoIsFighting;
	Map mapWhichIsBeingUsed;
	
	public MoveLeftButton() {
		super("←");
		this.addActionListener(new MoveLeftButtonListener());
	}
	
	class MoveLeftButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Game gameIsOn = new Game();
			playerWhoIsFighting = gameIsOn.getNowSamu();
			mapWhichIsBeingUsed = gameIsOn.getMap();
			playerWhoIsFighting.action(mapWhichIsBeingUsed, 5);
		}
	}
}
