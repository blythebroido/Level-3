import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SantaList implements MouseListener {
	JFrame frame = new JFrame();
	ArrayList<JLabel> photos = new ArrayList<JLabel>();
	JLabel label = new JLabel();
	
	public static void main(String[] args) {
		SantaList a = new SantaList();
		a.go();
	}

	public void go() {
		frame.setSize(1000, 1000);
		frame.addMouseListener(this);
		frame.add(label);
		
		JLabel unicorn = loadImageFromTheInternet("http://2.bp.blogspot.com/-RZSaLDdBuTk/T2OP-w4P15I/AAAAAAAABcU/N6ILTDOiyq8/s1600/Dorky%2BDino%2B2.jpg");
		photos.add(unicorn);
		JLabel cat = loadImageFromTheInternet("http://netstorage.discovery.com/feeds/brightcove/asset-stills/apl/124161359038512825301401197_FAT_CAT.jpg");
		photos.add(cat);
		JLabel dolphin = loadImageFromTheInternet("http://cdn.xl.thumbs.canstockphoto.com/canstock8587035.jpg");
		photos.add(dolphin);
		JLabel horse = loadImageFromTheInternet("http://www.homestead.com/~media/elements/Clipart/animals/horse.jpg");
		photos.add(horse);
		
		random();
	}
	public void random(){
		Random rand = new Random();
		int a = rand.nextInt(4);
		System.out.println(a);
		label.setIcon(photos.get(a).getIcon());
		frame.repaint();
		frame.setVisible(true);
		frame.pack();
	}

	private JLabel loadImageFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			return new JLabel(icon);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void mouseClicked(MouseEvent e) {
		random();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}