import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class arrayList5 implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();

	ArrayList<String> b = new ArrayList<String>();

	public static void main(String[] args) {
		arrayList5 a = new arrayList5();
		a.go();
	}

	void go() {
		frame.setVisible(true);
		frame.setSize(300, 60);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		button1.setText("add");
		button2.setText("view");
		button3.setText("delete");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			String adding = JOptionPane.showInputDialog("Add Name");
			b.add(adding);
		}
		if (e.getSource() == button2) {
			for (String s : b) {
				JOptionPane.showMessageDialog(null, s);
			}
		}
		if(e.getSource() == button3){
			String deleting = JOptionPane.showInputDialog("Delete");
			if(b.contains(deleting)){
				b.remove(deleting);
			}
		}
	}
}
