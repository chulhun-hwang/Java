package Event_Class;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RockPaperScissor extends JFrame implements ActionListener {
	static final int ROCK =0;
	static final int PAPER = 0;
	static final int SCISSOR = 0;
	
	private JPanel panel;
	private JTextField output;
	private JTextField information;
	private JButton rock;
	private JButton paper;
	private JButton scissor;
	
	public RockPaperScissor(){
		setTitle("가워, 바위, 보");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3));
		
		information = new JTextField("아래의 버튼 중에서 하나를 클릭하시오!");
		output = new JTextField(20);
		
		rock = new JButton("ROCK");
		paper = new JButton("PAPER");
		scissor = new JButton("SCISSOR");
		rock.addActionListener(this);
		paper.addActionListener(this);
		scissor.addActionListener(this);
		
		panel.add(rock);
		panel.add(paper);
		panel.add(scissor);
		
		add(information, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RockPaperScissor gui = new RockPaperScissor();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int computer = random.nextInt(3);
		if(e.getSource() == rock){
			if(computer == SCISSOR){
				output.setText("사용자 승리");
			}else if(computer == ROCK){
				output.setText("비겼음");
			}else{
				output.setText("컴퓨터 승리");
			}
		}else if(e.getSource() == paper){
			if(computer == ROCK){
				output.setText("사용자 승리");
			}else if(computer == PAPER){
				output.setText("비겼음");
			}else{
				output.setText("컴퓨터 승리");
			}
		}else if(e.getSource() == scissor){
			if(computer == PAPER){
				output.setText("사용자 승리");
			}else if(computer == SCISSOR){
				output.setText("비겼음");
			}else{
				output.setText("컴퓨터 승리");
			}
		}
	}

}
