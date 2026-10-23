import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class HouseCanvas extends Canvas {
	@Override
    public void paint(Graphics g) {
        // Same drawing logic here
		int width = getWidth();
        int height = getHeight();

        // 1. Draw Sky (Background)
        g.setColor(new Color(135, 206, 235)); // Sky blue
        g.fillRect(0, 0, width, height);

        // 2. Draw Sun
        g.setColor(new Color(255, 223, 0)); // Bright yellow
        g.fillOval(450, 50, 60, 60);

        // 3. Draw Ground / Grass
        g.setColor(new Color(34, 139, 34)); // Forest green
        g.fillRect(0, 300, width, height - 300);

        // 4. Draw House Base
        g.setColor(new Color(222, 184, 135)); // Beige
        g.fillRect(200, 180, 160, 120);

        // 5. Draw Roof (using a Polygon)
        g.setColor(new Color(178, 34, 34)); // Firebrick red
        int[] xPoints = {180, 280, 380};
        int[] yPoints = {180, 100, 180};
        g.fillPolygon(xPoints, yPoints, 3);

        // 6. Draw Door
        g.setColor(new Color(101, 67, 33)); // Brown
        g.fillRect(260, 220, 40, 80);

        // 7. Draw Window
        g.setColor(new Color(255, 255, 255)); // White window frame
        g.fillRect(220, 200, 30, 30);
        g.setColor(new Color(0, 0, 0)); // Window pane lines
        g.drawRect(220, 200, 30, 30);
        g.drawLine(235, 200, 235, 230);
        g.drawLine(220, 215, 250, 215);

        // 8. Draw a simple Cloud
        g.setColor(Color.WHITE);
        g.fillOval(80, 80, 50, 30);
        g.fillOval(110, 70, 60, 40);
        g.fillOval(140, 80, 50, 30);
    }

}
