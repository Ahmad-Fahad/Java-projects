import javax.swing.JOptionPane;
public class print_name {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=JOptionPane.showInputDialog("Enter your name : ");
		JOptionPane.showMessageDialog(null, "Your name is "+name,"Now we know your name",JOptionPane.INFORMATION_MESSAGE);
	}

}
