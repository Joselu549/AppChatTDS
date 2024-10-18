package umu.tds.appchat;

import java.awt.EventQueue;

import umu.tds.gui.VentanaLogin;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(final String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin ventana = new VentanaLogin();
					ventana.mostrarVentana();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
