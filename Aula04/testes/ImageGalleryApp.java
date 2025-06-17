package testes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageGalleryApp extends JFrame {
    private JPanel thumbnailPanel;
    private JLabel imagePreviewLabel;
    private JScrollPane scrollPane;

    public ImageGalleryApp() {
        super("Galeria de Imagens");

        setLayout(new BorderLayout());

        // ---------- Painel de Miniaturas ----------
        thumbnailPanel = new JPanel();
        thumbnailPanel.setLayout(new GridLayout(0, 4, 5, 5));  // 4 colunas, espaçamento entre thumbnails
        scrollPane = new JScrollPane(thumbnailPanel);
        scrollPane.setPreferredSize(new Dimension(300, 600));

        // ---------- Área de Visualização ----------
        imagePreviewLabel = new JLabel("Selecione uma imagem", JLabel.CENTER);
        imagePreviewLabel.setPreferredSize(new Dimension(500, 600));
        imagePreviewLabel.setHorizontalAlignment(JLabel.CENTER);
        imagePreviewLabel.setVerticalAlignment(JLabel.CENTER);

        // ---------- Botão para escolher pasta ----------
        JButton selectFolderButton = new JButton("Selecionar Pasta");
        selectFolderButton.addActionListener(e -> selectFolder());

        // ---------- Montagem da Interface ----------
        add(selectFolderButton, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.WEST);
        add(new JScrollPane(imagePreviewLabel), BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700);
        setLocationRelativeTo(null);  // Centralizar na tela
        setVisible(true);
    }

    private void selectFolder() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int result = chooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = chooser.getSelectedFile();
            loadImagesFromFolder(selectedFolder);
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

    private void showImage(File imageFile) {
        try {
            BufferedImage img = ImageIO.read(imageFile);
            if (img != null) {
                Image scaledImg = img.getScaledInstance(imagePreviewLabel.getWidth(), imagePreviewLabel.getHeight(), Image.SCALE_SMOOTH);
                imagePreviewLabel.setIcon(new ImageIcon(scaledImg));
                imagePreviewLabel.setText(null);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ImageGalleryApp::new);
    }
}

