import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/* <applet code = "Pro10" width="500" height="500"></applet> */
public class Pro10 extends JApplet {
    Container con;
    JLabel lbl1 = new JLabel("Hello");
    public void init() {
        con = getContentPane();
        con.setLayout(new BorderLayout());
        con.add(lbl1, BorderLayout.CENTER);

        

        addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e) {
                    lbl1.setText("MouseEntered");
                    
            }
            public void mouseExited(MouseEvent e) {
                lbl1.setText("MouseExited");
            }
            public void mouseClicked(MouseEvent e) {
                lbl1.setText("MouseClicked");
            }
            public void mousePressed(MouseEvent e) {
                lbl1.setText("MousePressed");
            }
            public void mouseReleased(MouseEvent e) {
                lbl1.setText("MouseReleased");
            }
        });

    }
}
