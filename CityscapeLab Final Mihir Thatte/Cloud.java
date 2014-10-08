import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

/**
 * Creates two ellipses in cloud shape
 * 
 * @author @mthate
 * @version (a version number or a date)
 */
public class Cloud
{
    /** creates xLeft and yTop variables  for cloud*/
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Cloud
     */
    public Cloud(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * Renders two ellipses in the shape of a cloud
     *
     * @pre        Assumes JFrame and Component are created and class has been called in JFrame
     * @post    cloud object will be created
     * @param    Graphics2D g2     calls JFrame
     * @return    cloud is displayed in JFrame cityscape
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double ring1 = new Ellipse2D.Double(xLeft + 20, yTop + 20, 100,100);
        g2.draw(ring1);
        g2.setColor(Color.WHITE);
        g2.fill(ring1);
        
        Ellipse2D.Double ring2 = new Ellipse2D.Double(xLeft + 10, yTop + 20, 120,80);
        g2.draw(ring2);
        g2.setColor(Color.WHITE);
        g2.fill(ring2);
    }

}
