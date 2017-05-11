import java.awt.GridLayout;
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
	JPanel header = new JPanel();
	JPanel score = new JPanel();
	JPanel lives = new JPanel();
	Stack<String> newWords = new Stack<String>();
	ArrayList<JLabel> letters = new ArrayList<JLabel>();
	String word = "";
	boolean needWord = false;
	int completed = 0;
	int live = 9;
	JLabel labelh = new JLabel();
	JLabel labels = new JLabel();
	JLabel labell = new JLabel();

	public static void main(String[] args) {
		hangman a = new hangman();
		a.create();
	}

	private void create() {
		frame.setSize(500, 500);
		GridLayout grid = new GridLayout(4, 1);
		frame.setLayout(grid);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setTitle("Blythe's Hangman");
		frame.addKeyListener(this);
		pushingWords();
		System.out.println(newWords.size());
		addNewWord();
		frame.setVisible(true);
		frame.pack();
	}
	
	private void makePanel(){
		header();
		score();
		lives();
		frame.add(header);
		frame.add(score);
		frame.add(lives);
	}
	private void header(){
		labelh.setText("Blythe's Hangman! Guess the words by typing characters!");
		header.add(labelh);
	}
	private void score(){
		labels.setText("You have completed " + completed +" words!");
		score.add(labels);
	}
	private void lives(){
		labell.setText("You have " + live +" lives left!");
		lives.add(labell);
	}

	private void addNewWord() {
		frame.remove(panel);
		letters.clear();
		if (newWords.isEmpty()) {
			JOptionPane.showMessageDialog(null, "You completed " + completed + " words!");
			System.exit(0);
		} else {
			panel = new JPanel();
			frame.add(panel);
			makePanel();
			word = newWords.pop();
			for (int i = 0; i < word.length(); i++) {
				letters.add(new JLabel("_"));
				for (JLabel text : letters) {
					panel.add(text);
				}
			}
		}
	}

	private void pushingWords() {
		newWords.push("teacher");
		newWords.push("life");
		newWords.push("water bottle");
		newWords.push("trash");
		newWords.push("name");
		newWords.push("instrument");
		newWords.push("happy");
	}

	public void keyTyped(KeyEvent e) {
		boolean found = false;
		boolean underscore = false;
		for (int i = 0; i < word.length(); i++) {
			if (e.getKeyChar() == word.charAt(i)) {
				letters.get(i).setText("" + e.getKeyChar());
				found = true;
			}
		}
		if (found) {
			for (JLabel text : letters) {
				if (text.getText().equals("_")) {
					underscore = true;
				}
			}
			if (!underscore) {
				needWord = true;
				System.out.println("word completed");
				completed = completed+1;
				score();
				addNewWord();
			} else {
				needWord = false;
			}
		} else {
			System.out.println("wrong letter");
			live = live-1;
			lives();
			if(live==0){
				addNewWord();
				live=9;
			}
		}
	}

	public void keyPressed(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}
}
