import java.applet.Applet;
import java.awt.Graphics;

@SuppressWarnings("deprecation")
public class JavaApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, World!", 150, 150);
    }
}
/*
 * <applet code="JavaApplet" height=300 width=300></applet>
 */