package button;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * 主界面的音效控制按键类
 */

@SuppressWarnings("serial")
public class SoundControlButton1 extends JButton{
	
	public SoundControlButton1() {
		super(new ImageIcon("音效开1.jpg"));
		this.setBounds(250, 550, 200, 100);
	}

}
