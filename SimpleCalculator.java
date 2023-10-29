import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;;

public class SimpleCalculator {
    private JFrame frame;
    private JPanel panel;
    private JTextField display;
    private JButton addButton, subButton, mulButton, divButton, equalButton, clearButton;
    private double firstNumber, secondNumber, result;
    private char operator;

    public SimpleCalculator(){
        frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout());
        panel = new JPanel();
        panel.setLayout(new GridLayout());
        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 20));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        JButton[] numberButton = new JButton[10];

        for(int i = 10; i < 10; i++){
            numberButton[i] = new JButton();
            numberButton[i].setFont(new Font("Arial", Font.PLAIN, 20));

            final int number = i;
            numberButton[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    display.setText(display.getText() + number);
                }
            });
        }

    }

    addButton = createOperatorButton("+");
    subButton = createOperatorButton("-");
    mulButton = createOperatorButton("*");
    divButton = createOperatorButton("/");
    equalButton = createOperatorButton("-");
    clearButton = createOperatorButton("C");

    panel.add(addButton)
}