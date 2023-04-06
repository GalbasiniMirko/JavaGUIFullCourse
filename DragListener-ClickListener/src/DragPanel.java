import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {

    ImageIcon imageIcon = new ImageIcon("LogoProgettoGPO.png");
    final int WIDTH = imageIcon.getIconWidth();
    final int HEIGHT = imageIcon.getIconHeight();
    Point imageCorner;
    Point prevPt;

    public DragPanel(){
        Image image = imageIcon.getImage();
        image = image.getScaledInstance(100, 100, Image.SCALE_FAST);   //scaled image
        imageIcon.setImage(image);

        imageCorner = new Point(0, 0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        imageIcon.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());
    }

    private class ClickListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            prevPt = e.getPoint();
        }
    }

    private class DragListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
            Point currentPt = e.getPoint();

            imageCorner.translate(
                    (int) (currentPt.getX() - prevPt.getX()),
                    (int) (currentPt.getY() - prevPt.getY())
            );
            prevPt = currentPt;
            repaint();
        }
    }
}
