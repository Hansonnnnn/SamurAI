package panel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import button.OccupyDownButton;
import button.OccupyLeftButton;
import button.OccupyRightButton;
import button.OccupyUpButton;
import system.Game;

/*
 * 占领操作面板类
 */

@SuppressWarnings("serial")
public class OccupyPanel extends JPanel{
	
	OccupyUpButton up;
	OccupyDownButton down;
	OccupyLeftButton left;
	OccupyRightButton right;
	JLabel occupy;

	public OccupyPanel(Game game, GamePanel panel) {
		super();
		this.setBounds(0, 125, 250, 125);
		BorderLayout borderLayout = new BorderLayout();
		this.setLayout(borderLayout);
		this.setBackground(Color.DARK_GRAY);
		
		up = new OccupyUpButton(game, panel);
		this.add(up, BorderLayout.NORTH);
		
		down = new OccupyDownButton(game, panel);
		this.add(down, BorderLayout.SOUTH);
		
		left = new OccupyLeftButton(game, panel);
		this.add(left, BorderLayout.WEST);
		
		right = new OccupyRightButton(game, panel);
		this.add(right, BorderLayout.EAST);
		
		occupy = new JLabel("占领", JLabel.CENTER);
		occupy.setForeground(Color.WHITE);
		this.add(occupy, BorderLayout.CENTER);
	}
}
