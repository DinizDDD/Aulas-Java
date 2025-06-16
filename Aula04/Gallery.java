import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Gallery extends JFrame {
    private JPanel thumbnailPanel;
    private JLabel imagePreviewLabel;
    private JScrollPane scrollPane;

    public Gallery() {
        super("Imagens");

        setLayout(new BorderLayout());

        thumbnailPanel = new JPanel();
        thumbnailPanel.setLayout(new GridLayout(0, 4, 5, 5));
        scrollPane = new JScrollPane(thumbnailPanel);
        scrollPane.setPreferredSize(new Dimension(300, 600));
    }

}