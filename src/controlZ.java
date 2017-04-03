import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class controlZ implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	Stack<Character> stack = new Stack<Character>();

	public static void main(String[] args) {
		controlZ a = new controlZ();
		a.go();
	}

	private void go() {
		frame.setSize(1920, 100);
		frame.setVisible(true);
		frame.addKeyListener(this);
		frame.add(panel);
		panel.add(label);
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		String text = label.getText();
		
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			if (text.length()>0) {
				stack.push(text.charAt(text.length() - 1));
				text = text.substring(0, text.length() - 1);
				label.setText(text);
			}
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT){
			Character add = stack.pop();
			label.setText(label.getText()+add);
		}
		else{
			label.setText(label.getText() + e.getKeyChar());
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}
