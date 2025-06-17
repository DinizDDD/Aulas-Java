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

    // Parte de Criação da pagina

    public Gallery() {
        super("Galeria");

        setLayout(new BorderLayout());

        thumbnailPanel = new JPanel();
        thumbnailPanel.setLayout(new GridLayout(0, 4, 5, 5));
        scrollPane = new JScrollPane(thumbnailPanel);
        scrollPane.setPreferredSize(new Dimension(300, 600));

        imagePreviewLabel = new JLabel("Selecione uma imagem", JLabel.CENTER);
        imagePreviewLabel.setPreferredSize(new Dimension(500, 600));
        imagePreviewLabel.setHorizontalAlignment(JLabel.CENTER);
        imagePreviewLabel.setVerticalAlignment(JLabel.CENTER);

        // JButton selectFolderButton = new JButton("Selecionar Pasta");
        // selectFolderButton.addActionListener(e -> selectFolder());

        // add(selectFolderButton, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.WEST);
        add(new JScrollPane(imagePreviewLabel), BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700);
        setLocationRelativeTo(null);  
        setVisible(true);
    }

    // Funções para acões

            public static void main(String[] args) {
        SwingUtilities.invokeLater(ImageGalleryApp::new);
        }

}