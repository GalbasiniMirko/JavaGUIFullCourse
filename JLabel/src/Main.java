import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //JLabel = a GUI display area for a string text, an image, or both

        //ImageIcon image = new ImageIcon("");   //create image
        Border border = BorderFactory.createLineBorder(Color.magenta, 3);   //create border with color and weight

        JLabel label = new JLabel();   //create a label
        label.setText("Bro, do you even code?");   //set text of label
        //label.setIcon(image);   //image of label
        label.setHorizontalTextPosition(JLabel.CENTER);   //set text LEFT, CENTER, RIGHT of ImageIcon
        label.setVerticalTextPosition(JLabel.TOP);   //set text TOP, CENTER, BOTTOM of ImageIcon
        label.setForeground(new Color(0, 0, 0));   //set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));   //set font of text
        label.setIconTextGap(-25);   //set gap of text to image
        label.setBackground(new Color(253,168,90));   //set background color
        label.setOpaque(true);   //display background color
        label.setBorder(border);   //border of label
        label.setVerticalAlignment(JLabel.TOP);   //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);   //set horizontal position of icon+text within label
        //label.setBounds(0, 0, 250, 250);   //set x,y position within frame as well as dimensions to write if setLayout of frame is null

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        //frame.setLayout(null);   //se messo a null bisogna inserire label.setBounds se no non si vedrà nulla
        frame.setVisible(true);
        frame.add(label);
        //frame.pack();   //resize frame based on the content of the frame
    }
}