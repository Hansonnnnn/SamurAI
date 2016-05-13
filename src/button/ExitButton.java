package button;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * 退出游戏按键类
 */

@SuppressWarnings("serial")
public class ExitButton extends JButton{
	
	public ExitButton() {
		super(new ImageIcon("退出游戏1.jpg"));
		this.setBounds(650, 750, 200, 100);
	}

}
