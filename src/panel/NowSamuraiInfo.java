package panel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import system.Game;

/*
 * 当前行动武士信息面板类
 */

@SuppressWarnings("serial")
public class NowSamuraiInfo extends JPanel{
	
	Image powerText;
	Image powerNum;
	Image samuText;
	Image samuNum;
	Game game;

	public NowSamuraiInfo(Game game) {
		super();
		this.setName("NowSamuraiInfo");
		this.setBounds(750, 350, 250, 100);
		this.setLayout(null);
		this.setBackground(Color.DARK_GRAY);
		this.game = game;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		int pow = game.getNowSamu().getPower();
		int samu = game.getNowSamu().getID();
		try {
			samuText = ImageIO.read(new File("image/label/当前武士.jpg"));
			powerText = ImageIO.read(new File("image/label/体力.jpg"));
			
			switch(samu) {
			case 0:
				samuNum = ImageIO.read(new File("image/label/武士0.jpg"));
				break;
			case 1:
				samuNum = ImageIO.read(new File("image/label/武士1.jpg"));
				break;
			case 2:
				samuNum = ImageIO.read(new File("image/label/武士2.jpg"));
				break;
			case 3:
				samuNum = ImageIO.read(new File("image/label/武士3.jpg"));
				break;
			case 4:
				samuNum = ImageIO.read(new File("image/label/武士4.jpg"));
				break;
			case 5:
				samuNum = ImageIO.read(new File("image/label/武士5.jpg"));
				break;
			}
			
			switch(pow) {
			case 0:
				powerNum = ImageIO.read(new File("image/label/数字0.jpg"));
				break;
			case 1:
				powerNum = ImageIO.read(new File("image/label/数字1.jpg"));
				break;
			case 2:
				powerNum = ImageIO.read(new File("image/label/数字2.jpg"));
				break;
			case 3:
				powerNum = ImageIO.read(new File("image/label/数字3.jpg"));
				break;
			case 4:
				powerNum = ImageIO.read(new File("image/label/数字4.jpg"));
				break;
			case 5:
				powerNum = ImageIO.read(new File("image/label/数字5.jpg"));
				break;
			case 6:
				powerNum = ImageIO.read(new File("image/label/数字6.jpg"));
				break;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		//读取所需图片
		
		g.drawImage(samuText, 0, 0, this);
		g.drawImage(samuNum, 60, 25, this);
		g.drawImage(powerText, 125, 0, this);
		g.drawImage(powerNum, 185, 0, this);
		//设置图片的位置
		
	}
	
}
