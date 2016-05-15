package system;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import panel.*;

/*
 * 游戏窗口类
 */

@SuppressWarnings("serial")
public class MainFrame extends JFrame {

	Container con = getContentPane();
	int width = 1000;
	int height = 750;
	MainPanel mainPanel;
	GamePanel gamePanel;
	InstructionPanel instructionPanel;
	
	public MainFrame(Game game) {
		super("SAMURAI 3V3");
		this.setLayout(null);
		this.setResizable(false);
		this.setSize(width, height);
		
		Toolkit toolkit = this.getToolkit();
		Dimension dms = toolkit.getScreenSize();
		this.setLocation((int)(dms.getWidth()-width)/2, (int)(dms.getHeight()-height)/2);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//设置窗口显示在屏幕中间位置
		
		this.setUndecorated(true);
		//取消标题栏
		
		mainPanel = new MainPanel();
		instructionPanel = new InstructionPanel();
		gamePanel = new GamePanel(game);
		con.add(mainPanel);
		
		this.setVisible(true);
	}
	
	public void startGame() {
		//主界面切换到游戏界面
		
		con.remove(mainPanel);
		con.add(gamePanel);
		this.setVisible(false);
	}
	
	public void instruction() {
		//主界面切换到说明界面
		
		con.remove(mainPanel);
		con.add(instructionPanel);
		this.setVisible(true);
	}

}