package button;

import javax.swing.JButton;

import system.Game;

/*
 * 结束回合按键类
 */

@SuppressWarnings("serial")
public class EndRoundButton extends JButton {

	public EndRoundButton(Game game) {
		super("结束回合");
		this.setBounds(125, 200, 125, 100);
	}
}
