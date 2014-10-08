import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

/**
 * Creates brown door for buldings
 * 
 * @author @mthatte 
 * @10-7-14
 */
public class Door
{
    /** creates variables for starting coordinates as well as length and width for rectangle */
    private int x;
    private int y;
    private int height;
    private int width;
    
    /**
     * Default constructor for objects of class Door
     */
    public Door(int x, int y, int h, int w)
    {
        this.x = x;
        this.y = y;
        height = h;
        width = w;
    }

    /**
     * renders door object with inputted parameters
     *
     * @pre        Assumes JFrame and Component are created and class has been called in JFrame
     * @post       door will be created
     * @param    Graphics2D g2     calls JFrame
     * @return    door is displayed on building in JFrame cityscape
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double door = new Rectangle2D.Double(x,y,width,height);
        g2.draw(door);
        Color brown = new Color(128,64,0);
        g2.setColor(brown);
        g2.fill(door);
    }

}
