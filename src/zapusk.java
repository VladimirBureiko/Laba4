import javax.swing.*;
 
public class zapusk {
    public static void main(String args[]){
        
        okno mainFrame = new okno("Hello, SWING!");
        mainFrame.setSize(300, 200);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}