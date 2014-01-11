
package tema.java.pkg3;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Surface extends JPanel {

    private int _x1;   
    private int _y1;
    
    private int _wc1 = 50;

    private int _wc2 = 50;
    private Color _color;
    private int _thickness;
    
    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        
        drawCatetaH(_x1, _y1, _wc1, _thickness, _color, g2d);
        drawCatetaV(_x1, _y1, _wc2, _thickness, _color, g2d);
        // ipotenuza
        g2d.drawLine(_x1, _y1-_wc2, _x1+_wc1, _y1);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
    
    public void setX1(int x1) { _x1 = x1; }
    
    public void setWidthC1(int w) { _wc1 = w; }
    
    public void setY1(int y1) { _y1 = y1; }
    
    public void setWidthC2(int w) { _wc2 = w; }
    
    public void setColor(Color color) { _color = color; }
    
    public void setThickness(int thickness) { _thickness = thickness; }
    
    public double getTan1()
    {
        return (_wc1*1.0)/_wc2;
    }
    
    public double getTan2()
    {
        return (_wc2*1.0)/_wc1;
    }
    
    private void drawCatetaH(int x1, int y1, int w, int thickness, Color color, Graphics2D gr)
    {
        gr.setColor(color);
        gr.setStroke(new BasicStroke(thickness));
        gr.drawLine(x1, y1, x1+w, y1);
    }
    
    private void drawCatetaV(int x1, int y1, int w, int thickness, Color color, Graphics2D gr)
    {
        gr.setColor(color);
        gr.setStroke(new BasicStroke(thickness));
        gr.drawLine(x1, y1, x1, y1-w);
    }
}