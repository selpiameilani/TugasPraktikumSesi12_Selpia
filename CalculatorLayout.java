package prkatikum12_selpia;

import javax.swing.*;
import java.awt.*;

public class CalculatorLayout {
    public static void main(String[] args) {
        // Create a new JFrame for the calculator
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel for the calculator
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Create a panel for the display
        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new FlowLayout());
        JLabel displayLabel = new JLabel("0");
        displayLabel.setFont(new Font("Arial", Font.BOLD, 24));
        displayPanel.add(displayLabel);

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 6));

        // Create the buttons
        String[] buttonLabels = {
            "1", "2", "3", "4","5","6",
            "7", "8", "9", "0","+","-",
            "*", "/", "=", "%","Mod","Exit",
        };
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            buttonPanel.add(button);
        }

        // Add the panels to the frame
        panel.add(displayPanel, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.CENTER);
        frame.getContentPane().add(panel);

        // Set the size of the frame and show it
        frame.setSize(200, 250);
        frame.setVisible(true);
    }
}