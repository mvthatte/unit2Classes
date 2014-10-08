import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Rectangle2D;

/**
 * Creates green rectangle to represent grass
 * 
 * @mthatte
 * @10-7-14
 */
public class Grass
{
    /** creates variables for starting coordinates as well as length and width for rectangle */
    private int x;
    private int y;
    private int height;
    private int width;

    /**
     * Default constructor for objects of class Grass
     */
    public Grass(int x, int y, int h, int w)
    {
        this.x = x;
        this.y = y;
        height = h;
        width = w;
    }

    /**
     * renders grass object with inputted parameters
     *
     * @pre        Assumes JFrame and Component are created and class has been called in JFrame
     * @post    grass will be created
     * @param    Graphics2D g2     calls JFrame
     * @return    grass is displayed in JFrame cityscape
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double grass = new Rectangle2D.Double(x,y,width, height);
        g2.draw(grass);
        g2.setColor(Color.GREEN);
        g2.fill(grass);
    }

}
