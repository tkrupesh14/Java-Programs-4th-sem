import javax.swing.*;
import java.awt.*;

/* <Applet code="Pro15" width="400" height="500"></Applet> */

public class Pro15 extends JApplet{
    Container con;
    JPanel pan1, pan2;
    JLabel lab1, lab2, lab3,lab4,lab5;
    JTextField txt1, txt2,txt3;
    JPasswordField pas1;
    JRadioButton rd1,rd2;
    ButtonGroup bg1;
    JButton btn1;
    
    public void init() {
        con = getContentPane();
        con.setLayout(new BorderLayout());

        pan1 = new JPanel();
        pan1.setLayout(new GridLayout(5,2));

        lab1 = new JLabel("Name");
        pan1.add(lab1);
        txt1 = new JTextField(10);
        pan1.add(txt1);

        lab2 = new JLabel("Email");
        pan1.add(lab2);
        txt2 = new JTextField(10);
        pan1.add(txt2);

        lab3 = new JLabel("Password");
        pan1.add(lab3);
        pas1 = new JPasswordField(10);
        pan1.add(pas1);

        lab4 = new JLabel("Number");
        pan1.add(lab4);
        txt3 = new JTextField(10);
        pan1.add(txt3);

        // lab5 = new JLabel("Gender");
        // pan1.add(lab5);
        bg1 = new ButtonGroup();
        rd1 = new JRadioButton("Male");
        bg1.add(rd1);
        rd2 = new JRadioButton("Female");
        bg1.add(rd2);
        pan1.add(rd1);
        pan1.add(rd2);

        pan2 = new JPanel();
        pan2.setLayout(new FlowLayout());

        btn1 = new JButton("Submit");
        pan2.add(btn1);

        con.add(pan1, BorderLayout.CENTER);
        con.add(pan2, BorderLayout.SOUTH);
    }
}
