import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class FileSaverUI extends JFrame implements ActionListener {
    JTextField fileNameField;
    JTextArea textArea;
    JButton saveButton;
    JLabel statusLabel;
    FileSaverUI() {
        setTitle("File Saver");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // File Name Field
        JLabel fileLabel = new JLabel("File Name:");
        fileLabel.setBounds(20, 20, 100, 25);
        add(fileLabel);
        fileNameField = new JTextField();
        fileNameField.setBounds(120, 20, 200, 25);
        add(fileNameField);
        // Text Area
        JLabel textLabel = new JLabel("Enter Text:");
        textLabel.setBounds(20, 60, 100, 25);
        add(textLabel);
        textArea = new JTextArea();
        JScrollPane scroll = new JScrollPane(textArea);
        scroll.setBounds(120, 60, 200, 100);
        add(scroll);
        // Save Button
        saveButton = new JButton("Save");
        saveButton.setBounds(150, 170, 80, 30);
        add(saveButton);
        // Status Label
        statusLabel = new JLabel("");
        statusLabel.setBounds(50, 210, 300, 25);
        add(statusLabel);
        saveButton.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String fileName = fileNameField.getText();
        String content = textArea.getText();

        if (fileName.isEmpty()) {
            statusLabel.setText("Enter file name!");
            return;
        }
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            statusLabel.setText("File saved successfully!");
        } catch (IOException ex) {
            statusLabel.setText("Error saving file!");
        }
    }
    public static void main(String[] args) {
        new FileSaverUI();
    }
}