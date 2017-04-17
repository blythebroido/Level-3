import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class RosettaStone implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	
	HashMap<String, String> dictionary = new HashMap<String, String>();
	
	public static void main(String[] args) {
		RosettaStone a = new RosettaStone();
		a.go();
	}
	
	void go(){
		frame.setVisible(true);
		frame.setSize(200, 60);
		frame.add(panel);
		panel.add(button);
		button.addActionListener(this);
		
		dictionary.put("comida", "food");
		dictionary.put("fruta", "fruit");
		dictionary.put("dinero", "money");
		dictionary.put("familia", "family");
		dictionary.put("ayuda", "help");
		dictionary.put("ropa", "clothing");
		dictionary.put("por favor", "please");
		dictionary.put("casa", "house");
		dictionary.put("de nada", "you're welcome");
		dictionary.put("escuela", "school");
		dictionary.put("hola", "hello");
		dictionary.put("adios", "goodbye");
		dictionary.put("papel", "paper");
		dictionary.put("sombrero", "hat");
		dictionary.put("zapatos", "shoes");
		
		button.setText(""+dictionary.keySet().toArray()[4]);
		
	}
	
	String getRandomKey(HashMap<String, String> map) {
		String[] keysAsArray = map.keySet().toArray(new String[0]);
		int randomness = new Random().nextInt(map.size());
		return keysAsArray[randomness];
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, dictionary.get(button.getText()));
		button.setText(getRandomKey(dictionary));
	}
}
