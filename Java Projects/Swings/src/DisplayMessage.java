import javax.swing.JOptionPane;
public class DisplayMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first_number=JOptionPane.showInputDialog("Enter first Integer : ");
		String second_number=JOptionPane.showInputDialog("Enter second Integer : ");
		int number1=Integer.parseInt(first_number);
		int number2=Integer.parseInt(second_number);
		int sum=number1+number2;
		JOptionPane.showMessageDialog(null,"The sum is "+sum,"sum of two integers",JOptionPane.PLAIN_MESSAGE);
	}
}


