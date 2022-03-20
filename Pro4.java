import java.applet.*;
import java.awt.*;

/* <Applet code="Pro4" width="1300" height="300"></Applet> */

public class Pro4 extends Applet{
    public void paint(Graphics g)
    {
        g.drawLine(10, 10, 100, 100);
        g.drawRect(110, 0, 150, 100);
        g.drawRoundRect(270, 0, 130, 100, 20, 20);
        g.setColor(Color.red);
        g.fillRect(410, 0, 150, 100);
        g.setColor(Color.blue);
        g.fillRoundRect(570, 0, 150, 100, 20, 20);
        g.drawOval(730, 0, 100, 100);
        g.setColor(Color.yellow);
        g.fillOval(840, 0, 100, 100);
        g.drawOval(0, 110, 100, 150);
        g.drawArc(110, 110, 100, 100,180,180);
        g.setColor(Color.green);
        g.fillArc(220, 110, 100, 100,180,180);
    }
}
