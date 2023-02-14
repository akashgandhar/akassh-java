import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Form {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Form");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(350, 600);
    frame.setLayout(null);
    frame.setResizable(false);

    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenuItem exitMenuItem = new JMenuItem("Exit");
    exitMenuItem.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
    fileMenu.add(exitMenuItem);
    menuBar.add(fileMenu);
    frame.setJMenuBar(menuBar);

    JLabel heading = new JLabel("Form");
    heading.setBounds(150, 10,
        100, 20);
    heading.setFont(new Font("Arial", Font.BOLD, 26));
    frame.add(heading);

    JLabel firstNameLabel = new JLabel("First Name:");
    firstNameLabel.setBounds(10, 50, 100, 25);
    frame.add(firstNameLabel);

    JTextField firstNameInput = new JTextField();
    firstNameInput.setBounds(120, 50, 150, 25);
    frame.add(firstNameInput);

    JLabel lastNameLabel = new JLabel("Last Name:");
    lastNameLabel.setBounds(10, 90, 100, 25);
    frame.add(lastNameLabel);

    JTextField lastNameInput = new JTextField();
    lastNameInput.setBounds(120, 90, 150, 25);
    frame.add(lastNameInput);

    JLabel genderLabel = new JLabel("Gender:");
    genderLabel.setBounds(10, 130, 100, 25);
    frame.add(genderLabel);

    ButtonGroup genderGroup = new ButtonGroup();
    JRadioButton maleRadioButton = new JRadioButton("Male");
    maleRadioButton.setBounds(120, 130, 60, 25);
    frame.add(maleRadioButton);
    genderGroup.add(maleRadioButton);

    JRadioButton femaleRadioButton = new JRadioButton("Female");
    femaleRadioButton.setBounds(186, 130, 80, 25);
    frame.add(femaleRadioButton);
    genderGroup.add(femaleRadioButton);

    JLabel addressLabel = new JLabel("Address:");
    addressLabel.setBounds(10, 170, 100, 25);
    frame.add(addressLabel);

    JTextArea addressInput = new JTextArea();
    addressInput.setLineWrap(true);
    JScrollPane addressScroll = new JScrollPane(addressInput);
    addressScroll.setBounds(120, 170, 150, 75);
    frame.add(addressScroll);

    JLabel courseLabel = new JLabel("Course:");
    courseLabel.setBounds(10, 260, 100, 25);
    frame.add(courseLabel);

    ButtonGroup courseGroup = new ButtonGroup();
    JRadioButton course1 = new JRadioButton("B.Tech");
    JRadioButton course2 = new JRadioButton("BBA");
    JRadioButton course3 = new JRadioButton("BCA");
    JRadioButton course4 = new JRadioButton("Other");

    courseGroup.add(course1);
    courseGroup.add(course2);
    courseGroup.add(course3);
    courseGroup.add(course4);
    course1.setBounds(120, 260, 85, 25);
    course2.setBounds(205, 260, 85, 25);
    course3.setBounds(120, 285, 85, 25);
    course4.setBounds(205, 285, 85, 25);
    course1.setCursor(new Cursor(12));
    course2.setCursor(new Cursor(12));
    course3.setCursor(new Cursor(12));
    course4.setCursor(new Cursor(12));
    frame.add(course1);
    frame.add(course2);
    frame.add(course3);
    frame.add(course4);

    JLabel optionsLabel = new JLabel("Opt-For:");
    optionsLabel.setBounds(10, 360, 100, 25);
    frame.add(optionsLabel);

    JCheckBox option1 = new JCheckBox("Option 1");
    JCheckBox option2 = new JCheckBox("Option 2");
    JCheckBox option3 = new JCheckBox("Option 3");
    JCheckBox option4 = new JCheckBox("Option 4");
    JCheckBox option5 = new JCheckBox("Option 5");
    JCheckBox option6 = new JCheckBox("Option 6");
    JCheckBox option7 = new JCheckBox("Option 7");
    JCheckBox option8 = new JCheckBox("Option 8");
    option1.setBounds(120, 360, 85, 25);
    option2.setBounds(205, 360, 85, 25);
    option3.setBounds(120, 385, 85, 25);
    option4.setBounds(205, 385, 85, 25);
    option5.setBounds(120, 410, 85, 25);
    option6.setBounds(205, 410, 85, 25);
    option7.setBounds(120, 435, 85, 25);
    option8.setBounds(205, 435, 85, 25);
    option1.setCursor(new Cursor(12));
    option2.setCursor(new Cursor(12));
    option3.setCursor(new Cursor(12));
    option4.setCursor(new Cursor(12));
    option5.setCursor(new Cursor(12));
    option6.setCursor(new Cursor(12));
    option7.setCursor(new Cursor(12));
    option8.setCursor(new Cursor(12));
    frame.add(option1);
    frame.add(option2);
    frame.add(option3);
    frame.add(option4);
    frame.add(option5);
    frame.add(option6);
    frame.add(option7);
    frame.add(option8);

    // JButton submitButton = new JButton("Submit");
    // submitButton.setBounds(120, 500, 100, 25);
    // submitButton.setBackground(Color.cyan);
    // submitButton.setForeground(Color.BLACK);
    // submitButton.setCursor(new Cursor(12));
    // submitButton.setFont(new Font("Arial", Font.BOLD, 14));
    // frame.add(submitButton);

    JButton submitButton = new JButton("Submit");
    submitButton.setBounds(150, 500, 100, 25);
    submitButton.setBackground(Color.BLUE);
    submitButton.setForeground(Color.WHITE);
    submitButton.setFont(new Font("Arial", Font.BOLD, 14));
    submitButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // code to be executed when button is clicked
      }
    });
    submitButton.addKeyListener(new KeyListener() {
      @Override
      public void keyTyped(KeyEvent e) {
        // code to be executed when a key is typed
      }

      @Override
      public void keyPressed(KeyEvent e) {
        submitButton.setBackground(Color.CYAN);
      }

      @Override
      public void keyReleased(KeyEvent e) {
        // code to be executed when a key is released
      }
    });
    frame.add(submitButton);
    // Add components here

    frame.setVisible(true);
  }
}
