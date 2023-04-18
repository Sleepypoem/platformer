package com.sleepypoem.platformer.main;

import com.sleepypoem.platformer.inputs.KeyboardInputs;
import com.sleepypoem.platformer.inputs.MouseInputs;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class GamePanel extends JPanel {

    private KeyboardInputs keyboardInputs;

    private MouseInputs mouseInputs;

    private BufferedImage bufferedImage;

    private int x = 0;

    private int y = 0;
    private int rectHeight = 100;
    private int rectWidth = 100;
    private int speed = 1;

    public GamePanel() {
        keyboardInputs = new KeyboardInputs(this);
        mouseInputs = new MouseInputs(this);
        importImage();
        setPanelSize(1280, 800);
        this.addKeyListener(keyboardInputs); // Add keyboard inputs
        this.addMouseListener(mouseInputs); // Add mouse inputs
        this.addMouseMotionListener(mouseInputs); // Add mouse motion inputs
    }

    public void importImage() {
        InputStream inputStream = getClass().getResourceAsStream("/player_sprites.png");
        if (inputStream == null) {
            throw new RuntimeException("Image not found!");
        }

        try {
            bufferedImage = ImageIO.read(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setPanelSize(int width, int height) {
        Dimension dimension = new Dimension(width, height);
        this.setPreferredSize(dimension);
        this.setMaximumSize(dimension);
        this.setMinimumSize(dimension);
    }


    public void changeX(int x) {
        this.x += x;
    }

    public void changeY(int y) {
        this.y += y;
    }


    public void paintComponent(Graphics g) {
        g.drawImage(bufferedImage.getSubimage(0, 0, 64, 40), x, y, rectWidth, rectHeight, null);
    }
}
