package panel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import button.MoveDownButton;
import button.MoveLeftButton;
import button.MoveRightButton;
import button.MoveUpButton;
import system.Game;

/*
 * 移动操作面板类
 */

@SuppressWarnings("serial")
public class MovePanel extends JPanel{
	
	MoveUpButton up;
	MoveDownButton down;
	MoveLeftButton left;
	MoveRightButton right;
	JLabel move;

	public MovePanel(Game game) {
		super();
		this.setBounds(0, 0, 250, 100);
		BorderLayout borderLayout = new BorderLayout();
		this.setLayout(borderLayout);
		this.setBackground(Color.DARK_GRAY);
		
		up = new MoveUpButton();
		down = new MoveDownButton();
		left = new MoveLeftButton();
		right = new MoveRightButton();
		move = new JLabel("移动", JLabel.CENTER);
		move.setForeground(Color.WHITE);
		
		this.add(up, BorderLayout.NORTH);
		this.add(down, BorderLayout.SOUTH);
		this.add(left, BorderLayout.WEST);
		this.add(right, BorderLayout.EAST);
		this.add(move, BorderLayout.CENTER);
	}
}
