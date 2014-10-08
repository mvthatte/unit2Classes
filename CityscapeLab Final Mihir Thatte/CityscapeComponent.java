import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @mvthatte
 * @version 10-7-14
 */
public class CityscapeComponent extends JComponent
{
    /**
     * Calls different classes to create the cityscape
     *
     * @pre        assumes frame has been created and classes have been created
     * @post    cityscape created
     * @param    g    represents frame
     * @return    geometric cityscape in JFrame
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Grass grass = new Grass(0,400,300,1000);
        grass.draw(g2); 

        Sky sky = new Sky(0,0,400,1000);
        sky.draw(g2);
             
        Building building1 = new Building(25,100,300,100);
        building1.draw(g2);
        
        Building building2 = new Building(400,200,200,100);
        building2.draw(g2);
        
        Sun sun1 = new Sun(703,0);
        sun1.draw(g2);
        
        Door door1 = new Door(50,350,50,40);
        door1.draw(g2);
        
        Door door2 = new Door(430,350,50,40);
        door2.draw(g2);
        
        Cloud cloud1 = new Cloud(200,100);
        cloud1.draw(g2);
        
        Cloud cloud2 = new Cloud(500,25);
        cloud2.draw(g2);
    }

}
