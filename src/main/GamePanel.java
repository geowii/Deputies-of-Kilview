package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
    // Screen settings
    final int originalTileSize = 32; // 32px*32px tile
    final int scale = 2;

    final int tileSize = originalTileSize * scale; // 64px*64px tile
    final int maxscreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxscreenCol; // 1024px
    final int screenHeight = tileSize * maxScreenRow; // 768px

    Thread gameThread;

    // Makes a window to play the game on.
    public GamePanel() {
        
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLUE);
        this.setDoubleBuffered(true);
    }

    public void startGameThread() {
        
        gameThread = new Thread(this);
        gameThread.start();
    }


    // Game loop
    @Override
    public void run() {
        

    }
}
