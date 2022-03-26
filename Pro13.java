import javax.swing.*;
import java.awt.*;

/* <applet code="Pro13" width="500" height="500"></applet> */

public class Pro13 extends JApplet{
    Container con;
    JLabel lbl1 = new JLabel("");
    String str = "";

    public void init(){
        con = getContentPane();
        con.setLayout(new FlowLayout());
        str = str + "Init Method";
        lbl1.setText(str);
        con.add(lbl1);
    }
    public void start(){
        str+= "Start Method";
        lbl1.setText(str);
        
    }
    public void stop(){
        str += "Stop Method";
        lbl1.setText(str);
    }
    public void distroy(){
        str += "Distroy Method";
        lbl1.setText(str);

    }
  
}
