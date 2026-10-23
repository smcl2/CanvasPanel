
import javax.swing.*;
import java.awt.*;

public class CanvasPanel extends JFrame {

    public CanvasPanel() {
        setTitle("Canvas Drawing Example!");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new HouseCanvas());
    }

    public static void main(String[] args) {
    	new CanvasPanel().setVisible(true);
    }
}
