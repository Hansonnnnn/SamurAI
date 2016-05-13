package system;

import java.awt.Container;

import javax.swing.JFrame;

import panel.*;

/*
 * 游戏窗口类
 */

@SuppressWarnings("serial")
public class MainFrame extends JFrame {

	Container con = getContentPane();
	MainPanel mainPanel;
	GamePanel gamePanel;
	InstructionPanel instructionPanel;
	
	public MainFrame(Game game) {
		super("SAMURAI 3V3");
		this.setLayout(null);
		this.setResizable(false);
		this.setBounds(10, 10, 1000, 750);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		mainPanel = new MainPanel();
		
		gamePanel = new GamePanel(game);
		con.add(gamePanel);
		
		this.setVisible(true);
	}

}
