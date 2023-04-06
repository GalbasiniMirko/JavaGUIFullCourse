import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    Image image;

    public MyPanel(){
        image = new ImageIcon("LogoProgettoGPO.png").getImage();
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(image, 0, 0, null);

        g2D.setPaint(Color.blue);
        g2D.setStroke(new BasicStroke(5));   //set the weight of line
        //g2D.drawLine(0, 0, 500, 500);   //draw a line

        //g2D.setPaint(Color.pink);
        //g2D.drawRect(0, 0, 100, 200);   //draw a rectangle
        //g2D.fillRect(0, 0, 100, 200);   //draw a fill rectangle

        //g2D.setPaint(Color.orange);
        //g2D.drawOval(0, 0, 100, 100);   //draw a circle/oval
        //g2D.fillOval(0, 0, 100, 100);   //draw a fill circle/oval

        g2D.setPaint(Color.red);
        g2D.drawArc(0, 0, 100, 100, 0, 180);   //draw a arc
        g2D.fillArc(0, 0, 100, 100, 0, 180);   //draw a fill arc
        g2D.setPaint(Color.white);
        g2D.fillArc(0, 0, 100, 100, 180, 180);

        int[] xPoints = {150, 250, 350};
        int[] yPoints = {300, 150, 300};
        g2D.setPaint(Color.yellow);
        //g2D.drawPolygon(xPoints, yPoints, 3);   //draw a triangle
        g2D.fillPolygon(xPoints, yPoints, 3);   //draw a fill triangle

        //g2D.setPaint(Color.magenta);
        //g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
        //g2D.drawString("U R A WINNER! :D", 50, 50);
    }
}
