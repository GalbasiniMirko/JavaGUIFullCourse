import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;


    public MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon("pointing-left.png");
        Image image1 = loadIcon.getImage();
        image1 = image1.getScaledInstance(25, 25, Image.SCALE_FAST);   //scaled image
        loadIcon.setImage(image1);

        saveIcon = new ImageIcon("pointing-left.png");
        Image image2 = saveIcon.getImage();
        image2 = image2.getScaledInstance(25, 25, Image.SCALE_FAST);   //scaled image
        saveIcon.setImage(image2);

        exitIcon = new ImageIcon("pointing-left.png");
        Image image3 = exitIcon.getImage();
        image3 = image3.getScaledInstance(25, 25, Image.SCALE_FAST);   //scaled image
        exitIcon.setImage(image3);

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        fileMenu.setMnemonic(KeyEvent.VK_F);   //Alt + f for file
        editMenu.setMnemonic(KeyEvent.VK_E);   //Alt + e for edit
        helpMenu.setMnemonic(KeyEvent.VK_H);   //Alt + h for help
        loadItem.setMnemonic(KeyEvent.VK_L);   //l for load
        saveItem.setMnemonic(KeyEvent.VK_S);   //s for save
        exitItem.setMnemonic(KeyEvent.VK_E);   //e for exit

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loadItem){
            System.out.println("*beep boop* you loaded a file");
        }else if(e.getSource()==saveItem){
            System.out.println("*beep boop* you saved a file");
        }else if(e.getSource()==exitItem){
            System.exit(0);
        }
    }
}
