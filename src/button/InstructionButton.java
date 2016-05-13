package button;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * 游戏说明按键类
 */

@SuppressWarnings("serial")
public class InstructionButton extends JButton {
	
	public InstructionButton() {
		super(new ImageIcon("游戏说明1.jpg"));
		this.setBounds(550, 400, 200, 100);
	}

}
