import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BubbleSort extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BubbleSort frame = new BubbleSort();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BubbleSort() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 344);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("SORTING\r\n");
		heading.setForeground(new Color(255, 0, 0));
		heading.setFont(new Font("Colonna MT", Font.BOLD, 22));
		heading.setBounds(198, 18, 98, 24);
		contentPane.add(heading);
		
		JLabel la = new JLabel("ENTER NUMBERS FOR SORTING");
		la.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		la.setBounds(29, 70, 192, 20);
		contentPane.add(la);
		
		JTextArea ta1 = new JTextArea();
		ta1.setColumns(5);
		ta1.setBounds(242, 67, 192, 22);
		contentPane.add(ta1);
		
		JLabel lb2 = new JLabel("NUMBERS AFTER SORTING");
		lb2.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		lb2.setBounds(29, 130, 166, 20);
		contentPane.add(lb2);
		
		JTextArea ta2 = new JTextArea();
		ta2.setColumns(5);
		ta2.setBounds(242, 127, 192, 22);
		contentPane.add(ta2);
		
		JButton sort = new JButton("BUBBLE SORT\r\n");
		sort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//logic of sorting the contents
			String sentence = ta1.getText();
			String arr[] = sentence.split(" ");
			String help;
			
			for (int i = 0; i <= arr.length-2; i++)
			{
				for (int j = 0; j <= arr.length-2; j++)
				{
					if(Integer.valueOf(arr[j]) > Integer.valueOf(arr[j+1]))
					{
						help = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = help;
					}
				}
			}
			String result = "";
			for(int i = 0; i<=arr.length-1; i++)
			{
				result = result+arr[i] + " ";
			}
			ta2.setText(result);
			}
			
		});
		sort.setForeground(new Color(0, 128, 128));
		sort.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		sort.setBounds(147, 200, 149, 27);
		contentPane.add(sort);
	}
}
