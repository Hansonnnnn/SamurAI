package button;

import javax.swing.JButton;

import system.Game;

/*
 * 隐身操作按键类
 */

@SuppressWarnings("serial")
public class HideButton extends JButton{

	public HideButton(Game game) {
		super("隐身");
		this.setBounds(0, 200, 125, 50);
	}
	
}
