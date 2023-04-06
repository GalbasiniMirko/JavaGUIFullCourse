import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //JOptionPane = pop up a standard dialog box that prompts users for a value
        //              or informs them of something.

        //JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Here is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Really?", "title", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "You're computer has A VIRUSS!!!", "title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Call tech support NOW OR ELSE!!!", "title", JOptionPane.ERROR_MESSAGE);

        //JOptionPane.showConfirmDialog(null, "Bro do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
        //System.out.println(JOptionPane.showConfirmDialog(null, "Bro do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION));
        //int answer = JOptionPane.showConfirmDialog(null, "Bro do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
        //String name = JOptionPane.showInputDialog("What is your name?");
        //System.out.println(name);

        String[] responses = {"No, you're awesome!", "Thank you!", "*blush*"};
        ImageIcon icon = new ImageIcon("LogoProgettoGPO.png");
        Image image = icon.getImage();
        image = image.getScaledInstance(50, 50, Image.SCALE_FAST);   //scaled image
        icon.setImage(image);

        JOptionPane.showOptionDialog(null,
                "You are awesome!",
                "Secret Message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon, responses, 0);
    }
}