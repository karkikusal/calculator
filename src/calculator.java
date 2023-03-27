import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator implements ActionListener {
    JFrame frame = new JFrame();

    JButton add = new JButton("Add");
    JButton subtract = new JButton("Subtract");

    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();

    void renderform() {
        t1.setBounds(10, 10, 200, 50);
        t2.setBounds(10, 50, 200, 50);
        t3.setBounds(10, 100, 200, 50);

        frame.add(t1);
        frame.add(t2);
        frame.add(t3);

        add.setBounds(10, 150, 100, 30);
        subtract.setBounds(120, 150, 100, 30);


        add.addActionListener(this);
        subtract.addActionListener(this);
        add.setFocusable(false);
        subtract.setFocusable(false);

        frame.add(add);
        frame.add(subtract);

    }

    void render() {
        renderform();
        frame.setSize(500, 250);
        frame.setLayout(null);
        frame.setTitle("Calculator");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int sum = num1 + num2;
            t3.setText(String.valueOf(sum));
        } else if (e.getSource() == subtract) {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int difference = num1 - num2;
            t3.setText(String.valueOf(difference));
        }
    }
}
