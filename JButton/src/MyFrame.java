import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    JButton button;
    JLabel label;
    public MyFrame(){

        ImageIcon icon = new ImageIcon("pointing-left.png");
        Image image = icon.getImage();
        image = image.getScaledInstance(75, 75, Image.SCALE_FAST);   //scaled image
        icon.setImage(image);

        ImageIcon icon2 = new ImageIcon("pointing-left.png");
        Image image2 = icon.getImage();
        image2 = image2.getScaledInstance(100, 100, Image.SCALE_FAST);   //scaled image
        icon2.setImage(image2);

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(175, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 250, 100);   //set position and dimension of button
        button.addActionListener(this);   //add actionListener to button
        button.setText("I'm a button!");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);   //base of image
        button.setVerticalTextPosition(JButton.BOTTOM);   //base of image
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-15);   //set gap between text and icon
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);   //add button to frame
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            //System.out.println("poo");
            label.setVisible(true);
        }
    }
}
