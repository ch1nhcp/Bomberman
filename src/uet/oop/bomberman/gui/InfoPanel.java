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

        timeLabel = new JLabel("                    Thời gian: " + game.getBoard().getTime());
        timeLabel.setForeground(Color.white);
        timeLabel.setHorizontalAlignment(JLabel.LEFT);
        timeLabel.setFont(new Font("Segoe", Font.BOLD, 18));

        pointsLabel = new JLabel("Điểm: " + game.getBoard().getPoints());
        pointsLabel.setForeground(Color.white);
        pointsLabel.setHorizontalAlignment(JLabel.CENTER);
        pointsLabel.setFont(new Font("Segoe", Font.BOLD, 18));

        add(timeLabel);
        add(pointsLabel);

        setBackground(Color.DARK_GRAY);
        setPreferredSize(new Dimension(0, 45));
    }

    public void setTime(int t) {
        timeLabel.setText("                    Thời gian: " + t + " s");
    }

    public void setPoints(int t) {
        pointsLabel.setText("Điểm: " + t);
    }

}
