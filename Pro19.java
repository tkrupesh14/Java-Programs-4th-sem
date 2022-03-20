import javax.swing.*;
import java.awt.*;

/* <Applet code = "Pro19" width="700" height="300"></Applet> */

public class Pro19 extends JApplet{
    Container con;
    JButton btn1,btn2,btn3,btn4,btn5;

    // @Override
    public void init() {
        con = getContentPane();
        con.setLayout(new FlowLayout());

        btn1 = new JButton("Button 1");
        con.add(btn1);

        btn2 = new JButton("Button 2");
        con.add(btn2);

        btn3 = new JButton("Button 3");
        con.add(btn3);

        btn4 = new JButton(" Long Named Button 4");
        con.add(btn4);

btn5 = new JButton("5");
        con.add(btn5);
    }
}
