package uet.oop.bomberman.gui.Menu;

import uet.oop.bomberman.Game;
import uet.oop.bomberman.gui.Frame;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Options extends JMenu implements ChangeListener {

	Frame _frame;
	
	public Options(Frame frame) {
		super("Cài đặt");
		
		_frame = frame;

		/*
		 * New Game
		 */
		JMenuItem newgame = new JMenuItem("New Game");
		newgame.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		newgame.addActionListener(new MenuActionListener(frame));
		add(newgame);
		
		JMenuItem pause = new JMenuItem("Tạm dừng");
		pause.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
		pause.addActionListener(new MenuActionListener(frame));
		add(pause);
		
		JMenuItem resume = new JMenuItem("Tiếp tục");
		resume.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
		resume.addActionListener(new MenuActionListener(frame));
		add(resume);


	}

	@Override
	public void stateChanged(ChangeEvent e) {
		JSlider source = (JSlider)e.getSource();
	    if (!source.getValueIsAdjusting()) {
	        int fps = (int)source.getValue();

	        Game.SCALE = fps;
	        System.out.println( Game.SCALE);

	    }
	}



	
	class MenuActionListener implements ActionListener {
		public Frame _frame;
		public MenuActionListener(Frame frame) {
			_frame = frame;
		}


		  @Override
		public void actionPerformed(ActionEvent e) {
			  
			  if(e.getActionCommand().equals("Tạm dừng")) {
				  _frame.pauseGame();
			  }

			  if(e.getActionCommand().equals("Tiếp tục")) {
				  _frame.resumeGame();
			  }
			  if (e.getActionCommand().equals("New Game")) {
				  _frame.newGame();
			  }
		  }
	}
}
