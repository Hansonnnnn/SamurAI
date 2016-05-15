package button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import system.Game;
import system.MainFrame;

/*
 * 开始游戏按键类
 */

@SuppressWarnings("serial")
public class StartGameButton extends JButton {
	Game game;
	public StartGameButton() {
		super(new ImageIcon("开始游戏1.jpg"));
		this.setBounds(250, 400, 200, 100);
		this.addActionListener(new StartGameButtonListener());
	}
	
	class StartGameButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			MainFrame mainFrame = new MainFrame(game);
			mainFrame.startGame();
		}
	}

}
