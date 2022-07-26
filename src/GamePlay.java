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

    public void print(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(1,1,692,592);

        g.setColor(Color.YELLOW);
        g.fillRect(0,0,3,562);
        g.fillRect(0,0,693,3);
        g.fillRect(691,0,3,592);

        g.setColor(Color.BLUE);
        g.fillRect(playerX, 550,100,8);

        g.setColor(Color.GREEN);
        g.fillOval(ballPosX,ballPosY,20,20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
