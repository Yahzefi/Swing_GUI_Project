package oddity.Swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Label_Template extends JLabel {
    Label_Template(){
        ImageIcon labelImage = new ImageIcon("src/killua.jpg");
        Border labelBorder = BorderFactory.createLineBorder(Color.blue, 2);

        this.setVisible(false);
        this.setText("Hello There, boy!");
        this.setIcon(labelImage);
        this.setHorizontalTextPosition(JLabel.CENTER); // changes horizontal position of text in relation to frame
        this.setVerticalTextPosition(JLabel.TOP); // changes vertical position of text in relation to frame
        this.setForeground(Color.WHITE); // changes the font color of the label's text
        // OR
//        this.setForeground(new Color(255, 255, 255));
        this.setFont(new Font("MV Boli", Font.PLAIN, 20));
        this.setIconTextGap(50); // creates a gap between the icon image and the text associated with it
        this.setBackground(Color.black);
        this.setOpaque(true); // display background color
        this.setBorder(labelBorder);
        this.setVerticalAlignment(JLabel.TOP);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setBounds(0, 0, 250, 250); // set x & y position and dimensions for label if frame layout is set to null
    }
}
