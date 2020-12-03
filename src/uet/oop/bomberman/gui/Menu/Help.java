package uet.oop.bomberman.gui.Menu;


import uet.oop.bomberman.gui.Frame;
import uet.oop.bomberman.gui.InfoDialog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Help extends JMenu {

    public Help(Frame frame) {
        super("Help");

        JMenuItem instructions = new JMenuItem("Hướng dẫn");
        instructions.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
        instructions.addActionListener(new MenuActionListener(frame));
        add(instructions);

    }

    class MenuActionListener implements ActionListener {
        public Frame _frame;

        public MenuActionListener(Frame frame) {
            _frame = frame;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getActionCommand().equals("Hướng dẫn")) {
                new InfoDialog(_frame, "Hướng dẫn chơi", "Người chơi 1: Lên/Xuống/Trái/Phải        Đặt bom: Enter \nNgười chơi 2: W,A,S,D        Đặt Bombs: SPACE\n===================================\n\n Phát triển bởi Chinhcp + HDuy", JOptionPane.QUESTION_MESSAGE);
            }

        }
    }
}
