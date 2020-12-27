import javax.swing.*;

public class Menu {
    public static JFrame frameM;
    private static JPanel panelM;
    private static JLabel pickOption;
    private static JButton balance;
    private static JButton deposit;
    private static JButton withdraw;
    private static JButton prevTrans;
    private static JButton Exit;



    public Menu() {

        panelM = new JPanel();
        panelM.setLayout(null);

        frameM = new JFrame("Menu");
        frameM.setSize(300,300);
        frameM.add(panelM);
        frameM.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        pickOption = new JLabel("Select an Option");
        pickOption.setSize(300,25);
        pickOption.setBounds(5,3,165,25);
        panelM.add(pickOption);

        balance = new JButton("A. Balance");
        balance.setHorizontalAlignment(SwingConstants.LEADING);
        balance.setBounds(5,30,100,25);
        panelM.add(balance);

        deposit = new JButton("B. Deposit");
        deposit.setHorizontalAlignment(SwingConstants.LEADING);
        deposit.setBounds(5,60,100,25);
        panelM.add(deposit);

        withdraw = new JButton("C. Withdraw");
        withdraw.setHorizontalAlignment(SwingConstants.LEADING);
        withdraw.setBounds(5,90,100,25);
        panelM.add(withdraw);

        prevTrans = new JButton("D. Previous Transaction");
        prevTrans.setHorizontalAlignment(SwingConstants.LEADING);
        prevTrans.setBounds(5,120,165,25);
        panelM.add(prevTrans);

        Exit = new JButton("E. Exit");
        Exit.setHorizontalAlignment(SwingConstants.LEADING);
        Exit.setBounds(5,150,100,25);
        panelM.add(Exit);

        frameM.setVisible(true);


    }


    public static void main(String[] args) {
        new Menu();
    }
}
