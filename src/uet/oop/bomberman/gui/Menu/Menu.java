package uet.oop.bomberman.gui.Menu;

import uet.oop.bomberman.gui.Frame;

import javax.swing.*;

public class Menu extends JMenuBar {

    public Menu(Frame frame) {
        add(new Options(frame));//hien thi Cai dat o menu
        add(new ChoosePerson(frame));
        add(new Help(frame));
    }

}
