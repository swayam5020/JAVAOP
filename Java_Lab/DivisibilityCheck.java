import javax.swing.*;
import java.awt.event.*;

public class DivisibilityCheck extends JFrame implements ActionListener {

    JTextField textField;
    JButton button;
    JLabel resultLabel;

    DivisibilityCheck() {
        // Frame setup
        setTitle("Divisibility Checker");
        setSize(400, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Text Field
        textField = new JTextField();
        textField.setBounds(100, 30, 200, 30);
        add(textField);
        // Button
        button = new JButton("Check");
        button.setBounds(150, 70, 100, 30);
        add(button);
        // Label
        resultLabel = new JLabel("");
        resultLabel.setBounds(50, 110, 300, 30);
        add(resultLabel);
        // Button Action
        button.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(textField.getText());

            if (num % 7 == 0 && num % 9 == 0) {
                resultLabel.setText("Divisible by both 7 and 9");
            } else {
                resultLabel.setText("Not divisible by both 7 and 9");
            }

        } catch (NumberFormatException ex) {
            resultLabel.setText("Enter a valid integer!");
        }
    }

    public static void main(String[] args) {
        new DivisibilityCheck();
    }
}
