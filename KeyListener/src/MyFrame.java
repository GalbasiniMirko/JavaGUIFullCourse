import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon;

    public MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon("LogoProgettoGPO.png");
        Image image = icon.getImage();
        image = image.getScaledInstance(100, 100, Image.SCALE_FAST);   //scaled image
        icon.setImage(image);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        //label.setBackground(Color.red);   //if there is ImageIcon don't use it
        //label.setOpaque(true);   //if there is ImageIcon don't use it
        label.setIcon(icon);

        this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //KeyTyped = Invoke when a key is typed. Uses KeyChar, char output

        switch (e.getKeyChar()){
            case 'a':   //traslate 10px to left label
                label.setLocation(label.getX()-10, label.getY());
                break;
            case 'w':   //traslate 10px to up label
                label.setLocation(label.getX(), label.getY()-10);
                break;
            case 's':   //traslate 10px to down label
                label.setLocation(label.getX(), label.getY()+10);
                break;
            case 'd':   //traslate 10px to right label
                label.setLocation(label.getX()+10, label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //KeyPressed = Invoke when a physical key is pressed down. Uses KeyCode, int output

        switch (e.getKeyCode()){
            case 37:   //traslate 10px to left label
                label.setLocation(label.getX()-10, label.getY());
                break;
            case 38:   //traslate 10px to up label
                label.setLocation(label.getX(), label.getY()-10);
                break;
            case 39:   //traslate 10px to down label
                label.setLocation(label.getX()+10, label.getY());
                break;
            case 40:   //traslate 10px to right label
                label.setLocation(label.getX(), label.getY()+10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //KeyReleased = Called whenever a button is released

        System.out.println("You released key char: "+e.getKeyChar()+" ---> "+e.getKeyCode());
    }
}
