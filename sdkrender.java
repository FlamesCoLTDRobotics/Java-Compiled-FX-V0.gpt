 
import javax.swing.*;
public class sdkrender {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setResizable(false);

        JLabel label = new JLabel("Hello World!", SwingConstants.CENTER);
        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);
        }

}