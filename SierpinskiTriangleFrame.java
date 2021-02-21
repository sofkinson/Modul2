package recursion;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class SierpinskiTriangleFrame extends JFrame {
	//static int r = 0, gr = 0, b = 255;
	//private JTextField txtOrder = new JTextField("0", 5); // Order
	private SierpinskiTrianglePanel trianglePanel = new SierpinskiTrianglePanel(); // To display the pattern
	
	JButton plusButton = new JButton("+");
	JButton minusButton = new JButton("-");
	
	public SierpinskiTriangleFrame() {
		JPanel panel = new JPanel();
		panel.add(plusButton);
		panel.add(minusButton);
		
		//panel.add(new JLabel("Enter an order: "));
		//panel.add(txtOrder);
		//txtOrder.setHorizontalAlignment(SwingConstants.RIGHT);

		add(trianglePanel);
		add(panel, BorderLayout.SOUTH);

		/*txtOrder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				trianglePanel.setOrder(Integer.parseInt(txtOrder.getText()));
			}
		});*/
		
		plusButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				trianglePanel.increaseOrder();
			}
		});
		
		minusButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				trianglePanel.decreaseOrder();
			}
		});

	}

}
