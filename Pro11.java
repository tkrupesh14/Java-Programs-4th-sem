import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="Pro11" width="500" height="500"></applet>*/

public class Pro11 extends JApplet implements Runnable{
    Container con;
    JLabel lbl1;
    Thread t1;

    public void init() {
        con = getContentPane();
        con.setLayout(new FlowLayout());
        lbl1 = new JLabel("0");
        con.add(lbl1);
        
        t1 = new Thread(this);
        t1.start();
    }
    public void run() {
        try{
            for(int i=1; i>0; i++){
                Thread.sleep(1000);
                lbl1.setText(i + "");
            }
        }catch (Exception e){

        }
    }
        
}
