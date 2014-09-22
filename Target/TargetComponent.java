import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Target target1 = new Target(200, 100);
        target1.draw(g2);
        Graphics2D g3 = (Graphics2D) g;
        Target target2 = new Target(50, 100);
        target2.draw(g3);
    }
}
