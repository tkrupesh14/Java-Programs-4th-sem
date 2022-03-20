
// import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/* <Applet code = "Pro5" width="300" height= "300"></Applet> */
public class Pro5 extends JApplet implements ActionListener {
    Container con;
    JLabel lbl1, lbl2, lbl3;
    JTextField txt1, txt2, txt3;
    JButton btn1, btn2, btn3, btn4;

    public void init() {

        con = getContentPane();
        con.setLayout(new GridLayout(5, 2));
        lbl1 = new JLabel("Num 1");
        con.add(lbl1);
        txt1 = new JTextField(10);
        con.add(txt1);
        lbl2 = new JLabel("Num 2");
        con.add(lbl2);
        txt2 = new JTextField(10);
        con.add(txt2);

        lbl3 = new JLabel("Ans");
        con.add(lbl3);
        txt3 = new JTextField(10);
        con.add(txt3);
        txt3.setEditable(false);

        btn1 = new JButton("Add +");
        con.add(btn1);
        btn1.addActionListener(this);
        btn2 = new JButton("Substraction -");
        con.add(btn2);
        btn2.addActionListener(this);
        btn3 = new JButton("Multiple *");
        con.add(btn3);
        btn3.addActionListener(this);
        btn4 = new JButton("Division /");
        con.add(btn4);
        btn4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(txt1.getText());
        int b = Integer.parseInt(txt2.getText());
        int c = 0;

        if (e.getSource() == btn1) {
            c = a + b;
        txt3.setText(c + "");


        } else if (e.getSource() == btn2) {
            c = a - b;
        txt3.setText(c + "");

        } else if (e.getSource() == btn3) {
            c = a * b;
        txt3.setText(c + "");

        } else {
           
            try{
                    if(b == 0){
                    throw new Exception("Can not be devide by 0");
                    
                    
                }else{
                    c = a/b;
                txt3.setText(c + "");
            }
        }
        catch(Exception ex){
                txt3.setText("Error");

            }
            
        }
    }

}
