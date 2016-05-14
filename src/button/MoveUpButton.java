package button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import element.Map;
import element.Samurai;
import system.Game;

/*
 * 向上移动按键类
 */

@SuppressWarnings("serial")
public class MoveUpButton extends JButton {
	Samurai playerWhoIsFighting;
	Map mapWhichIsBeingUsed;
	
	public MoveUpButton() {
		super("↑");
		this.addActionListener(new MoveUpButtonListener());
	}
	
	class MoveUpButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Game gameIsOn = new Game();
			playerWhoIsFighting = gameIsOn.getNowSamu();
			mapWhichIsBeingUsed = gameIsOn.getMap();
			playerWhoIsFighting.action(mapWhichIsBeingUsed, 7);
		}
	}
	
}
