import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
/**
 * Creates yellow ellipse to represent sun
 * 
 * @author @mthatte
 * @version 10-7-14
 */
public class Sun
{
    /** xLeft sets left x value and yTop sets topmost y value for the ellipse */
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Sun
     */
    public Sun(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * renders the sun in the JFrame
     *
     * @pre        Assumes JFrame and Component are created and class has been called in JFrame
     * @post       Sun will be created
     * @param      Graphics2D g2     calls JFrame
     * @return     sun is displayed in JFrame cityscape
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double sun = new Ellipse2D.Double(xLeft + 0, yTop + 0, 80, 80);
        g2.draw(sun);
        g2.setColor(Color.YELLOW);
        g2.fill(sun);
    }

}
