package uet.oop.bomberman.gui;

import uet.oop.bomberman.Game;
import uet.oop.bomberman.gui.Menu.Menu;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 * Swing Frame chứa toàn bộ các component
 */
public class Frame extends JFrame {

    public GamePanel _gamepane;
    private JPanel _containerpane;
    private InfoPanel _infopanel;

    private Game _game;

    public Frame() {

        //Tao icon cho game
        URL a = Frame.class.getResource("/bombermanIcon.png");
        try {
            BufferedImage image = ImageIO.read(a);
            setIconImage(image);
        } catch (IOException e) {
            e.printStackTrace();
        }//ketthuc

        setJMenuBar(new Menu(this));
        _containerpane = new JPanel(new BorderLayout());
        _gamepane = new GamePanel(this);
        _infopanel = new InfoPanel(_gamepane.getGame());

        _containerpane.add(_infopanel, BorderLayout.PAGE_START);
        _containerpane.add(_gamepane, BorderLayout.PAGE_END);

        _game = _gamepane.getGame();

        add(_containerpane);

        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        _game.start();
    }

    public void getPersonFrame(String person){
        _game.getBoard().setPersion(person);
        _game.getBoard().loadLevel(1);
    }
    public void addBombRateFrame(){
        _game.addBombRate(1);
    }

    public void setTime(int time) {
        _infopanel.setTime(time);
    }

    public void setPoints(int points) {
        _infopanel.setPoints(points);
    }

    public void pauseGame() {
        _game.getBoard().gamePause();
    }

    public void resumeGame() {
        _game.getBoard().gameResume();
    }

    public void newGame() {
        _game.getBoard().newGame();
    }


}
