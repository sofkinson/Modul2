package collections;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Zadacha7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> numbers = new LinkedList<>();
		System.out.println("Enter numbers: ");
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			
		}
		
		
		JFrame frame = new JFrame("Numbers");
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel mainPanel = new JPanel();
		frame.add(mainPanel);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

		JTextArea numbersArea = new JTextArea();
		
		JTextField inputNumbers = new JTextField();
		mainPanel.add(inputNumbers);
		inputNumbers.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Integer number = Integer.parseInt(inputNumbers.getText());
				if ( !numbers.contains(number)) {
					numbers.add(number);
				}
				
				inputNumbers.setText("");
				numbersArea.setText(numbers.toString());
				System.out.println(numbers);
			}
		});
		
		
		
		numbersArea.setEditable(false);
		mainPanel.add(numbersArea);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.X_AXIS));
		mainPanel.add(bottomPanel);
		
		JButton sortButton = new JButton("Sort");
		sortButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Collections.sort(numbers);	
				numbersArea.setText(numbers.toString());
			}
		});
		bottomPanel.add(sortButton);
		
		JButton reverseSortButton = new JButton("Reverse Sort");
		reverseSortButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Collections.sort(numbers, Collections.reverseOrder());
				numbersArea.setText(numbers.toString());
			}
		});
		bottomPanel.add(reverseSortButton);
		
		JButton shuffleButton = new JButton("Shuffle");
		shuffleButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Collections.shuffle(numbers);
				numbersArea.setText(numbers.toString());
			}
		});
		bottomPanel.add(shuffleButton);
		
		frame.setVisible(true);

	}

}
