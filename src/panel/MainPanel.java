package panel;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import button.ExitButton1;
import button.InstructionButton;
import button.SoundControlButton1;
import button.StartGameButton;

/*
 * 游戏主面板,包含开始游戏和游戏说明按键,还有音效控制按键和退出按键
 */

@SuppressWarnings("serial")
public class MainPanel extends JPanel {
	
	BufferedImage background;
	StartGameButton start;
	InstructionButton instruction;
	SoundControlButton1 sound;
	ExitButton1 exit;
	
	public MainPanel() {
		super();
		this.setSize(1000, 750);
		this.setLayout(null);
		
		start = new StartGameButton();
		this.add(start);
		
		instruction = new InstructionButton();
		this.add(instruction);
		
		exit = new ExitButton1();
		this.add(exit);
		
		sound = new SoundControlButton1();
		this.add(sound);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		try {
			background = ImageIO.read(new File("主界面.jpg"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		g.drawImage(background, 0, 0, this);
	}
}
