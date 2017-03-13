import javax.swing.JOptionPane;

public class introtoarrays {
	public static void main(String[] args) {
		int myArray[] = new int[3];
		String a = JOptionPane.showInputDialog("Enter a number");
		String b = JOptionPane.showInputDialog("Enter a number");
		String c = JOptionPane.showInputDialog("Enter a number");
		
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		int c1 = Integer.parseInt(c);
		
		myArray[0]=a1;
		myArray[1]=b1;
		myArray[2]=c1;
		
		if(a1>b1 && b1>c1){
			System.out.println(c1);
			System.out.println(b1);
			System.out.println(a1);
		}
		
		if(a1>c1 && c1>b1){
			System.out.println(b1);
			System.out.println(c1);
			System.out.println(a1);
		}
		
		if(b1>a1 && a1>c1){
			System.out.println(c1);
			System.out.println(a1);
			System.out.println(b1);
		}
		
		if(b1>c1 && c1>a1){
			System.out.println(a1);
			System.out.println(c1);
			System.out.println(b1);
		}
		
		if(c1>a1 && a1>b1){
			System.out.println(b1);
			System.out.println(a1);
			System.out.println(c1);
		}
		
		if(c1>b1 && b1>a1){
			System.out.println(a1);
			System.out.println(b1);
			System.out.println(c1);
		}

	}
}
