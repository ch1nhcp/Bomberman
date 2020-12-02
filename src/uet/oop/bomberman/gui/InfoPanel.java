package uet.oop.bomberman.gui;

import uet.oop.bomberman.Game;

import javax.swing.*;
import java.awt.*;

/**
 * Swing Panel hiển thị thông tin thời gian, điểm mà người chơi đạt được
 */
public class InfoPanel extends JPanel {

    private JLabel timeLabel;
    private JLabel pointsLabel;

    public InfoPanel(Game game) {
        setLayout(new GridLayout());

        timeLabel = new JLabel("Thời gian: " + game.getBoard().getTime());
        timeLabel.setForeground(Color.white);
        timeLabel.setHorizontalAlignment(JLabel.CENTER);

        pointsLabel = new JLabel("Điểm: " + game.getBoard().getPoints() + " s");
        pointsLabel.setForeground(Color.white);
        pointsLabel.setHorizontalAlignment(JLabel.CENTER);

        add(timeLabel);
        add(pointsLabel);

        setBackground(Color.black);
        setPreferredSize(new Dimension(0, 40));
    }

    public void setTime(int t) {
        timeLabel.setText("Thời gian: " + t + " s");
    }

    public void setPoints(int t) {
        pointsLabel.setText("Điểm: " + t);
    }

}
