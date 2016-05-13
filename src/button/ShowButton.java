package button;

import javax.swing.JButton;

import system.Game;

/*
 * 取消隐身按键类
 */

@SuppressWarnings("serial")
public class ShowButton extends JButton{

	public ShowButton(Game game) {
		super("取消隐身");
		this.setBounds(0, 250, 125, 50);
	}
	
}
