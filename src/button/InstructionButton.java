package button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import system.Game;
import system.MainFrame;

/*
 * 游戏说明按键类
 */

@SuppressWarnings("serial")
public class InstructionButton extends JButton {
	Game game;
	public InstructionButton() {
		super(new ImageIcon("游戏说明1.jpg"));
		this.setBounds(550, 400, 200, 100);
		this.addActionListener(new InstructionButtonListener());
	}
	
	class InstructionButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			MainFrame mainFrame = new MainFrame(game);
			mainFrame.instruction();
			
		}
	}
}
