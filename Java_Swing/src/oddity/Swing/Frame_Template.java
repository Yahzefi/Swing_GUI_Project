package oddity.Swing;

import javax.swing.*;
import java.awt.*;

public class Frame_Template extends JFrame {
    Frame_Template(JLabel appLabel, JPanel[] appPanels){
        this.setTitle("Swing Tutorial App");
        this.setVisible(false); // allows window frame to actually pop up or not(false)
        this.setSize(800, 800);
//        this.setResizable(false); // allow/disallow resizing of window frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(appLabel); // IMPORTANT: without this, label won't appear in frame

        ImageIcon appIcon = new ImageIcon("src/killua.jpg"); // Creates a new icon
        this.setIconImage(appIcon.getImage()); // Changes the app icon with new one
        this.getContentPane().setBackground(Color.darkGray);
        // OR
//        this.getContentPane().setBackground(new Color(50, 50, 50));
        this.setLayout(null); // prevents labels from taking up the entirety of the frame
//        this.pack(); // automatically changes the bounds according to the sizes of the different components
        for(int i=0; i < appPanels.length; i++){
            this.add(appPanels[i]);
        }
    }
}
