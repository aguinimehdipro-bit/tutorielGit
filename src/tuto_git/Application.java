package tuto_git;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Application extends Frame implements WindowListener {

	public static void main(String[] args) {
		new Application();
	}
	
	public Application() {
		super();
		
		Modèle modl = new Modèle();
		Contrôleur ctrl = new Contrôleur(modl); 
		setLocationRelativeTo(null);
		Vue vue = new Vue();
		modl.addObserver(vue);
		vue.addActionListener(ctrl);
		this.setTitle("tutoriel git");
		this.add(vue);
		this.pack();
		this.setVisible(true);
		this.addWindowListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'windowOpened'");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'windowIconified'");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'windowDeiconified'");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'windowActivated'");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'windowDeactivated'");
	}

}
