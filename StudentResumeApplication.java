import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentResumeApplication extends JFrame implements ActionListener {
    private JTextField nameField, emailField;
    private JTextArea addressArea, experienceArea;
    private JComboBox<String> educationCombo;
    private JButton submitButton;

    public StudentResumeApplication() {
        setTitle("Student Resume Application");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));  // Adjust the layout to allow for all components
        JLabel nameLabel = new JLabel("Name");
        nameField = new JTextField(20); // Specify the column width
        JLabel emailLabel = new JLabel("Email");
        emailField = new JTextField(20); // Specify the column width
        JLabel addressLabel = new JLabel("Address");
        addressArea = new JTextArea(4, 20);
        addressArea.setWrapStyleWord(true);
        addressArea.setLineWrap(true);
        JScrollPane addressScrollPane = new JScrollPane(addressArea);
        JLabel educationLabel = new JLabel("Education");
        String[] educationLevels = {"High School", "Bachelor's Degree", "Master's Degree", "Ph.D"};
        educationCombo = new JComboBox<>(educationLevels);

        JLabel experienceLabel = new JLabel("Work Experience"); // Correct the label name
        experienceArea = new JTextArea(4, 20);
        experienceArea.setWrapStyleWord(true);
        experienceArea.setLineWrap(true);
        JScrollPane experienceScrollPane = new JScrollPane(experienceArea);

        submitButton = new JButton("Submit"); // Remove the JButton type declaration
        submitButton.addActionListener(this);

        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(addressLabel);
        add(addressScrollPane);
        add(educationLabel);
        add(educationCombo);
        add(experienceLabel); // Correct the label name
        add(experienceScrollPane);
        add(submitButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentResumeApplication()); // Use a lambda expression
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String email = emailField.getText();
            String address = addressArea.getText();
            String education = (String) educationCombo.getSelectedItem();
            String experience = experienceArea.getText();
            String resume = "Name: " + name + "\n Address: " + address + "\n Education: " + education + "\n Work Experience: " + experience;
            JOptionPane.showMessageDialog(this, "Resume Submitted\n\n" + resume, "Submission Successful", JOptionPane.INFORMATION_MESSAGE); // Correct the dialog message

            nameField.setText("");
            emailField.setText("");
            addressArea.setText("");
            educationCombo.setSelectedIndex(0); // Use setSelectedIndex
            experienceArea.setText("");
        }
    }
}
