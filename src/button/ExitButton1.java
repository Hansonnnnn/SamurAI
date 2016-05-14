package button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * 主界面的退出游戏按键类
 */

@SuppressWarnings("serial")
public class ExitButton1 extends JButton{
	
	public ExitButton1() {
		super(new ImageIcon("退出游戏1.jpg"));
		this.setBounds(550, 550, 200, 100);
		this.addActionListener(new ExitListener());
	}
	
	class ExitListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}

}