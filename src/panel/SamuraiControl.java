package panel;

import java.awt.Color;

import javax.swing.JPanel;

import button.EndRoundButton;
import system.Game;

/*
 * 武士控制面板类
 */

@SuppressWarnings("serial")
public class SamuraiControl extends JPanel {
	
	MovePanel move;
	OccupyPanel occupy;
	EndRoundButton endRound;
	
	public SamuraiControl(Game game, GamePanel panel) {
		super();
		this.setName("GameControl");
		this.setBounds(750, 450, 250, 300);
		this.setLayout(null);
		this.setBackground(Color.DARK_GRAY);
		
		move = new MovePanel(game, panel);
		this.add(move);
		
		occupy = new OccupyPanel(game, panel);
		this.add(occupy);
		
		endRound = new EndRoundButton(game, panel);
		this.add(endRound);
	}
}
