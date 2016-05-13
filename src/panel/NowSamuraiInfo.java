package panel;

import java.awt.Color;

/*
 * 当前行动武士信息面板类
 */

import javax.swing.JLabel;
import javax.swing.JPanel;

import element.Samurai;

@SuppressWarnings("serial")
public class NowSamuraiInfo extends JPanel{
	
	JLabel nowSamuInfo;
	JLabel power;

	public NowSamuraiInfo(Samurai nowSamu) {
		super();
		this.setName("NowSamuraiInfo");
		this.setBounds(750, 350, 250, 100);
		this.setLayout(null);
		this.setBackground(Color.DARK_GRAY);
		
		nowSamuInfo = new JLabel("当前武士:" + nowSamu.getID(), JLabel.CENTER);
		nowSamuInfo.setForeground(Color.WHITE);
		nowSamuInfo.setBounds(0, 0, 250, 50);
		this.add(nowSamuInfo);
		
		power = new JLabel("体力:" + nowSamu.getPower(), JLabel.CENTER);
		power.setForeground(Color.WHITE);
		power.setBounds(0, 50, 250, 50);
		this.add(power);
	}
	
}
