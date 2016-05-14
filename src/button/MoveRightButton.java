package button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import element.Map;
import element.Samurai;
import system.Game;

/*
 * 向右移动按键类
 */

@SuppressWarnings("serial")
public class MoveRightButton extends JButton {
	Samurai playerWhoIsFighting;
	Map mapWhichIsBeingUsed;
	
	public MoveRightButton() {
		super("→");
		this.addActionListener(new MoveRightButtonListener());
	}
	
	class MoveRightButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Game gameIsOn = new Game();
			playerWhoIsFighting = gameIsOn.getNowSamu();
			mapWhichIsBeingUsed = gameIsOn.getMap();
			playerWhoIsFighting.action(mapWhichIsBeingUsed, 6);
		}
	}
}
