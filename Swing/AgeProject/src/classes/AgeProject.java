package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

public class AgeProject extends JFrame{
    private JButton btn;
    private JPanel panel;
    private JSpinner input;
    private JLabel age;

    public AgeProject () {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                int year = calendar.get(Calendar.YEAR);
                int born = (int) input.getValue();
                int birth = year - born;
                System.out.println(birth);
                age.setText(String.valueOf(birth));
            }
        });
    }

    public static void main(String[] args) {
        AgeProject ageProject = new AgeProject();
        ageProject.setContentPane(ageProject.panel);
        ageProject.setTitle("Quantos anos você tem?");
        ageProject.setSize(400, 200);
        ageProject.setVisible(true);
        ageProject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
