package panel;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import system.Game;

/*
 * 武士信息面板类
 */

@SuppressWarnings("serial")
public class SamuraiInfo extends JPanel{
	
	JLabel samu0Info;
	JLabel samu1Info;
	JLabel samu2Info;
	JLabel samu3Info;
	JLabel samu4Info;
	JLabel samu5Info;
	
	public SamuraiInfo(Game game) {
		super();
		this.setName("SamuraiInfo");
		this.setBounds(750, 150, 250, 200);
		GridLayout boxLayout = new GridLayout(2, 3);
		this.setLayout(boxLayout);
		this.setBackground(Color.DARK_GRAY);
		
		samu0Info = new JLabel(game.getSamu0().getInfoStr(), JLabel.CENTER);
		samu0Info.setSize(100, 100);
		samu0Info.setForeground(Color.WHITE);
		this.add(samu0Info);
		
		samu1Info = new JLabel(game.getSamu1().getInfoStr(), JLabel.CENTER);
		samu1Info.setSize(100, 100);
		samu1Info.setForeground(Color.WHITE);
		this.add(samu1Info);
		
		samu2Info = new JLabel(game.getSamu2().getInfoStr(), JLabel.CENTER);
		samu2Info.setSize(100, 100);
		samu2Info.setForeground(Color.WHITE);
		this.add(samu2Info);
		
		samu3Info = new JLabel(game.getSamu3().getInfoStr(), JLabel.CENTER);
		samu3Info.setSize(100, 100);
		samu3Info.setForeground(Color.WHITE);
		this.add(samu3Info);
		
		samu4Info = new JLabel(game.getSamu4().getInfoStr(), JLabel.CENTER);
		samu4Info.setSize(100, 100);
		samu4Info.setForeground(Color.WHITE);
		this.add(samu4Info);
		
		samu5Info = new JLabel(game.getSamu5().getInfoStr(), JLabel.CENTER);
		samu5Info.setSize(100, 100);
		samu5Info.setForeground(Color.WHITE);
		this.add(samu5Info);
		
	}
}