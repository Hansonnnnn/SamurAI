package button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import element.Map;
import element.Samurai;
import system.Game;

/*
 * 向上占领按键类
 */

@SuppressWarnings("serial")
public class OccupyUpButton extends JButton {
	Samurai playerWhoIsFighting;
	Map mapWhichIsBeingUsed;
	
	public OccupyUpButton() {
		super("↑");
		this.addActionListener(new OccupyUpButtonListener());
	}
	
	class OccupyUpButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Game gameIsOn = new Game();
			playerWhoIsFighting = gameIsOn.getNowSamu();
			mapWhichIsBeingUsed = gameIsOn.getMap();
			playerWhoIsFighting.action(mapWhichIsBeingUsed, 3);
		}
	}
}
