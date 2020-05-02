package Projeto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import CadProd.TelaDeEntradaDeDados;

public class CadProd {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadProd window = new CadProd();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadProd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLayout(new BorderLayout());

		JLabel titulo = new JLabel("<html><h1>Tela de Cadastro de Estoque</h1></html>");
		titulo.setHorizontalAlignment(JLabel.CENTER);
		frame.add(titulo, BorderLayout.NORTH);

		TelaDeEntradaDeDados tela = new TelaDeEntradaDeDados();
		frame.add(tela);
	}

}
