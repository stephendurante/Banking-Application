import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends Menu {

    public static JFrame frameL;
    private static JPanel panelL;
    private static JLabel insertCard;
    public static JLabel welcome;
    private static JLabel customerPin;
    private static JTextField enterFirst1;
    private static JPasswordField enterPin;
    private static JButton next;
    Font tr = new Font("times new roman",Font.ITALIC, 14);



    public Login() {

        panelL = new JPanel();
        panelL.setLayout(null);

        frameL = new JFrame("Login" );
        frameL.setSize(300,300);
        frameL.add(panelL);
        frameL.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        insertCard = new JLabel("Insert Card...");
        insertCard.setHorizontalAlignment(JLabel.CENTER);
        insertCard.setVerticalAlignment(JLabel.TOP);
        insertCard.setSize(100,25);
        insertCard.setFont(tr);
        panelL.add(insertCard);

        welcome = new JLabel("Welcome,");
        welcome.setBounds(10,30,200,25);
        panelL.add(welcome);


        customerPin = new JLabel("Enter Pin");
        customerPin.setBounds(10,55,80,25);
        panelL.add(customerPin);

        enterPin = new JPasswordField();
        enterPin.setBounds(100,55,80,25);
        panelL.add(enterPin);

        next = new JButton("Login");
        next.setBounds(15,85,75,25);
        next.addActionListener(new closeLogin());
        panelL.add(next);


        frameL.setVisible(true);



    }

    private class closeLogin implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frameL.dispose();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
