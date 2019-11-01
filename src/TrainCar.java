import java.awt.*; // so I can use Graphics

public class TrainCar {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(200, 100);
        Graphics g = panel.getGraphics();

        g.setColor((Color.BLACK)); // body
        g.fillRect(40,10, 100, 50);

        g.setColor(Color.CYAN); // windshield
        g.fillRect(110,20,30,20);

        g.setColor(Color.RED); // wheels
        for (int i = 0; i < 5; i++) {
            g.fillOval(20 * i + 40, 50, 20, 20);
        }
    }
}
