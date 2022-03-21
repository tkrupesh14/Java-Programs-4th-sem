import java.applet.*;
import java.awt.Graphics;

/* <Applet code="Pro3" width="400" height="500">
    <Param name="krupesh" value="avnish"></Param>
</Applet> */

public class Pro3 extends Applet{

    public void paint(Graphics g) {
        String meet = getParameter("krupesh");
        g.drawString(meet, 200, 250);

}
}
