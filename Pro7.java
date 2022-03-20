import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* <Applet code="Pro7" width="700" height="300"></Applet> */

public class Pro7 extends JApplet implements ActionListener{
    Container con;
    JButton btn1,btn2,btn3;

    // @Override
    public void init() {
        con = getContentPane();
        con.setLayout(new GridLayout (3,1));

        btn1 = new JButton("Red");
        btn1.setBackground(Color.red);
        btn1.addActionListener(this);
        con.add(btn1);

        btn2 = new JButton("yellow");
        btn2.setBackground(Color.yellow);
        btn2.addActionListener(this);
        con.add(btn2);

        btn3 = new JButton("green");
        btn3.setBackground(Color.green);
        btn3.addActionListener(this);
        con.add(btn3);


    }
    public void actionPerformed (ActionEvent e){
        if(e.getSource() == btn1){
            JOptionPane.showMessageDialog(this, "Stop", "Red",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(e.getSource() == btn2){
            
            JOptionPane.showMessageDialog(this, "Ready", "Yellow",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Go", "Green",JOptionPane.INFORMATION_MESSAGE);

        }
    }
}
