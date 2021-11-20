import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        int height = Integer.parseInt(JOptionPane.showInputDialog(null, "How tall are you? (In cm)", "Height Checker", JOptionPane.INFORMATION_MESSAGE));
        JOptionPane.showMessageDialog(null, "You are "+height+" cm tall, thank me later.");
    }
}
