import javax.swing.JFrame;
import java.awt.BorderLayout;
/**
 *
 * @author Luke
 */
public class BlockBarrage {
    public static void main(String args[]){
        JFrame BBFrame = new JFrame("BlockBarrage");
        BBFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BBFrame.setLayout(new BorderLayout());
        
        BBPanel gamepanel = new BBPanel();
        BBFrame.setSize(1000, 1000);
        BBFrame.setPreferredSize(new java.awt.Dimension(1000, 1000));
        BBFrame.add(gamepanel,BorderLayout.CENTER);
        BBFrame.setLocationRelativeTo(null);
        BBFrame.setVisible(true);
    }
}
