import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author Luke
 */
public class BBPanel extends JPanel{
    public BBPanel(){
        setBackground(Color.WHITE);
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setSize(640,786);
        setMaximumSize(new java.awt.Dimension(640, 786));
        setPreferredSize(new java.awt.Dimension(640, 786));
        setLayout(new java.awt.GridLayout(12, 10));
    }
}
