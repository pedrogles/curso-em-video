import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Helloswing extends JFrame{
    private JTextField txt;
    private JButton btn;
    private JLabel label;
    private JPanel panel;

    public Helloswing() {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btn, "Hello, " + txt.getText());
            }
        });
    }

    public static void main(String[] args) {
        Helloswing helloSwing = new Helloswing();
        helloSwing.setContentPane(helloSwing.panel);
        helloSwing.setTitle("Hello");
        helloSwing.setSize(300, 100);
        helloSwing.setVisible(true);
        helloSwing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
