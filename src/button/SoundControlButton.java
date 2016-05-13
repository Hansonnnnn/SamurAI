package button;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * 音效控制按键类
 */

@SuppressWarnings("serial")
public class SoundControlButton extends JButton{
	
	public SoundControlButton() {
		super(new ImageIcon("音效开关1.jpg"));
		this.setBounds(350, 750, 200, 100);
	}

}
