import javax.swing.JFrame;
import javax.swing.UIManager;

public class SwingExample {
  public static void main(String[] args) {
    JFrame aWindow = new JFrame(" Window Title");
    aWindow.setSize( 100, 300);
    aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    aWindow.setVisible(true);
  }
}