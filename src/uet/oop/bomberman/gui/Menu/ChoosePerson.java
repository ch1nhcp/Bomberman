package uet.oop.bomberman.gui.Menu;
//new InfoDialog(_frame, "Hướng dẫn chơi", "Người chơi 2: W,A,S,D \nĐặt Bombs: SPACE, X \n Người chơi 1: Lên/Xuống/Trái/Phải \nĐặt bom: Enter ", JOptionPane.QUESTION_MESSAGE);

import uet.oop.bomberman.gui.Frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class ChoosePerson extends JMenu {
    public Frame frame;

    public ChoosePerson(Frame frame) {
        super("Chọn người chơi");
        this.frame = frame;
        //setPreferredSize(new Dimension(0, 50));
        JMenuItem onePerson = new JMenuItem("1 Người chơi");
        onePerson.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.CTRL_MASK));
        onePerson.addActionListener(new MenuActionListener(frame));
        add(onePerson);

        JMenuItem twoPerson = new JMenuItem("2 Người chơi");
        twoPerson.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.CTRL_MASK));
        twoPerson.addActionListener(new MenuActionListener(frame));
        add(twoPerson);

    }
    class MenuActionListener implements ActionListener {
        public Frame _frame;
        public MenuActionListener(Frame frame) {
            _frame = frame;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getActionCommand().equals("1 Người chơi")) {
                _frame.getPersonFrame("one");

            }

            if(e.getActionCommand().equals("2 Người chơi")) {
                _frame.getPersonFrame("two");
                frame.addBombRateFrame();
            }

        }
    }
}
