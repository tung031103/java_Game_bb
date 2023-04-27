

import javax.swing.JFrame;

public class BBMain {
    public static final int WIDTH = 640, HEIGHT = 480;
    public static void main(String[] args) {
        GamePanel gamePanel = new GamePanel();
        JFrame frame = new JFrame("Brick breaker");
        frame.add(gamePanel);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setSize(WIDTH,HEIGHT);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        gamePanel.playGame();
    }
}
