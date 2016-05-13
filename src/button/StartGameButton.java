package button;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * 开始游戏按键类
 */

@SuppressWarnings("serial")
public class StartGameButton extends JButton {
	
	public StartGameButton() {
		super(new ImageIcon("开始游戏1.jpg"));
		this.setBounds(250, 400, 200, 100);
	}

}
