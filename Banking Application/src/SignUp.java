import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class SignUp {

    private static JFrame frameS;
    private static JPanel panel;
    private static JLabel firstName;
    private static JLabel lastName;
    public static JTextField enterFirst;
    private static JTextField enterLast;
    private static JLabel customerPin;
    private static JPasswordField enterPin;
    private static JButton create;
    private static JLabel success;
   // private String first;





    public SignUp() {


        panel = new JPanel();

        frameS  = new JFrame("SignUp");
        frameS.setSize(300,300);
        frameS.add(panel);
        frameS.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        firstName = new JLabel("First Name");
        firstName.setBounds(10,20,80,25);
        panel.add(firstName);

        enterFirst = new JTextField();
        enterFirst.setBounds(100,20,165,25);
        //enterFirst.setText(enterFirst.getText());
        //enterFirst.addActionListener(new setFirst());
        panel.add(enterFirst);

        lastName = new JLabel("Last Name");
        lastName.setBounds(10,50,80,25);
        panel.add(lastName);

        enterLast = new JTextField();
        enterLast.setBounds(100,50,165,25);
        panel.add(enterLast);

        customerPin = new JLabel("Create Pin");
        customerPin.setBounds(10,80,80,25);
        panel.add(customerPin);

        enterPin = new JPasswordField();
        enterPin.setBounds(100,80,80,25);
        panel.add(enterPin);

        create = new JButton("Create");
        create.setBounds(10,110,75,25);
        create.addActionListener(new openLogin());
        panel.add(create);

        success = new JLabel();
        success.setBounds(10,140,100,25);
        panel.add(success);


        panel.setLayout(null);
        frameS.setVisible(true);


    }


    private class openLogin extends Login implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frameS.dispose();
            welcome.setText("Welcome, " + enterFirst.getText() + " " + enterLast.getText() + "!");




        }
    }

    public class setFirst implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String x = enterFirst.getText();
        }
    }

    public static void main(String[] args) {

        new SignUp();


    }

    }

