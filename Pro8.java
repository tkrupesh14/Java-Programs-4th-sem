import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <Applet code="Pro8" width="500" height="500"></Applet> */

public class Pro8 extends Applet implements MouseMotionListener{
    Point p;
    public void init() {
        addMouseMotionListener(this);
        p = new Point();
        
    }
    public void mouseDragged(MouseEvent e) {
        
    }
    public void mouseMoved(MouseEvent e) {
        p = e.getPoint();
        repaint();
    }
    public void paint(Graphics g) {
        showStatus("X = " + p.x + "Y = " + p.y);
    }
}
