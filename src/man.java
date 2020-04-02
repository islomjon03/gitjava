import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class man {
    public static void main(String[] args) {
        JFrame mainWindow = new JFrame();
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        int width = toolkit.getScreenSize().width;
        int height = toolkit.getScreenSize().height;

        mainWindow.setBounds(width/2-140,height/2-100,280,200);

        mainWindow.setTitle("Application");
        JPanel mainPanel = new JPanel(new FlowLayout(5));
        JPanel panel = new JPanel(new FlowLayout(10));
        JPanel panel2 = new JPanel(new GridLayout(4,4));

        mainPanel.add(panel);
        mainPanel.add(panel2);

        JTextField result = new JTextField(15);

        JButton btnPlus = new JButton("+");
        JButton btnMinus = new JButton("-");
        JButton btnUmnoj = new JButton("*");
        JButton btnDivorce = new JButton("/");
        JButton btnClear = new JButton("Clear");
        JButton btnOne = new JButton("1");
        JButton btnTwo = new JButton("2");
        JButton btnThree = new JButton("3");
        JButton btnFour = new JButton("4");
        JButton btnFive = new JButton("5");
        JButton btnSix = new JButton("6");
        JButton btnSeven = new JButton("7");
        JButton btnEight = new JButton("8");
        JButton btnNine = new JButton("9");
        JButton btnZero = new JButton("0");


        panel.add(result);
        panel2.add(btnOne);
        panel2.add(btnTwo);
        panel2.add(btnThree);
        panel2.add(btnPlus);
        panel2.add(btnFour);
        panel2.add(btnFive);
        panel2.add(btnSix);
        panel2.add(btnMinus);
        panel2.add(btnSeven);
        panel2.add(btnEight);
        panel2.add(btnNine);
        panel2.add(btnUmnoj);
        panel2.add(btnZero);
        panel2.add(btnClear);
        panel2.add(btnDivorce);

        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println((btnOne.getText()));
            }
        });

        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(btnTwo.getText());
            }
        });


        mainWindow.setContentPane(mainPanel);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        mainWindow.setVisible(true);

    }
        

}
