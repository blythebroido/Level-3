import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton entry = new JButton();
	JButton search = new JButton();
	JButton list = new JButton();
	JButton remove = new JButton();

	HashMap<Integer, String> map = new HashMap<Integer, String>();

	public static void main(String[] args) {
		LogSearch a = new LogSearch();
		a.go();
	}

	void go() {
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.add(panel);
		panel.add(entry);
		panel.add(search);
		panel.add(list);
		panel.add(remove);
		entry.addActionListener(this);
		search.addActionListener(this);
		list.addActionListener(this);
		remove.addActionListener(this);
		
		entry.setText("Enter Name");
		search.setText("Search by I.D.");
		list.setText("View List");
		remove.setText("Remove");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==entry){
			String number1 = JOptionPane.showInputDialog("Enter an I.D. number");
			int id1 = Integer.parseInt(number1);
			String name1 = JOptionPane.showInputDialog("Enter a name");
			
			map.put(id1, name1);
		}
		if(e.getSource()==search){
			String search1 = JOptionPane.showInputDialog("Enter an I.D. number to search");
			int searching = Integer.parseInt(search1);
			String searchresult = map.get(searching);
			if(map.containsKey(searching)){
				JOptionPane.showMessageDialog(null, searchresult);
			}
			else{
				JOptionPane.showMessageDialog(null, "There is nobody with that I.D. number");
			}
		}
		
		if(e.getSource()==list){
			
			String finalList = "";
			for(Integer i: map.keySet()){
				finalList += "ID: " + i + "  Name: " + map.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, finalList);
		}
		
		if(e.getSource()==remove){
			String number = JOptionPane.showInputDialog("Enter an I.D. number to remove");
			int removed = Integer.parseInt(number);
			if(map.containsKey(removed)){
			map.remove(removed);
			}
			else{
				JOptionPane.showMessageDialog(null, "That I.D. number is not in this list");
			}
		}
	}

}