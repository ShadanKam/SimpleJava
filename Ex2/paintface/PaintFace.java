package paintface;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintFace {

    public static void main(String[] args) {
        JFrame frame = new JFrame("PaintFace");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ShapeJPanel shape = new ShapeJPanel();

        frame.add(shape);
        frame.setSize(350,350);
        frame.setVisible(true);
    }

}

class ShapeJPanel extends JPanel {

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g.drawOval(50, 50, 210, 210); 
  
        g.drawOval(85, 100, 50, 35); 
        g.drawOval(175, 100, 50, 35); 
        
        g.setColor(Color.BLACK); 
        g.fillOval(95, 102, 30, 30); 
        g.fillOval(185, 102, 30, 30); 
   
        Polygon nose = new Polygon();
        nose.addPoint(155, 130);
        nose.addPoint(179, 180);
        nose.addPoint(135, 180);
        g.drawPolygon(nose);

        g.drawArc(110, 170, 95, 50, 180, 180); 

    }
}
