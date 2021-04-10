package oddity.Swing;

import javax.swing.*;
import java.awt.*;

public class S_Template {
    Label_Template appLabel = new Label_Template();
    Panel_Template redPanel = new Panel_Template("redOne");
    Panel_Template bluePanel = new Panel_Template("blueOne");
    Panel_Template greenPanel = new Panel_Template("greenOne");
    Panel_Template[] appPanels = {redPanel, bluePanel, greenPanel};
    Frame_Template appFrame = new Frame_Template(appLabel, appPanels);


    public void useFrameTemplate(){
        appFrame.setVisible(true);
    }
    public void useLabelTemplate(){
//        appLabel.setVisible(true);
    }
    public void usePanelTemplate(){
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0,200, 200);
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(200,200,200, 200);
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(400,400,200, 200);
    }
    public void createButton(){
        JButton testBtn = new JButton();
//        testBtn.addActionListener(e -> System.out.println("Hello"));
        
    }
}
