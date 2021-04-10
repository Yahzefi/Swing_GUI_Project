package oddity.Swing;

import javax.swing.*;

public class Panel_Template extends JPanel {
    Panel_Template(String panelName) {
        ImageIcon panelIcon = new ImageIcon("src/killua.jpg");
        JLabel panelLabel = new JLabel();

        this.setLayout(null);
        panelLabel.setText("some text");
        panelLabel.setIcon(panelIcon);
        panelLabel.setBounds(50, 50, 100, 100);
        panelLabel.setHorizontalAlignment(JLabel.CENTER);
        panelLabel.setVerticalAlignment(JLabel.TOP);
        if(panelName.equals("redOne")){
            this.add(panelLabel);
        }
        this.setVisible(true);
//        this.setSize(200, 200);
    }
}
