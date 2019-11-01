import java.awt.*;

public class Pyramids1 {

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(350, 250);
        Graphics g = panel.getGraphics();

        // draw border rectangle
        g.drawRect(0,0, 100, 100);

        // draw pyramid
        for (int i = 0; i < 10; i++) {
            int stairWidth = 10 * (i + 1);
            int stairHeight = 10;
            int stairX = (100 - stairWidth) / 2;
            int stairY = (10 * i);
            g.drawRect(stairX, stairY, stairWidth, stairHeight);
        }
    }
}
