import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <Applet code="Pro28" width="500" height="500"></Applet> */

public class Pro28 extends Applet implements MouseMotionListener, MouseListener{
    Point p;
    public void init() {
        addMouseMotionListener(this);
        p = new Point();
        
    }
    public void mouseDragged(MouseEvent e) {
        
    }
    public void mouseMoved(MouseEvent e) {
      
    }
    public void mouseClicked(MouseEvent e){
        p = e.getPoint();
        repaint();
    }
    public void mouseEntered(MouseEvent e){
        
    
    }
    public void mouseExited(MouseEvent e){

    }
    public void mousePressed(MouseEvent e){

    }
    public void mouseReleased(MouseEvent e){

    }
    public void paint(Graphics g) {
        g.drawString("Krupesh", p.x, p.y    );
        showStatus("X = " + p.x + "Y = " + p.y);
    }
}
