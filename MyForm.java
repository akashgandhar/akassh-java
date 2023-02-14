import java.awt.*;

import javax.swing.BoxLayout;

public class MyForm extends Frame {
    // constructor and other methods go here
    public MyForm() {
        setSize(300, 500);
        setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        MyForm form = new MyForm();
        form.setVisible(true);
        form.setBackground(Color.LIGHT_GRAY);
        // form.setForeground(Color.blue);
        form.setFont(new Font("Arial", Font.BOLD, 14));
        form.setBounds(100, 100, 300, 500);

        Label label = new Label("Static Form");
        label.setAlignment(1);

        TextField nameField = new TextField(20);
        TextField ageField = new TextField(3);
        Label nameLabel = new Label("Name: ");
        Label ageLabel = new Label("Age: ");
        TextField systemId = new TextField(20);
        Label systemIdLabel = new Label("SystemId: ");

        nameLabel.setForeground(Color.BLUE);
        ageLabel.setForeground(Color.BLUE);
        systemIdLabel.setForeground(Color.BLUE);

        nameField.setForeground(Color.black);
        ;

        CheckboxGroup group = new CheckboxGroup();
        Checkbox option1 = new Checkbox("Male", group, true);
        Checkbox option2 = new Checkbox("Female", group, false);
        Checkbox option3 = new Checkbox("Other", group, false);

        option1.setForeground(Color.BLUE);
        option2.setForeground(Color.BLUE);
        option3.setForeground(Color.BLUE);

        Choice select = new Choice();
        Label course = new Label("Course: ");
        course.setForeground(Color.BLUE);

        select.add("B.Tech");
        select.add("BBA");
        select.add("BCA");

        form.add(label);
        form.add(systemIdLabel);
        form.add(systemId);
        form.add(nameLabel);
        form.add(nameField);
        form.add(ageLabel);
        form.add(ageField);
        form.add(option1);
        form.add(option2);
        form.add(option3);
        form.add(course);
        form.add(select);

        Button button = new Button("Submit");
        form.add(button);

        // setLayout(new BoxLayout(form, BoxLayout.Y_AXIS));

        form.setLayout(new BoxLayout(form, BoxLayout.Y_AXIS));

        form.pack();

        // form.setLayout(new GridBagLayout());
        form.setResizable(false);

    }

}
