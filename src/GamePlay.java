import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePlay extends JPanel implements ActionListener, KeyListener {

    private boolean play = false;
    private int score = 0;
    private int totalBricks = 21;

    private Timer timer;
    private int delay = 8;
    private int playerX = 310;
    private int ballPosX = 120;
    private int ballPosY = 350;
    private int ballXDir = -1;
    private int ballYDir = -2;

    public GamePlay(){
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();
    }

    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(1,1,692,592);

        g.setColor(Color.YELLOW);
        g.fillRect(0,0,3,592);
        g.fillRect(0,0,692,3);
        g.fillRect(691,0,3,592);

        g.setColor(Color.BLUE);
        g.fillRect(playerX, 550,100,8);

        g.setColor(Color.GREEN);
        g.fillOval(ballPosX,ballPosY,20,20);

        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            if (playerX >= 600){
                playerX = 600;
            } else{
                moveRight();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            if (playerX < 10){
                playerX = 10;
            } else{
                moveLeft();
            }
        }
    }

    private void moveRight() {
        play = true;
        playerX += 20;
    }

    private void moveLeft() {
        play = true;
        playerX -= 20;
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
