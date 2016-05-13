package panel;

import java.awt.Color;

import javax.swing.JPanel;

import button.EndRoundButton;
import button.HideButton;
import button.ShowButton;
import system.Game;

/*
 * 武士控制面板类
 */

@SuppressWarnings("serial")
public class SamuraiControl extends JPanel {
	
	MovePanel move;
	OccupyPanel occupy;
	HideButton hide;
	ShowButton show;
	EndRoundButton endRound;
	
	public SamuraiControl(Game game) {
		super();
		this.setName("GameControl");
		this.setBounds(750, 450, 250, 300);
		this.setLayout(null);
		this.setBackground(Color.DARK_GRAY);
		
		move = new MovePanel(game);
		this.add(move);
		
		occupy = new OccupyPanel(game);
		this.add(occupy);
		
		hide = new HideButton(game);
		this.add(hide);
		
		show = new ShowButton(game);
		this.add(show);
		
		endRound = new EndRoundButton(game);
		this.add(endRound);
	}
}

