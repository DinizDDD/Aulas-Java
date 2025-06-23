package com.example;



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
        thumbnailPanel.setLayout(new GridLayout(0, 3, 5, 5));
        scrollPane = new JScrollPane(thumbnailPanel);
        scrollPane.setPreferredSize(new Dimension(350, 600));

        imagePreviewLabel = new JLabel("Selecione uma imagem", JLabel.CENTER);
        imagePreviewLabel.setPreferredSize(new Dimension(500, 600));
        imagePreviewLabel.setHorizontalAlignment(JLabel.CENTER);
        imagePreviewLabel.setVerticalAlignment(JLabel.CENTER);

        JButton selectFolderButton = new JButton("Selecionar Pasta");
        selectFolderButton.addActionListener(e -> selectFolder());

        add(selectFolderButton, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.WEST);
        add(new JScrollPane(imagePreviewLabel), BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700);
        setLocationRelativeTo(null);  
        setVisible(true);
    }

    // Funções para acões

     private void selectFolder() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int result = chooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = chooser.getSelectedFile();
            loadImagesFromFolder(selectedFolder);
        }
    }

    private void showImage(File imageFile) {
    try {
        BufferedImage img = ImageIO.read(imageFile);
        if (img != null) {
            ImageIcon icon = new ImageIcon(img.getScaledInstance(imagePreviewLabel.getWidth(), imagePreviewLabel.getHeight(), Image.SCALE_SMOOTH));
            imagePreviewLabel.setIcon(icon);
            imagePreviewLabel.setText("");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    private void loadImagesFromFolder(File folder) {
    thumbnailPanel.removeAll();
    File[] files = folder.listFiles((dir, name) -> {
        String nameLc = name.toLowerCase();
        return nameLc.endsWith(".jpg") || nameLc.endsWith(".jpeg") || nameLc.endsWith(".png") || nameLc.endsWith(".gif");
    });

    if (files != null) {
        for (File imageFile : files) {
            try {
                BufferedImage img = ImageIO.read(imageFile);
                if (img != null) {
                    ImageIcon thumbnailIcon = new ImageIcon(img.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
                    JLabel thumbLabel = new JLabel(thumbnailIcon);
                    thumbLabel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                    thumbLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                    thumbLabel.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            showImage(imageFile);
                        }
                    });

                    thumbnailPanel.add(thumbLabel);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    thumbnailPanel.revalidate();
    thumbnailPanel.repaint();
    }

    

        public static void main(String[] args) {
        SwingUtilities.invokeLater(Gallery::new);
        }

}