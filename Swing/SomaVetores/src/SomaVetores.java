import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SomaVetores extends JFrame{
    private JTextField txt1;
    private JPanel panel1;
    private JTextField txt2;
    private JButton btn;
    private JLabel result;

    public SomaVetores() {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txt1.getText());
                int n2 = Integer.parseInt(txt2.getText());
                int response = n1 + n2;
                result.setText(String.valueOf(response));

            }
        });
    }

    public static void main(String[] args) {
        SomaVetores somaVetores = new SomaVetores();
        somaVetores.setContentPane(somaVetores.panel1);
        somaVetores.setTitle("Soma de Vetores.");
        somaVetores.setVisible(true);
        somaVetores.setSize(500, 100);
        somaVetores.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
