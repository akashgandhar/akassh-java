import java.sql.*;
import javax.swing.*;

public class EmployeeForm extends JFrame {
    // Labels
    private JLabel nameLabel = new JLabel("Name:");
    private JLabel idLabel = new JLabel("Employee ID:");
    private JLabel positionLabel = new JLabel("Position:");

    // Text fields
    private JTextField nameField = new JTextField(20);
    private JTextField idField = new JTextField(20);
    private JTextField positionField = new JTextField(20);

    // Submit button
    private JButton submitButton = new JButton("Submit");
    private JButton showButton = new JButton("List Employees");

    public EmployeeForm() {
        // Set frame properties
        setTitle("Employee Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Create form panel
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));

        // Add components to form panel
        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(idLabel);
        formPanel.add(idField);
        formPanel.add(positionLabel);
        formPanel.add(positionField);

        // Add submit button
        formPanel.add(submitButton);
        formPanel.add(showButton);

        // Add form panel to frame
        add(formPanel);

        // Add action listener to submit button
        submitButton.addActionListener(e -> {
            // Get values from text fields and save to variables
            String employeeName = nameField.getText();
            String employeeID = idField.getText();
            String employeePosition = positionField.getText();

            // Connect to database and insert employee data
            try {
                // Load JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Establish database connection
                String url = "jdbc:mysql://localhost:3306/employees";
                String username = "root";
                String password = "root";
                Connection conn = DriverManager.getConnection(url, username, password);

                // Create SQL statement and execute insert
                String sql = "INSERT INTO employee (name, id_number, position) VALUES (?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, employeeName);
                stmt.setString(2, employeeID);
                stmt.setString(3, employeePosition);
                stmt.executeUpdate();

                // Close statement and connection
                stmt.close();
                conn.close();

                // Show success message
                JOptionPane.showMessageDialog(this, "Employee data saved successfully.");
            } catch (Exception ex) {
                // Show error message
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        showButton.addActionListener(e -> {
            try {
                // Load JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Establish database connection
                String url = "jdbc:mysql://localhost:3306/employees";
                String username = "root";
                String password = "root";
                Connection conn = DriverManager.getConnection(url, username, password);

                // Create SQL statement and execute query
                String sql = "SELECT name, id_number, position FROM employee";
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();

                // Display employee data in a dialog box
                JTextArea textArea = new JTextArea();
                while (rs.next()) {
                    textArea.append("Name: " + rs.getString("name") + "\n");
                    textArea.append("Employee ID: " + rs.getString("id_number") + "\n");
                    textArea.append("Position: " + rs.getString("position") + "\n\n");
                }
                JOptionPane.showMessageDialog(this, new JScrollPane(textArea), "List Employees",
                        JOptionPane.PLAIN_MESSAGE);

                // Close result set, statement, and connection
                rs.close();
                stmt.close();
                conn.close();
            } catch (Exception ex) {
                // Show error message
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Show frame
        setVisible(true);
    }

    public static void main(String[] args) {
        new EmployeeForm();
    }
}
