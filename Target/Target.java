import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Target
{
    private int xLeft;
    private int yTop;
    
    public Target(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double ring5 = new Ellipse2D.Double(xLeft + -30, yTop + -20, 100, 100);
        g2.draw(ring5);
        g2.setColor(Color.RED);
        g2.fill(ring5);
        Ellipse2D.Double ring4 = new Ellipse2D.Double(xLeft + -20, yTop + -10, 80, 80);
        g2.draw(ring4);
        g2.setColor(Color.WHITE);
        g2.fill(ring4);
        Ellipse2D.Double ring3 = new Ellipse2D.Double(xLeft + -10, yTop + 0, 60, 60);
        g2.draw(ring3);
        g2.setColor(Color.RED);
        g2.fill(ring3);
        Ellipse2D.Double ring2 = new Ellipse2D.Double(xLeft + 0, yTop + 10, 40, 40);
        g2.draw(ring2);
        g2.setColor(Color.WHITE);
        g2.fill(ring2);
        Ellipse2D.Double ring1 = new Ellipse2D.Double(xLeft + 10, yTop + 20, 20, 20);
        g2.draw(ring1);
        g2.setColor(Color.RED);
        g2.fill(ring1);
    }
}