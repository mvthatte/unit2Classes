import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Rectangle2D;

/**
 * Creates gray rectangle to represent building
 * 
 * @author @mthatte
 * @10-7-14
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    private int y;
    private int height;
    private int width;

    /**
     * Default constructor for objects of class Building
     
       */
    public Building(int x, int y, int h, int w)
    {
        this.x = x;
        this.y = y;
        height = h;
        width = w;
    }

    /**
     * renders building object with parameters inputted from component
     *
     * @pre      Assumes JFrame and Component are created and class has been called in JFram
     * @post    building will be created
     * @param    Graphics2D g2     calls JFrame
     * @return    bulding is displayed in JFrame cityscape
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double building = new Rectangle2D.Double(x,y,width,height);
        g2.draw(building);
        g2.setColor(Color.GRAY);
        g2.fill(building);
    }

}
