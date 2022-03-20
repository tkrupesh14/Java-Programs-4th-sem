import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/* <Applet code="Pro6" width="700" height="300"></Applet> */

public class Pro6 extends JApplet implements ActionListener{
    Container con;
    JLabel lbl1, lbl2;
    JTextField txt1, txt2;
    JButton btn1;

    public void init(){
        con = getContentPane();
        con.setLayout(new GridLayout(3,2));

        lbl1 = new JLabel("Value 1");
        con.add(lbl1);
        txt1 = new JTextField(10);
        con.add(txt1);

        lbl2 = new JLabel("Ans");
        con.add(lbl2);
        txt2 = new JTextField(10);
        txt2.setEditable(false);
        con.add(txt2);


        btn1 = new JButton("Compute");
        btn1.addActionListener(this);
        con.add(btn1);

    }

    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(txt1.getText());
        int n = 1;

        for(int i=a; i>=1; i--){
            n = n*i;
        }
        txt2.setText(n + "");
    }
}
