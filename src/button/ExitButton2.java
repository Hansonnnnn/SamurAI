package button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * 游戏界面的退出游戏按键类
 */

@SuppressWarnings("serial")
public class ExitButton2 extends JButton{
	
	public ExitButton2() {
		super(new ImageIcon("退出游戏3.jpg"));
		this.setBounds(125, 0, 125, 50);
		this.addActionListener(new ExitListener());
	}
	
	class ExitListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}

}