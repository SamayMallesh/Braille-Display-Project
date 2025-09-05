import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayController {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Braille Display");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea inputText = new JTextArea(5, 40);
        JButton convertBtn = new JButton("Convert to Braille");
        JTextArea outputText = new JTextArea(5, 40);
        outputText.setEditable(false);

        convertBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputText.getText();
                String braille = BrailleConverter.convertToBraille(input);
                outputText.setText(braille);
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JScrollPane(inputText));
        panel.add(convertBtn);
        panel.add(new JScrollPane(outputText));

        frame.add(panel);
        frame.setVisible(true);
    }
}
