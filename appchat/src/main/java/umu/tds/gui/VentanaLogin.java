package umu.tds.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class VentanaLogin {

	private JFrame frmVentanaLogin;
	private JTextField textUsuario;
	private JPasswordField textPassword;
	
	public VentanaLogin() {
		initialize();
	}


	public void mostrarVentana() {
		frmVentanaLogin.setLocationRelativeTo(null);
		frmVentanaLogin.setVisible(true);
	}
	
	public void initialize() {
		frmVentanaLogin = new JFrame();
		frmVentanaLogin.setTitle("AppChat - Ventana Login");
		frmVentanaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentanaLogin.getContentPane().setLayout(new BorderLayout());
		
		crearPanelTitulo();
		crearPanelLogin();
		
		frmVentanaLogin.setResizable(false);

		frmVentanaLogin.pack();
	}
	
	private void crearPanelTitulo() {
		JPanel panel_Norte = new JPanel();
		frmVentanaLogin.getContentPane().add(panel_Norte, BorderLayout.NORTH);
		panel_Norte.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));

		JLabel lblTitulo = new JLabel("AppChat");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitulo.setForeground(Color.DARK_GRAY);
		panel_Norte.add(lblTitulo);
	}

	private void crearPanelLogin() {
		JPanel panelLogin = new JPanel();
		panelLogin.setBorder(new EmptyBorder(10, 10, 10, 10));
		frmVentanaLogin.getContentPane().add(panelLogin, BorderLayout.CENTER);
		panelLogin.setLayout(new BorderLayout(0, 0));

		panelLogin.add(crearPanelUsuarioPassw(), BorderLayout.NORTH);
		panelLogin.add(crearPanelBotones(), BorderLayout.SOUTH);
	}
	
	private JPanel crearPanelUsuarioPassw() {
		JPanel panelCampos = new JPanel();
		panelCampos.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelCampos.setLayout(new BoxLayout(panelCampos, BoxLayout.Y_AXIS));

		// Panel Campo Login
		JPanel panelCampoUsuario = new JPanel();
		panelCampos.add(panelCampoUsuario);
		panelCampoUsuario.setLayout(new BorderLayout(0, 0));

		JLabel lblUsuario = new JLabel("Usuario: ");
		panelCampoUsuario.add(lblUsuario);
		lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));

		textUsuario = new JTextField();
		panelCampoUsuario.add(textUsuario, BorderLayout.EAST);
		textUsuario.setColumns(15);

		// Panel Campo Password
		JPanel panelCampoPassword = new JPanel();
		panelCampos.add(panelCampoPassword);
		panelCampoPassword.setLayout(new BorderLayout(0, 0));

		JLabel lblPassword = new JLabel("Contrase\u00F1a: ");
		panelCampoPassword.add(lblPassword);
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));

		textPassword = new JPasswordField();
		panelCampoPassword.add(textPassword, BorderLayout.EAST);
		textPassword.setColumns(15);
		
		return panelCampos;
	}
	
	private JPanel crearPanelBotones() {
		JPanel panelBotones = new JPanel();
		panelBotones.setBorder(new EmptyBorder(5, 0, 5, 0));
		panelBotones.setLayout(new BorderLayout(0, 0));

		JPanel panelBotonesLoginRegistro = new JPanel();
		panelBotones.add(panelBotonesLoginRegistro, BorderLayout.CENTER);

		JButton btnLogin = new JButton("Login");
		panelBotonesLoginRegistro.add(btnLogin);

		JButton btnRegistro = new JButton("Registro");
		panelBotonesLoginRegistro.add(btnRegistro);

		JButton btnSalir = new JButton("Salir");
		panelBotonesLoginRegistro.add(btnSalir);

		addManejadorBotonLogin(btnLogin);
		addManejadorBotonRegistro(btnRegistro);
		addManejadorBotonSalir(btnSalir);
		
		return panelBotones;
	}
	
	private void addManejadorBotonSalir(JButton btnSalir) {
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmVentanaLogin.dispose();
				System.exit(0);
			}
		});
	}

	private void addManejadorBotonRegistro(JButton btnRegistro) {
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO: Acción de botón de registro (ventana registro)
			}
		});
	}

	private void addManejadorBotonLogin(JButton btnLogin) {
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO: Acción de botón de login (ventana principal)
			}
		});
	}
}
