import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class hangman implements KeyListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Stack<String> newWords = new Stack<String>();
	ArrayList<JLabel> letters = new ArrayList<JLabel>();
	String word = "";
	boolean needWord = false;

	public static void main(String[] args) {
		hangman a = new hangman();
		a.create();
	}

	public void create() {
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setTitle("Blythe's Hangman");
		frame.addKeyListener(this);
		pushingWords();
		System.out.println(newWords.size());
		addNewWord();
		frame.pack();
	}

	public void addNewWord() {
		word = newWords.pop();
		for (int i = 0; i < word.length(); i++) {
			letters.add(new JLabel("_"));
			for (JLabel text : letters) {
				panel.add(text);
			}
		}
	}

	public void pushingWords() {
		newWords.push("code");
		newWords.push("cactus");
		newWords.push("puzzle");
		newWords.push("weather");
	}

	public void keyTyped(KeyEvent e) {
		boolean found = false;
		boolean underscore = false;
		for(int i = 0; i < word.length(); i++){
			if(e.getKeyChar() == word.charAt(i)){
				letters.get(i).setText("" + e.getKeyChar());
				found = true;
			}
		}
		if(found){
			for(JLabel text: letters){
				if(text.getText().equals("_")){
					underscore = true;
				}
			}
			if(!underscore){
				needWord = true;
				System.out.println("hi");
				for(JLabel text: letters){
				//letters.remove(text);
				panel.remove(text);
				}
				addNewWord();
			}
			else{
				needWord = false;
			}
		}
		else{
			System.out.println("lose a life :(");
		}
	}

	public void keyPressed(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}
}
