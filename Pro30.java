import java.applet.Applet;
import java.awt.*;




/* <Applet code="Pro30" width="1000" height="700"></Applet> */

public class Pro30 extends Applet{
    // @Override
    public void init(){
        setBackground(Color.GRAY);
    }
        public void paint(Graphics g) {
            g.setColor(Color.YELLOW);
            g.fillOval(300, 50, 600, 600);
            g.setColor(Color.black);
            g.drawOval(400, 200, 100, 100);
            g.drawOval(700, 200, 100, 100);
            g.setColor(Color.cyan);
            g.fillOval(425, 240, 60, 60);
            g.fillOval(715, 240, 60, 60);
            g.drawLine(400, 463, 800, 463);
            g.setColor(Color.pink);
            g.fillArc(400, 350, 400, 230, 180, 180);
            
        }
}
