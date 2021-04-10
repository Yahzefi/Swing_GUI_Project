package oddity.Swing;



public class Main {

    public static void main(String[] args) {
	// write your code here
        S_Template mainGUI = new S_Template();
        mainGUI.useFrameTemplate();
        mainGUI.useLabelTemplate();
        mainGUI.usePanelTemplate();
        mainGUI.createButton();
    }
}
