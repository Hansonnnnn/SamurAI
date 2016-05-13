package panel;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import system.Game;

/*
 * 地图显示面板类
 */

@SuppressWarnings("serial")
public class MapScreen extends JPanel {
	
	BufferedImage background;
	
	public MapScreen(Game game) {
		super();
		this.setName("MapScreen");
		this.setBounds(0, 0, 750, 750);
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		try {
			background = ImageIO.read(new File("地图界面.jpg"));
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		g.drawImage(background, 0, 0, this);
	}
}