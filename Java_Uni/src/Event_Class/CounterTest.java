package Event_Class;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyCounter extends JFrame implements ActionListener{
	private JLabel label1, label2;
	private JButton button;
	private int count =0;
	
	public MyCounter(){
		JPanel panel = new JPanel();
		label1 = new JLabel("Counter");
		panel.add(label1);
		
		label2 = new JLabel(" " + count);
		label2.setFont(new Font("serif", Font.BOLD | Font.ITALIC, 90));
		panel.add(label2);
		
		button = new JButton("카운터 증가");
		panel.add(button);
		button.addActionListener(this);
		
		add(panel);
		setSize(300, 200);
		setTitle("My Counter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		count ++;
		label2.setText(count + " ");
	}
}

public class CounterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyCounter();
	}

}
